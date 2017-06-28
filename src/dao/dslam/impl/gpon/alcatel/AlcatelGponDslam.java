/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.gpon.alcatel;

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
import model.dslam.velocidade.Velocidades;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author G0042204
 */
public class AlcatelGponDslam extends DslamGpon {

    public AlcatelGponDslam(String ipDslam) {
        super(ipDslam, Credencial.ALCATEL, new LoginRapido());
    }

    @Override
    public void conectar() {
        super.conectar();
        try {
            this.getCd().consulta(this.getComandoInhibitAlarms());
//            this.getCd().consulta(this.getComandoModeBatch());
            this.getCd().consulta(this.getComandoExit());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    protected ComandoDslam getComandoInhibitAlarms() {
        return new ComandoDslam("environment inhibit-alarms", 100);
    }

    protected ComandoDslam getComandoModeBatch() {
        return new ComandoDslam("environment mode batch", 100);
    }

    protected ComandoDslam getComandoExit() {
        return new ComandoDslam("exit all", 100);
    }

    protected ComandoDslam getComandoDumpRafael() {
        return new ComandoDslam("show equipment ont operational-data detail xml", 1000);
    }

    /**
     * Função utilizada para demonstração (
     *
     * @return
     * @throws Exception
     */
    protected Document getDumpRafael() throws Exception {
        //Document xml;
        //xml = TratativaRetornoUtil.stringXmlParse(this.getCd().consulta(this.getComandoDumpRafael()));
        return TratativaRetornoUtil.stringXmlParse(this.getCd().consulta(this.getComandoDumpRafael()));
    }

    protected ComandoDslam getComandoTabelaParametros(InventarioRede i) {
        return new ComandoDslam("show equipment ont optics 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " detail xml", 5000);
    }

    @Override
    public TabelaParametrosGpon getTabelaParametros(InventarioRede i) throws Exception {

        Document xml;
        xml = TratativaRetornoUtil.stringXmlParse(this.getCd().consulta(this.getComandoTabelaParametros(i)));
        String potOnt = TratativaRetornoUtil.getXmlParam(xml, "//info[@name='rx-signal-level']");
        String potOlt = TratativaRetornoUtil.getXmlParam(xml, "//info[@name='olt-rx-sig-level']");
        TabelaParametrosGpon tabParam = new TabelaParametrosGpon();
        tabParam.setPotOlt(new Double(potOlt));
        tabParam.setPotOnt(new Double(potOnt));
        System.out.println(potOnt + " | " + potOlt);

        return tabParam;
    }

    protected ComandoDslam getComandoSerialOnt(InventarioRede i) {
        return new ComandoDslam("info configure equipment ont interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " detail xml");
    }

    @Override
    public SerialOntGpon getSerialOnt(InventarioRede i) throws Exception {
        Document xml = TratativaRetornoUtil.stringXmlParse(this.getCd().consulta(this.getComandoSerialOnt(i)));
        String sernum = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='sernum']").replace(":", "");

        SerialOntGpon ont = new SerialOntGpon();
        ont.setSerial(sernum);
        System.out.println(sernum);

        return ont;
    }

    protected ComandoDslam getComandoConsultaEstadoDaPorta(InventarioRede i) {
        return new ComandoDslam("info configure equipment ont interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " detail xml", 5000);
    }

    @Override
    public EstadoDaPorta getEstadoDaPorta(InventarioRede i) throws Exception {
        Document xml = TratativaRetornoUtil.stringXmlParse(this.getCd().consulta(this.getComandoConsultaEstadoDaPorta(i)));
        String adminState = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='admin-state']");
        String operState = TratativaRetornoUtil.getXmlParam(xml, "//info[@name='oper-state']");

        EstadoDaPorta state = new EstadoDaPorta();

        state.setAdminState(adminState);
        state.setOperState(operState);

        return state;
    }

    protected ComandoDslam getComandoConsultaVlanBanda(InventarioRede i) {
        return new ComandoDslam("info configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/4/1 vlan-id 600 detail xml");
    }

    @Override
    public VlanBanda getVlanBanda(InventarioRede i) throws Exception {
        ComandoDslam consulta = this.getCd().consulta(this.getComandoConsultaVlanBanda(i));
        List<String> leResp = consulta.getRetorno();
        Integer cvlan = new Integer("0");
        Integer p100 = new Integer("0");
        EnumEstadoVlan state = EnumEstadoVlan.DOWN;
        if (!leResp.contains("Error : instance does not exist")) {
            Document xml = TratativaRetornoUtil.stringXmlParse(consulta);
            String leVlan = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='network-vlan']");
            if (leVlan.isEmpty()) {
                leVlan = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='l2fwder-vlan']");
            }

            String[] pegaVlan = leVlan.split(":");
            cvlan = new Integer(pegaVlan[1]);
            p100 = new Integer(pegaVlan[2]);
            state = EnumEstadoVlan.UP;
        }

        VlanBanda vlanBanda = new VlanBanda(cvlan, p100, state);

        System.out.println(cvlan);
        System.out.println(p100);

        return vlanBanda;
    }

    protected ComandoDslam getComandoConsultaVlanVoip(InventarioRede i) {
        return new ComandoDslam("info configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/4/1 vlan-id 601 detail xml");
    }

    @Override
    public VlanVoip getVlanVoip(InventarioRede i) throws Exception {
        ComandoDslam consulta = this.getCd().consulta(this.getComandoConsultaVlanVoip(i));
        List<String> leResp = consulta.getRetorno();
        Integer cvlan = new Integer("0");
        Integer p100 = new Integer("0");
        EnumEstadoVlan state = EnumEstadoVlan.DOWN;
        if (!leResp.contains("Error : instance does not exist")) {
            Document xml = TratativaRetornoUtil.stringXmlParse(consulta);
            String leVlan = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='network-vlan']");
            if (leVlan.isEmpty()) {
                leVlan = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='l2fwder-vlan']");
            }
            String[] pegaVlan = leVlan.split(":");
            cvlan = new Integer(pegaVlan[1]);
            p100 = new Integer(pegaVlan[2]);
            state = EnumEstadoVlan.UP;
        }
        VlanVoip vlanVoip = new VlanVoip(p100, cvlan, state);

