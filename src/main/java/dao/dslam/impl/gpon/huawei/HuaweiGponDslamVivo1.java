/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.gpon.huawei;

import br.net.gvt.efika.efika_customer.model.customer.InventarioRede;
import br.net.gvt.efika.fulltest.exception.FalhaAoConsultarException;
import br.net.gvt.efika.fulltest.exception.FuncIndisponivelDslamException;
import br.net.gvt.efika.fulltest.model.telecom.config.ComandoDslam;
import br.net.gvt.efika.fulltest.model.telecom.properties.DeviceMAC;
import br.net.gvt.efika.fulltest.model.telecom.properties.EstadoDaPorta;
import br.net.gvt.efika.fulltest.model.telecom.properties.Porta;
import br.net.gvt.efika.fulltest.model.telecom.properties.Profile;
import br.net.gvt.efika.fulltest.model.telecom.properties.ProfileVivo1;
import br.net.gvt.efika.fulltest.model.telecom.properties.ReConexao;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanBanda;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanBandaVivo1Huawei;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanMulticast;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanVod;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanVodVivo1Huawei;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanVoip;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanVoipVivo1Huawei;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.AlarmesGpon;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.PortaPON;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.SerialOntGpon;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.ServicePort;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.TabelaParametrosGpon;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.TabelaParametrosGponBasic;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.TabelaParametrosGponBasicVivo1;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import model.dslam.credencial.Credencial;

/**
 * MA5600T
 *
 * @author G0041775
 */
public class HuaweiGponDslamVivo1 extends DslamGponVivo1 {

    private transient ServicePort spBanda;
    private transient ServicePort spVoip;
    private transient ServicePort spIptv;
    private transient EstadoDaPorta estadoDaPorta;
    private transient SerialOntGpon serial;
    private transient Integer gemportBanda, gemportIptv, gemportVoip;
    private transient VlanBandaVivo1Huawei vlanBanda;
    private transient VlanVoipVivo1Huawei vlanVoip;
    private transient VlanVodVivo1Huawei vlanVod;
    private transient Profile profile;

    public HuaweiGponDslamVivo1(String ipDslam) {
        super(ipDslam, Credencial.VIVO1, new LoginComJump());
    }

    @Override
    public void conectar() throws Exception {
        super.conectar();
    }

    @Override
    public void enableCommandsInDslam() throws Exception {
        this.getCd().consulta(this.getComandoEnableConfig());
    }

    protected ComandoDslam getComandoEnableConfig() {
        return new ComandoDslam("enable", 500, "config", 500, "mmi-mode original-output");
    }

