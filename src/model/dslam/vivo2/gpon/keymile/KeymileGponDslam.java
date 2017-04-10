/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.vivo2.gpon.keymile;

import dao.dslam.telnet.ComandoDslam;
import dao.dslam.telnet.ConsultaDslam;
import java.math.BigInteger;
import java.util.List;
import model.dslam.consulta.EstadoDaPorta;
import model.dslam.consulta.VlanBanda;
import model.dslam.consulta.VlanMulticast;
import model.dslam.consulta.VlanVod;
import model.dslam.consulta.VlanVoip;
import model.dslam.consulta.gpon.AlarmesGpon;
import model.dslam.consulta.Profile;
import model.dslam.consulta.gpon.SerialOntGpon;
import model.dslam.consulta.gpon.TabelaParametrosGpon;
import model.dslam.credencial.Credencial;
import model.dslam.login.LoginRapido;
import model.dslam.retorno.TratativaRetornoUtil;
import model.dslam.vivo2.gpon.DslamGpon;
import model.entity.Cliente;

/**
 *
 * @author G0042204
 */
public class KeymileGponDslam extends DslamGpon {

    private String srvc;

    public String getSrvc() {
        return srvc;
    }

    public void setSrvc(String srvc) {
        this.srvc = srvc;
    }

    public KeymileGponDslam() {
        this.setCredencial(Credencial.KEYMILE);
        this.setLoginStrategy(new LoginRapido());
        this.setCd(new ConsultaDslam(this));
    }

    public ComandoDslam getComandoPotOlt() {
        return new ComandoDslam("get /unit-" + this.getSlot() + "/odn-" + this.getPorta() + "/ont-" + this.getLogica() + "/status/olt");
    }

    public ComandoDslam getComandoPotOnt() {
        return new ComandoDslam("get /unit-" + this.getSlot() + "/odn-" + this.getPorta() + "/ont-" + this.getLogica() + "/status/ont");
    }

    @Override
    public TabelaParametrosGpon getTabelaParametros() throws Exception {
        List<String> retOlt = this.getCd().consulta(this.getComandoPotOlt()).getRetorno();
        List<String> retOnt = this.getCd().consulta(this.getComandoPotOnt()).getRetorno();

        TabelaParametrosGpon tabParam = new TabelaParametrosGpon();
        tabParam.setPotOlt(new Double(TratativaRetornoUtil.tratKeymile(retOlt, "rxInputPower")));
        tabParam.setPotOnt(new Double(TratativaRetornoUtil.tratKeymile(retOnt, "rxInputPower")));

        System.out.println(tabParam.getPotOlt());
        System.out.println(tabParam.getPotOnt());

        return tabParam;
    }

