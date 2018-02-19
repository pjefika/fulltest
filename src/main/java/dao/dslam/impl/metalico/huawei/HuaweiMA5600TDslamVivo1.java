/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.metalico.huawei;

import br.net.gvt.efika.customer.InventarioRede;
import dao.dslam.factory.exception.FalhaAoConsultarException;
import dao.dslam.factory.exception.FuncIndisponivelDslamException;
import dao.dslam.impl.ComandoDslam;
import dao.dslam.impl.gpon.DslamVivo1;
import dao.dslam.impl.login.LoginComJump;
import dao.dslam.impl.retorno.TratativaRetornoUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import model.dslam.credencial.Credencial;
import telecom.properties.DeviceMAC;
import telecom.properties.EstadoDaPorta;
import telecom.properties.Porta;
import telecom.properties.Profile;
import telecom.properties.ProfileVivo1;
import telecom.properties.ReConexao;
import telecom.properties.VlanBanda;
import telecom.properties.VlanBandaVivo1Huawei;
import telecom.properties.VlanMulticast;
import telecom.properties.VlanVod;
import telecom.properties.VlanVodVivo1Huawei;
import telecom.properties.VlanVoip;
import telecom.properties.VlanVoipVivo1Huawei;
import telecom.properties.gpon.AlarmesGpon;
import telecom.properties.gpon.PortaPON;
import telecom.properties.gpon.SerialOntGpon;
import telecom.properties.gpon.ServicePort;
import telecom.properties.gpon.TabelaParametrosGpon;
import telecom.velocidade.VelocidadeVendor;
import telecom.velocidade.Velocidades;

/**
 * MA5600T
 *
 * @author G0041775
 */
public class HuaweiMA5600TDslamVivo1 extends DslamVivo1 {

    private transient ServicePort spBanda;
    private transient ServicePort spVoip;
    private transient ServicePort spIptv;
    private transient EstadoDaPorta estadoDaPorta;
    private transient SerialOntGpon serial;
    private Integer gemportBanda, gemportIptv, gemportVoip;

    public HuaweiMA5600TDslamVivo1(String ipDslam) {
        super(ipDslam, Credencial.VIVO1, new LoginComJump());
    }

    @Override
    public void conectar() throws Exception {
        super.conectar();
        this.getCd().consulta(this.getComandoEnableConfig());
    }
    
    @Override
    public void enableCommandsInDslam() throws Exception {
        
    }

    protected ComandoDslam getComandoEnableConfig() {
        return new ComandoDslam("enable", 500, "config", 500, "mmi-mode original-output");
    }

