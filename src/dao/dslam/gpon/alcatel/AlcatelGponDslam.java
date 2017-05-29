/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.gpon.alcatel;

import dao.dslam.ComandoDslam;
import dao.dslam.ConsultaDslam;
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
import dao.dslam.login.LoginRapido;
import model.dslam.retorno.TratativaRetornoUtil;
import dao.dslam.gpon.DslamGpon;
import model.entity.Cliente;
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

    @Override
    public void conectar() {
        super.conectar();
        try {
            this.getCd().consulta(this.getComandoInhibitAlarms());
            this.getCd().consulta(this.getComandoModeBatch());
            this.getCd().consulta(this.getComandoExit());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public ComandoDslam getComandoInhibitAlarms() {
        return new ComandoDslam("environment inhibit-alarms", 100);
    }

    public ComandoDslam getComandoModeBatch() {
        return new ComandoDslam("environment mode batch", 100);
    }

    public ComandoDslam getComandoExit() {
        return new ComandoDslam("exit", 100);
    }

    public ComandoDslam getComandoDumpRafael() {
        return new ComandoDslam("show equipment ont operational-data detail xml", 1000);
    }

    /**
     * Função utilizada para demonstração (
     *
     * @return
     * @throws Exception
     */
    public Document getDumpRafael() throws Exception {
        //Document xml;
        //xml = TratativaRetornoUtil.stringXmlParse(this.getCd().consulta(this.getComandoDumpRafael()));
        return TratativaRetornoUtil.stringXmlParse(this.getCd().consulta(this.getComandoDumpRafael()));
    }

    public ComandoDslam getComandoTabelaParametros() {
        return new ComandoDslam("show equipment ont optics 1/1/" + this.getSlot() + "/" + this.getPorta() + "/" + this.getLogica() + " detail xml", 5000);
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
        return new ComandoDslam("info configure equipment ont interface 1/1/" + this.getSlot() + "/" + this.getPorta() + "/" + this.getLogica() + " detail xml", 5000);
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
    public VlanBanda getVlanBanda() throws Exception {
        List<String> leResp = this.getCd().consulta(this.getComandoConsultaVlanBanda()).getRetorno();
        BigInteger cvlan = new BigInteger("0");
        BigInteger p100 = new BigInteger("0");
        if (!leResp.contains("Error : instance does not exist")) {
            Document xml = TratativaRetornoUtil.stringXmlParse(this.getCd().consulta(this.getComandoConsultaVlanBanda()));
            String leVlan = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='network-vlan']");
            if (leVlan.isEmpty()) {
                leVlan = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='l2fwder-vlan']");
            }

            String[] pegaVlan = leVlan.split(":");
            cvlan = new BigInteger(pegaVlan[1]);
            p100 = new BigInteger(pegaVlan[2]);
        }

        VlanBanda vlanBanda = new VlanBanda(cvlan, p100);

        System.out.println(cvlan);
        System.out.println(p100);

        return vlanBanda;
    }

    public ComandoDslam getComandoConsultaVlanVoip() {
        return new ComandoDslam("info configure bridge port 1/1/" + this.getSlot() + "/" + this.getPorta() + "/" + this.getLogica() + "/4/1 vlan-id 601 detail xml");
    }

    @Override
    public VlanVoip getVlanVoip() throws Exception {
        List<String> leResp = this.getCd().consulta(this.getComandoConsultaVlanVoip()).getRetorno();
        BigInteger cvlan = new BigInteger("0");
        BigInteger p100 = new BigInteger("0");
        if (!leResp.contains("Error : instance does not exist")) {
            Document xml = TratativaRetornoUtil.stringXmlParse(this.getCd().consulta(this.getComandoConsultaVlanVoip()));
            String leVlan = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='network-vlan']");
            if (leVlan.isEmpty()) {
                leVlan = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='l2fwder-vlan']");
            }
            String[] pegaVlan = leVlan.split(":");
            cvlan = new BigInteger(pegaVlan[1]);
            p100 = new BigInteger(pegaVlan[2]);
        }
        VlanVoip vlanVoip = new VlanVoip(cvlan, p100);

        System.out.println(cvlan);
        System.out.println(p100);

        return vlanVoip;
    }

    public ComandoDslam getComandoConsultaVlanVod() {
        return new ComandoDslam("info configure bridge port 1/1/" + this.getSlot() + "/" + this.getPorta() + "/" + this.getLogica() + "/4/1 vlan-id 602 detail xml");
    }

    @Override
    public VlanVod getVlanVod() throws Exception {
        List<String> leResp = this.getCd().consulta(this.getComandoConsultaVlanVod()).getRetorno();
        BigInteger cvlan = new BigInteger("0");
        BigInteger p100 = new BigInteger("0");
        if (!leResp.contains("Error : instance does not exist")) {
            Document xml = TratativaRetornoUtil.stringXmlParse(this.getCd().consulta(this.getComandoConsultaVlanVod()));
            String leVlan = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='network-vlan']");
            if (leVlan.isEmpty()) {
                leVlan = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='l2fwder-vlan']");
            }
            String[] pegaVlan = leVlan.split(":");
            cvlan = new BigInteger(pegaVlan[1]);
            p100 = new BigInteger(pegaVlan[2]);
        }

        VlanVod vlanVod = new VlanVod(cvlan, p100);

        System.out.println(cvlan);
        System.out.println(p100);

        return vlanVod;
    }

    public ComandoDslam getComandoConsultaVlanMulticast() {
        return new ComandoDslam("info configure bridge port 1/1/" + this.getSlot() + "/" + this.getPorta() + "/" + this.getLogica() + "/4/1 vlan-id 4000 detail xml");
    }

    @Override
    public VlanMulticast getVlanMulticast() throws Exception {
        List<String> leResp = this.getCd().consulta(this.getComandoConsultaVlanMulticast()).getRetorno();
        String leVlan = "";
        BigInteger cvlan = new BigInteger("0");
        if (!leResp.contains("Error : instance does not exist")) {
            Document xml = TratativaRetornoUtil.stringXmlParse(this.getCd().consulta(this.getComandoConsultaVlanMulticast()));
            leVlan = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='network-vlan']");
            if (leVlan.isEmpty()) {
                leVlan = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='l2fwder-vlan']");
            }
        }
        if (!leVlan.isEmpty()) {
            cvlan = new BigInteger("4000");
        }

        VlanMulticast multz = new VlanMulticast();
        multz.setCvlan(cvlan);

        System.out.println(cvlan);

        return multz;
    }

    public ComandoDslam getComandoConsultaAlarmes() {
        return new ComandoDslam("show equipment ont operational-data 1/1/" + this.getSlot() + "/" + this.getPorta() + "/" + this.getLogica() + " detail xml", 9000);
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

            if (estadoAlarme.equalsIgnoreCase("yes")) {
                alarmes.getListAlarmes().add(nomeAlarme);
            }

        }
        System.out.println(alarmes.getListAlarmes());

        return alarmes;
    }

    public ComandoDslam getComandoConsultaProfile() {
        return new ComandoDslam("info configure qos interface 1/1/" + this.getSlot() + "/" + this.getPorta() + "/" + this.getLogica() + "/4/1 xml", 5000);
    }

    @Override
    public Profile getProfile() throws Exception {
        Document xml = TratativaRetornoUtil.stringXmlParse(this.getCd().consulta(this.getComandoConsultaProfile()));

        String leProfileDown = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='shaper-profile']");
        String profileDown = leProfileDown.substring(5, leProfileDown.length());
        String leProfileUp = TratativaRetornoUtil.getXmlParam(xml, "(//parameter[@name='bandwidth-profile'])[1]");
        if (leProfileUp.length() < 5) {
            leProfileUp = TratativaRetornoUtil.getXmlParam(xml, "(//parameter[@name='bandwidth-profile'])[2]");
        }
        System.out.println("Profs " + leProfileUp);
        String profileUp = leProfileUp.substring(5, leProfileUp.length());

        Profile prof = new Profile();
        prof.setProfileDown(profileDown);
        prof.setProfileUp(profileUp);

        System.out.println(prof.getProfileDown());
        System.out.println(prof.getProfileUp());

        return prof;
    }

    @Override
    public Cliente consultar(Cliente c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
