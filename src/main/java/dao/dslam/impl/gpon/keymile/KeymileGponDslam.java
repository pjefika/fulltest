/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.gpon.keymile;

import br.net.gvt.efika.efika_customer.model.customer.InventarioRede;
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
import dao.dslam.factory.exception.FuncIndisponivelDslamException;
import dao.dslam.impl.gpon.DslamGpon;
import dao.dslam.impl.login.LoginRapido;
import dao.dslam.impl.retorno.TratativaRetornoUtil;
import java.util.ArrayList;
import java.util.List;
import model.dslam.credencial.Credencial;

/**
 *
 * @author G0042204
 */
public class KeymileGponDslam extends DslamGpon {

    public KeymileGponDslam(String ipDslam) {
        super(ipDslam, Credencial.KEYMILE, new LoginRapido());
    }

    protected ComandoDslam getComandoPotOlt(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/status/olt", 3000);
    }

    protected ComandoDslam getComandoPotOnt(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/status/ont", 3000);
    }

    protected ComandoDslam getComandoOperPortaPON(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/main/OperationalStatus", 3000);
    }

    protected ComandoDslam getComandoAdminPortaPON(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/main/AdministrativeStatus", 3000);
    }

    @Override
    public PortaPON getPortaPON(InventarioRede i) throws Exception {
        ComandoDslam cmd = this.getCd().consulta(this.getComandoAdminPortaPON(i));
        ComandoDslam cmd0 = this.getCd().consulta(this.getComandoOperPortaPON(i));
        List<String> admin = cmd.getRetorno();
        List<String> oper = cmd0.getRetorno();
        String adminState = TratativaRetornoUtil.tratKeymile(admin, "State");
        String operState = TratativaRetornoUtil.tratKeymile(oper, "State");
        PortaPON portState = new PortaPON();
        portState.addInteracao(cmd);
        portState.addInteracao(cmd0);
        portState.setAdminState(adminState.equalsIgnoreCase("UP"));
        portState.setOperState(operState.equalsIgnoreCase("UP"));
        return portState;
    }

    @Override
    public TabelaParametrosGpon getTabelaParametros(InventarioRede i) throws Exception {
        ComandoDslam cmd0 = this.getCd().consulta(this.getComandoPotOlt(i));
        ComandoDslam cmd1 = this.getCd().consulta(this.getComandoPotOnt(i));
        List<String> retOlt = cmd0.getRetorno();
        List<String> retOnt = cmd1.getRetorno();

        TabelaParametrosGpon tabParam = new TabelaParametrosGpon();
        tabParam.setPotOlt(new Double(TratativaRetornoUtil.tratKeymile(retOlt, "rxInputPower")));
        tabParam.setPotOnt(new Double(TratativaRetornoUtil.tratKeymile(retOnt, "rxInputPower")));
        tabParam.addInteracao(cmd0);
        tabParam.addInteracao(cmd1);
        return tabParam;
    }

    protected ComandoDslam getComandoSerialOnt(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/cfgm/onuCfgTable");
    }

    protected ComandoDslam getComandoListaShelf(InventarioRede i) {
        return new ComandoDslam("ls -e", 2000);
    }

    @Override
    public SerialOntGpon getSerialOnt(InventarioRede i) throws Exception {
        ComandoDslam cmd = this.getCd().consulta(this.getComandoSerialOnt(i));
        List<String> serOnt = cmd.getRetorno();
        String sernum = TratativaRetornoUtil.tratKeymile(serOnt, "SerialNumber").replace("\"", "");

        if (sernum.contains("ABCD00")) {
            sernum = "";
        }

        SerialOntGpon ont = new SerialOntGpon();
        ont.setSerial(sernum);
        ont.addInteracao(cmd);

        return ont;
    }

    protected ComandoDslam getComandoConsultaEstadoAdminDaPorta(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/main/AdministrativeStatus", 500);
    }

    protected ComandoDslam getComandoConsultaEstadoOperDaPorta(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/port-1/main/OperationalStatus", 500);
    }

