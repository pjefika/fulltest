/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.gpon.alcatel;

import br.net.gvt.efika.efika_customer.model.customer.InventarioRede;
import br.net.gvt.efika.fulltest.exception.FalhaAoExecutarComandoException;
import br.net.gvt.efika.fulltest.exception.FuncIndisponivelDslamException;
import br.net.gvt.efika.fulltest.exception.SemGerenciaException;
import br.net.gvt.efika.fulltest.model.telecom.config.ComandoDslam;
import br.net.gvt.efika.fulltest.model.telecom.properties.DeviceMAC;
import br.net.gvt.efika.fulltest.model.telecom.properties.EnumEstadoVlan;
import br.net.gvt.efika.fulltest.model.telecom.properties.EstadoDaPorta;
import br.net.gvt.efika.fulltest.model.telecom.properties.Porta;
import br.net.gvt.efika.fulltest.model.telecom.properties.Profile;
import br.net.gvt.efika.fulltest.model.telecom.properties.ReConexao;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanBanda;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanMulticast;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanVod;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanVoip;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.AlarmesGpon;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.PortaPON;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.SerialOntGpon;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.TabelaParametrosGpon;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.VelocidadeVendor;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.Velocidades;
import dao.dslam.impl.gpon.DslamGpon;
import dao.dslam.impl.login.LoginRapido;
import dao.dslam.impl.retorno.TratativaRetornoUtil;
import java.util.ArrayList;
import java.util.List;
import model.dslam.credencial.Credencial;
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
    public void conectar() throws Exception {
        super.conectar();
    }

    @Override
    public void enableCommandsInDslam() throws Exception {
        if (this.getCd().consulta(this.getComandoInhibitAlarms()).getBlob().contains("Connection closed")) {
            throw new SemGerenciaException();
        }
        this.getCd().consulta(this.getComandoModeBatch());
        this.getCd().consulta(this.getComandoExit());
    }

    protected ComandoDslam getComandoInhibitAlarms() {
        return new ComandoDslam("environment inhibit-alarms");
    }

    protected ComandoDslam getComandoModeBatch() {
        return new ComandoDslam("environment mode batch");
    }

    protected ComandoDslam getComandoExit() {
        return new ComandoDslam("exit all");
    }

    protected ComandoDslam getComandoDumpRafael() {
        return new ComandoDslam("show equipment ont operational-data detail xml");
    }

    protected ComandoDslam getComandoPortaPON(InventarioRede i) {
        return new ComandoDslam("show equipment slot 1/1/" + i.getSlot() + " detail xml", 5000);
    }

    @Override
    public PortaPON getPortaPON(InventarioRede i) throws Exception {
        PortaPON porta = new PortaPON();

        ComandoDslam cmd = execComm(this.getComandoPortaPON(i));
        Document xml = TratativaRetornoUtil.stringXmlParse(cmd);
        String operStatus = TratativaRetornoUtil.getXmlParam(xml, "//info[@name='oper-status']");
        porta.setOperState(operStatus.equalsIgnoreCase("enabled"));
        porta.addInteracao(cmd);
        return porta;
    }

    /**
     * Função utilizada para demonstração (
     *
     * @return
     * @throws Exception
     */
    protected Document getDumpRafael() throws Exception {
        //Document xml;
        //xml = TratativaRetornoUtil.stringXmlParse(execComm(this.getComandoDumpRafael()));
        return TratativaRetornoUtil.stringXmlParse(execComm(this.getComandoDumpRafael()));
    }

    protected ComandoDslam getComandoTabelaParametros(InventarioRede i) {
        return new ComandoDslam("show equipment ont optics 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " detail xml", 5000);
    }

    @Override
    public TabelaParametrosGpon getTabelaParametros(InventarioRede i) throws Exception {
        ComandoDslam cmd = execComm(this.getComandoTabelaParametros(i));
        Document xml = TratativaRetornoUtil.stringXmlParse(cmd);
        String potOnt = TratativaRetornoUtil.getXmlParam(xml, "//info[@name='rx-signal-level']");
        String potOlt = TratativaRetornoUtil.getXmlParam(xml, "//info[@name='olt-rx-sig-level']");
        if (potOnt.equals("invalid") || potOnt.equals("unknown")) {
            potOnt = "0";
        }
        if (potOlt.equals("invalid") || potOlt.equals("unknown")) {
            potOlt = "0";
        }
        TabelaParametrosGpon tabParam = new TabelaParametrosGpon();
        tabParam.setPotOlt(new Double(potOlt));
        tabParam.setPotOnt(new Double(potOnt));
        tabParam.addInteracao(cmd);

        return tabParam;
    }

    protected ComandoDslam getComandoSerialOnt(InventarioRede i) {
        return new ComandoDslam("info configure equipment ont interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " detail xml", 5000);
    }

    /**
     * Metodo paliativo ate a alteracao de telnet para SOAP
     *
     * @param comm
     * @return
     * @throws Exception
     */
    private ComandoDslam execComm(ComandoDslam comm) throws Exception {
        ComandoDslam cmd = this.getCd().consulta(comm);
        try {
            TratativaRetornoUtil.stringXmlConfigData(cmd);
            return cmd;
        } catch (Exception e) {
            comm.setSleep(comm.getSleep() * 2);
            comm.setSleepAux(comm.getSleepAux() * 2);
            cmd = this.getCd().consulta(comm);
            TratativaRetornoUtil.stringXmlConfigData(cmd);
            return cmd;
        }

    }

    @Override
    public SerialOntGpon getSerialOnt(InventarioRede i) throws Exception {
        ComandoDslam cmd = execComm(this.getComandoSerialOnt(i));
        Document xml = TratativaRetornoUtil.stringXmlConfigData(cmd);
        String sernum = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='sernum']").replace(":", "");
        if (sernum.contains("ALCL00")) {
            sernum = "";
        }
        SerialOntGpon ont = new SerialOntGpon();
        ont.setSerial(sernum);
        ont.addInteracao(cmd);

        return ont;
    }

    protected ComandoDslam getComandoConsultaEstadoDaPorta(InventarioRede i) {
        return new ComandoDslam("info configure equipment ont interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " detail xml", 5000);
    }

    protected ComandoDslam getComandoConsultaEstadoDaPortaV2(InventarioRede i) {
        return new ComandoDslam("info configure equipment ont interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " xml", 5000);
    }

    @Override
    public EstadoDaPorta getEstadoDaPorta(InventarioRede i) throws Exception {
        ComandoDslam cmd = execComm(this.getComandoConsultaEstadoDaPortaV2(i));
        Document xml = TratativaRetornoUtil.stringXmlParse(cmd);
        String adminState = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='admin-state']");
        String operState = TratativaRetornoUtil.getXmlParam(xml, "//info[@name='oper-state']");

        EstadoDaPorta state = new EstadoDaPorta();
        state.setAdminState(adminState.equalsIgnoreCase("UP"));
        state.setOperState(operState.equalsIgnoreCase("UP"));
        state.addInteracao(cmd);

        return state;
    }

    protected ComandoDslam getComandoConsultaVlanBanda(InventarioRede i) {
        return new ComandoDslam("info configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/4/1 vlan-id 600 detail xml", 5000);
    }

    @Override
    public VlanBanda getVlanBanda(InventarioRede i) throws Exception {
        ComandoDslam consulta = execComm(this.getComandoConsultaVlanBanda(i));
        List<String> leResp = consulta.getRetorno();

        Integer svlan = new Integer("0");
        Integer cvlan = new Integer("0");
        EnumEstadoVlan state = EnumEstadoVlan.DOWN;
        if (!leResp.contains("Error : instance does not exist")) {
            try {
                Document xml = TratativaRetornoUtil.stringXmlParse(consulta);
                String leVlan = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='network-vlan']");
                if (leVlan.isEmpty()) {
                    leVlan = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='l2fwder-vlan']");
                }

                String[] pegaVlan = leVlan.split(":");
                svlan = new Integer(pegaVlan[1]);
                cvlan = new Integer(pegaVlan[2]);
                state = EnumEstadoVlan.UP;
            } catch (Exception e) {
            }

        }

        VlanBanda vlanBanda = new VlanBanda(cvlan, svlan, state);
        vlanBanda.addInteracao(consulta);
//        System.out.println(svlan);
//        System.out.println(cvlan);
        return vlanBanda;
    }

    protected ComandoDslam getComandoConsultaVlanVoip(InventarioRede i) {
        return new ComandoDslam("info configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/4/1 vlan-id 601 detail xml", 5000);
    }

    @Override
    public VlanVoip getVlanVoip(InventarioRede i) throws Exception {
        ComandoDslam consulta = execComm(this.getComandoConsultaVlanVoip(i));
        List<String> leResp = consulta.getRetorno();
        Integer cvlan = new Integer("0");
        Integer p100 = new Integer("0");
        EnumEstadoVlan state = EnumEstadoVlan.DOWN;
        if (!leResp.contains("Error : instance does not exist")) {
            try {
                Document xml = TratativaRetornoUtil.stringXmlParse(consulta);
                String leVlan = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='network-vlan']");
                if (leVlan.isEmpty()) {
                    leVlan = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='l2fwder-vlan']");
                }
                String[] pegaVlan = leVlan.split(":");
                cvlan = new Integer(pegaVlan[1]);
                p100 = new Integer(pegaVlan[2]);
                state = EnumEstadoVlan.UP;
            } catch (Exception e) {
            }

        }
        VlanVoip vlanVoip = new VlanVoip(p100, cvlan, state);
        vlanVoip.addInteracao(consulta);
