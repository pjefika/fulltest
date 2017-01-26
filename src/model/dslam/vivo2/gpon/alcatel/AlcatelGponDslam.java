/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.vivo2.gpon.alcatel;

import dao.dslam.ComandoDslam;
import dao.dslam.ConsultaDslam;
import java.math.BigInteger;
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

    @Override
    public ComandoDslam getComandoTabelaParametros() {
        return new ComandoDslam("show equipment ont optics 1/1/" + this.getSlot() + "/" + this.getPorta() + "/" + this.getLogica() + " detail xml");
    }

    @Override
    public TabelaParametrosGpon getTabelaParametros() throws Exception {

        Document xml;
        xml = TratativaRetornoUtil.stringXmlParse(this.getCd().consulta(this.getComandoTabelaParametros()));
        String oi = TratativaRetornoUtil.getXmlParam(xml, "//info[@name='rx-signal-level']");
        String oi1 = TratativaRetornoUtil.getXmlParam(xml, "//info[@name='olt-rx-sig-level']");
        System.out.println(oi + " | " + oi1);

        return null;
    }

    @Override
    public ComandoDslam getComandoSerialOnt() {
        return new ComandoDslam("info configure equipment ont interface 1/1/" + this.getSlot() + "/" + this.getPorta() + "/" + this.getLogica() + " detail xml");
    }

    @Override
    public SerialOntGpon getSerialOnt() throws Exception {
        Document xml = TratativaRetornoUtil.stringXmlParse(this.getCd().consulta(this.getComandoSerialOnt()));
        String sernum = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='sernum']").replace(":", "");
        System.out.println(sernum);
        return null;
    }

    @Override
    public ComandoDslam getComandoConsultaEstadoDaPorta() {
        return new ComandoDslam("info configure equipment ont interface 1/1/" + this.getSlot() + "/" + this.getPorta() + "/" + this.getLogica() + " detail xml");
    }

    @Override
    public EstadoDaPorta getEstadoDaPorta() throws Exception {
        Document xml = TratativaRetornoUtil.stringXmlParse(this.getCd().consulta(this.getComandoConsultaEstadoDaPorta()));
        String adminState = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='admin-state']");
        String operState = TratativaRetornoUtil.getXmlParam(xml, "//info[@name='oper-state']");
        System.out.println(adminState);
        System.out.println(operState);
        return null;
    }

    @Override
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

        System.out.println(cvlan);
        System.out.println(p100);

        return null;
    }

    @Override
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

        System.out.println(cvlan);
        System.out.println(p100);

        return null;
    }

    @Override
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

        System.out.println(cvlan);
        System.out.println(p100);

        return null;
    }

    @Override
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

        System.out.println(cvlan);

        return null;
    }

}