        System.out.println(cvlan);
        System.out.println(p100);

        return vlanVoip;
    }

    protected ComandoDslam getComandoConsultaVlanVod(InventarioRede i) {
        return new ComandoDslam("info configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/4/1 vlan-id 602 detail xml");
    }

    @Override
    public VlanVod getVlanVod(InventarioRede i) throws Exception {
        ComandoDslam consulta = this.getCd().consulta(this.getComandoConsultaVlanVod(i));
        List<String> leResp = consulta.getRetorno();
        Integer cvlan = new Integer("0");
        Integer p100 = new Integer("0");
        EnumEstadoVlan state = EnumEstadoVlan.DOWN;
        if (!leResp.contains("Error : instance does not exist")) {
            Document xml = TratativaRetornoUtil.stringXmlParse(consulta);
            String leVlan = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='network-vlan']");
            if (leVlan.isEmpty()) {
                leVlan = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='l2fwder-vlan']");
            }
            String[] pegaVlan = leVlan.split(":");
            cvlan = new Integer(pegaVlan[1]);
            p100 = new Integer(pegaVlan[2]);
            state = EnumEstadoVlan.UP;
        }

        VlanVod vlanVod = new VlanVod(p100, cvlan, state);

        System.out.println(cvlan);
        System.out.println(p100);

        return vlanVod;
    }

    protected ComandoDslam getComandoConsultaVlanMulticast(InventarioRede i) {
        return new ComandoDslam("info configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/4/1 vlan-id 4000 detail xml");
    }

    @Override
    public VlanMulticast getVlanMulticast(InventarioRede i) throws Exception {
        ComandoDslam consulta = this.getCd().consulta(this.getComandoConsultaVlanMulticast(i));
        List<String> leResp = consulta.getRetorno();
        String leVlan = "";
        Integer cvlan = new Integer("0");
        EnumEstadoVlan state = EnumEstadoVlan.DOWN;
        if (!leResp.contains("Error : instance does not exist")) {
            Document xml = TratativaRetornoUtil.stringXmlParse(consulta);
            leVlan = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='network-vlan']");
            if (leVlan.isEmpty()) {
                leVlan = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='l2fwder-vlan']");
            }
        }
        if (!leVlan.isEmpty()) {
            cvlan = new Integer("4000");
            state = EnumEstadoVlan.UP;
        }

        VlanMulticast multz = new VlanMulticast();
        multz.setCvlan(cvlan);
        multz.setState(state);

        System.out.println(cvlan);

        return multz;
    }

    protected ComandoDslam getComandoConsultaAlarmes(InventarioRede i) {
        return new ComandoDslam("show equipment ont operational-data 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " detail xml", 9000);
    }

    @Override
    public AlarmesGpon getAlarmes(InventarioRede i) throws Exception {
        Document xml = TratativaRetornoUtil.stringXmlParse(this.getCd().consulta(this.getComandoConsultaAlarmes(i)));
        NodeList nodeList = xml.getElementsByTagName("info");
        AlarmesGpon alarmes = new AlarmesGpon();

        for (int e = 0; e < nodeList.getLength(); e++) {
            Node node = nodeList.item(e);

            String nomeAlarme = node.getAttributes().getNamedItem("name").getTextContent().trim();
            String estadoAlarme = node.getTextContent().trim();

            if (estadoAlarme.equalsIgnoreCase("yes")) {
                alarmes.getListAlarmes().add(nomeAlarme);
            }

        }
        System.out.println(alarmes.getListAlarmes());

        return alarmes;
    }

    protected ComandoDslam getComandoConsultaProfile(InventarioRede i) {
        return new ComandoDslam("info configure qos interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/4/1 xml", 5000);
    }

    @Override
    public Profile getProfile(InventarioRede i) throws Exception {
        Document xml = TratativaRetornoUtil.stringXmlParse(this.getCd().consulta(this.getComandoConsultaProfile(i)));

        String leProfileDown = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='shaper-profile']");
        String profileDown = leProfileDown.substring(5, leProfileDown.length());
        String leProfileUp = TratativaRetornoUtil.getXmlParam(xml, "(//parameter[@name='bandwidth-profile'])[1]");
        if (leProfileUp.length() < 5) {
            leProfileUp = TratativaRetornoUtil.getXmlParam(xml, "(//parameter[@name='bandwidth-profile'])[2]");
        }
        String profileUp = leProfileUp.substring(5, leProfileUp.length());

        Profile prof = new Profile();
        prof.setProfileDown(profileDown);
        prof.setProfileUp(profileUp);

        System.out.println(prof.getProfileDown());
        System.out.println(prof.getProfileUp());

        return prof;
    }

    protected ComandoDslam getComandoConsultaDeviceMAC(InventarioRede i) {
        return new ComandoDslam("show vlan bridge-port-fdb 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/4/1 xml", 5000);
    }

    @Override
    public DeviceMAC getDeviceMac(InventarioRede i) throws Exception {
        Document xml = TratativaRetornoUtil.stringXmlParse(this.getCd().consulta(this.getComandoConsultaDeviceMAC(i)));
        NodeList nodeList = xml.getElementsByTagName("instance");
        Integer e;
        String leMac = "";
        for (e = 0; e < nodeList.getLength(); e++) {
            NodeList listin = nodeList.item(e).getChildNodes();
            Integer o;
            for (o = 0; o < listin.getLength(); o++) {
                System.out.println("item " + o + " ->" + listin.item(o).getTextContent());
                if (listin.item(o).getTextContent().equals("600")) {
                    Node leNode = listin.item(o).getNextSibling();
                    leMac = leNode.getNextSibling().getTextContent();
                }
            }
        }
        return new DeviceMAC(leMac.toUpperCase());
    }

    protected ComandoDslam getComandoSetEstadoDaPorta(InventarioRede i, EstadoDaPorta e) {
        return new ComandoDslam("configure equipment ont interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " admin-state " + e.getAdminState());
    }

    @Override
    public EstadoDaPorta setEstadoDaPorta(InventarioRede i, EstadoDaPorta e) throws Exception {
        getCd().consulta(getComandoSetEstadoDaPorta(i, e));
        return getEstadoDaPorta(i);
    }

    protected ComandoDslam getComandoSetOntToOlt(InventarioRede i, SerialOntGpon s) {
        return new ComandoDslam("configure equipment ont interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " sw-ver-pland disabled sernum " + s.getSerial());
    }

    @Override
    public SerialOntGpon setOntToOlt(InventarioRede i, SerialOntGpon s) throws Exception {
        if (!s.getSerial().contains(":")) {
            String first = s.getSerial().substring(0, 4);
            String second = s.getSerial().substring(4, s.getSerial().length());
            System.out.println(first);
            System.out.println(second);
            s.setSerial(first + ":" + second);
            System.out.println(s.getSerial());
        }
        List<String> leResp = getCd().consulta(getComandoSetOntToOlt(i, s)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
        return getSerialOnt(i);
    }

    protected ComandoDslam getComandoSetProfileDown(InventarioRede i, Velocidades v) {
        return new ComandoDslam("configure qos interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/4/1 queue 0 shaper-profile name:" + castProfile(v).getProfileDown());
    }

    protected ComandoDslam getComandoSetProfileUp(InventarioRede i, Velocidades v) {
        return new ComandoDslam("configure qos interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/4/1 upstream-queue 0 bandwidth-profile name:" + castProfile(v).getProfileUp());
    }

    @Override
    public Profile setProfileDown(InventarioRede i, Velocidades v) throws Exception {
        List<String> leResp = getCd().consulta(getComandoSetProfileDown(i, v)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
        return getProfile(i);
    }

    @Override
    public Profile setProfileUp(InventarioRede i, Velocidades v) throws Exception {
        List<String> leResp = getCd().consulta(getComandoSetProfileUp(i, v)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
        return getProfile(i);
    }

    protected ComandoDslam getComandoCreateVlanBanda(InventarioRede i) {
        return new ComandoDslam("configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/4/1 vlan-id 600 tag single-tagged network-vlan stacked:" + i.getRin() + ":" + i.getCvLan() + " vlan-scope local");
    }

    @Override
    public VlanBanda createVlanBanda(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VlanVoip createVlanVoip(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VlanVod createVlanVod(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VlanMulticast createVlanMulticast(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void unsetOntFromOlt(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteVlanBanda(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteVlanVoip(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteVlanVod(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteVlanMulticast(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Profile castProfile(Velocidades v) {
        Profile p = new Profile();

        p.setProfileDown("HSI_" + v.getVel() + "M_RETAIL_DOWN");
        p.setProfileUp("HSI_" + v.getVel() + "M_RETAIL_UP");

        return p;
    }

}
