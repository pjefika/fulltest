/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.metalico.huawei;

import br.net.gvt.efika.efika_customer.model.customer.InventarioRede;
import br.net.gvt.efika.fulltest.model.telecom.properties.EstadoDaPorta;
import br.net.gvt.efika.fulltest.model.telecom.properties.Profile;
import br.net.gvt.efika.fulltest.model.telecom.properties.ReConexao;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanBanda;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanMulticast;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanVod;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanVoip;
import br.net.gvt.efika.fulltest.model.telecom.properties.metalico.Modulacao;
import br.net.gvt.efika.fulltest.model.telecom.properties.metalico.TabelaParametrosMetalico;
import br.net.gvt.efika.fulltest.model.telecom.properties.metalico.TabelaRedeMetalico;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.VelocidadeVendor;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.Velocidades;
import dao.dslam.factory.exception.FalhaAoExecutarComandoException;
import dao.dslam.factory.exception.FalhaLoginDslamException;
import dao.dslam.impl.ComandoDslam;
import dao.dslam.impl.login.LoginComJumpMetalico;
import dao.dslam.impl.metalico.DslamMetalicoVivo1;
import dao.dslam.impl.retorno.TratativaRetornoUtil;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.dslam.credencial.Credencial;

/**
 * MA5600T
 *
 * @author G0041775
 */
public class HuaweiMA5600TDslamVivo1 extends DslamMetalicoVivo1 {

    private HuaweiMA5600TDslamVivo1 itself;

    private EstadoDaPorta estadoPorta;
    private Profile profile;

    public HuaweiMA5600TDslamVivo1(String ipDslam) {
        super(ipDslam, Credencial.HUAWEI_METALICOV1, new LoginComJumpMetalico());
    }

    @Override
    public void conectar() throws Exception {
        super.conectar();
    }

    @Override
    public void enableCommandsInDslam() throws Exception {
        getCd().consulta(getComandoEnableConfig());
        if (getCd().consulta(getComandoSmartAlarmOutput()).getBlob().contains("please retry to log on")) {
            throw new FalhaLoginDslamException();
        }

    }

    protected void checkPlaca(InventarioRede i) throws Exception {
        if (itself == null) {
            if (execCommBlob(getComandoGetTipoPlaca(i)).contains("ADSL")) {
                itself = new HuaweiMA5600A(getIpDslam());
            } else {
                itself = new HuaweiMA5600V(getIpDslam());
            }
        }
    }

    protected void checkPlaca() throws Exception {
        if (itself == null) {
            if (execCommBlob(getComandoGetTipoPlaca()).contains("ADSL")) {
                itself = new HuaweiMA5600A(getIpDslam());
            } else {
                itself = new HuaweiMA5600V(getIpDslam());
            }
        }
    }

    protected ComandoDslam getComandoGetTipoPlaca(InventarioRede i) {
        return new ComandoDslam("display board 0/" + i.getSlot(), 3000);
    }

    protected ComandoDslam getComandoGetTipoPlaca() {
        return new ComandoDslam("display board 0/0", 3000);
    }

    protected ComandoDslam getComandoEnableConfig() {
        return new ComandoDslam("enable", 500, "config", 500);
    }

    protected ComandoDslam getComandoSmartAlarmOutput() {
        return new ComandoDslam("undo smart", 500, "undo alarm output all", 500, "scroll 500");
    }

    @Override
    public List<VelocidadeVendor> obterVelocidadesDownVendor() {
        try {
            checkPlaca();
        } catch (Exception ex) {
            Logger.getLogger(HuaweiMA5600TDslamVivo1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return itself.obterVelocidadesDownVendor();
    }

    @Override
    public List<VelocidadeVendor> obterVelocidadesUpVendor() {
        try {
            checkPlaca();
        } catch (Exception ex) {
            Logger.getLogger(HuaweiMA5600TDslamVivo1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return itself.obterVelocidadesUpVendor();
    }

    protected ComandoDslam getComandoGetEstadoDaPorta(InventarioRede i) {
        return new ComandoDslam("");
    }

    protected String execCommBlob(ComandoDslam command) throws Exception {
        String blob = getCd().consulta(command).getBlob();
        if (blob.contains("is busy")) {
            Thread.sleep(7500);
            blob = getCd().consulta(command).getBlob();
            if (blob.contains("is busy")) {
                throw new FalhaAoExecutarComandoException();
            }
        }
        return blob;
    }

    protected List<String> execCommList(ComandoDslam command) throws Exception {
        List<String> list = getCd().consulta(command).getRetorno();
        for (String string : list) {
            if (string.contains("is busy")) {
                Thread.sleep(7500);
                list = getCd().consulta(command).getRetorno();
                for (String string1 : list) {
                    if (string1.contains("is busy")) {
                        throw new FalhaAoExecutarComandoException();
                    }
                }
            }
        }
        return list;
    }

    protected void checkConfs(InventarioRede i) throws Exception {
        checkPlaca(i);
        List<String> ret = execCommList(itself.getComandoGetEstadoDaPorta(i));
        estadoPorta = itself.tratGetEstadoDaPorta(ret);
        profile = itself.tratGetProfile(ret);
    }

    public EstadoDaPorta tratGetEstadoDaPorta(List<String> ret) {
        return null;
    }

    @Override
    public EstadoDaPorta getEstadoDaPorta(InventarioRede i) throws Exception {
        if (estadoPorta == null) {
            checkConfs(i);
        }
        return estadoPorta;
    }

    public Profile tratGetProfile(List<String> ret) {
        return null;
    }

    @Override
    public Profile getProfile(InventarioRede i) throws Exception {
        if (profile == null) {
            checkConfs(i);
        }
        return profile;
    }

    @Override
    public VlanBanda getVlanBanda(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VlanMulticast getVlanMulticast(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VlanVoip getVlanVoip(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VlanVod getVlanVod(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ReConexao getReconexoes(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TabelaParametrosMetalico getTabelaParametros(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TabelaRedeMetalico getTabelaRede(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TabelaRedeMetalico> getHistoricoTabelaRede(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Modulacao getModulacao(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TabelaParametrosMetalico getTabelaParametrosIdeal(Velocidades v) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Modulacao setModulacao(InventarioRede i, Velocidades v) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void resetTabelaRede(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EstadoDaPorta setEstadoDaPorta(InventarioRede i, EstadoDaPorta e) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setProfileDown(InventarioRede i, Velocidades v) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setProfileUp(InventarioRede i, Velocidades vDown,
            Velocidades vUp) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VlanBanda createVlanBanda(InventarioRede i, Velocidades vDown,
            Velocidades vUp) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VlanVoip createVlanVoip(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VlanVod createVlanVod(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VlanMulticast createVlanMulticast(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteVlanBanda(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteVlanVoip(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteVlanVod(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteVlanMulticast(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
