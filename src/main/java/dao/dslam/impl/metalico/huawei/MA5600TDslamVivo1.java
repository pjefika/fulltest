/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.metalico.huawei;

import br.net.gvt.efika.efika_customer.model.customer.InventarioRede;
import br.net.gvt.efika.fulltest.model.telecom.properties.DeviceMAC;
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
import dao.dslam.factory.exception.FuncIndisponivelDslamException;
import dao.dslam.impl.ComandoDslam;
import dao.dslam.impl.login.LoginComJumpMetalico;
import dao.dslam.impl.metalico.DslamMetalicoVivo1;
import dao.dslam.impl.retorno.TratativaRetornoUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.dslam.credencial.Credencial;

/**
 * MA5600T
 *
 * @author G0041775
 */
public class MA5600TDslamVivo1 extends DslamMetalicoVivo1 {

    private transient MA5600TDslamVivo1 itself;
    private transient EstadoDaPorta estadoPorta;
    private transient Profile profile;

    public MA5600TDslamVivo1(String ipDslam) {
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
            Logger.getLogger(MA5600TDslamVivo1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return itself.obterVelocidadesDownVendor();
    }

    @Override
    public List<VelocidadeVendor> obterVelocidadesUpVendor() {
        try {
            checkPlaca();
        } catch (Exception ex) {
            Logger.getLogger(MA5600TDslamVivo1.class.getName()).log(Level.SEVERE, null, ex);
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

    protected EstadoDaPorta tratGetEstadoDaPorta(List<String> ret) {
        return null;
    }

    @Override
    public EstadoDaPorta getEstadoDaPorta(InventarioRede i) throws Exception {
        if (estadoPorta == null) {
            checkConfs(i);
        }
        return estadoPorta;
    }

    protected Profile tratGetProfile(List<String> ret) throws Exception {
        throw new FuncIndisponivelDslamException();
    }

    @Override
    public Profile getProfile(InventarioRede i) throws Exception {
        if (profile == null) {
            checkConfs(i);
        }
        return profile;
    }

    protected ComandoDslam getComandoGetVlans(InventarioRede i) {
        return null;
    }

    protected VlanBanda tratGetVlanBanda(List<String> ret) throws Exception {
        return null;
    }

    @Override
    public VlanBanda getVlanBanda(InventarioRede i) throws Exception {
        checkPlaca(i);
        List<String> ret = execCommList(itself.getComandoGetVlans(i));
        return itself.tratGetVlanBanda(ret);
    }

    @Override
    public VlanMulticast getVlanMulticast(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }

    @Override
    public VlanVoip getVlanVoip(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }

    @Override
    public VlanVod getVlanVod(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }

    @Override
    public ReConexao getReconexoes(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }

    protected ComandoDslam getComandoGetParametros(InventarioRede i) {
        return null;
    }

    protected TabelaParametrosMetalico tratGetTabelaParametros(List<String> ret) throws Exception {
        throw new FuncIndisponivelDslamException();
    }

    @Override
    public TabelaParametrosMetalico getTabelaParametros(InventarioRede i) throws Exception {
        checkPlaca(i);
        List<String> ret = execCommList(itself.getComandoGetParametros(i));
        return itself.tratGetTabelaParametros(ret);
    }

    protected ComandoDslam getComandoGetTabelaRede(InventarioRede i) {
        return new ComandoDslam("");
    }

    protected TabelaRedeMetalico tratGetTabelaRede(List<String> ret) throws Exception {
        throw new FuncIndisponivelDslamException();
    }

    @Override
    public TabelaRedeMetalico getTabelaRede(InventarioRede i) throws Exception {
        checkPlaca(i);
        List<String> ret = execCommList(itself.getComandoGetTabelaRede(i));
        return itself.tratGetTabelaRede(ret);
    }

    @Override
    public List<TabelaRedeMetalico> getHistoricoTabelaRede(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }

    @Override
    public Modulacao getModulacao(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }

    @Override
    public TabelaParametrosMetalico getTabelaParametrosIdeal(Velocidades v) throws Exception {
        TabelaParametrosMetalico t = new TabelaParametrosMetalico();
        t.setAtnDown(0d);
        t.setAtnUp(0d);
        t.setSnrDown(11d);
        t.setSnrUp(11d);
        t.setVelSincDown(TratativaRetornoUtil.velocidadeMinimaVivo1(v).get(0));
        t.setVelSincUp(TratativaRetornoUtil.velocidadeMinimaVivo1(v).get(1));

        return t;
    }

    @Override
    public Modulacao setModulacao(InventarioRede i, Velocidades v) throws Exception {
        throw new FuncIndisponivelDslamException();
    }

    @Override
    public void resetTabelaRede(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }

    protected ComandoDslam getComandoSetEstadoDaPorta(InventarioRede i, EstadoDaPorta e) {
        return new ComandoDslam("");
    }

    @Override
    public EstadoDaPorta setEstadoDaPorta(InventarioRede i, EstadoDaPorta e) throws Exception {
        checkPlaca(i);
        execCommBlob(itself.getComandoSetEstadoDaPorta(i, e));
        estadoPorta = null;
        return this.getEstadoDaPorta(i);
    }

    protected ComandoDslam getComandoSetProfile(InventarioRede i, Velocidades v) {
        return null;
    }

    @Override
    public void setProfileDown(InventarioRede i, Velocidades v) throws Exception {
        checkPlaca(i);
        execCommBlob(itself.getComandoSetProfile(i, v));
        profile = null;
    }

    @Override
    public void setProfileUp(InventarioRede i, Velocidades vDown,
            Velocidades vUp) throws Exception {
        setProfileDown(i, vDown);
        profile = null;
    }

    protected ComandoDslam getComandoGetDeviceMAC(InventarioRede i) {
        return new ComandoDslam("display mac-address port 0/" + i.getSlot() + "/" + i.getPorta(), 2000);
    }

    @Override
    public DeviceMAC getDeviceMac(InventarioRede i) throws Exception {
        List<String> ret = execCommList(getComandoGetDeviceMAC(i));
        DeviceMAC m = new DeviceMAC();
        String mac = "";
        try {
            List<String> line = TratativaRetornoUtil.listStringFromStringByRegexGroup(
                    TratativaRetornoUtil.tratHuawei(ret, "dl"),
                    "\\w{4}[-|:]\\w{4}[-|:]\\w{4}");
            String lemac = line.get(0).replaceAll("-", "");
            List<String> macz = TratativaRetornoUtil.listStringFromStringByRegexGroup(
                    lemac,
                    ".{2}");

            for (int j = 0; j < macz.size(); j++) {
                mac = mac.concat(macz.get(j).toUpperCase());
                if (j != (int) macz.size() - 1) {
                    mac = mac.concat(":");
                }
            }
        } catch (Exception e) {
        }

        m.setMac(mac);

        return m;
    }

    @Override
    public VlanBanda createVlanBanda(InventarioRede i, Velocidades vDown,
            Velocidades vUp) throws Exception {
        throw new FuncIndisponivelDslamException();
    }

    @Override
    public VlanVoip createVlanVoip(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }

    @Override
    public VlanVod createVlanVod(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }

    @Override
    public VlanMulticast createVlanMulticast(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }

    @Override
    public void deleteVlanBanda(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }

    @Override
    public void deleteVlanVoip(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }

    @Override
    public void deleteVlanVod(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }

    @Override
    public void deleteVlanMulticast(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }

}