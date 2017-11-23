/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.metalico.keymile;

import br.net.gvt.efika.customer.InventarioRede;
import dao.dslam.factory.exception.FalhaLoginDslamException;
import dao.dslam.impl.ComandoDslam;
import dao.dslam.impl.login.LoginRapido;
import dao.dslam.impl.metalico.DslamMetalico;
import dao.dslam.impl.retorno.TratativaRetornoUtil;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import model.dslam.consulta.EstadoDaPorta;
import model.dslam.consulta.ReConexao;
import model.dslam.consulta.metalico.TabelaRedeMetalico;
import model.dslam.credencial.Credencial;

/**
 *
 * @author G0042204
 */
public abstract class KeymileMetalicoDslam extends DslamMetalico {

    private TabelaRedeMetalico tabelaRede;

    public KeymileMetalicoDslam(String ipDslam) {
        super(ipDslam, Credencial.KEYMILE, new LoginRapido());
    }

    @Override
    public void conectar() throws Exception {
        super.conectar();
        if(getCd().consulta(new ComandoDslam("")).getBlob().contains("Login failure")){
            throw new FalhaLoginDslamException();
        }
    }

    @Override
    public EstadoDaPorta getEstadoDaPorta(InventarioRede i) throws Exception {
        List<String> admin = this.getCd().consulta(this.getComandoConsultaEstadoAdminDaPorta(i)).getRetorno();
        List<String> oper = this.getCd().consulta(this.getComandoConsultaEstadoOperDaPorta(i)).getRetorno();

        String adminState = TratativaRetornoUtil.tratKeymile(admin, "State");
        String operState = TratativaRetornoUtil.tratKeymile(oper, "State");

        EstadoDaPorta portState = new EstadoDaPorta();
        portState.setAdminState(adminState.equalsIgnoreCase("UP"));
        portState.setOperState(operState.equalsIgnoreCase("UP"));

        return portState;
    }

    @Override
    public TabelaRedeMetalico getTabelaRede(InventarioRede i) throws Exception {
        List<String> lTabs = this.getCd().consulta(this.getTabRede(i)).getRetorno();

        tabelaRede = new TabelaRedeMetalico();

        tabelaRede.setPctDown(new BigInteger(TratativaRetornoUtil.tratKeymile(lTabs, "Value", 11)));
        tabelaRede.setPctUp(new BigInteger(TratativaRetornoUtil.tratKeymile(lTabs, "Value", 14)));
        tabelaRede.setCrcDown(new BigInteger(TratativaRetornoUtil.tratKeymile(lTabs, "Value", 19)));
        tabelaRede.setCrcUp(new BigInteger(TratativaRetornoUtil.tratKeymile(lTabs, "Value", 26)));
        tabelaRede.setFecDown(new BigInteger(TratativaRetornoUtil.tratKeymile(lTabs, "Value", 18)));
        tabelaRede.setFecUp(new BigInteger(TratativaRetornoUtil.tratKeymile(lTabs, "Value", 25)));
        tabelaRede.setResync(new BigInteger(TratativaRetornoUtil.tratKeymile(lTabs, "Value", 24)));

        return tabelaRede;
    }

    @Override
    public List<TabelaRedeMetalico> getHistoricoTabelaRede(InventarioRede i) throws Exception {
        List<String> retorno = getCd().consulta(getComandoGetHistTabelaRede(i)).getRetorno();
        List<TabelaRedeMetalico> l = new ArrayList<>();
        return l;
    }

    @Override
    public EstadoDaPorta setEstadoDaPorta(InventarioRede i, EstadoDaPorta e) throws Exception {
        List<String> leResp = getCd().consulta(getComandoSetEstadoDaPorta(i, e)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
        return getEstadoDaPorta(i);
    }

    @Override
    public void resetTabelaRede(InventarioRede i) throws Exception {
        getCd().consulta(getComandoResetTabelaRede(i));
    }

    @Override
    public ReConexao getReconexoes(InventarioRede i) throws Exception {
        if (tabelaRede == null) {
            getTabelaRede(i);
        }

        return new ReConexao(tabelaRede.getResync());
    }

    protected ComandoDslam getComandoGetHistTabelaRede(InventarioRede i) {
        return new ComandoDslam("cd /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/pm\nget History24hTable", 3000);
    }

    protected ComandoDslam getComandoResetTabelaRede(InventarioRede i) {
        return new ComandoDslam("cd /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/pm\nusercounterreset");
    }

    protected ComandoDslam getComandoSetEstadoDaPorta(InventarioRede i, EstadoDaPorta e) {
        return new ComandoDslam("set /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/main/administrativestatus " + e.toString());
    }

    protected ComandoDslam getTabRede(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/pm/usercountertable", 3000);
    }

    protected ComandoDslam getComandoConsultaEstadoAdminDaPorta(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/main/AdministrativeStatus");
    }

    protected ComandoDslam getComandoConsultaEstadoOperDaPorta(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/main/OperationalStatus");
    }

    protected ComandoDslam getComandoConsultaVlan(String srvc) {
        return new ComandoDslam("get /services/packet/" + srvc + "/cfgm/Service");
    }

    protected ComandoDslam getAttainableRate(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/status/attainablerate");
    }

}
