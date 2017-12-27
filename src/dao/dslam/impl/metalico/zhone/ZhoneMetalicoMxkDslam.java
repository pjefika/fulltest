/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.metalico.zhone;

import br.net.gvt.efika.customer.InventarioRede;
import dao.dslam.impl.ComandoDslam;
import dao.dslam.impl.ConsultaDslamVivo2;
import dao.dslam.impl.login.LoginLento;
import dao.dslam.impl.retorno.TratativaRetornoUtil;
import java.math.BigInteger;
import java.util.List;
import model.dslam.consulta.DeviceMAC;
import model.dslam.consulta.EnumEstadoVlan;
import model.dslam.consulta.EstadoDaPorta;
import model.dslam.consulta.Profile;
import model.dslam.consulta.ProfileMetalico;
import model.dslam.consulta.VlanBanda;
import model.dslam.consulta.VlanMulticast;
import model.dslam.consulta.VlanVod;
import model.dslam.consulta.VlanVoip;
import model.dslam.consulta.metalico.Modulacao;
import model.dslam.consulta.metalico.TabelaParametrosMetalico;
import model.dslam.consulta.metalico.TabelaRedeMetalico;
import model.dslam.credencial.Credencial;
import model.dslam.velocidade.Modulacoes;
import model.dslam.velocidade.VelocidadeVendor;
import model.dslam.velocidade.Velocidades;

/**
 *
 * @author G0042204
 */
public class ZhoneMetalicoMxkDslam extends ZhoneMetalicoDslam {

    private TabelaParametrosMetalico tabParam;

    private TabelaRedeMetalico tabRede;

    private VlanBanda vlanBanda;

    private VlanVoip vlanVoip;

    private VlanVod vlanVod;

    private DeviceMAC mac = new DeviceMAC();

    public ZhoneMetalicoMxkDslam(String ipDslam) {
        super(ipDslam, Credencial.ZHONE, new LoginLento());
        this.setCd(new ConsultaDslamVivo2(this));

    }

    private void setTabelaParamRede(InventarioRede i) throws Exception {
        List<String> leParams = this.getCd().consulta(this.getParams(i)).getRetorno();

        tabParam = new TabelaParametrosMetalico();
        tabParam.setVelSincDown(new Double(TratativaRetornoUtil.tratZhone(leParams, "DslDownLineRate", "-?(\\d+((\\.|,| )\\d+)?)").get(0)) / 1000);
        tabParam.setVelSincUp(new Double(TratativaRetornoUtil.tratZhone(leParams, "DslUpLineRate", "-?(\\d+((\\.|,| )\\d+)?)").get(0)) / 1000);
        tabParam.setVelMaxDown(new Double(TratativaRetornoUtil.tratZhone(leParams, "DslMaxAttainableDownLineRate", "-?(\\d+((\\.|,| )\\d+)?)").get(0)) / 1000);
        tabParam.setVelMaxUp(new Double(TratativaRetornoUtil.tratZhone(leParams, "DslMaxAttainableUpLineRate", "-?(\\d+((\\.|,| )\\d+)?)").get(0)) / 1000);
        tabParam.setSnrDown(new Double(TratativaRetornoUtil.tratZhone(leParams, "curSnrMargin", "-?(\\d+((\\.|,| )\\d+)?)", 2).get(0)) / 10);
        tabParam.setSnrUp(new Double(TratativaRetornoUtil.tratZhone(leParams, "curSnrMargin", "-?(\\d+((\\.|,| )\\d+)?)").get(0)) / 10);
        tabParam.setAtnDown(new Double(TratativaRetornoUtil.tratZhone(leParams, "currAtn", "-?(\\d+((\\.|,| )\\d+)?)", 2).get(0)) / 10);
        tabParam.setAtnUp(new Double(TratativaRetornoUtil.tratZhone(leParams, "currAtn", "-?(\\d+((\\.|,| )\\d+)?)").get(0)) / 10);

        tabRede = new TabelaRedeMetalico();

        tabRede.setCrcDown(new BigInteger(TratativaRetornoUtil.tratZhone(leParams, "CRC Errors", "-?(\\d+((\\.|,| )\\d+)?)").get(0)));
        tabRede.setCrcUp(new BigInteger(TratativaRetornoUtil.tratZhone(leParams, "CRC Errors", "-?(\\d+((\\.|,| )\\d+)?)").get(0)));
        tabRede.setResync(new BigInteger(TratativaRetornoUtil.tratZhone(leParams, "Inits", "-?(\\d+((\\.|,| )\\d+)?)").get(0)));
        tabRede.setPctDown(new BigInteger(TratativaRetornoUtil.tratZhone(leParams, "In Pkts/Cells/Frags", "-?(\\d+((\\.|,| )\\d+)?)").get(0)));
        tabRede.setPctUp(new BigInteger(TratativaRetornoUtil.tratZhone(leParams, "Out Pkts/Cells/Frags", "-?(\\d+((\\.|,| )\\d+)?)").get(0)));

    }

