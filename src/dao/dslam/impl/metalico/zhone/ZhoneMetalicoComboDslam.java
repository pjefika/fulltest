/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.metalico.zhone;

import br.net.gvt.efika.customer.InventarioRede;
import dao.dslam.impl.ComandoDslam;
import dao.dslam.impl.login.LoginLento;
import dao.dslam.impl.retorno.TratativaRetornoUtil;
import java.math.BigInteger;
import java.util.List;
import model.EnumEstadoVlan;
import model.dslam.consulta.EstadoDaPorta;
import model.dslam.consulta.Profile;
import model.dslam.consulta.VlanBanda;
import model.dslam.consulta.VlanMulticast;
import model.dslam.consulta.VlanVod;
import model.dslam.consulta.VlanVoip;
import model.dslam.consulta.metalico.Modulacao;
import model.dslam.consulta.metalico.TabelaParametrosMetalico;
import model.dslam.consulta.metalico.TabelaRedeMetalico;
import model.dslam.credencial.Credencial;
import model.dslam.velocidade.VelocidadeVendor;
import model.dslam.velocidade.Velocidades;

/**
 *
 * @author G0042204
 */
public class ZhoneMetalicoComboDslam extends ZhoneMetalicoDslam {

    public ZhoneMetalicoComboDslam(String ipDslam) {
        super(ipDslam, Credencial.ZHONE, new LoginLento());
    }

    @Override
    public TabelaParametrosMetalico getTabelaParametros(InventarioRede i) throws Exception {
        List<String> leParams = this.getCd().consulta(this.getParams(i)).getRetorno();

        TabelaParametrosMetalico tab = new TabelaParametrosMetalico();

        tab.setVelSincDown(new Double(TratativaRetornoUtil.tratZhone(leParams, "DslDownLineRate", "-?(\\d+((\\.|,| )\\d+)?)").get(0)) / 1000);
        tab.setVelSincUp(new Double(TratativaRetornoUtil.tratZhone(leParams, "DslUpLineRate", "-?(\\d+((\\.|,| )\\d+)?)").get(0)) / 1000);

        tab.setVelMaxDown(new Double(TratativaRetornoUtil.tratZhone(leParams, "DslMaxAttainableDownLineRate", "-?(\\d+((\\.|,| )\\d+)?)").get(0)) / 1000);
        tab.setVelMaxUp(new Double(TratativaRetornoUtil.tratZhone(leParams, "DslMaxAttainableUpLineRate", "-?(\\d+((\\.|,| )\\d+)?)").get(0)) / 1000);

        tab.setSnrDown(new Double(TratativaRetornoUtil.tratZhone(leParams, "AdslAturCurrLineSnrMgn", "-?(\\d+((\\.|,| )\\d+)?)").get(0)) / 10);
        tab.setSnrUp(new Double(TratativaRetornoUtil.tratZhone(leParams, "AdslAtucCurrLineSnrMgn", "-?(\\d+((\\.|,| )\\d+)?)").get(0)) / 10);
        tab.setAtnDown(new Double(TratativaRetornoUtil.tratZhone(leParams, "AdslAturCurrLineAtn", "-?(\\d+((\\.|,| )\\d+)?)").get(0)) / 10);
        tab.setAtnUp(new Double(TratativaRetornoUtil.tratZhone(leParams, "AdslAtucCurrLineAtn", "-?(\\d+((\\.|,| )\\d+)?)").get(0)) / 10);

        return tab;
    }

    @Override
    public TabelaRedeMetalico getTabelaRede(InventarioRede i) throws Exception {
        List<String> leRedes = this.getCd().consulta(this.getParams(i)).getRetorno();
        TabelaRedeMetalico tab = new TabelaRedeMetalico();

//        tab.setCrcDown(new BigInteger(TratativaRetornoUtil.tratZhone(leRedes, "CRC errors on fast buffer", "-?(\\d+((\\.|,| )\\d+)?)").get(0)));
//        tab.setCrcUp(new BigInteger(TratativaRetornoUtil.tratZhone(leRedes, "CRC errors on fast buffer", "-?(\\d+((\\.|,| )\\d+)?)", 2).get(0)));
//        tab.setFecDown(new BigInteger(TratativaRetornoUtil.tratZhone(leRedes, "FEC corrected errors on fast buffer", "-?(\\d+((\\.|,| )\\d+)?)").get(0)));
//        tab.setFecUp(new BigInteger(TratativaRetornoUtil.tratZhone(leRedes, "FEC corrected errors on fast buffer", "-?(\\d+((\\.|,| )\\d+)?)", 2).get(0)));
        tab.setPctDown(new BigInteger(TratativaRetornoUtil.tratZhone(leRedes, "In Pkts/Cells/Frags", "-?(\\d+((\\.|,| )\\d+)?)").get(0)));
        tab.setPctUp(new BigInteger(TratativaRetornoUtil.tratZhone(leRedes, "Out Pkts/Cells/Frags", "-?(\\d+((\\.|,| )\\d+)?)").get(0)));
//        tab.setResync(new BigInteger(TratativaRetornoUtil.tratZhone(leRedes, "Inits", "-?(\\d+((\\.|,| )\\d+)?)").get(0)));
        tab.setCrcDown(BigInteger.ZERO);
        tab.setCrcUp(BigInteger.ZERO);
        tab.setFecDown(BigInteger.ZERO);
        tab.setFecUp(BigInteger.ZERO);
        tab.setResync(BigInteger.ZERO);

        return tab;
    }

