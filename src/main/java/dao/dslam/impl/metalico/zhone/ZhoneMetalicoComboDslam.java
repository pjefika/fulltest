/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.metalico.zhone;

import br.net.gvt.efika.efika_customer.model.customer.InventarioRede;
import br.net.gvt.efika.fulltest.exception.FuncIndisponivelDslamException;
import br.net.gvt.efika.fulltest.model.telecom.config.ComandoDslam;
import br.net.gvt.efika.fulltest.model.telecom.properties.DeviceMAC;
import br.net.gvt.efika.fulltest.model.telecom.properties.EnumEstadoVlan;
import br.net.gvt.efika.fulltest.model.telecom.properties.EstadoDaPorta;
import br.net.gvt.efika.fulltest.model.telecom.properties.Profile;
import br.net.gvt.efika.fulltest.model.telecom.properties.ProfileMetalico;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanBanda;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanMulticast;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanVod;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanVoip;
import br.net.gvt.efika.fulltest.model.telecom.properties.metalico.Modulacao;
import br.net.gvt.efika.fulltest.model.telecom.properties.metalico.TabelaParametrosMetalico;
import br.net.gvt.efika.fulltest.model.telecom.properties.metalico.TabelaRedeMetalico;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.Modulacoes;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.VelocidadeVendor;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.Velocidades;
import dao.dslam.impl.login.LoginLento;
import dao.dslam.impl.retorno.TratativaRetornoUtil;
import java.math.BigInteger;
import java.util.List;
import model.dslam.credencial.Credencial;

/**
 *
 * @author G0042204
 */
public class ZhoneMetalicoComboDslam extends ZhoneMetalicoDslam {

    private transient TabelaParametrosMetalico tabParam;
    private transient TabelaRedeMetalico tabRede;
    private transient VlanBanda vlanBanda;
    private transient VlanVoip vlanVoip;
    private transient VlanVod vlanVod;
    private transient DeviceMAC mac;

    public ZhoneMetalicoComboDslam(String ipDslam) {
        super(ipDslam, Credencial.ZHONE, new LoginLento());
    }

    private void setTabelaParamRede(InventarioRede i) throws Exception {
        ComandoDslam cmd = this.getCd().consulta(this.getParams(i));
        List<String> leParams = cmd.getRetorno();

        tabParam = new TabelaParametrosMetalico();
        tabParam.addInteracao(cmd);
        tabParam.setVelSincDown(new Double(TratativaRetornoUtil.tratZhone(leParams, "DslDownLineRate", "-?(\\d+((\\.|,| )\\d+)?)").get(0)) / 1000);
        tabParam.setVelSincUp(new Double(TratativaRetornoUtil.tratZhone(leParams, "DslUpLineRate", "-?(\\d+((\\.|,| )\\d+)?)").get(0)) / 1000);
        tabParam.setVelMaxDown(new Double(TratativaRetornoUtil.tratZhone(leParams, "DslMaxAttainableDownLineRate", "-?(\\d+((\\.|,| )\\d+)?)").get(0)) / 1000);
        tabParam.setVelMaxUp(new Double(TratativaRetornoUtil.tratZhone(leParams, "DslMaxAttainableUpLineRate", "-?(\\d+((\\.|,| )\\d+)?)").get(0)) / 1000);
        tabParam.setSnrDown(new Double(TratativaRetornoUtil.tratZhone(leParams, "AdslAturCurrLineSnrMgn", "-?(\\d+((\\.|,| )\\d+)?)").get(0)) / 10);
        tabParam.setSnrUp(new Double(TratativaRetornoUtil.tratZhone(leParams, "AdslAtucCurrLineSnrMgn", "-?(\\d+((\\.|,| )\\d+)?)").get(0)) / 10);
        tabParam.setAtnDown(new Double(TratativaRetornoUtil.tratZhone(leParams, "AdslAturCurrLineAtn", "-?(\\d+((\\.|,| )\\d+)?)").get(0)) / 10);
        tabParam.setAtnUp(new Double(TratativaRetornoUtil.tratZhone(leParams, "AdslAtucCurrLineAtn", "-?(\\d+((\\.|,| )\\d+)?)").get(0)) / 10);

        tabRede = new TabelaRedeMetalico();
        tabRede.addInteracao(cmd);

        tabRede.setCrcDown(new BigInteger(TratativaRetornoUtil.tratZhone(leParams, "CRC errors on fast buffer", "-?(\\d+((\\.|,| )\\d+)?)").get(0)));
        tabRede.setCrcUp(new BigInteger(TratativaRetornoUtil.tratZhone(leParams, "CRC errors on fast buffer", "-?(\\d+((\\.|,| )\\d+)?)", 2).get(0)));
        tabRede.setFecDown(new BigInteger(TratativaRetornoUtil.tratZhone(leParams, "FEC corrected errors on fast buffer", "-?(\\d+((\\.|,| )\\d+)?)").get(0)));
        tabRede.setFecUp(new BigInteger(TratativaRetornoUtil.tratZhone(leParams, "FEC corrected errors on fast buffer", "-?(\\d+((\\.|,| )\\d+)?)", 2).get(0)));
        tabRede.setPctDown(new BigInteger(TratativaRetornoUtil.tratZhone(leParams, "In Pkts/Cells/Frags", "-?(\\d+((\\.|,| )\\d+)?)").get(0)));
        tabRede.setPctUp(new BigInteger(TratativaRetornoUtil.tratZhone(leParams, "Out Pkts/Cells/Frags", "-?(\\d+((\\.|,| )\\d+)?)").get(0)));
        tabRede.setResync(new BigInteger(TratativaRetornoUtil.tratZhone(leParams, "Inits", "-?(\\d+((\\.|,| )\\d+)?)").get(0)));
    }

