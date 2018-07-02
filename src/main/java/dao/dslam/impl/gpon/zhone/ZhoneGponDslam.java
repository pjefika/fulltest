/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.gpon.zhone;

import br.net.gvt.efika.efika_customer.model.customer.InventarioRede;
import br.net.gvt.efika.fulltest.exception.FuncIndisponivelDslamException;
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
import dao.dslam.impl.login.LoginLento;
import dao.dslam.impl.retorno.TratativaRetornoUtil;
import java.util.ArrayList;
import java.util.List;
import model.dslam.credencial.Credencial;

/**
 *
 * @author G0042204
 */
public class ZhoneGponDslam extends DslamGpon {

    public ZhoneGponDslam(String ipDslam) {
        super(ipDslam, Credencial.ZHONE, new LoginLento());
    }

    private Integer getL500(Integer logica) {
        return logica + 500;
    }

    private Integer getL700(Integer logica) {
        return logica + 700;
    }

    private Integer getL900(Integer logica) {
        return logica + 900;
    }

    private Integer getL1100(Integer logica) {
        return logica + 1100;
    }

    private transient TabelaParametrosGpon tabParam;
    private transient EstadoDaPorta estado;
    private transient VlanBanda vlanBanda;
    private transient VlanVoip vlanVoip;
    private transient VlanVod vlanVod;
    private transient DeviceMAC mac;

    public ComandoDslam getComandoTabelaParametros(InventarioRede i) {
        return new ComandoDslam("onu status " + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica(), 5000);
    }

