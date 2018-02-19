/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.gpon.alcatel;

import br.net.gvt.efika.customer.InventarioRede;
import dao.dslam.factory.exception.FalhaAoConsultarException;
import dao.dslam.factory.exception.FalhaLoginDslamException;
import dao.dslam.impl.ComandoDslam;
import dao.dslam.impl.gpon.DslamVivo1;
import dao.dslam.impl.login.LoginComJump;
import dao.dslam.impl.retorno.TratativaRetornoUtil;
import java.util.ArrayList;
import java.util.List;
import model.dslam.credencial.Credencial;
import org.w3c.dom.Document;
import telecom.properties.DeviceMAC;
import telecom.properties.EnumEstadoVlan;
import telecom.properties.EstadoDaPorta;
import telecom.properties.Porta;
import telecom.properties.Profile;
import telecom.properties.ProfileVivo1;
import telecom.properties.ReConexao;
import telecom.properties.VlanBanda;
import telecom.properties.VlanMulticast;
import telecom.properties.VlanVod;
import telecom.properties.VlanVodVivo1Alcatel;
import telecom.properties.VlanVoip;
import telecom.properties.VlanVoipVivo1;
import telecom.properties.gpon.AlarmesGpon;
import telecom.properties.gpon.PortaPON;
import telecom.properties.gpon.SerialOntGpon;
import telecom.properties.gpon.TabelaParametrosGpon;
import telecom.velocidade.VelocidadeVendor;
import telecom.velocidade.Velocidades;

/**
 *
 * @author G0034481
 */
public class Alcatel7302GponDslamVivo1 extends DslamVivo1 {

    //private transient EstadoDaPorta estadoDaPorta;
    public Alcatel7302GponDslamVivo1(String ipDslam) {
        super(ipDslam, Credencial.VIVO1, new LoginComJump());
    }

    @Override
    public void conectar() throws Exception {
        super.conectar();
    }

    @Override
    public void enableCommandsInDslam() throws Exception {
        if (this.getCd().consulta(this.getComandoEnableConfig()).getBlob().contains("Login incorrect")) {
            throw new FalhaLoginDslamException("Credenciais incorretas");
        }
    }

    protected ComandoDslam getComandoEnableConfig() {
        return new ComandoDslam("environment inhibit-alarms", 500, "environment mode batch", 500, "exit");
    }

    protected ComandoDslam getComandoPortaPON(InventarioRede i) {
        return new ComandoDslam("show equipment slot 1/1/" + i.getSlot() + " detail xml", 3000);
    }

    @Override
    public PortaPON getPortaPON(InventarioRede i) throws Exception {
        PortaPON porta = new PortaPON();
        Document xml = TratativaRetornoUtil.stringXmlParse(this.getCd().consulta(this.getComandoPortaPON(i)));
        String operStatus = TratativaRetornoUtil.getXmlParam(xml, "//info[@name='oper-status']");
        porta.setOperState(operStatus.equalsIgnoreCase("enabled"));
        return porta;
    }

    @Override
    public List<VelocidadeVendor> obterVelocidadesDownVendor() {
        if (velsDown.isEmpty()) {
            Velocidades[] vels = Velocidades.values();
            for (Velocidades vel : vels) {
                if (new Double(vel.getValor()) <= 100) {
                    velsDown.add(new VelocidadeVendor(vel, "name:43"));
                } else if (new Double(vel.getValor()) <= 500) {
                    velsDown.add(new VelocidadeVendor(vel, "name:14"));
                } else if (new Double(vel.getValor()) <= 1000) {
                    velsDown.add(new VelocidadeVendor(vel, "name:100"));
                }
            }
        }
        return velsDown;
    }

    @Override
    public List<VelocidadeVendor> obterVelocidadesUpVendor() {
        if (velsUp.isEmpty()) {
            Velocidades[] vels = Velocidades.values();
            for (Velocidades vel : vels) {
                if (new Double(vel.getValor()) <= 100) {
                    velsUp.add(new VelocidadeVendor(vel, "name:43"));
                } else if (new Double(vel.getValor()) <= 500) {
                    velsUp.add(new VelocidadeVendor(vel, "name:14"));
                } else if (new Double(vel.getValor()) <= 1000) {
                    velsUp.add(new VelocidadeVendor(vel, "name:100"));
                }
            }
        }
        return velsUp;
    }

