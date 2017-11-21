/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.gpon.alcatel;

import br.net.gvt.efika.customer.InventarioRede;
import dao.dslam.factory.exception.FalhaAoConsultarException;
import dao.dslam.factory.exception.FuncIndisponivelDslamException;
import dao.dslam.impl.ComandoDslam;
import dao.dslam.impl.gpon.DslamVivo1;
import dao.dslam.impl.login.Login1023ComJump;
import dao.dslam.impl.retorno.TratativaRetornoUtil;
import java.util.ArrayList;
import java.util.List;
import model.dslam.consulta.DeviceMAC;
import model.dslam.consulta.EnumEstadoVlan;
import model.dslam.consulta.EstadoDaPorta;
import model.dslam.consulta.Porta;
import model.dslam.consulta.Profile;
import model.dslam.consulta.ProfileVivo1;
import model.dslam.consulta.VlanBanda;
import model.dslam.consulta.VlanMulticast;
import model.dslam.consulta.VlanVod;
import model.dslam.consulta.VlanVodVivo1Alcatel;
import model.dslam.consulta.VlanVoip;
import model.dslam.consulta.VlanVoipVivo1;
import model.dslam.consulta.gpon.AlarmesGpon;
import model.dslam.consulta.gpon.SerialOntGpon;
import model.dslam.consulta.gpon.TabelaParametrosGpon;
import model.dslam.credencial.Credencial;
import model.dslam.velocidade.VelocidadeVendor;
import model.dslam.velocidade.Velocidades;

/**
 *
 * @author G0041775
 */
public class Alcatel7342GponDslamVivo1 extends DslamVivo1 {

    public Alcatel7342GponDslamVivo1(String ipDslam) {
        super(ipDslam, Credencial.ALCATEL7342, new Login1023ComJump());
    }

    private transient EstadoDaPorta estadoPorta;

    private transient SerialOntGpon serial;

    @Override
    public void conectar() throws Exception {
        super.conectar();
        getCd().consulta(this.getComandoPrepareEnvironment());
    }

    protected ComandoDslam getComandoPrepareEnvironment() {
        return new ComandoDslam("INH-MSG-ALL::ALL:010;", 3000);
    }

    @Override
    public List<VelocidadeVendor> obterVelocidadesDownVendor() {
        if (velsDown.isEmpty()) {
            Velocidades[] vels = Velocidades.values();
            for (Velocidades vel : vels) {
                if (new Double(vel.getValor()) <= 100) {
                    velsDown.add(new VelocidadeVendor(vel, "43"));
                } else if (new Double(vel.getValor()) <= 500) {
                    velsDown.add(new VelocidadeVendor(vel, "14"));
                } else if (new Double(vel.getValor()) <= 1000) {
                    velsDown.add(new VelocidadeVendor(vel, "100"));
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
                    velsUp.add(new VelocidadeVendor(vel, "43"));
                } else if (new Double(vel.getValor()) <= 500) {
                    velsUp.add(new VelocidadeVendor(vel, "14"));
                } else if (new Double(vel.getValor()) <= 1000) {
                    velsUp.add(new VelocidadeVendor(vel, "100"));
                }
            }
        }
        return velsUp;
    }

    protected void setTransients(InventarioRede i) throws Exception {
        estadoPorta = new EstadoDaPorta();
        serial = new SerialOntGpon();
        ComandoDslam cmd = getCd().consulta(getComandoGetEstadoDaPorta(i));
        List<String> retorno = cmd.getRetorno();
        if(!cmd.getBlob().contains("SLIDVISIBILITY")){
            throw new FalhaAoConsultarException();
        }
        estadoPorta.setAdminState(!TratativaRetornoUtil.trat7342(retorno, "SLIDVISIBILITY").contains("OOS-AUMA"));
        estadoPorta.setOperState(!TratativaRetornoUtil.trat7342(retorno, "SLIDVISIBILITY").contains("OOS"));
        serial.setIdOnt(TratativaRetornoUtil.trat7342(retorno, "SUBSLOCID").replace("\\\"", ""));
        serial.setSerial(TratativaRetornoUtil.trat7342(retorno, "SERNUM").substring(0, 4) + "-" + TratativaRetornoUtil.trat7342(retorno, "SERNUM").substring(4));

    }