    @Override
    public EstadoDaPorta getEstadoDaPorta(InventarioRede i) throws Exception {
        ComandoDslam cmd0 = this.getCd().consulta(this.getComandoConsultaEstadoAdminDaPorta(i));
        ComandoDslam cmd1 = this.getCd().consulta(this.getComandoConsultaEstadoOperDaPorta(i));
        List<String> admin = cmd0.getRetorno();
        List<String> oper = cmd1.getRetorno();

        String adminState = TratativaRetornoUtil.tratKeymile(admin, "State");
        String operState = TratativaRetornoUtil.tratKeymile(oper, "State");

        EstadoDaPorta portState = new EstadoDaPorta();
        portState.setAdminState(adminState.equalsIgnoreCase("UP"));
        portState.setOperState(operState.equalsIgnoreCase("UP"));

        portState.addInteracao(cmd0);
        portState.addInteracao(cmd1);

        return portState;
    }

    protected ComandoDslam getComandoConsultaVlanBanda1(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/port-1/interface-1/status/ServiceStatus");
    }

    protected ComandoDslam getComandoConsultaStatusVlanBanda(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/port-1/interface-1/cfgm/macsourcefilteringmode");
    }

    protected ComandoDslam getComandoConsultaVlan2(String srvc) {
        return new ComandoDslam("get /services/packet/" + srvc + "/cfgm/Service");
    }

    @Override
    public VlanBanda getVlanBanda(InventarioRede i) throws Exception {
        ComandoDslam cmd0 = this.getCd().consulta(this.getComandoConsultaVlanBanda1(i));
        ComandoDslam cmd1 = this.getCd().consulta(this.getComandoConsultaStatusVlanBanda(i));
        List<String> pegaSrvc = cmd0.getRetorno();
        List<String> pegaStatus = cmd1.getRetorno();
        String leStatus = TratativaRetornoUtil.tratKeymile(pegaStatus, "MACSRCFilter");
        String leSrvc = TratativaRetornoUtil.tratKeymile(pegaSrvc, "ServicesCurrentConnected").replace("\"", "").replace(";", "");
        Integer cvlan = new Integer("0");
        Integer svlan = new Integer("0");
        EnumEstadoVlan state;
        ComandoDslam cmd2 = null;
        if (!leSrvc.contains("no service connected") && !leStatus.contains("Parâmetro não encontrado MACSRCFilter")) {
            cmd2 = this.getCd().consulta(this.getComandoConsultaVlan2(leSrvc));
            List<String> pegaVlan = cmd2.getRetorno();
            svlan = new Integer(TratativaRetornoUtil.tratKeymile(pegaVlan, "Svid"));
            cvlan = new Integer(TratativaRetornoUtil.tratKeymile(pegaVlan, "CVID"));
        }
        if (leStatus.equalsIgnoreCase("None")) {
            state = EnumEstadoVlan.UP;
        } else if (leStatus.equalsIgnoreCase("List")) {
            state = EnumEstadoVlan.DOWN;
        } else {
            state = EnumEstadoVlan.FLOODINGPREVENTION;
        }
        VlanBanda vlanBanda = new VlanBanda(cvlan, svlan, state);
        vlanBanda.addInteracao(cmd0);
        vlanBanda.addInteracao(cmd1);
        if (cmd2 != null) {
            vlanBanda.addInteracao(cmd2);
        }

        return vlanBanda;
    }

    protected ComandoDslam getComandoConsultaVlanVoip1(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/port-1/interface-2/status/ServiceStatus");
    }

    protected ComandoDslam getComandoConsultaStatusVlanVoip(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/port-1/interface-2/cfgm/macsourcefilteringmode");
    }

    @Override
    public VlanVoip getVlanVoip(InventarioRede i) throws Exception {
        ComandoDslam cmd0 = this.getCd().consulta(this.getComandoConsultaVlanVoip1(i));
        ComandoDslam cmd1 = this.getCd().consulta(this.getComandoConsultaStatusVlanVoip(i));
        List<String> pegaSrvc = cmd0.getRetorno();
        List<String> pegaStatus = cmd1.getRetorno();
        String leStatus = TratativaRetornoUtil.tratKeymile(pegaStatus, "MACSRCFilter");
        String leSrvc = TratativaRetornoUtil.tratKeymile(pegaSrvc, "ServicesCurrentConnected").replace("\"", "").replace(";", "");

        EnumEstadoVlan state;
        Integer cvlan = new Integer("0");
        Integer p100 = new Integer("0");
        ComandoDslam cmd2 = null;
        if (!leSrvc.contentEquals("no service connected") && !leStatus.contains("Parâmetro não encontrado MACSRCFilter")) {
            cmd2 = this.getCd().consulta(this.getComandoConsultaVlan2(leSrvc));
            List<String> pegaVlan = cmd2.getRetorno();
            cvlan = new Integer(TratativaRetornoUtil.tratKeymile(pegaVlan, "Svid"));
            p100 = new Integer(TratativaRetornoUtil.tratKeymile(pegaVlan, "CVID"));
        }
        if (leStatus.equalsIgnoreCase("None")) {
            state = EnumEstadoVlan.UP;
        } else if (leStatus.equalsIgnoreCase("List")) {
            state = EnumEstadoVlan.DOWN;
        } else {
            state = EnumEstadoVlan.FLOODINGPREVENTION;
        }

        VlanVoip vlanVoip = new VlanVoip(p100, cvlan, state);

        vlanVoip.addInteracao(cmd0);
        vlanVoip.addInteracao(cmd1);
        if (cmd2 != null) {
            vlanVoip.addInteracao(cmd2);
        }

        return vlanVoip;
    }