//        System.out.println(cvlan);
//        System.out.println(p100);
        return vlanVoip;
    }

    protected ComandoDslam getComandoConsultaVlanVod(InventarioRede i) {
        return new ComandoDslam("info configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/4/1 vlan-id 602 detail xml", 5000);
    }

    @Override
    public VlanVod getVlanVod(InventarioRede i) throws Exception {
        ComandoDslam consulta = execComm(this.getComandoConsultaVlanVod(i));
        List<String> leResp = consulta.getRetorno();
        Integer cvlan = new Integer("0");
        Integer p100 = new Integer("0");
        EnumEstadoVlan state = EnumEstadoVlan.DOWN;
        if (!leResp.contains("Error : instance does not exist")) {
            try {
                Document xml = TratativaRetornoUtil.stringXmlParse(consulta);
                String leVlan = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='network-vlan']");
                if (leVlan.isEmpty()) {
                    leVlan = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='l2fwder-vlan']");
                }
                String[] pegaVlan = leVlan.split(":");
                cvlan = new Integer(pegaVlan[1]);
                p100 = new Integer(pegaVlan[2]);
                state = EnumEstadoVlan.UP;
            } catch (Exception e) {
            }

        }

        VlanVod vlanVod = new VlanVod(p100, cvlan, state);
        vlanVod.addInteracao(consulta);
