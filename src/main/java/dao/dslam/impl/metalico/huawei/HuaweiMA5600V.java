/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.metalico.huawei;

import br.net.gvt.efika.efika_customer.model.customer.InventarioRede;
import br.net.gvt.efika.fulltest.model.telecom.properties.EnumEstadoVlan;
import br.net.gvt.efika.fulltest.model.telecom.properties.EstadoDaPorta;
import br.net.gvt.efika.fulltest.model.telecom.properties.Profile;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanBanda;
import br.net.gvt.efika.fulltest.model.telecom.properties.metalico.TabelaParametrosMetalico;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.VelocidadeVendor;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.Velocidades;
import dao.dslam.impl.ComandoDslam;
import dao.dslam.impl.retorno.TratativaRetornoUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author G0041775
 */
public class HuaweiMA5600V extends MA5600TDslamVivo1 {

    public HuaweiMA5600V(String ipDslam) {
        super(ipDslam);
    }

    @Override
    protected ComandoDslam getComandoGetEstadoDaPorta(InventarioRede i) {
        return new ComandoDslam("display interface vdsl 0/" + i.getSlot() + "/" + i.getPorta(), 2000);
    }

    @Override
    protected EstadoDaPorta tratGetEstadoDaPorta(List<String> ret) {
        String oper = TratativaRetornoUtil.tratHuawei(ret, "VDSL");
        String adm = TratativaRetornoUtil.tratHuawei(ret, "VDSL", 2);
        EstadoDaPorta est = new EstadoDaPorta();
        est.setAdminState(!adm.contains("deactivated"));
        est.setOperState(oper.contains("up"));
        return est;
    }

    @Override
    protected Profile tratGetProfile(List<String> ret) {
        String[] profz = TratativaRetornoUtil.tratHuawei(ret, "line-template").split(" ");
        Profile p = new Profile();
        p.setProfileDown(profz[profz.length - 1]);
        p.setProfileUp(profz[profz.length - 1]);

        p.setDown(compareV1Metalico(profz[profz.length - 1], Boolean.TRUE));
        p.setUp(compareV1Metalico(profz[profz.length - 1], Boolean.FALSE));
        return p;
    }

    @Override
    protected ComandoDslam getComandoGetVlans(InventarioRede i) {
        return new ComandoDslam("display current-configuration port 0/" + i.getSlot() + "/" + i.getPorta(), 3000);
    }

    @Override
    protected VlanBanda tratGetVlanBanda(List<String> ret) {

        List<Integer> l1 = TratativaRetornoUtil.listIntegersFromString(TratativaRetornoUtil.tratHuawei(ret, "vlan"));
        List<Integer> l = TratativaRetornoUtil.listIntegersFromString(TratativaRetornoUtil.tratHuawei(ret, "inner-vlan"));

        Integer cvlan = l.get(0);
        Integer svlan = l1.get(1);
        VlanBanda v = new VlanBanda();
        v.setCvlan(cvlan);
        v.setSvlan(svlan);
        v.setState(EnumEstadoVlan.UP);

        return v;
    }

    @Override
    protected ComandoDslam getComandoGetParametros(InventarioRede i) {
        return new ComandoDslam("display vdsl line operation port 0/"+i.getSlot()+"/"+i.getPorta(),3000);
    }

    @Override
    protected TabelaParametrosMetalico tratGetTabelaParametros(List<String> ret) {
        TabelaParametrosMetalico t = new TabelaParametrosMetalico();
        t.setVelSincDown(new Double(TratativaRetornoUtil.tratHuawei(ret, "Actual line rate downstream")));
        t.setVelMaxDown(new Double(TratativaRetornoUtil.tratHuawei(ret, "Maximum attainable rate downstream")));
        t.setSnrDown(new Double(TratativaRetornoUtil.tratHuawei(ret, "Line SNR margin downstream")));
        t.setAtnDown(new Double(TratativaRetornoUtil.tratHuawei(ret, "Line attenuation downstream")));
        
        t.setVelSincUp(new Double(TratativaRetornoUtil.tratHuawei(ret, "Actual line rate upstream")));
        t.setVelMaxUp(new Double(TratativaRetornoUtil.tratHuawei(ret, "Maximum attainable rate upstream")));
        t.setSnrUp(new Double(TratativaRetornoUtil.tratHuawei(ret, "Line SNR margin upstream")));
        t.setAtnUp(new Double(TratativaRetornoUtil.tratHuawei(ret, "Line attenuation upstream")));
        
        return t;
    }

    @Override
    protected ComandoDslam getComandoSetEstadoDaPorta(InventarioRede i, EstadoDaPorta e) {
        String state = e.getAdminState() ? "activate" : "deactivate";
        return new ComandoDslam("interface vdsl 0/" + i.getSlot() + "\n"
                + state + " " + i.getPorta() + "\n"
                + "quit");
    }

    @Override
    protected ComandoDslam getComandoSetProfile(InventarioRede i, Velocidades v) {
        return new ComandoDslam("interface vdsl 0/" + i.getSlot() + "\n"
                + "deactivate " + i.getPorta(), 1000,
                "activate " + i.getPorta() + " template-name " + compare(v, Boolean.TRUE).getSintaxVel() + "\n"
                + "quit", 1000);
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
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_2247, "2304_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_2048, "2304_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_3245, "4608_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_4326, "4608_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_5120, "6144_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_6489, "6144_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_8651, "9216_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_10240, "12416_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_10813, "12416_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_11370, "12416_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_15360, "18464_128D_1184_128U_I_A_A_V8"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_16220, "18464_128D_1184_128U_I_A_A_V8"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_17302, "18464_128D_1184_128U_I_A_A_V8"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_21627, "28864_128D_1184_128U_I_A_A_V8"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_25600, "28864_128D_1184_128U_I_A_A_V8"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_27034, "28864_128D_1184_128U_I_A_A_V8"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_27304, "28864_128D_1184_128U_I_A_A_V8"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_25600, "28864_128D_2304_128U_I_A_A_V8"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_27034, "28864_128D_2304_128U_I_A_A_V8"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_27304, "28864_128D_2304_128U_I_A_A_V8"));
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
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_2048, "28864_128D_2304_128U_I_A_A_V8"));
        }

        return velsUp;
    }

}
