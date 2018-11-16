/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.metalico.alcatel;

import br.net.gvt.efika.efika_customer.model.customer.InventarioRede;
import br.net.gvt.efika.fulltest.exception.FuncIndisponivelDslamException;
import br.net.gvt.efika.fulltest.model.telecom.config.ComandoDslam;
import br.net.gvt.efika.fulltest.model.telecom.properties.DeviceMAC;
import br.net.gvt.efika.fulltest.model.telecom.properties.EnumEstadoVlan;
import br.net.gvt.efika.fulltest.model.telecom.properties.EstadoDaPorta;
import br.net.gvt.efika.fulltest.model.telecom.properties.Profile;
import br.net.gvt.efika.fulltest.model.telecom.properties.ProfileVivo1;
import br.net.gvt.efika.fulltest.model.telecom.properties.ReConexao;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanBanda;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanMulticast;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanVod;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanVoip;
import br.net.gvt.efika.fulltest.model.telecom.properties.metalico.Modulacao;
import br.net.gvt.efika.fulltest.model.telecom.properties.metalico.TabelaParametrosMetalico;
import br.net.gvt.efika.fulltest.model.telecom.properties.metalico.TabelaRedeMetalico;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.VelocidadeVendor;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.Velocidades;
import dao.dslam.impl.login.LoginComJumpMetalico;
import dao.dslam.impl.metalico.DslamMetalicoVivo1;
import dao.dslam.impl.retorno.TratativaRetornoUtil;
import java.util.List;
import model.dslam.credencial.Credencial;
import org.w3c.dom.Document;

/**
 * MA5600T
 *
 * @author G0041775
 */
public class NfxsAFdDslamVivo1 extends DslamMetalicoVivo1 {
    
    private transient EstadoDaPorta estadoPorta;
    private transient TabelaParametrosMetalico parametros;
    
    public NfxsAFdDslamVivo1(String ipDslam) {
        super(ipDslam, Credencial.ALCATEL_METALICOV1, new LoginComJumpMetalico());
    }
    
    @Override
    public void conectar() throws Exception {
        super.conectar();
    }
    
    @Override
    public List<VelocidadeVendor> obterVelocidadesDownVendor() {
        if (velsDown.isEmpty()) {
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_256, "352D_128U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_285, "352D_128U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_390, "352D_128U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_569, "608_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_611, "608_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_667, "608_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_667, "608_64D_352_64U_I_A_2L"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_833, "1184_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_889, "1184_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_1137, "1184_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_1024, "1184_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_1333, "1184_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_1730, "2304_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_2048, "2304_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_2247, "2304_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_3245, "4608_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_4326, "4608_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_4096, "4608_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_6489, "6144_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_8651, "9216_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_8192, "9216_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_10813, "12416_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_11370, "12416_128D_704_64U_I_A"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_16220, "18464_128D_1184_128U_I_A_A_V8"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_17302, "18464_128D_1184_128U_I_A_A_V8"));
        }
        return velsDown;
    }
    