    @Override
    public EstadoDaPorta getEstadoDaPorta(InventarioRede i) throws Exception {
        List<String> leEst = this.getCd().consulta(this.getParams(i)).getRetorno();
        return super.getEstadoDaPorta(leEst);
    }

    @Override
    public VlanBanda getVlanBanda(InventarioRede i) throws Exception {
        List<String> leVlans = this.getCd().consulta(this.getComandoConsultaVlan(i)).getRetorno();
        List<String> leVlanBanda = TratativaRetornoUtil.tratZhone(leVlans, "0-adsl-0-35", "-?\\.?(\\d+((\\.|,| )\\d+)?)");

        Integer cvlan = new Integer("0");
        Integer p100 = new Integer("0");

        if (leVlanBanda != null) {
            cvlan = new Integer(leVlanBanda.get(0));
            p100 = new Integer(leVlanBanda.get(1));
        }
        VlanBanda vlanBanda = new VlanBanda(cvlan, p100, EnumEstadoVlan.UP);

        return vlanBanda;
    }

    @Override
    public VlanVoip getVlanVoip(InventarioRede i) throws Exception {
        List<String> leVlans = this.getCd().consulta(this.getComandoConsultaVlan(i)).getRetorno();
        List<String> leVlanBanda = TratativaRetornoUtil.tratZhone(leVlans, "0-adsl-0-36", "-?\\.?(\\d+((\\.|,| )\\d+)?)");

        Integer cvlan = new Integer("0");
        Integer p100 = new Integer("0");

        if (leVlanBanda != null) {
            p100 = new Integer(leVlanBanda.get(1));
            cvlan = new Integer(leVlanBanda.get(0));
        }
        VlanVoip vlanVoip = new VlanVoip(cvlan, p100, EnumEstadoVlan.UP);

        return vlanVoip;
    }

    @Override
    public VlanVod getVlanVod(InventarioRede i) throws Exception {
        List<String> leVlans = this.getCd().consulta(this.getComandoConsultaVlan(i)).getRetorno();
        List<String> leVlanBanda = TratativaRetornoUtil.tratZhone(leVlans, "0-adsl-0-37", "-?\\.?(\\d+((\\.|,| )\\d+)?)");

        Integer cvlan = new Integer("0");
        Integer p100 = new Integer("0");

        if (leVlanBanda != null) {
            p100 = new Integer(leVlanBanda.get(1));
            cvlan = new Integer(leVlanBanda.get(0));
        }
        VlanVod vlanVod = new VlanVod(cvlan, p100, EnumEstadoVlan.UP);

        return vlanVod;
    }

    @Override
    public VlanMulticast getVlanMulticast(InventarioRede i) throws Exception {
        List<String> leVlans = this.getCd().consulta(this.getMult(i)).getRetorno();
        List<String> leVlanMult = TratativaRetornoUtil.tratZhone(leVlans, "0-adsl-0-38", "-?\\.?(\\d+((\\.|,| )\\d+)?)");
        Integer svlan = new Integer("0");

        if (leVlanMult != null) {
            svlan = new Integer(leVlanMult.get(0));
        }
        VlanMulticast vlanMult = new VlanMulticast(0, svlan, EnumEstadoVlan.UP);

        return vlanMult;
    }

    @Override
    public Profile getProfile(InventarioRede i) throws Exception {
        List<String> leProfDown = this.getCd().consulta(this.getProfDown(i)).getRetorno();
        List<String> leProfUp = this.getCd().consulta(this.getProfUp(i)).getRetorno();

        Profile p = new Profile();
        String leDown = TratativaRetornoUtil.tratZhone(leProfDown, "fastMaxTxRate", "-?(\\d+((\\.|,| )\\d+)?)").get(0);
        String leUp = TratativaRetornoUtil.tratZhone(leProfUp, "fastMaxTxRate", "-?(\\d+((\\.|,| )\\d+)?)").get(0);

        p.setProfileDown(leDown);
        p.setProfileUp(leUp);
        p.setDown(compare(leDown, true));
        p.setUp(compare(leUp, false));

        return p;
    }

