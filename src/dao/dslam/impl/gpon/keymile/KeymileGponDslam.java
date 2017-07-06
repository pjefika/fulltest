/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.gpon.keymile;

import br.net.gvt.efika.customer.InventarioRede;
import dao.dslam.impl.ComandoDslam;
import dao.dslam.impl.gpon.DslamGpon;
import dao.dslam.impl.login.LoginRapido;
import dao.dslam.impl.retorno.TratativaRetornoUtil;
import java.util.ArrayList;
import java.util.List;
import model.EnumEstadoVlan;
import model.dslam.consulta.DeviceMAC;
import model.dslam.consulta.EstadoDaPorta;
import model.dslam.consulta.Profile;
import model.dslam.consulta.VlanBanda;
import model.dslam.consulta.VlanMulticast;
import model.dslam.consulta.VlanVod;
import model.dslam.consulta.VlanVoip;
import model.dslam.consulta.gpon.AlarmesGpon;
import model.dslam.consulta.gpon.SerialOntGpon;
import model.dslam.consulta.gpon.TabelaParametrosGpon;
import model.dslam.credencial.Credencial;
import model.dslam.velocidade.Velocidades;

/**
 *
 * @author G0042204
 */
public class KeymileGponDslam extends DslamGpon {

    public KeymileGponDslam(String ipDslam) {
        super(ipDslam, Credencial.KEYMILE, new LoginRapido());
    }

    protected ComandoDslam getComandoPotOlt(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/status/olt");
    }

    protected ComandoDslam getComandoPotOnt(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/status/ont");
    }

    @Override
    public TabelaParametrosGpon getTabelaParametros(InventarioRede i) throws Exception {
        List<String> retOlt = this.getCd().consulta(this.getComandoPotOlt(i)).getRetorno();
        List<String> retOnt = this.getCd().consulta(this.getComandoPotOnt(i)).getRetorno();

        TabelaParametrosGpon tabParam = new TabelaParametrosGpon();
        tabParam.setPotOlt(new Double(TratativaRetornoUtil.tratKeymile(retOlt, "rxInputPower")));
        tabParam.setPotOnt(new Double(TratativaRetornoUtil.tratKeymile(retOnt, "rxInputPower")));

        System.out.println(tabParam.getPotOlt());
        System.out.println(tabParam.getPotOnt());

        return tabParam;
    }

    protected ComandoDslam getComandoSerialOnt(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/cfgm/onuCfgTable");
    }

    @Override
    public SerialOntGpon getSerialOnt(InventarioRede i) throws Exception {
        List<String> serOnt = this.getCd().consulta(this.getComandoSerialOnt(i)).getRetorno();
        String sernum = TratativaRetornoUtil.tratKeymile(serOnt, "SerialNumber").replace("\"", "");

        if(sernum.contains("ABCD00")){
            sernum = "";
        }
        
        SerialOntGpon ont = new SerialOntGpon();
        ont.setSerial(sernum);

        System.out.println(ont.getSerial());
        return ont;
    }

    protected ComandoDslam getComandoConsultaEstadoAdminDaPorta(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/main/AdministrativeStatus");
    }

    protected ComandoDslam getComandoConsultaEstadoOperDaPorta(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/port-1/main/OperationalStatus");
    }

    @Override
    public EstadoDaPorta getEstadoDaPorta(InventarioRede i) throws Exception {
        List<String> admin = this.getCd().consulta(this.getComandoConsultaEstadoAdminDaPorta(i)).getRetorno();
        List<String> oper = this.getCd().consulta(this.getComandoConsultaEstadoOperDaPorta(i)).getRetorno();

        String adminState = TratativaRetornoUtil.tratKeymile(admin, "State");
        String operState = TratativaRetornoUtil.tratKeymile(oper, "State");

        EstadoDaPorta portState = new EstadoDaPorta();
        portState.setAdminState(adminState);
        portState.setOperState(operState);

        System.out.println(portState.getAdminState());
        System.out.println(portState.getOperState());
        return portState;
    }

    protected ComandoDslam getComandoConsultaVlanBanda1(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/port-1/interface-1/status/ServiceStatus");
    }

    protected ComandoDslam getComandoConsultaStatusVlanBanda(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/port-1/interface-1/cfgm/macsourcefilteringmode");
    }

    protected ComandoDslam getComandoConsultaVlan2(String srvc) {
        return new ComandoDslam("get /services/packet/" + srvc + "/cfgm/Service");
    }