    private void getParams(InventarioRede i) throws Exception {
        ComandoDslam cmd = this.getCd().consulta(this.getComandoTabelaParametros(i));
        List<String> leParams = cmd.getRetorno();
        List<String> pegaParams = TratativaRetornoUtil.tratZhone(leParams, "1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica(), "-?\\.?(\\d+((\\.|,| )\\d+)?)");

        Double potOlt = pegaParams.size() < 8 ? new Double(0) : new Double(pegaParams.get(5));
        Double potOnt = pegaParams.size() < 8 ? new Double(pegaParams.get(5)) : new Double(pegaParams.get(6));

        tabParam = new TabelaParametrosGpon();
        tabParam.setPotOlt(potOlt);
        tabParam.setPotOnt(potOnt);
        tabParam.addInteracao(cmd);

        List<String> pegaOper = TratativaRetornoUtil.tratZhone(leParams, "1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica(), "\\b\\w+\\b");
        String operState = pegaOper != null ? pegaOper.get(5) : "DOWN";
        estado = new EstadoDaPorta();
        estado.addInteracao(cmd);
        estado.setOperState(operState.equalsIgnoreCase("UP"));
    }

    private void getVlans(InventarioRede i) throws Exception {
        ComandoDslam cmd = this.getCd().consulta(this.getComandoConsultaVlan(i));
        List<String> leVlans = cmd.getRetorno();
        List<String> leVlanBanda = TratativaRetornoUtil.tratZhone(leVlans, "-" + this.getL500(i.getLogica()) + "-", "-?\\.?(\\d+((\\.|,| )\\d+)?)");
        Integer bandap100 = null;
        Integer bandacvlan = null;
        try {
            bandap100 = new Integer(leVlanBanda.get(1));
            bandacvlan = new Integer(leVlanBanda.get(0));
        } catch (Exception e) {
        }

        vlanBanda = new VlanBanda(bandacvlan, bandap100, EnumEstadoVlan.UP);
        vlanBanda.addInteracao(cmd);

        List<String> leVlanVoip = TratativaRetornoUtil.tratZhone(leVlans, "-" + this.getL700(i.getLogica()) + "-", "-?\\.?(\\d+((\\.|,| )\\d+)?)");
        Integer voipp100 = null;
        Integer voipcvlan = null;
        try {
            voipp100 = new Integer(leVlanVoip.get(1));
            voipcvlan = new Integer(leVlanVoip.get(0));
        } catch (Exception e) {
        }
        vlanVoip = new VlanVoip(voipcvlan, voipp100, EnumEstadoVlan.UP);
        vlanVoip.addInteracao(cmd);

        List<String> leVlanVod = TratativaRetornoUtil.tratZhone(leVlans, "-" + this.getL900(i.getLogica()) + "-", "-?\\.?(\\d+((\\.|,| )\\d+)?)");
        Integer vodp100 = null;
        Integer vodcvlan = null;
        try {
            vodp100 = new Integer(leVlanVod.get(1));
            vodcvlan = new Integer(leVlanVod.get(0));
        } catch (Exception e) {
        }
        vlanVod = new VlanVod(vodcvlan, vodp100, EnumEstadoVlan.UP);
        vlanVod.addInteracao(cmd);

        List<String> leVlanBandaMAC = TratativaRetornoUtil.tratZhone(leVlans, "-" + this.getL500(i.getLogica()) + "-", "([a-f\\d]{2}:){5}[a-f\\d]{2}");
        mac = new DeviceMAC();
        if (leVlanBandaMAC.size() > 0) {
            mac.setMac(leVlanBandaMAC.get(0).toUpperCase());
        }
        mac.addInteracao(cmd);

    }

    @Override
    public TabelaParametrosGpon getTabelaParametros(InventarioRede i) throws Exception {
        if (tabParam == null) {
            getParams(i);
        }
        return tabParam;
    }

    public ComandoDslam getComandoSerialOnt(InventarioRede i) {
        return new ComandoDslam("onu inventory 1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica(), 3000);
    }

    @Override
    public SerialOntGpon getSerialOnt(InventarioRede i) throws Exception {
        ComandoDslam cmd = this.getCd().consulta(this.getComandoSerialOnt(i));
        List<String> leSerial = cmd.getRetorno();
        List<String> pegaSerial = TratativaRetornoUtil.tratZhone(leSerial, i.getLogica().toString(), "\\b\\w+\\b", 2);

        String sernum = "";

        if (pegaSerial != null) {
            if (pegaSerial.size() > 3) {
                sernum = pegaSerial.get(6) + pegaSerial.get(5);
            } else {
                sernum = pegaSerial.get(pegaSerial.size() - 1) + pegaSerial.get(pegaSerial.size() - 2);
            }
        }
        SerialOntGpon serOnt = new SerialOntGpon();
        serOnt.setSerial(sernum);
        serOnt.addInteracao(cmd);

        return serOnt;
    }

    public ComandoDslam getComandoConsultaEstadoDaPorta(InventarioRede i) {
        return new ComandoDslam("port show 1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/gpononu", 5000); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EstadoDaPorta getEstadoDaPorta(InventarioRede i) throws Exception {
        ComandoDslam cmd = this.getCd().consulta(this.getComandoConsultaEstadoDaPorta(i));
        List<String> leAdmin = cmd.getRetorno();
        if (estado == null) {
            getParams(i);
        }
        List<String> pegaAdmin = TratativaRetornoUtil.tratZhone(leAdmin, "Administrative", "\\b\\w+\\b");
        String adminState = pegaAdmin.get(2);
        estado.setAdminState(adminState.equalsIgnoreCase("UP"));
        estado.addInteracao(cmd);

        return estado;
    }

    public ComandoDslam getComandoConsultaVlan(InventarioRede i) {
        return new ComandoDslam("bridge show vlan " + i.getCvlan(), 5000);
    }

    @Override
    public VlanBanda getVlanBanda(InventarioRede i) throws Exception {
        if (vlanBanda == null) {
            getVlans(i);
        }
        return vlanBanda;
    }

    @Override
    public VlanVoip getVlanVoip(InventarioRede i) throws Exception {
        if (vlanVoip == null) {
            getVlans(i);
        }
        return vlanVoip;
    }

    @Override
    public VlanVod getVlanVod(InventarioRede i) throws Exception {
        if (vlanVod == null) {
            getVlans(i);
        }
        return vlanVod;
    }

    public ComandoDslam getComandoConsultaVlanMulticast(InventarioRede i) {
        return new ComandoDslam("bridge show port 1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/gpononu", 90000);
    }

    @Override
    public VlanMulticast getVlanMulticast(InventarioRede i) throws Exception {
//        List<String> leVlan= this.getCd().consulta(this.getComandoConsultaVlanMulticast(i)).getRetorno();
//        List<String> leVlanMult = TratativaRetornoUtil.tratZhone(leVlan, "-"+this.getL1100(i.getLogica())+"-", "-?\\.?(\\d+((\\.|,| )\\d+)?)");
//        VlanMulticast vlanMult = new VlanMulticast();
//        Integer svlan = 0;
//
//        if(leVlanMult != null){
//            svlan = new Integer(leVlanMult.get(0));
//        }
//        vlanMult.setSvlan(svlan);
//
//        System.out.println(vlanMult.getSvlan());
//        return null;
        throw new FuncIndisponivelDslamException();
    }

    public ComandoDslam getComandoConsultaAlarmes(InventarioRede i) {
        return new ComandoDslam("onu alarms " + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica(), 5000);
    }

    @Override
    public AlarmesGpon getAlarmes(InventarioRede i) throws Exception {
        ComandoDslam cmd = this.getCd().consulta(this.getComandoConsultaAlarmes(i));
        List<String> leAlarmes = cmd.getRetorno();
        AlarmesGpon alarm = new AlarmesGpon();
        alarm.setListAlarmes(leAlarmes);
        for (String leAlarme : leAlarmes) {
            if (leAlarme.trim().equals("No active alarms found")) {
                alarm.setListAlarmes(new ArrayList<>());
                break;
            }
        }
        alarm.addInteracao(cmd);

        return alarm;
    }

    public ComandoDslam getComandoConsultaProfileDown(InventarioRede i) {
        return new ComandoDslam("get bridge-interface-record 1-" + i.getSlot() + "-" + i.getPorta() + "-" + this.getL500(i.getLogica()) + "-gponport-" + i.getCvlan() + "-" + i.getRin() + "/bridge", 3000);
    }

    public ComandoDslam getComandoConsultaProfileUp(InventarioRede i) {
        return new ComandoDslam("onu gemports " + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica(), 3000);
    }

    @Override
    public Profile getProfile(InventarioRede i) throws Exception {
        String profileDown = null;
        String profileUp = null;

        ComandoDslam cmd = this.getCd().consulta(this.getComandoConsultaProfileDown(i));
        ComandoDslam cmd1 = this.getCd().consulta(this.getComandoConsultaProfileUp(i));

        List<String> leProfDowns = cmd.getRetorno();
        List<String> leProfUps = cmd1.getRetorno();

        List<String> leProfileUp = TratativaRetornoUtil.tratZhone(leProfUps, "1-" + i.getSlot() + "-" + i.getPorta() + "-" + this.getL500(i.getLogica()), "-?\\.?(\\d+((\\.|,| )\\d+)?)");
        List<String> leProfileDown = TratativaRetornoUtil.tratZhone(leProfDowns, "bridgeIfEgressPacketRuleGroupIndex", "-?\\.?(\\d+((\\.|,| )\\d+)?)");
        try {
            profileDown = leProfileDown.get(0);
            profileUp = leProfileUp.get(leProfileUp.size() - 6);
        } catch (Exception e) {

        }

        Profile prof = new Profile();
        prof.setProfileDown(profileDown);
        prof.setProfileUp(profileUp);
        prof.setDown(compare(profileDown, true));
        prof.setUp(compare(profileUp, false));

        prof.addInteracao(cmd);
        prof.addInteracao(cmd1);

        return prof;
    }

    @Override
    public List<VelocidadeVendor> obterVelocidadesDownVendor() {
        if (velsDown.isEmpty()) {
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_1024, "1"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_3072, "3"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_5120, "5"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_10240, "10"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_15360, "15"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_25600, "25"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_35840, "35"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_51200, "50"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_102400, "100"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_153600, "150"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_204800, "200"));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_307200, "300"));
        }

        return velsDown;
    }

