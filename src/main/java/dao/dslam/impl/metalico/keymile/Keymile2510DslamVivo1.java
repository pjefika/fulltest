/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.metalico.keymile;

import br.net.gvt.efika.efika_customer.model.customer.InventarioRede;
import br.net.gvt.efika.fulltest.exception.FuncIndisponivelDslamException;
import br.net.gvt.efika.fulltest.model.telecom.config.ComandoDslam;
import br.net.gvt.efika.fulltest.model.telecom.properties.DeviceMAC;
import br.net.gvt.efika.fulltest.model.telecom.properties.EnumEstadoVlan;
import br.net.gvt.efika.fulltest.model.telecom.properties.EstadoDaPorta;
import br.net.gvt.efika.fulltest.model.telecom.properties.Profile;
import br.net.gvt.efika.fulltest.model.telecom.properties.ProfileMetalico;
import br.net.gvt.efika.fulltest.model.telecom.properties.ReConexao;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanBanda;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanMulticast;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanVod;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanVoip;
import br.net.gvt.efika.fulltest.model.telecom.properties.metalico.Modulacao;
import br.net.gvt.efika.fulltest.model.telecom.properties.metalico.TabelaParametrosMetalico;
import br.net.gvt.efika.fulltest.model.telecom.properties.metalico.TabelaParametrosMetalicoVdsl;
import br.net.gvt.efika.fulltest.model.telecom.properties.metalico.TabelaRedeMetalico;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.VelocidadeVendor;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.Velocidades;
import dao.dslam.impl.login.LoginComJumpMetalico;
import dao.dslam.impl.metalico.DslamMetalicoVivo1;
import dao.dslam.impl.retorno.TratativaRetornoUtil;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import model.dslam.credencial.Credencial;

/**
 * MA5600T
 *
 * @author G0041775
 */
public class Keymile2510DslamVivo1 extends DslamMetalicoVivo1 {

    private transient TabelaRedeMetalico tabelaRede;

