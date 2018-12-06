/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.gpon.alcatel;

import br.net.gvt.efika.efika_customer.model.customer.InventarioRede;
import br.net.gvt.efika.fulltest.exception.FalhaAoConsultarException;
import br.net.gvt.efika.fulltest.exception.FalhaLoginDslamException;
import br.net.gvt.efika.fulltest.exception.FuncIndisponivelDslamException;
import br.net.gvt.efika.fulltest.model.telecom.config.ComandoDslam;
import br.net.gvt.efika.fulltest.model.telecom.properties.DeviceMAC;
import br.net.gvt.efika.fulltest.model.telecom.properties.EnumEstadoVlan;
import br.net.gvt.efika.fulltest.model.telecom.properties.EstadoDaPorta;
import br.net.gvt.efika.fulltest.model.telecom.properties.Porta;
import br.net.gvt.efika.fulltest.model.telecom.properties.Profile;
import br.net.gvt.efika.fulltest.model.telecom.properties.ProfileVivo1;
import br.net.gvt.efika.fulltest.model.telecom.properties.ReConexao;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanBanda;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanMulticast;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanVod;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanVodVivo1Alcatel;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanVoip;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanVoipVivo1;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.AlarmesGpon;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.PortaPON;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.SerialOntGpon;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.TabelaParametrosGponVivo1;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.VelocidadeVendor;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.Velocidades;
import dao.dslam.impl.gpon.DslamGponVivo1;
import dao.dslam.impl.login.LoginComJump;
import dao.dslam.impl.retorno.TratativaRetornoUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import model.dslam.credencial.Credencial;
import org.w3c.dom.Document;

/**
 *
 * @author G0034481
 */