    protected ComandoDslam getComandoEstadoDaPorta(InventarioRede i) {
        return new ComandoDslam("info configure equipment ont interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " detail xml");
    }

    @Override
    public EstadoDaPorta getEstadoDaPorta(InventarioRede i) throws Exception {
        Document xml = TratativaRetornoUtil.stringXmlParse(this.getCd().consulta(this.getComandoEstadoDaPorta(i)));
        String adminState = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='admin-state']");
        String operState = TratativaRetornoUtil.getXmlParam(xml, "//info[@name='oper-state']");
        if (adminState == null || operState == null) {
            throw new FalhaAoConsultarException();
        }
        EstadoDaPorta state = new EstadoDaPorta();
        state.setAdminState(adminState.equalsIgnoreCase("UP"));
        state.setOperState(operState.equalsIgnoreCase("UP"));
        return state;
    }

    protected ComandoDslam getComandosDeviceMac(InventarioRede i) {
        return new ComandoDslam("show vlan bridge-port-fdb 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 vlan-id 10 xml");
    }

    @Override
    public DeviceMAC getDeviceMac(InventarioRede i) throws Exception {
        Document xml = TratativaRetornoUtil.stringXmlParse(this.getCd().consulta(this.getComandosDeviceMac(i)));
        String mac = TratativaRetornoUtil.getXmlParam(xml, "//res-id[@name='mac']");
        return new DeviceMAC(mac.toUpperCase());
    }

    protected ComandoDslam getComandoProfile(InventarioRede i, Boolean how) {
        // True para Down | False para Up        
        if (how) {
            return new ComandoDslam("info configure qos interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 queue 0 xml", 2000);
        } else {
            return new ComandoDslam("info configure qos interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 upstream-queue 0 xml", 2000);
        }
    }

    @Override
    public Profile getProfile(InventarioRede i) throws Exception {
        Document xmlDown = TratativaRetornoUtil.stringXmlParse(this.getCd().consulta(this.getComandoProfile(i, true)));
        Document xmlUp = TratativaRetornoUtil.stringXmlParse(this.getCd().consulta(this.getComandoProfile(i, false)));
        String down = TratativaRetornoUtil.getXmlParam(xmlDown, "//parameter[@name='shaper-profile']");
        String up = TratativaRetornoUtil.getXmlParam(xmlUp, "//parameter[@name='bandwidth-profile']");
        Profile p = new ProfileVivo1();
        p.setProfileDown(down);
        p.setProfileUp(up);
        p.setDown(compare(down, true));
        p.setUp(compare(up, false));
        return p;
    }

    protected ComandoDslam getComandoVlanBanda(InventarioRede i) {
        return new ComandoDslam("info configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 vlan-id 10 detail xml", 3000);
    }

