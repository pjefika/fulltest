/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.metalico.keymile;

import br.net.gvt.efika.efika_customer.model.customer.InventarioRede;
import br.net.gvt.efika.fulltest.model.telecom.properties.DeviceMAC;
import br.net.gvt.efika.fulltest.model.telecom.properties.EnumEstadoVlan;
import br.net.gvt.efika.fulltest.model.telecom.properties.Profile;
import br.net.gvt.efika.fulltest.model.telecom.properties.ProfileMetalico;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanBanda;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanMulticast;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanVod;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanVoip;
import br.net.gvt.efika.fulltest.model.telecom.properties.metalico.Modulacao;
import br.net.gvt.efika.fulltest.model.telecom.properties.metalico.TabelaParametrosMetalico;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.Modulacoes;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.VelocidadeVendor;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.Velocidades;
import dao.dslam.impl.ComandoDslam;
import dao.dslam.impl.ConsultaDslamVivo2;
import dao.dslam.impl.retorno.TratativaRetornoUtil;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G0042204
 */
public abstract class KeymileMetalicoSuadDslam extends KeymileMetalicoDslam {

    public KeymileMetalicoSuadDslam(String ipDslam) {
        super(ipDslam);
        this.setCd(new ConsultaDslamVivo2(this));
    }

    @Override
    public TabelaParametrosMetalico getTabelaParametros(InventarioRede i) throws Exception {
        List<String> velSinc = this.getCd().consulta(this.getVelSinc(i)).getRetorno();
        List<String> atn = this.getCd().consulta(this.getAtn(i)).getRetorno();
        List<String> snr = this.getCd().consulta(this.getSnr(i)).getRetorno();
        List<String> att = getCd().consulta(getAttainableRate(i)).getRetorno();

        TabelaParametrosMetalico tabParam = new TabelaParametrosMetalico();
        try {
            tabParam.setVelSincDown(new Double(TratativaRetornoUtil.tratKeymile(velSinc, "CurrentRate")));
            tabParam.setVelSincUp(new Double(TratativaRetornoUtil.tratKeymile(velSinc, "CurrentRate", 2)));
            tabParam.setSnrDown(new Double(TratativaRetornoUtil.tratKeymile(snr, "Downstream")));
            tabParam.setSnrUp(new Double(TratativaRetornoUtil.tratKeymile(snr, "Upstream")));
            tabParam.setAtnDown(new Double(TratativaRetornoUtil.tratKeymile(atn, "Downstream")));
            tabParam.setAtnUp(new Double(TratativaRetornoUtil.tratKeymile(atn, "Upstream")));
            tabParam.setVelMaxDown(new Double(TratativaRetornoUtil.tratKeymile(att, "Downstream")));
            tabParam.setVelMaxUp(new Double(TratativaRetornoUtil.tratKeymile(att, "Upstream")));
        } catch (Exception e) {
            tabParam.setVelSincDown(new Double("0"));
            tabParam.setVelSincUp(new Double("0"));
            tabParam.setSnrDown(new Double("0"));
            tabParam.setSnrUp(new Double("0"));
            tabParam.setAtnDown(new Double("0"));
            tabParam.setAtnUp(new Double("0"));
        }

        return tabParam;
    }

    @Override
    public VlanBanda getVlanBanda(InventarioRede i) throws Exception {
        List<String> pegaSrvc = this.getCd().consulta(this.getSrvcBanda(i)).getRetorno();
        List<String> pegaStatus = this.getCd().consulta(this.getComandoGetSrvcStatus(i, 1)).getRetorno();
        String statusVlan = TratativaRetornoUtil.tratKeymile(pegaStatus, "MACSRCFilter");
        String leSrvc = TratativaRetornoUtil.tratKeymile(pegaSrvc, "ServicesCurrentConnected").replace("\"", "").replace(";", "");
        Integer sVlan = new Integer("0");
        Integer Cvlan = new Integer("0");
        EnumEstadoVlan state;
        if (!leSrvc.contentEquals("no service connected")) {
            List<String> pegaVlan = this.getCd().consulta(this.getComandoConsultaVlan(leSrvc)).getRetorno();
            sVlan = new Integer(TratativaRetornoUtil.tratKeymile(pegaVlan, "Svid"));
            Cvlan = new Integer(TratativaRetornoUtil.tratKeymile(pegaVlan, "CVID"));
        }
        if (statusVlan.equalsIgnoreCase("None")) {
            state = EnumEstadoVlan.UP;
        } else if (statusVlan.equalsIgnoreCase("List")) {
            state = EnumEstadoVlan.DOWN;
        } else {
            state = EnumEstadoVlan.FLOODINGPREVENTION;
        }

        VlanBanda vlanBanda = new VlanBanda(Cvlan, sVlan, state);

        return vlanBanda;
    }