//
//        System.out.println(cvlan);
//        System.out.println(p100);

        return vlanVod;
    }

    protected ComandoDslam getComandoConsultaVlanMulticast(InventarioRede i) {
        return new ComandoDslam("info configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/4/1 vlan-id 4000 detail xml", 5000);
    }

    @Override
    public VlanMulticast getVlanMulticast(InventarioRede i) throws Exception {
        ComandoDslam consulta = execComm(this.getComandoConsultaVlanMulticast(i));
        List<String> leResp = consulta.getRetorno();
        String leVlan = "";
        Integer svlan = new Integer("0");
        EnumEstadoVlan state = EnumEstadoVlan.DOWN;
        if (!leResp.contains("Error : instance does not exist")) {
            try {
                Document xml = TratativaRetornoUtil.stringXmlParse(consulta);
                leVlan = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='network-vlan']");
                if (leVlan.isEmpty()) {
                    leVlan = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='l2fwder-vlan']");
                }
            } catch (Exception e) {
            }

        }
        if (!leVlan.isEmpty()) {
            svlan = new Integer("4000");
            state = EnumEstadoVlan.UP;
        }

        VlanMulticast multz = new VlanMulticast();
        multz.setSvlan(svlan);
        multz.setState(state);
        multz.addInteracao(consulta);