    @Override
    public List<VelocidadeVendor> obterVelocidadesUpVendor() {

        if (velsUp.isEmpty()) {
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_1024, "1000"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_2048, "2000"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_3072, "3000"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_5120, "5000"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_12800, "12500"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_25600, "25000"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_51200, "50000"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_76800, "75000"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_102400, "100000"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_153600, "150000"));
        }

        return velsUp;
    }

    @Override
    public DeviceMAC getDeviceMac(InventarioRede i) throws Exception {
        if (mac == null) {
            getVlans(i);
        }
        return mac;
    }

    protected ComandoDslam getComandoGetIdOnt(InventarioRede i, SerialOntGpon s) {
        return new ComandoDslam("onu show " + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica(), 3000);
    }

    protected ComandoDslam getComandoSetOntToOlt(InventarioRede i, String idOnt) {
        return new ComandoDslam("onu set " + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " " + idOnt);
    }

    @Override
    public SerialOntGpon setOntToOlt(InventarioRede i, SerialOntGpon s) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoGetIdOnt(i, s));
        List<String> pegaIdOnt = cmd.getRetorno();
        String leSerNum = s.getSerial().substring(4, s.getSerial().length());
        String leIdOnt = TratativaRetornoUtil.tratZhone(pegaIdOnt, leSerNum, "\\b\\w+\\b").get(0);
        ComandoDslam cmd1 = getCd().consulta(getComandoSetOntToOlt(i, leIdOnt));
        SerialOntGpon se = getSerialOnt(i);
        se.getInteracoes().add(0, cmd1);
        se.getInteracoes().add(0, cmd);
        return getSerialOnt(i);
    }

    protected ComandoDslam getComandoSetEstadoDaPorta(InventarioRede i, EstadoDaPorta e) {
        return new ComandoDslam("port " + e.toString() + " 1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/gpononu");
    }

    @Override
    public EstadoDaPorta setEstadoDaPorta(InventarioRede i, EstadoDaPorta e) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoSetEstadoDaPorta(i, e));
        EstadoDaPorta es = getEstadoDaPorta(i);
        es.getInteracoes().add(0, cmd);
        return es;
    }

    protected ComandoDslam getComandoCreateVlanBanda(InventarioRede i, Velocidades down, Velocidades up) {
        return new ComandoDslam("bridge add 1-" + i.getSlot() + "-" + i.getPorta() + "-" + getL500(i.getLogica()) + "/gponport "
                + "gtp " + compare(up, false).getSintaxVel() + " downlink vlan " + i.getCvlan() + " slan " + i.getRin() + " stagged "
                + "epktrule " + compare(down, true).getSintaxVel(), 5000);
    }

    @Override
    public VlanBanda createVlanBanda(InventarioRede i, Velocidades vDown, Velocidades vUp) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoCreateVlanBanda(i, vDown, vUp));
        vlanBanda = null;
        VlanBanda v = getVlanBanda(i);
        v.getInteracoes().add(0, cmd);
        return v;
    }

    protected ComandoDslam getComandoCreateVoip(InventarioRede i) {
        return new ComandoDslam("bridge add 1-" + i.getSlot() + "-" + i.getPorta() + "-" + getL700(i.getLogica()) + "/gponport gtp 2 "
                + "downlink vlan " + i.getCvlan() + " slan " + i.getVlanVoip() + " stagged cos 5 outcosall 5 "
                + "scos 5 soutcosall 5 epktrule 2", 3000);
    }

    @Override
    public VlanVoip createVlanVoip(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoCreateVoip(i));
        vlanVoip = null;
        VlanVoip v = getVlanVoip(i);
        v.getInteracoes().add(0, cmd);
        return v;
    }

    protected ComandoDslam getComandoCreateVlanVod(InventarioRede i) {
        return new ComandoDslam("bridge add 1-" + i.getSlot() + "-" + i.getPorta() + "-" + getL900(i.getLogica()) + "/gponport gtp 1 "
                + "downlink vlan " + i.getCvlan() + " slan " + i.getVlanVod() + " stagged cos 3 "
                + "outcosall 3 scos 3 soutcosall 3", 3000);
    }

    @Override
    public VlanVod createVlanVod(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoCreateVlanVod(i));
        vlanVod = null;
        VlanVod v = getVlanVod(i);
        v.getInteracoes().add(0, cmd);
        return v;
    }

    @Override
    public VlanMulticast createVlanMulticast(InventarioRede i) throws Exception {
        return null;
    }

    protected ComandoDslam getComandoUnsetOntFromOlt(InventarioRede i) {
        return new ComandoDslam("onu clear " + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica(), 3000);
    }

    @Override
    public SerialOntGpon unsetOntFromOlt(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoUnsetOntFromOlt(i));
        SerialOntGpon s = getSerialOnt(i);
        s.getInteracoes().add(0, cmd);

        return s;
    }

    protected ComandoDslam getComandoDeleteVlanBanda(InventarioRede i) {
        return new ComandoDslam("bridge delete 1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/gpononu slan " + i.getRin(), 1500);
    }

    @Override
    public VlanBanda deleteVlanBanda(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoDeleteVlanBanda(i));
        vlanBanda = null;
        VlanBanda v = getVlanBanda(i);
        v.getInteracoes().add(0, cmd);
        return v;
    }

    protected ComandoDslam getComandoDeleteVlanVoip(InventarioRede i) {
        return new ComandoDslam("bridge delete 1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/gpononu slan " + i.getVlanVoip(), 1500);
    }

    @Override
    public VlanVoip deleteVlanVoip(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoDeleteVlanVoip(i));
        vlanVoip = null;
        VlanVoip v = getVlanVoip(i);
        v.getInteracoes().add(0, cmd);
        return v;
    }

    protected ComandoDslam getComandoDeleteVlanVod(InventarioRede i) {
        return new ComandoDslam("bridge delete 1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/gpononu slan " + i.getVlanVod(), 1500);
    }

    @Override
    public VlanVod deleteVlanVod(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoDeleteVlanVod(i));
        vlanVod = null;
        VlanVod v = getVlanVod(i);
        v.getInteracoes().add(0, cmd);
        return v;
    }

    @Override
    public VlanMulticast deleteVlanMulticast(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }

    protected ComandoDslam getComandoSetProfileDown(InventarioRede i, Velocidades v) {
        return new ComandoDslam("bridge modify 1-" + i.getSlot() + "-" + i.getPorta() + "-" + getL500(i.getLogica()) + "-gponport-"
                + i.getCvlan() + "-" + i.getRin() + "/bridge epktrule " + compare(v, true).getSintaxVel(), 1500);
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
        ComandoDslam cmd = getCd().consulta(getComandoDeleteVlanBanda(i));
        ComandoDslam cmd1 = getCd().consulta(getComandoCreateVlanBanda(i, vDown, vUp));
        Profile p = getProfile(i);
        p.getInteracoes().add(0, cmd1);
        p.getInteracoes().add(0, cmd);
        return p;
    }