    protected ComandoDslam getComandoConsultaVlanVod1(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/port-1/interface-3/status/ServiceStatus");
    }

    protected ComandoDslam getComandoConsultaStatusVlanVod(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/port-1/interface-3/cfgm/macsourcefilteringmode");
    }

    protected ComandoDslam getComandoConsultaStatusVlanMulticast(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/port-1/interface-4/cfgm/macsourcefilteringmode");
    }

    protected ComandoDslam getComandoGetVodStatistics(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/port-1/interface-3/pm/usercountertable");
    }

    @Override
    public VlanVod getVlanVod(InventarioRede i) throws Exception {
        ComandoDslam cmd0 = this.getCd().consulta(this.getComandoConsultaVlanVod1(i));
        ComandoDslam cmd1 = this.getCd().consulta(this.getComandoConsultaStatusVlanVod(i));
        ComandoDslam cmd2 = this.getCd().consulta(this.getComandoGetVodStatistics(i));
        List<String> pegaSrvc = cmd0.getRetorno();
        List<String> pegaStatus = cmd1.getRetorno();
        List<String> pegaDetails = cmd2.getRetorno();
        String leSrvc = TratativaRetornoUtil.tratKeymile(pegaSrvc, "ServicesCurrentConnected").replace("\"", "").replace(";", "");
        String leStatus = TratativaRetornoUtil.tratKeymile(pegaStatus, "MACSRCFilter");

        EnumEstadoVlan state;
        Integer cvlan = new Integer("0");
        Integer p100 = new Integer("0");
        ComandoDslam cmd3 = null;
        if (!leSrvc.contentEquals("no service connected") && !leStatus.contains("Parâmetro não encontrado MACSRCFilter")) {
            cmd3 = this.getCd().consulta(this.getComandoConsultaVlan2(leSrvc));
            List<String> pegaVlan = cmd3.getRetorno();
            cvlan = new Integer(TratativaRetornoUtil.tratKeymile(pegaVlan, "Svid"));
            p100 = new Integer(TratativaRetornoUtil.tratKeymile(pegaVlan, "CVID"));
        }
        if (leStatus.equalsIgnoreCase("None")) {
            state = EnumEstadoVlan.UP;
        } else if (leStatus.equalsIgnoreCase("List")) {
            state = EnumEstadoVlan.DOWN;
        } else {
            state = EnumEstadoVlan.FLOODINGPREVENTION;
        }

        VlanVod vlanVod = new VlanVod(p100, cvlan, state);
        vlanVod.addInteracao(cmd0);
        vlanVod.addInteracao(cmd1);
        vlanVod.addInteracao(cmd2);
        if (cmd3 != null) {
            vlanVod.addInteracao(cmd3);
        }
        try {
            vlanVod.setPctDown(new Integer(TratativaRetornoUtil.tratKeymile(pegaDetails, "Value", 3)));
            vlanVod.setPctUp(new Integer(TratativaRetornoUtil.tratKeymile(pegaDetails, "Value", 5)));
        } catch (Exception e) {
        }
        return vlanVod;
    }

    protected ComandoDslam getComandoConsultaVlanMulticast1(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/port-1/interface-4/status/ServiceStatus");
    }

    protected ComandoDslam getComandoGetIpIgmp() {
        return new ComandoDslam("get /multicast/cfgm/LocalIPAddressForIGMPGeneration");
    }

    protected ComandoDslam getComandoGetMulticastStatistics(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/port-1/interface-4/pm/usercountertable");
    }