    @Override
    protected List<VelocidadeVendor> obterVelocidadesUpVendor() {
        velsUp.add(new VelocidadeVendor(Velocidades.VEL_1024, "1280000", "autonegotiatemode"));
        return velsUp;
    }

    @Override
    protected List<VelocidadeVendor> obterVelocidadesDownVendor() {
        velsDown.add(new VelocidadeVendor(Velocidades.VEL_1024, "1280000", "autonegotiatemode"));
        velsDown.add(new VelocidadeVendor(Velocidades.VEL_3072, "3840000", "autonegotiatemode"));
        velsDown.add(new VelocidadeVendor(Velocidades.VEL_5120, "7680000", "autonegotiatemode"));
        velsDown.add(new VelocidadeVendor(Velocidades.VEL_10240, "12800000", "adsl2plusmode"));
        velsDown.add(new VelocidadeVendor(Velocidades.VEL_15360, "17664000", "adsl2plusmode"));
        return velsDown;
    }

    @Override
    public Modulacao getModulacao(InventarioRede i) throws Exception {
        List<String> leModul = this.getCd().consulta(this.getModul(i)).getRetorno();
        Modulacao m = new Modulacao();
        String modulacao = TratativaRetornoUtil.tratZhone(leModul, "adslTransmissionMode", "\\{([^\\[\\]]+|(R))*\\}").get(0).replace("{", "").replace("}", "");
        System.out.println(modulacao);
        m.setModulacao(modulacao);
        return m;
    }

    protected ComandoDslam getMult(InventarioRede i) {
        return new ComandoDslam("bridge show port 1-" + i.getSlot() + "-" + i.getPorta() + "-0/adsl", 5000);
    }

    protected ComandoDslam getParams(InventarioRede i) {
        return new ComandoDslam("dslstat 1-" + i.getSlot() + "-" + i.getPorta() + "-0/adsl", 5000, "a");
    }

    protected ComandoDslam getProfDown(InventarioRede i) {
        return new ComandoDslam("get adsl-co-profile 1/" + i.getSlot() + "/" + i.getPorta());
    }

    protected ComandoDslam getProfUp(InventarioRede i) {
        return new ComandoDslam("get adsl-cpe-profile 1/" + i.getSlot() + "/" + i.getPorta());
    }

    protected ComandoDslam getModul(InventarioRede i) {
        return new ComandoDslam("get adsl-profile 1/" + i.getSlot() + "/" + i.getPorta());
    }

    protected ComandoDslam getComandoSetModulacao(InventarioRede i, Velocidades v) {
        return new ComandoDslam("update adsl-profile adslTransmissionMode=" + castModulacao(v).getModulacao() + " 1/" + i.getSlot() + "/" + i.getPorta());
    }