    @Override
    public VlanVoip getVlanVoip(InventarioRede i) throws Exception {
        List<String> pegaSrvc = this.getCd().consulta(this.getSrvcVoip(i)).getRetorno();
        List<String> pegaStatus = this.getCd().consulta(this.getComandoGetSrvcStatus(i, 2)).getRetorno();
        String statusVlan = TratativaRetornoUtil.tratKeymile(pegaStatus, "MACSRCFilter");
        String leSrvc = TratativaRetornoUtil.tratKeymile(pegaSrvc, "ServicesCurrentConnected").replace("\"", "").replace(";", "");
        Integer sVlan = new Integer("0");
        Integer Cvlan = new Integer("0");
        EnumEstadoVlan state;
        if (!leSrvc.contentEquals("no service connected")) {
            List<String> pegaVlan = this.getCd().consulta(this.getComandoConsultaVlan(leSrvc)).getRetorno();
            sVlan = new Integer(TratativaRetornoUtil.tratKeymile(pegaVlan, "Svid"));
            Cvlan = new Integer(TratativaRetornoUtil.tratKeymile(pegaVlan, "CVID"));
        }
        if (statusVlan.equalsIgnoreCase("None")) {
            state = EnumEstadoVlan.UP;
        } else if (statusVlan.equalsIgnoreCase("List")) {
            state = EnumEstadoVlan.DOWN;
        } else {
            state = EnumEstadoVlan.FLOODINGPREVENTION;
        }
        VlanVoip vlanVoip = new VlanVoip(Cvlan, sVlan, state);

        return vlanVoip;
    }

    @Override
    public VlanVod getVlanVod(InventarioRede i) throws Exception {
        List<String> pegaSrvc = this.getCd().consulta(this.getSrvcVod(i)).getRetorno();
        List<String> pegaStatus = this.getCd().consulta(this.getComandoGetSrvcStatus(i, 3)).getRetorno();
        List<String> pegaStatistics = this.getCd().consulta(this.getComandoGetVlanVodPm(i)).getRetorno();

        String statusVlan = TratativaRetornoUtil.tratKeymile(pegaStatus, "MACSRCFilter");
        String leSrvc = TratativaRetornoUtil.tratKeymile(pegaSrvc, "ServicesCurrentConnected").replace("\"", "").replace(";", "");
        Integer sVlan = new Integer("0");
        Integer Cvlan = new Integer("0");
        EnumEstadoVlan state;

        if (!leSrvc.contentEquals("no service connected")) {
            List<String> pegaVlan = this.getCd().consulta(this.getComandoConsultaVlan(leSrvc)).getRetorno();
            sVlan = new Integer(TratativaRetornoUtil.tratKeymile(pegaVlan, "Svid"));
            Cvlan = new Integer(TratativaRetornoUtil.tratKeymile(pegaVlan, "CVID"));
        }
        if (statusVlan.equalsIgnoreCase("None")) {
            state = EnumEstadoVlan.UP;
        } else if (statusVlan.equalsIgnoreCase("List")) {
            state = EnumEstadoVlan.DOWN;
        } else {
            state = EnumEstadoVlan.FLOODINGPREVENTION;
        }
        VlanVod vlanVod = new VlanVod(Cvlan, sVlan, state);
        vlanVod.setPctDown(new Integer(TratativaRetornoUtil.tratKeymile(pegaStatistics, "Value", 3)));
        vlanVod.setPctUp(new Integer(TratativaRetornoUtil.tratKeymile(pegaStatistics, "Value", 5)));

        return vlanVod;
    }

