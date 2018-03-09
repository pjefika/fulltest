/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.metalico.huawei;

import br.net.gvt.efika.efika_customer.model.customer.InventarioRede;
import br.net.gvt.efika.fulltest.model.telecom.properties.DeviceMAC;
import br.net.gvt.efika.fulltest.model.telecom.properties.EnumEstadoVlan;
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
import java.math.BigInteger;
import java.util.List;
import model.dslam.credencial.Credencial;

/**
 * MA5600T
 *
 * @author G0041775
 */
public class MA5100DslamVivo1 extends DslamMetalicoVivo1 {

    private transient EstadoDaPorta estadoPorta;
    private transient TabelaParametrosMetalico parametros;

    public MA5100DslamVivo1(String ipDslam) {
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
                + "scroll\n"
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
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_4096, "4608_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_6489, "6144_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_8651, "9216_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_8192, "9216_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_10240, "12416_128D_704_64U_I_A"));
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

        estadoPorta.setAdminState(!TratativaRetornoUtil.tratHuawei(ret, "tiv").contains("Deactivated"));
        estadoPorta.setOperState(TratativaRetornoUtil.tratHuawei(ret, "Port " + i.getPorta() + " is not active").contains("encontrado"));

        parametros = new TabelaParametrosMetalico();
        try {
            parametros.setVelSincDown(new Double(TratativaRetornoUtil.tratHuawei(ret, "Downstream channel rate")));
            parametros.setVelMaxDown(new Double(TratativaRetornoUtil.tratHuawei(ret, "Downstream max. attainable rate")));
            parametros.setSnrDown(new Double(TratativaRetornoUtil.tratHuawei(ret, "Downstream channel SNR margin")));
            parametros.setAtnDown(new Double(TratativaRetornoUtil.tratHuawei(ret, "Downstream channel attenuation")));

            parametros.setVelSincUp(new Double(TratativaRetornoUtil.tratHuawei(ret, "Upstream channel rate")));
            parametros.setVelMaxUp(new Double(TratativaRetornoUtil.tratHuawei(ret, "Upstream max. attainable rate")));
            parametros.setSnrUp(new Double(TratativaRetornoUtil.tratHuawei(ret, "Upstream channel SNR margin")));
            parametros.setAtnUp(new Double(TratativaRetornoUtil.tratHuawei(ret, "Upstream channel attenuation")));
        } catch (Exception e) {
            parametros.setVelSincDown(0d);
            parametros.setVelMaxDown(0d);
            parametros.setSnrDown(0d);
            parametros.setAtnDown(0d);
            parametros.setVelSincUp(0d);
            parametros.setVelMaxUp(0d);
            parametros.setSnrUp(0d);
            parametros.setAtnUp(0d);
        }

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
                + "quit\n", 4000);
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

    protected ComandoDslam getComandoGetVlanBanda(InventarioRede i) {
        return new ComandoDslam("show pvc 0/" + i.getSlot() + "/" + i.getPorta(), 3000);
    }

    @Override
    public VlanBanda getVlanBanda(InventarioRede i) throws Exception {
        List<String> ret = execCommList(getComandoGetVlanBanda(i));
        VlanBanda v = new VlanBanda();
        v.setCvlan(0);
        v.setSvlan(0);
        v.setState(EnumEstadoVlan.DOWN);
        try {
            List<Integer> li = TratativaRetornoUtil.listIntegersFromString(TratativaRetornoUtil.tratHuawei(ret, "dl"));
            List<String> ls = TratativaRetornoUtil.listStringFromStringByRegexGroup(TratativaRetornoUtil.tratHuawei(ret, "dl"), "\\w+");
            EnumEstadoVlan st = ls.get(ls.size() - 1).equalsIgnoreCase("up") ? EnumEstadoVlan.UP : EnumEstadoVlan.DOWN;
            v.setCvlan(li.get(li.size() - 2));
            v.setSvlan(li.get(li.size() - 3));
            v.setState(st);
        } catch (Exception e) {
        }

        return v;
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

    @Override
    public TabelaParametrosMetalico getTabelaParametros(InventarioRede i) throws Exception {
        if (parametros == null) {
            checkConfs(i);
        }
        return parametros;
    }

    protected ComandoDslam getComandoGetTabelaRede(InventarioRede i) {
        return new ComandoDslam("interface adsl 0/" + i.getSlot() + "\n"
                + "show statistics performance " + i.getPorta() + " current-15minutes\n"
                + "exit", 3000);
    }

    @Override
    public TabelaRedeMetalico getTabelaRede(InventarioRede i) throws Exception {
        List<String> ret = execCommList(getComandoGetTabelaRede(i));
        TabelaRedeMetalico t = new TabelaRedeMetalico();
        t.setPctDown(new BigInteger(TratativaRetornoUtil.tratHuawei(ret, "Count of all encoded blocks transmitted")));
        t.setFecDown(new BigInteger(TratativaRetornoUtil.tratHuawei(ret, "Count of all blocks received with correctable errors")));
        t.setCrcDown(new BigInteger(TratativaRetornoUtil.tratHuawei(ret, "Count of all blocks received with uncorrectable errors")));

        t.setPctUp(new BigInteger(TratativaRetornoUtil.tratHuawei(ret, "Count of all encoded blocks transmitted", 2)));
        t.setFecUp(new BigInteger(TratativaRetornoUtil.tratHuawei(ret, "Count of all blocks received with correctable errors", 2)));
        t.setCrcUp(new BigInteger(TratativaRetornoUtil.tratHuawei(ret, "Count of all blocks received with uncorrectable errors", 2)));

        t.setTempoMedicao(new BigInteger(TratativaRetornoUtil.tratHuawei(ret, "Total elapsed seconds in this interval")));

        return t;
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
        return new ComandoDslam("interface adsl 0/" + i.getSlot() + "\n"
                + state + " " + i.getPorta() + "\n"
                + "exit", 2000);
    }

    @Override
    public EstadoDaPorta setEstadoDaPorta(InventarioRede i, EstadoDaPorta e) throws Exception {
        execCommList(getComandoSetEstadoDaPorta(i, e));
        estadoPorta = null;
        return getEstadoDaPorta(i);
    }

    protected ComandoDslam getComandoGetIndexProfile() {
        return new ComandoDslam("show adsl line-profile");
    }

    protected ComandoDslam getComandoSetProfile(InventarioRede i, String indexProfile) {
        return new ComandoDslam("interface adsl 0/" + i.getSlot() + "\n"
                + "deactivate " + i.getPorta() + "\n", 3000,
                "activate " + i.getPorta() + " " + indexProfile, 3000);
    }

    @Override
    public void setProfileDown(InventarioRede i, Velocidades v) throws Exception {
        List<String> ret0 = execCommList(getComandoGetIndexProfile());
        List<Integer> profz = TratativaRetornoUtil.listIntegersFromString(compare(v, Boolean.TRUE).getSintaxVel());
        String vel = profz.get(0).toString();
        String indexProfile = TratativaRetornoUtil.listIntegersFromString(
                TratativaRetornoUtil.tratHuawei(ret0, vel)
        ).get(0).toString();
        execCommList(getComandoSetProfile(i, indexProfile));
    }

    @Override
    public void setProfileUp(InventarioRede i, Velocidades vDown, Velocidades vUp) throws Exception {
        setProfileDown(i, vDown);
    }

    @Override
    public DeviceMAC getDeviceMac(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }

    protected ComandoDslam getComandoCreateVlanBanda(InventarioRede i) {
        return new ComandoDslam("pvc adsl 0/" + i.getSlot() + "/" + i.getPorta() + " vpi 8 vci 35 "
                + "atm 0/7/0 vpi " + i.getRin() + " vci " + i.getCvlan() + " rx-cttr 2 upc off tx-cttr 2 upc off",3000);
    }

    @Override
    public VlanBanda createVlanBanda(InventarioRede i, Velocidades vDown,
            Velocidades vUp) throws Exception {
        execCommList(getComandoCreateVlanBanda(i));
        return getVlanBanda(i);
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

    protected ComandoDslam getComandoDeleteVlanBanda(InventarioRede i) {
        return new ComandoDslam("no pvc 0/" + i.getSlot() + "/" + i.getPorta() + "\n"
                + "y");
    }

    @Override
    public void deleteVlanBanda(InventarioRede i) throws Exception {
        execCommList(getComandoDeleteVlanBanda(i));
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