    @Override
    public Cliente consultar(Cliente c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ComandoDslam getComandoSerialOnt() {
        return new ComandoDslam("get /unit-" + this.getSlot() + "/odn-" + this.getPorta() + "/ont-" + this.getLogica() + "/cfgm/onuCfgTable");
    }

    @Override
    public SerialOntGpon getSerialOnt() throws Exception {
        List<String> serOnt = this.getCd().consulta(this.getComandoSerialOnt()).getRetorno();
        String sernum = TratativaRetornoUtil.tratKeymile(serOnt, "SerialNumber").replace("\"", "");

        SerialOntGpon ont = new SerialOntGpon();
        ont.setSerial(sernum);

        System.out.println(ont.getSerial());
        return ont;
    }

    public ComandoDslam getComandoConsultaEstadoAdminDaPorta() {
        return new ComandoDslam("get /unit-" + this.getSlot() + "/odn-" + this.getPorta() + "/ont-" + this.getLogica() + "/main/AdministrativeStatus");
    }

    public ComandoDslam getComandoConsultaEstadoOperDaPorta() {
        return new ComandoDslam("get /unit-" + this.getSlot() + "/odn-" + this.getPorta() + "/ont-" + this.getLogica() + "/port-1/main/OperationalStatus");
    }

    @Override
    public EstadoDaPorta getEstadoDaPorta() throws Exception {
        List<String> admin = this.getCd().consulta(this.getComandoConsultaEstadoAdminDaPorta()).getRetorno();
        List<String> oper = this.getCd().consulta(this.getComandoConsultaEstadoOperDaPorta()).getRetorno();

        String adminState = TratativaRetornoUtil.tratKeymile(admin, "State");
        String operState = TratativaRetornoUtil.tratKeymile(oper, "State");

        EstadoDaPorta portState = new EstadoDaPorta();
        portState.setAdminState(adminState);
        portState.setOperState(operState);

        System.out.println(portState.getAdminState());
        System.out.println(portState.getOperState());
        return portState;
    }

    public ComandoDslam getComandoConsultaVlanBanda1() {
        return new ComandoDslam("get /unit-" + this.getSlot() + "/odn-" + this.getPorta() + "/ont-" + this.getLogica() + "/port-1/interface-1/status/ServiceStatus");
    }

    public ComandoDslam getComandoConsultaVlan2() {
        return new ComandoDslam("get /services/packet/" + this.getSrvc() + "/cfgm/Service");
    }

    @Override
    public VlanBanda getVlanBanda() throws Exception {
        List<String> pegaSrvc = this.getCd().consulta(this.getComandoConsultaVlanBanda1()).getRetorno();
        String leSrvc = TratativaRetornoUtil.tratKeymile(pegaSrvc, "ServicesCurrentConnected").replace("\"", "").replace(";", "");
        BigInteger cvlan = new BigInteger("0");
        BigInteger p100 = new BigInteger("0");
        if (!leSrvc.contentEquals("no service connected")) {
            this.setSrvc(leSrvc);
            List<String> pegaVlan = this.getCd().consulta(this.getComandoConsultaVlan2()).getRetorno();
            cvlan = new BigInteger(TratativaRetornoUtil.tratKeymile(pegaVlan, "Svid"));
            p100 = new BigInteger(TratativaRetornoUtil.tratKeymile(pegaVlan, "CVID"));
        }
        VlanBanda vlanBanda = new VlanBanda(cvlan, p100);

        System.out.println(vlanBanda.getCvlan());
        System.out.println(vlanBanda.getP100());

        return vlanBanda;
    }

    public ComandoDslam getComandoConsultaVlanVoip1() {
        return new ComandoDslam("get /unit-" + this.getSlot() + "/odn-" + this.getPorta() + "/ont-" + this.getLogica() + "/port-1/interface-2/status/ServiceStatus");
    }

    @Override
    public VlanVoip getVlanVoip() throws Exception {
        List<String> pegaSrvc = this.getCd().consulta(this.getComandoConsultaVlanVoip1()).getRetorno();
        String leSrvc = TratativaRetornoUtil.tratKeymile(pegaSrvc, "ServicesCurrentConnected").replace("\"", "").replace(";", "");

        BigInteger cvlan = new BigInteger("0");
        BigInteger p100 = new BigInteger("0");
        if (!leSrvc.contentEquals("no service connected")) {
            this.setSrvc(leSrvc);
            List<String> pegaVlan = this.getCd().consulta(this.getComandoConsultaVlan2()).getRetorno();
            cvlan = new BigInteger(TratativaRetornoUtil.tratKeymile(pegaVlan, "Svid"));
            p100 = new BigInteger(TratativaRetornoUtil.tratKeymile(pegaVlan, "CVID"));
        }
        VlanVoip vlanVoip = new VlanVoip(cvlan, p100);

        System.out.println(vlanVoip.getCvlan());
        System.out.println(vlanVoip.getP100());

        return vlanVoip;
    }

    public ComandoDslam getComandoConsultaVlanVod1() {
        return new ComandoDslam("get /unit-" + this.getSlot() + "/odn-" + this.getPorta() + "/ont-" + this.getLogica() + "/port-1/interface-3/status/ServiceStatus");
    }

    @Override
    public VlanVod getVlanVod() throws Exception {
        List<String> pegaSrvc = this.getCd().consulta(this.getComandoConsultaVlanVod1()).getRetorno();
        String leSrvc = TratativaRetornoUtil.tratKeymile(pegaSrvc, "ServicesCurrentConnected").replace("\"", "").replace(";", "");

        BigInteger cvlan = new BigInteger("0");
        BigInteger p100 = new BigInteger("0");
        if (!leSrvc.contentEquals("no service connected")) {
            this.setSrvc(leSrvc);
            List<String> pegaVlan = this.getCd().consulta(this.getComandoConsultaVlan2()).getRetorno();
            cvlan = new BigInteger(TratativaRetornoUtil.tratKeymile(pegaVlan, "Svid"));
            p100 = new BigInteger(TratativaRetornoUtil.tratKeymile(pegaVlan, "CVID"));
        }

        VlanVod vlanVod = new VlanVod(cvlan, p100);

        System.out.println(vlanVod.getCvlan());
        System.out.println(vlanVod.getP100());

        return vlanVod;
    }

    public ComandoDslam getComandoConsultaVlanMulticast1() {
        return new ComandoDslam("get /unit-" + this.getSlot() + "/odn-" + this.getPorta() + "/ont-" + this.getLogica() + "/port-1/interface-4/status/ServiceStatus");
    }

    @Override
    public VlanMulticast getVlanMulticast() throws Exception {
        List<String> pegaSrvc = this.getCd().consulta(this.getComandoConsultaVlanMulticast1()).getRetorno();
        String leSrvc = TratativaRetornoUtil.tratKeymile(pegaSrvc, "ServicesCurrentConnected").replace("\"", "").replace(";", "");
        VlanMulticast vlanMult = new VlanMulticast();
        BigInteger cvlan = new BigInteger("0");
        if (!leSrvc.contentEquals("no service connected")) {
            this.setSrvc(leSrvc);
            List<String> pegaVlan = this.getCd().consulta(this.getComandoConsultaVlan2()).getRetorno();
            cvlan = new BigInteger(TratativaRetornoUtil.tratKeymile(pegaVlan, "McastVID"));
        }

        vlanMult.setCvlan(cvlan);

        System.out.println(vlanMult.getCvlan());

        return vlanMult;
    }

    public ComandoDslam getComandoConsultaAlarmes() {
        return new ComandoDslam("get /unit-" + this.getSlot() + "/odn-" + this.getPorta() + "/ont-" + this.getLogica() + "/fm/alarmstatus");
    }

    @Override
    public AlarmesGpon getAlarmes() throws Exception {
        List<String> alarmesResp = this.getCd().consulta(this.getComandoConsultaAlarmes()).getRetorno();
        AlarmesGpon alarmes = new AlarmesGpon();
        Integer i;
        for (i = 0; i < alarmesResp.size(); i++) {
            String leLine = alarmesResp.get(i);
            if (leLine.contains(" FaultCauseState") && leLine.contains("On")) {
                String pegaNomeAlarme = alarmesResp.get(i - 1);
                String nomeAlarme = pegaNomeAlarme.substring(0, pegaNomeAlarme.indexOf("\\ #")).replace("\"", "").trim();
                alarmes.getListAlarmes().add(nomeAlarme);
            }
        }
        System.out.println(alarmes.getListAlarmes());

        return alarmes;
    }

    public ComandoDslam getComandoConsultaProfileUp() {
        return new ComandoDslam("get /unit-" + this.getSlot() + "/odn-" + this.getPorta() + "/ont-" + this.getLogica() + "/cfgm/onuCfgTable");
    }

    public ComandoDslam getComandoConsultaProfileDown() {
        return new ComandoDslam("get /unit-" + this.getSlot() + "/odn-" + this.getPorta() + "/ont-" + this.getLogica() + "/port-1/interface-1/cfgm/IfRateLimiting");
    }

    @Override
    public Profile getProfile() throws Exception {
        List<String> profileUpResp = this.getCd().consulta(this.getComandoConsultaProfileUp()).getRetorno();
        String profUpIndex = TratativaRetornoUtil.tratKeymile(profileUpResp, "TcontVirtualPortBindingProfileIndex");
        String profileUp = TratativaRetornoUtil.upProfileNameKeymile(new Integer(profUpIndex));

        List<String> profileDownResp = this.getCd().consulta(this.getComandoConsultaProfileDown()).getRetorno();
        String profileDown = TratativaRetornoUtil.tratKeymile(profileDownResp, "Name", 2);

        Profile prof = new Profile();
        prof.setProfileUp(profileUp);
        prof.setProfileDown(profileDown);

        System.out.println(prof.getProfileDown());
        System.out.println(prof.getProfileUp());
        return prof;
    }

}
