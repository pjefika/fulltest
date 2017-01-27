/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.vivo2.gpon.alcatel;

import dao.dslam.telnet.ComandoDslam;
import dao.dslam.telnet.ConsultaDslam;
import java.math.BigInteger;
import model.dslam.consulta.AlarmesGpon;
import model.dslam.consulta.EstadoDaPorta;
import model.dslam.consulta.SerialOntGpon;
import model.dslam.consulta.TabelaParametrosGpon;
import model.dslam.consulta.Vlan;
import model.dslam.consulta.VlanMulticast;
import model.dslam.credencial.Credencial;
import model.dslam.login.LoginRapido;
import model.dslam.retorno.TratativaRetornoUtil;
import model.dslam.vivo2.gpon.DslamGpon;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author G0042204
 */
public class AlcatelGponDslam extends DslamGpon {

    public AlcatelGponDslam() {
        this.setCredencial(Credencial.ALCATEL);
        this.setLoginStrategy(new LoginRapido());
        this.setCd(new ConsultaDslam(this));
    }

    
    public ComandoDslam getComandoTabelaParametros() {
        return new ComandoDslam("show equipment ont optics 1/1/" + this.getSlot() + "/" + this.getPorta() + "/" + this.getLogica() + " detail xml");
    }

    @Override
    public TabelaParametrosGpon getTabelaParametros() throws Exception {

        Document xml;
        xml = TratativaRetornoUtil.stringXmlParse(this.getCd().consulta(this.getComandoTabelaParametros()));
        String potOnt = TratativaRetornoUtil.getXmlParam(xml, "//info[@name='rx-signal-level']");
        String potOlt = TratativaRetornoUtil.getXmlParam(xml, "//info[@name='olt-rx-sig-level']");
        TabelaParametrosGpon tabParam = new TabelaParametrosGpon();
        tabParam.setPotOlt(new Double(potOlt));
        tabParam.setPotOnt(new Double(potOnt));
        System.out.println(potOnt + " | " + potOlt);

        return tabParam;
    }

    public ComandoDslam getComandoSerialOnt() {
        return new ComandoDslam("info configure equipment ont interface 1/1/" + this.getSlot() + "/" + this.getPorta() + "/" + this.getLogica() + " detail xml");
    }

    @Override
    public SerialOntGpon getSerialOnt() throws Exception {
        Document xml = TratativaRetornoUtil.stringXmlParse(this.getCd().consulta(this.getComandoSerialOnt()));
        String sernum = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='sernum']").replace(":", "");
        
        SerialOntGpon ont = new SerialOntGpon();
        ont.setSerial(sernum);
        System.out.println(sernum);
        