    @Override
    public VlanBanda getVlanBanda(InventarioRede i) throws Exception {
        ComandoDslam cmd = this.getCd().consulta(this.getComandoVlanBanda(i));
        List<String> retorno = cmd.getRetorno();
        VlanBanda v = new VlanBanda();
        boolean docontain = false;
        for (String string : retorno) {
            if (string.contains("Error : instance does not exist")) {
                docontain = true;
            }
        }
        if (!docontain) {
            Document xml = TratativaRetornoUtil.stringXmlParse(cmd);
            String vlan = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='network-vlan']");
            if (vlan.isEmpty()) {
                vlan = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='l2fwder-vlan']");
            }
            String[] split = vlan.split(":");
            v.setCvlan(new Integer(split[2]));
            v.setSvlan(new Integer(split[1]));
            v.setState(EnumEstadoVlan.UP);
        }
        return v;
    }

    @Override
    public VlanMulticast getVlanMulticast(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected ComandoDslam getComandosVlanVoip(InventarioRede i) {
        return new ComandoDslam("info configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 vlan-id 30 detail xml", 3000);

    }

    @Override
    public VlanVoip getVlanVoip(InventarioRede i) throws Exception {
        ComandoDslam cmd = this.getCd().consulta(this.getComandosVlanVoip(i));
        List<String> retorno = cmd.getRetorno();
        VlanVoip vvip = new VlanVoipVivo1();

        boolean docontain = false;
        for (String string : retorno) {
            if (string.contains("Error : instance does not exist")) {
                docontain = true;
            }
        }
        if (!docontain) {
            Document xml = TratativaRetornoUtil.stringXmlParse(cmd);
            String vlan = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='network-vlan']");
            if (vlan.isEmpty()) {
                vlan = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='l2fwder-vlan']");
            }
            if (!vlan.isEmpty()) {
                vvip.setSvlan(new Integer(vlan));
            }
        }
        return vvip;
    }

    protected ComandoDslam getComandoVlanVod(InventarioRede i) {
        return new ComandoDslam("info configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 vlan-id 20 detail xml", 3000);
    }

    @Override
    public VlanVod getVlanVod(InventarioRede i) throws Exception {
        ComandoDslam cmd = this.getCd().consulta(this.getComandoVlanVod(i));
        VlanVod vvod = new VlanVodVivo1Alcatel();

        if (!cmd.getBlob().contains("Error : instance does not exist")) {
            Document xml = TratativaRetornoUtil.stringXmlParse(cmd);
            String vlan = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='network-vlan']");
            if (vlan.isEmpty()) {
                vlan = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='l2fwder-vlan']");
            }
            if (!vlan.isEmpty()) {
                vvod.setSvlan(new Integer(vlan));
            }
        }
        return vvod;
    }

    protected ComandoDslam getComandoSerialOnt(InventarioRede i) {
        return new ComandoDslam("info configure equipment ont interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " xml");
    }

    @Override
    public SerialOntGpon getSerialOnt(InventarioRede i) throws Exception {
        Document xml = TratativaRetornoUtil.stringXmlParse(this.getCd().consulta(this.getComandoSerialOnt(i)));
        String serial = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='sernum']");
        String idont = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='subslocid']");
        SerialOntGpon sog = new SerialOntGpon();
        sog.setIdOnt(idont);
        sog.setSerial(serial.replace(":", "-"));
        return sog;
    }

    protected ComandoDslam getComandoConsultarParametros(InventarioRede i) {
        return new ComandoDslam("show equipment ont optics 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " xml");
    }

    @Override
    public TabelaParametrosGpon getTabelaParametros(InventarioRede i) throws Exception {
        Document xml = TratativaRetornoUtil.stringXmlParse(this.getCd().consulta(this.getComandoConsultarParametros(i)));
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
        return tabParam;
    }

    protected ComandoDslam getComandosAlarmes() {
        return new ComandoDslam("show alarm delta-log major ");
    }

    @Override
    public AlarmesGpon getAlarmes(InventarioRede i) throws Exception {
        //this.getCd().consulta(this.getComandosAlarmes());
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected ComandoDslam createGetSlotsAvailableOnts() {
        return new ComandoDslam("show pon unprovision-onu");
    }

    @Override
    public List<SerialOntGpon> getSlotsAvailableOnts(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected ComandoDslam getComandoEstadoPortasProximas(InventarioRede i, Porta p) {
        return new ComandoDslam("info configure equipment ont interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + p.getNumPorta() + " detail xml");
    }

    @Override
    public List<Porta> getEstadoPortasProximas(InventarioRede i) throws Exception {
        List<Porta> lst = new ArrayList<>();
        for (int j = 0; j < 32; j++) {
            Porta p = new Porta();
            EstadoDaPorta ep = new EstadoDaPorta();
            p.setNumPorta(j + 1);
            ComandoDslam cmd = this.getCd().consulta(this.getComandoEstadoPortasProximas(i, p));
            List<String> retorno = cmd.getRetorno();
            boolean docontain = false;
            for (String string : retorno) {
                if (string.contains("Error : instance does not exist")) {
                    docontain = true;
                }
            }
            if (!docontain) {
                Document xml = TratativaRetornoUtil.stringXmlParse(cmd);
                String adminState = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name=\"admin-state\"]");
                String operState = TratativaRetornoUtil.getXmlParam(xml, "//info[@name=\"oper-state\"]");
                ep.setAdminState(adminState.equalsIgnoreCase("UP"));
                ep.setOperState(operState.equalsIgnoreCase("UP"));
                p.setEstadoPorta(ep);
                lst.add(p);
            }
        }
        return lst;
    }

    @Override
    public SerialOntGpon setOntToOlt(InventarioRede i, SerialOntGpon s) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void unsetOntFromOlt(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected ComandoDslam setComandoEstadoDaPorta(InventarioRede i, EstadoDaPorta e) {
        return new ComandoDslam("configure equipment ont interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " admin-state " + e.toString());
    }

    @Override
    public EstadoDaPorta setEstadoDaPorta(InventarioRede i, EstadoDaPorta e) throws Exception {
        this.getCd().consulta(this.setComandoEstadoDaPorta(i, e));
        return this.getEstadoDaPorta(i);
    }

    @Override
    public void setProfileDown(InventarioRede i, Velocidades v) throws Exception {
        // Pendente PO?
        this.getCd().consulta(this.comandoDeleteVlanBanda(i));
        this.getCd().consulta(this.createComandosVlanBanda(i));
    }

    @Override
    public void setProfileUp(InventarioRede i, Velocidades vDown, Velocidades vUp) throws Exception {
        // Pendente PO?
        this.getCd().consulta(this.comandoDeleteVlanBanda(i));
        this.getCd().consulta(this.createComandosVlanBanda(i));
    }

    protected ComandoDslam createComandosVlanBanda(InventarioRede i) {
        if (i.getBhs()) {
            return new ComandoDslam("configure vlan id stacked:" + i.getRin() + ":" + i.getCvlan() + " mode cross-connect name SC-VLAN-" + i.getRin() + "-" + i.getCvlan() + " in-qos-prof-name name:HSI\n"
                    + "configure equipment ont interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " sw-ver-pland AUTO subslocid " + i.getIdOnt() + " sw-dnload-version AUTO desc1 " + i.getTerminal() + "\n"
                    + "configure equipment ont interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " admin-state down\n"
                    + "configure equipment ont interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " fec-up enable\n"
                    + "configure equipment ont interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " admin-state up\n"
                    + "configure equipment ont slot 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1 planned-card-type 10_100base plndnumdataports 1 plndnumvoiceports 0\n"
                    + "configure ethernet ont 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 auto-detect auto admin-state up\n"
                    + "configure qos interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 upstream-queue 0 bandwidth-profile name:14\n"
                    + "configure qos interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 queue 0 priority 1 shaper-profile  name:14\n"
                    + "configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 max-unicast-mac 8\n"
                    + "configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 vlan-id 10 vlan-scope local network-vlan stacked:" + i.getRin() + ":" + i.getCvlan() + " tag single-tagged qos profile:20");
        } else {
            return new ComandoDslam("configure vlan id stacked:" + i.getRin() + ":" + i.getCvlan() + " mode cross-connect name SC-VLAN-" + i.getRin() + "-" + i.getCvlan() + " in-qos-prof-name name:HSI\n"
                    + "configure equipment ont interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " sw-ver-pland AUTO subslocid " + i.getIdOnt() + " sw-dnload-version AUTO  desc1 " + i.getTerminal() + "\n"
                    + "configure equipment ont interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " fec-up enable\n"
                    + "configure equipment ont interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " admin-state up\n"
                    + "configure equipment ont slot 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1 planned-card-type 10_100base plndnumdataports 1 plndnumvoiceports 0\n"
                    + "configure ethernet ont 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 auto-detect auto admin-state up\n"
                    + "configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 max-unicast-mac 8\n"
                    + "configure qos interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 upstream-queue 0 bandwidth-profile name:43\n"
                    + "configure qos interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 queue 0 priority 1 shaper-profile  name:43\n"
                    + "configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 vlan-id stacked:" + i.getRin() + ":" + i.getCvlan() + "\n"
                    + "configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 pvid stacked:" + i.getRin() + ":" + i.getCvlan());
        }
    }

    @Override
    public VlanBanda createVlanBanda(InventarioRede i, Velocidades vDown, Velocidades vUp) throws Exception {
        EstadoDaPorta e = new EstadoDaPorta();
        e.setAdminState(Boolean.FALSE);
        this.getCd().consulta(this.setComandoEstadoDaPorta(i, e));
        this.getCd().consulta(this.createComandosVlanBanda(i));
        e.setAdminState(Boolean.TRUE);
        this.getCd().consulta(this.setComandoEstadoDaPorta(i, e));
        return this.getVlanBanda(i);
    }

    protected ComandoDslam createComandoVlanVoip(InventarioRede i) {
        if (i.getBhs()) {
            return new ComandoDslam("configure qos interface  1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 upstream-queue 5 bandwidth-profile name:45\n"
                    + "configure qos interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1  queue 5 priority 5 shaper-profile  name:45\n"
                    + "configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 vlan-id 30  vlan-scope local network-vlan " + i.getVlanVoip() + " tag single-tagged qos profile:23");
        } else {
            return this.createComandosVlanBanda(i);
        }
    }

    @Override
    public VlanVoip createVlanVoip(InventarioRede i) throws Exception {
        this.getCd().consulta(this.createComandoVlanVoip(i));
        return this.getVlanVoip(i);
    }

    protected ComandoDslam comandoCreateVlanVod(InventarioRede i) {
        if (i.getBhs()) {
            return new ComandoDslam("configure qos interface  1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 cac-profile name:42\n"
                    + "configure qos interface  1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 upstream-queue 4 bandwidth-profile name:42\n"
                    + "configure qos interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1  queue 4 priority 4 shaper-profile  name:42\n"
                    + "configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 max-unicast-mac 8\n"
                    + "configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 vlan-id 20 vlan-scope local network-vlan 5 tag single-tagged qos profile:21\n"
                    + "configure igmp channel vlan:1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1:20 max-num-group 32 mcast-svc-context name:Vivo_IPTV_MS", 5000);
        } else {
            return this.createComandosVlanBanda(i);
        }
    }

    @Override
    public VlanVod createVlanVod(InventarioRede i) throws Exception {
        this.getCd().consulta(this.comandoCreateVlanVod(i));
        return this.getVlanVod(i);
    }

    @Override
    public VlanMulticast createVlanMulticast(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected ComandoDslam comandoDeleteVlanBanda(InventarioRede i) {
        return new ComandoDslam("configure equipment ont no interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica(), 1500,
                "configure bridge no port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1");
    }

    @Override
    public void deleteVlanBanda(InventarioRede i) throws Exception {
        EstadoDaPorta e = new EstadoDaPorta();
        e.setAdminState(Boolean.FALSE);
        this.getCd().consulta(this.setComandoEstadoDaPorta(i, e));
        this.getCd().consulta(this.comandoDeleteVlanBanda(i));
        e.setAdminState(Boolean.TRUE);
        this.getCd().consulta(this.setComandoEstadoDaPorta(i, e));
    }

    protected ComandoDslam deleteComandoVlanVoip(InventarioRede i) {
        if (i.getBhs()) {
            return new ComandoDslam("configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 no vlan-id 30\n"
                    + "configure qos interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 upstream-queue 5 no bandwidth-profile\n"
                    + "configure qos interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1  queue 5 shaper-profile none", 3500);
        } else {
            return new ComandoDslam("configure equipment ont no interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "\n"
                    + "configure bridge no port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1");
        }
    }

    @Override
    public void deleteVlanVoip(InventarioRede i) throws Exception {
        EstadoDaPorta e = new EstadoDaPorta();
        e.setAdminState(Boolean.FALSE);
        this.getCd().consulta(this.setComandoEstadoDaPorta(i, e));
        this.getCd().consulta(this.deleteComandoVlanVoip(i));
        e.setAdminState(Boolean.TRUE);
        this.getCd().consulta(this.setComandoEstadoDaPorta(i, e));
    }

    protected ComandoDslam comandoDeleteVlanVod(InventarioRede i) {
        if (i.getBhs()) {
            return new ComandoDslam("");
        } else {
            return new ComandoDslam("");
        }
    }

    @Override
    public void deleteVlanVod(InventarioRede i) throws Exception {
        EstadoDaPorta e = new EstadoDaPorta();
        e.setAdminState(Boolean.FALSE);
        this.getCd().consulta(this.setComandoEstadoDaPorta(i, e));
        //this.getCd().consulta(this.comandoDeleteVlanVod(i));
        e.setAdminState(Boolean.TRUE);
        this.getCd().consulta(this.setComandoEstadoDaPorta(i, e));
    }

    @Override
    public void deleteVlanMulticast(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected ComandoDslam comandoGetStatusDaPlaca(InventarioRede i) throws Exception {
        return new ComandoDslam("show equipment slot 1/1/" + i.getSlot() + " detail xml");
    }

    protected ComandoDslam consultaStatusSlot(InventarioRede i) throws Exception {
        return new ComandoDslam("show equipment slot");
    }

    public void fazcomando(InventarioRede i) throws Exception {
        Document xml = TratativaRetornoUtil.stringXmlParse(this.getCd().consulta(this.comandoGetStatusDaPlaca(i)));
    }

    @Override
    public ReConexao getReconexoes(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
