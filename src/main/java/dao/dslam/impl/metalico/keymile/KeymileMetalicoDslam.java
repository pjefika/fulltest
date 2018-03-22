/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.metalico.keymile;

import br.net.gvt.efika.efika_customer.model.customer.InventarioRede;
import br.net.gvt.efika.fulltest.model.telecom.config.ComandoDslam;
import br.net.gvt.efika.fulltest.model.telecom.properties.EstadoDaPorta;
import br.net.gvt.efika.fulltest.model.telecom.properties.ReConexao;
import br.net.gvt.efika.fulltest.model.telecom.properties.metalico.TabelaRedeMetalico;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.Modulacoes;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.VelocidadeVendor;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.Velocidades;
import dao.dslam.factory.exception.FalhaLoginDslamException;
import dao.dslam.factory.exception.FuncIndisponivelDslamException;
import dao.dslam.impl.login.LoginRapido;
import dao.dslam.impl.metalico.DslamMetalico;
import dao.dslam.impl.retorno.TratativaRetornoUtil;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
        if (getCd().consulta(new ComandoDslam("")).getBlob().contains("Login failure")) {
            throw new FalhaLoginDslamException();
        }
    }

    @Override
    public EstadoDaPorta getEstadoDaPorta(InventarioRede i) throws Exception {
        ComandoDslam cmd = this.getCd().consulta(this.getComandoConsultaEstadoAdminDaPorta(i));
        List<String> admin = cmd.getRetorno();
        ComandoDslam cmd1 = this.getCd().consulta(this.getComandoConsultaEstadoOperDaPorta(i));
        List<String> oper = cmd1.getRetorno();

        String adminState = TratativaRetornoUtil.tratKeymile(admin, "State");
        String operState = TratativaRetornoUtil.tratKeymile(oper, "State");

        EstadoDaPorta portState = new EstadoDaPorta();
        portState.setAdminState(adminState.equalsIgnoreCase("UP"));
        portState.setOperState(operState.equalsIgnoreCase("UP"));
        portState.addInteracao(cmd);
        portState.addInteracao(cmd1);
        return portState;
    }

    @Override
    public TabelaRedeMetalico getTabelaRede(InventarioRede i) throws Exception {
        ComandoDslam cmd = this.getCd().consulta(this.getTabRede(i));
        List<String> lTabs = cmd.getRetorno();

        tabelaRede = new TabelaRedeMetalico();
        tabelaRede.addInteracao(cmd);
        
        tabelaRede.setPctDown(new BigInteger(TratativaRetornoUtil.tratKeymile(lTabs, "Value", 11)));
        tabelaRede.setPctUp(new BigInteger(TratativaRetornoUtil.tratKeymile(lTabs, "Value", 14)));
        tabelaRede.setCrcDown(new BigInteger(TratativaRetornoUtil.tratKeymile(lTabs, "Value", 19)));
        tabelaRede.setCrcUp(new BigInteger(TratativaRetornoUtil.tratKeymile(lTabs, "Value", 26)));
        tabelaRede.setFecDown(new BigInteger(TratativaRetornoUtil.tratKeymile(lTabs, "Value", 18)));
        tabelaRede.setFecUp(new BigInteger(TratativaRetornoUtil.tratKeymile(lTabs, "Value", 25)));
        tabelaRede.setResync(new BigInteger(TratativaRetornoUtil.tratKeymile(lTabs, "Value", 24)));
        String[] tempoContando = TratativaRetornoUtil.tratKeymile(lTabs, "Value", 2).replace("T", " ").split(" ");
        BigInteger daysToSecs = new BigInteger(tempoContando[0]).multiply(new BigInteger("86400"));
        String[] separaTempo = tempoContando[1].split(":");
        BigInteger hoursToSecs = new BigInteger(separaTempo[0]).multiply(new BigInteger("3600"));
        BigInteger minutesToSecs = new BigInteger(separaTempo[1]).multiply(new BigInteger("60"));
        BigInteger secs = new BigInteger(separaTempo[2]);

        daysToSecs.add(hoursToSecs);
        daysToSecs.add(minutesToSecs);
        daysToSecs.add(secs);
        tabelaRede.setTempoMedicao(daysToSecs);

        return tabelaRede;
    }

    @Override
    public List<TabelaRedeMetalico> getHistoricoTabelaRede(InventarioRede i) throws Exception {
//        List<String> retorno = getCd().consulta(getComandoGetHistTabelaRede(i)).getRetorno();
//        List<TabelaRedeMetalico> l = new ArrayList<>();

//        return l;
        throw new FuncIndisponivelDslamException();
    }

    @Override
    public EstadoDaPorta setEstadoDaPorta(InventarioRede i, EstadoDaPorta e) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoSetEstadoDaPorta(i, e));
        EstadoDaPorta es = getEstadoDaPorta(i);
        es.getInteracoes().add(0, cmd);
        return es;
    }

    @Override
    public TabelaRedeMetalico resetTabelaRede(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoResetTabelaRede(i));
        TabelaRedeMetalico t = getTabelaRede(i);
        t.getInteracoes().add(0, cmd);
        return t;
    }

    @Override
    public ReConexao getReconexoes(InventarioRede i) throws Exception {
        if (tabelaRede == null) {
            getTabelaRede(i);
        }
        ReConexao r = new ReConexao(tabelaRede.getResync().intValue());
        tabelaRede.getInteracoes().forEach(r::addInteracao);
        return r;
    }

    @Override
    protected Velocidades compare(String sintaxVendor, Boolean isDown) {
        List<VelocidadeVendor> vels = isDown ? obterVelocidadesDownVendor() : obterVelocidadesUpVendor();
        for (VelocidadeVendor v : vels) {
            if (v.getSintaxVel().contains(sintaxVendor) || sintaxVendor.contains(v.getSintaxVel())) {
                return v.getVel();
            }
        }
        return null;
    }

    @Override
    protected Modulacoes compare(String sintaxVendor) {
        List<VelocidadeVendor> vels = obterVelocidadesDownVendor();
        for (VelocidadeVendor v : vels) {
            if (v.getSintaxMod().contains(sintaxVendor) || sintaxVendor.contains(v.getSintaxMod())) {
                return v.getModul();
            }
        }
        return null;
    }

    @Override
    protected VelocidadeVendor compare(Velocidades vel, Boolean isDown) {
        List<VelocidadeVendor> vels = isDown ? obterVelocidadesDownVendor() : obterVelocidadesUpVendor();
        for (VelocidadeVendor v : vels) {
            if (v.getVel() == vel) {
                return v;
            }
        }
        return null;
    }

    protected ComandoDslam getComandoGetHistTabelaRede(InventarioRede i) {
        return new ComandoDslam("cd /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/pm\nget History24hTable", 3000);
    }

    protected ComandoDslam getComandoGetIpIgmp() {
        return new ComandoDslam("get /multicast/cfgm/LocalIPAddressForIGMPGeneration");
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