    protected void setServicePorts(InventarioRede i) throws Exception {
        setGemports(i);
        ComandoDslam cmd = getCd().consulta(getComandoGetServicePorts(i));
        List<String> retorno = cmd.getRetorno();
        List<List<String>> tabServs = new ArrayList<>();
        int start = 0;
        int end = retorno.size();
        for (int j = 0; j < end; j++) {
            if (retorno.get(j).contains(getComandoGetServicePorts(i).getSintax())) {
                start = j;
            }
            if (retorno.get(j).contains("Total :") && start != 0) {
                end = j;
            }
        }
        for (int n = start; n < end; n++) {
            if (retorno.get(n).contains("gpon")) {
                List<String> allMatches = new ArrayList<>();
                Matcher m = Pattern.compile("\\d+").matcher(retorno.get(n));
                while (m.find()) {
                    allMatches.add(m.group());
                }

                String[] porEspaco = retorno.get(n).split(" ");
                allMatches.add(porEspaco[porEspaco.length - 1].trim());
                tabServs.add(allMatches);

            }
        }

        tabServs.forEach((t) -> {
            if (t.get(6).equalsIgnoreCase("10")) {
                spBanda = new ServicePort();
                spBanda.setFlowPara(new Integer(t.get(6)));
                spBanda.setIndex(new Integer(t.get(0)));
                spBanda.setRx(new Integer(t.get(7)));
                spBanda.setState(t.get(9).equalsIgnoreCase("up"));
                spBanda.setTx(new Integer(t.get(8)));
                spBanda.setVlanId(new Integer(t.get(1)));
                spBanda.setVpi(new Integer(t.get(5)));
                vlanBanda = new VlanBandaVivo1Huawei();
                vlanBanda.addInteracao(cmd);
                vlanBanda.setGemport(spBanda.getVpi());
                vlanBanda.setSvlan(spBanda.getVlanId());

                profile = new ProfileVivo1();
                profile.setDown(compare(spBanda.getRx().toString(), Boolean.TRUE));
                profile.setUp(compare(spBanda.getTx().toString(), Boolean.FALSE));
                profile.setProfileDown(spBanda.getRx().toString());
                profile.setProfileUp(spBanda.getTx().toString());
                profile.addInteracao(cmd);
            }
            if (t.get(6).equalsIgnoreCase("20")) {
                spIptv = new ServicePort();
                spIptv.setFlowPara(new Integer(t.get(6)));
                spIptv.setIndex(new Integer(t.get(0)));
                spIptv.setRx(new Integer(t.get(7)));
                spIptv.setState(t.get(9).equalsIgnoreCase("up"));
                spIptv.setTx(new Integer(t.get(8)));
                spIptv.setVlanId(new Integer(t.get(1)));
                spIptv.setVpi(new Integer(t.get(5)));
                vlanVod = new VlanVodVivo1Huawei();
                vlanVod.setGemport(spIptv.getVpi());
                vlanVod.setSvlan(spIptv.getVlanId());
                vlanVod.addInteracao(cmd);
            }
            if (t.get(6).equalsIgnoreCase("30")) {
                spVoip = new ServicePort();
                spVoip.setFlowPara(new Integer(t.get(6)));
                spVoip.setIndex(new Integer(t.get(0)));
                spVoip.setRx(new Integer(t.get(7)));
                spVoip.setState(t.get(9).equalsIgnoreCase("up"));
                spVoip.setTx(new Integer(t.get(8)));
                spVoip.setVlanId(new Integer(t.get(1)));
                spVoip.setVpi(new Integer(t.get(5)));
                vlanVoip = new VlanVoipVivo1Huawei();
                vlanVoip.setGemport(spVoip.getVpi());
                vlanVoip.setSvlan(spVoip.getVlanId());
                vlanVoip.addInteracao(cmd);
            }
        });
        if (vlanBanda == null) {
            vlanBanda = new VlanBandaVivo1Huawei();
            vlanBanda.addInteracao(cmd);
            vlanBanda.setGemport(0);
            vlanBanda.setSvlan(0);
        }

        if (vlanVod == null) {
            vlanVod = new VlanVodVivo1Huawei();
            vlanVod.setGemport(0);
            vlanVod.setSvlan(0);
            vlanVod.addInteracao(cmd);
        }

        if (vlanVoip == null) {
            vlanVoip = new VlanVoipVivo1Huawei();
            vlanVoip.setGemport(0);
            vlanVoip.setSvlan(0);
            vlanVoip.addInteracao(cmd);
        }
    }

    protected void setGemports(InventarioRede i) {
        gemportBanda = i.getLogica() + 128;
        gemportIptv = i.getLogica() + 256;
        gemportVoip = i.getLogica() + 384;
    }

    Boolean tudoDestruido = false;

    protected void tabelaEstadoDaPorta(InventarioRede i) throws Exception {
        setGemports(i);
        ComandoDslam cmd = getCd().consulta(getComandoGetEstadoDaPorta(i));
        List<String> resp = cmd.getRetorno();
        estadoDaPorta = new EstadoDaPorta();
        serial = new SerialOntGpon();
        if (!cmd.getBlob().contains("Control flag")) {
            estadoDaPorta.setAdminState(false);
            estadoDaPorta.setOperState(false);
            serial.setIdOnt("0");
            serial.setPorta(0);
            serial.setSlot(0);
            serial.setSerial("0");
            tudoDestruido = true;
//            throw new FalhaAoConsultarException();
        } else {
            estadoDaPorta.setAdminState(TratativaRetornoUtil.tratHuawei(resp, "Control flag").equalsIgnoreCase("active"));
            estadoDaPorta.setOperState(TratativaRetornoUtil.tratHuawei(resp, "Run state").equalsIgnoreCase("online"));
            serial.setSerial(TratativaRetornoUtil.valueFromParentesis(TratativaRetornoUtil.tratHuawei(resp, "SN ")));
            serial.setIdOnt(TratativaRetornoUtil.valueFromParentesis(TratativaRetornoUtil.tratHuawei(resp, "Password")));
        }

        System.out.println("");
    }