    protected ComandoDslam getComandoGetEstadoDaPorta(InventarioRede i) {
        return new ComandoDslam("RTRV-ONT::ONT-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + ":;", 5000);
    }

    @Override
    public EstadoDaPorta getEstadoDaPorta(InventarioRede i) throws Exception {
        setTransients(i);
        return estadoPorta;
    }

    protected ComandoDslam getComandoGetDeviceMac(InventarioRede i) {
        return new ComandoDslam("RTRV-PONFDBDYNAMIC::PONVLAN-" + i.getRin() + ":::"
                + "BRGPORT-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + "-1-1;", 25000);
    }

    @Override
    public DeviceMAC getDeviceMac(InventarioRede i) throws Exception {
        List<String> retorno = getCd().consulta(getComandoGetDeviceMac(i)).getRetorno();
        DeviceMAC m = new DeviceMAC();
        String mac = "";
        for (String string : retorno) {
            if (string.contains(",")) {
                String[] porvirgula = string.split(",");
                String[] pordoispontos = porvirgula[0].split(":");
                mac = pordoispontos[pordoispontos.length - 1].replace("-", ":").toUpperCase();
            }
        }
        m.setMac(mac);
        return m;
    }

    protected ComandoDslam getComandoGetProfile(InventarioRede i) {
        return new ComandoDslam("RTRV-SERVICE-PORTAL::PORTAL-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + "-1;", 3500);
    }

    @Override
    public Profile getProfile(InventarioRede i) throws Exception {
        List<String> retorno = getCd().consulta(getComandoGetProfile(i)).getRetorno();
        Profile p = new ProfileVivo1();
        String down = TratativaRetornoUtil.trat7342(retorno, "BWPROFDNID");
        String up = TratativaRetornoUtil.trat7342(retorno, "BWPROFUPID");
        p.setProfileDown(down);
        p.setProfileUp(up);
        p.setDown(compare(down, true));
        p.setUp(compare(up, false));

        return p;
    }

    protected ComandoDslam getComandoGetVlan(InventarioRede i, Integer qual) {
        return new ComandoDslam("RTRV-ONTENET::ONT-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + "::;"
                + "RTRV-SERVICE-FLOW::FLOW-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + "-1-1-" + qual + "::;", 5000);
    }

    @Override
    public VlanBanda getVlanBanda(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoGetVlan(i, 1));
        List<String> retorno = cmd.getRetorno();
        VlanBanda v = new VlanBanda();
        v.setState(EnumEstadoVlan.UP);
        if (cmd.getBlob().contains("NETWORKSIDEVLAN")) {
            v.setCvlan(new Integer(TratativaRetornoUtil.trat7342(retorno, "NETWORKSIDEVLAN")));
        }
        if (cmd.getBlob().contains("SVLAN")) {
            v.setSvlan(new Integer(TratativaRetornoUtil.trat7342(retorno, "SVLAN")));
        }

        return v;
    }

    @Override
    public VlanMulticast getVlanMulticast(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }

    @Override
    public VlanVoip getVlanVoip(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoGetVlan(i, 3));
        List<String> retorno = cmd.getRetorno();
        VlanVoip v = new VlanVoipVivo1();
        if (cmd.getBlob().contains("SVLAN")) {
            v.setSvlan(new Integer(TratativaRetornoUtil.trat7342(retorno, "SVLAN")));
        }

        return v;
    }

    @Override
    public VlanVod getVlanVod(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoGetVlan(i, 2));
        List<String> retorno = cmd.getRetorno();
        VlanVod v = new VlanVodVivo1Alcatel();
        if (cmd.getBlob().contains("SVLAN")) {
            v.setSvlan(new Integer(TratativaRetornoUtil.trat7342(retorno, "SVLAN")));
        }

        return v;
    }

    @Override
    public SerialOntGpon getSerialOnt(InventarioRede i) throws Exception {
        if (serial == null) {
            setTransients(i);
        }
        return serial;
    }

    protected ComandoDslam getComandoGetTabelaParametros(InventarioRede i) {
        return new ComandoDslam("REPT-OPSTAT-OPTICS::ONT-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + ";", 3500);
    }

    @Override
    public TabelaParametrosGpon getTabelaParametros(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoGetTabelaParametros(i));
        List<String> retorno = cmd.getRetorno();
        TabelaParametrosGpon t = new TabelaParametrosGpon();
        if (cmd.getBlob().contains("ONT_RX_SIG")) {
            String[] ont = TratativaRetornoUtil.trat7342Virgula(retorno, "ONT_RX_SIG");
            String pegaOnt = ont[ont.length - 1].replace("\\\"", "").trim().substring(0, 5);
            String leOnt = pegaOnt.equalsIgnoreCase("UNKNO") ? "0" : pegaOnt;
            t.setPotOnt(new Double(new Float(leOnt)));
        }
        if (cmd.getBlob().contains("OLT_RX_SIG")) {
            String[] olt = TratativaRetornoUtil.trat7342Virgula(retorno, "OLT_RX_SIG");
            String pegaOlt = olt[olt.length - 1].replace("\\\"", "").trim();
            if (pegaOlt.contains("UNSUPPORTED")) {
                t.setPotOlt(t.getPotOnt());
            } else {
                String leOlt = pegaOlt.substring(0, 5).equalsIgnoreCase("UNKNO") ? "0" : pegaOlt.substring(0, 5);
                t.setPotOlt(new Double(new Float(leOlt)));
            }

        }
        return t;
    }

    @Override
    public AlarmesGpon getAlarmes(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }

    protected ComandoDslam getComandoGetSlotsAvailableOnts(InventarioRede i) {
        return new ComandoDslam("RTRV-ALM-PON::ALL;", 40000);
    }

    @Override
    public List<SerialOntGpon> getSlotsAvailableOnts(InventarioRede i) throws Exception {
        List<String> retorno = getCd().consulta(getComandoGetSlotsAvailableOnts(i)).getRetorno();
        Integer quant = TratativaRetornoUtil.countStringOccurrence(retorno, "PON-1-1");
        List<SerialOntGpon> l = new ArrayList<>();
        for (int j = 1; j <= quant; j++) {
            SerialOntGpon s = new SerialOntGpon();
            String[] porvirgula = TratativaRetornoUtil.trat7342Virgula(retorno, "PON-1-1", j);
            String[] porhifen = porvirgula[0].split("-");
            s.setSlot(porhifen[3]);
            s.setPorta(porhifen[4]);
            s.setSerial(TratativaRetornoUtil.trat7342(retorno, "SERNUM", j).substring(0, 4) + "-" + TratativaRetornoUtil.trat7342(retorno, "SERNUM", j).substring(4));
            s.setIdOnt(TratativaRetornoUtil.trat7342(retorno, "SLID", j));
            l.add(s);
        }
        return l;
    }

    @Override
    public List<Porta> getEstadoPortasProximas(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }

    @Override
    public SerialOntGpon setOntToOlt(InventarioRede i, SerialOntGpon s) throws Exception {
        deleteVlanBanda(i);
        createVlanBanda(i, null, null);
        return getSerialOnt(i);
    }

    @Override
    public void unsetOntFromOlt(InventarioRede i) throws Exception {
        deleteVlanBanda(i);
    }

    protected ComandoDslam getComandoSetEstadoDaPorta(InventarioRede i, EstadoDaPorta e) {
        String state = e.getAdminState() ? "IS" : "OOS";
        return new ComandoDslam("ED-ONT::ONT-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + ":::::" + state + ";", 3000);
    }

    @Override
    public EstadoDaPorta setEstadoDaPorta(InventarioRede i, EstadoDaPorta e) throws Exception {
        getCd().consulta(getComandoSetEstadoDaPorta(i, e));
        return getEstadoDaPorta(i);
    }

    @Override
    public void setProfileDown(InventarioRede i, Velocidades v) throws Exception {
        deleteVlanBanda(i);
        createVlanBanda(i, null, null);
    }

    @Override
    public void setProfileUp(InventarioRede i, Velocidades vDown, Velocidades vUp) throws Exception {
        deleteVlanBanda(i);
        createVlanBanda(i, null, null);
    }

    protected ComandoDslam getComandoCreateVlanBanda(InventarioRede i) {
        if (i.getBhs()) {
            return new ComandoDslam("ENT-ONT::ONT-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + "::::SUBSLOCID=" + i.getIdOnt() + ",DESC1=" + i.getTerminal() + ",SWVERPLND=AUTO,DLSW=AUTO:OOS;"
                    + "ENT-ONTCARD::ONTCARD-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + "-1:::10_100BASET::IS;"
                    + "ENT-ONTENET::ONTENET-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + "-1-1::::AUTODETECT=AUTO,CVLANDEF=" + i.getCvLan() + ",SESSPROFID=12,MAXMACNUM=8:IS;"
                    + "ENT-SERVICE-PORTAL::PORTAL-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + "-1::::SVLAN=0,BWPROFUPID=14,BWPROFDNID=14:IS;"
                    + "ENT-SERVICE-FLOW::FLOW-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + "-1-1-1::::PORTAL=1,SVLAN=" + i.getRin() + ",PQPROFID=41,UNISIDEVLAN=10,NETWORKSIDEVLAN=" + i.getCvLan() + ",NUMTAGS=SINGLE:IS;", 8000);
        }
        return new ComandoDslam("ENT-ONT::ONT-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + "::::BTRYBKUP=NO,BERINT=8000,DESC1=" + i.getTerminal() + ",DESC2=NULL,PROVVERSION=*,SERNUM=ALCL00000000,SUBSLOCID=" + i.getIdOnt() + ",SWVERPLND=AUTO,DLSW=AUTO:OOS;"
                + "ENT-ONTCARD::ONTCARD-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + "-1:::10_100BASET::IS;"
                + "ENT-ONTENET::ONTENET-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + "-1-1::::AUTODETECT=AUTO,CVLANDEF=" + i.getCvLan() + ",SESSPROFID=7,MAXMACNUM=8:IS;"
                + "ENT-SERVICE-PORTAL::PORTAL-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + "-1::::SVLAN=0,BWPROFDNID=43,BWPROFUPID=43;"
                + "ENT-SERVICE-FLOW::FLOW-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + "-1-1-1::::PORTAL=1,SVLAN=" + i.getRin() + ",PQPROFID=41,UNISIDEVLAN=65535,NETWORKSIDEVLAN=" + i.getCvLan() + ",BWPROFUPID=,BWPROFUPNM=,BWPROFDNID=,BWPROFDNNM=,PQPROFNM=,AESENABLE=DISABLE,LABEL=,CUSTOMERID=,NUMTAGS=SINGLE,PBITXLPROFID=,PBITXLPROFNM=:IS;", 8000);

    }

    @Override
    public VlanBanda createVlanBanda(InventarioRede i, Velocidades vDown, Velocidades vUp) throws Exception {
        getCd().consulta(getComandoCreateVlanBanda(i));
        return getVlanBanda(i);
    }

    protected ComandoDslam getComandoCreateVlanVoIP(InventarioRede i) {
        return new ComandoDslam("ENT-SERVICE-PORTAL::PORTAL-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + "-3::::SVLAN=0,BWPROFUPID=30,BWPROFDNID=30:IS;"
                + "ENT-SERVICE-FLOW::FLOW-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + "-1-1-3::::PORTAL=3,"
                + "SVLAN=" + i.getVlanVoip() + ",PQPROFID=30,UNISIDEVLAN=30,NETWORKSIDEVLAN=" + i.getVlanVoip() + ",NUMTAGS=SINGLE:IS;", 5000);
    }

    @Override
    public VlanVoip createVlanVoip(InventarioRede i) throws Exception {
        getCd().consulta(getComandoCreateVlanVoIP(i));
        return getVlanVoip(i);
    }

    protected ComandoDslam getComandoCreateVlanVoD(InventarioRede i) {
        return new ComandoDslam("ENT-SERVICE-PORTAL::PORTAL-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + "-2::::SVLAN=0,BWPROFUPID=42,BWPROFDNID=42:IS;"
                + "ENT-SERVICE-FLOW::FLOW-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + "-1-1-2::::PORTAL=2,SVLAN=5,PQPROFID=42,UNISIDEVLAN=20,NETWORKSIDEVLAN=5,"
                + "NUMTAGS=SINGLE:IS;"
                + "ENT-PONIGMPCHN::FLOW-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + "-1-1-2::::MAXTOTMCBITRATE=100000,MAXNUMGROUP=32,MAXMSGRATE=16,MAXNUMHOST=4,"
                + "USERCVLAN=20, USERPRI=3,DATACVLAN=20 ,DATAPRI=3;", 8000);
    }

    @Override
    public VlanVod createVlanVod(InventarioRede i) throws Exception {
        getCd().consulta(getComandoCreateVlanVoD(i));
        return getVlanVod(i);
    }

    @Override
    public VlanMulticast createVlanMulticast(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }

    protected ComandoDslam getComandoDeleteVlanBanda(InventarioRede i) {
        return new ComandoDslam("DLT-PONIGMPCHN::FLOW-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + "-1-2-1;"
                + "DLT-PONIGMPCHN::FLOW-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + "-1-3-1;"
                + "DLT-PONIGMPCHN::FLOW-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + "-1-4-1;"
                + "ED-SERVICE-FLOW::FLOW-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + "-1-1-1:::::OOS;"
                + "DLT-SERVICE-FLOW::FLOW-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + "-1-1-1::;"
                + "DLT-SERVICE-FLOW::FLOW-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + "-1-1-1;"
                + "ED-SERVICE-PORTAL::PORTAL-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + "-1:::::OOS;;"
                + "DLT-SERVICE-PORTAL::PORTAL-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + "-1::;;"
                + "DLT-SERVICE-PORTAL::PORTAL-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + "-1;"
                + "ED-ONTENET::ONTENET-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + "-1-1:::::OOS;"
                + "DLT-ONTENET::ONTENET-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + "-1-1;"
                + "ED-ONTCARD::ONTCARD-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + "-1:::::OOS;"
                + "DLT-ONTCARD::ONTCARD-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + "-1;"
                + "ED-ONT::ONT-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + ":::::OOS;"
                + "DLT-ONT::ONT-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + "::;;;;", 15000);
    }

    @Override
    public void deleteVlanBanda(InventarioRede i) throws Exception {
        getCd().consulta(getComandoDeleteVlanBanda(i)).getRetorno();
    }

    protected ComandoDslam getComandoDeleteVlanVoIP(InventarioRede i) {
        return new ComandoDslam("ED-SERVICE-FLOW::FLOW-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + "-1-1-3:::::OOS;"
                + "DLT-SERVICE-FLOW::FLOW-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + "-1-1-3;"
                + "ED-SERVICE-PORTAL::PORTAL-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + "-3:::::OOS;"
                + "DLT-SERVICE-PORTAL::PORTAL-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + "-3;", 6000);
    }

    @Override
    public void deleteVlanVoip(InventarioRede i) throws Exception {
        getCd().consulta(getComandoDeleteVlanVoIP(i)).getRetorno();
    }

    protected ComandoDslam getComandoDeleteVlanVoD(InventarioRede i) {
        return new ComandoDslam("DLT-PONIGMPCHN::FLOW-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + "-1-1-2;"
                + "ED-SERVICE-FLOW::FLOW-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + "-1-1-2:::::OOS;"
                + "DLT-SERVICE-FLOW::FLOW-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + "-1-1-2;"
                + "ED-SERVICE-PORTAL::PORTAL-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + "-2:::::OOS;"
                + "DLT-SERVICE-PORTAL::PORTAL-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + "-2;", 8000);
    }

    @Override
    public void deleteVlanVod(InventarioRede i) throws Exception {
        getCd().consulta(getComandoDeleteVlanVoD(i)).getRetorno();
    }

    @Override
    public void deleteVlanMulticast(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }

}