    protected ComandoDslam getComandoGetVodStatistics(InventarioRede i) {
        return new ComandoDslam("bridge stats 1-" + i.getSlot() + "-" + i.getPorta() + "-0-adsl-0-37/bridge");
    }

    protected ComandoDslam getComandoGetMulticastStatistics(InventarioRede i) {
        return new ComandoDslam("bridge stats 1-" + i.getSlot() + "-" + i.getPorta() + "-0-adsl-0-38/bridge");
    }

    protected ComandoDslam getComandoResetVodtatistics(InventarioRede i) {
        return new ComandoDslam("bridge stats clear 1-" + i.getSlot() + "-" + i.getPorta() + "-0-adsl-0-37/bridge");
    }

    protected ComandoDslam getComandoResetMultitatistics(InventarioRede i) {
        return new ComandoDslam("bridge stats clear 1-" + i.getSlot() + "-" + i.getPorta() + "-0-adsl-0-38/bridge");
    }

    @Override
    public void resetIptvStatistics(InventarioRede i) throws Exception {
        getCd().consulta(getComandoResetVodtatistics(i));
        getCd().consulta(getComandoResetMultitatistics(i));
    }

    private void setVlans(InventarioRede i) throws Exception {
        ComandoDslam cmd = this.getCd().consulta(this.getComandoConsultaVlan(i));
        List<String> leVlans = cmd.getRetorno();
        ComandoDslam cmd1 = getCd().consulta(getComandoGetVodStatistics(i));
        List<String> vodStatistics = cmd1.getRetorno();
        List<String> leVlanBanda = TratativaRetornoUtil.tratZhone(leVlans, "0-adsl-0-35", "-?\\.?(\\d+((\\.|,| )\\d+)?)");
        List<String> leVodStatistics = TratativaRetornoUtil.tratZhone(vodStatistics, "0-adsl-0-37", "-?\\.?(\\d+((\\.|,| )\\d+)?)", 2);
        List<String> pegaMac = TratativaRetornoUtil.tratZhone(leVlans, "0-adsl-0-35", "([a-f\\d]{2}:){5}[a-f\\d]{2}");
        mac = new DeviceMAC();
        mac.addInteracao(cmd);
        mac.addInteracao(cmd1);
        try {
            mac.setMac(pegaMac.get(0).toUpperCase());
        } catch (Exception e) {
        }

        Integer cvlanBanda = null;
        Integer p100Banda = null;
        if (leVlanBanda != null) {
            cvlanBanda = new Integer(leVlanBanda.get(0));
            p100Banda = new Integer(leVlanBanda.get(1));
        }
        vlanBanda = new VlanBanda(cvlanBanda, p100Banda, EnumEstadoVlan.UP);
        vlanBanda.addInteracao(cmd);

        List<String> leVlanVoip = TratativaRetornoUtil.tratZhone(leVlans, "0-adsl-0-36", "-?\\.?(\\d+((\\.|,| )\\d+)?)");
        Integer cvlanVoip = null;
        Integer p100Voip = null;
        if (leVlanVoip != null) {
            p100Voip = new Integer(leVlanVoip.get(1));
            cvlanVoip = new Integer(leVlanVoip.get(0));
        }
        vlanVoip = new VlanVoip(cvlanVoip, p100Voip, EnumEstadoVlan.UP);
        vlanVoip.addInteracao(cmd);

        List<String> leVlanVod = TratativaRetornoUtil.tratZhone(leVlans, "0-adsl-0-37", "-?\\.?(\\d+((\\.|,| )\\d+)?)");

        Integer cvlanVod = null;
        Integer p100Vod = null;

        if (leVlanVod != null) {
            p100Vod = new Integer(leVlanVod.get(1));
            cvlanVod = new Integer(leVlanVod.get(0));
        }
        vlanVod = new VlanVod(cvlanVod, p100Vod, EnumEstadoVlan.UP);
        vlanVod.addInteracao(cmd);
        vlanVod.addInteracao(cmd1);
        try {
            vlanVod.setPctDown(new Integer(leVodStatistics.get(7)));
            vlanVod.setPctUp(new Integer(leVodStatistics.get(10)));
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
        ComandoDslam cmd = this.getCd().consulta(this.getParams(i));
        return super.getEstadoDaPorta(cmd);
    }

    @Override
    public VlanBanda getVlanBanda(InventarioRede i) throws Exception {
        if (vlanBanda == null) {
            setVlans(i);
        }
        return vlanBanda;
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
        ComandoDslam cmd = this.getCd().consulta(this.getMult(i));
        List<String> leVlans = cmd.getRetorno();
        List<String> leVlanMult = TratativaRetornoUtil.tratZhone(leVlans, "0-adsl-0-38", "-?\\.?(\\d+((\\.|,| )\\d+)?)");
        ComandoDslam cmd1 = getCd().consulta(getComandoGetMulticastStatistics(i));
        List<String> multStatistics = cmd1.getRetorno();
        List<String> leMultStatistics = TratativaRetornoUtil.tratZhone(multStatistics, "0-adsl-0-38", "-?\\.?(\\d+((\\.|,| )\\d+)?)", 2);
        ComandoDslam cmd2 = getCd().consulta(getComandoGetIpIgmp());
        List<String> pegaIpIgmp = cmd2.getRetorno();
        List<String> lePegaIpIgmp = TratativaRetornoUtil.tratZhone(pegaIpIgmp, "Custom IP", "\\b(?:(?:2(?:[0-4][0-9]|5[0-5])|[0-1]?[0-9]?[0-9])\\.){3}(?:(?:2([0-4][0-9]|5[0-5])|[0-1]?[0-9]?[0-9]))\\b");
        Integer svlan = new Integer("0");

        if (leVlanMult != null) {
            svlan = new Integer(leVlanMult.get(0));
        }
        VlanMulticast vlanMult = new VlanMulticast(0, svlan, EnumEstadoVlan.UP);
        try {
            vlanMult.setPctDown(new Integer(leMultStatistics.get(7)));
            vlanMult.setPctUp(new Integer(leMultStatistics.get(10)));
            vlanMult.setIpIgmp(lePegaIpIgmp.get(0));
        } catch (Exception e) {
        }
        vlanMult.addInteracao(cmd);
        vlanMult.addInteracao(cmd1);
        vlanMult.addInteracao(cmd2);

        return vlanMult;
    }

    @Override
    public Profile getProfile(InventarioRede i) throws Exception {
        ComandoDslam cmd = this.getCd().consulta(this.getProfDown(i));
        List<String> leProfDown = cmd.getRetorno();
        ComandoDslam cmd1 = this.getCd().consulta(this.getProfUp(i));
        List<String> leProfUp = cmd1.getRetorno();

        Profile p = new ProfileMetalico();
        String leDown = TratativaRetornoUtil.tratZhone(leProfDown, "fastMaxTxRate", "-?(\\d+((\\.|,| )\\d+)?)").get(0);
        String leUp = TratativaRetornoUtil.tratZhone(leProfUp, "fastMaxTxRate", "-?(\\d+((\\.|,| )\\d+)?)").get(0);

        p.setProfileDown(leDown);
        p.setProfileUp(leUp);
        p.setDown(compare(leDown, true));
        p.setUp(compare(leUp, false));
        p.addInteracao(cmd);
        p.addInteracao(cmd1);

        return p;
    }

    @Override
    public List<VelocidadeVendor> obterVelocidadesUpVendor() {
        velsUp.add(new VelocidadeVendor(Velocidades.VEL_1024, "1280000"));
        return velsUp;
    }

    @Override
    public List<VelocidadeVendor> obterVelocidadesDownVendor() {
        velsDown.add(new VelocidadeVendor(Velocidades.VEL_1024, "1280000", "autonegotiatemode", Modulacoes.AUTO_NEGOTIATE));
        velsDown.add(new VelocidadeVendor(Velocidades.VEL_3072, "3840000", "autonegotiatemode", Modulacoes.AUTO_NEGOTIATE));
        velsDown.add(new VelocidadeVendor(Velocidades.VEL_5120, "7680000", "autonegotiatemode", Modulacoes.AUTO_NEGOTIATE));
        velsDown.add(new VelocidadeVendor(Velocidades.VEL_10240, "12800000", "adsl2plusmode", Modulacoes.ADSL));
        velsDown.add(new VelocidadeVendor(Velocidades.VEL_15360, "17664000", "adsl2plusmode", Modulacoes.ADSL));
        return velsDown;
    }

    @Override
    public Modulacao getModulacao(InventarioRede i) throws Exception {
        ComandoDslam cmd = this.getCd().consulta(this.getModul(i));

        List<String> leModul = cmd.getRetorno();
        Modulacao m = new Modulacao();
        String modulacao = TratativaRetornoUtil.tratZhone(leModul, "adslTransmissionMode", "\\{([^\\[\\]]+|(R))*\\}").get(0).replace("{", "").replace("}", "");
        m.setModulacao(modulacao);
        m.setModulEnum(compare(modulacao));
        m.addInteracao(cmd);

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
        return new ComandoDslam("update adsl-profile adslTransmissionMode=" + compare(v, Boolean.TRUE).getSintaxMod() + " 1/" + i.getSlot() + "/" + i.getPorta());
    }

    @Override
    public Modulacao setModulacao(InventarioRede i, Velocidades v) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoSetModulacao(i, v));
        Modulacao m = getModulacao(i);
        m.getInteracoes().add(0, cmd);
        return m;
    }

    protected ComandoDslam getComandoSetEstadoDaPorta(InventarioRede i, EstadoDaPorta e) {
        return new ComandoDslam("port " + e.toString() + " 1/" + i.getSlot() + "/" + i.getPorta() + "/0/adsl");
    }

    @Override
    public EstadoDaPorta setEstadoDaPorta(InventarioRede i, EstadoDaPorta e) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoSetEstadoDaPorta(i, e));
        EstadoDaPorta es = getEstadoDaPorta(i);
        es.getInteracoes().add(0, cmd);
        return es;
    }

    protected ComandoDslam getComandoSetProfileDown(InventarioRede i, Velocidades v) {
        return new ComandoDslam("update adsl-co-profile fastMaxTxRate=" + compare(v, Boolean.TRUE).getSintaxVel()
                + " interleaveMaxTxRate=" + compare(v, Boolean.TRUE).getSintaxVel() + " 1/" + i.getSlot() + "/" + i.getPorta());
    }

    @Override
    public Profile setProfileDown(InventarioRede i, Velocidades v) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoSetProfileDown(i, v));
        ComandoDslam cmd1 = getCd().consulta(getComandoSetProfileUp(i, Velocidades.VEL_1024));

        Profile p = getProfile(i);
        p.getInteracoes().add(0, cmd1);
        p.getInteracoes().add(0, cmd);
        return p;

    }

    protected ComandoDslam getComandoSetProfileUp(InventarioRede i, Velocidades v) {
        return new ComandoDslam("update adsl-cpe-profile fastMaxTxRate=" + compare(v, Boolean.FALSE).getSintaxVel()
                + " interleaveMaxTxRate=" + compare(v, Boolean.FALSE).getSintaxVel() + " 1/" + i.getSlot() + "/" + i.getPorta());
    }

    @Override
    public Profile setProfileUp(InventarioRede i, Velocidades vDown, Velocidades vUp) throws Exception {
        return setProfileDown(i, vDown);
    }

    protected ComandoDslam getComandoCreateVlanBanda(InventarioRede i) {
        return new ComandoDslam("bridge add 1-" + i.getSlot() + "-" + i.getPorta() + "-0/adsl vc 0/35 td 20 downlink vlan " + i.getCvlan() + " slan " + i.getRin());
    }

    @Override
    public VlanBanda createVlanBanda(InventarioRede i, Velocidades vDown, Velocidades vUp) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoCreateVlanBanda(i));
        vlanBanda = null;
        getVlanBanda(i);
        vlanBanda.getInteracoes().add(0, cmd);
        return vlanBanda;
    }

    protected ComandoDslam getComandoCreateVlanVoip(InventarioRede i) {
        return new ComandoDslam("bridge add 1-" + i.getSlot() + "-" + i.getPorta() + "-0/adsl vc 0/36 td 23 downlink vlan " + i.getCvlan() + " slan " + i.getVlanVoip() + " cos 5 outcosall 5 scos 5 soutcosall 5");
    }

    @Override
    public VlanVoip createVlanVoip(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoCreateVlanVoip(i));
        vlanVoip = null;
        getVlanVoip(i);
        vlanVoip.getInteracoes().add(0, cmd);
        return vlanVoip;
    }

    protected ComandoDslam getComandoCreateVlanVod(InventarioRede i) {
        return new ComandoDslam("bridge add 1-" + i.getSlot() + "-" + i.getPorta() + "-0/adsl vc 0/37 td 21 downlink vlan " + i.getCvlan() + " slan " + i.getVlanVod() + " cos 3 outcosall 3 scos 3 soutcosall 3");
    }

    @Override
    public VlanVod createVlanVod(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoCreateVlanVod(i));
        vlanVod = null;
        getVlanVod(i);
        vlanVod.getInteracoes().add(0, cmd);
        return vlanVod;
    }

    protected ComandoDslam getComandoCreateVlanMulticast(InventarioRede i) {
        return new ComandoDslam("bridge add 1-" + i.getSlot() + "-" + i.getPorta() + "-0/adsl vc 0/38 td 22 downlink vlan 4000 cos 4 outcosall 4");
    }

    @Override
    public VlanMulticast createVlanMulticast(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoCreateVlanMulticast(i));
        VlanMulticast v = getVlanMulticast(i);
        v.getInteracoes().add(0, cmd);
        return v;
    }

    protected ComandoDslam getComandoDeleteVlanBanda(InventarioRede i) {
        return new ComandoDslam("bridge delete 1-" + i.getSlot() + "-" + i.getPorta() + "-0/adsl vc 0/35",2000);
    }

    @Override
    public VlanBanda deleteVlanBanda(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoDeleteVlanBanda(i));
        vlanBanda = null;
        getVlanVod(i);
        vlanBanda.getInteracoes().add(0, cmd);
        return vlanBanda;

    }

    protected ComandoDslam getComandoDeleteVlanVoip(InventarioRede i) {
        return new ComandoDslam("bridge delete 1-" + i.getSlot() + "-" + i.getPorta() + "-0/adsl vc 0/36",2000);
    }

    @Override
    public VlanVoip deleteVlanVoip(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoDeleteVlanVoip(i));
        vlanVoip = null;
        getVlanVoip(i);
        vlanVoip.getInteracoes().add(cmd);
        return vlanVoip;
    }

    protected ComandoDslam getComandoDeleteVlanVod(InventarioRede i) {
        return new ComandoDslam("bridge delete 1-" + i.getSlot() + "-" + i.getPorta() + "-0/adsl vc 0/37",2000);
    }

    @Override
    public VlanVod deleteVlanVod(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoDeleteVlanVod(i));
        vlanVod = null;
        getVlanVod(i);
        vlanVod.getInteracoes().add(0, cmd);
        return vlanVod;
    }

    protected ComandoDslam getComandoDeleteVlanMulticast(InventarioRede i) {
        return new ComandoDslam("bridge delete 1-" + i.getSlot() + "-" + i.getPorta() + "-0/adsl vc 0/38",2000);
    }

    @Override
    public VlanMulticast deleteVlanMulticast(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoDeleteVlanMulticast(i));
        VlanMulticast v = getVlanMulticast(i);
        v.getInteracoes().add(0, cmd);
        return v;
    }

//    @Override
    public Modulacao castModulacao(Velocidades v) {
        Modulacao m = new Modulacao();
        Boolean isAuto = new Double(v.getVel()).compareTo(5d) <= 0;
        String leModul = isAuto ? "autonegotiatemode" : "adsl2plusmode";

        m.setModulacao(leModul);

        return m;
    }

//    @Override
    public Profile castProfile(Velocidades v) {
        Profile p = new ProfileMetalico();
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

    @Override
    public TabelaRedeMetalico resetTabelaRede(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoResetTabelaRede(i));
        tabRede = null;
        getTabelaRede(i);
        tabRede.getInteracoes().add(0, cmd);
        return tabRede;
    }

    protected ComandoDslam getComandoResetTabelaRede(InventarioRede i) {
        return new ComandoDslam("dslstat clear 1-" + i.getSlot() + "-" + i.getPorta() + "-0/adsl");
    }

    @Override
    public List<TabelaRedeMetalico> getHistoricoTabelaRede(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }

    @Override
    public DeviceMAC getDeviceMac(InventarioRede i) throws Exception {
        if (mac==null || mac.getMac().isEmpty()) {
            setVlans(i);
        }
        return mac;
    }

}