    protected ComandoDslam getComandoGetEstadoDaPorta(InventarioRede i) {
        return new ComandoDslam("interface gpon 0/" + i.getSlot(), 3000, "display ont info " + i.getPorta() + " " + i.getLogica() + "\n", 3000, "quit\n");
    }

    @Override
    public EstadoDaPorta getEstadoDaPorta(InventarioRede i) throws Exception {

        if (estadoDaPorta == null) {
            tabelaEstadoDaPorta(i);
        }

        return estadoDaPorta;
    }

    protected ComandoDslam getComandoGetServicePorts(InventarioRede i) {
        return new ComandoDslam("display service-port port 0/" + i.getSlot() + "/" + i.getPorta() + " ont " + i.getLogica(), 3000, " ");
    }

    @Override
    public SerialOntGpon getSerialOnt(InventarioRede i) throws Exception {
        if (serial == null) {
            tabelaEstadoDaPorta(i);
        }
        return serial;
    }

    protected ComandoDslam getComandoPortaPON(InventarioRede i) {
        return new ComandoDslam("interface gpon 0/" + i.getSlot(), 3000, "display port state  " + i.getPorta(), 3000, "quit\n");
    }

    @Override
    public PortaPON getPortaPON(InventarioRede i) throws Exception {
        PortaPON p = new PortaPON();
        ComandoDslam cmd = getCd().consulta(getComandoPortaPON(i));
        String moduleStatus = TratativaRetornoUtil.tratHuawei(cmd.getRetorno(), "Optical Module status");
        String portStatus = TratativaRetornoUtil.tratHuawei(cmd.getRetorno(), "Port state");
        p.setOperState(moduleStatus.contains("Online") && portStatus.contains("Online"));
        return p;
    }

    protected ComandoDslam getComandoGetParametros(InventarioRede i) {
        return new ComandoDslam("interface gpon 0/" + i.getSlot(), 3000, "display ont optical-info " + i.getPorta() + " " + i.getLogica() + "\n", 3000, "quit\n");
    }

    @Override
    public TabelaParametrosGponBasic getTabelaParametros(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoGetParametros(i));
        List<String> retorno = cmd.getRetorno();
        String leOlt = TratativaRetornoUtil.tratHuawei(retorno, "OLT Rx");
        String leOnt = TratativaRetornoUtil.tratHuawei(retorno, "Rx optical");

        Double potOlt = leOlt.contains("Parâmetro não encontrado") || leOlt.equalsIgnoreCase("-") ? 0d : new Double(leOlt);
        Double potOnt = leOnt.contains("Parâmetro não encontrado") || leOnt.equalsIgnoreCase("-") ? 0d : new Double(leOnt);

