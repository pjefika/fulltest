/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.gpon.huawei;

import br.net.gvt.efika.customer.InventarioRede;
import dao.dslam.factory.exception.FuncIndisponivelDslamException;
import dao.dslam.impl.ComandoDslam;
import dao.dslam.impl.gpon.DslamVivo1;
import dao.dslam.impl.login.LoginComJump;
import dao.dslam.impl.retorno.TratativaRetornoUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
import model.dslam.consulta.gpon.ServicePort;
import model.dslam.consulta.gpon.TabelaParametrosGpon;
import model.dslam.credencial.Credencial;
import model.dslam.velocidade.VelocidadeVendor;
import model.dslam.velocidade.Velocidades;

/**
 *
 * @author G0041775
 */
public class HuaweiGponDslamVivo1 extends DslamVivo1 {

    private transient ServicePort spBanda;
    private transient ServicePort spVoip;
    private transient ServicePort spIptv;
    private transient EstadoDaPorta estadoDaPorta;
    private transient SerialOntGpon serial;
    private transient String idOnt = "";
    private Integer gemportBanda, gemportIptv, gemportVoip;

    public HuaweiGponDslamVivo1(String ipDslam) {
        super(ipDslam, Credencial.VIVO1, new LoginComJump());
    }

    @Override
    public void conectar() throws Exception {
        super.conectar();
        this.getCd().consulta(this.getComandoEnableConfig());
    }

    protected ComandoDslam getComandoEnableConfig() {
        return new ComandoDslam("enable", 500, "config", 500, "mmi-mode original-output");
    }

    protected void setServicePorts(InventarioRede i) throws Exception {
        gemportBanda = i.getLogica() + 128;
        gemportIptv = i.getLogica() + 256;
        gemportVoip = i.getLogica() + 384;
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

    protected void tabelaEstadoDaPorta(InventarioRede i) throws Exception {
        gemportBanda = i.getLogica() + 128;
        gemportIptv = i.getLogica() + 256;
        gemportVoip = i.getLogica() + 384;
        List<String> resp = getCd().consulta(getComandoGetEstadoDaPorta(i)).getRetorno();
        estadoDaPorta = new EstadoDaPorta();
        estadoDaPorta.setAdminState(TratativaRetornoUtil.tratHuawei(resp, "Control flag").equalsIgnoreCase("active"));
        estadoDaPorta.setOperState(TratativaRetornoUtil.tratHuawei(resp, "Run state").equalsIgnoreCase("online"));
        serial = new SerialOntGpon();
        serial.setSerial(TratativaRetornoUtil.valueFromParentesis(TratativaRetornoUtil.tratHuawei(resp, "SN ")));
        serial.setIdOnt(TratativaRetornoUtil.valueFromParentesis(TratativaRetornoUtil.tratHuawei(resp, "Password")));
    }

    protected ComandoDslam getComandoGetEstadoDaPorta(InventarioRede i) {
        return new ComandoDslam("interface gpon 0/" + i.getSlot(), 1000, "display ont info " + i.getPorta() + " " + i.getLogica(), 1000, " ");
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
            tabelaEstadoDaPorta(i);;
        }
        return serial;
    }

    protected ComandoDslam getComandoGetParametros(InventarioRede i) {
        return new ComandoDslam("interface gpon 0/" + i.getSlot(), 1000, "display ont optical-info " + i.getPorta() + " " + i.getLogica(), 1000, " ");
    }

    @Override
    public TabelaParametrosGpon getTabelaParametros(InventarioRede i) throws Exception {
        List<String> retorno = getCd().consulta(getComandoGetParametros(i)).getRetorno();
        TabelaParametrosGpon tab = new TabelaParametrosGpon();

        tab.setPotOlt(new Double(TratativaRetornoUtil.tratHuawei(retorno, "OLT Rx")));
        tab.setPotOnt(new Double(TratativaRetornoUtil.tratHuawei(retorno, "Rx optical")));
        return tab;
    }

    @Override
    public VlanBanda getVlanBanda(InventarioRede i) throws Exception {

        if (spBanda == null) {
            spBanda = new ServicePort(false);
            setServicePorts(i);
        }
        EnumEstadoVlan state = spBanda.getState() ? EnumEstadoVlan.UP : EnumEstadoVlan.DOWN;

        return new VlanBanda(spBanda.getVpi(), spBanda.getVlanId(), state);
    }