//        System.out.println(svlan);
        return multz;
    }

    protected ComandoDslam getComandoConsultaAlarmes(InventarioRede i) {
        return new ComandoDslam("show equipment ont operational-data 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " detail xml", 9000);
    }

    @Override
    public AlarmesGpon getAlarmes(InventarioRede i) throws Exception {
        ComandoDslam cmd = execComm(this.getComandoConsultaAlarmes(i));
        Document xml = TratativaRetornoUtil.stringXmlParse(cmd);
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
        alarmes.addInteracao(cmd);
//        System.out.println(alarmes.getListAlarmes());

        return alarmes;
    }

    protected ComandoDslam getComandoConsultaProfile(InventarioRede i) {
        return new ComandoDslam("info configure qos interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/4/1 xml", 7500);
    }

    @Override
    public Profile getProfile(InventarioRede i) throws Exception {
        ComandoDslam cmd = execComm(this.getComandoConsultaProfile(i));
        Document xml = TratativaRetornoUtil.stringXmlParse(cmd);

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
        prof.setDown(compare(profileDown, true));
        prof.setUp(compare(profileUp, false));
        prof.addInteracao(cmd);

//        System.out.println(prof.getDown());
//        System.out.println(prof.getUp());
        return prof;
    }

    @Override
    public List<VelocidadeVendor> obterVelocidadesUpVendor() {
        if (velsUp.isEmpty()) {
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_1024, "HSI_1M_RETAIL_UP"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_2048, "HSI_2M_RETAIL_UP"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_3072, "HSI_3M_RETAIL_UP"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_5120, "HSI_5M_RETAIL_UP"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_12800, "HSI_12.5M_RETAIL_UP"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_25600, "HSI_25M_RETAIL_UP"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_51200, "HSI_50M_RETAIL_UP"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_76800, "HSI_75M_RETAIL_UP"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_102400, "HSI_100M_RETAIL_UP"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_153600, "HSI_150M_RETAIL_UP"));
        }

        return velsUp;
    }

    @Override
    public List<VelocidadeVendor> obterVelocidadesDownVendor() {
        if (velsDown.isEmpty()) {
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_1024, "HSI_1M_RETAIL_DOWN"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_3072, "HSI_3M_RETAIL_DOWN"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_5120, "HSI_5M_RETAIL_DOWN"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_10240, "HSI_10M_RETAIL_DOWN"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_15360, "HSI_15M_RETAIL_DOWN"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_25600, "HSI_25M_RETAIL_DOWN"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_35840, "HSI_35M_RETAIL_DOWN"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_51200, "HSI_50M_RETAIL_DOWN"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_102400, "HSI_100M_RETAIL_DOWN"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_153600, "HSI_150M_RETAIL_DOWN"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_204800, "HSI_200M_RETAIL_DOWN"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_307200, "HSI_300M_RETAIL_DOWN"));
        }

        return velsDown;
    }

    protected ComandoDslam getComandoConsultaDeviceMAC(InventarioRede i) {
        return new ComandoDslam("show vlan bridge-port-fdb 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/4/1 xml", 9000);
    }

    @Override
    public DeviceMAC getDeviceMac(InventarioRede i) throws Exception {
        ComandoDslam cmd = execComm(this.getComandoConsultaDeviceMAC(i));
        Document xml = TratativaRetornoUtil.stringXmlParse(cmd);
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
        DeviceMAC m = new DeviceMAC(leMac.toUpperCase());
        m.addInteracao(cmd);
        return m;
    }

    protected ComandoDslam getComandoSetEstadoDaPorta(InventarioRede i, EstadoDaPorta e) {
        return new ComandoDslam("configure equipment ont interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " admin-state " + e.toString(), 3000);
    }

    @Override
    public EstadoDaPorta setEstadoDaPorta(InventarioRede i, EstadoDaPorta e) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoSetEstadoDaPorta(i, e));
        if (cmd.getBlob().contains("Error :")) {
            throw new FalhaAoExecutarComandoException();
        }
        EstadoDaPorta es = getEstadoDaPorta(i);
        es.getInteracoes().add(0, cmd);
        return es;
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
        ComandoDslam cmd = getCd().consulta(getComandoSetOntToOlt(i, s));
        List<String> leResp = cmd.getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
        SerialOntGpon se = getSerialOnt(i);
        se.getInteracoes().add(0, cmd);
        return se;
    }

    protected ComandoDslam getComandoSetProfileDown(InventarioRede i, Velocidades v) {
        return new ComandoDslam("configure qos interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/4/1 queue 0 shaper-profile name:" + compare(v, true).getSintaxVel());
    }

    protected ComandoDslam getComandoSetProfileUp(InventarioRede i, Velocidades v) {
        return new ComandoDslam("configure qos interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/4/1 upstream-queue 0 bandwidth-profile name:" + compare(v, false).getSintaxVel());
    }

    @Override
    public Profile setProfileDown(InventarioRede i, Velocidades v) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoSetProfileDown(i, v));