    @Override
    public VlanMulticast getVlanMulticast(InventarioRede i) throws Exception {
        List<String> pegaSrvc = this.getCd().consulta(this.getSrvcMult(i)).getRetorno();
        List<String> pegaStatus = this.getCd().consulta(this.getComandoGetSrvcStatus(i, 4)).getRetorno();
        List<String> pegaStatistics = this.getCd().consulta(this.getComandoGetVlanMulticastPm(i)).getRetorno();
        List<String> pegaIpIgmp = this.getCd().consulta(this.getComandoGetIpIgmp()).getRetorno();

        String statusVlan = TratativaRetornoUtil.tratKeymile(pegaStatus, "MACSRCFilter");
        String leSrvc = TratativaRetornoUtil.tratKeymile(pegaSrvc, "ServicesCurrentConnected").replace("\"", "").replace(";", "");
        Integer svlan = new Integer("0");
        EnumEstadoVlan state;
        if (!leSrvc.contentEquals("no service connected")) {
            List<String> pegaVlan = this.getCd().consulta(this.getComandoConsultaVlan(leSrvc)).getRetorno();
            svlan = new Integer(TratativaRetornoUtil.tratKeymile(pegaVlan, "McastVID"));
        }
        if (statusVlan.equalsIgnoreCase("None")) {
            state = EnumEstadoVlan.UP;
        } else if (statusVlan.equalsIgnoreCase("List")) {
            state = EnumEstadoVlan.DOWN;
        } else {
            state = EnumEstadoVlan.FLOODINGPREVENTION;
        }

        VlanMulticast vlanMult = new VlanMulticast(0, svlan, state);
        vlanMult.setPctDown(new Integer(TratativaRetornoUtil.tratKeymile(pegaStatistics, "Value", 3)));
        vlanMult.setPctUp(new Integer(TratativaRetornoUtil.tratKeymile(pegaStatistics, "Value", 5)));
        vlanMult.setIpIgmp(TratativaRetornoUtil.tratKeymile(pegaIpIgmp, "LocalIpAddressForIgmpGeneration"));

        return vlanMult;
    }

    @Override
    public void resetIptvStatistics(InventarioRede i) throws Exception {
        getCd().consulta(getComandoResetMulticastStatistics(i));
        getCd().consulta(getComandoResetVodStatistics(i));
    }

    @Override
    public Profile getProfile(InventarioRede i) throws Exception {
        List<String> pegaProfile = this.getCd().consulta(this.getProf(i)).getRetorno();
        String first = TratativaRetornoUtil.tratKeymile(pegaProfile, "Name");
        List<String> leProf = TratativaRetornoUtil.numberFromString(first);

        Profile prof = new ProfileMetalico();
        prof.setProfileDown(leProf.get(0));
        prof.setProfileUp(leProf.get(1));

        prof.setDown(compare(first, Boolean.TRUE));
        prof.setUp(compare(first, Boolean.FALSE));

        return prof;
    }

    @Override
    public Modulacao getModulacao(InventarioRede i) throws Exception {
        List<String> pegaModul = this.getCd().consulta(this.getModul(i)).getRetorno();
        String modul = TratativaRetornoUtil.tratKeymile(pegaModul, "Name");

        Modulacao m = new Modulacao();
        m.setModulacao(modul);
        m.setModulEnum(compare(modul));

        return m;
    }

    @Override
    public void setProfileDown(InventarioRede i, Velocidades v) throws Exception {
        String leSet = getCd().consulta(getComandoSetProfileSUAD1(i, v)).getBlob();
        List<String> leResp = new ArrayList<>();
        if (leSet.contains("previously") || leSet.contains("is not compatible")) {
            leResp = getCd().consulta(getComandoSetProfileDefault(i, v)).getRetorno();
        } else {
            String[] parser = leSet.split("\\n");
            for (String string : parser) {
                leResp.add(string);
            }
        }
        for (String string : leResp) {
            System.out.println(string);
        }
    }

    @Override
    public void setProfileUp(InventarioRede i, Velocidades vDown, Velocidades vUp) throws Exception {
        setProfileDown(i, vDown);
    }

