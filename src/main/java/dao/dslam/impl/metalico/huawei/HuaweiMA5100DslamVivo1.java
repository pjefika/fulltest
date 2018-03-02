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
import java.util.List;
import model.dslam.credencial.Credencial;

/**
 * MA5600T
 *
 * @author G0041775
 */
public class HuaweiMA5100DslamVivo1 extends DslamMetalicoVivo1 {

    private transient EstadoDaPorta estadoPorta;
    private transient TabelaParametrosMetalico parametros;

    public HuaweiMA5100DslamVivo1(String ipDslam) {
        super(ipDslam, Credencial.HUAWEI_METALICOV1, new LoginComJumpMetalico());
    }

    @Override
    public void conectar() throws Exception {
        super.conectar();
    }

    @Override
    public void enableCommandsInDslam() throws Exception {
        if (getCd().consulta(getComandoEnableConfig()).getBlob().contains("please retry to log on")) {
            throw new FalhaLoginDslamException();
        }

    }

    protected ComandoDslam getComandoEnableConfig() {
        return new ComandoDslam("enable\n"
                + "no smart\n"
                + "no alarm output all\n"
                + "scroll\n\n"
                + "configure terminal\n", 3000);
    }

    @Override
    public List<VelocidadeVendor> obterVelocidadesDownVendor() {
        if (velsDown.isEmpty()) {
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_256, "352D_128U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_285, "352D_128U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_390, "352D_128U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_569, "608_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_611, "608_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_667, "608_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_667, "608_64D_352_64U_I_A_2L"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_833, "1184_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_889, "1184_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_1137, "1184_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_1024, "1184_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_1333, "1184_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_1730, "2304_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_2048, "2304_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_2247, "2304_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_3245, "4608_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_4326, "4608_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_6489, "6144_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_8651, "9216_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_8192, "9216_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_10813, "12416_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_11370, "12416_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_16220, "18464_128D_1184_128U_I_A_A_V8"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_17302, "18464_128D_1184_128U_I_A_A_V8"));
        }
        return velsDown;
    }

    @Override
    public List<VelocidadeVendor> obterVelocidadesUpVendor() {
        if (velsUp.isEmpty()) {
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_128, "352D_128U_I_A"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_200, "352_64D_352_64U_I_A_2L"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_300, "352_64D_352_64U_I_A_2L"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_300, "608_64D_352_64U_I_A_2L"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_500, "608_128D_704_64U_I_A"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_600, "608_128D_704_64U_I_A"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_600, "1184_128D_704_64U_I_A"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_600, "2304_128D_704_64U_I_A"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_600, "4608_128D_704_64U_I_A"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_600, "6144_128D_704_64U_I_A"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_600, "9216_128D_704_64U_I_A"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_600, "12416_128D_704_64U_I_A"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_1024, "18464_128D_1184_128U_I_A_A_V8"));
        }

        return velsUp;
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

    protected ComandoDslam getComandoGetEstadoDaPorta(InventarioRede i) {
        return new ComandoDslam("interface adsl 0/" + i.getSlot() + "\n"
                + "show port state " + i.getPorta() + "\n"
                + "show line operation " + i.getPorta() + "\n"
                + "exit", 4500);
    }

    protected void checkConfs(InventarioRede i) throws Exception {
        List<String> ret = execCommList(getComandoGetEstadoDaPorta(i));
        estadoPorta = new EstadoDaPorta();

        estadoPorta.setAdminState(!TratativaRetornoUtil.tratHuawei(ret, "tiv", 2).contains("Deactivated"));
        estadoPorta.setOperState(TratativaRetornoUtil.tratHuawei(ret, "Port " + i.getPorta() + " is not active").contains("encontrado"));

        parametros = new TabelaParametrosMetalico();
        parametros.setVelSincDown(new Double(TratativaRetornoUtil.tratHuawei(ret, "Downstream channel rate")));
        parametros.setVelMaxDown(new Double(TratativaRetornoUtil.tratHuawei(ret, "Downstream max. attainable rate")));
        parametros.setSnrDown(new Double(TratativaRetornoUtil.tratHuawei(ret, "Downstream channel SNR margin")));
        parametros.setAtnDown(new Double(TratativaRetornoUtil.tratHuawei(ret, "Downstream channel attenuation")));

        parametros.setVelSincUp(new Double(TratativaRetornoUtil.tratHuawei(ret, "Upstream channel rate")));
        parametros.setVelMaxUp(new Double(TratativaRetornoUtil.tratHuawei(ret, "Upstream max. attainable rate")));
        parametros.setSnrUp(new Double(TratativaRetornoUtil.tratHuawei(ret, "Upstream channel SNR margin")));
        parametros.setAtnUp(new Double(TratativaRetornoUtil.tratHuawei(ret, "Upstream channel attenuation")));

    }

    @Override
    public EstadoDaPorta getEstadoDaPorta(InventarioRede i) throws Exception {
        if (estadoPorta == null) {
            checkConfs(i);
        }

        return estadoPorta;
    }

    protected ComandoDslam getComandoGetProfile(InventarioRede i) {
        return new ComandoDslam("interface adsl 0/" + i.getSlot() + "\n"
                + "show parameter " + i.getPorta() + "\n"
                + "quit\n",4000);
    }

    @Override
    public Profile getProfile(InventarioRede i) throws Exception {
        List<String> ret = execCommList(getComandoGetProfile(i));
        Profile p = new Profile();
        String prof = TratativaRetornoUtil.tratHuawei(ret, "Profile index");
        p.setProfileDown(prof);
        p.setProfileUp(prof);
        p.setDown(compareV1Metalico(prof, Boolean.TRUE));
        p.setUp(compareV1Metalico(prof, Boolean.FALSE));
        return p;
    }

    @Override
    public VlanBanda getVlanBanda(InventarioRede i) throws Exception {
        return null;
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
        return new ComandoDslam("board-adsl " + i.getSlot() + "\n"
                + "show line state " + i.getPorta(), 3000, "exit");
    }

    @Override
    public TabelaParametrosMetalico getTabelaParametros(InventarioRede i) throws Exception {
        TabelaParametrosMetalico t = new TabelaParametrosMetalico();
        List<String> ret = execCommList(getComandoGetParametros(i));
        t.setVelSincDown(new Double(TratativaRetornoUtil.tratHuawei(ret, "Channel Current tx-Rate")));
        t.setVelSincUp(new Double(TratativaRetornoUtil.tratHuawei(ret, "Channel Current tx-Rate", 2)));
        t.setVelMaxDown(new Double(TratativaRetornoUtil.tratHuawei(ret, "Current Attainable Rate")));
        t.setVelMaxUp(new Double(TratativaRetornoUtil.tratHuawei(ret, "Current Attainable Rate", 2)));
        t.setSnrDown(new Double(TratativaRetornoUtil.tratHuawei(ret, " Current Snr Margin")));
        t.setSnrUp(new Double(TratativaRetornoUtil.tratHuawei(ret, " Current Snr Margin", 2)));
        t.setAtnDown(new Double(TratativaRetornoUtil.tratHuawei(ret, "Current Chan Attenuation")));
        t.setAtnUp(new Double(TratativaRetornoUtil.tratHuawei(ret, "Current Chan Attenuation", 2)));
        return t;
    }

