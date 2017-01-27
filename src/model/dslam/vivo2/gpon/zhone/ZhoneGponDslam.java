/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.vivo2.gpon.zhone;

import java.math.BigInteger;
import java.util.ArrayList;

import dao.dslam.telnet.ComandoDslam;
import dao.dslam.telnet.ConsultaDslam;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import model.dslam.consulta.AlarmesGpon;
import model.dslam.consulta.EstadoDaPorta;
import model.dslam.consulta.SerialOntGpon;
import model.dslam.consulta.TabelaParametrosGpon;
import model.dslam.consulta.Vlan;
import model.dslam.consulta.VlanMulticast;
import model.dslam.credencial.Credencial;
import model.dslam.login.LoginLento;
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

    private static List<String> tratZhone(List<String> list, String qqqro, String regex, Integer o){
        Integer i = 1;
        for (String leLine : list) {
            if(leLine.contains(qqqro)){
                if(i.equals(o)){
                    List<String> allMatches = new ArrayList<String>();
                    Matcher m = Pattern.compile(regex).matcher(leLine);
                    while (m.find()) {
                        allMatches.add(m.group());
                    }
                    return allMatches;
                }
                i++;
            }
        }
        
        return null;
    }
    
    private static List<String> tratZhone(List<String> list, String qqqro,String regex){
        return tratZhone(list, qqqro, regex, 1);
    }
    
    public ComandoDslam getComandoTabelaParametros() {
        return new ComandoDslam("onu status "+this.getSlot()+"/"+this.getPorta()+"/"+this.getLogica());
    }

    @Override
    public TabelaParametrosGpon getTabelaParametros() throws Exception {
        List<String> leParams = this.getCd().consulta(this.getComandoTabelaParametros()).getRetorno();
        List<String> pegaParams = tratZhone(leParams, "1-"+this.getSlot()+"-"+this.getPorta()+"-"+this.getLogica(), "-?\\.?(\\d+((\\.|,| )\\d+)?)");
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
        return new ComandoDslam("onu inventory 1-"+this.getSlot()+"-"+this.getPorta()+"-"+this.getLogica());
    }

    @Override
    public SerialOntGpon getSerialOnt() throws Exception {
        List<String> leSerial = this.getCd().consulta(this.getComandoSerialOnt()).getRetorno();
        List<String> pegaSerial = tratZhone(leSerial, "1-"+this.getSlot()+"-"+this.getPorta()+"-"+this.getLogica(), "\\b\\w+\\b", 2);
        
        String sernum = pegaSerial.get(6)+pegaSerial.get(5);
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
        List<String> pegaAdmin = tratZhone(leAdmin, "Administrative", "\\b\\w+\\b");
        List<String> pegaOper = tratZhone(leOper, "1-"+this.getSlot()+"-"+this.getPorta()+"-"+this.getLogica(), "\\b\\w+\\b");
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
        BigInteger leP100 = this.getSequencial().add(new BigInteger("100"));
        return new ComandoDslam("bridge show vlan "+leP100);
    }

    @Override
    public Vlan getVlanBanda() throws Exception {
        BigInteger L500 = this.getLogica().add(new BigInteger("500"));
        List<String> leVlan= this.getCd().consulta(this.getComandoConsultaVlan()).getRetorno();
        List<String> leVlanBanda = tratZhone(leVlan, "-"+L500+"-", "-?\\.?(\\d+((\\.|,| )\\d+)?)");
        Vlan vlanBanda = new Vlan();
        vlanBanda.setP100(new BigInteger(leVlanBanda.get(0)));
        vlanBanda.setCvlan(new BigInteger(leVlanBanda.get(1)));
        
        System.out.println(vlanBanda.getP100());
        System.out.println(vlanBanda.getCvlan());
        
        return vlanBanda;
    }


    @Override
    public Vlan getVlanVoip() throws Exception {
        BigInteger L700 = this.getLogica().add(new BigInteger("700"));
        List<String> leVlan= this.getCd().consulta(this.getComandoConsultaVlan()).getRetorno();
        List<String> leVlanVoip = tratZhone(leVlan, "-"+L700+"-", "-?\\.?(\\d+((\\.|,| )\\d+)?)");
        Vlan vlanVoip = new Vlan();
        vlanVoip.setP100(new BigInteger(leVlanVoip.get(0)));
        vlanVoip.setCvlan(new BigInteger(leVlanVoip.get(1)));
        
        System.out.println(vlanVoip.getP100());
        System.out.println(vlanVoip.getCvlan());
        
        return vlanVoip;
    }


    @Override
    public Vlan getVlanVod() throws Exception {
        BigInteger L900 = this.getLogica().add(new BigInteger("900"));
        List<String> leVlan= this.getCd().consulta(this.getComandoConsultaVlan()).getRetorno();
        List<String> leVlanVod = tratZhone(leVlan, "-"+L900+"-", "-?\\.?(\\d+((\\.|,| )\\d+)?)");
        Vlan vlanVod = new Vlan();
        vlanVod.setP100(new BigInteger(leVlanVod.get(0)));
        vlanVod.setCvlan(new BigInteger(leVlanVod.get(1)));
        
        System.out.println(vlanVod.getP100());
        System.out.println(vlanVod.getCvlan());
        
        return vlanVod;
    }

    
    public ComandoDslam getComandoConsultaVlanMulticast() {
        return new ComandoDslam("bridge show port 1/"+this.getSlot()+"/"+this.getPorta()+"/"+this.getLogica()+"/gpononu", 40000);
    }

    @Override
    public VlanMulticast getVlanMulticast() throws Exception {
        BigInteger L1100 = this.getLogica().add(new BigInteger("1100"));
        List<String> leVlan= this.getCd().consulta(this.getComandoConsultaVlanMulticast()).getRetorno();
        List<String> leVlanVod = tratZhone(leVlan, "-"+L1100+"-", "-?\\.?(\\d+((\\.|,| )\\d+)?)");
        VlanMulticast vlanMult = new VlanMulticast();
        
        vlanMult.setCvlan(new BigInteger(leVlanVod.get(0)));
        
        System.out.println(vlanMult.getCvlan());
        
        return vlanMult;
    }

    
    public ComandoDslam getComandoConsultaAlarmes() {
        return new ComandoDslam("onu alarms "+this.getSlot()+"/"+this.getPorta()+"/"+this.getLogica());
    }

    @Override
    public AlarmesGpon getAlarmes() throws Exception {
        List<String> leAlarmes= this.getCd().consulta(this.getComandoConsultaAlarmes()).getRetorno();
        leAlarmes.forEach((leAlarme) -> {
            System.out.println(leAlarme);
        });
         return null;
    }

}