    @Override
    public Modulacao setModulacao(InventarioRede i, Velocidades v) throws Exception {
        String leSet = getCd().consulta(setModulSUAD1(i, v)).getBlob();
        List<String> leResp = new ArrayList<>();
        if (leSet.contains("previously") || leSet.contains("is not compatible")) {
            leResp = getCd().consulta(setModulDefault(i, v)).getRetorno();
        } else {
            String[] parser = leSet.split("\\n");
            for (String string : parser) {
                leResp.add(string);
            }
        }
        for (String string : leResp) {
            System.out.println(string);
        }

        return getModulacao(i);
    }

    @Override
    public VlanBanda createVlanBanda(InventarioRede i, Velocidades vDown, Velocidades vUp) throws Exception {
        List<String> leResp = getCd().consulta(getComandoCreateVlanBanda(i)).getRetorno();
        getCd().consulta(getComandoSetMacSourceFilteringMode(i, 1, "none"));
        for (String string : leResp) {
            System.out.println(string);
        }
        return getVlanBanda(i);
    }

    @Override
    public VlanVoip createVlanVoip(InventarioRede i) throws Exception {
        List<String> leResp = getCd().consulta(getComandoCreateVlanVoip(i)).getRetorno();
        getCd().consulta(getComandoSetMacSourceFilteringMode(i, 2, "none"));
        for (String string : leResp) {
            System.out.println(string);
        }
        return getVlanVoip(i);
    }

    @Override
    public VlanVod createVlanVod(InventarioRede i) throws Exception {
        List<String> leResp = getCd().consulta(getComandoCreateVlanVod(i)).getRetorno();
        getCd().consulta(getComandoSetMacSourceFilteringMode(i, 3, "none"));

        for (String string : leResp) {
            System.out.println(string);
        }
        return getVlanVod(i);
    }