    public Keymile2510DslamVivo1(String ipDslam) {
        super(ipDslam, Credencial.KEYMILEV1, new LoginComJumpMetalico());
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
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_10240, "12416_128D_704_64U_I_A"));
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

    protected ComandoDslam getComandoConsultaEstadoAdminDaPorta(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/main/AdministrativeStatus");
    }

    protected ComandoDslam getComandoConsultaEstadoOperDaPorta(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/main/OperationalStatus");
    }

    @Override
    public EstadoDaPorta getEstadoDaPorta(InventarioRede i) throws Exception {
        ComandoDslam cmd = this.getCd().consulta(this.getComandoConsultaEstadoAdminDaPorta(i));
        ComandoDslam cmd1 = this.getCd().consulta(this.getComandoConsultaEstadoOperDaPorta(i));
        List<String> admin = cmd.getRetorno();
        List<String> oper = cmd1.getRetorno();

        String adminState = TratativaRetornoUtil.tratKeymile(admin, "State");
        String operState = TratativaRetornoUtil.tratKeymile(oper, "State");

        EstadoDaPorta portState = new EstadoDaPorta();
        portState.setAdminState(adminState.equalsIgnoreCase("UP"));
        portState.setOperState(operState.equalsIgnoreCase("UP"));
        portState.addInteracao(cmd);
        portState.addInteracao(cmd1);

        return portState;
    }

    protected ComandoDslam getProf(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/cfgm/chanprofile", 3000);
    }

    @Override
    public Profile getProfile(InventarioRede i) throws Exception {
        ComandoDslam cmd = this.getCd().consulta(this.getProf(i));
        List<String> pegaProfile = cmd.getRetorno();
        String first = TratativaRetornoUtil.tratKeymile(pegaProfile, "Name");
        Profile prof = new ProfileMetalico();
        prof.setProfileDown(first);
        prof.setProfileUp(first);

        prof.setDown(compare(first, Boolean.TRUE));
        prof.setUp(compare(first, Boolean.FALSE));
        prof.addInteracao(cmd);

        return prof;
    }

    protected ComandoDslam getComandoGetSrvc(InventarioRede i, String intrf) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/interface-" + intrf + "/status/ServiceStatus", 3000);
    }

    protected ComandoDslam getComandoGetSrvcStatus(InventarioRede i, Integer intrf) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/interface-" + intrf + "/cfgm/macsourcefilteringmode", 3000);
    }

    protected ComandoDslam getComandoConsultaVlan(String srvc) {
        return new ComandoDslam("get /services/packet/" + srvc + "/cfgm/Service");
    }

    @Override
    public VlanBanda getVlanBanda(InventarioRede i) throws Exception {
        ComandoDslam cmd = this.getCd().consulta(this.getComandoGetSrvc(i, "1"));
        List<String> pegaSrvc = cmd.getRetorno();
        ComandoDslam cmd1 = this.getCd().consulta(this.getComandoGetSrvcStatus(i, 1));
        List<String> pegaStatus = cmd1.getRetorno();
        String statusVlan = TratativaRetornoUtil.tratKeymile(pegaStatus, "MACSRCFilter");

        String leSrvc = TratativaRetornoUtil.tratKeymile(pegaSrvc, "ServicesCurrentConnected").replace("\"", "").replace(";", "");
        Integer svlan = new Integer("0");
        Integer cvlan = new Integer("0");
        EnumEstadoVlan state;
        ComandoDslam cmd2 = null;
        if (!leSrvc.contentEquals("no service connected")) {
            cmd2 = this.getCd().consulta(this.getComandoConsultaVlan(leSrvc));
            List<String> pegaVlan = cmd2.getRetorno();
            svlan = new Integer(TratativaRetornoUtil.tratKeymile(pegaVlan, "Svid"));
            cvlan = new Integer(TratativaRetornoUtil.tratKeymile(pegaVlan, "CVID"));
        }
        if (statusVlan.equalsIgnoreCase("None")) {
            state = EnumEstadoVlan.UP;
        } else if (statusVlan.equalsIgnoreCase("List")) {
            state = EnumEstadoVlan.DOWN;
        } else {
            state = EnumEstadoVlan.FLOODINGPREVENTION;
        }

        VlanBanda vlanBanda = new VlanBanda(cvlan, svlan, state);

        vlanBanda.addInteracao(cmd);
        vlanBanda.addInteracao(cmd1);
        vlanBanda.addInteracao(cmd2);

        return vlanBanda;
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
        if (tabelaRede == null) {
            getTabelaRede(i);
        }
        ReConexao r = new ReConexao(tabelaRede.getResync().intValue());
        tabelaRede.getInteracoes().forEach(r::addInteracao);
        return r;
    }

    protected ComandoDslam getVelSinc(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/status/status");
    }

    protected ComandoDslam getSnrAtn(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/status/bandstatus");
    }

    protected ComandoDslam getAttainableRate(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/status/attainablerate");
    }

    @Override
    public TabelaParametrosMetalico getTabelaParametros(InventarioRede i) throws Exception {
        ComandoDslam cmd = this.getCd().consulta(this.getVelSinc(i));
        List<String> velSinc = cmd.getRetorno();
        ComandoDslam cmd1 = this.getCd().consulta(this.getSnrAtn(i));
        List<String> atnSnr = cmd1.getRetorno();
        ComandoDslam cmd2 = getCd().consulta(getAttainableRate(i));
        List<String> att = cmd2.getRetorno();

        try {
            TabelaParametrosMetalicoVdsl tab = new TabelaParametrosMetalicoVdsl();
            tab.addInteracao(cmd);
            tab.addInteracao(cmd1);
            tab.addInteracao(cmd2);
            tab.setVelSincDown(new Double(TratativaRetornoUtil.tratKeymile(velSinc, "CurrentRate")));
            tab.setVelSincUp(new Double(TratativaRetornoUtil.tratKeymile(velSinc, "CurrentRate", 2)));
            tab.setVelMaxDown(new Double(TratativaRetornoUtil.tratKeymile(att, "Downstream")));
            tab.setVelMaxUp(new Double(TratativaRetornoUtil.tratKeymile(att, "Upstream")));
            tab.setAtnUp(new Double(TratativaRetornoUtil.tratKeymile(atnSnr, "CurrAttenuation")));
            tab.setSnrUp(new Double(TratativaRetornoUtil.tratKeymile(atnSnr, "CurrSnrMargin")));
            tab.setAtnUp1(new Double(TratativaRetornoUtil.tratKeymile(atnSnr, "CurrAttenuation", 2)));
            tab.setSnrUp1(new Double(TratativaRetornoUtil.tratKeymile(atnSnr, "CurrSnrMargin", 2)));
            tab.setAtnUp2(new Double(TratativaRetornoUtil.tratKeymile(atnSnr, "CurrAttenuation", 3)));
            tab.setSnrUp2(new Double(TratativaRetornoUtil.tratKeymile(atnSnr, "CurrSnrMargin", 3)));
            tab.setAtnDown(new Double(TratativaRetornoUtil.tratKeymile(atnSnr, "CurrAttenuation", 4)));
            tab.setSnrDown(new Double(TratativaRetornoUtil.tratKeymile(atnSnr, "CurrSnrMargin", 4)));
            tab.setAtnDown1(new Double(TratativaRetornoUtil.tratKeymile(atnSnr, "CurrAttenuation", 5)));
            tab.setSnrDown1(new Double(TratativaRetornoUtil.tratKeymile(atnSnr, "CurrSnrMargin", 5)));
            tab.setAtnDown2(new Double(TratativaRetornoUtil.tratKeymile(atnSnr, "CurrAttenuation", 6)));
            tab.setSnrDown2(new Double(TratativaRetornoUtil.tratKeymile(atnSnr, "CurrSnrMargin", 6)));
            return tab;
        } catch (Exception e) {

            try {
                TabelaParametrosMetalico tab = new TabelaParametrosMetalico();
                tab.addInteracao(cmd);
                tab.addInteracao(cmd1);
                tab.addInteracao(cmd2);
                tab.setVelSincDown(new Double(TratativaRetornoUtil.tratKeymile(velSinc, "CurrentRate")));
                tab.setVelSincUp(new Double(TratativaRetornoUtil.tratKeymile(velSinc, "CurrentRate", 2)));
                tab.setVelMaxDown(new Double(TratativaRetornoUtil.tratKeymile(att, "Downstream")));
                tab.setVelMaxUp(new Double(TratativaRetornoUtil.tratKeymile(att, "Upstream")));
                tab.setAtnUp(new Double(TratativaRetornoUtil.tratKeymile(atnSnr, "CurrAttenuation")));
                tab.setSnrUp(new Double(TratativaRetornoUtil.tratKeymile(atnSnr, "CurrSnrMargin")));
                tab.setAtnDown(new Double(TratativaRetornoUtil.tratKeymile(atnSnr, "CurrAttenuation", 2)));
                tab.setSnrDown(new Double(TratativaRetornoUtil.tratKeymile(atnSnr, "CurrSnrMargin", 2)));
                return tab;
            } catch (Exception ex) {
                TabelaParametrosMetalico tab = new TabelaParametrosMetalico();
                tab.addInteracao(cmd);
                tab.addInteracao(cmd1);
                tab.addInteracao(cmd2);
                return tab;
            }
        }

    }

    protected ComandoDslam getTabRede(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/pm/usercountertable", 3000);
    }

    @Override
    public TabelaRedeMetalico getTabelaRede(InventarioRede i) throws Exception {
        ComandoDslam cmd = this.getCd().consulta(this.getTabRede(i));
        List<String> lTabs = cmd.getRetorno();

        tabelaRede = new TabelaRedeMetalico();
        tabelaRede.addInteracao(cmd);

        tabelaRede.setPctDown(new BigInteger(TratativaRetornoUtil.tratKeymile(lTabs, "Value", 11)));
        tabelaRede.setPctUp(new BigInteger(TratativaRetornoUtil.tratKeymile(lTabs, "Value", 14)));
        tabelaRede.setCrcDown(new BigInteger(TratativaRetornoUtil.tratKeymile(lTabs, "Value", 19)));
        tabelaRede.setCrcUp(new BigInteger(TratativaRetornoUtil.tratKeymile(lTabs, "Value", 26)));
        tabelaRede.setFecDown(new BigInteger(TratativaRetornoUtil.tratKeymile(lTabs, "Value", 18)));
        tabelaRede.setFecUp(new BigInteger(TratativaRetornoUtil.tratKeymile(lTabs, "Value", 25)));
        tabelaRede.setResync(new BigInteger(TratativaRetornoUtil.tratKeymile(lTabs, "Value", 24)));
        String[] tempoContando = TratativaRetornoUtil.tratKeymile(lTabs, "Value", 2).replace("T", " ").split(" ");
        BigInteger daysToSecs = new BigInteger(tempoContando[0]).multiply(new BigInteger("86400"));
        String[] separaTempo = tempoContando[1].split(":");
        BigInteger hoursToSecs = new BigInteger(separaTempo[0]).multiply(new BigInteger("3600"));
        BigInteger minutesToSecs = new BigInteger(separaTempo[1]).multiply(new BigInteger("60"));
        BigInteger secs = new BigInteger(separaTempo[2]);

        daysToSecs.add(hoursToSecs);
        daysToSecs.add(minutesToSecs);
        daysToSecs.add(secs);
        tabelaRede.setTempoMedicao(daysToSecs);

        return tabelaRede;
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
    public Modulacao setModulacao(InventarioRede i, Velocidades v) throws Exception {
        throw new FuncIndisponivelDslamException();
    }

    protected ComandoDslam getComandoResetTabelaRede(InventarioRede i) {
        return new ComandoDslam("cd /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/pm\nusercounterreset");
    }

    @Override
    public TabelaRedeMetalico resetTabelaRede(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoResetTabelaRede(i));
        TabelaRedeMetalico t = getTabelaRede(i);
        t.getInteracoes().add(0, cmd);
        return t;
    }

    protected ComandoDslam getComandoSetEstadoDaPorta(InventarioRede i, EstadoDaPorta e) {
        return new ComandoDslam("set /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/main/administrativestatus " + e.toString());
    }

    @Override
    public EstadoDaPorta setEstadoDaPorta(InventarioRede i, EstadoDaPorta e) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoSetEstadoDaPorta(i, e));
        EstadoDaPorta es = getEstadoDaPorta(i);
        es.getInteracoes().add(0, cmd);
        return es;
    }

    protected ComandoDslam getComandoSetProfileDefault(InventarioRede i, Velocidades vDown) {
        return new ComandoDslam("set /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/cfgm/chanprofile " + compare(vDown, Boolean.TRUE).getSintaxVel());
    }

    @Override
    public Profile setProfileDown(InventarioRede i, Velocidades v) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoSetProfileDefault(i, v));
        Profile p = getProfile(i);
        p.getInteracoes().add(0, cmd);
        return p;
    }

    @Override
    public Profile setProfileUp(InventarioRede i, Velocidades vDown, Velocidades vUp) throws Exception {
        return setProfileDown(i, vDown);
    }

    protected ComandoDslam getComandoSetMacSourceFilteringMode(InventarioRede i, String intrf, String mode) {
        return new ComandoDslam("set /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/interface-" + intrf + "/cfgm/macsourcefilteringmode " + mode);
    }

    protected ComandoDslam getComandoCreateVlanBanda(InventarioRede i) {
        return new ComandoDslam("cd /services/packet/1to1doubletag/cfgm", 1000,
                "createservice /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/interface-1 " + i.getCvlan() + " cos0 " + i.getRin() + " cos0 swap");
    }

    @Override
    public VlanBanda createVlanBanda(InventarioRede i, Velocidades vDown, Velocidades vUp) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoCreateVlanBanda(i));
        ComandoDslam cmd1 = getCd().consulta(getComandoSetMacSourceFilteringMode(i, "1", "none"));
        VlanBanda v = getVlanBanda(i);
        v.getInteracoes().add(0, cmd1);
        v.getInteracoes().add(0, cmd);
        return v;
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

    protected ComandoDslam getComandoDeleteVlan(String srvc) {
        return new ComandoDslam("cd /services/packet/1to1doubletag/cfgm/", 500, "deleteservice " + srvc);
    }

    @Override
    public VlanBanda deleteVlanBanda(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoGetSrvc(i, "1"));
        List<String> pegaSrvc = cmd.getRetorno();
        List<String> leSrvc = TratativaRetornoUtil.numberFromString(TratativaRetornoUtil.tratKeymile(pegaSrvc, "ServicesCurrentConnected"));
        String srvc = leSrvc.get(leSrvc.size() - 1).replace("-", "");
        ComandoDslam cmd1 = getCd().consulta(getComandoDeleteVlan(srvc));
        VlanBanda v = getVlanBanda(i);
        v.getInteracoes().add(0, cmd1);
        v.getInteracoes().add(0, cmd);
        return v;
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
        return new ComandoDslam("set /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/interface-1/cfgm/macsourcefilteringmode floodingprevention");
    }

    protected ComandoDslam getComandoGetDeviceMAC1(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/status/one2onemacforwardinglist", 3000);
    }

    protected ComandoDslam getComandoGetDeviceMAC2(InventarioRede i) {
        return new ComandoDslam("set /unit-" + i.getSlot() + "/port-" + i.getPorta() + "/chan-1/interface-1/cfgm/macsourcefilteringmode none");
    }

    @Override
    public DeviceMAC getDeviceMac(InventarioRede i) throws Exception {
        List<ComandoDslam> cmds = new ArrayList<>();
        cmds.add(getCd().consulta(getComandoGetDeviceMAC(i)));
        String macValue = "";
        for (int j = 0; j < 5; j++) {
            Thread.sleep(3000);
            ComandoDslam cmd = getCd().consulta(getComandoGetDeviceMAC1(i));
            cmds.add(cmd);
            macValue = TratativaRetornoUtil.tratKeymile(cmd.getRetorno(), "MacAddress");
            if (!macValue.contains("Parâmetro não encontrado")) {
                break;
            }
        }
        cmds.add(getCd().consulta(getComandoGetDeviceMAC2(i)));
        String comDoisPontos = "";
        try {
            comDoisPontos = macValue.substring(0, 2) + ":" + macValue.substring(2, 4) + ":" + macValue.substring(4, 6) + ":" + macValue.substring(6, 8)
                    + ":" + macValue.substring(8, 10) + ":" + macValue.substring(10, 12);
        } catch (Exception e) {
        }
        String leMac = comDoisPontos.isEmpty() ? macValue : comDoisPontos;
        DeviceMAC m = new DeviceMAC(leMac);
        cmds.forEach(m::addInteracao);
        return m;
    }

}
