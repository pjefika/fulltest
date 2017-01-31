/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.vivo2.gpon.zhone;

import java.math.BigInteger;

import dao.dslam.telnet.ComandoDslam;
import dao.dslam.telnet.ConsultaDslam;

import java.util.List;
import model.dslam.consulta.AlarmesGpon;
import model.dslam.consulta.EstadoDaPorta;
import model.dslam.consulta.ProfileGpon;
import model.dslam.consulta.SerialOntGpon;
import model.dslam.consulta.TabelaParametrosGpon;
import model.dslam.consulta.VlanBanda;
import model.dslam.consulta.VlanMulticast;
import model.dslam.consulta.VlanVod;
import model.dslam.consulta.VlanVoip;
import model.dslam.credencial.Credencial;
import model.dslam.login.LoginLento;
import model.dslam.retorno.TratativaRetornoUtil;
import model.dslam.vivo2.gpon.DslamGpon;

/**
 *
 * @author G0042204
 */
public class ZhoneGponDslam extends DslamGpon {
    
    public ZhoneGponDslam() {
        this.setCredencial(Credencial.ZHONE);
        this.setLoginStrategy(new LoginLento());
        this.setCd(new ConsultaDslam(this));
        
    }
    
    private BigInteger getL500(){
        return this.getLogica().add(new BigInteger("500"));
    }
    private BigInteger getL700(){
        return this.getLogica().add(new BigInteger("700"));
    }
    private BigInteger getL900(){
        return this.getLogica().add(new BigInteger("900"));
    }
    private BigInteger getL1100(){
        return this.getLogica().add(new BigInteger("1100"));
    }

    
    public ComandoDslam getComandoTabelaParametros() {
        return new ComandoDslam("onu status "+this.getSlot()+"/"+this.getPorta()+"/"+this.getLogica());
    }

    @Override
    public TabelaParametrosGpon getTabelaParametros() throws Exception {
        List<String> leParams = this.getCd().consulta(this.getComandoTabelaParametros()).getRetorno();
        List<String> pegaParams = TratativaRetornoUtil.tratZhone(leParams, "1-"+this.getSlot()+"-"+this.getPorta()+"-"+this.getLogica(), "-?\\.?(\\d+((\\.|,| )\\d+)?)");
        Double potOlt = new Double(pegaParams.get(5));
        Double potOnt = new Double(pegaParams.get(6));
        
        TabelaParametrosGpon tabParam = new TabelaParametrosGpon();
        tabParam.setPotOlt(potOlt);
        tabParam.setPotOnt(potOnt);
        
        System.out.println(tabParam.getPotOlt());
        System.out.println(tabParam.getPotOnt());
        
        
        return tabParam;
    }

    
    public ComandoDslam getComandoSerialOnt() {
        return new ComandoDslam("onu inventory 1-"+this.getSlot()+"-"+this.getPorta()+"-"+this.getLogica(), 3000);
    }