public class Alcatel7302GponDslamVivo1 extends DslamGponVivo1 {

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
        return new ComandoDslam("show equipment slot 1/1/" + i.getSlot() + " detail xml", 5000);
    }

    @Override
    public PortaPON getPortaPON(InventarioRede i) throws Exception {
        PortaPON porta = new PortaPON();
        ComandoDslam cmd = this.getCd().consulta(this.getComandoPortaPON(i));
        porta.addInteracao(cmd);
        Document xml = TratativaRetornoUtil.stringXmlParse(cmd);
        String operStatus = TratativaRetornoUtil.getXmlParam(xml, "//info[@name='oper-status']");
        porta.setOperState(operStatus.equalsIgnoreCase("enabled"));
        return porta;
    }

    @Override
    public List<VelocidadeVendor> obterVelocidadesDownVendor() {
        if (velsDown.isEmpty()) {
            Velocidades[] vels = Velocidades.values();
            Arrays.sort(vels, Collections.reverseOrder());
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
            Arrays.sort(vels, Collections.reverseOrder());
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
        return new ComandoDslam("info configure equipment ont interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " detail xml", 3000);
    }

    @Override
    public EstadoDaPorta getEstadoDaPorta(InventarioRede i) throws Exception {
        EstadoDaPorta state = new EstadoDaPorta();
        ComandoDslam cmd = this.getCd().consulta(this.getComandoEstadoDaPorta(i));
        state.addInteracao(cmd);
        Document xml = TratativaRetornoUtil.stringXmlParse(cmd);
        String adminState = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='admin-state']");
        String operState = TratativaRetornoUtil.getXmlParam(xml, "//info[@name='oper-state']");
        if (adminState == null || operState == null) {
            throw new FalhaAoConsultarException();
        }
        state.setAdminState(adminState.equalsIgnoreCase("UP"));
        state.setOperState(operState.equalsIgnoreCase("UP"));
        return state;
    }

    protected ComandoDslam getComandosDeviceMac(InventarioRede i) {
        return new ComandoDslam("show vlan bridge-port-fdb 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 vlan-id 10 xml", 3000);
    }

    @Override
    public DeviceMAC getDeviceMac(InventarioRede i) throws Exception {
        ComandoDslam cmd = this.getCd().consulta(this.getComandosDeviceMac(i));
        DeviceMAC m = new DeviceMAC();
        m.addInteracao(cmd);
        Document xml = TratativaRetornoUtil.stringXmlParse(cmd);
        String mac = TratativaRetornoUtil.getXmlParam(xml, "//res-id[@name='mac']");
        m.setMac(mac);
        return m;
    }

    protected ComandoDslam getComandoProfile(InventarioRede i, Boolean how) {
        // True para Down | False para Up        
        if (how) {
            return new ComandoDslam("info configure qos interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 queue 0 xml", 4000);
        } else {
            return new ComandoDslam("info configure qos interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 upstream-queue 0 xml", 4000);
        }
    }

    @Override
    public Profile getProfile(InventarioRede i) throws Exception {
        ComandoDslam cDown = this.getCd().consulta(this.getComandoProfile(i, true));
        ComandoDslam cUp = this.getCd().consulta(this.getComandoProfile(i, false));
        Document xmlDown = TratativaRetornoUtil.stringXmlParse(cDown);
        Document xmlUp = TratativaRetornoUtil.stringXmlParse(cUp);
        String down = TratativaRetornoUtil.getXmlParam(xmlDown, "//parameter[@name='shaper-profile']");
        String up = TratativaRetornoUtil.getXmlParam(xmlUp, "//parameter[@name='bandwidth-profile']");
        Profile p = new ProfileVivo1();
        p.addInteracao(cDown);
        p.addInteracao(cUp);
        p.setProfileDown(down);
        p.setProfileUp(up);
        p.setDown(compare(down, true));
        p.setUp(compare(up, false));
        return p;
    }

    protected ComandoDslam getComandoVlanBanda(InventarioRede i) {
        return new ComandoDslam("info configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 vlan-id 10 detail xml", 5000);
    }

    @Override
    public VlanBanda getVlanBanda(InventarioRede i) throws Exception {
        ComandoDslam cmd = this.getCd().consulta(this.getComandoVlanBanda(i));
        List<String> retorno = cmd.getRetorno();
        VlanBanda v = new VlanBanda();
        v.addInteracao(cmd);
        boolean docontain = false;
        for (String string : retorno) {
            if (string.contains("Error :")) {
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
        return new ComandoDslam("info configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 vlan-id 30 detail xml", 5000);
    }

    @Override
    public VlanVoip getVlanVoip(InventarioRede i) throws Exception {
        ComandoDslam cmd = this.getCd().consulta(this.getComandosVlanVoip(i));
        List<String> retorno = cmd.getRetorno();
        VlanVoip vvip = new VlanVoipVivo1();
        vvip.addInteracao(cmd);

        boolean docontain = false;
        for (String string : retorno) {
            if (string.contains("Error :")) {
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
        return new ComandoDslam("info configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 vlan-id 20 detail xml", 5000);
    }

    @Override
    public VlanVod getVlanVod(InventarioRede i) throws Exception {
        ComandoDslam cmd = this.getCd().consulta(this.getComandoVlanVod(i));
        VlanVod vvod = new VlanVodVivo1Alcatel();

        vvod.addInteracao(cmd);

        if (!cmd.getBlob().contains("Error :")) {
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
        return new ComandoDslam("info configure equipment ont interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " xml", 3000);
    }

    @Override
    public SerialOntGpon getSerialOnt(InventarioRede i) throws Exception {
        ComandoDslam cmd = this.getCd().consulta(this.getComandoSerialOnt(i));
        Document xml = TratativaRetornoUtil.stringXmlParse(cmd);
        String serial = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='sernum']");
        String idont = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='subslocid']");
        SerialOntGpon sog = new SerialOntGpon();
        sog.addInteracao(cmd);
        sog.setIdOnt(idont);
        sog.setSerial(serial.replace(":", "-"));
        return sog;
    }

    protected ComandoDslam getComandoConsultarParametros(InventarioRede i) {
        return new ComandoDslam("show equipment ont optics 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " xml", 3000);
    }

    @Override
    public TabelaParametrosGponVivo1 getTabelaParametros(InventarioRede i) throws Exception {
        ComandoDslam cmd = this.getComandoConsultarParametros(i);
        Document xml = TratativaRetornoUtil.stringXmlParse(this.getCd().consulta(cmd));
        String potOnt = TratativaRetornoUtil.getXmlParam(xml, "//info[@name='rx-signal-level']");
        String potOlt = TratativaRetornoUtil.getXmlParam(xml, "//info[@name='olt-rx-sig-level']");
        if (potOnt.equals("invalid") || potOnt.equals("unknown")) {
            potOnt = "0";
        }
        if (potOlt.equals("invalid") || potOlt.equals("unknown")) {
            potOlt = "0";
        }
        TabelaParametrosGponVivo1 tabParam = new TabelaParametrosGponVivo1();
        tabParam.addInteracao(cmd);
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
        return new ComandoDslam("info configure equipment ont interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + p.getNumPorta() + " detail xml", 3000);
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
                ep.addInteracao(cmd);
                p.setEstadoPorta(ep);
                lst.add(p);
            }
        }
        return lst;
    }

    public ComandoDslam getComandoSetOntToOlt(InventarioRede i) {
        return new ComandoDslam("configure equipment ont interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " sw-ver-pland AUTO subslocid " + i.getIdOnt() + " sw-dnload-version AUTO desc1 " + i.getTerminal() + "\n"
                + "configure equipment ont interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " admin-state down\n"
                + "configure equipment ont interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " fec-up enable\n"
                + "configure equipment ont interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " admin-state up\n"
                + "configure equipment ont slot 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1 planned-card-type 10_100base plndnumdataports 1 plndnumvoiceports 0\n"
                + "configure ethernet ont 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 auto-detect auto admin-state up\n"
        );
    }

    @Override
    public SerialOntGpon setOntToOlt(InventarioRede i, SerialOntGpon s) throws Exception {
        ComandoDslam cmd0 = getCd().consulta(getComandoSetOntToOlt(i));
//        ComandoDslam cmd1 = getCd().consulta(createComandosVlanBanda(i));
        SerialOntGpon se = getSerialOnt(i);
//        se.getInteracoes().add(0, cmd1);
        se.getInteracoes().add(0, cmd0);
        return se;
    }

    @Override
    public SerialOntGpon unsetOntFromOlt(InventarioRede i) throws Exception {
//        ComandoDslam cmd = getCd().consulta(comandoDeleteVlanBanda(i));

        SerialOntGpon s = new SerialOntGpon();
//        s.addInteracao(cmd);
        return s;
    }

    protected ComandoDslam setComandoEstadoDaPorta(InventarioRede i, EstadoDaPorta e) {
        return new ComandoDslam("configure equipment ont interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " admin-state " + e.toString(), 3000);
    }

    @Override
    public EstadoDaPorta setEstadoDaPorta(InventarioRede i, EstadoDaPorta e) throws Exception {
        ComandoDslam cmd = this.getCd().consulta(this.setComandoEstadoDaPorta(i, e));
        EstadoDaPorta es = this.getEstadoDaPorta(i);
        es.getInteracoes().add(0, cmd);
        return es;
    }

    public ComandoDslam setProfile(InventarioRede i) {
        return new ComandoDslam("configure qos interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 upstream-queue 0 no bandwidth-profile\n"
                + "configure qos interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1  queue 0 shaper-profile none", 1000,
                "configure qos interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 upstream-queue 0 bandwidth-profile name:14\n"
                + "configure qos interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 queue 0 priority 1 shaper-profile  name:14\n"
        );
    }

    @Override
    public Profile setProfileDown(InventarioRede i, Velocidades v) throws Exception {
        // Pendente PO?
        ComandoDslam cmd0 = this.getCd().consulta(this.setProfile(i));
//        ComandoDslam cmd1 = this.getCd().consulta(this.createComandosVlanBanda(i));
        Profile p = getProfile(i);
        p.getInteracoes().add(0, cmd0);
//        p.getInteracoes().add(1, cmd1);
        return p;
    }

    @Override
    public Profile setProfileUp(InventarioRede i, Velocidades vDown, Velocidades vUp) throws Exception {
        return setProfileDown(i, vDown);
    }

    protected ComandoDslam createComandosVlanBanda(InventarioRede i) {
        if (i.getBhs()) {
            return new ComandoDslam("configure qos interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 upstream-queue 0 bandwidth-profile name:14\n"
                    + "configure qos interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 queue 0 priority 1 shaper-profile  name:14\n"
                    + "configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 max-unicast-mac 16\n"
                    + "configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 vlan-id 10 vlan-scope local network-vlan stacked:" + i.getRin() + ":" + i.getCvlan() + " tag single-tagged qos profile:20", 5000);
//            return new ComandoDslam("configure vlan id stacked:" + i.getRin() + ":" + i.getCvlan() + " mode cross-connect name SC-VLAN-" + i.getRin() + "-" + i.getCvlan() + " in-qos-prof-name name:HSI\n"
//                    + "configure equipment ont interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " sw-ver-pland AUTO subslocid " + i.getIdOnt() + " sw-dnload-version AUTO desc1 " + i.getTerminal() + "\n"
//                    + "configure equipment ont interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " admin-state down\n"
//                    + "configure equipment ont interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " fec-up enable\n"
//                    + "configure equipment ont interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " admin-state up\n"
//                    + "configure equipment ont slot 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1 planned-card-type 10_100base plndnumdataports 1 plndnumvoiceports 0\n"
//                    + "configure ethernet ont 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 auto-detect auto admin-state up\n"
//                    + "configure qos interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 upstream-queue 0 bandwidth-profile name:14\n"
//                    + "configure qos interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 queue 0 priority 1 shaper-profile  name:14\n"
//                    + "configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 max-unicast-mac 8\n"
//                    + "configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 vlan-id 10 vlan-scope local network-vlan stacked:" + i.getRin() + ":" + i.getCvlan() + " tag single-tagged qos profile:20", 5000);
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
                    + "configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 pvid stacked:" + i.getRin() + ":" + i.getCvlan(), 5000);
        }
    }

    @Override
    public VlanBanda createVlanBanda(InventarioRede i, Velocidades vDown, Velocidades vUp) throws Exception {
        EstadoDaPorta e = new EstadoDaPorta();
        e.setAdminState(Boolean.FALSE);
        ComandoDslam cmd0 = this.getCd().consulta(this.setComandoEstadoDaPorta(i, e));
        ComandoDslam cmd1 = this.getCd().consulta(this.createComandosVlanBanda(i));
        e.setAdminState(Boolean.TRUE);
        ComandoDslam cmd2 = this.getCd().consulta(this.setComandoEstadoDaPorta(i, e));
        VlanBanda v = getVlanBanda(i);
        v.getInteracoes().add(0, cmd2);
        v.getInteracoes().add(0, cmd1);
        v.getInteracoes().add(0, cmd0);
        return v;
    }

    protected ComandoDslam createComandoVlanVoip(InventarioRede i) {
//        if (i.getBhs()) {
        return new ComandoDslam("configure qos interface  1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 upstream-queue 2 bandwidth-profile name:43\n"
                + "configure qos interface  1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 upstream-queue 5 bandwidth-profile name:45\n"
                + "configure qos interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1  queue 5 priority 5 shaper-profile  name:45\n"
                + "configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 vlan-id 30  vlan-scope local network-vlan " + i.getVlanVoip() + " tag single-tagged qos profile:23", 5000);
//            return new ComandoDslam("configure qos interface  1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 upstream-queue 5 bandwidth-profile name:45\n"
//                    + "configure qos interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1  queue 5 priority 5 shaper-profile  name:45\n"
//                    + "configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 vlan-id 30  vlan-scope local network-vlan " + i.getVlanVoip() + " tag single-tagged qos profile:23", 5000);
//        } else {
//            return this.createComandosVlanBanda(i);
//        }
    }

    @Override
    public VlanVoip createVlanVoip(InventarioRede i) throws Exception {
        ComandoDslam cmd = this.getCd().consulta(this.createComandoVlanVoip(i));
        VlanVoip v = this.getVlanVoip(i);
        v.getInteracoes().add(0, cmd);
        return v;
    }

    protected ComandoDslam comandoCreateVlanVod(InventarioRede i) {
//        if (i.getBhs()) {
        return new ComandoDslam("configure qos interface  1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 cac-profile name:42\n"
                + "configure qos interface  1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 upstream-queue 4 bandwidth-profile name:42\n"
                + "configure qos interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1  queue 4 priority 4 shaper-profile  name:42\n"
                + "configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 vlan-id 20 vlan-scope local network-vlan 5 tag single-tagged qos profile:21\n"
                + "configure igmp channel vlan:1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1:20 max-num-group 32 mcast-svc-context name:Vivo_IPTV_MS", 5000);
//            return new ComandoDslam("configure qos interface  1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 cac-profile name:42\n"
//                    + "configure qos interface  1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 upstream-queue 4 bandwidth-profile name:42\n"
//                    + "configure qos interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1  queue 4 priority 4 shaper-profile  name:42\n"
//                    + "configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 max-unicast-mac 8\n"
//                    + "configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 vlan-id 20 vlan-scope local network-vlan 5 tag single-tagged qos profile:21\n"
//                    + "configure igmp channel vlan:1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1:20 max-num-group 32 mcast-svc-context name:Vivo_IPTV_MS", 5000);
//        } else {
//            return this.createComandosVlanBanda(i);
//        }
    }

    @Override
    public VlanVod createVlanVod(InventarioRede i) throws Exception {
        ComandoDslam cmd = this.getCd().consulta(this.comandoCreateVlanVod(i));
        VlanVod v = this.getVlanVod(i);
        v.getInteracoes().add(0, cmd);
        return v;
    }

    @Override
    public VlanMulticast createVlanMulticast(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected ComandoDslam comandoDeleteVlanBanda(InventarioRede i) {
        return new ComandoDslam("configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 no vlan-id 10");
    }

    @Override
    public VlanBanda deleteVlanBanda(InventarioRede i) throws Exception {
        EstadoDaPorta e = new EstadoDaPorta();
        e.setAdminState(Boolean.FALSE);
        ComandoDslam cmd0 = this.getCd().consulta(this.setComandoEstadoDaPorta(i, e));
        ComandoDslam cmd1 = this.getCd().consulta(this.comandoDeleteVlanBanda(i));
        e.setAdminState(Boolean.TRUE);
        ComandoDslam cmd2 = this.getCd().consulta(this.setComandoEstadoDaPorta(i, e));
        VlanBanda v = getVlanBanda(i);
        v.getInteracoes().add(0, cmd2);
        v.getInteracoes().add(0, cmd1);
        v.getInteracoes().add(0, cmd0);
        return v;
    }

    protected ComandoDslam deleteComandoVlanVoip(InventarioRede i) {
//        if (i.getBhs()) {
        return new ComandoDslam("configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 no vlan-id 20");
//        } else {
//            return new ComandoDslam("configure equipment ont no interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "\n"
//                    + "configure bridge no port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1", 3500);
//        }
    }

    @Override
    public VlanVoip deleteVlanVoip(InventarioRede i) throws Exception {
        EstadoDaPorta e = new EstadoDaPorta();
        e.setAdminState(Boolean.FALSE);
        ComandoDslam cmd0 = this.getCd().consulta(this.setComandoEstadoDaPorta(i, e));
        ComandoDslam cmd1 = this.getCd().consulta(this.deleteComandoVlanVoip(i));
        e.setAdminState(Boolean.TRUE);
        ComandoDslam cmd2 = this.getCd().consulta(this.setComandoEstadoDaPorta(i, e));
        VlanVoip v = getVlanVoip(i);
        v.getInteracoes().add(0, cmd2);
        v.getInteracoes().add(0, cmd1);
        v.getInteracoes().add(0, cmd0);
        return v;
    }

    protected ComandoDslam comandoDeleteVlanVod(InventarioRede i) {
//        if (i.getBhs()) {
        return new ComandoDslam("configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1 no vlan-id 30");
//        } else {
//            return new ComandoDslam("configure equipment ont no interface 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "\n"
//                    + "configure bridge no port 1/1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/1/1", 3000);
//        }
    }

    @Override
    public VlanVod deleteVlanVod(InventarioRede i) throws Exception {
        EstadoDaPorta e = new EstadoDaPorta();
        e.setAdminState(Boolean.FALSE);
        ComandoDslam cmd0 = this.getCd().consulta(this.setComandoEstadoDaPorta(i, e));
        ComandoDslam cmd1 = this.getCd().consulta(this.comandoDeleteVlanVod(i));
        e.setAdminState(Boolean.TRUE);
        ComandoDslam cmd2 = this.getCd().consulta(this.setComandoEstadoDaPorta(i, e));
        VlanVod v = getVlanVod(i);
        v.getInteracoes().add(0, cmd2);
        v.getInteracoes().add(0, cmd1);
        v.getInteracoes().add(0, cmd0);
        return v;
    }

    @Override
    public VlanMulticast deleteVlanMulticast(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }

    protected ComandoDslam comandoGetStatusDaPlaca(InventarioRede i) throws Exception {
        return new ComandoDslam("show equipment slot 1/1/" + i.getSlot() + " detail xml", 3000);
    }

    protected ComandoDslam consultaStatusSlot(InventarioRede i) throws Exception {
        return new ComandoDslam("show equipment slot", 3000);
    }

    @Override
    public ReConexao getReconexoes(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }

}