    @Override
    public VlanMulticast createVlanMulticast(InventarioRede i) throws Exception {
        List<String> leResp = getCd().consulta(getComandoCreateVlanMulticast(i)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
        return getVlanMulticast(i);
    }

    @Override
    public void deleteVlanBanda(InventarioRede i) throws Exception {
        /**
         * Try adicionado para casos em que o vlan não exista
         */
        try {
            List<String> pegaSrvc = getCd().consulta(getComandoGetSrvc(i, "1")).getRetorno();
            List<String> leSrvc = TratativaRetornoUtil.numberFromString(TratativaRetornoUtil.tratKeymile(pegaSrvc, "ServicesCurrentConnected"));
            String srvc = leSrvc.get(leSrvc.size() - 1).replace("-", "");
            List<String> leResp = getCd().consulta(getComandoDeleteVlan(srvc)).getRetorno();
            leResp.forEach((string) -> {
                System.out.println(string);
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteVlanVoip(InventarioRede i) throws Exception {
        try {
            List<String> pegaSrvc = getCd().consulta(getComandoGetSrvc(i, "2")).getRetorno();
            List<String> leSrvc = TratativaRetornoUtil.numberFromString(TratativaRetornoUtil.tratKeymile(pegaSrvc, "ServicesCurrentConnected"));
            String srvc = leSrvc.get(leSrvc.size() - 1).replace("-", "");
            List<String> leResp = getCd().consulta(getComandoDeleteVlan(srvc)).getRetorno();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteVlanVod(InventarioRede i) throws Exception {
        try {
            List<String> pegaSrvc = getCd().consulta(getComandoGetSrvc(i, "3")).getRetorno();
            List<String> leSrvc = TratativaRetornoUtil.numberFromString(TratativaRetornoUtil.tratKeymile(pegaSrvc, "ServicesCurrentConnected"));
            String srvc = leSrvc.get(leSrvc.size() - 1).replace("-", "");
            List<String> leResp = getCd().consulta(getComandoDeleteVlan(srvc)).getRetorno();
            for (String string : leResp) {
                System.out.println(string);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteVlanMulticast(InventarioRede i) throws Exception {
        List<String> pegaSrvc = getCd().consulta(getComandoGetSrvc(i, "4")).getRetorno();
        List<String> leSrvc = TratativaRetornoUtil.numberFromString(TratativaRetornoUtil.tratKeymile(pegaSrvc, "ServicesCurrentConnected"));
        String srvc = leSrvc.get(leSrvc.size() - 1).replace("-", "");
        List<String> leResp = getCd().consulta(getComandoDeleteMulticast(srvc)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
    }

    @Override
    public DeviceMAC getDeviceMac(InventarioRede i) throws Exception {
        getCd().consulta(getComandoGetDeviceMAC(i));
        String macValue = "";
        for (int j = 0; j < 5; j++) {
            Thread.sleep(3000);
            macValue = TratativaRetornoUtil.tratKeymile(getCd().consulta(getComandoGetDeviceMAC1(i)).getRetorno(), "MacAddress");
            if (!macValue.contains("Parâmetro não encontrado")) {

                break;
            }
        }
        getCd().consulta(getComandoGetDeviceMAC2(i));
        String comDoisPontos = "";
        try {
            comDoisPontos = macValue.substring(0, 2) + ":" + macValue.substring(2, 4) + ":" + macValue.substring(4, 6) + ":" + macValue.substring(6, 8)
                    + ":" + macValue.substring(8, 10) + ":" + macValue.substring(10, 12);
        } catch (Exception e) {
        }
        String leMac = comDoisPontos.isEmpty() ? macValue : comDoisPontos;
        return new DeviceMAC(leMac);
    }

    protected ComandoDslam getComandoGetDeviceMAC(InventarioRede i) {
        return new ComandoDslam("set /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/vcc-1/cfgm/macsourcefilteringmode floodingprevention");
    }

    protected ComandoDslam getComandoGetDeviceMAC1(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/status/one2onemacforwardinglist", 3000);
    }

    protected ComandoDslam getComandoGetDeviceMAC2(InventarioRede i) {
        return new ComandoDslam("set /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/vcc-1/cfgm/macsourcefilteringmode none");
    }

    protected ComandoDslam getComandoSetProfileDefault(InventarioRede i, Velocidades vDown) {
        return new ComandoDslam("set /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/cfgm/profilename " + compare(vDown, Boolean.TRUE).getSintaxVel());
    }

    protected ComandoDslam getComandoSetProfileSUAD1(InventarioRede i, Velocidades vDown) {
        return new ComandoDslam("set /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/cfgm/profilename " + compare(vDown, Boolean.TRUE).getSintaxVel() + "_SUAD1");
    }

    protected ComandoDslam getVelSinc(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/status/status");
    }

    protected ComandoDslam getAtn(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/status/attenuation");
    }

    protected ComandoDslam getSnr(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/status/snrmargin");
    }

    protected ComandoDslam getSrvcBanda(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/vcc-1/status/servicestatus");
    }

    protected ComandoDslam getSrvcVoip(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/vcc-2/status/servicestatus");
    }

    protected ComandoDslam getSrvcVod(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/vcc-3/status/servicestatus");
    }

    protected ComandoDslam getSrvcMult(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/vcc-4/status/ServiceStatus");
    }

    protected ComandoDslam getProf(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/cfgm/profilename");
    }

    protected ComandoDslam getModul(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/cfgm/portprofile");
    }

    protected ComandoDslam setModulDefault(InventarioRede i, Velocidades v) {
        return new ComandoDslam("set /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/cfgm/portprofile " + compare(v, Boolean.TRUE).getSintaxMod());
    }

    protected ComandoDslam setModulSUAD1(InventarioRede i, Velocidades v) {
        return new ComandoDslam("set /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/cfgm/portprofile " + compare(v, Boolean.TRUE).getSintaxMod() + "1");
    }

    protected ComandoDslam getComandoSetMacSourceFilteringMode(InventarioRede i, Integer intrf, String mode) {
        return new ComandoDslam("set /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/vcc-" + intrf + "/cfgm/macsourcefilteringmode " + mode);
    }

    protected ComandoDslam getComandoCreateVlanBanda(InventarioRede i) {
        return new ComandoDslam("cd /services/packet/1to1doubletag/cfgm", 1000,
                "createservice /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/vcc-1 " + i.getCvlan() + " cos0 " + i.getRin() + " cos0 add");
    }

    protected ComandoDslam getComandoCreateVlanVoip(InventarioRede i) {
        return new ComandoDslam("cd /services/packet/1to1doubletag/cfgm", 1000,
                "createservice /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/vcc-2 " + i.getCvlan() + " cos5 " + i.getVlanVoip() + " cos5 add");
    }

    protected ComandoDslam getComandoCreateVlanVod(InventarioRede i) {
        return new ComandoDslam("cd /services/packet/1to1doubletag/cfgm", 1000,
                "createservice /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/vcc-3 " + i.getCvlan() + " cos3 " + i.getVlanVod() + " cos3 add");
    }

    protected ComandoDslam getComandoCreateVlanMulticast(InventarioRede i) {
        return new ComandoDslam("cd /services/packet/mcast/cfgm", 1000,
                "createservice /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/vcc-4 {4000}");
    }

    protected ComandoDslam getComandoGetSrvc(InventarioRede i, String intrf) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/vcc-" + intrf + "/status/ServiceStatus");
    }

    protected ComandoDslam getComandoGetSrvcStatus(InventarioRede i, Integer intrf) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/vcc-" + intrf + "/cfgm/macsourcefilteringmode");
    }

    protected ComandoDslam getComandoDeleteVlan(String srvc) {
        return new ComandoDslam("cd /services/packet/1to1doubletag/cfgm/", 500, "deleteservice " + srvc);
    }

    protected ComandoDslam getComandoDeleteMulticast(String srvc) {
        return new ComandoDslam("cd /services/packet/mcast/cfgm/", 500, "deleteservice " + srvc);
    }

    protected ComandoDslam getComandoGetVlanVodPm(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/vcc-3/pm/usercountertable", 3000);
    }

    protected ComandoDslam getComandoGetVlanMulticastPm(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/vcc-4/pm/usercountertable", 3000);
    }

    protected ComandoDslam getComandoResetVodStatistics(InventarioRede i) {
        return new ComandoDslam("cd /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/vcc-3/pm\nusercounterreset");
    }

    protected ComandoDslam getComandoResetMulticastStatistics(InventarioRede i) {
        return new ComandoDslam("cd /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/vcc-4/pm\nusercounterreset");
    }

    @Override
    public List<VelocidadeVendor> obterVelocidadesDownVendor() {
        if (velsDown.isEmpty()) {
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_3072, "HSI_3Mb_1Mb", "ADSL2PLUS_AUTO_SUAD", Modulacoes.AUTO_NEGOTIATE));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_5120, "HSI_5Mb_1Mb", "ADSL2PLUS_AUTO_SUAD", Modulacoes.AUTO_NEGOTIATE));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_10240, "HSI_10Mb_1Mb", "ADSL2PLUS_ONLY_SUAD", Modulacoes.ADSL));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_15360, "HSI_15Mb_1Mb", "ADSL2PLUS_ONLY_SUAD", Modulacoes.ADSL));
        }

        return velsDown;
    }

    @Override
    public List<VelocidadeVendor> obterVelocidadesUpVendor() {
        if (velsUp.isEmpty()) {
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_1024, "HSI_3Mb_1Mb"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_1024, "HSI_5Mb_1Mb"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_1024, "HSI_10Mb_1Mb"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_1024, "HSI_15Mb_1Mb"));
        }

        return velsUp;
    }

//    @Override
    public Profile castProfile(Velocidades v) {
        Profile p = new ProfileMetalico();
        p.setProfileDown("HSI_" + v.getVel() + "Mb_1Mb");
        p.setProfileUp("HSI_" + v.getVel() + "Mb_1Mb_SUAD1");
        return p;
    }

//    @Override
    public Modulacao castModulacao(Velocidades v) {
        Modulacao m = new Modulacao();

        Double leVel = new Double(v.getVel());
        Double autoLimit = 5d;
        Boolean isAdsl2Plus = leVel.compareTo(autoLimit) > 0;
        String leModul = isAdsl2Plus ? "ADSL2PLUS_ONLY_SUAD" : "ADSL2PLUS_AUTO_SUAD";
        m.setModulacao(leModul);

        return m;
    }

}