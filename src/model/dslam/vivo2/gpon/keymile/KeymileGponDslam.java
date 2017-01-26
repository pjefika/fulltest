/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.vivo2.gpon.keymile;

import dao.dslam.ComandoDslam;
import dao.dslam.ConsultaDslam;
import java.math.BigInteger;
import java.util.List;
import model.dslam.consulta.AlarmesGpon;
import model.dslam.consulta.EstadoDaPorta;
import model.dslam.consulta.SerialOntGpon;
import model.dslam.consulta.TabelaParametrosGpon;
import model.dslam.consulta.Vlan;
import model.dslam.consulta.VlanMulticast;
import model.dslam.credencial.Credencial;
import model.dslam.login.LoginRapido;
import model.dslam.vivo2.gpon.DslamGpon;

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

    private static String tratKeymile(List<String> list, String qqqro, Integer o){
        Integer i = 1;
        for (String leLine : list) {
            if(leLine.contains(qqqro)){
                if(i.equals(o)){
                    return leLine.substring(0, leLine.indexOf("\\ #")).trim();    
                }
                i++;
            }
            
        }
        
        return "Parâmetro não encontrado "+qqqro;
    }

    private static String tratKeymile(List<String> list, String qqqro){
        return tratKeymile(list, qqqro, 1);
    }
    
    
    public ComandoDslam getComandoPotOlt() {
        return new ComandoDslam("get /unit-"+this.getSlot()+"/odn-"+this.getPorta()+"/ont-"+this.getLogica()+"/status/olt");
    }
    
    public ComandoDslam getComandoPotOnt() {
        return new ComandoDslam("get /unit-"+this.getSlot()+"/odn-"+this.getPorta()+"/ont-"+this.getLogica()+"/status/ont");
    }

    @Override
    public TabelaParametrosGpon getTabelaParametros() throws Exception {
        List<String> retOlt = this.getCd().consulta(this.getComandoPotOlt()).getRetorno();
        List<String> retOnt = this.getCd().consulta(this.getComandoPotOnt()).getRetorno();
        
        TabelaParametrosGpon tabParam = new TabelaParametrosGpon();
        tabParam.setPotOlt(new Double(tratKeymile(retOlt, "rxInputPower")));
        tabParam.setPotOnt(new Double(tratKeymile(retOnt, "rxInputPower")));
        
        System.out.println(tabParam.getPotOlt());
        System.out.println(tabParam.getPotOnt());
        
        return tabParam;
    }
    
    

    
    public ComandoDslam getComandoSerialOnt() {
        return new ComandoDslam("get /unit-"+this.getSlot()+"/odn-"+this.getPorta()+"/ont-"+this.getLogica()+"/cfgm/onuCfgTable");
    }

    @Override
    public SerialOntGpon getSerialOnt() throws Exception {
        List<String> serOnt = this.getCd().consulta(this.getComandoSerialOnt()).getRetorno();
        String sernum = tratKeymile(serOnt, "SerialNumber").replace("\"", "");
        
        SerialOntGpon ont = new SerialOntGpon();
        ont.setSerial(sernum);
        
        System.out.println(ont.getSerial());
        return ont;
    }

    
    public ComandoDslam getComandoConsultaEstadoAdminDaPorta() {
        return new ComandoDslam("get /unit-"+this.getSlot()+"/odn-"+this.getPorta()+"/ont-"+this.getLogica()+"/main/AdministrativeStatus");
    }
    
    public ComandoDslam getComandoConsultaEstadoOperDaPorta() {
        return new ComandoDslam("get /unit-"+this.getSlot()+"/odn-"+this.getPorta()+"/ont-"+this.getLogica()+"/port-1/main/OperationalStatus");
    }
    

    @Override
    public EstadoDaPorta getEstadoDaPorta() throws Exception {
        List<String> admin = this.getCd().consulta(this.getComandoConsultaEstadoAdminDaPorta()).getRetorno();
        List<String> oper = this.getCd().consulta(this.getComandoConsultaEstadoOperDaPorta()).getRetorno();
        
        String adminState = tratKeymile(admin, "State");
        String operState = tratKeymile(oper, "State");
        
        EstadoDaPorta portState = new EstadoDaPorta();
        portState.setAdminState(adminState);
        portState.setOperState(operState);
        
        System.out.println(portState.getAdminState());
        System.out.println(portState.getOperState());
        return portState;
    }

    
    public ComandoDslam getComandoConsultaVlanBanda1() {
        return new ComandoDslam("get /unit-"+this.getSlot()+"/odn-"+this.getPorta()+"/ont-"+this.getLogica()+"/port-1/interface-1/status/ServiceStatus");
    }
    
    public ComandoDslam getComandoConsultaVlan2() {
        return new ComandoDslam("get /services/packet/"+this.getSrvc()+"/cfgm/Service");
    }

    @Override
    public Vlan getVlanBanda() throws Exception {
        List<String> pegaSrvc = this.getCd().consulta(this.getComandoConsultaVlanBanda1()).getRetorno();
        String leSrvc = tratKeymile(pegaSrvc, "ServicesCurrentConnected").replace("\"", "").replace(";", "");
        this.setSrvc(leSrvc);
        if(leSrvc.contentEquals("no service connected")){
            System.out.println("Sem VlanBanda Configurada");
            return new Vlan();
        }
        List<String> pegaVlan = this.getCd().consulta(this.getComandoConsultaVlan2()).getRetorno();
        BigInteger cvlan = new BigInteger(tratKeymile(pegaVlan, "Svid"));
        BigInteger p100 = new BigInteger(tratKeymile(pegaVlan, "CVID"));
        
        Vlan vlanBanda = new Vlan();
        vlanBanda.setCvlan(cvlan);
        vlanBanda.setP100(p100);
        
        System.out.println(vlanBanda.getCvlan());
        System.out.println(vlanBanda.getP100());
        
        return vlanBanda;
    }

    
    public ComandoDslam getComandoConsultaVlanVoip1() {
        return new ComandoDslam("get /unit-"+this.getSlot()+"/odn-"+this.getPorta()+"/ont-"+this.getLogica()+"/port-1/interface-2/status/ServiceStatus");
    }

    @Override
    public Vlan getVlanVoip() throws Exception {
        List<String> pegaSrvc = this.getCd().consulta(this.getComandoConsultaVlanVoip1()).getRetorno();
        String leSrvc = tratKeymile(pegaSrvc, "ServicesCurrentConnected").replace("\"", "").replace(";", "");
        this.setSrvc(leSrvc);
        if(leSrvc.contentEquals("no service connected")){
            System.out.println("Sem VlanVoip Configurada");
            return new Vlan();
        }
        List<String> pegaVlan = this.getCd().consulta(this.getComandoConsultaVlan2()).getRetorno();
        BigInteger cvlan = new BigInteger(tratKeymile(pegaVlan, "Svid"));
        BigInteger p100 = new BigInteger(tratKeymile(pegaVlan, "CVID"));
        
        Vlan vlanVoip = new Vlan();
        vlanVoip.setCvlan(cvlan);
        vlanVoip.setP100(p100);
        
        System.out.println(vlanVoip.getCvlan());
        System.out.println(vlanVoip.getP100());
        
        return vlanVoip;
    }

    
    public ComandoDslam getComandoConsultaVlanVod1() {
        return new ComandoDslam("get /unit-"+this.getSlot()+"/odn-"+this.getPorta()+"/ont-"+this.getLogica()+"/port-1/interface-3/status/ServiceStatus");
    }

    @Override
    public Vlan getVlanVod() throws Exception {
        List<String> pegaSrvc = this.getCd().consulta(this.getComandoConsultaVlanVod1()).getRetorno();
        String leSrvc = tratKeymile(pegaSrvc, "ServicesCurrentConnected").replace("\"", "").replace(";", "");
        this.setSrvc(leSrvc);
        if(leSrvc.contentEquals("no service connected")){
            System.out.println("Sem VlanVod Configurada");
            return new Vlan();
        }
        List<String> pegaVlan = this.getCd().consulta(this.getComandoConsultaVlan2()).getRetorno();
        BigInteger cvlan = new BigInteger(tratKeymile(pegaVlan, "Svid"));
        BigInteger p100 = new BigInteger(tratKeymile(pegaVlan, "CVID"));
        
        Vlan vlanVod = new Vlan();
        vlanVod.setCvlan(cvlan);
        vlanVod.setP100(p100);
        
        System.out.println(vlanVod.getCvlan());
        System.out.println(vlanVod.getP100());
        
        return vlanVod;
    }

    
    public ComandoDslam getComandoConsultaVlanMulticast1() {
        return new ComandoDslam("get /unit-"+this.getSlot()+"/odn-"+this.getPorta()+"/ont-"+this.getLogica()+"/port-1/interface-4/status/ServiceStatus");
    }

    @Override
    public VlanMulticast getVlanMulticast() throws Exception {
        List<String> pegaSrvc = this.getCd().consulta(this.getComandoConsultaVlanMulticast1()).getRetorno();
        String leSrvc = tratKeymile(pegaSrvc, "ServicesCurrentConnected").replace("\"", "").replace(";", "");
        this.setSrvc(leSrvc);
        if(leSrvc.contentEquals("no service connected")){
            System.out.println("Sem VlanMulticast Configurada");
            return new VlanMulticast();
        }
        List<String> pegaVlan = this.getCd().consulta(this.getComandoConsultaVlan2()).getRetorno();
        
        BigInteger cvlan = new BigInteger(tratKeymile(pegaVlan, "McastVID"));
                
        VlanMulticast vlanMult = new VlanMulticast();
        vlanMult.setCvlan(cvlan);
                
        System.out.println(vlanMult.getCvlan());
        
        
        return vlanMult;
    }

    
    public ComandoDslam getComandoConsultaAlarmes() {
        return new ComandoDslam("get /unit-"+this.getSlot()+"/odn-"+this.getPorta()+"/ont-"+this.getLogica()+"/fm/alarmstatus");
    }

    @Override
    public AlarmesGpon getAlarmes() throws Exception {
        List<String> alarmesResp = this.getCd().consulta(this.getComandoConsultaAlarmes()).getRetorno();
        AlarmesGpon alarmes = new AlarmesGpon();
        Integer i;
        for(i=0; i<alarmesResp.size(); i++){
            String leLine = alarmesResp.get(i);
            if(leLine.contains(" FaultCauseState") && leLine.contains("On")){
                String pegaNomeAlarme = alarmesResp.get(i-1);
                String nomeAlarme = pegaNomeAlarme.substring(0, pegaNomeAlarme.indexOf("\\ #")).replace("\"", "").trim();
                alarmes.getListAlarmes().add(nomeAlarme);
            }
        }
        System.out.println(alarmes.getListAlarmes());
        
        return alarmes;
    }

}