//        List<String> leResp = cmd.getRetorno();
        Profile p = getProfile(i);
        p.getInteracoes().add(0, cmd);
        return p;
    }

    @Override
    public Profile setProfileUp(InventarioRede i, Velocidades vDown, Velocidades vUp) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoSetProfileUp(i, vUp));
        Profile p = getProfile(i);
        p.getInteracoes().add(0, cmd);
        return p;
    }

    protected ComandoDslam getComandoCreateVlanBanda(InventarioRede i) {
        return new ComandoDslam("configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/4/1 vlan-id 600 tag single-tagged network-vlan stacked:" + i.getRin() + ":" + i.getCvlan() + " vlan-scope local");
    }

    @Override
    public VlanBanda createVlanBanda(InventarioRede i, Velocidades vDown, Velocidades vUp) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoCreateVlanBanda(i));
        VlanBanda v = getVlanBanda(i);
        v.getInteracoes().add(0, cmd);
        return v;
    }

    protected ComandoDslam getComandoCreateVlanVoip(InventarioRede i) {
        return new ComandoDslam("configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/4/1 vlan-id 601 tag single-tagged network-vlan stacked:" + i.getVlanVoip() + ":" + i.getCvlan() + " vlan-scope local qos profile:14");
    }

    @Override
    public VlanVoip createVlanVoip(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoCreateVlanVoip(i));
        VlanVoip v = getVlanVoip(i);
        v.getInteracoes().add(0, cmd);
        return v;
    }

    protected ComandoDslam getComandoCreateVlanVod(InventarioRede i) {
        return new ComandoDslam("configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/4/1 vlan-id 602 tag single-tagged network-vlan stacked:" + i.getVlanVod() + ":" + i.getCvlan() + " vlan-scope local qos profile:12");
    }

    @Override
    public VlanVod createVlanVod(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoCreateVlanVod(i));
        VlanVod v = getVlanVod(i);
        v.getInteracoes().add(0, cmd);
        return v;
    }

    protected ComandoDslam getComandoCreateVlanMulticast(InventarioRede i) {
        return new ComandoDslam("configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/4/1 vlan-id 4000 tag single-tagged qos profile:13");
    }

    @Override
    public VlanMulticast createVlanMulticast(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoCreateVlanMulticast(i));
        VlanMulticast v = getVlanMulticast(i);
        v.getInteracoes().add(0, cmd);
        return v;
    }

    protected ComandoDslam getComandoUnsetOntFromOlt(InventarioRede i) {
        return new ComandoDslam("configure equipment ont interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " no sernum");
    }

    @Override
    public SerialOntGpon unsetOntFromOlt(InventarioRede i) throws Exception {
        EstadoDaPorta e = new EstadoDaPorta();
        e.setAdminState(Boolean.FALSE);
        ComandoDslam cmd0 = getCd().consulta(getComandoSetEstadoDaPorta(i, e));
        ComandoDslam cmd1 = getCd().consulta(getComandoUnsetOntFromOlt(i));
        e.setAdminState(Boolean.TRUE);
        ComandoDslam cmd2 = getCd().consulta(getComandoSetEstadoDaPorta(i, e));
        SerialOntGpon s = getSerialOnt(i);
        s.getInteracoes().add(0, cmd2);
        s.getInteracoes().add(0, cmd1);
        s.getInteracoes().add(0, cmd0);
        return s;
    }

    protected ComandoDslam getComandoDeleteVlanBanda(InventarioRede i) {
        return new ComandoDslam("configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/4/1 no vlan-id 600");
    }

    @Override
    public VlanBanda deleteVlanBanda(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoDeleteVlanBanda(i));
        VlanBanda v = getVlanBanda(i);
        v.getInteracoes().add(0, cmd);
        return v;
    }

    protected ComandoDslam getComandoDeleteVlanVoip(InventarioRede i) {
        return new ComandoDslam("configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/4/1 no vlan-id 601");
    }

    @Override
    public VlanVoip deleteVlanVoip(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoDeleteVlanVoip(i));
        VlanVoip v = getVlanVoip(i);
        v.getInteracoes().add(0, cmd);
        return v;
    }

    protected ComandoDslam getComandoDeleteVlanVod(InventarioRede i) {
        return new ComandoDslam("configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/4/1 no vlan-id 602");
    }

    @Override
    public VlanVod deleteVlanVod(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoDeleteVlanVod(i));
        VlanVod v = getVlanVod(i);
        v.getInteracoes().add(0, cmd);
        return v;
    }

    protected ComandoDslam getComandoDeleteVlanMulticast(InventarioRede i) {
        return new ComandoDslam("configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/4/1 no vlan-id 4000");
    }

    @Override
    public VlanMulticast deleteVlanMulticast(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoDeleteVlanMulticast(i));
        VlanMulticast v = getVlanMulticast(i);
        v.getInteracoes().add(0, cmd);
        return v;
    }

