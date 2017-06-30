/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.gpon.zhone;

import br.net.gvt.efika.customer.InventarioRede;
import dao.dslam.impl.ComandoDslam;
import dao.dslam.impl.gpon.DslamGpon;
import dao.dslam.impl.login.LoginLento;
import dao.dslam.impl.retorno.TratativaRetornoUtil;
import java.util.ArrayList;
import java.util.List;
import model.EnumEstadoVlan;
import model.dslam.consulta.DeviceMAC;
import model.dslam.consulta.EstadoDaPorta;
import model.dslam.consulta.Profile;
import model.dslam.consulta.VlanBanda;
import model.dslam.consulta.VlanMulticast;
import model.dslam.consulta.VlanVod;
import model.dslam.consulta.VlanVoip;
import model.dslam.consulta.gpon.AlarmesGpon;
import model.dslam.consulta.gpon.SerialOntGpon;
import model.dslam.consulta.gpon.TabelaParametrosGpon;
import model.dslam.credencial.Credencial;
import model.dslam.velocidade.Velocidades;

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

    private List<String> leParams;

    private List<String> leVlans;

    public ComandoDslam getComandoTabelaParametros(InventarioRede i) {
        return new ComandoDslam("onu status " + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica(), 5000);
    }

    @Override
    public TabelaParametrosGpon getTabelaParametros(InventarioRede i) throws Exception {
        if (leParams == null) {
            List<String> leParams = this.getCd().consulta(this.getComandoTabelaParametros(i)).getRetorno();
        }
        List<String> pegaParams = TratativaRetornoUtil.tratZhone(leParams, "1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica(), "-?\\.?(\\d+((\\.|,| )\\d+)?)");
        Double potOlt = new Double(pegaParams.get(5));
        Double potOnt = new Double(pegaParams.get(6));

        TabelaParametrosGpon tabParam = new TabelaParametrosGpon();
        tabParam.setPotOlt(potOlt);
        tabParam.setPotOnt(potOnt);

        System.out.println(tabParam.getPotOlt());
        System.out.println(tabParam.getPotOnt());

        return tabParam;
    }

    public ComandoDslam getComandoSerialOnt(InventarioRede i) {
        return new ComandoDslam("onu inventory 1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica(), 3000);
    }

    @Override
    public SerialOntGpon getSerialOnt(InventarioRede i) throws Exception {
        List<String> leSerial = this.getCd().consulta(this.getComandoSerialOnt(i)).getRetorno();
        List<String> pegaSerial = TratativaRetornoUtil.tratZhone(leSerial, i.getLogica().toString(), "\\b\\w+\\b", 2);

        String sernum = "";

        if (pegaSerial.size() > 3) {
            sernum = pegaSerial.get(6) + pegaSerial.get(5);
        } else {
            sernum = pegaSerial.get(pegaSerial.size() - 1) + pegaSerial.get(pegaSerial.size() - 2);
        }

        SerialOntGpon serOnt = new SerialOntGpon();
        serOnt.setSerial(sernum);

        System.out.println(serOnt.getSerial());

        return serOnt;
    }

    public ComandoDslam getComandoConsultaEstadoDaPorta(InventarioRede i) {
        return new ComandoDslam("port show 1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/gpononu", 5000); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EstadoDaPorta getEstadoDaPorta(InventarioRede i) throws Exception {
        List<String> leAdmin = this.getCd().consulta(this.getComandoConsultaEstadoDaPorta(i)).getRetorno();
        if (leParams == null) {
            leParams = this.getCd().consulta(this.getComandoTabelaParametros(i)).getRetorno();
        }

        List<String> pegaAdmin = TratativaRetornoUtil.tratZhone(leAdmin, "Administrative", "\\b\\w+\\b");
        List<String> pegaOper = TratativaRetornoUtil.tratZhone(leParams, "1-" + i.getSlot() + "-" + i.getPorta() + "-" + i.getLogica(), "\\b\\w+\\b");
        String adminState = pegaAdmin.get(2);
        String operState = pegaOper.get(5);

        EstadoDaPorta estado = new EstadoDaPorta();

        estado.setAdminState(adminState);
        estado.setOperState(operState);

        System.out.println(estado.getAdminState());
        System.out.println(estado.getOperState());

        return estado;
    }

    public ComandoDslam getComandoConsultaVlan(InventarioRede i) {
        return new ComandoDslam("bridge show vlan " + i.getCvLan(), 5000);
    }

    @Override
    public VlanBanda getVlanBanda(InventarioRede i) throws Exception {
        if (leVlans == null) {
            leVlans = this.getCd().consulta(this.getComandoConsultaVlan(i)).getRetorno();
        }

        List<String> leVlanBanda = TratativaRetornoUtil.tratZhone(leVlans, "-" + this.getL500(i.getLogica()) + "-", "-?\\.?(\\d+((\\.|,| )\\d+)?)");
        List<String> leVlanBandaStatus = TratativaRetornoUtil.tratZhone(leVlans, "-" + this.getL500(i.getLogica()) + "-", "\\b\\w+\\b");

        EnumEstadoVlan state = EnumEstadoVlan.DOWN;

        Integer cvlan = new Integer("0");
        Integer p100 = new Integer("0");

        if (leVlanBanda != null) {
            cvlan = new Integer(leVlanBanda.get(1));
            p100 = new Integer(leVlanBanda.get(0));
            for (String string : leVlanBandaStatus) {
                if (string.contentEquals("UP")) {
                    state = EnumEstadoVlan.UP;
                }
            }
        }
        VlanBanda vlanBanda = new VlanBanda(cvlan, p100, state);

        System.out.println(vlanBanda.getCvlan());
        System.out.println(vlanBanda.getSvlan());
        System.out.println(vlanBanda.getState());

        return vlanBanda;
    }

    @Override
    public VlanVoip getVlanVoip(InventarioRede i) throws Exception {
        if (leVlans == null) {
            leVlans = this.getCd().consulta(this.getComandoConsultaVlan(i)).getRetorno();
        }
        List<String> leVlanVoip = TratativaRetornoUtil.tratZhone(leVlans, "-" + this.getL700(i.getLogica()) + "-", "-?\\.?(\\d+((\\.|,| )\\d+)?)");
        List<String> leVlanVoipStatus = TratativaRetornoUtil.tratZhone(leVlans, "-" + this.getL700(i.getLogica()) + "-", "\\b\\w+\\b");
        Integer cvlan = new Integer("0");
        Integer p100 = new Integer("0");
        EnumEstadoVlan state = EnumEstadoVlan.DOWN;

        if (leVlanVoip != null) {
            cvlan = new Integer(leVlanVoip.get(1));
            p100 = new Integer(leVlanVoip.get(0));
            for (String string : leVlanVoipStatus) {
                if (string.contentEquals("UP")) {
                    state = EnumEstadoVlan.UP;
                }
            }
        }
        VlanVoip vlanVoip = new VlanVoip(p100, cvlan, state);

        System.out.println(vlanVoip.getCvlan());
        System.out.println(vlanVoip.getSvlan());

        return vlanVoip;
    }

    @Override
    public VlanVod getVlanVod(InventarioRede i) throws Exception {
        if (leVlans == null) {
            leVlans = this.getCd().consulta(this.getComandoConsultaVlan(i)).getRetorno();
        }
        List<String> leVlanVod = TratativaRetornoUtil.tratZhone(leVlans, "-" + this.getL900(i.getLogica()) + "-", "-?\\.?(\\d+((\\.|,| )\\d+)?)");
        List<String> leVlanVodStatus = TratativaRetornoUtil.tratZhone(leVlans, "-" + this.getL900(i.getLogica()) + "-", "\\b\\w+\\b");
        Integer cvlan = new Integer("0");
        Integer p100 = new Integer("0");
        EnumEstadoVlan state = EnumEstadoVlan.DOWN;

        if (leVlanVod != null) {
            cvlan = new Integer(leVlanVod.get(1));
            p100 = new Integer(leVlanVod.get(0));
            for (String string : leVlanVodStatus) {
                if (string.contentEquals("UP")) {
                    state = EnumEstadoVlan.UP;
                }
            }
        }

        VlanVod vlanVod = new VlanVod(p100, cvlan, state);

        System.out.println(vlanVod.getCvlan());
        System.out.println(vlanVod.getSvlan());

        return vlanVod;
    }

    public ComandoDslam getComandoConsultaVlanMulticast(InventarioRede i) {
        return new ComandoDslam("bridge show port 1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/gpononu", 45000);
    }

    @Override
    public VlanMulticast getVlanMulticast(InventarioRede i) throws Exception {
//        List<String> leVlan= this.getCd().consulta(this.getComandoConsultaVlanMulticast()).getRetorno();
//        List<String> leVlanMult = TratativaRetornoUtil.tratZhone(leVlan, "-"+this.getL1100()+"-", "-?\\.?(\\d+((\\.|,| )\\d+)?)");
//        VlanMulticast vlanMult = new VlanMulticast();
//        BigInteger cvlan = new BigInteger("0");
//
//        if(leVlanMult != null){
//            cvlan = new BigInteger(leVlanMult.get(0));
//        }
//

//        System.out.println(vlanMult.getCvlan());
        return null;
    }

    public ComandoDslam getComandoConsultaAlarmes(InventarioRede i) {
        return new ComandoDslam("onu alarms " + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica(), 5000);
    }

    @Override
    public AlarmesGpon getAlarmes(InventarioRede i) throws Exception {
        List<String> leAlarmes = this.getCd().consulta(this.getComandoConsultaAlarmes(i)).getRetorno();
        AlarmesGpon alarm = new AlarmesGpon();
        alarm.setListAlarmes(leAlarmes);
        for (String leAlarme : leAlarmes) {
            if (leAlarme.trim().equals("No active alarms found")) {
                alarm.setListAlarmes(new ArrayList<>());
                break;
            }
        }

        System.out.println(alarm.getListAlarmes());
        return alarm;
    }

    public ComandoDslam getComandoConsultaProfileDown(InventarioRede i) {
        return new ComandoDslam("get bridge-interface-record 1-" + i.getSlot() + "-" + i.getPorta() + "-" + this.getL500(i.getLogica()) + "-gponport-" + i.getCvLan() + "-" + i.getRin() + "/bridge", 3000);
    }

    public ComandoDslam getComandoConsultaProfileUp(InventarioRede i) {
        return new ComandoDslam("onu gemports " + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica(), 3000);
    }

    @Override
    public Profile getProfile(InventarioRede i) throws Exception {
        List<String> leProfDowns = this.getCd().consulta(this.getComandoConsultaProfileDown(i)).getRetorno();
        List<String> leProfUps = this.getCd().consulta(this.getComandoConsultaProfileUp(i)).getRetorno();

        List<String> leProfileUp = TratativaRetornoUtil.tratZhone(leProfUps, "1-" + i.getSlot() + "-" + i.getPorta() + "-" + this.getL500(i.getLogica()), "-?\\.?(\\d+((\\.|,| )\\d+)?)");
        List<String> leProfileDown = TratativaRetornoUtil.tratZhone(leProfDowns, "bridgeIfEgressPacketRuleGroupIndex", "-?\\.?(\\d+((\\.|,| )\\d+)?)");

        String profileDown = leProfileDown.get(0);
        String profileUp = leProfileUp.get(leProfileUp.size() - 6);

        Profile prof = new Profile();
        prof.setProfileDown(profileDown);
        prof.setProfileUp(profileUp);
        System.out.println(prof.getProfileDown());
        System.out.println(prof.getProfileUp());

        return prof;
    }

    @Override
    public DeviceMAC getDeviceMac(InventarioRede i) throws Exception {
        if (leVlans == null) {
            leVlans = this.getCd().consulta(this.getComandoConsultaVlan(i)).getRetorno();
        }
        List<String> leVlanBandaStatus = TratativaRetornoUtil.tratZhone(leVlans, "-" + this.getL500(i.getLogica()) + "-", "([a-f\\d]{2}:){5}[a-f\\d]{2}");
        DeviceMAC leMac = new DeviceMAC();
        if (leVlanBandaStatus.size() > 0) {
            leMac.setMac(leVlanBandaStatus.get(0).toUpperCase());
        }

        return leMac;
    }

    protected ComandoDslam getComandoGetIdOnt(InventarioRede i, SerialOntGpon s) {
        return new ComandoDslam("onu show " + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica(), 3000);
    }

    protected ComandoDslam getComandoSetOntToOlt(InventarioRede i, String idOnt) {
        return new ComandoDslam("onu set " + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + " " + idOnt);
    }

    @Override
    public SerialOntGpon setOntToOlt(InventarioRede i, SerialOntGpon s) throws Exception {
        List<String> pegaIdOnt = getCd().consulta(getComandoGetIdOnt(i, s)).getRetorno();
        String leSerNum = s.getSerial().substring(4, s.getSerial().length());
        String leIdOnt = TratativaRetornoUtil.tratZhone(pegaIdOnt, leSerNum, "\\b\\w+\\b").get(0);
        List<String> leResp = getCd().consulta(getComandoSetOntToOlt(i, leIdOnt)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
        return getSerialOnt(i);
    }

    protected ComandoDslam getComandoSetEstadoDaPorta(InventarioRede i, EstadoDaPorta e) {
        return new ComandoDslam("port " + e.getAdminState() + " 1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/gpononu");
    }

    @Override
    public EstadoDaPorta setEstadoDaPorta(InventarioRede i, EstadoDaPorta e) throws Exception {
        List<String> leResp = getCd().consulta(getComandoSetEstadoDaPorta(i, e)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
        return getEstadoDaPorta(i);
    }

    protected ComandoDslam getComandoCreateVlanBanda(InventarioRede i, Velocidades down, Velocidades up) {
        return new ComandoDslam("bridge add 1-" + i.getSlot() + "-" + i.getPorta() + "-" + getL500(i.getLogica()) + "/gponport "
                + "gtp " + castProfile(up).getProfileUp() + " downlink vlan " + i.getCvLan() + " slan " + i.getRin() + " stagged "
                + "epktrule " + castProfile(down).getProfileDown(), 3000);
    }

    @Override
    public VlanBanda createVlanBanda(InventarioRede i, Velocidades vDown, Velocidades vUp) throws Exception {
        List<String> leResp = getCd().consulta(getComandoCreateVlanBanda(i, vDown, vUp)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
        leVlans = null;
        return getVlanBanda(i);
    }

    protected ComandoDslam getComandoCreateVoip(InventarioRede i) {
        return new ComandoDslam("bridge add 1-" + i.getSlot() + "-" + i.getPorta() + "-" + getL700(i.getLogica()) + "/gponport gtp 2 "
                + "downlink vlan " + i.getCvLan() + " slan " + i.getVlanVoip() + " stagged cos 5 outcosall 5 "
                + "scos 5 soutcosall 5 epktrule 2", 3000);
    }

    @Override
    public VlanVoip createVlanVoip(InventarioRede i) throws Exception {
        List<String> leResp = getCd().consulta(getComandoCreateVoip(i)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
        leVlans = null;
        return getVlanVoip(i);
    }

    protected ComandoDslam getComandoCreateVlanVod(InventarioRede i) {
        return new ComandoDslam("bridge add 1-" + i.getSlot() + "-" + i.getPorta() + "-" + getL900(i.getLogica()) + "/gponport gtp 1 "
                + "downlink vlan " + i.getCvLan() + " slan " + i.getVlanVod() + " stagged cos 3 "
                + "outcosall 3 scos 3 soutcosall 3", 3000);
    }

    @Override
    public VlanVod createVlanVod(InventarioRede i) throws Exception {
        List<String> leResp = getCd().consulta(getComandoCreateVlanVod(i)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
        leVlans = null;
        return getVlanVod(i);
    }

    @Override
    public VlanMulticast createVlanMulticast(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void unsetOntFromOlt(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected ComandoDslam getComandoDeleteVlanBanda(InventarioRede i) {
        return new ComandoDslam("bridge delete 1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/gpononu slan " + i.getRin(), 1500);
    }

    @Override
    public void deleteVlanBanda(InventarioRede i) throws Exception {
        List<String> leResp = getCd().consulta(getComandoDeleteVlanBanda(i)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
    }

    protected ComandoDslam getComandoDeleteVlanVoip(InventarioRede i) {
        return new ComandoDslam("bridge delete 1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/gpononu slan " + i.getVlanVoip(), 1500);
    }

    @Override
    public void deleteVlanVoip(InventarioRede i) throws Exception {
        List<String> leResp = getCd().consulta(getComandoDeleteVlanVoip(i)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
    }

    protected ComandoDslam getComandoDeleteVlanVod(InventarioRede i) {
        return new ComandoDslam("bridge delete 1/" + i.getSlot() + "/" + i.getPorta() + "/" + i.getLogica() + "/gpononu slan " + i.getVlanVod(), 1500);
    }

    @Override
    public void deleteVlanVod(InventarioRede i) throws Exception {
        List<String> leResp = getCd().consulta(getComandoDeleteVlanVod(i)).getRetorno();
        for (String string : leResp) {
            System.out.println(string);
        }
    }

    @Override
    public void deleteVlanMulticast(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Profile setProfileDown(InventarioRede i, Velocidades v) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Profile setProfileUp(InventarioRede i, Velocidades v) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Profile castProfile(Velocidades v) {
        Profile p = new Profile();
        p.setProfileDown(v.getVel());
        Integer leProfUp = new Integer(v.getVel()) * 1000;
        p.setProfileUp(leProfUp.toString());
        return p;
    }

}