    private void setVlans(InventarioRede i) throws Exception {
        List<String> leVlans = this.getCd().consulta(this.getComandoConsultaVlan(i)).getRetorno();
        List<String> vodStatistics = getCd().consulta(getComandoGetVodStatistics(i)).getRetorno();
        List<String> leVlanBanda = TratativaRetornoUtil.tratZhone(leVlans, "0-vdsl-0-35", "-?\\.?(\\d+((\\.|,| )\\d+)?)");
        List<String> leVodStatistics = TratativaRetornoUtil.tratZhone(vodStatistics, "0-vdsl-0-37", "-?\\.?(\\d+((\\.|,| )\\d+)?)", 2);
        List<String> pegaMac = TratativaRetornoUtil.tratZhone(leVlans, "0-vdsl-0-35", "([a-f\\d]{2}:){5}[a-f\\d]{2}");

        try {
            mac.setMac(pegaMac.get(0));
        } catch (Exception e) {
        }

        Integer cvlanBanda = null;
        Integer svlanBanda = null;
        if (leVlanBanda != null) {
            svlanBanda = new Integer(leVlanBanda.get(2));
            cvlanBanda = new Integer(leVlanBanda.get(1));
        }
        vlanBanda = new VlanBanda(cvlanBanda, svlanBanda, EnumEstadoVlan.UP);

        List<String> leVlanVoip = TratativaRetornoUtil.tratZhone(leVlans, "0-vdsl-0-36", "-?\\.?(\\d+((\\.|,| )\\d+)?)");
        Integer svlanVoip = null;
        Integer cvlanVoip = null;
        if (leVlanVoip != null) {
            svlanVoip = new Integer(leVlanVoip.get(2));
            cvlanVoip = new Integer(leVlanVoip.get(1));
        }
        vlanVoip = new VlanVoip(cvlanVoip, svlanVoip, EnumEstadoVlan.UP);

        List<String> leVlanVod = TratativaRetornoUtil.tratZhone(leVlans, "0-vdsl-0-37", "-?\\.?(\\d+((\\.|,| )\\d+)?)");
        Integer svlanVod = null;
        Integer cvlanVod = null;
        if (leVlanVod != null) {
            svlanVod = new Integer(leVlanVod.get(2));
            cvlanVod = new Integer(leVlanVod.get(1));
        }
        vlanVod = new VlanVod(cvlanVod, svlanVod, EnumEstadoVlan.UP);
        try {
            vlanVod.setPctDown(new BigInteger(leVodStatistics.get(8)));
            vlanVod.setPctUp(new BigInteger(leVodStatistics.get(11)));
        } catch (Exception e) {
        }
    }

    @Override
    public TabelaParametrosMetalico getTabelaParametros(InventarioRede i) throws Exception {
        if (tabParam == null) {
            setTabelaParamRede(i);
        }
        return tabParam;
    }

    @Override
    public TabelaRedeMetalico getTabelaRede(InventarioRede i) throws Exception {
        if (tabRede == null) {
            setTabelaParamRede(i);
        }
        return tabRede;
    }

    @Override
    public EstadoDaPorta getEstadoDaPorta(InventarioRede i) throws Exception {
        List<String> leEst = this.getCd().consulta(this.getParams(i)).getRetorno();
        return super.getEstadoDaPorta(leEst);
    }

    @Override
    public VlanBanda getVlanBanda(InventarioRede i) throws Exception {
        if (vlanBanda == null) {
            setVlans(i);
        }
        return vlanBanda;
    }