    @Override
    public VlanMulticast getVlanMulticast(InventarioRede i) throws Exception {
        ComandoDslam cmd0 = this.getCd().consulta(this.getComandoConsultaVlanMulticast1(i));
        ComandoDslam cmd1 = this.getCd().consulta(this.getComandoConsultaStatusVlanMulticast(i));
        ComandoDslam cmd2 = this.getCd().consulta(this.getComandoGetMulticastStatistics(i));
        ComandoDslam cmd3 = this.getCd().consulta(this.getComandoGetIpIgmp());
        ComandoDslam cmd4 = null;
        List<String> pegaSrvc = cmd0.getRetorno();
        List<String> pegaStatus = cmd1.getRetorno();
        List<String> pegaDetails = cmd2.getRetorno();
        List<String> pegaIpIgmp = cmd3.getRetorno();
        String leSrvc = TratativaRetornoUtil.tratKeymile(pegaSrvc, "ServicesCurrentConnected").replace("\"", "").replace(";", "");
        VlanMulticast vlanMult = new VlanMulticast();
        String leStatus = TratativaRetornoUtil.tratKeymile(pegaStatus, "MACSRCFilter");
        Integer cvlan = new Integer("0");
        if (!leSrvc.contentEquals("no service connected") && !leStatus.contains("Parâmetro não encontrado MACSRCFilter")) {
            cmd4 = this.getCd().consulta(this.getComandoConsultaVlan2(leSrvc));
            List<String> pegaVlan = cmd4.getRetorno();
            cvlan = new Integer(TratativaRetornoUtil.tratKeymile(pegaVlan, "McastVID"));
        }
        EnumEstadoVlan state;
        if (leStatus.equalsIgnoreCase("None")) {
            state = EnumEstadoVlan.UP;
        } else if (leStatus.equalsIgnoreCase("List")) {
            state = EnumEstadoVlan.DOWN;
        } else {
            state = EnumEstadoVlan.FLOODINGPREVENTION;
        }
        vlanMult.setSvlan(cvlan);
        vlanMult.setState(state);

        vlanMult.addInteracao(cmd0);
        vlanMult.addInteracao(cmd1);
        vlanMult.addInteracao(cmd2);
        vlanMult.addInteracao(cmd3);
        if (cmd4 != null) {
            vlanMult.addInteracao(cmd4);
        }

        return vlanMult;
    }

    protected ComandoDslam getComandoConsultaAlarmes(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/fm/alarmstatus");
    }

    @Override
    public AlarmesGpon getAlarmes(InventarioRede i) throws Exception {
        ComandoDslam cmd = this.getCd().consulta(this.getComandoConsultaAlarmes(i));
        List<String> alarmesResp = cmd.getRetorno();
        AlarmesGpon alarmes = new AlarmesGpon();
        Integer e;
        for (e = 0; e < alarmesResp.size(); e++) {
            String leLine = alarmesResp.get(e);
            if (leLine.contains(" FaultCauseState") && leLine.contains("On")) {
                String pegaNomeAlarme = alarmesResp.get(e - 1);
                String nomeAlarme = pegaNomeAlarme.substring(0, pegaNomeAlarme.indexOf("\\ #")).replace("\"", "").trim();
                alarmes.getListAlarmes().add(nomeAlarme);
            }
        }
        alarmes.addInteracao(cmd);

        return alarmes;
    }

    protected ComandoDslam getComandoConsultaProfileUp(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/cfgm/onuCfgTable", 3000);
    }

    protected ComandoDslam getComandoConsultaProfileDown(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/port-1/interface-1/cfgm/IfRateLimiting");
    }