        /**
         * Tratativa gambeta para OLT's sem medição de Pot OLT
         */
        if (potOlt.compareTo(0d) == 0 && !(potOnt.compareTo(0d) == 0)) {
            TabelaParametrosGponBasicVivo1 tab = new TabelaParametrosGponBasicVivo1();
            tab.setPotOnt(potOnt);
            tab.getInteracoes().add(cmd);
            return tab;
        } else {
            TabelaParametrosGponVivo1 tab = new TabelaParametrosGponVivo1();
            tab.setPotOlt(potOlt);
            tab.setPotOnt(potOnt);
            tab.getInteracoes().add(cmd);
            return tab;
        }
    }

    @Override
    public VlanBanda getVlanBanda(InventarioRede i) throws Exception {

        if (spBanda == null) {
            spBanda = new ServicePort(false);
            setServicePorts(i);
        }

        return vlanBanda;
    }

    @Override
    public VlanMulticast getVlanMulticast(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }

    @Override
    public VlanVoip getVlanVoip(InventarioRede i) throws Exception {
        if (spVoip == null) {
            spVoip = new ServicePort(false);
            setServicePorts(i);
        }

        return vlanVoip;
    }

    @Override
    public VlanVod getVlanVod(InventarioRede i) throws Exception {
        if (spIptv == null) {
            spIptv = new ServicePort(false);
            setServicePorts(i);
        }

        return vlanVod;
    }

    protected ComandoDslam getComandoGetOntsDisp(InventarioRede i) {
        return new ComandoDslam("display ont autofind all", 5000);
    }

    @Override
    public AlarmesGpon getAlarmes(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }

    @Override
    public List<SerialOntGpon> getSlotsAvailableOnts(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoGetOntsDisp(i));
        List<String> retorno = cmd.getRetorno();
        Integer quant = new Integer(TratativaRetornoUtil.numberFromListMember(retorno, "number of GPON autofind ONT").get(0));
        List<SerialOntGpon> l = new ArrayList<>();
        for (int j = 1; j <= quant; j++) {
            SerialOntGpon s = new SerialOntGpon();
            s.setIdOnt(TratativaRetornoUtil.valueFromParentesis(TratativaRetornoUtil.tratHuawei(retorno, "Password", j)));
            s.setSerial(TratativaRetornoUtil.tratHuawei(retorno, "VendorID", j) + "-" + TratativaRetornoUtil.tratHuawei(retorno, "Ont SN", j).substring(TratativaRetornoUtil.tratHuawei(retorno, "Ont SN", j).length() - 8));
            String[] pegaFsp = TratativaRetornoUtil.tratHuawei(retorno, "F/S/P", j).split("/");
            s.setSlot(new Integer(pegaFsp[1]));
            s.setPorta(new Integer(pegaFsp[2]));
            l.add(s);
        }
        if (l.size() > 0) {
            l.get(0).addInteracao(cmd);
        } else {
            SerialOntGpon s = new SerialOntGpon();
            s.addInteracao(cmd);
            l.add(s);
        }

        return l;
    }

    @Override
    public Profile getProfile(InventarioRede i) throws Exception {
        if (spBanda == null) {
            setServicePorts(i);
        }
        return profile;
    }

    @Override
    public DeviceMAC getDeviceMac(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }

    protected ComandoDslam getCmdSetOntToOlt(InventarioRede i, SerialOntGpon s) {
        return new ComandoDslam("interface gpon 0/" + i.getSlot(), 3000, "ont modify " + i.getPorta() + " " + i.getLogica() + " password " + s.getIdOnt() + "\n1\n", 5000, "quit\n");
    }

    protected ComandoDslam getCmdUnSetOntToOlt(InventarioRede i) {
        return new ComandoDslam("interface gpon 0/" + i.getSlot(), 3000, "ont modify " + i.getPorta() + " " + i.getLogica() + " password 000000", 5000, "quit\n");
    }

    @Override
    public SerialOntGpon setOntToOlt(InventarioRede i, SerialOntGpon s) throws Exception {
//        SerialOntGpon ser = getSerialOnt(i);
//        ComandoDslam cmd0 = null;
//        if (tudoDestruido) {
//            setGemports(i);
//            cmd0 = this.getCd().consulta(getComandoCreateVlanBanda(i, gemportBanda));
//        }
        ComandoDslam cmd = this.getCd().consulta(this.getCmdSetOntToOlt(i, s));
        this.serial = null;
        SerialOntGpon se = this.getSerialOnt(i);
        se.getInteracoes().add(0, cmd);
//        if (cmd0 != null) {
//            se.getInteracoes().add(0, cmd0);
//        }
        return se;
    }

    @Override
    public SerialOntGpon unsetOntFromOlt(InventarioRede i) throws Exception {
        ComandoDslam cmd = this.getCd().consulta(this.getCmdUnSetOntToOlt(i));
        SerialOntGpon se = this.getSerialOnt(i);
        se.getInteracoes().add(0, cmd);
        return se;
    }

    protected ComandoDslam getComandoSetEstadoDaPorta(InventarioRede i, Boolean state) {
        String leState = state ? "activate" : "deactivate";
        return new ComandoDslam("interface gpon 0/" + i.getSlot(), 3000, "ont " + leState + " " + i.getPorta() + " " + i.getLogica() + "\nquit\n");
    }

    @Override
    public EstadoDaPorta setEstadoDaPorta(InventarioRede i, EstadoDaPorta e) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoSetEstadoDaPorta(i, e.getAdminState()));
        EstadoDaPorta es = getEstadoDaPorta(i);
        es.getInteracoes().add(0, cmd);
        return es;
    }

    @Override
    public Profile setProfileDown(InventarioRede i, Velocidades v) throws Exception {
        ComandoDslam cmd0 = getCd().consulta(getComandoDeleteVlanBanda(i));
        Integer leIndex = spBanda.getIndex() == null ? getNextFreeIndex(i) : spBanda.getIndex();
        ComandoDslam cmd1 = getCd().consulta(getComandoCreateVlanBanda(i, leIndex));
        Profile p = getProfile(i);
        p.getInteracoes().add(0, cmd1);
        p.getInteracoes().add(0, cmd0);

        return p;
    }

    @Override
    public Profile setProfileUp(InventarioRede i, Velocidades vDown, Velocidades vUp) throws Exception {
        ComandoDslam cmd0 = getCd().consulta(getComandoDeleteVlanBanda(i));
        Integer leIndex = spBanda.getIndex() == null ? getNextFreeIndex(i) : spBanda.getIndex();
        ComandoDslam cmd1 = getCd().consulta(getComandoCreateVlanBanda(i, leIndex));
        Profile p = getProfile(i);
        p.getInteracoes().add(0, cmd1);
        p.getInteracoes().add(0, cmd0);

        return p;
    }

    protected ComandoDslam getComandoGetNextFreeIndex(InventarioRede i) {
        return new ComandoDslam("display service-port next-free-index\n\n", 3000);

    }

    protected Integer getNextFreeIndex(InventarioRede i) throws Exception {
        List<String> resp = getCd().consulta(getComandoGetNextFreeIndex(i)).getRetorno();
        return new Integer(TratativaRetornoUtil.tratHuawei(resp, "Next valid free service virtual port ID"));
    }

    protected ComandoDslam getComandoCreateVlanBanda(InventarioRede i, Integer index) {
        if (gemportBanda == null) {
            setGemports(i);
        }
        if (i.getBhs()) {

            return new ComandoDslam("interface gpon 0/" + i.getSlot() + "\n"
                    + "ont native-vlan " + i.getSlot() + " " + i.getLogica() + " unconcern\n"
                    + "tcont bind-profile " + i.getSlot() + " " + i.getLogica() + " 4 profile-id 500\n"
                    + "gemport add " + i.getSlot() + " gemportid " + gemportBanda + " eth encrypt on \n"
                    + "ont port vlan " + i.getSlot() + " " + i.getLogica() + " eth 10 1 translation s-vlan 10\n"
                    + "ont gemport bind " + i.getSlot() + " " + i.getLogica() + " " + gemportBanda + " 4 gemport-car 6\n"
                    + "ont gemport mapping " + i.getSlot() + " " + i.getLogica() + " " + gemportBanda + " vlan 10\n"
                    + "quit\n"
                    + "service-port  vlan " + i.getRin() + " gpon 0/" + i.getSlot() + "/" + i.getPorta() + " gemport " + gemportBanda + " multi-service user-vlan 10 tag-transform translate-and-add inner-vlan " + i.getCvlan() + " inner-priority 0 inbound traffic-table index 6 outbound traffic-table index 500\n", 5000);
        }

        return new ComandoDslam(
                "interface gpon 0/" + i.getSlot() + "\n"
                + "ont alarm-profile " + i.getSlot() + " " + i.getLogica() + " profile-id 1\n"
                + "ont ipconfig " + i.getSlot() + " " + i.getLogica() + " dhcp\n"
                + "gemport add " + i.getSlot() + " gemportid " + gemportBanda + " eth encrypt on \n"
                + "tcont bind-profile " + i.getSlot() + " " + i.getLogica() + " 4 profile-id 500\n"
                + "ont gemport bind " + i.getSlot() + " " + i.getLogica() + " " + gemportBanda + " 4 gemport-car 6\n"
                + "ont gemport mapping " + i.getSlot() + " " + i.getLogica() + " " + gemportBanda + " vlan 10\n"
                + "ont port vlan " + i.getSlot() + " " + i.getLogica() + " eth 10 1 translation s-vlan 10\n"
                + "ont port priority-policy " + i.getSlot() + " " + i.getLogica() + " eth 1 copy-cos\n"
                + "ont port q-in-q " + i.getSlot() + " " + i.getLogica() + " eth 1 disable\n"
                + "ont port native-vlan " + i.getSlot() + " " + i.getLogica() + " eth 1 vlan 10 priority 0\n"
                + "quit\n"
                + "service-port " + index + " vlan " + i.getRin() + " gpon 0/" + i.getSlot() + "/" + i.getPorta() + " gemport " + gemportBanda + " multi-service user-vlan 10 tag-transform translate-and-add inner-vlan " + i.getCvlan() + " inner-priority 0 inbound traffic-table index 6 outbound traffic-table index 43\n"
                + "stacking label service-port " + index + " " + i.getCvlan() + " \n", 5000);
    }

    @Override
    public VlanBanda createVlanBanda(InventarioRede i, Velocidades vDown, Velocidades vUp) throws Exception {
//        System.out.println(getNextFreeIndex(i));
        ComandoDslam cmd0 = getCd().consulta(getComandoGetNextFreeIndex(i));

        ComandoDslam cmd = getCd().consulta(getComandoCreateVlanBanda(i, new Integer(TratativaRetornoUtil.tratHuawei(cmd0.getRetorno(), "Next valid free service virtual port ID"))));
        spBanda = null;
        VlanBanda v = getVlanBanda(i);
        v.getInteracoes().add(0, cmd);
        v.getInteracoes().add(0, cmd0);
        return getVlanBanda(i);
    }

    protected ComandoDslam getComandoCreateVlanVoip(InventarioRede i, Integer index) {
        if (gemportVoip == null) {
            setGemports(i);
        }

        return new ComandoDslam("interface gpon 0/" + i.getSlot() + "\n"
                + "ont native-vlan " + i.getSlot() + " " + i.getLogica() + " unconcern\n"
                + "tcont bind-profile " + i.getSlot() + " " + i.getLogica() + " 3 profile-id 30\n"
                + "gemport add " + i.getSlot() + " gemportid " + gemportVoip + " eth encrypt on \n"
                + "ont port vlan " + i.getSlot() + " " + i.getLogica() + " eth 30 1 translation s-vlan 30\n"
                + "ont gemport bind " + i.getSlot() + " " + i.getLogica() + " " + gemportVoip + " 3 gemport-car 30\n"
                + "ont gemport mapping " + i.getSlot() + " " + i.getLogica() + " " + gemportVoip + " vlan 30\n"
                + "quit\n"
                + "service-port  vlan " + i.getRin() + " gpon 0/" + i.getSlot() + "/" + i.getPorta() + " gemport " + gemportVoip + " multi-service user-vlan 30 tag-transform translate inbound traffic-table index 30 outbound traffic-table index 30\n", 5000);

    }

    @Override
    public VlanVoip createVlanVoip(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoCreateVlanVoip(i, getNextFreeIndex(i)));
        spVoip = null;
        VlanVoip v = getVlanVoip(i);
        v.getInteracoes().add(0, cmd);
        return v;
    }

    protected ComandoDslam getComandoCreateVlanVod(InventarioRede i, Integer index) {
        if (gemportIptv == null) {
            setGemports(i);
        }
        return new ComandoDslam("service-port " + index + " vlan 400 gpon 0/" + i.getSlot() + "/" + i.getPorta() + " gemport " + gemportIptv + " multi-service user-vlan 20 tag-transform translate inbound traffic-table index 42 outbound traffic-table index 42\n"
                + "btv\n"
                + "igmp user add service-port " + index + " no-auth max-program 32\n"
                + " \n"
                + " \n"
                + "multicast-vlan " + i.getVlanMulticast() + "\n"
                + "igmp multicast-vlan member service-port " + index + "\n"
                + "quit", 15000);
    }

    @Override
    public VlanVod createVlanVod(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoCreateVlanVod(i, getNextFreeIndex(i)));
        spIptv = null;
        VlanVod v = getVlanVod(i);
        v.getInteracoes().add(0, cmd);
        return v;
    }

    @Override
    public VlanMulticast createVlanMulticast(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }

    protected ComandoDslam getComandoDeleteVlanBanda(InventarioRede i) throws Exception {
        if (spBanda == null) {
            setServicePorts(i);
        }
//        String indexSpIptv = spIptv == null ? "" : spIptv.getIndex().toString();
//        String indexSpVoip = spVoip == null ? "" : spVoip.getIndex().toString();
        String indexSpBanda = spBanda == null ? "" : spBanda.getIndex().toString();

        return new ComandoDslam("undo service-port " + indexSpBanda + "\n", 5000);
    }

    @Override
    public VlanBanda deleteVlanBanda(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoDeleteVlanBanda(i));
        VlanBanda v = getVlanBanda(i);
        v.getInteracoes().add(0, cmd);
        return v;
    }

    protected ComandoDslam getComandoDeleteVlanVoip(InventarioRede i) throws Exception {
        if (spVoip == null) {
            setServicePorts(i);
        }
        if (gemportVoip == null) {
            setGemports(i);
        }

        String indexSpVoip = spVoip == null ? "" : spVoip.getIndex().toString();

        return new ComandoDslam("undo service-port " + indexSpVoip, 7500);
    }

    @Override
    public VlanVoip deleteVlanVoip(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoDeleteVlanVoip(i));
        VlanVoip v = getVlanVoip(i);
        v.getInteracoes().add(cmd);
        return v;
    }

    protected ComandoDslam getComandoDeleteVlanVod(InventarioRede i) throws Exception {
        if (spIptv == null) {
            setServicePorts(i);
        }
        if (gemportIptv == null) {
            setGemports(i);
        }

        String indexSpIptv = spIptv == null ? "" : spIptv.getIndex().toString();
        return new ComandoDslam("btv\n"
                + "multicast-vlan " + i.getVlanMulticast() + "\n"
                + "undo igmp multicast-vlan member service-port " + indexSpIptv + "\n"
                + "quit\n"
                + "btv\n"
                + "igmp user delete service-port " + indexSpIptv + "\n"
                + "y\n"
                + "quit\n"
                + "undo service-port " + indexSpIptv, 9000);
    }

    @Override
    public VlanVod deleteVlanVod(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoDeleteVlanVod(i));
        VlanVod v = getVlanVod(i);
        v.getInteracoes().add(0, cmd);
        return v;
    }

    @Override
    public VlanMulticast deleteVlanMulticast(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }

    @Override
    public List<VelocidadeVendor> obterVelocidadesDownVendor() {
        if (velsDown.isEmpty()) {
            Velocidades[] vels = Velocidades.values();
            Arrays.sort(vels, Collections.reverseOrder());
            for (Velocidades vel : vels) {
                if (new Double(vel.getValor()) <= 100) {
                    velsDown.add(new VelocidadeVendor(vel, "43"));
                } else {
                    velsDown.add(new VelocidadeVendor(vel, "500"));
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
                velsUp.add(new VelocidadeVendor(vel, "6"));
            }
        }
        return velsUp;
    }

    protected ComandoDslam getComandoGetEstadoPortasProximas(InventarioRede i) {
        return new ComandoDslam("interface gpon 0/" + i.getSlot() + "\n"
                + "display ont info " + i.getPorta() + " all\nquit\n", 5000);
    }

    @Override
    public List<Porta> getEstadoPortasProximas(InventarioRede i) throws Exception {
        ComandoDslam cmd = getCd().consulta(getComandoGetEstadoPortasProximas(i));
        List<String> retorno = cmd.getRetorno();
        Integer countStringOccurrence = TratativaRetornoUtil.countStringOccurrence(retorno, "0/" + i.getSlot() + "/" + i.getPorta());
        List<Porta> list = new ArrayList<>();
        for (int j = 1; j < ((countStringOccurrence - 1) / 2); j++) {
            Porta porta = new Porta();
            EstadoDaPorta estado = new EstadoDaPorta();
            List<String> linha = TratativaRetornoUtil.tratZhone(retorno, "0/" + i.getSlot() + "/" + i.getPorta(), "\\b\\w+\\b", j);

            estado.setAdminState(linha.get(5).equalsIgnoreCase("active"));
            estado.setOperState(linha.get(6).equalsIgnoreCase("online"));
            estado.addInteracao(cmd);
            porta.setEstadoPorta(estado);
            porta.setNumPorta(new Integer(linha.get(3)));
            list.add(porta);
        }

        return list;
    }

    @Override
    public ReConexao getReconexoes(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }

}