//    protected ComandoDslam getComandoGetTabelaRede(InventarioRede i) {
//        return new ComandoDslam("");
//    }
//    protected TabelaRedeMetalico tratGetTabelaRede(List<String> ret) throws Exception {
//        throw new FuncIndisponivelDslamException();
//    }
    @Override
    public TabelaRedeMetalico getTabelaRede(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
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
        String state = e.getAdminState() ? "activate" : "deactivate";
        return new ComandoDslam("board-adsl " + i.getSlot() + "\n"
                + state + " " + i.getPorta() + "\n"
                + "exit", 3000);
    }

    @Override
    public EstadoDaPorta setEstadoDaPorta(InventarioRede i, EstadoDaPorta e) throws Exception {
        execCommList(getComandoSetEstadoDaPorta(i, e));
        estadoPorta = null;
        return getEstadoDaPorta(i);
    }

    protected ComandoDslam getComandoSetProfile(InventarioRede i, Velocidades v) {
        return new ComandoDslam("board-adsl " + i.getSlot() + "\n"
                + "deactivate " + i.getPorta() + "\n"
                + "activate " + i.getPorta() + " name " + compare(v, Boolean.TRUE).getSintaxVel() + "\n"
                + "exit", 3000);
    }

    @Override
    public void setProfileDown(InventarioRede i, Velocidades v) throws Exception {
        execCommList(getComandoSetProfile(i, v));
    }

    @Override
    public void setProfileUp(InventarioRede i, Velocidades vDown, Velocidades vUp) throws Exception {
        setProfileDown(i, vDown);
    }

    protected ComandoDslam getComandoGetDeviceMAC(InventarioRede i) {
        return new ComandoDslam("show mac-address-table dynamic interface adsl " + i.getSlot() + "/0/" + i.getPorta() + "\n\n", 6000);
    }

    @Override
    public DeviceMAC getDeviceMac(InventarioRede i) throws Exception {
        DeviceMAC m = new DeviceMAC();
        List<String> ret = execCommList(getComandoGetDeviceMAC(i));
        String mac = "";
        try {
            String s = TratativaRetornoUtil.tratHuawei(ret, "dsl", 2);
            List<String> line = TratativaRetornoUtil.listStringFromStringByRegexGroup(
                    s,
                    "\\w{4}[-|:|.]\\w{4}[-|:|.]\\w{4}");
            String lemac = line.get(0).replaceAll("[-|:|.]", "");
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