    @Override
    public Profile getProfile(InventarioRede i) throws Exception {
        ComandoDslam cmd = this.getCd().consulta(this.getComandoConsultaProfileUp(i));
        List<String> profileUpResp = cmd.getRetorno();
        String profUpIndex = TratativaRetornoUtil.tratKeymile(profileUpResp, "TcontVirtualPortBindingProfileIndex");
        String profileUp = TratativaRetornoUtil.upProfileNameKeymileGpon(new Integer(profUpIndex));

        ComandoDslam cmd1 = this.getCd().consulta(this.getComandoConsultaProfileDown(i));
        List<String> profileDownResp = cmd1.getRetorno();
        String profileDown = TratativaRetornoUtil.tratKeymile(profileDownResp, "Name", 2);

        Profile prof = new Profile();
        prof.setProfileUp(profileUp);
        prof.setProfileDown(profileDown);
        prof.setDown(compare(profileDown, true));
        prof.setUp(compare(profUpIndex, false));

        prof.addInteracao(cmd);
        prof.addInteracao(cmd1);

        return prof;
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

    @Override
    public List<VelocidadeVendor> obterVelocidadesUpVendor() {

        if (velsUp.isEmpty()) {
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_1024, TratativaRetornoUtil.upProfileIdKeymileGpon("HSI_1M_RETAIL_UP")));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_2048, TratativaRetornoUtil.upProfileIdKeymileGpon("HSI_2M_RETAIL_UP")));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_3072, TratativaRetornoUtil.upProfileIdKeymileGpon("HSI_3M_RETAIL_UP")));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_5120, TratativaRetornoUtil.upProfileIdKeymileGpon("HSI_5M_RETAIL_UP")));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_12800, TratativaRetornoUtil.upProfileIdKeymileGpon("HSI_12.5M_RETAIL_UP")));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_25600, TratativaRetornoUtil.upProfileIdKeymileGpon("HSI_25M_RETAIL_UP")));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_51200, TratativaRetornoUtil.upProfileIdKeymileGpon("HSI_50M_RETAIL_UP")));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_76800, TratativaRetornoUtil.upProfileIdKeymileGpon("HSI_75M_RETAIL_UP")));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_102400, TratativaRetornoUtil.upProfileIdKeymileGpon("HSI_100M_RETAIL_UP")));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_153600, TratativaRetornoUtil.upProfileIdKeymileGpon("HSI_150M_RETAIL_UP")));
        }

        return velsUp;
    }

    protected ComandoDslam getComandoConsultaOnuTable(InventarioRede i) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/status/onutablestatus");
    }

    @Override
    public DeviceMAC getDeviceMac(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoConsultaOnuTable(i));
        List<String> leTable = cmd.getRetorno();
        String leMac = TratativaRetornoUtil.tratKeymile(leTable, "OnuMacAddress");
        String mac = leMac.substring(0, 2) + ":" + leMac.substring(2, 4) + ":" + leMac.substring(4, 6)
                + ":" + leMac.substring(6, 8) + ":" + leMac.substring(8, 10) + ":" + leMac.substring(10, 12);
        DeviceMAC dMac = new DeviceMAC(mac);
        dMac.addInteracao(cmd);
        return dMac;
    }

    protected ComandoDslam getComandoSetOntToOlt(InventarioRede i, SerialOntGpon s, Velocidades vUp) {
        return new ComandoDslam("set /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/cfgm/onuCfgTable "
                + "\"" + s.getSerial() + "\" \"0000\" false vlanId "
                + compare(vUp, false).getSintaxVel() + " false \"\" \"\" \"\" 1");
    }

    @Override
    public SerialOntGpon setOntToOlt(InventarioRede i, SerialOntGpon s) throws Exception {
        ComandoDslam cmd = this.getCd().consulta(this.getComandoConsultaProfileUp(i));
        List<String> profileUpResp = cmd.getRetorno();
        String profUpIndex = TratativaRetornoUtil.tratKeymile(profileUpResp, "TcontVirtualPortBindingProfileIndex");
        ComandoDslam cmd1 = getCd().consulta(getComandoSetOntToOlt(i, s, compare(profUpIndex, false)));
        SerialOntGpon se = getSerialOnt(i);
        se.getInteracoes().add(0, cmd1);
        se.getInteracoes().add(0, cmd);

        return getSerialOnt(i);
    }

    protected ComandoDslam getComandoSetEstadoDaPorta(InventarioRede i, EstadoDaPorta e) {
        return new ComandoDslam("set /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/main/AdministrativeStatus " + e.toString());
    }

    @Override
    public EstadoDaPorta setEstadoDaPorta(InventarioRede i, EstadoDaPorta e) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoSetEstadoDaPorta(i, e));
        EstadoDaPorta es = getEstadoDaPorta(i);
        es.getInteracoes().add(0, cmd);
        return es;
    }

    protected ComandoDslam getComandoSetMacSourceFilteringMode(InventarioRede i, String intrf, String mode) {
        return new ComandoDslam("set /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/port-1/interface-" + intrf + "/cfgm/macsourcefilteringmode " + mode);
    }

    protected ComandoDslam getComandoCreateVlanBanda(InventarioRede i) {
        return new ComandoDslam("cd /services/packet/1to1doubletag/cfgm", 1000,
                "createservice /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/port-1/interface-1 " + i.getCvlan() + " cos0 " + i.getRin() + " cos0 swap");
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

    protected ComandoDslam getComandoCreateVlanVoip(InventarioRede i) {
        return new ComandoDslam("cd /services/packet/1to1doubletag/cfgm", 1000,
                "createservice /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/port-1/interface-2 " + i.getCvlan() + " cos3 " + i.getVlanVoip() + " cos3 swap");
    }

    @Override
    public VlanVoip createVlanVoip(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoCreateVlanVoip(i));
        ComandoDslam cmd1 = getCd().consulta(getComandoSetMacSourceFilteringMode(i, "2", "none"));
        VlanVoip v = getVlanVoip(i);
        v.getInteracoes().add(0, cmd1);
        v.getInteracoes().add(0, cmd);
        return v;
    }

    protected ComandoDslam getComandoCreateVlanVod(InventarioRede i) {
        return new ComandoDslam("cd /services/packet/1to1doubletag/cfgm", 1000,
                "createservice /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/port-1/interface-3 " + i.getCvlan() + " cos5 " + i.getVlanVod() + " cos5 swap");
    }

    @Override
    public VlanVod createVlanVod(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoCreateVlanVod(i));
        ComandoDslam cmd1 = getCd().consulta(getComandoSetMacSourceFilteringMode(i, "3", "none"));
        VlanVod v = getVlanVod(i);
        v.getInteracoes().add(0, cmd1);
        v.getInteracoes().add(0, cmd);

        return v;
    }

    protected ComandoDslam getComandoCreateVlanMulticast(InventarioRede i) {
        return new ComandoDslam("cd /services/packet/mcast/cfgm", 1000,
                "createservice /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/port-1/interface-4 {4000}");
    }

    @Override
    public VlanMulticast createVlanMulticast(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoCreateVlanMulticast(i));
        ComandoDslam cmd1 = getCd().consulta(getComandoSetMacSourceFilteringMode(i, "4", "none"));
        VlanMulticast v = getVlanMulticast(i);
        v.getInteracoes().add(0, cmd1);
        v.getInteracoes().add(0, cmd);
        return v;
    }

    protected ComandoDslam getComandoUnsetOntFromOlt(InventarioRede i) {
        return new ComandoDslam("/unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/cfgm/DisassociateONT");
    }

    @Override
    public SerialOntGpon unsetOntFromOlt(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoUnsetOntFromOlt(i));
        SerialOntGpon s = getSerialOnt(i);
        s.getInteracoes().add(0, cmd);
        return s;
    }

    protected ComandoDslam getComandoGetSrvc(InventarioRede i, String intrf) {
        return new ComandoDslam("get /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/port-1/interface-" + intrf + "/status/ServiceStatus");
    }

    protected ComandoDslam getComandoDeleteVlan(String srvc) {
        return new ComandoDslam("cd /services/packet/1to1doubletag/cfgm/", 500, "deleteservice " + srvc);
    }

    protected ComandoDslam getComandoDeleteMulticast(String srvc) {
        return new ComandoDslam("cd /services/packet/mcast/cfgm/", 500, "deleteservice " + srvc);
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
        ComandoDslam cmd = getCd().consulta(getComandoGetSrvc(i, "2"));
        List<String> pegaSrvc = cmd.getRetorno();
        List<String> leSrvc = TratativaRetornoUtil.numberFromString(TratativaRetornoUtil.tratKeymile(pegaSrvc, "ServicesCurrentConnected"));
        String srvc = leSrvc.get(leSrvc.size() - 1).replace("-", "");
        ComandoDslam cmd1 = getCd().consulta(getComandoDeleteVlan(srvc));
        VlanVoip v = getVlanVoip(i);
        v.getInteracoes().add(0, cmd1);
        v.getInteracoes().add(0, cmd);

        return v;
    }

    @Override
    public VlanVod deleteVlanVod(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoGetSrvc(i, "3"));
        List<String> pegaSrvc = cmd.getRetorno();
        List<String> leSrvc = TratativaRetornoUtil.numberFromString(TratativaRetornoUtil.tratKeymile(pegaSrvc, "ServicesCurrentConnected"));
        String srvc = leSrvc.get(leSrvc.size() - 1).replace("-", "");
        ComandoDslam cmd1 = getCd().consulta(getComandoDeleteVlan(srvc));
        VlanVod v = getVlanVod(i);
        v.getInteracoes().add(0, cmd1);
        v.getInteracoes().add(0, cmd);

        return v;
    }

    @Override
    public VlanMulticast deleteVlanMulticast(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoGetSrvc(i, "4"));
        List<String> pegaSrvc = cmd.getRetorno();
        List<String> leSrvc = TratativaRetornoUtil.numberFromString(TratativaRetornoUtil.tratKeymile(pegaSrvc, "ServicesCurrentConnected"));
        String srvc = leSrvc.get(leSrvc.size() - 1).replace("-", "");
        ComandoDslam cmd1 = getCd().consulta(getComandoDeleteMulticast(srvc));
        VlanMulticast v = getVlanMulticast(i);
        v.getInteracoes().add(0, cmd1);
        v.getInteracoes().add(0, cmd);

        return v;
    }

    protected ComandoDslam getComandoSetProfileDown(InventarioRede i, Velocidades v) {
        return new ComandoDslam("set /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/port-1/interface-1/cfgm/IfRateLimiting false default true " + compare(v, true).getSintaxVel());
    }

    @Override
    public Profile setProfileDown(InventarioRede i, Velocidades v) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoSetProfileDown(i, v));
        Profile p = getProfile(i);
        p.getInteracoes().add(0, cmd);
        return p;
    }

    @Override
    public Profile setProfileUp(InventarioRede i, Velocidades vDown, Velocidades vUp) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoSetOntToOlt(i, getSerialOnt(i), vUp));
        Profile p = getProfile(i);
        p.getInteracoes().add(0, cmd);
        return p;
    }