//    @Override
//    public Profile castProfile(Velocidades v) {
//        Profile p = new Profile();
//
//        p.setProfileDown("HSI_" + v.getVel() + "M_RETAIL_DOWN");
//        p.setProfileUp("HSI_" + v.getVel() + "M_RETAIL_UP");
//
//        return p;
//    }
    protected ComandoDslam getComandoListaOntPorSlot() {
        return new ComandoDslam("show pon unprovision-onu xml", 5000);
    }

    @Override
    public List<SerialOntGpon> getSlotsAvailableOnts(InventarioRede i) throws Exception {
        ComandoDslam cmd = execComm(this.getComandoListaOntPorSlot());
        Document xml = TratativaRetornoUtil.stringXmlParse(cmd);
        NodeList nodeList = xml.getElementsByTagName("info");
        List<SerialOntGpon> serialList = new ArrayList<>();
        for (int e = 0; e < nodeList.getLength(); e++) {
            Node node = nodeList.item(e);

            if (node.getTextContent().contains("1/1/")) {
                String[] slotPorta = node.getTextContent().split("/");
                SerialOntGpon s = new SerialOntGpon();
                s.setSerial(node.getNextSibling().getNextSibling().getTextContent());
                s.setPorta(new Integer(slotPorta[3]));
                s.setSlot(new Integer(slotPorta[2]));
                serialList.add(s);
            }

        }
        if (serialList.size() > 0) {
            serialList.get(0).addInteracao(cmd);
        } else {
            SerialOntGpon s = new SerialOntGpon();
            s.addInteracao(cmd);
            serialList.add(s);
        }
        return serialList;
    }

    @Override
    public List<Porta> getEstadoPortasProximas(InventarioRede i) throws Exception {
        InventarioRede inventario = i;
        List<Porta> list = new ArrayList<>();
        for (int j = 1; j < 33; j++) {
            inventario.setLogica(j);
            EstadoDaPorta estado = getEstadoDaPorta(inventario);
            Porta porta = new Porta();
            porta.setEstadoPorta(estado);
            porta.setNumPorta(j);
            list.add(porta);
        }
        return list;
    }

    @Override
    public ReConexao getReconexoes(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }

}
