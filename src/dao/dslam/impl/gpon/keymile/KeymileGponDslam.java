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

/**
 *
 * @author G0042204
 */
public class KeymileGponDslam extends DslamGpon {

    public KeymileGponDslam(String ipDslam) {
        super(ipDslam, Credencial.KEYMILE, new LoginRapido());
    }

    public ComandoDslam getComandoPotOlt(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/status/olt");
    }

    public ComandoDslam getComandoPotOnt(InventarioRede i) {
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

    public ComandoDslam getComandoSerialOnt(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/cfgm/onuCfgTable");
    }

    @Override
    public SerialOntGpon getSerialOnt(InventarioRede i) throws Exception {
        List<String> serOnt = this.getCd().consulta(this.getComandoSerialOnt(i)).getRetorno();
        String sernum = TratativaRetornoUtil.tratKeymile(serOnt, "SerialNumber").replace("\"", "");

        SerialOntGpon ont = new SerialOntGpon();
        ont.setSerial(sernum);

        System.out.println(ont.getSerial());
        return ont;
    }

    public ComandoDslam getComandoConsultaEstadoAdminDaPorta(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/main/AdministrativeStatus");
    }

    public ComandoDslam getComandoConsultaEstadoOperDaPorta(InventarioRede i) {
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

    public ComandoDslam getComandoConsultaVlanVoip1(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/port-1/interface-2/status/ServiceStatus");
    }

    public ComandoDslam getComandoConsultaStatusVlanVoip(InventarioRede i) {
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

    public ComandoDslam getComandoConsultaVlanVod1(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/port-1/interface-3/status/ServiceStatus");
    }

    public ComandoDslam getComandoConsultaStatusVlanVod(InventarioRede i) {
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

    public ComandoDslam getComandoConsultaVlanMulticast1(InventarioRede i) {
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

        vlanMult.setCvlan(cvlan);

        System.out.println(vlanMult.getSvlan());

        return vlanMult;
    }

    public ComandoDslam getComandoConsultaAlarmes(InventarioRede i) {
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

    public ComandoDslam getComandoConsultaProfileUp(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/cfgm/onuCfgTable");
    }

    public ComandoDslam getComandoConsultaProfileDown(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/port-1/interface-1/cfgm/IfRateLimiting");
    }

    @Override
    public Profile getProfile(InventarioRede i) throws Exception {
        List<String> profileUpResp = this.getCd().consulta(this.getComandoConsultaProfileUp(i)).getRetorno();
        String profUpIndex = TratativaRetornoUtil.tratKeymile(profileUpResp, "TcontVirtualPortBindingProfileIndex");
        String profileUp = TratativaRetornoUtil.upProfileNameKeymile(new Integer(profUpIndex));

        List<String> profileDownResp = this.getCd().consulta(this.getComandoConsultaProfileDown(i)).getRetorno();
        String profileDown = TratativaRetornoUtil.tratKeymile(profileDownResp, "Name", 2);

        Profile prof = new Profile();
        prof.setProfileUp(profileUp);
        prof.setProfileDown(profileDown);

        System.out.println(prof.getProfileDown());
        System.out.println(prof.getProfileUp());
        return prof;
    }

    public ComandoDslam getComandoConsultaOnuTable(InventarioRede i) {
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

}