//    @Override
//    public Profile castProfile(Velocidades v) {
//        Profile p = new Profile();
//        p.setProfileDown("HSI_" + v.getVel() + "M_RETAIL_DOWN");
//        p.setProfileUp("HSI_" + v.getVel() + "M_RETAIL_UP");
//        return p;
//    }
    protected ComandoDslam getComandoGetSlotsAvailableOnts(InventarioRede i, String slot) {
        return new ComandoDslam("/unit-" + slot + "/status/FlushOnuBlacklist", 3000, "get /unit-" + slot + "/status/onuBlackListTable", 5000);
    }

    @Override
    public List<SerialOntGpon> getSlotsAvailableOnts(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoListaShelf(i));
        List<String> leShelf = cmd.getRetorno();
        List<String> slots = TratativaRetornoUtil.listaSlotsKeymile(leShelf, "SUGP");
        List<SerialOntGpon> lSerial = new ArrayList<>();

        for (String slot : slots) {
            ComandoDslam cmd1 = getCd().consulta(getComandoGetSlotsAvailableOnts(i, slot));
            List<String> leResp = cmd1.getRetorno();
            Integer qntSerial = TratativaRetornoUtil.countStringOccurrence(leResp, "SerialNumber");
            for (int e = 1; e <= qntSerial; e++) {
                String leSerial = TratativaRetornoUtil.tratKeymile(leResp, "SerialNumber", e);
                String lePorta = TratativaRetornoUtil.tratKeymile(leResp, "Odn", e);
                SerialOntGpon s = new SerialOntGpon();
                s.setSerial(leSerial);
                s.setSlot(new Integer(slot));
                s.setPorta(new Integer(lePorta));
                s.addInteracao(cmd1);
                lSerial.add(s);
            }
        }

        if (lSerial.size() > 0) {
            lSerial.get(0).getInteracoes().add(0, cmd);
        } else {
            SerialOntGpon s = new SerialOntGpon();
            s.getInteracoes().add(0, cmd);
            lSerial.add(s);
        }

        return lSerial;

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

    @Override
    public void resetIptvStatistics(InventarioRede i) throws Exception {
        getCd().consulta(getComandoResetMulticastStatistics(i));
        getCd().consulta(getComandoResetVodStatistics(i));
    }

    protected ComandoDslam getComandoResetVodStatistics(InventarioRede i) {
        return new ComandoDslam("cd /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/port-1/interface-3/pm\nusercounterreset");
    }

    protected ComandoDslam getComandoResetMulticastStatistics(InventarioRede i) {
        return new ComandoDslam("cd /unit-" + i.getSlot() + "/odn-" + i.getPorta() + "/ont-" + i.getLogica() + "/port-1/interface-4/pm\nusercounterreset");
    }

}