    @Override
    public List<VelocidadeVendor> obterVelocidadesUpVendor() {
        if (velsUp.isEmpty()) {
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_128, "352D_128U_I_A"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_200, "352_64D_352_64U_I_A_2L"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_300, "352_64D_352_64U_I_A_2L"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_300, "608_64D_352_64U_I_A_2L"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_500, "608_128D_704_64U_I_A"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_600, "608_128D_704_64U_I_A"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_600, "1184_128D_704_64U_I_A"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_600, "2304_128D_704_64U_I_A"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_600, "4608_128D_704_64U_I_A"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_600, "6144_128D_704_64U_I_A"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_600, "9216_128D_704_64U_I_A"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_600, "12416_128D_704_64U_I_A"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_1024, "18464_128D_1184_128U_I_A_A_V8"));
        }
        
        return velsUp;
    }
    
    protected ComandoDslam getComandoGetEstadoDaPorta(InventarioRede i) {
        return new ComandoDslam("show xdsl operational-data line 1/1/" + i.getSlot() + "/" + i.getPorta() + " detail xml");
    }
    
    @Override
    public EstadoDaPorta getEstadoDaPorta(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoGetEstadoDaPorta(i));
        Document xml = TratativaRetornoUtil.stringXmlParse(cmd);
        String operStatus = TratativaRetornoUtil.getXmlParam(xml, "//info[@name='opr-state/tx-rate-ds']");
        String adminStatus = TratativaRetornoUtil.getXmlParam(xml, "//info[@name='adm-state']");
        EstadoDaPorta e = new EstadoDaPorta();
        e.setOperState(operStatus.contains("up"));
        e.setAdminState(adminStatus.equalsIgnoreCase("up"));
        
        e.addInteracao(cmd);
        
        return e;
    }
    
    protected ComandoDslam getComandoGetProfile(InventarioRede i) {
        return new ComandoDslam("info configure xdsl line 1/1/" + i.getSlot() + "/" + i.getPorta() + " detail xml");
    }
    
    @Override
    public Profile getProfile(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoGetProfile(i));
        Document xml = TratativaRetornoUtil.stringXmlParse(cmd);
        String profile = TratativaRetornoUtil.getXmlParam(xml, "//info[@name='service-profile-name']");
        ProfileVivo1 p = new ProfileVivo1();
        p.setProfileDown(profile);
        p.setProfileUp(profile);
        p.setDown(compareV1Metalico(profile, Boolean.TRUE));
        p.setUp(compareV1Metalico(profile, Boolean.FALSE));
        p.addInteracao(cmd);
        return p;
    }
    
    protected ComandoDslam getComandoGetVlanBanda(InventarioRede i) {
        return new ComandoDslam("info configure bridge port 1/1/" + i.getSlot() + "/" + i.getPorta() + ":8:35 xml");
    }
    
    @Override
    public VlanBanda getVlanBanda(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoGetVlanBanda(i));
        Document xml = TratativaRetornoUtil.stringXmlParse(cmd);
        String vs = TratativaRetornoUtil.getXmlParam(xml, "//parameter[@name='network-vlan']");
        List<Integer> l = TratativaRetornoUtil.listIntegersFromString(vs);
        
        VlanBanda v = new VlanBanda();
        v.setCvlan(l.get(1));
        v.setSvlan(l.get(0));
        v.setState(EnumEstadoVlan.UP);
        v.addInteracao(cmd);
        return v;
    }
    
    @Override
    public VlanMulticast getVlanMulticast(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }
    
    @Override
    public VlanVoip getVlanVoip(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }
    
    @Override
    public VlanVod getVlanVod(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }
    
    @Override
    public ReConexao getReconexoes(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }
    
    protected ComandoDslam getComandoGetTabelaParametros(InventarioRede i) {
        return new ComandoDslam("show xdsl linkup-record 1/1/" + i.getSlot() + "/" + i.getPorta() + " detail xml");
    }
    
    @Override
    public TabelaParametrosMetalico getTabelaParametros(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoGetTabelaParametros(i));
        ComandoDslam cmd1 = getCd().consulta(getComandoGetEstadoDaPorta(i));
        Document xml = TratativaRetornoUtil.stringXmlParse(cmd);
        Document xml1 = TratativaRetornoUtil.stringXmlParse(cmd1);
        
        TabelaParametrosMetalico t = new TabelaParametrosMetalico();
        t.setVelSincDown(new Double(TratativaRetornoUtil.getXmlParam(xml, "//info[@name='act-bitrate-down']")));
        t.setVelMaxDown(new Double(TratativaRetornoUtil.getXmlParam(xml1, "//info[@name='max-tx-rate-ds']")));
        t.setSnrDown(new Double(TratativaRetornoUtil.getXmlParam(xml, "//info[@name='act-noise-margin-down']")) / 10);
        t.setAtnDown(new Double(TratativaRetornoUtil.getXmlParam(xml, "//info[@name='attenuation-down']")) / 10);
        t.setVelSincUp(new Double(TratativaRetornoUtil.getXmlParam(xml, "//info[@name='act-bitrate-up']")));
        t.setVelMaxUp(new Double(TratativaRetornoUtil.getXmlParam(xml1, "//info[@name='max-tx-rate-us']")));
        t.setSnrUp(new Double(TratativaRetornoUtil.getXmlParam(xml, "//info[@name='act-noise-margin-up']")) / 10);
        t.setAtnUp(new Double(TratativaRetornoUtil.getXmlParam(xml, "//info[@name='attenuation-up']")) / 10);
        
        t.addInteracao(cmd);
        t.addInteracao(cmd1);
        return t;
    }
    
    @Override
    public TabelaRedeMetalico getTabelaRede(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }
    
    @Override
    public List<TabelaRedeMetalico> getHistoricoTabelaRede(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }
    
    @Override
    public Modulacao getModulacao(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }
    
    @Override
    public TabelaParametrosMetalico getTabelaParametrosIdeal(Velocidades v) throws Exception {
        TabelaParametrosMetalico t = new TabelaParametrosMetalico();
        t.setAtnDown(0d);
        t.setAtnUp(0d);
        t.setSnrDown(11d);
        t.setSnrUp(11d);
        t.setVelSincDown(TratativaRetornoUtil.velocidadeMinimaVivo1(v).get(0));
        t.setVelSincUp(TratativaRetornoUtil.velocidadeMinimaVivo1(v).get(1));
        
        return t;
    }
    
    @Override
    public Modulacao setModulacao(InventarioRede i, Velocidades v) throws Exception {
        throw new FuncIndisponivelDslamException();
    }
    
    @Override
    public TabelaRedeMetalico resetTabelaRede(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }
    
    protected ComandoDslam getComandoSetEstadoDaPorta(InventarioRede i, EstadoDaPorta e) {
        String state = e.getAdminState() ? "" : "no";
        return new ComandoDslam("configure xdsl line 1/1/" + i.getSlot() + "/" + i.getPorta() + " " + state + " admin-up");
    }
    
    @Override
    public EstadoDaPorta setEstadoDaPorta(InventarioRede i, EstadoDaPorta e) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoSetEstadoDaPorta(i, e));
        EstadoDaPorta es = getEstadoDaPorta(i);
        es.getInteracoes().add(0, cmd);
        return es;
    }
    
    protected ComandoDslam getComandoSetProfile(InventarioRede i, Velocidades v) {
        return new ComandoDslam("configure xdsl line 1/1/" + i.getSlot() + "/" + i.getPorta() + " service-profile name:"
                + compare(v, Boolean.TRUE).getSintaxVel());
    }
    
    @Override
    public Profile setProfileDown(InventarioRede i, Velocidades v) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoSetProfile(i, v));
        Profile p = getProfile(i);
        p.getInteracoes().add(0, cmd);
        return p;
    }
    
    @Override
    public Profile setProfileUp(InventarioRede i, Velocidades vDown, Velocidades vUp) throws Exception {
        return setProfileDown(i, vDown);
    }
    
    @Override
    public VlanBanda createVlanBanda(InventarioRede i, Velocidades vDown, Velocidades vUp) throws Exception {
        throw new FuncIndisponivelDslamException();
    }
    
    @Override
    public VlanVoip createVlanVoip(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }
    
    @Override
    public VlanVod createVlanVod(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }
    
    @Override
    public VlanMulticast createVlanMulticast(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }
    
    @Override
    public VlanBanda deleteVlanBanda(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }
    
    @Override
    public VlanVoip deleteVlanVoip(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }
    
    @Override
    public VlanVod deleteVlanVod(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }
    
    @Override
    public VlanMulticast deleteVlanMulticast(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }
    
    protected ComandoDslam getComandoGetDeviceMAC(InventarioRede i) {
        return new ComandoDslam("show vlan bridge-port-fdb 1/1/" + i.getSlot() + "/" + i.getPorta() + ":8:35 xml");
    }
    
    @Override
    public DeviceMAC getDeviceMac(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoGetDeviceMAC(i));
        Document xml = TratativaRetornoUtil.stringXmlParse(cmd);
        DeviceMAC m = new DeviceMAC(TratativaRetornoUtil.getXmlParam(xml, "//res-id[@name='mac']").toUpperCase());
        m.addInteracao(cmd);
        return m;
    }
    
}