    @Override
    public VlanBanda getVlanBanda(InventarioRede i) throws Exception {
        List<String> pegaSrvc = this.getCd().consulta(this.getComandoConsultaVlanBanda1(i)).getRetorno();
        List<String> pegaStatus = this.getCd().consulta(this.getComandoConsultaStatusVlanBanda(i)).getRetorno();
        String leStatus = TratativaRetornoUtil.tratKeymile(pegaStatus, "MACSRCFilter");
        String leSrvc = TratativaRetornoUtil.tratKeymile(pegaSrvc, "ServicesCurrentConnected").replace("\"", "").replace(";", "");
        Integer cvlan = new Integer("0");
        Integer p100 = new Integer("0");
        EnumEstadoVlan state;
        if (!leSrvc.contentEquals("no service connected")) {
            List<String> pegaVlan = this.getCd().consulta(this.getComandoConsultaVlan2(leSrvc)).getRetorno();
            cvlan = new Integer(TratativaRetornoUtil.tratKeymile(pegaVlan, "Svid"));
            p100 = new Integer(TratativaRetornoUtil.tratKeymile(pegaVlan, "CVID"));
        }
        if (leStatus.equalsIgnoreCase("None")) {
            state = EnumEstadoVlan.UP;
        } else if (leStatus.equalsIgnoreCase("List")) {
            state = EnumEstadoVlan.DOWN;
        } else {
            state = EnumEstadoVlan.FLOODINGPREVENTION;
        }
        VlanBanda vlanBanda = new VlanBanda(cvlan, p100, state);

        System.out.println(vlanBanda.getSvlan());
        System.out.println(vlanBanda.getCvlan());
        System.out.println(vlanBanda.getState().toString());

        return vlanBanda;
    }

    protected ComandoDslam getComandoConsultaVlanVoip1(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/port-1/interface-2/status/ServiceStatus");
    }

    protected ComandoDslam getComandoConsultaStatusVlanVoip(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/port-1/interface-2/cfgm/macsourcefilteringmode");
    }

    @Override
    public VlanVoip getVlanVoip(InventarioRede i) throws Exception {
        List<String> pegaSrvc = this.getCd().consulta(this.getComandoConsultaVlanVoip1(i)).getRetorno();
        List<String> pegaStatus = this.getCd().consulta(this.getComandoConsultaStatusVlanVoip(i)).getRetorno();
        String leStatus = TratativaRetornoUtil.tratKeymile(pegaStatus, "MACSRCFilter");
        String leSrvc = TratativaRetornoUtil.tratKeymile(pegaSrvc, "ServicesCurrentConnected").replace("\"", "").replace(";", "");

        EnumEstadoVlan state;
        Integer cvlan = new Integer("0");
        Integer p100 = new Integer("0");
        if (!leSrvc.contentEquals("no service connected")) {
            List<String> pegaVlan = this.getCd().consulta(this.getComandoConsultaVlan2(leSrvc)).getRetorno();
            cvlan = new Integer(TratativaRetornoUtil.tratKeymile(pegaVlan, "Svid"));
            p100 = new Integer(TratativaRetornoUtil.tratKeymile(pegaVlan, "CVID"));
        }
        if (leStatus.equalsIgnoreCase("None")) {
            state = EnumEstadoVlan.UP;
        } else if (leStatus.equalsIgnoreCase("List")) {
            state = EnumEstadoVlan.DOWN;
        } else {
            state = EnumEstadoVlan.FLOODINGPREVENTION;
        }

        VlanVoip vlanVoip = new VlanVoip(p100, cvlan, state);

        System.out.println(vlanVoip.getSvlan());
        System.out.println(vlanVoip.getCvlan());

        return vlanVoip;
    }

    protected ComandoDslam getComandoConsultaVlanVod1(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/port-1/interface-3/status/ServiceStatus");
    }

    protected ComandoDslam getComandoConsultaStatusVlanVod(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/port-1/interface-3/cfgm/macsourcefilteringmode");
    }