    @Override
    public Modulacao setModulacao(InventarioRede i, Velocidades v) throws Exception {
        List<String> leResp = getCd().consulta(getComandoSetModulacao(i, v)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
        return getModulacao(i);
    }

    protected ComandoDslam getComandoSetEstadoDaPorta(InventarioRede i, EstadoDaPorta e) {
        return new ComandoDslam("port " + e.getAdminState() + " 1/" + i.getSlot() + "/" + i.getPorta() + "/0/adsl");
    }

    @Override
    public EstadoDaPorta setEstadoDaPorta(InventarioRede i, EstadoDaPorta e) throws Exception {
        List<String> leResp = getCd().consulta(getComandoSetEstadoDaPorta(i, e)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
        return getEstadoDaPorta(i);
    }

    protected ComandoDslam getComandoSetProfileDown(InventarioRede i, Velocidades v) {
        return new ComandoDslam("update adsl-co-profile fastMaxTxRate=" + castProfile(v).getProfileDown()
                + " interleaveMaxTxRate=" + castProfile(v).getProfileDown() + " 1/" + i.getSlot() + "/" + i.getPorta());
    }

    @Override
    public void setProfileDown(InventarioRede i, Velocidades v) throws Exception {
        List<String> leResp = getCd().consulta(getComandoSetProfileDown(i, v)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
    }

    protected ComandoDslam getComandoSetProfileUp(InventarioRede i, Velocidades v) {
        return new ComandoDslam("update adsl-cpe-profile fastMaxTxRate=" + castProfile(v).getProfileUp()
                + " interleaveMaxTxRate=" + castProfile(v).getProfileUp() + " 1/" + i.getSlot() + "/" + i.getPorta());
    }

    @Override
    public void setProfileUp(InventarioRede i, Velocidades vDown, Velocidades vUp) throws Exception {
        List<String> leResp = getCd().consulta(getComandoSetProfileUp(i, vUp)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
    }

    protected ComandoDslam getComandoCreateVlanBanda(InventarioRede i) {
        return new ComandoDslam("bridge add 1-" + i.getSlot() + "-" + i.getPorta() + "-0/adsl vc 0/35 td 20 downlink vlan " + i.getCvLan() + " slan " + i.getRin());
    }

    @Override
    public VlanBanda createVlanBanda(InventarioRede i, Velocidades vDown, Velocidades vUp) throws Exception {
        List<String> leResp = getCd().consulta(getComandoCreateVlanBanda(i)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
        return getVlanBanda(i);
    }

    protected ComandoDslam getComandoCreateVlanVoip(InventarioRede i) {
        return new ComandoDslam("bridge add 1-" + i.getSlot() + "-" + i.getPorta() + "-0/adsl vc 0/36 td 23 downlink vlan " + i.getCvLan() + " slan " + i.getVlanVoip() + " cos 5 outcosall 5 scos 5 soutcosall 5");
    }

    @Override
    public VlanVoip createVlanVoip(InventarioRede i) throws Exception {
        List<String> leResp = getCd().consulta(getComandoCreateVlanVoip(i)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
        return getVlanVoip(i);
    }

    protected ComandoDslam getComandoCreateVlanVod(InventarioRede i) {
        return new ComandoDslam("bridge add 1-" + i.getSlot() + "-" + i.getPorta() + "-0/adsl vc 0/37 td 21 downlink vlan " + i.getCvLan() + " slan " + i.getVlanVod() + " cos 3 outcosall 3 scos 3 soutcosall 3");
    }

    @Override
    public VlanVod createVlanVod(InventarioRede i) throws Exception {
        List<String> leResp = getCd().consulta(getComandoCreateVlanVod(i)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
        return getVlanVod(i);
    }

    protected ComandoDslam getComandoCreateVlanMulticast(InventarioRede i) {
        return new ComandoDslam("bridge add 1-" + i.getSlot() + "-" + i.getPorta() + "-0/adsl vc 0/38 td 22 downlink vlan 4000 cos 4 outcosall 4");
    }

    @Override
    public VlanMulticast createVlanMulticast(InventarioRede i) throws Exception {
        List<String> leResp = getCd().consulta(getComandoCreateVlanMulticast(i)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
        return getVlanMulticast(i);
    }

    protected ComandoDslam getComandoDeleteVlanBanda(InventarioRede i) {
        return new ComandoDslam("bridge delete 1-" + i.getSlot() + "-" + i.getPorta() + "-0/adsl vc 0/35");
    }

    @Override
    public void deleteVlanBanda(InventarioRede i) throws Exception {
        List<String> leResp = getCd().consulta(getComandoDeleteVlanBanda(i)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
    }

    protected ComandoDslam getComandoDeleteVlanVoip(InventarioRede i) {
        return new ComandoDslam("bridge delete 1-" + i.getSlot() + "-" + i.getPorta() + "-0/adsl vc 0/36");
    }

    @Override
    public void deleteVlanVoip(InventarioRede i) throws Exception {
        List<String> leResp = getCd().consulta(getComandoDeleteVlanVoip(i)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
    }

    protected ComandoDslam getComandoDeleteVlanVod(InventarioRede i) {
        return new ComandoDslam("bridge delete 1-" + i.getSlot() + "-" + i.getPorta() + "-0/adsl vc 0/37");
    }

    @Override
    public void deleteVlanVod(InventarioRede i) throws Exception {
        List<String> leResp = getCd().consulta(getComandoDeleteVlanVod(i)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
    }

    protected ComandoDslam getComandoDeleteVlanMulticast(InventarioRede i) {
        return new ComandoDslam("bridge delete 1-" + i.getSlot() + "-" + i.getPorta() + "-0/adsl vc 0/38");
    }

    @Override
    public void deleteVlanMulticast(InventarioRede i) throws Exception {
        List<String> leResp = getCd().consulta(getComandoDeleteVlanMulticast(i)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
    }

    @Override
    public Modulacao castModulacao(Velocidades v) {
        Modulacao m = new Modulacao();
        Boolean isAuto = new Double(v.getVel()).compareTo(5d) <= 0;
        String leModul = isAuto ? "autonegotiatemode" : "adsl2plusmode";

        m.setModulacao(leModul);

        return m;
    }

    @Override
    public Profile castProfile(Velocidades v) {
        Profile p = new Profile();
        p.setProfileUp("1280000");
        switch (v.getVel()) {
            case "3":
                p.setProfileDown("3840000");
                break;
            case "5":
                p.setProfileDown("7680000");
                break;
            case "10":
                p.setProfileDown("12800000");
                break;
            case "15":
                p.setProfileDown("17664000");
                break;
            default:
                break;
        }

        return p;
    }

}
