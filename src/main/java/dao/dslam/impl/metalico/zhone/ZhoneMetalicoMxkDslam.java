/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.metalico.zhone;

import br.net.gvt.efika.efika_customer.model.customer.InventarioRede;
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
import dao.dslam.impl.ConsultaDslamVivo2;
import dao.dslam.impl.login.LoginLento;
import dao.dslam.impl.retorno.TratativaRetornoUtil;
import java.math.BigInteger;
import java.util.List;
import model.dslam.credencial.Credencial;

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

    private DeviceMAC mac;

    public ZhoneMetalicoMxkDslam(String ipDslam) {
        super(ipDslam, Credencial.ZHONE, new LoginLento());
        this.setCd(new ConsultaDslamVivo2(this));

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
        tabParam.setSnrDown(new Double(TratativaRetornoUtil.tratZhone(leParams, "curSnrMargin", "-?(\\d+((\\.|,| )\\d+)?)", 2).get(0)) / 10);
        tabParam.setSnrUp(new Double(TratativaRetornoUtil.tratZhone(leParams, "curSnrMargin", "-?(\\d+((\\.|,| )\\d+)?)").get(0)) / 10);
        tabParam.setAtnDown(new Double(TratativaRetornoUtil.tratZhone(leParams, "currAtn", "-?(\\d+((\\.|,| )\\d+)?)", 2).get(0)) / 10);
        tabParam.setAtnUp(new Double(TratativaRetornoUtil.tratZhone(leParams, "currAtn", "-?(\\d+((\\.|,| )\\d+)?)").get(0)) / 10);

        tabRede = new TabelaRedeMetalico();

        tabRede.addInteracao(cmd);
        tabRede.setCrcDown(new BigInteger(TratativaRetornoUtil.tratZhone(leParams, "CRC Errors", "-?(\\d+((\\.|,| )\\d+)?)").get(0)));
        tabRede.setCrcUp(new BigInteger(TratativaRetornoUtil.tratZhone(leParams, "CRC Errors", "-?(\\d+((\\.|,| )\\d+)?)").get(0)));
        tabRede.setResync(new BigInteger(TratativaRetornoUtil.tratZhone(leParams, "Inits", "-?(\\d+((\\.|,| )\\d+)?)").get(0)));
        tabRede.setPctDown(new BigInteger(TratativaRetornoUtil.tratZhone(leParams, "In Pkts/Cells/Frags", "-?(\\d+((\\.|,| )\\d+)?)").get(0)));
        tabRede.setPctUp(new BigInteger(TratativaRetornoUtil.tratZhone(leParams, "Out Pkts/Cells/Frags", "-?(\\d+((\\.|,| )\\d+)?)").get(0)));

    }

    private void setVlans(InventarioRede i) throws Exception {
        ComandoDslam cmd = this.getCd().consulta(this.getComandoConsultaVlan(i));
        List<String> leVlans = cmd.getRetorno();
        ComandoDslam cmd1 = getCd().consulta(getComandoGetVodStatistics(i));
        List<String> vodStatistics = cmd1.getRetorno();
        List<String> leVlanBanda = TratativaRetornoUtil.tratZhone(leVlans, "0-vdsl-0-35", "-?\\.?(\\d+((\\.|,| )\\d+)?)");
        List<String> leVodStatistics = TratativaRetornoUtil.tratZhone(vodStatistics, "0-vdsl-0-37", "-?\\.?(\\d+((\\.|,| )\\d+)?)", 2);
        List<String> pegaMac = TratativaRetornoUtil.tratZhone(leVlans, "0-vdsl-0-35", "([a-f\\d]{2}:){5}[a-f\\d]{2}");

        mac = new DeviceMAC();
        mac.addInteracao(cmd);
        try {
            mac.setMac(pegaMac.get(0).toUpperCase());
        } catch (Exception e) {
        }

        Integer cvlanBanda = null;
        Integer svlanBanda = null;
        if (leVlanBanda != null) {
            svlanBanda = new Integer(leVlanBanda.get(2));
            cvlanBanda = new Integer(leVlanBanda.get(1));
        }
        vlanBanda = new VlanBanda(cvlanBanda, svlanBanda, EnumEstadoVlan.UP);
        vlanBanda.addInteracao(cmd);
        List<String> leVlanVoip = TratativaRetornoUtil.tratZhone(leVlans, "0-vdsl-0-36", "-?\\.?(\\d+((\\.|,| )\\d+)?)");
        Integer svlanVoip = null;
        Integer cvlanVoip = null;
        if (leVlanVoip != null) {
            svlanVoip = new Integer(leVlanVoip.get(2));
            cvlanVoip = new Integer(leVlanVoip.get(1));
        }
        vlanVoip = new VlanVoip(cvlanVoip, svlanVoip, EnumEstadoVlan.UP);
        vlanVoip.addInteracao(cmd);

        List<String> leVlanVod = TratativaRetornoUtil.tratZhone(leVlans, "0-vdsl-0-37", "-?\\.?(\\d+((\\.|,| )\\d+)?)");
        Integer svlanVod = null;
        Integer cvlanVod = null;
        if (leVlanVod != null) {
            svlanVod = new Integer(leVlanVod.get(2));
            cvlanVod = new Integer(leVlanVod.get(1));
        }
        vlanVod = new VlanVod(cvlanVod, svlanVod, EnumEstadoVlan.UP);
        vlanVod.addInteracao(cmd);
        try {
            vlanVod.setPctDown(new Integer(leVodStatistics.get(8)));
            vlanVod.setPctUp(new Integer(leVodStatistics.get(11)));
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
    public List<VelocidadeVendor> obterVelocidadesUpVendor() {
        if (velsUp.isEmpty()) {
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_1024, "1280"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_2048, "2600"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_3072, "4000"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_3072, "3840"));
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
        ComandoDslam cmd = this.getCd().consulta(this.getMult(i));
        List<String> leVlans = cmd.getRetorno();
        List<String> leVlanMult = TratativaRetornoUtil.tratZhone(leVlans, "0-vdsl-0-38", "-?(\\d+((\\.|,| )\\d+)?)");
        ComandoDslam cmd1 = getCd().consulta(getComandoGetMulticastStatistics(i));
        List<String> multStatistics = cmd1.getRetorno();
        List<String> leMultStatistics = TratativaRetornoUtil.tratZhone(multStatistics, "0-vdsl-0-38", "-?\\.?(\\d+((\\.|,| )\\d+)?)", 2);
        ComandoDslam cmd2 = getCd().consulta(getComandoGetIpIgmp());
        List<String> pegaIpIgmp = cmd2.getRetorno();
        List<String> lePegaIpIgmp = TratativaRetornoUtil.tratZhone(pegaIpIgmp, "Custom IP", "\\b(?:(?:2(?:[0-4][0-9]|5[0-5])|[0-1]?[0-9]?[0-9])\\.){3}(?:(?:2([0-4][0-9]|5[0-5])|[0-1]?[0-9]?[0-9]))\\b");
        Integer svlan = null;

        if (leVlanMult != null) {
            svlan = new Integer(leVlanMult.get(0));
        }
        VlanMulticast vlanMult = new VlanMulticast(0, svlan, EnumEstadoVlan.UP);
        vlanMult.addInteracao(cmd);
        vlanMult.addInteracao(cmd1);
        vlanMult.addInteracao(cmd2);
        try {
            vlanMult.setPctDown(new Integer(leMultStatistics.get(8)));
            vlanMult.setPctUp(new Integer(leMultStatistics.get(11)));
            vlanMult.setIpIgmp(lePegaIpIgmp.get(0));
        } catch (Exception e) {
        }

        return vlanMult;
    }

    protected ComandoDslam getComandoGetVodStatistics(InventarioRede i) {
        return new ComandoDslam("bridge stats 1-" + i.getSlot() + "-" + i.getPorta() + "-0-vdsl-0-37-" + i.getCvlan() + "/bridge");
    }

    protected ComandoDslam getComandoGetMulticastStatistics(InventarioRede i) {
        return new ComandoDslam("bridge stats 1-" + i.getSlot() + "-" + i.getPorta() + "-0-vdsl-0-38-4000/bridge");
    }

    protected ComandoDslam getComandoResetVodtatistics(InventarioRede i) {
        return new ComandoDslam("bridge stats clear 1-" + i.getSlot() + "-" + i.getPorta() + "-0-vdsl-0-37-" + i.getCvlan() + "/bridge");
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
        ComandoDslam cmd = this.getCd().consulta(this.getProfDown(i));
        ComandoDslam cmd1 = this.getCd().consulta(this.getProfUp(i));
        List<String> leProfDown = cmd.getRetorno();
        List<String> leProfUp = cmd1.getRetorno();

        Profile p = new ProfileMetalico();
        p.addInteracao(cmd);
        p.addInteracao(cmd1);

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
        ComandoDslam cmd = this.getCd().consulta(this.getModul(i));
        List<String> leModul = cmd.getRetorno();
        Modulacao m = new Modulacao();
        String modulacao = TratativaRetornoUtil.tratZhone(leModul, "transmit-mode", "\\{([^\\[\\]]+|(R))*\\}").get(0).replace("{", "").replace("}", "");
        m.setModulacao(modulacao);
        m.setModulEnum(compare(modulacao));
        m.addInteracao(cmd);

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
        ComandoDslam cmd = getCd().consulta(getComandoSetModulacao(i, v));
        Modulacao m = getModulacao(i);
        m.getInteracoes().add(0, cmd);
        return m;
    }

    protected ComandoDslam getComandoSetEstadoDaPorta(InventarioRede i, EstadoDaPorta e) {
        return new ComandoDslam("port " + e.toString() + " 1/" + i.getSlot() + "/" + i.getPorta() + "/0/vdsl");
    }

    @Override
    public EstadoDaPorta setEstadoDaPorta(InventarioRede i, EstadoDaPorta e) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoSetEstadoDaPorta(i, e));
        EstadoDaPorta es = getEstadoDaPorta(i);
        es.getInteracoes().add(0, cmd);
        return es;
    }

    protected ComandoDslam getComandoSetProfileDown(InventarioRede i, Velocidades v) {
        return new ComandoDslam("update vdsl-co-config fastMaxTxRate=" + castProfile(v).getProfileDown() + " interleaveMaxTxRate=" + castProfile(v).getProfileDown() + " 1/" + i.getSlot() + "/" + i.getPorta() + "/0/vdsl");
    }

    @Override
    public Profile setProfileDown(InventarioRede i, Velocidades v) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoSetProfileDown(i, v));
        ComandoDslam cmd1 = getCd().consulta(getComandoSetProfileUp(i, v));
        Profile p = getProfile(i);
        p.getInteracoes().add(0, cmd1);
        p.getInteracoes().add(0, cmd);
        return p;
    }

    protected ComandoDslam getComandoSetProfileUp(InventarioRede i, Velocidades v) {
        return new ComandoDslam("update vdsl-cpe-config fastMaxTxRate=" + castProfile(v).getProfileUp() + " interleaveMaxTxRate=" + castProfile(v).getProfileUp() + " 1/" + i.getSlot() + "/" + i.getPorta() + "/0/vdsl");
    }

    @Override
    public Profile setProfileUp(InventarioRede i, Velocidades vDown, Velocidades vUp) throws Exception {
        return setProfileDown(i, vDown);
    }

    protected ComandoDslam getComandoCreateVlanBanda(InventarioRede i) {
        return new ComandoDslam("bridge add 1-" + i.getSlot() + "-" + i.getPorta() + "-0/vdsl vc 0/35 downlink vlan 600 xlate-to " + i.getCvlan() + " slan " + i.getRin() + " tagged",3000);
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
        return new ComandoDslam("bridge add 1-" + i.getSlot() + "-" + i.getPorta() + "-0/vdsl vc 0/36 downlink vlan 601 xlate-to " + i.getCvlan() + " slan " + i.getVlanVoip() + " tagged");
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
        return new ComandoDslam("bridge add 1-" + i.getSlot() + "-" + i.getPorta() + "-0/vdsl vc 0/37 downlink vlan 602 xlate-to " + i.getCvlan() + " slan " + i.getVlanVod() + " tagged");
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
        return new ComandoDslam("bridge add 1-" + i.getSlot() + "-" + i.getPorta() + "-0/vdsl vc 0/38 downlink vlan 4000 tagged cos 4 outcosall 4");
    }

    @Override
    public VlanMulticast createVlanMulticast(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoCreateVlanMulticast(i));
        VlanMulticast v = getVlanMulticast(i);
        v.getInteracoes().add(0, cmd);
        return v;
    }

    protected ComandoDslam getComandoDeleteVlanBanda(InventarioRede i) {
        return new ComandoDslam("bridge delete 1-" + i.getSlot() + "-" + i.getPorta() + "-0/vdsl vc 0/35 vlan " + i.getCvlan() + " slan " + i.getRin());
    }

    @Override
    public VlanBanda deleteVlanBanda(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoDeleteVlanBanda(i));
        vlanBanda = null;
        getVlanBanda(i);
        vlanBanda.getInteracoes().add(0, cmd);
        return vlanBanda;
    }

    protected ComandoDslam getComandoDeleteVlanVoip(InventarioRede i) {
        return new ComandoDslam("bridge delete 1-" + i.getSlot() + "-" + i.getPorta() + "-0/vdsl vc 0/36 vlan " + i.getCvlan() + " slan " + i.getVlanVoip());
    }

    @Override
    public VlanVoip deleteVlanVoip(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoDeleteVlanVoip(i));
        vlanVoip = null;
        getVlanVoip(i);
        vlanVoip.getInteracoes().add(0, cmd);
        return vlanVoip;
    }

    protected ComandoDslam getComandoDeleteVlanVod(InventarioRede i) {
        return new ComandoDslam("bridge delete 1-" + i.getSlot() + "-" + i.getPorta() + "-0/vdsl vc 0/37 vlan " + i.getCvlan() + " slan " + i.getVlanVod());
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
        return new ComandoDslam("bridge delete 1-" + i.getSlot() + "-" + i.getPorta() + "-0/vdsl vc 0/38 vlan " + i.getVlanMulticast());
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
    public TabelaRedeMetalico resetTabelaRede(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoResetTabelaRede(i));
        tabRede = null;
        getTabelaRede(i);
        tabRede.getInteracoes().add(0, cmd);
        return tabRede;
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
        if (mac==null || mac.getMac().isEmpty()) {
            setVlans(i);
        }
        return mac;
    }

}