    @Override
    public VlanVod getVlanVod(InventarioRede i) throws Exception {
        List<String> pegaSrvc = this.getCd().consulta(this.getComandoConsultaVlanVod1(i)).getRetorno();
        List<String> pegaStatus = this.getCd().consulta(this.getComandoConsultaStatusVlanVod(i)).getRetorno();
        String leSrvc = TratativaRetornoUtil.tratKeymile(pegaSrvc, "ServicesCurrentConnected").replace("\"", "").replace(";", "");
        String leStatus = TratativaRetornoUtil.tratKeymile(pegaStatus, "MACSRCFilter");

        EnumEstadoVlan state;
        Integer cvlan = new Integer("0");
        Integer p100 = new Integer("0");
        if (!leSrvc.contentEquals("no service connected")) {
            List<String> pegaVlan = this.getCd().consulta(this.getComandoConsultaVlan2(leSrvc)).getRetorno();
            cvlan = new Integer(TratativaRetornoUtil.tratKeymile(pegaVlan, "Svid"));
            p100 = new Integer(TratativaRetornoUtil.tratKeymile(pegaVlan, "CVID"));
        }
        if (leStatus.equalsIgnoreCase("None")) {
            state = EnumEstadoVlan.UP;
        } else if (leStatus.equalsIgnoreCase("List")) {
            state = EnumEstadoVlan.DOWN;
        } else {
            state = EnumEstadoVlan.FLOODINGPREVENTION;
        }

        VlanVod vlanVod = new VlanVod(p100, cvlan, state);

        return vlanVod;
    }

    protected ComandoDslam getComandoConsultaVlanMulticast1(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/port-1/interface-4/status/ServiceStatus");
    }

    @Override
    public VlanMulticast getVlanMulticast(InventarioRede i) throws Exception {
        List<String> pegaSrvc = this.getCd().consulta(this.getComandoConsultaVlanMulticast1(i)).getRetorno();
        String leSrvc = TratativaRetornoUtil.tratKeymile(pegaSrvc, "ServicesCurrentConnected").replace("\"", "").replace(";", "");
        VlanMulticast vlanMult = new VlanMulticast();
        Integer cvlan = new Integer("0");
        if (!leSrvc.contentEquals("no service connected")) {
            List<String> pegaVlan = this.getCd().consulta(this.getComandoConsultaVlan2(leSrvc)).getRetorno();
            cvlan = new Integer(TratativaRetornoUtil.tratKeymile(pegaVlan, "McastVID"));
        }

        vlanMult.setSvlan(cvlan);

        System.out.println(vlanMult.getSvlan());

        return vlanMult;
    }

    protected ComandoDslam getComandoConsultaAlarmes(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/fm/alarmstatus");
    }

    @Override
    public AlarmesGpon getAlarmes(InventarioRede i) throws Exception {
        List<String> alarmesResp = this.getCd().consulta(this.getComandoConsultaAlarmes(i)).getRetorno();
        AlarmesGpon alarmes = new AlarmesGpon();
        Integer e;
        for (e = 0; e < alarmesResp.size(); e++) {
            String leLine = alarmesResp.get(e);
            if (leLine.contains(" FaultCauseState") && leLine.contains("On")) {
                String pegaNomeAlarme = alarmesResp.get(e - 1);
                String nomeAlarme = pegaNomeAlarme.substring(0, pegaNomeAlarme.indexOf("\\ #")).replace("\"", "").trim();
                alarmes.getListAlarmes().add(nomeAlarme);
            }
        }

        return alarmes;
    }

    protected ComandoDslam getComandoConsultaProfileUp(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/cfgm/onuCfgTable");
    }

    protected ComandoDslam getComandoConsultaProfileDown(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/port-1/interface-1/cfgm/IfRateLimiting");
    }

    @Override
    public Profile getProfile(InventarioRede i) throws Exception {
        List<String> profileUpResp = this.getCd().consulta(this.getComandoConsultaProfileUp(i)).getRetorno();
        String profUpIndex = TratativaRetornoUtil.tratKeymile(profileUpResp, "TcontVirtualPortBindingProfileIndex");
        String profileUp = TratativaRetornoUtil.upProfileNameKeymileGpon(new Integer(profUpIndex));

        List<String> profileDownResp = this.getCd().consulta(this.getComandoConsultaProfileDown(i)).getRetorno();
        String profileDown = TratativaRetornoUtil.tratKeymile(profileDownResp, "Name", 2);

        Profile prof = new Profile();
        prof.setProfileUp(profileUp);
        prof.setProfileDown(profileDown);

        System.out.println(prof.getProfileDown());
        System.out.println(prof.getProfileUp());
        return prof;
    }

    protected ComandoDslam getComandoConsultaOnuTable(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/status/onutablestatus");
    }

    @Override
    public DeviceMAC getDeviceMac(InventarioRede i) throws Exception {
        List<String> leTable = getCd().consulta(getComandoConsultaOnuTable(i)).getRetorno();
        String leMac = TratativaRetornoUtil.tratKeymile(leTable, "OnuMacAddress");
        String mac = leMac.substring(0, 2) + ":" + leMac.substring(2, 4) + ":" + leMac.substring(4, 6)
                + ":" + leMac.substring(6, 8) + ":" + leMac.substring(8, 10) + ":" + leMac.substring(10, 12);
        DeviceMAC dMac = new DeviceMAC(mac);

        return dMac;
    }