    @Override
    public List<VelocidadeVendor> obterVelocidadesUpVendor() {
        if (velsUp.isEmpty()) {
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_1024, "1280"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_3072, "3840"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_2048, "2600"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_3072, "4000"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_5120, "6000"));
        }

        return velsUp;
    }

    @Override
    public List<VelocidadeVendor> obterVelocidadesDownVendor() {
        if (velsDown.isEmpty()) {
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_1024, "1280", "autonegotiatemode", Modulacoes.AUTO_NEGOTIATE));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_2048, "2600", "autonegotiatemode", Modulacoes.AUTO_NEGOTIATE));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_3072, "3840", "autonegotiatemode", Modulacoes.AUTO_NEGOTIATE));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_5120, "7680", "autonegotiatemode", Modulacoes.AUTO_NEGOTIATE));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_10240, "12800", "adsl2plusmode", Modulacoes.ADSL));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_15360, "17664", "adsl2plusmode", Modulacoes.ADSL));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_25600, "27500", "vdsl2mode", Modulacoes.VDSL));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_35840, "38000", "vdsl2mode", Modulacoes.VDSL));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_51200, "55000", "vdsl2mode", Modulacoes.VDSL));
        }

        return velsDown;
    }

    @Override
    public VlanVoip getVlanVoip(InventarioRede i) throws Exception {
        if (vlanVoip == null) {
            setVlans(i);
        }
        return vlanVoip;
    }

    @Override
    public VlanVod getVlanVod(InventarioRede i) throws Exception {
        if (vlanVod == null) {
            setVlans(i);
        }
        return vlanVod;
    }

    @Override
    public VlanMulticast getVlanMulticast(InventarioRede i) throws Exception {
        List<String> leVlans = this.getCd().consulta(this.getMult(i)).getRetorno();
        List<String> leVlanMult = TratativaRetornoUtil.tratZhone(leVlans, "0-vdsl-0-38", "-?(\\d+((\\.|,| )\\d+)?)");
        List<String> multStatistics = getCd().consulta(getComandoGetMulticastStatistics(i)).getRetorno();
        List<String> leMultStatistics = TratativaRetornoUtil.tratZhone(multStatistics, "0-vdsl-0-38", "-?\\.?(\\d+((\\.|,| )\\d+)?)", 2);
        List<String> pegaIpIgmp = getCd().consulta(getComandoGetIpIgmp()).getRetorno();
        List<String> lePegaIpIgmp = TratativaRetornoUtil.tratZhone(pegaIpIgmp, "Custom IP", "\\b(?:(?:2(?:[0-4][0-9]|5[0-5])|[0-1]?[0-9]?[0-9])\\.){3}(?:(?:2([0-4][0-9]|5[0-5])|[0-1]?[0-9]?[0-9]))\\b");
        Integer svlan = null;

        if (leVlanMult != null) {
            svlan = new Integer(leVlanMult.get(0));
        }
        VlanMulticast vlanMult = new VlanMulticast(0, svlan, EnumEstadoVlan.UP);
        try {
            vlanMult.setPctDown(new BigInteger(leMultStatistics.get(8)));
            vlanMult.setPctUp(new BigInteger(leMultStatistics.get(11)));
            vlanMult.setIpIgmp(lePegaIpIgmp.get(0));
        } catch (Exception e) {
        }
        
        return vlanMult;
    }

    protected ComandoDslam getComandoGetVodStatistics(InventarioRede i) {
        return new ComandoDslam("bridge stats 1-" + i.getSlot() + "-" + i.getPorta() + "-0-vdsl-0-37-"+i.getCvlan()+"/bridge");
    }

    protected ComandoDslam getComandoGetMulticastStatistics(InventarioRede i) {
        return new ComandoDslam("bridge stats 1-" + i.getSlot() + "-" + i.getPorta() + "-0-vdsl-0-38-4000/bridge");
    }

    protected ComandoDslam getComandoResetVodtatistics(InventarioRede i) {
        return new ComandoDslam("bridge stats clear 1-" + i.getSlot() + "-" + i.getPorta() + "-0-vdsl-0-37-"+i.getCvlan()+"/bridge");
    }

    protected ComandoDslam getComandoResetMultitatistics(InventarioRede i) {
        return new ComandoDslam("bridge stats clear 1-" + i.getSlot() + "-" + i.getPorta() + "-0-vdsl-0-38-4000/bridge");
    }

    @Override
    public void resetIptvStatistics(InventarioRede i) throws Exception {
        getCd().consulta(getComandoResetVodtatistics(i));
        getCd().consulta(getComandoResetMultitatistics(i));
    }

    @Override
    public Profile getProfile(InventarioRede i) throws Exception {
        List<String> leProfDown = this.getCd().consulta(this.getProfDown(i)).getRetorno();
        List<String> leProfUp = this.getCd().consulta(this.getProfUp(i)).getRetorno();

        Profile p = new ProfileMetalico();
        String profDown = TratativaRetornoUtil.tratZhone(leProfDown, "fastMaxTxRate", "-?(\\d+((\\.|,| )\\d+)?)").get(0);
        p.setProfileDown(profDown);
        String profUp = TratativaRetornoUtil.tratZhone(leProfUp, "fastMaxTxRate", "-?(\\d+((\\.|,| )\\d+)?)").get(0);
        p.setProfileUp(profUp);
        p.setDown(compare(profDown, Boolean.TRUE));
        p.setUp(compare(profUp, Boolean.FALSE));

        return p;
    }

    @Override
    public Modulacao getModulacao(InventarioRede i) throws Exception {
        List<String> leModul = this.getCd().consulta(this.getModul(i)).getRetorno();
        Modulacao m = new Modulacao();
        String modulacao = TratativaRetornoUtil.tratZhone(leModul, "transmit-mode", "\\{([^\\[\\]]+|(R))*\\}").get(0).replace("{", "").replace("}", "");
        m.setModulacao(modulacao);
        m.setModulEnum(compare(modulacao));
        return m;
    }

    protected ComandoDslam getMult(InventarioRede i) {
        return new ComandoDslam("bridge show port 1-" + i.getSlot() + "-" + i.getPorta() + "-0/vdsl", 5000);
    }

    protected ComandoDslam getParams(InventarioRede i) {
        return new ComandoDslam("dslstat 1/" + i.getSlot() + "/" + i.getPorta() + "/0/vdsl -v", 5000, "a");
    }

    protected ComandoDslam getProfDown(InventarioRede i) {
        return new ComandoDslam("get vdsl-co-config 1/" + i.getSlot() + "/" + i.getPorta() + "/0/vdsl");
    }

    protected ComandoDslam getProfUp(InventarioRede i) {
        return new ComandoDslam("get vdsl-cpe-config 1/" + i.getSlot() + "/" + i.getPorta() + "/0/vdsl");
    }

    protected ComandoDslam getModul(InventarioRede i) {
        return new ComandoDslam("get vdsl-config 1/" + i.getSlot() + "/" + i.getPorta() + "/0/vdsl");
    }

    protected ComandoDslam getComandoSetModulacao(InventarioRede i, Velocidades v) {
        return new ComandoDslam("update vdsl-config transmit-mode=" + castModulacao(v).getModulacao() + " 1/" + i.getSlot() + "/" + i.getPorta() + "/0/vdsl");
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
        return new ComandoDslam("port " + e.toString() + " 1/" + i.getSlot() + "/" + i.getPorta() + "/0/vdsl");
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
        return new ComandoDslam("update vdsl-co-config fastMaxTxRate=" + castProfile(v).getProfileDown() + " interleaveMaxTxRate=" + castProfile(v).getProfileDown() + " 1/" + i.getSlot() + "/" + i.getPorta() + "/0/vdsl");
    }

    @Override
    public void setProfileDown(InventarioRede i, Velocidades v) throws Exception {
        List<String> leResp = getCd().consulta(getComandoSetProfileDown(i, v)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
    }

    protected ComandoDslam getComandoSetProfileUp(InventarioRede i, Velocidades v) {
        return new ComandoDslam("update vdsl-cpe-config fastMaxTxRate=" + castProfile(v).getProfileUp() + " interleaveMaxTxRate=" + castProfile(v).getProfileUp() + " 1/" + i.getSlot() + "/" + i.getPorta() + "/0/vdsl");
    }

    @Override
    public void setProfileUp(InventarioRede i, Velocidades vDown, Velocidades vUp) throws Exception {
        List<String> leResp = getCd().consulta(getComandoSetProfileDown(i, vDown)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
    }

    protected ComandoDslam getComandoCreateVlanBanda(InventarioRede i) {
        return new ComandoDslam("bridge add 1-" + i.getSlot() + "-" + i.getPorta() + "-0/vdsl vc 0/35 downlink vlan 600 xlate-to " + i.getCvlan() + " slan " + i.getRin() + " tagged");
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
        return new ComandoDslam("bridge add 1-" + i.getSlot() + "-" + i.getPorta() + "-0/vdsl vc 0/36 downlink vlan 601 xlate-to " + i.getCvlan() + " slan " + i.getVlanVoip() + " tagged");
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
        return new ComandoDslam("bridge add 1-" + i.getSlot() + "-" + i.getPorta() + "-0/vdsl vc 0/37 downlink vlan 602 xlate-to " + i.getCvlan() + " slan " + i.getVlanVod() + " tagged");
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
        return new ComandoDslam("bridge add 1-" + i.getSlot() + "-" + i.getPorta() + "-0/vdsl vc 0/38 downlink vlan 4000 tagged cos 4 outcosall 4");
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
        return new ComandoDslam("bridge delete 1-" + i.getSlot() + "-" + i.getPorta() + "-0/vdsl vc 0/35 vlan " + i.getCvlan() + " slan " + i.getRin());
    }

    @Override
    public void deleteVlanBanda(InventarioRede i) throws Exception {
        List<String> leResp = getCd().consulta(getComandoDeleteVlanBanda(i)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
    }

    protected ComandoDslam getComandoDeleteVlanVoip(InventarioRede i) {
        return new ComandoDslam("bridge delete 1-" + i.getSlot() + "-" + i.getPorta() + "-0/vdsl vc 0/36 vlan " + i.getCvlan() + " slan " + i.getVlanVoip());
    }

    @Override
    public void deleteVlanVoip(InventarioRede i) throws Exception {
        List<String> leResp = getCd().consulta(getComandoDeleteVlanVoip(i)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
    }

    protected ComandoDslam getComandoDeleteVlanVod(InventarioRede i) {
        return new ComandoDslam("bridge delete 1-" + i.getSlot() + "-" + i.getPorta() + "-0/vdsl vc 0/37 vlan " + i.getCvlan() + " slan " + i.getVlanVod());
    }

    @Override
    public void deleteVlanVod(InventarioRede i) throws Exception {
        List<String> leResp = getCd().consulta(getComandoDeleteVlanVod(i)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
    }

    protected ComandoDslam getComandoDeleteVlanMulticast(InventarioRede i) {
        return new ComandoDslam("bridge delete 1-" + i.getSlot() + "-" + i.getPorta() + "-0/vdsl vc 0/38 vlan " + i.getVlanMulticast());
    }

    @Override
    public void deleteVlanMulticast(InventarioRede i) throws Exception {
        List<String> leResp = getCd().consulta(getComandoDeleteVlanMulticast(i)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
    }

//    @Override
    public Modulacao castModulacao(Velocidades v) {
        Modulacao m = new Modulacao();
        Boolean isAuto = new Double(v.getVel()).compareTo(5d) <= 0;
        Boolean isAdsl = new Double(v.getVel()).compareTo(20d) <= 0 && !isAuto;
        String leModul = "";
        if (isAuto) {
            leModul = "autonegotiatemode";
        } else {
            leModul = isAdsl ? "adsl2plusmode" : "vdsl2mode";
        }

        m.setModulacao(leModul);

        return m;
    }

//    @Override
    public Profile castProfile(Velocidades v) {
        Profile p = new ProfileMetalico();

        switch (v.getVel()) {
            case "3":
                p.setProfileDown("3840");
                p.setProfileUp("1280");
                break;
            case "5":
                p.setProfileDown("7680");
                p.setProfileUp("1280");
                break;
            case "10":
                p.setProfileDown("12800");
                p.setProfileUp("1280");
                break;
            case "15":
                p.setProfileDown("17664");
                p.setProfileUp("1280");
                break;
            case "25":
                p.setProfileDown("27500");
                p.setProfileUp("2600");
                break;
            case "35":
                p.setProfileDown("38000");
                p.setProfileUp("4000");
                break;
            case "50":
                p.setProfileDown("55000");
                p.setProfileUp("6000");
                break;
            default:
                break;
        }

        return p;
    }

    @Override
    public void resetTabelaRede(InventarioRede i) throws Exception {
        getCd().consulta(getComandoResetTabelaRede(i));
        tabRede = null;
    }

    protected ComandoDslam getComandoResetTabelaRede(InventarioRede i) {
        return new ComandoDslam("dslstat clear 1-" + i.getSlot() + "-" + i.getPorta() + "-0/vdsl");
    }

    @Override
    public List<TabelaRedeMetalico> getHistoricoTabelaRede(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DeviceMAC getDeviceMac(InventarioRede i) throws Exception {
        if (mac.getMac().isEmpty()) {
            setVlans(i);
        }
        return mac;
    }

}
