/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.metalico.zhone;

import br.net.gvt.efika.customer.InventarioRede;
import dao.dslam.factory.exception.FuncIndisponivelDslamException;
import dao.dslam.impl.ComandoDslam;
import dao.dslam.impl.login.LoginLento;
import dao.dslam.impl.retorno.TratativaRetornoUtil;
import java.math.BigInteger;

import java.util.List;
import model.dslam.credencial.Credencial;
import telecom.properties.DeviceMAC;
import telecom.properties.EnumEstadoVlan;
import telecom.properties.EstadoDaPorta;
import telecom.properties.Profile;
import telecom.properties.ProfileMetalico;
import telecom.properties.VlanBanda;
import telecom.properties.VlanMulticast;
import telecom.properties.VlanVod;
import telecom.properties.VlanVoip;
import telecom.properties.metalico.Modulacao;
import telecom.properties.metalico.TabelaParametrosMetalico;
import telecom.properties.metalico.TabelaRedeMetalico;
import telecom.velocidade.Modulacoes;
import telecom.velocidade.VelocidadeVendor;
import telecom.velocidade.Velocidades;

/**
 *
 * @author G0042204
 */
public class ZhoneMetalicoComboDslam extends ZhoneMetalicoDslam {

    private TabelaParametrosMetalico tabParam;

    private TabelaRedeMetalico tabRede;

    private VlanBanda vlanBanda;

    private VlanVoip vlanVoip;

    private VlanVod vlanVod;

    private DeviceMAC mac = new DeviceMAC();

    public ZhoneMetalicoComboDslam(String ipDslam) {
        super(ipDslam, Credencial.ZHONE, new LoginLento());
    }

    private void setTabelaParamRede(InventarioRede i) throws Exception {
        List<String> leParams = this.getCd().consulta(this.getParams(i)).getRetorno();

        tabParam = new TabelaParametrosMetalico();
        tabParam.setVelSincDown(new Double(TratativaRetornoUtil.tratZhone(leParams, "DslDownLineRate", "-?(\\d+((\\.|,| )\\d+)?)").get(0)) / 1000);
        tabParam.setVelSincUp(new Double(TratativaRetornoUtil.tratZhone(leParams, "DslUpLineRate", "-?(\\d+((\\.|,| )\\d+)?)").get(0)) / 1000);
        tabParam.setVelMaxDown(new Double(TratativaRetornoUtil.tratZhone(leParams, "DslMaxAttainableDownLineRate", "-?(\\d+((\\.|,| )\\d+)?)").get(0)) / 1000);
        tabParam.setVelMaxUp(new Double(TratativaRetornoUtil.tratZhone(leParams, "DslMaxAttainableUpLineRate", "-?(\\d+((\\.|,| )\\d+)?)").get(0)) / 1000);
        tabParam.setSnrDown(new Double(TratativaRetornoUtil.tratZhone(leParams, "AdslAturCurrLineSnrMgn", "-?(\\d+((\\.|,| )\\d+)?)").get(0)) / 10);
        tabParam.setSnrUp(new Double(TratativaRetornoUtil.tratZhone(leParams, "AdslAtucCurrLineSnrMgn", "-?(\\d+((\\.|,| )\\d+)?)").get(0)) / 10);
        tabParam.setAtnDown(new Double(TratativaRetornoUtil.tratZhone(leParams, "AdslAturCurrLineAtn", "-?(\\d+((\\.|,| )\\d+)?)").get(0)) / 10);
        tabParam.setAtnUp(new Double(TratativaRetornoUtil.tratZhone(leParams, "AdslAtucCurrLineAtn", "-?(\\d+((\\.|,| )\\d+)?)").get(0)) / 10);

        tabRede = new TabelaRedeMetalico();
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
        List<String> leVlans = this.getCd().consulta(this.getComandoConsultaVlan(i)).getRetorno();
        List<String> vodStatistics = getCd().consulta(getComandoGetVodStatistics(i)).getRetorno();
        List<String> leVlanBanda = TratativaRetornoUtil.tratZhone(leVlans, "0-adsl-0-35", "-?\\.?(\\d+((\\.|,| )\\d+)?)");
        List<String> leVodStatistics = TratativaRetornoUtil.tratZhone(vodStatistics, "0-adsl-0-37", "-?\\.?(\\d+((\\.|,| )\\d+)?)", 2);
        List<String> pegaMac = TratativaRetornoUtil.tratZhone(leVlans, "0-adsl-0-35", "([a-f\\d]{2}:){5}[a-f\\d]{2}");
        try {
            mac.setMac(pegaMac.get(0));
        } catch (Exception e) {
        }

        Integer cvlanBanda = null;
        Integer p100Banda = null;
        if (leVlanBanda != null) {
            cvlanBanda = new Integer(leVlanBanda.get(0));
            p100Banda = new Integer(leVlanBanda.get(1));
        }
        vlanBanda = new VlanBanda(cvlanBanda, p100Banda, EnumEstadoVlan.UP);

        List<String> leVlanVoip = TratativaRetornoUtil.tratZhone(leVlans, "0-adsl-0-36", "-?\\.?(\\d+((\\.|,| )\\d+)?)");
        Integer cvlanVoip = null;
        Integer p100Voip = null;
        if (leVlanVoip != null) {
            p100Voip = new Integer(leVlanVoip.get(1));
            cvlanVoip = new Integer(leVlanVoip.get(0));
        }
        vlanVoip = new VlanVoip(cvlanVoip, p100Voip, EnumEstadoVlan.UP);

        List<String> leVlanVod = TratativaRetornoUtil.tratZhone(leVlans, "0-adsl-0-37", "-?\\.?(\\d+((\\.|,| )\\d+)?)");

        Integer cvlanVod = null;
        Integer p100Vod = null;

        if (leVlanVod != null) {
            p100Vod = new Integer(leVlanVod.get(1));
            cvlanVod = new Integer(leVlanVod.get(0));
        }
        vlanVod = new VlanVod(cvlanVod, p100Vod, EnumEstadoVlan.UP);
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
        List<String> leVlanMult = TratativaRetornoUtil.tratZhone(leVlans, "0-adsl-0-38", "-?\\.?(\\d+((\\.|,| )\\d+)?)");
        List<String> multStatistics = getCd().consulta(getComandoGetMulticastStatistics(i)).getRetorno();
        List<String> leMultStatistics = TratativaRetornoUtil.tratZhone(multStatistics, "0-adsl-0-38", "-?\\.?(\\d+((\\.|,| )\\d+)?)", 2);
        List<String> pegaIpIgmp = getCd().consulta(getComandoGetIpIgmp()).getRetorno();
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

        return vlanMult;
    }