    protected ComandoDslam getComandoSetOntToOlt(InventarioRede i, SerialOntGpon s, String profileId) {
        return new ComandoDslam("set /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/cfgm/onuCfgTable "
                + "\"" + s.getSerial() + "\" \"0000\" false vlanId " + profileId + " false \"\" \"\" \"\" 1");
    }

    @Override
    public SerialOntGpon setOntToOlt(InventarioRede i, SerialOntGpon s) throws Exception {
        List<String> profileUpResp = this.getCd().consulta(this.getComandoConsultaProfileUp(i)).getRetorno();
        String profUpIndex = TratativaRetornoUtil.tratKeymile(profileUpResp, "TcontVirtualPortBindingProfileIndex");
        List<String> leResp = getCd().consulta(getComandoSetOntToOlt(i, s, profUpIndex)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
        return getSerialOnt(i);
    }

    protected ComandoDslam getComandoSetEstadoDaPorta(InventarioRede i, EstadoDaPorta e) {
        return new ComandoDslam("set /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/main/AdministrativeStatus " + e.getAdminState());
    }

    @Override
    public EstadoDaPorta setEstadoDaPorta(InventarioRede i, EstadoDaPorta e) throws Exception {
        List<String> leResp = getCd().consulta(getComandoSetEstadoDaPorta(i, e)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
        return getEstadoDaPorta(i);
    }
    
    protected ComandoDslam getComandoSetMacSourceFilteringMode(InventarioRede i, String intrf, String mode){
        return new ComandoDslam("set /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/port-1/interface-" + intrf + "/cfgm/macsourcefilteringmode "+mode);
    }

    protected ComandoDslam getComandoCreateVlanBanda(InventarioRede i) {
        return new ComandoDslam("cd /services/packet/1to1doubletag/cfgm", 1000,
                "createservice /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/port-1/interface-1 " + i.getCvLan() + " cos0 " + i.getRin() + " cos0 swap");
    }

    @Override
    public VlanBanda createVlanBanda(InventarioRede i, Velocidades vDown, Velocidades vUp) throws Exception {
        List<String> leResp = getCd().consulta(getComandoCreateVlanBanda(i)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
        List<String> leResp1 = getCd().consulta(getComandoSetMacSourceFilteringMode(i, "1", "none")).getRetorno();
        for (String string : leResp1) {
            System.out.println(string);
        }
        return getVlanBanda(i);
    }

    protected ComandoDslam getComandoCreateVlanVoip(InventarioRede i) {
        return new ComandoDslam("cd /services/packet/1to1doubletag/cfgm", 1000,
                "createservice /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/port-1/interface-2 " + i.getCvLan() + " cos3 " + i.getVlanVoip() + " cos3 swap");
    }

    @Override
    public VlanVoip createVlanVoip(InventarioRede i) throws Exception {
        List<String> leResp = getCd().consulta(getComandoCreateVlanVoip(i)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
        getCd().consulta(getComandoSetMacSourceFilteringMode(i, "2", "none"));
        return getVlanVoip(i);
    }

    protected ComandoDslam getComandoCreateVlanVod(InventarioRede i) {
        return new ComandoDslam("cd /services/packet/1to1doubletag/cfgm", 1000,
                "createservice /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/port-1/interface-3 " + i.getCvLan() + " cos5 " + i.getVlanVod() + " cos5 swap");
    }

    @Override
    public VlanVod createVlanVod(InventarioRede i) throws Exception {
        List<String> leResp = getCd().consulta(getComandoCreateVlanVod(i)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
        getCd().consulta(getComandoSetMacSourceFilteringMode(i, "3", "none"));
        return getVlanVod(i);
    }

    protected ComandoDslam getComandoCreateVlanMulticast(InventarioRede i) {
        return new ComandoDslam("cd /services/packet/mcast/cfgm", 1000,
                "createservice /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/port-1/interface-4 {4000}");
    }

    @Override
    public VlanMulticast createVlanMulticast(InventarioRede i) throws Exception {
        List<String> leResp = getCd().consulta(getComandoCreateVlanMulticast(i)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
        getCd().consulta(getComandoSetMacSourceFilteringMode(i, "4", "none"));
        return getVlanMulticast(i);
    }

    protected ComandoDslam getComandoUnsetOntFromOlt(InventarioRede i) {
        return new ComandoDslam("/unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/cfgm/DisassociateONT");
    }

    @Override
    public void unsetOntFromOlt(InventarioRede i) throws Exception {
        List<String> leResp = getCd().consulta(getComandoUnsetOntFromOlt(i)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
    }

    protected ComandoDslam getComandoGetSrvc(InventarioRede i, String intrf) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/port-1/interface-" + intrf + "/status/ServiceStatus");
    }

    protected ComandoDslam getComandoDeleteVlan(String srvc) {
        return new ComandoDslam("cd /services/packet/1to1doubletag/cfgm/", 500, "deleteservice " + srvc);
    }

    protected ComandoDslam getComandoDeleteMulticast(String srvc) {
        return new ComandoDslam("cd /services/packet/mcast/cfgm/", 500, "deleteservice " + srvc);
    }

    @Override
    public void deleteVlanBanda(InventarioRede i) throws Exception {
        List<String> pegaSrvc = getCd().consulta(getComandoGetSrvc(i, "1")).getRetorno();
        List<String> leSrvc = TratativaRetornoUtil.numberFromString(TratativaRetornoUtil.tratKeymile(pegaSrvc, "ServicesCurrentConnected"));
        String srvc = leSrvc.get(leSrvc.size() - 1).replace("-", "");
        List<String> leResp = getCd().consulta(getComandoDeleteVlan(srvc)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
    }

    @Override
    public void deleteVlanVoip(InventarioRede i) throws Exception {
        List<String> pegaSrvc = getCd().consulta(getComandoGetSrvc(i, "2")).getRetorno();
        List<String> leSrvc = TratativaRetornoUtil.numberFromString(TratativaRetornoUtil.tratKeymile(pegaSrvc, "ServicesCurrentConnected"));
        String srvc = leSrvc.get(leSrvc.size() - 1).replace("-", "");
        List<String> leResp = getCd().consulta(getComandoDeleteVlan(srvc)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
    }

    @Override
    public void deleteVlanVod(InventarioRede i) throws Exception {
        List<String> pegaSrvc = getCd().consulta(getComandoGetSrvc(i, "3")).getRetorno();
        List<String> leSrvc = TratativaRetornoUtil.numberFromString(TratativaRetornoUtil.tratKeymile(pegaSrvc, "ServicesCurrentConnected"));
        String srvc = leSrvc.get(leSrvc.size() - 1).replace("-", "");
        List<String> leResp = getCd().consulta(getComandoDeleteVlan(srvc)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
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

    protected ComandoDslam getComandoSetProfileDown(InventarioRede i, Velocidades v) {
        return new ComandoDslam("set /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/port-1/interface-1/cfgm/IfRateLimiting false default true " + castProfile(v).getProfileDown());
    }

    @Override
    public void setProfileDown(InventarioRede i, Velocidades v) throws Exception {
        List<String> leResp = getCd().consulta(getComandoSetProfileDown(i, v)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
//        return getProfile(i);
    }

    @Override
    public void setProfileUp(InventarioRede i, Velocidades vDown, Velocidades vUp) throws Exception {
        String profUpIndex = TratativaRetornoUtil.upProfileIdKeymileGpon(castProfile(vUp).getProfileUp());
        List<String> leResp = getCd().consulta(getComandoSetOntToOlt(i, getSerialOnt(i), profUpIndex)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
//        return getProfile(i);
    }

    @Override
    public Profile castProfile(Velocidades v) {
        Profile p = new Profile();
        p.setProfileDown("HSI_" + v.getVel() + "M_RETAIL_DOWN");
        p.setProfileUp("HSI_" + v.getVel() + "M_RETAIL_UP");
        return p;
    }
    
    protected ComandoDslam getComandoGetSlotsAvailableOnts(InventarioRede i){
        return new ComandoDslam("/unit-"+i.getSlot()+"/status/FlushOnuBlacklist", 3000, "get /unit-"+i.getSlot()+"/status/onuBlackListTable");
    }

    @Override
    public List<SerialOntGpon> getSlotsAvailableOnts(InventarioRede i) throws Exception {
        List<String> leResp = getCd().consulta(getComandoGetSlotsAvailableOnts(i)).getRetorno();
        Integer qntSerial = TratativaRetornoUtil.countStringOccurrence(leResp, "SerialNumber");
        List<SerialOntGpon> lSerial = new ArrayList<>();
        for(int e = 1; e<=qntSerial; e++){
            String leSerial = TratativaRetornoUtil.tratKeymile(leResp, "SerialNumber", e);
            SerialOntGpon s = new SerialOntGpon();
            s.setSerial(leSerial);
            lSerial.add(s);
        }
        
        return lSerial;
    }

}
