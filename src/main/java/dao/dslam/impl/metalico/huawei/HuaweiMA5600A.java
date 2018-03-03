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
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanBanda;
import br.net.gvt.efika.fulltest.model.telecom.properties.metalico.TabelaParametrosMetalico;
import br.net.gvt.efika.fulltest.model.telecom.properties.metalico.TabelaRedeMetalico;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.VelocidadeVendor;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.Velocidades;
import dao.dslam.factory.exception.FuncIndisponivelDslamException;
import dao.dslam.impl.ComandoDslam;
import dao.dslam.impl.retorno.TratativaRetornoUtil;
import java.math.BigInteger;
import java.util.List;

/**
 *
 * @author G0041775
 */
public class HuaweiMA5600A extends MA5600TDslamVivo1 {

    public HuaweiMA5600A(String ipDslam) {
        super(ipDslam);
    }

    @Override
    protected ComandoDslam getComandoGetEstadoDaPorta(InventarioRede i) {
        return new ComandoDslam("display interface adsl 0/" + i.getSlot() + "/" + i.getPorta(), 2000);
    }

    @Override
    protected EstadoDaPorta tratGetEstadoDaPorta(List<String> ret) {
        EstadoDaPorta est = new EstadoDaPorta();
        String oper = TratativaRetornoUtil.tratHuawei(ret, "dsl", 2);
        String adm = TratativaRetornoUtil.tratHuawei(ret, "ADSL");
        est.setAdminState(!adm.contains("deactivated"));
        est.setOperState(oper.contains("up"));
        return est;
    }

    @Override
    protected Profile tratGetProfile(List<String> ret) {
        String[] profz = TratativaRetornoUtil.tratHuawei(ret, "line-profile").split(" ");
        String[] leprof = profz[profz.length - 1].split("_");
        Profile p = new Profile();
        p.setProfileDown(profz[profz.length - 1]);
        p.setProfileUp(profz[profz.length - 1]);

        p.setDown(compareV1Metalico(profz[profz.length - 1], Boolean.TRUE));
        p.setUp(compareV1Metalico(profz[profz.length - 1], Boolean.FALSE));

        return p;
    }

    @Override
    protected ComandoDslam getComandoGetVlans(InventarioRede i) {
        return new ComandoDslam("display service-port port 0/" + i.getSlot() + "/" + i.getPorta());
    }

    @Override
    protected VlanBanda tratGetVlanBanda(List<String> ret) {

        List<Integer> l = TratativaRetornoUtil.listIntegersFromString(TratativaRetornoUtil.tratHuawei(ret, "adl"));

        Integer cvlan = TratativaRetornoUtil.tratHuawei(ret, "PRI").contains("não") ? l.get(l.size() - 1) : l.get(l.size() - 2);
        Integer svlan = l.get(0);
        VlanBanda v = new VlanBanda();
        v.setCvlan(cvlan);
        v.setSvlan(svlan);
        v.setState(EnumEstadoVlan.UP);

        return v;
    }

    @Override
    protected ComandoDslam getComandoGetParametros(InventarioRede i) {
        return new ComandoDslam("interface adsl 0/" + i.getSlot() + "\n"
                + "display line operation " + i.getPorta() + "\n"
                + "y", 3000);
    }

    @Override
    protected TabelaParametrosMetalico tratGetTabelaParametros(List<String> ret) {
        TabelaParametrosMetalico t = new TabelaParametrosMetalico();
        t.setVelSincDown(new Double(TratativaRetornoUtil.tratHuawei(ret, "Downstream channel rate")));
        t.setVelMaxDown(new Double(TratativaRetornoUtil.tratHuawei(ret, "Downstream max. attainable rate")));
        t.setSnrDown(new Double(TratativaRetornoUtil.tratHuawei(ret, "Downstream channel SNR margin")));
        t.setAtnDown(new Double(TratativaRetornoUtil.tratHuawei(ret, "Downstream channel attenuation")));
        t.setVelSincUp(new Double(TratativaRetornoUtil.tratHuawei(ret, "Upstream channel rate")));
        t.setVelMaxUp(new Double(TratativaRetornoUtil.tratHuawei(ret, "Upstream max. attainable rate")));
        t.setSnrUp(new Double(TratativaRetornoUtil.tratHuawei(ret, "Upstream channel SNR margin")));
        t.setAtnUp(new Double(TratativaRetornoUtil.tratHuawei(ret, "Upstream channel attenuation")));
        return t;
    }

    @Override
    protected ComandoDslam getComandoGetTabelaRede(InventarioRede i) {
        return new ComandoDslam("interface adsl 0/" + i.getSlot() + "\n"
                + "display statistics performance " + i.getPorta() + " current-15minutes", 3000);
    }

    @Override
    protected TabelaRedeMetalico tratGetTabelaRede(List<String> ret) {
        TabelaRedeMetalico t = new TabelaRedeMetalico();
        t.setPctDown(new BigInteger(TratativaRetornoUtil.tratHuawei(ret, "Count of all encoded blocks transmitted")));
        t.setPctUp(new BigInteger(TratativaRetornoUtil.tratHuawei(ret, "Count of all encoded blocks transmitted", 2)));
        t.setCrcDown(new BigInteger(TratativaRetornoUtil.tratHuawei(ret, "Count of all blocks received with uncorrectable errors")));
        t.setCrcUp(new BigInteger(TratativaRetornoUtil.tratHuawei(ret, "Count of all blocks received with uncorrectable errors", 2)));
        t.setFecDown(new BigInteger(TratativaRetornoUtil.tratHuawei(ret, "Count of all blocks received with correctable errors")));
        t.setFecUp(new BigInteger(TratativaRetornoUtil.tratHuawei(ret, "Count of all blocks received with correctable errors", 2)));
        t.setTempoMedicao(new BigInteger(TratativaRetornoUtil.tratHuawei(ret, "Total elapsed seconds in this interval")));

        return t;
    }

    @Override
    protected ComandoDslam getComandoSetEstadoDaPorta(InventarioRede i, EstadoDaPorta e) {
        String state = e.getAdminState() ? "activate" : "deactivate";
        return new ComandoDslam("interface adsl 0/" + i.getSlot() + "\n"
                + state + " " + i.getPorta() + "\n"
                + "quit");
    }

    @Override
    protected ComandoDslam getComandoSetProfile(InventarioRede i, Velocidades v) {
        return new ComandoDslam("interface adsl 0/" + i.getSlot() + "\n"
                + "deactivate " + i.getPorta(), 1000,
                "activate " + i.getPorta() + " profile-name\n"
                + compare(v, Boolean.TRUE).getSintaxVel() + "\n"
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
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_2048, "2304_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_2247, "2304_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_3245, "4608_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_4326, "4608_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_4096, "4608_128D_704_64U_I_A"));
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

}