    @Override
    public SerialOntGpon getSerialOnt() throws Exception {
        List<String> leSerial = this.getCd().consulta(this.getComandoSerialOnt()).getRetorno();
        List<String> pegaSerial = TratativaRetornoUtil.tratZhone(leSerial, this.getLogica().toString(), "\\b\\w+\\b", 2);

        String sernum = "";
        
        if(pegaSerial.size()>3){
            sernum = pegaSerial.get(6)+pegaSerial.get(5);    
        }else{
            sernum = pegaSerial.get(pegaSerial.size()-1)+pegaSerial.get(pegaSerial.size()-2);    
        }
        
        SerialOntGpon serOnt = new SerialOntGpon();
        serOnt.setSerial(sernum);
        
        System.out.println(serOnt.getSerial());
        
        return serOnt;
    }

    
    public ComandoDslam getComandoConsultaEstadoDaPorta() {
        return new ComandoDslam("port show 1/"+this.getSlot()+"/"+this.getPorta()+"/"+this.getLogica()+"/gpononu"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EstadoDaPorta getEstadoDaPorta() throws Exception {
        List<String> leAdmin= this.getCd().consulta(this.getComandoConsultaEstadoDaPorta()).getRetorno();
        List<String> leOper= this.getCd().consulta(this.getComandoTabelaParametros()).getRetorno();
        List<String> pegaAdmin = TratativaRetornoUtil.tratZhone(leAdmin, "Administrative", "\\b\\w+\\b");
        List<String> pegaOper = TratativaRetornoUtil.tratZhone(leOper, "1-"+this.getSlot()+"-"+this.getPorta()+"-"+this.getLogica(), "\\b\\w+\\b");
        String adminState = pegaAdmin.get(2);
        String operState = pegaOper.get(5);
        
        EstadoDaPorta estado = new EstadoDaPorta();
        
        estado.setAdminState(adminState);
        estado.setOperState(operState);
        
        System.out.println(estado.getAdminState());
        System.out.println(estado.getOperState());
        
     return estado;  
    }

    
    public ComandoDslam getComandoConsultaVlan() {
        return new ComandoDslam("bridge show vlan "+this.getP100());
    }

    @Override
    public VlanBanda getVlanBanda() throws Exception {
        List<String> leVlan= this.getCd().consulta(this.getComandoConsultaVlan()).getRetorno();
        List<String> leVlanBanda = TratativaRetornoUtil.tratZhone(leVlan, "-"+this.getL500()+"-", "-?\\.?(\\d+((\\.|,| )\\d+)?)");
        
        BigInteger cvlan = new BigInteger("0");
        BigInteger p100 = new BigInteger("0");
        
        if(leVlanBanda != null){
            cvlan = new BigInteger(leVlanBanda.get(0));
            p100 = new BigInteger(leVlanBanda.get(1));
        }
        VlanBanda vlanBanda = new VlanBanda(cvlan, p100);
        
        System.out.println(vlanBanda.getP100());
        System.out.println(vlanBanda.getCvlan());
        
        return vlanBanda;
    }


    @Override
    public VlanVoip getVlanVoip() throws Exception {
        List<String> leVlan= this.getCd().consulta(this.getComandoConsultaVlan()).getRetorno();
        List<String> leVlanVoip = TratativaRetornoUtil.tratZhone(leVlan, "-"+this.getL700()+"-", "-?\\.?(\\d+((\\.|,| )\\d+)?)");
        
        BigInteger cvlan = new BigInteger("0");
        BigInteger p100 = new BigInteger("0");
        
        if(leVlanVoip != null){
            cvlan = new BigInteger(leVlanVoip.get(0));
            p100 = new BigInteger(leVlanVoip.get(1));
        }
        VlanVoip vlanVoip = new VlanVoip(cvlan, p100);
        
        
        
        System.out.println(vlanVoip.getP100());
        System.out.println(vlanVoip.getCvlan());
        
        return vlanVoip;
    }


    @Override
    public VlanVod getVlanVod() throws Exception {
        List<String> leVlan= this.getCd().consulta(this.getComandoConsultaVlan()).getRetorno();
        List<String> leVlanVod = TratativaRetornoUtil.tratZhone(leVlan, "-"+this.getL900()+"-", "-?\\.?(\\d+((\\.|,| )\\d+)?)");
        
        BigInteger cvlan = new BigInteger("0");
        BigInteger p100 = new BigInteger("0");
        
        if(leVlanVod != null){
            cvlan = new BigInteger(leVlanVod.get(0));
            p100 = new BigInteger(leVlanVod.get(1));
        }
        
        VlanVod vlanVod = new VlanVod(cvlan, p100);
        
        System.out.println(vlanVod.getP100());
        System.out.println(vlanVod.getCvlan());
        
        return vlanVod;
    }

    
    public ComandoDslam getComandoConsultaVlanMulticast() {
        return new ComandoDslam("bridge show port 1/"+this.getSlot()+"/"+this.getPorta()+"/"+this.getLogica()+"/gpononu", 40000);
    }

    @Override
    public VlanMulticast getVlanMulticast() throws Exception {        
        List<String> leVlan= this.getCd().consulta(this.getComandoConsultaVlanMulticast()).getRetorno();
        List<String> leVlanMult = TratativaRetornoUtil.tratZhone(leVlan, "-"+this.getL1100()+"-", "-?\\.?(\\d+((\\.|,| )\\d+)?)");
        VlanMulticast vlanMult = new VlanMulticast();
        BigInteger cvlan = new BigInteger("0");
        
        if(leVlanMult != null){
            cvlan = new BigInteger(leVlanMult.get(0));
        }
        
        vlanMult.setCvlan(cvlan);
        
        System.out.println(vlanMult.getCvlan());
        
        return vlanMult;
    }

    
    public ComandoDslam getComandoConsultaAlarmes() {
        return new ComandoDslam("onu alarms "+this.getSlot()+"/"+this.getPorta()+"/"+this.getLogica());
    }

    @Override
    public AlarmesGpon getAlarmes() throws Exception {
        List<String> leAlarmes= this.getCd().consulta(this.getComandoConsultaAlarmes()).getRetorno();
        AlarmesGpon alarm = new AlarmesGpon();
        if(!leAlarmes.contains("No active alarms found")){
            alarm.setListAlarmes(leAlarmes);
        }
        
         return alarm;
    }
    
    public ComandoDslam getComandoConsultaProfileDown(){
        return new ComandoDslam("get bridge-interface-record 1-"+this.getSlot()+"-"+this.getPorta()+"-"+this.getL500()+"-gponport-"+this.getP100()+"-"+this.getRin()+"/bridge");
    }
    
    public ComandoDslam getComandoConsultaProfileUp(){
        return new ComandoDslam("onu gemports "+this.getSlot()+"/"+this.getPorta()+"/"+this.getLogica());
    }

    @Override
    public ProfileGpon getProfile() throws Exception {
        List<String> leProfDowns = this.getCd().consulta(this.getComandoConsultaProfileDown()).getRetorno();
        List<String> leProfUps = this.getCd().consulta(this.getComandoConsultaProfileUp()).getRetorno();

        List<String> leProfileUp = TratativaRetornoUtil.tratZhone(leProfUps, "1-"+this.getSlot()+"-"+this.getPorta()+"-"+this.getL500(), "-?\\.?(\\d+((\\.|,| )\\d+)?)");
        List<String> leProfileDown = TratativaRetornoUtil.tratZhone(leProfDowns, "bridgeIfEgressPacketRuleGroupIndex", "-?\\.?(\\d+((\\.|,| )\\d+)?)");

        String profileDown = leProfileDown.get(0);
        String profileUp = leProfileUp.get(leProfileUp.size()-6);
                
        ProfileGpon prof = new ProfileGpon();
        prof.setProfileDown(profileDown);
        prof.setProfileUp(profileUp);
        System.out.println(prof.getProfileDown());
        System.out.println(prof.getProfileUp());
        
        return prof;
    }

}