    @Override
    public VlanMulticast getVlanMulticast(InventarioRede i) throws Exception {
        return null;
    }

    @Override
    public VlanVoip getVlanVoip(InventarioRede i) throws Exception {
        if (spVoip == null) {
            spVoip = new ServicePort(false);
            setServicePorts(i);
        }
        EnumEstadoVlan state = spVoip.getState() ? EnumEstadoVlan.UP : EnumEstadoVlan.DOWN;
        return new VlanVoip(spVoip.getVpi(), spVoip.getVlanId(), state);
    }

    @Override
    public VlanVod getVlanVod(InventarioRede i) throws Exception {
        if (spIptv == null) {
            spIptv = new ServicePort(false);
            setServicePorts(i);
        }
        EnumEstadoVlan state = spIptv.getState() ? EnumEstadoVlan.UP : EnumEstadoVlan.DOWN;
        return new VlanVod(spIptv.getVpi(), spIptv.getVlanId(), state);
    }

    protected ComandoDslam getComandoGetOntsDisp(InventarioRede i) {
        return new ComandoDslam("display ont autofind all", 5000);
    }

    @Override
    public AlarmesGpon getAlarmes(InventarioRede i) throws Exception {
        return null;
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
        Profile p = new Profile();
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void unsetOntFromOlt(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected ComandoDslam getComandoSetEstadoDaPorta(InventarioRede i, Boolean state) {
        String leState = state ? "activate" : "deactivate";
        return new ComandoDslam("interface gpon 0/" + i.getSlot(), 1000, "ont " + leState + " " + i.getPorta() + " " + i.getLogica());
    }

    @Override
    public EstadoDaPorta setEstadoDaPorta(InventarioRede i, EstadoDaPorta e) throws Exception {
        List<String> retorno = getCd().consulta(getComandoSetEstadoDaPorta(i, e.getAdminState())).getRetorno();
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

    protected ComandoDslam getComandoGetNextFreeIndex(InventarioRede i) {
        return new ComandoDslam("display service-port next-free-index", 1000);
    }

    protected Integer getNextFreeIndex(InventarioRede i) throws Exception {
        List<String> resp = getCd().consulta(getComandoGetNextFreeIndex(i)).getRetorno();
        return new Integer(TratativaRetornoUtil.tratHuawei(resp, "Next valid free service virtual port ID"));
    }

    protected ComandoDslam getComandoCreateVlanBanda(InventarioRede i, Integer index) {
        if (i.getBhs()) {
            return new ComandoDslam("interface gpon 0/" + i.getSlot() + "\n"
                    + "ont add " + i.getPorta() + " " + i.getLogica() + " password-auth " + serial.getIdOnt() + " always-on profile-id 7 desc Term_" + i.getTerminal() + "/VlanUsu_" + i.getCvLan()
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
                    + " translate-and-add inner-vlan " + i.getCvLan() + " inbound traffic-table index 6 outbound traffic-table index 500", 15000);
        }
        return new ComandoDslam("interface gpon 0/" + i.getSlot() + "\n"
                + "ont add " + i.getPorta() + " " + i.getLogica() + " password-auth \"" + serial.getIdOnt() + "\" always-on"
                + " profile-id 7 desc \"Term-" + i.getTerminal() + "/VlanUsu-" + i.getCvLan() + "\" manage-mode omci\n"
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
                + " multi-service user-vlan 10 tag-transform translate-and-add inner-vlan " + i.getCvLan() + " inner-priority 0 inbound traffic-table"
                + " index 6 outbound traffic-table index 43\n"
                + "stacking label service-port " + index + " " + i.getCvLan(), 15000);
    }

    @Override
    public VlanBanda createVlanBanda(InventarioRede i, Velocidades vDown, Velocidades vUp) throws Exception {
        if (gemportBanda == null || serial == null) {
            tabelaEstadoDaPorta(i);
        }
        List<String> resp = getCd().consulta(getComandoCreateVlanBanda(i, getNextFreeIndex(i))).getRetorno();

        return getVlanBanda(i);
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

    protected ComandoDslam getComandoDeleteVlanBanda(InventarioRede i) {
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
        if (spBanda == null) {
            setServicePorts(i);
        }
        List<String> retorno = getCd().consulta(getComandoDeleteVlanBanda(i)).getRetorno();
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

//    @Override
//    public Profile castProfile(Velocidades v) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
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

    @Override
    public List<Porta> getEstadoPortasProximas(InventarioRede i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
