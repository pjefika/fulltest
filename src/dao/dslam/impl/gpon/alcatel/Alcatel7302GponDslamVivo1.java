/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.gpon.alcatel;

import br.net.gvt.efika.customer.InventarioRede;
import dao.dslam.impl.ComandoDslam;
import dao.dslam.impl.gpon.DslamVivo1;
import dao.dslam.impl.login.LoginComJump;
import dao.dslam.impl.retorno.TratativaRetornoUtil;
import java.util.List;
import model.dslam.consulta.DeviceMAC;
import model.dslam.consulta.EnumEstadoVlan;
import model.dslam.consulta.EstadoDaPorta;
import model.dslam.consulta.Porta;
import model.dslam.consulta.Profile;
import model.dslam.consulta.VlanBanda;
import model.dslam.consulta.VlanMulticast;
import model.dslam.consulta.VlanVod;
import model.dslam.consulta.VlanVoip;
import model.dslam.consulta.gpon.AlarmesGpon;
import model.dslam.consulta.gpon.SerialOntGpon;
import model.dslam.consulta.gpon.TabelaParametrosGpon;
import model.dslam.credencial.Credencial;
import model.dslam.velocidade.VelocidadeVendor;
import model.dslam.velocidade.Velocidades;
import org.w3c.dom.Document;

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
        this.getCd().consulta(this.getComandoEnableConfig());
    }

    protected ComandoDslam getComandoEnableConfig() {
        return new ComandoDslam("environment inhibit-alarms", 500, "environment mode batch", 500, "exit");
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
        String adminState = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name=\"admin-state\"]");
        String operState = TratativaRetornoUtil.getXmlParam(xml, "//info[@name=\"oper-state\"]");
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
        // MAC do ONT??
        //res-id[@name='mac']
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
        Profile p = new Profile();
        p.setProfileDown(down);
        p.setProfileUp(up);
        p.setDown(compare(down, true));
        p.setUp(compare(up, false));
        return p;
    }

    protected ComandoDslam getComandoVlanBanda(InventarioRede i) {
        return new ComandoDslam("info configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 vlan-id 10 detail xml");
    }

    @Override
    public VlanBanda getVlanBanda(InventarioRede i) throws Exception {
        ComandoDslam cmd = this.getCd().consulta(this.getComandoVlanBanda(i));
        List<String> retorno = cmd.getRetorno();
        VlanBanda v = new VlanBanda();
        if (!retorno.contains("Error : specified lower-interface does not exist")) {
            Document xml = TratativaRetornoUtil.stringXmlParse(cmd);
            String vlan = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='network-vlan']");
            if (vlan.isEmpty()) {
                vlan = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='l2fwder-vlan']");
            }
            String[] split = vlan.split(":");
            v.setCvlan(new Integer(split[1]));
            v.setSvlan(new Integer(split[2]));
            v.setState(EnumEstadoVlan.UP);
        }
        return v;
    }

    protected ComandoDslam getComandoVlanMulticast(InventarioRede i) {
        //Incompleto
        return new ComandoDslam("");
    }

    @Override
    public VlanMulticast getVlanMulticast(InventarioRede i) throws Exception {
        VlanMulticast vm = new VlanMulticast();
        return vm;
    }

    protected ComandoDslam getComandosVlanVoip(InventarioRede i) {
        return new ComandoDslam("info configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 vlan-id 30 detail xml");

    }

    @Override
    public VlanVoip getVlanVoip(InventarioRede i) throws Exception {
        ComandoDslam cmd = this.getCd().consulta(this.getComandosVlanVoip(i));
        List<String> retorno = cmd.getRetorno();
        VlanVoip vvip = new VlanVoip();
        if (!retorno.contains("Error : specified lower-interface does not exist")) {
            Document xml = TratativaRetornoUtil.stringXmlParse(cmd);
            String vlan = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='network-vlan']");
            if (vlan.isEmpty()) {
                vlan = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='l2fwder-vlan']");
            }
            if (!vlan.isEmpty()) {
                vvip.setSvlan(new Integer(vlan));
                vvip.setState(EnumEstadoVlan.UP);
            }
        }
        return vvip;
    }

    protected ComandoDslam getComandoVlanVod(InventarioRede i) {
        //Incompleto
        return new ComandoDslam("info configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 vlan-id 20 detail xml");
    }

    @Override
    public VlanVod getVlanVod(InventarioRede i) throws Exception {
        ComandoDslam cmd = this.getCd().consulta(this.getComandoVlanMulticast(i));
        List<String> retorno = cmd.getRetorno();
        VlanVod vvod = new VlanVod();
        if (!retorno.contains("Error : instance does not exist")) {
            Document xml = TratativaRetornoUtil.stringXmlParse(cmd);
            String vlan = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='network-vlan']");
            if (vlan.isEmpty()) {
                vlan = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='l2fwder-vlan']");
            }
            if (!vlan.isEmpty()) {
                vvod.setSvlan(new Integer(vlan));
                vvod.setState(EnumEstadoVlan.UP);
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
        SerialOntGpon sog = new SerialOntGpon();
        sog.setIdOnt(serial.replace(":", ""));
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

    @Override
    public AlarmesGpon getAlarmes(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SerialOntGpon> getSlotsAvailableOnts(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Porta> getEstadoPortasProximas(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
            return new ComandoDslam("configure vlan id stacked:" + i.getRin() + ":" + i.getCvLan() + " mode cross-connect name SC-VLAN-" + i.getRin() + "-" + i.getCvLan() + " in-qos-prof-name name:HSI\n"
                    + "configure equipment ont interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " sw-ver-pland AUTO subslocid " + i.getIdOnt() + " sw-dnload-version AUTO desc1 " + i.getTerminal() + "\n"
                    + "configure equipment ont interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " fec-up enable\n"
                    + "configure equipment ont interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " admin-state up\n"
                    + "configure equipment ont slot 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1 planned-card-type 10_100base plndnumdataports 1 plndnumvoiceports 0\n"
                    + "configure ethernet ont 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 auto-detect auto admin-state up\n"
                    + "configure qos interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 upstream-queue 0 bandwidth-profile name:14\n"
                    + "configure qos interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 queue 0 priority 1 shaper-profile  name:14\n"
                    + "configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 max-unicast-mac 8\n"
                    + "configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 vlan-id 10 vlan-scope local network-vlan stacked:" + i.getRin() + ":" + i.getCvLan() + " tag single-tagged qos profile:20");
        } else {
            return new ComandoDslam("configure vlan id stacked:" + i.getRin() + ":" + i.getCvLan() + " mode cross-connect name SC-VLAN-" + i.getRin() + "-" + i.getCvLan() + " in-qos-prof-name name:HSI\n"
                    + "configure equipment ont interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " sw-ver-pland AUTO subslocid " + i.getIdOnt() + " sw-dnload-version AUTO  desc1 " + i.getTerminal() + "\n"
                    + "configure equipment ont interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " fec-up enable\n"
                    + "configure equipment ont interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " admin-state up\n"
                    + "configure equipment ont slot 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1 planned-card-type 10_100base plndnumdataports 1 plndnumvoiceports 0\n"
                    + "configure ethernet ont 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 auto-detect auto admin-state up\n"
                    + "configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 max-unicast-mac 8\n"
                    + "configure qos interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 upstream-queue 0 bandwidth-profile name:43\n"
                    + "configure qos interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 queue 0 priority 1 shaper-profile  name:43\n"
                    + "configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 vlan-id stacked:" + i.getRin() + ":" + i.getCvLan() + "\n"
                    + "configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 pvid stacked:" + i.getRin() + ":" + i.getCvLan());
        }
    }

    @Override
    public VlanBanda createVlanBanda(InventarioRede i, Velocidades vDown, Velocidades vUp) throws Exception {
        EstadoDaPorta e = new EstadoDaPorta();
        e.setAdminState(Boolean.FALSE);
        this.getCd().consulta(this.setComandoEstadoDaPorta(i, e));
        this.getCd().consulta(this.createComandosVlanBanda(i));
        return this.getVlanBanda(i);
    }

    protected ComandoDslam createComandoVlanVoip(InventarioRede i) {
        if (i.getBhs()) {
            return new ComandoDslam("configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 no vlan-id 30\n"
                    + "configure qos interface 1/1/$slot/$port/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " 5 no bandwidth-profile\n"
                    + "configure qos interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1  queue 5 shaper-profile  none");
        } else {
            return new ComandoDslam("configure equipment ont no interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "\n"
                    + "configure bridge no port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1");
        }
    }

    @Override
    public VlanVoip createVlanVoip(InventarioRede i) throws Exception {
        this.getCd().consulta(this.createComandoVlanVoip(i));
        return this.getVlanVoip(i);
    }

    @Override
    public VlanVod createVlanVod(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    }

    protected ComandoDslam deleteComandoVlanVoip(InventarioRede i) {
        if (i.getBhs()) {
            return new ComandoDslam("configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 no vlan-id 30\n"
                    + "configure qos interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 upstream-queue 5 no bandwidth-profile\n"
                    + "configure qos interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1  queue 5 shaper-profile none");
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
    }

    @Override
    public void deleteVlanVod(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteVlanMulticast(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