//    @Override
//    public Profile castProfile(Velocidades v) {
//        Profile p = new Profile();
//        p.setProfileDown(v.getVel());
//        Integer leProfUp = Math.round(new Float(v.getVel()) * 1000);
//        p.setProfileUp(leProfUp.toString());
//        return p;
//    }
    protected ComandoDslam getComandoGetSlotsAvailableOnts0() {
        return new ComandoDslam("onu show");
    }

    protected ComandoDslam getComandoGetSlotsAvailableOnts1() {
        return new ComandoDslam("Y");
    }

    protected ComandoDslam getComandoGetSlotsAvailableOnts2() {
        return new ComandoDslam("A", 15000);
    }

    private List<String> getSernum(List<String> listSerial) {
        List<String> leSernums = new ArrayList<>();
        for (String string : listSerial) {

            if (string.trim().length() > 5) {
                String[] leSer = string.split("\\b\\w+\\b");
                String serNum = leSer[1] + leSer[2];
                leSernums.add(serNum);
            }

        }
        return leSernums;
    }

    @Override
    public List<SerialOntGpon> getSlotsAvailableOnts(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoGetSlotsAvailableOnts0());
        Thread.sleep(1000);
        ComandoDslam cmd1 = getCd().consulta(getComandoGetSlotsAvailableOnts1());
        Thread.sleep(5000);
        ComandoDslam cmd2 = getCd().consulta(getComandoGetSlotsAvailableOnts2());
        List<String> leResp = cmd2.getRetorno();

        List<String> leSerns = TratativaRetornoUtil.linhasAbaixo(leResp, "sernoID");
        List<String> serials = getSernum(leSerns);
        List<SerialOntGpon> leSerialOnt = new ArrayList<>();
        for (String serial : serials) {
            SerialOntGpon s = new SerialOntGpon();
            s.setSerial(serial);
            leSerialOnt.add(s);
        }

        if (leSerialOnt.size() > 0) {
            leSerialOnt.get(0).getInteracoes().add(0, cmd2);
            leSerialOnt.get(0).getInteracoes().add(0, cmd1);
            leSerialOnt.get(0).getInteracoes().add(0, cmd);
        } else {
            SerialOntGpon s = new SerialOntGpon();
            s.getInteracoes().add(0, cmd2);
            s.getInteracoes().add(0, cmd1);
            s.getInteracoes().add(0, cmd);
            leSerialOnt.add(s);
        }
        return leSerialOnt;

    }

    @Override
    public List<Porta> getEstadoPortasProximas(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ReConexao getReconexoes(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PortaPON getPortaPON(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
