/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.gpon.alcatel;

import br.net.gvt.efika.customer.InventarioRede;
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
        List<String> retorno = getCd().consulta(getComandoGetEstadoDaPorta(i)).getRetorno();
        estadoPorta.setAdminState(!TratativaRetornoUtil.trat7342(retorno, "SLIDVISIBILITY").contains("OOS"));
        estadoPorta.setOperState(!TratativaRetornoUtil.trat7342(retorno, "SLIDVISIBILITY").contains("OOS-AUMA"));
        serial.setIdOnt(TratativaRetornoUtil.trat7342(retorno, "SUBSLOCID").replace("\\\"", ""));
        serial.setSerial(TratativaRetornoUtil.trat7342(retorno, "SERNUM").substring(0, 4) + "-" + TratativaRetornoUtil.trat7342(retorno, "SERNUM").substring(4));
        
    }
    
    protected ComandoDslam getComandoGetEstadoDaPorta(InventarioRede i) {
        return new ComandoDslam("RTRV-ONT::ONT-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + ":;", 3000);
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
        Profile p = new Profile();
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
        VlanVoip v = new VlanVoip();
        v.setState(EnumEstadoVlan.UP);
        if (cmd.getBlob().contains("SVLAN")) {
            v.setSvlan(new Integer(TratativaRetornoUtil.trat7342(retorno, "SVLAN")));
            v.setCvlan(i.getCvLan());
        }
        
        return v;
    }
    
    @Override
    public VlanVod getVlanVod(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoGetVlan(i, 2));
        List<String> retorno = cmd.getRetorno();
        VlanVod v = new VlanVod();
        v.setState(EnumEstadoVlan.UP);
        if (cmd.getBlob().contains("SVLAN")) {
            v.setSvlan(new Integer(TratativaRetornoUtil.trat7342(retorno, "SVLAN")));
            v.setCvlan(i.getCvLan());
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
            String leOnt = ont[ont.length - 1].replace("\\\"", "").trim().substring(0, 5);
            t.setPotOnt(new Double(leOnt));
        }
        if (cmd.getBlob().contains("OLT_RX_SIG")) {
            String[] olt = TratativaRetornoUtil.trat7342Virgula(retorno, "OLT_RX_SIG");
            String leOlt = olt[olt.length - 1].replace("\\\"", "").trim();
            if (leOlt.contains("UNSUPPORTED")) {
                t.setPotOlt(t.getPotOnt());
            } else {
                t.setPotOlt(new Double(leOlt.substring(0, 5)));
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
            s.setSerial(TratativaRetornoUtil.trat7342(retorno, "SERNUM", j).substring(0, 4)+"-"+TratativaRetornoUtil.trat7342(retorno, "SERNUM", j).substring(4));
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void unsetOntFromOlt(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    protected ComandoDslam getComandoSetEstadoDaPorta(InventarioRede i, EstadoDaPorta e) {
        String state = e.getAdminState() ? "IS" : "OOS";
        return new ComandoDslam("ED-ONT::ONT-1-1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica() + "::::" + state + "::;");
    }
    
    @Override
    public EstadoDaPorta setEstadoDaPorta(InventarioRede i, EstadoDaPorta e) throws Exception {
        getCd().consulta(getComandoSetEstadoDaPorta(i, e));
        return getEstadoDaPorta(i);
    }
    
    @Override
    public void setProfileDown(InventarioRede i, Velocidades v) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void setProfileUp(InventarioRede i, Velocidades vDown, Velocidades vUp) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public VlanBanda createVlanBanda(InventarioRede i, Velocidades vDown, Velocidades vUp) throws Exception {
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
    
}