    @Override
    public Profile getProfile(InventarioRede i) throws Exception {
        List<String> leProfDown = this.getCd().consulta(this.getProfDown(i)).getRetorno();
        List<String> leProfUp = this.getCd().consulta(this.getProfUp(i)).getRetorno();

        Profile p = new ProfileMetalico();
        String leDown = TratativaRetornoUtil.tratZhone(leProfDown, "fastMaxTxRate", "-?(\\d+((\\.|,| )\\d+)?)").get(0);
        String leUp = TratativaRetornoUtil.tratZhone(leProfUp, "fastMaxTxRate", "-?(\\d+((\\.|,| )\\d+)?)").get(0);

        p.setProfileDown(leDown);
        p.setProfileUp(leUp);
        p.setDown(compare(leDown, true));
        p.setUp(compare(leUp, false));

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
        List<String> leModul = this.getCd().consulta(this.getModul(i)).getRetorno();
        Modulacao m = new Modulacao();
        String modulacao = TratativaRetornoUtil.tratZhone(leModul, "adslTransmissionMode", "\\{([^\\[\\]]+|(R))*\\}").get(0).replace("{", "").replace("}", "");
        m.setModulacao(modulacao);
        m.setModulEnum(compare(modulacao));
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
        List<String> leResp = getCd().consulta(getComandoSetModulacao(i, v)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
        return getModulacao(i);
    }

    protected ComandoDslam getComandoSetEstadoDaPorta(InventarioRede i, EstadoDaPorta e) {
        return new ComandoDslam("port " + e.toString() + " 1/" + i.getSlot() + "/" + i.getPorta() + "/0/adsl");
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
        return new ComandoDslam("update adsl-co-profile fastMaxTxRate=" + compare(v, Boolean.TRUE).getSintaxVel()
                + " interleaveMaxTxRate=" + compare(v, Boolean.TRUE).getSintaxVel() + " 1/" + i.getSlot() + "/" + i.getPorta());
    }

    @Override
    public void setProfileDown(InventarioRede i, Velocidades v) throws Exception {
        List<String> leResp = getCd().consulta(getComandoSetProfileDown(i, v)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
    }

    protected ComandoDslam getComandoSetProfileUp(InventarioRede i, Velocidades v) {
        return new ComandoDslam("update adsl-cpe-profile fastMaxTxRate=" + compare(v, Boolean.FALSE).getSintaxVel()
                + " interleaveMaxTxRate=" + compare(v, Boolean.FALSE).getSintaxVel() + " 1/" + i.getSlot() + "/" + i.getPorta());
    }

    @Override
    public void setProfileUp(InventarioRede i, Velocidades vDown, Velocidades vUp) throws Exception {
        List<String> leResp = getCd().consulta(getComandoSetProfileUp(i, vUp)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
    }

    protected ComandoDslam getComandoCreateVlanBanda(InventarioRede i) {
        return new ComandoDslam("bridge add 1-" + i.getSlot() + "-" + i.getPorta() + "-0/adsl vc 0/35 td 20 downlink vlan " + i.getCvlan() + " slan " + i.getRin());
    }

    @Override
    public VlanBanda createVlanBanda(InventarioRede i, Velocidades vDown, Velocidades vUp) throws Exception {
        getCd().consulta(getComandoCreateVlanBanda(i));
        vlanBanda = null;
        return getVlanBanda(i);
    }

    protected ComandoDslam getComandoCreateVlanVoip(InventarioRede i) {
        return new ComandoDslam("bridge add 1-" + i.getSlot() + "-" + i.getPorta() + "-0/adsl vc 0/36 td 23 downlink vlan " + i.getCvlan() + " slan " + i.getVlanVoip() + " cos 5 outcosall 5 scos 5 soutcosall 5");
    }

    @Override
    public VlanVoip createVlanVoip(InventarioRede i) throws Exception {
        getCd().consulta(getComandoCreateVlanVoip(i));
        vlanVoip = null;
        return getVlanVoip(i);
    }

    protected ComandoDslam getComandoCreateVlanVod(InventarioRede i) {
        return new ComandoDslam("bridge add 1-" + i.getSlot() + "-" + i.getPorta() + "-0/adsl vc 0/37 td 21 downlink vlan " + i.getCvlan() + " slan " + i.getVlanVod() + " cos 3 outcosall 3 scos 3 soutcosall 3");
    }

    @Override
    public VlanVod createVlanVod(InventarioRede i) throws Exception {
        getCd().consulta(getComandoCreateVlanVod(i));
        vlanVod = null;
        return getVlanVod(i);
    }

    protected ComandoDslam getComandoCreateVlanMulticast(InventarioRede i) {
        return new ComandoDslam("bridge add 1-" + i.getSlot() + "-" + i.getPorta() + "-0/adsl vc 0/38 td 22 downlink vlan 4000 cos 4 outcosall 4");
    }

    @Override
    public VlanMulticast createVlanMulticast(InventarioRede i) throws Exception {
        getCd().consulta(getComandoCreateVlanMulticast(i));

        return getVlanMulticast(i);
    }

    protected ComandoDslam getComandoDeleteVlanBanda(InventarioRede i) {
        return new ComandoDslam("bridge delete 1-" + i.getSlot() + "-" + i.getPorta() + "-0/adsl vc 0/35");
    }

    @Override
    public void deleteVlanBanda(InventarioRede i) throws Exception {
        List<String> leResp = getCd().consulta(getComandoDeleteVlanBanda(i)).getRetorno();
        vlanBanda = null;
    }

    protected ComandoDslam getComandoDeleteVlanVoip(InventarioRede i) {
        return new ComandoDslam("bridge delete 1-" + i.getSlot() + "-" + i.getPorta() + "-0/adsl vc 0/36");
    }

    @Override
    public void deleteVlanVoip(InventarioRede i) throws Exception {
        getCd().consulta(getComandoDeleteVlanVoip(i));
        vlanVoip = null;
    }

    protected ComandoDslam getComandoDeleteVlanVod(InventarioRede i) {
        return new ComandoDslam("bridge delete 1-" + i.getSlot() + "-" + i.getPorta() + "-0/adsl vc 0/37");
    }

    @Override
    public void deleteVlanVod(InventarioRede i) throws Exception {
        getCd().consulta(getComandoDeleteVlanVod(i));
        vlanVod = null;
    }

    protected ComandoDslam getComandoDeleteVlanMulticast(InventarioRede i) {
        return new ComandoDslam("bridge delete 1-" + i.getSlot() + "-" + i.getPorta() + "-0/adsl vc 0/38");
    }

    @Override
    public void deleteVlanMulticast(InventarioRede i) throws Exception {
        getCd().consulta(getComandoDeleteVlanMulticast(i));
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
    public void resetTabelaRede(InventarioRede i) throws Exception {
        getCd().consulta(getComandoResetTabelaRede(i));
        tabRede = null;
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
        if (mac.getMac().isEmpty()) {
            setVlans(i);
        }
        return mac;
    }

}