    protected void setServicePorts(InventarioRede i) throws Exception {
        setGemports(i);
        List<String> retorno = getCd().consulta(getComandoGetServicePorts(i)).getRetorno();
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
            }
        });
    }

    protected void setGemports(InventarioRede i) {
        gemportBanda = i.getLogica() + 128;
        gemportIptv = i.getLogica() + 256;
        gemportVoip = i.getLogica() + 384;
    }

    protected void tabelaEstadoDaPorta(InventarioRede i) throws Exception {
        setGemports(i);
        ComandoDslam cmd = getCd().consulta(getComandoGetEstadoDaPorta(i));
        List<String> resp = cmd.getRetorno();
        estadoDaPorta = new EstadoDaPorta();
        if (!cmd.getBlob().contains("Control flag")) {
            throw new FalhaAoConsultarException();
        }
        estadoDaPorta.setAdminState(TratativaRetornoUtil.tratHuawei(resp, "Control flag").equalsIgnoreCase("active"));
        estadoDaPorta.setOperState(TratativaRetornoUtil.tratHuawei(resp, "Run state").equalsIgnoreCase("online"));
        serial = new SerialOntGpon();
        serial.setSerial(TratativaRetornoUtil.valueFromParentesis(TratativaRetornoUtil.tratHuawei(resp, "SN ")));
        serial.setIdOnt(TratativaRetornoUtil.valueFromParentesis(TratativaRetornoUtil.tratHuawei(resp, "Password")));
    }

    protected ComandoDslam getComandoGetEstadoDaPorta(InventarioRede i) {
        return new ComandoDslam("interface gpon 0/" + i.getSlot(), 1000, "display ont info " + i.getPorta() + " " + i.getLogica() + "\n", 1000, "quit\n");
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
        return new ComandoDslam("interface gpon 0/" + i.getSlot(), 1000, "display port state  " + i.getPorta(), 1000, "quit\n");
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
        return new ComandoDslam("interface gpon 0/" + i.getSlot(), 1000, "display ont optical-info " + i.getPorta() + " " + i.getLogica() + "\n", 1000, "quit\n");
    }

    @Override
    public TabelaParametrosGpon getTabelaParametros(InventarioRede i) throws Exception {
        List<String> retorno = getCd().consulta(getComandoGetParametros(i)).getRetorno();
        TabelaParametrosGpon tab = new TabelaParametrosGpon();
        String leOlt = TratativaRetornoUtil.tratHuawei(retorno, "OLT Rx");
        Double potOlt = leOlt.contains("Parâmetro não encontrado") || leOlt.equalsIgnoreCase("-") ? 0d : new Double(leOlt);
        tab.setPotOlt(potOlt);
        String leOnt = TratativaRetornoUtil.tratHuawei(retorno, "Rx optical");
        Double potOnt = leOnt.contains("Parâmetro não encontrado") || leOnt.equalsIgnoreCase("-") ? 0d : new Double(leOnt);
        tab.setPotOnt(potOnt);
        return tab;
    }

    @Override
    public VlanBanda getVlanBanda(InventarioRede i) throws Exception {

        if (spBanda == null) {
            spBanda = new ServicePort(false);
            setServicePorts(i);
        }

        VlanBandaVivo1Huawei vlan = new VlanBandaVivo1Huawei();
        vlan.setGemport(spBanda.getVpi());
        vlan.setSvlan(spBanda.getVlanId());

        return vlan;
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

        VlanVoipVivo1Huawei vlan = new VlanVoipVivo1Huawei();
        vlan.setGemport(spVoip.getVpi());
        vlan.setSvlan(spVoip.getVlanId());

        return vlan;
    }

    @Override
    public VlanVod getVlanVod(InventarioRede i) throws Exception {
        if (spIptv == null) {
            spIptv = new ServicePort(false);
            setServicePorts(i);
        }

        VlanVodVivo1Huawei vlan = new VlanVodVivo1Huawei();
        vlan.setGemport(spIptv.getVpi());
        vlan.setSvlan(spIptv.getVlanId());

        return vlan;
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
        List<String> retorno = getCd().consulta(getComandoGetOntsDisp(i)).getRetorno();
        Integer quant = new Integer(TratativaRetornoUtil.numberFromListMember(retorno, "number of GPON autofind ONT").get(0));
        List<SerialOntGpon> l = new ArrayList<>();
        for (int j = 1; j <= quant; j++) {
            SerialOntGpon s = new SerialOntGpon();
            s.setIdOnt(TratativaRetornoUtil.valueFromParentesis(TratativaRetornoUtil.tratHuawei(retorno, "Password", j)));
            s.setSerial(TratativaRetornoUtil.tratHuawei(retorno, "VendorID", j) + "-" + TratativaRetornoUtil.tratHuawei(retorno, "Ont SN", j).substring(TratativaRetornoUtil.tratHuawei(retorno, "Ont SN", j).length() - 8));
            String[] pegaFsp = TratativaRetornoUtil.tratHuawei(retorno, "F/S/P", j).split("/");
            s.setSlot(pegaFsp[1]);
            s.setPorta(pegaFsp[2]);
            l.add(s);
        }

        return l;
    }

    @Override
    public Profile getProfile(InventarioRede i) throws Exception {
        if (spBanda == null) {
            setServicePorts(i);
        }
        Profile p = new ProfileVivo1();
        p.setDown(compare(spBanda.getRx().toString(), Boolean.TRUE));
        p.setUp(compare(spBanda.getTx().toString(), Boolean.FALSE));
        p.setProfileDown(spBanda.getRx().toString());
        p.setProfileUp(spBanda.getTx().toString());

        return p;
    }

    @Override
    public DeviceMAC getDeviceMac(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
    }

    @Override
    public SerialOntGpon setOntToOlt(InventarioRede i, SerialOntGpon s) throws Exception {
        deleteVlanBanda(i);
        createVlanBanda(i, null, null);
        if (i.getBhs()) {
            createVlanVoip(i);
        }
        return getSerialOnt(i);
    }

    @Override
    public void unsetOntFromOlt(InventarioRede i) throws Exception {
        throw new FuncIndisponivelDslamException();
        //desassocia-se deletando vlan banda
        //deleteVlanBanda(i);
    }

    protected ComandoDslam getComandoSetEstadoDaPorta(InventarioRede i, Boolean state) {
        String leState = state ? "activate" : "deactivate";
        return new ComandoDslam("interface gpon 0/" + i.getSlot(), 1000, "ont " + leState + " " + i.getPorta() + " " + i.getLogica() + "\nquit\n");
    }

    @Override
    public EstadoDaPorta setEstadoDaPorta(InventarioRede i, EstadoDaPorta e) throws Exception {
        List<String> retorno = getCd().consulta(getComandoSetEstadoDaPorta(i, e.getAdminState())).getRetorno();
        return getEstadoDaPorta(i);
    }

    @Override
    public void setProfileDown(InventarioRede i, Velocidades v) throws Exception {
        getCd().consulta(getComandoDeleteVlanBanda(i));
        Integer leIndex = spBanda.getIndex() == null ? getNextFreeIndex(i) : spBanda.getIndex();
        getCd().consulta(getComandoCreateVlanBanda(i, leIndex));
    }

    @Override
    public void setProfileUp(InventarioRede i, Velocidades vDown, Velocidades vUp) throws Exception {
        getCd().consulta(getComandoDeleteVlanBanda(i));
        Integer leIndex = spBanda.getIndex() == null ? getNextFreeIndex(i) : spBanda.getIndex();
        getCd().consulta(getComandoCreateVlanBanda(i, leIndex));
    }

    protected ComandoDslam getComandoGetNextFreeIndex(InventarioRede i) {
        return new ComandoDslam("display service-port next-free-index", 1000);
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
                    + "ont add " + i.getPorta() + " " + i.getLogica() + " password-auth " + i.getIdOnt() + " always-on profile-id 7 desc Term_" + i.getTerminal() + "/VlanUsu_" + i.getCvlan()
                    + " manage-mode omci\n"
                    + "\n"
                    + "gemport add " + i.getPorta() + " gemportid " + gemportBanda + " eth encrypt on\n"
                    + "\n"
                    + "tcont bind-profile " + i.getPorta() + " " + i.getLogica() + " 4 profile-id 500\n"
                    + "ont gemport bind " + i.getPorta() + " " + i.getLogica() + " " + gemportBanda + " 4 gemport-car 6\n"
                    + "ont gemport mapping " + i.getPorta() + " " + i.getLogica() + " " + gemportBanda + " vlan 10\n"
                    + "\n"
                    + "ont native-vlan " + i.getPorta() + " " + i.getLogica() + " unconcern\n"
                    + "\n"
                    + "ont port vlan " + i.getPorta() + " " + i.getLogica() + " eth 10 1 translation s-vlan 10\n"
                    + "\n"
                    + "quit\n"
                    + "service-port " + index + " vlan " + i.getRin() + " gpon 0/" + i.getSlot() + "/" + i.getPorta() + " gemport " + gemportBanda + " multi-service user-vlan 10 tag-transform"
                    + " translate-and-add inner-vlan " + i.getCvlan() + " inbound traffic-table index 6 outbound traffic-table index 500", 15000);
        }
        return new ComandoDslam("interface gpon 0/" + i.getSlot() + "\n"
                + "ont add " + i.getPorta() + " " + i.getLogica() + " password-auth \"" + i.getIdOnt() + "\" always-on"
                + " profile-id 7 desc \"Term-" + i.getTerminal() + "/VlanUsu-" + i.getCvlan() + "\" manage-mode omci\n"
                + "\n"
                + "ont alarm-profile " + i.getPorta() + " " + i.getLogica() + " profile-id 1\n"
                + "ont ipconfig " + i.getPorta() + " " + i.getLogica() + " dhcp\n"
                + "\n"
                + "gemport add " + i.getPorta() + " gemportid " + gemportBanda + " eth encrypt on\n"
                + "\n"
                + "tcont bind-profile " + i.getPorta() + " " + i.getLogica() + " 4 profile-id 100\n"
                + "ont gemport bind " + i.getPorta() + " " + i.getLogica() + " " + gemportBanda + " 4 gemport-car 6\n"
                + "ont gemport mapping " + i.getPorta() + " " + i.getLogica() + " " + gemportBanda + " vlan 10\n"
                + "\n"
                + "ont port vlan " + i.getPorta() + " " + i.getLogica() + " eth 10 1 translation s-vlan 10\n"
                + "\n"
                + "ont port priority-policy " + i.getPorta() + " " + i.getLogica() + " eth 1 copy-cos\n"
                + "ont port q-in-q " + i.getPorta() + " " + i.getLogica() + " eth 1 disable\n"
                + "ont port native-vlan " + i.getPorta() + " " + i.getLogica() + " eth 1 vlan 10 priority 0\n"
                + "\n"
                + "quit\n"
                + "service-port " + index + " vlan " + i.getRin() + " gpon 0/" + i.getPorta() + "/" + i.getLogica() + " gemport " + gemportBanda + ""
                + " multi-service user-vlan 10 tag-transform translate-and-add inner-vlan " + i.getCvlan() + " inner-priority 0 inbound traffic-table"
                + " index 6 outbound traffic-table index 43\n"
                + "stacking label service-port " + index + " " + i.getCvlan(), 15000);
    }

    @Override
    public VlanBanda createVlanBanda(InventarioRede i, Velocidades vDown, Velocidades vUp) throws Exception {

        getCd().consulta(getComandoCreateVlanBanda(i, getNextFreeIndex(i)));

        spBanda = null;
        return getVlanBanda(i);
    }

    protected ComandoDslam getComandoCreateVlanVoip(InventarioRede i, Integer index) {
        if (gemportVoip == null) {
            setGemports(i);
        }
        return new ComandoDslam("interface gpon 0/" + i.getSlot() + "\n"
                + "tcont bind-profile " + i.getPorta() + " " + i.getLogica() + " 3 profile-id 30\n"
                + "\n"
                + "gemport add " + i.getPorta() + " gemportid " + gemportVoip + " eth encrypt on\n"
                + "\n"
                + "ont port vlan " + i.getPorta() + " " + i.getLogica() + " eth 30 1 translation s-vlan 30\n"
                + "\n"
                + "\n"
                + "ont gemport bind " + i.getPorta() + " " + i.getLogica() + " " + gemportVoip + " 3 gemport-car 30\n"
                + "\n"
                + "ont gemport mapping " + i.getPorta() + " " + i.getLogica() + " " + gemportVoip + " vlan 30\n"
                + "\n"
                + "\n"
                + "quit\n"
                + "\n"
                + "service-port " + index + " vlan " + i.getVlanVoip() + " gpon 0/" + i.getSlot() + "/" + i.getPorta() + " gemport " + gemportVoip
                + " multi-service user-vlan 30 tag-transform translate inbound traffic-table index 30 outbound traffic-table index 30", 9000);

    }

    @Override
    public VlanVoip createVlanVoip(InventarioRede i) throws Exception {
        List<String> retorno = getCd().consulta(getComandoCreateVlanVoip(i, getNextFreeIndex(i))).getRetorno();
        spVoip = null;
        return getVlanVoip(i);
    }

    protected ComandoDslam getComandoCreateVlanVod(InventarioRede i, Integer index) {
        if (gemportIptv == null) {
            setGemports(i);
        }
        return new ComandoDslam("interface gpon 0/" + i.getSlot() + "\n"
                + "gemport add " + i.getPorta() + " gemportid " + gemportIptv + " eth encrypt on\n"
                + " \n"
                + " \n"
                + "tcont bind-profile " + i.getPorta() + "  " + i.getLogica() + " 2 profile-id 20\n"
                + "ont gemport bind " + i.getPorta() + "  " + i.getLogica() + " " + gemportIptv + " 2 gemport-car 42\n"
                + "ont gemport mapping " + i.getPorta() + "  " + i.getLogica() + " " + gemportIptv + " vlan 20\n"
                + " \n"
                + " \n"
                + "ont port vlan " + i.getPorta() + "  " + i.getLogica() + " eth 20 1 translation s-vlan 20\n"
                + " \n"
                + " \n"
                + "ont multicast-forward " + i.getPorta() + "  " + i.getLogica() + " tag translation 20\n"
                + "quit\n"
                + "service-port " + index + " vlan 400 gpon 0/" + i.getSlot() + "/" + i.getPorta() + " gemport " + gemportIptv + " multi-service user-vlan 20 tag-transform translate inbound traffic-table index 42 outbound traffic-table index 42\n"
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
        getCd().consulta(getComandoCreateVlanVod(i, getNextFreeIndex(i)));
        spIptv = null;
        return getVlanVod(i);
    }

    @Override
    public VlanMulticast createVlanMulticast(InventarioRede i) throws Exception {
        return null;
    }

    protected ComandoDslam getComandoDeleteVlanBanda(InventarioRede i) throws Exception {
        if (spBanda == null) {
            setServicePorts(i);
        }
        String indexSpIptv = spIptv == null ? "" : spIptv.getIndex().toString();
        String indexSpVoip = spVoip == null ? "" : spVoip.getIndex().toString();
        String indexSpBanda = spBanda == null ? "" : spBanda.getIndex().toString();

        return new ComandoDslam("btv\n"
                + "multicast-vlan " + i.getVlanMulticast() + "\n"
                + "undo igmp multicast-vlan member service-port " + indexSpIptv + "\n"
                + "quit\n"
                + "btv\n"
                + "igmp user delete service-port " + indexSpIptv + "\n"
                + "y\n"
                + "quit\n"
                + "undo service-port " + indexSpBanda + "\n"
                + "interface gpon 0/" + i.getSlot() + "\n"
                + "undo ont gemport mapping " + i.getPorta() + " " + i.getLogica() + " " + gemportBanda + "\n"
                + "\n"
                + "undo ont gemport mapping " + i.getPorta() + " " + i.getLogica() + " " + gemportIptv + " vlan 20\n"
                + "\n"
                + "undo ont gemport mapping " + i.getPorta() + " " + i.getLogica() + " " + gemportVoip + "\n"
                + "\n"
                + "undo ont gemport bind " + i.getPorta() + " " + i.getLogica() + " " + gemportBanda + "\n"
                + "undo ont gemport bind " + i.getPorta() + " " + i.getLogica() + " " + gemportIptv + "\n"
                + "undo ont gemport bind " + i.getPorta() + " " + i.getLogica() + " " + gemportVoip + "\n"
                + "ont port native-vlan " + i.getPorta() + " " + i.getLogica() + " eth 1 vlan 1\n"
                + "\n"
                + "undo ont port vlan " + i.getPorta() + " " + i.getLogica() + " eth 10 1\n"
                + "undo ont port vlan " + i.getPorta() + " " + i.getLogica() + " eth 20 1\n"
                + "undo ont port vlan " + i.getPorta() + " " + i.getLogica() + " eth 20 2\n"
                + "undo ont port vlan " + i.getPorta() + " " + i.getLogica() + " eth 20 3\n"
                + "undo ont port vlan " + i.getPorta() + " " + i.getLogica() + " eth 20 4\n"
                + "undo ont port vlan " + i.getPorta() + " " + i.getLogica() + " eth 30 1\n"
                + "gemport delete " + i.getPorta() + " gemportid " + gemportBanda + "\n"
                + "gemport delete " + i.getPorta() + " gemportid " + gemportVoip + "\n"
                + "undo tcont bind-profile " + i.getPorta() + " " + i.getLogica() + " 4\n"
                + "undo tcont bind-profile " + i.getPorta() + " " + i.getLogica() + " 2\n"
                + "undo tcont bind-profile " + i.getPorta() + " " + i.getLogica() + " 3\n"
                + "\n"
                + "undo ont port-bundle " + i.getPorta() + " " + i.getLogica() + " eth 0\n"
                + "\n"
                + "gemport delete " + i.getPorta() + " gemportid " + gemportIptv + "\n"
                + "ont delete " + i.getPorta() + " " + i.getLogica() + "\n"
                + "\n"
                + "quit\n"
                + "undo service-port " + indexSpIptv + "\n\n"
                + "undo service-port " + indexSpVoip + "\n\n", 25000);
    }

    @Override
    public void deleteVlanBanda(InventarioRede i) throws Exception {

        getCd().consulta(getComandoDeleteVlanBanda(i));
    }

    protected ComandoDslam getComandoDeleteVlanVoip(InventarioRede i) throws Exception {
        if (spVoip == null) {
            setServicePorts(i);
        }
        if (gemportVoip == null) {
            setGemports(i);
        }

        String indexSpVoip = spVoip == null ? "" : spVoip.getIndex().toString();

        return new ComandoDslam("interface gpon 0/" + i.getSlot() + "\n"
                + "undo ont gemport mapping " + i.getPorta() + " " + i.getLogica() + " " + gemportVoip + "\n"
                + "\n"
                + "undo ont gemport bind " + i.getPorta() + " " + i.getLogica() + " " + gemportVoip + "\n"
                + "\n"
                + "undo ont port vlan " + i.getPorta() + " " + i.getLogica() + " eth 30 1\n"
                + "\n"
                + "gemport delete " + i.getPorta() + " gemportid " + gemportVoip + "\n"
                + "\n"
                + "undo tcont bind-profile " + i.getPorta() + " " + i.getLogica() + " 3\n"
                + "\n"
                + "quit\n"
                + "\n"
                + "undo service-port " + indexSpVoip, 7500);
    }

    @Override
    public void deleteVlanVoip(InventarioRede i) throws Exception {
        getCd().consulta(getComandoDeleteVlanVoip(i));
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
                + "interface gpon 0/" + i.getSlot() + "\n"
                + "undo ont gemport mapping " + i.getPorta() + " " + i.getLogica() + " " + gemportIptv + " vlan 20\n"
                + " \n"
                + " \n"
                + "undo ont gemport bind " + i.getPorta() + " " + i.getLogica() + " " + gemportIptv + "\n"
                + "undo ont port vlan " + i.getPorta() + " " + gemportIptv + " eth 20 1\n"
                + "undo ont port vlan " + i.getPorta() + " " + gemportIptv + " eth 20 2\n"
                + "undo ont port vlan " + i.getPorta() + " " + gemportIptv + " eth 20 3\n"
                + "undo ont port vlan " + i.getPorta() + " " + gemportIptv + " eth 20 4\n"
                + "gemport delete " + i.getPorta() + " gemportid " + gemportIptv + "\n"
                + "undo tcont bind-profile " + i.getPorta() + " " + i.getLogica() + " 2\n"
                + "quit\n"
                + "undo service-port " + indexSpIptv, 9000);
    }

    @Override
    public void deleteVlanVod(InventarioRede i) throws Exception {
        getCd().consulta(getComandoDeleteVlanVod(i));
    }

    @Override
    public void deleteVlanMulticast(InventarioRede i) throws Exception {

    }

    @Override
    public List<VelocidadeVendor> obterVelocidadesDownVendor() {
        if (velsDown.isEmpty()) {
            Velocidades[] vels = Velocidades.values();
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
        List<String> retorno = getCd().consulta(getComandoGetEstadoPortasProximas(i)).getRetorno();
        Integer countStringOccurrence = TratativaRetornoUtil.countStringOccurrence(retorno, "0/" + i.getSlot() + "/" + i.getPorta());
        List<Porta> list = new ArrayList<>();
        for (int j = 1; j < ((countStringOccurrence - 1) / 2); j++) {
            Porta porta = new Porta();
            EstadoDaPorta estado = new EstadoDaPorta();
            List<String> linha = TratativaRetornoUtil.tratZhone(retorno, "0/" + i.getSlot() + "/" + i.getPorta(), "\\b\\w+\\b", j);

            estado.setAdminState(linha.get(5).equalsIgnoreCase("active"));
            estado.setOperState(linha.get(6).equalsIgnoreCase("online"));
            porta.setEstadoPorta(estado);
            porta.setNumPorta(new Integer(linha.get(3)));
            list.add(porta);
        }

        return list;
    }

    @Override
    public ReConexao getReconexoes(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