        return ont;
    }

    
    public ComandoDslam getComandoConsultaEstadoDaPorta() {
        return new ComandoDslam("info configure equipment ont interface 1/1/" + this.getSlot() + "/" + this.getPorta() + "/" + this.getLogica() + " detail xml");
    }

    @Override
    public EstadoDaPorta getEstadoDaPorta() throws Exception {
        Document xml = TratativaRetornoUtil.stringXmlParse(this.getCd().consulta(this.getComandoConsultaEstadoDaPorta()));
        String adminState = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='admin-state']");
        String operState = TratativaRetornoUtil.getXmlParam(xml, "//info[@name='oper-state']");
        
        EstadoDaPorta state = new EstadoDaPorta();
        
        state.setAdminState(adminState);
        state.setOperState(operState);
        
        System.out.println(adminState);
        System.out.println(operState);
        
        return state;
    }

    
    public ComandoDslam getComandoConsultaVlanBanda() {
        return new ComandoDslam("info configure bridge port 1/1/" + this.getSlot() + "/" + this.getPorta() + "/" + this.getLogica() + "/4/1 vlan-id 600 detail xml");
    }

    @Override
    public Vlan getVlanBanda() throws Exception {
        Document xml = TratativaRetornoUtil.stringXmlParse(this.getCd().consulta(this.getComandoConsultaVlanBanda()));
        String leVlan = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='network-vlan']");
        String[] pegaVlan = leVlan.split(":");
        BigInteger cvlan = new BigInteger(pegaVlan[1]);
        BigInteger p100 = new BigInteger(pegaVlan[2]);

        Vlan vlanBanda = new Vlan();
        vlanBanda.setCvlan(cvlan);
        vlanBanda.setP100(p100);
        
        System.out.println(cvlan);
        System.out.println(p100);

        return vlanBanda;
    }

    
    public ComandoDslam getComandoConsultaVlanVoip() {
        return new ComandoDslam("info configure bridge port 1/1/" + this.getSlot() + "/" + this.getPorta() + "/" + this.getLogica() + "/4/1 vlan-id 601 detail xml");
    }

    @Override
    public Vlan getVlanVoip() throws Exception {
        Document xml = TratativaRetornoUtil.stringXmlParse(this.getCd().consulta(this.getComandoConsultaVlanVoip()));
        String leVlan = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='network-vlan']");
        String[] pegaVlan = leVlan.split(":");
        BigInteger cvlan = new BigInteger(pegaVlan[1]);
        BigInteger p100 = new BigInteger(pegaVlan[2]);

        Vlan vlanVoip = new Vlan();
        vlanVoip.setCvlan(cvlan);
        vlanVoip.setP100(p100);
        
        System.out.println(cvlan);
        System.out.println(p100);

        return vlanVoip;
    }

    
    public ComandoDslam getComandoConsultaVlanVod() {
        return new ComandoDslam("info configure bridge port 1/1/" + this.getSlot() + "/" + this.getPorta() + "/" + this.getLogica() + "/4/1 vlan-id 602 detail xml");
    }

    @Override
    public Vlan getVlanVod() throws Exception {
        Document xml = TratativaRetornoUtil.stringXmlParse(this.getCd().consulta(this.getComandoConsultaVlanVod()));
        String leVlan = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='network-vlan']");
        String[] pegaVlan = leVlan.split(":");
        BigInteger cvlan = new BigInteger(pegaVlan[1]);
        BigInteger p100 = new BigInteger(pegaVlan[2]);
        
        Vlan vlanVod = new Vlan();
        vlanVod.setCvlan(cvlan);
        vlanVod.setP100(p100);
        
        System.out.println(cvlan);
        System.out.println(p100);

        return vlanVod;
    }

    
    public ComandoDslam getComandoConsultaVlanMulticast() {
        return new ComandoDslam("info configure bridge port 1/1/" + this.getSlot() + "/" + this.getPorta() + "/" + this.getLogica() + "/4/1 vlan-id 4000 detail xml");
    }

    @Override
    public VlanMulticast getVlanMulticast() throws Exception {
        Document xml = TratativaRetornoUtil.stringXmlParse(this.getCd().consulta(this.getComandoConsultaVlanMulticast()));
        String leVlan = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='network-vlan']");
        BigInteger cvlan;
        if (!leVlan.isEmpty()) {
            cvlan = new BigInteger("4000");
        } else {
            cvlan = new BigInteger("0");
        }
        
        VlanMulticast multz = new VlanMulticast();
        multz.setCvlan(cvlan);
        
        System.out.println(cvlan);
        
        return multz;
    }

    
    public ComandoDslam getComandoConsultaAlarmes() {
        return new ComandoDslam("show equipment ont operational-data 1/1/"+this.getSlot()+"/"+this.getPorta()+"/"+this.getLogica()+" detail xml", 5000);
    }

    @Override
    public AlarmesGpon getAlarmes() throws Exception {
        Document xml = TratativaRetornoUtil.stringXmlParse(this.getCd().consulta(this.getComandoConsultaAlarmes()));
        NodeList nodeList = xml.getElementsByTagName("info");
        AlarmesGpon alarmes = new AlarmesGpon();
        
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);

            String nomeAlarme = node.getAttributes().getNamedItem("name").getTextContent().trim(); 
            String estadoAlarme = node.getTextContent().trim();
            
            if(estadoAlarme.equalsIgnoreCase("yes")){
                alarmes.getListAlarmes().add(nomeAlarme);
            }
           
        }
        System.out.println(alarmes.getListAlarmes());
        
        return alarmes;
    }

}
