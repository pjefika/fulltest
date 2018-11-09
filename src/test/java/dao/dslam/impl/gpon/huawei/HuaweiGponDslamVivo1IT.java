/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.gpon.huawei;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.efika_customer.model.customer.InventarioRede;
import br.net.gvt.efika.fulltest.model.telecom.properties.DeviceMAC;
import br.net.gvt.efika.fulltest.model.telecom.properties.EstadoDaPorta;
import br.net.gvt.efika.fulltest.model.telecom.properties.Porta;
import br.net.gvt.efika.fulltest.model.telecom.properties.Profile;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanBanda;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanMulticast;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanVod;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanVoip;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.AlarmesGpon;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.PortaPON;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.SerialOntGpon;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.TabelaParametrosGponBasic;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.VelocidadeVendor;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.Velocidades;
import br.net.gvt.efika.util.json.JacksonMapper;
import com.jcraft.jsch.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.security.Security;
import java.util.List;
import java.util.Properties;
import model.dslam.credencial.Credencial;
import model.fulltest.operacional.CustomerMock;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author G0041775
 */
public class HuaweiGponDslamVivo1IT {

    private static EfikaCustomer cust;//= CustomerMock.getCustomer("1932566062");
    private static HuaweiGponDslamVivo1 instance;// = new HuaweiGponDslamVivo1(cust.getRede().getIpDslam());
    private static InventarioRede i;// = cust.getRede();

    public HuaweiGponDslamVivo1IT() {
    }

    @BeforeClass
    public static void setUpClass() {
        BouncyCastleProvider bouncyCastleProvider = new BouncyCastleProvider();
        Security.insertProviderAt(bouncyCastleProvider, 1);
        try {
            cust = (EfikaCustomer) new JacksonMapper(EfikaCustomer.class).deserialize("{"
                    + "   \"designador\":\"SPO-814YXT7N6M-013\","
                    + "   \"instancia\":\"110008354249707\","
                    + "   \"designadorAcesso\":\"SPO-27398202-069\","
                    + "   \"designadorTv\":null,"
                    + "   \"rede\":{"
                    + "      \"tipo\":\"GPON\","
                    + "      \"origem\":\"OFFLINE\","
                    + "      \"planta\":\"VIVO1\","
                    + "      \"ipDslam\":\"BR_SPOJB_OLT04\","
                    + "      \"vendorDslam\":\"HUAWEI TECHNOLOGIES\","
                    + "      \"modeloDslam\":\"MA5600T\","
                    + "      \"idOnt\":\"0004093233\","
                    + "      \"terminal\":\"110008354249707\","
                    + "      \"ipMulticast\":null,"
                    + "      \"nrc\":null,"
                    + "      \"slot\":15,"
                    + "      \"porta\":6,"
                    + "      \"sequencial\":48,"
                    + "      \"logica\":48,"
                    + "      \"rin\":34,"
                    + "      \"vlanVoip\":3004,"
                    + "      \"vlanVod\":3001,"
                    + "      \"vlanMulticast\":3001,"
                    + "      \"cvlan\":289,"
                    + "      \"bhs\":\"true\""
                    + "   },"
                    + "   \"servicos\":{"
                    + "      \"origem\":null,"
                    + "      \"velDown\":324500,"
                    + "      \"velUp\":162202,"
                    + "      \"tipoTv\":\"IPTV\","
                    + "      \"tipoLinha\":\"SIP\""
                    + "   },"
                    + "   \"linha\":{"
                    + "      \"tipo\":null,"
                    + "      \"dn\":null,"
                    + "      \"central\":null"
                    + "   },"
                    + "   \"asserts\":["
                    + ""
                    + "   ],"
                    + "   \"eventos\":["
                    + ""
                    + "   ]"
                    + "}");
        } catch (Exception e) {
        }
        instance = new HuaweiGponDslamVivo1(cust.getRede().getIpDslam());
        i = cust.getRede();
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {
    }

    /**
     * Test of conectar method, of class HuaweiGponDslamVivo1.
     */
    @Test
    public void testConectar() throws Exception {
        System.out.println("conectar");
//        instance.conectar();
        try {
            Security.insertProviderAt(new BouncyCastleProvider(), 1);
            JSch jsch = new JSch();
            Session session = jsch.getSession("incid", "200.204.1.4", 22);
            session.setPassword("v!vo@incid");

            Properties config = new Properties();
            config.put("StrictHostKeyChecking", "no");
            session.setConfig(config);

            session.connect();
            String cmd = "telnet " + i.getIpDslam();
//            Shell shell = new SshByPassword("200.204.1.4", 22, "incid", "v!vo@incid");
            Channel channel = session.openChannel("shell");

//            ByteArrayInputStream is = new ByteArrayInputStream(cmd.getBytes());
//            channel.setInputStream(is);
//            channel.setOutputStream(new ByteArrayOutputStream());
//            channel.setOutputStream(System.out);
            PrintWriter print = new PrintWriter(channel.getOutputStream(), false);
            BufferedReader in = new BufferedReader(new InputStreamReader(channel.getInputStream()));

            channel.connect();
            Thread.sleep(1000);
//            for (int j = 0; j < 3; j++) {
//                print.println(cmd + "\r" + Credencial.VIVO1.getLogin() + "\r" + Credencial.VIVO1.getPass() + "\r");
//                Thread.sleep(1000);               
//            }
            print.print(cmd + "\r");
            print.flush();
            Thread.sleep(3000);
            print.print(Credencial.VIVO1.getLogin() + "\r");
            print.flush();
            Thread.sleep(1000);
            print.print(Credencial.VIVO1.getPass() + "\r");
            print.flush();
            Thread.sleep(1000);
            print.print("enable\r");
            print.flush();
            Thread.sleep(1000);
            print.print("config\r");
            print.flush();
            print.println();
            print.flush();

            String l = "";

            Thread.sleep(1000);
//            channel.disconnect();
            Integer o = 0;
            while ((l = in.readLine()) != null) {
                System.out.println(l);
                if (l.isEmpty()) {
                    o++;
                }
                if (o > 10) {
                    break;
                }
            }

//            System.out.println(stdout2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getEstadoDaPorta method, of class HuaweiGponDslamVivo1.
     */
    @Test
    public void testGetEstadoDaPorta() throws Exception {
        System.out.println("getEstadoDaPorta");
        EstadoDaPorta result = instance.getEstadoDaPorta(i);

    }

    /**
     * Test of getSerialOnt method, of class HuaweiGponDslamVivo1.
     */
    @Test
    public void testGetSerialOnt() throws Exception {
        System.out.println("getSerialOnt");
        SerialOntGpon result = instance.getSerialOnt(i);

    }

    /**
     * Test of getTabelaParametros method, of class HuaweiGponDslamVivo1.
     */
    @Test
    public void testGetTabelaParametros() throws Exception {
        System.out.println("getTabelaParametros");
        TabelaParametrosGponBasic result = instance.getTabelaParametros(i);
        assertTrue(result.validar(null));
    }

    @Test
    public void testGetPortaPON() throws Exception {
        System.out.println("getPortaPON");
        PortaPON result = instance.getPortaPON(i);
        assertTrue(result.validar(null));

    }

    /**
     * Test of getVlanBanda method, of class HuaweiGponDslamVivo1.
     */
    @Test
    public void testGetVlanBanda() throws Exception {
        System.out.println("getVlanBanda");
        VlanBanda result = instance.getVlanBanda(i);

        assertTrue(result.validar(cust));
    }

    /**
     * Test of getVlanMulticast method, of class HuaweiGponDslamVivo1.
     */
    @Test
    public void testGetVlanMulticast() throws Exception {
        System.out.println("getVlanMulticast");
        InventarioRede i = null;
        HuaweiGponDslamVivo1 instance = null;
        VlanMulticast expResult = null;
        VlanMulticast result = instance.getVlanMulticast(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVlanVoip method, of class HuaweiGponDslamVivo1.
     */
    @Test
    public void testGetVlanVoip() throws Exception {
        System.out.println("getVlanVoip");
        VlanVoip result = instance.getVlanVoip(i);

        assertTrue(result.validar(cust));
    }

    /**
     * Test of getVlanVod method, of class HuaweiGponDslamVivo1.
     */
    @Test
    public void testGetVlanVod() throws Exception {
        System.out.println("getVlanVod");
        VlanVod result = instance.getVlanVod(i);

        assertTrue(result.validar(cust));
    }

    /**
     * Test of getAlarmes method, of class HuaweiGponDslamVivo1.
     */
    @Test
    public void testGetAlarmes() throws Exception {
        System.out.println("getAlarmes");
        AlarmesGpon result = instance.getAlarmes(i);

    }

    /**
     * Test of getProfile method, of class HuaweiGponDslamVivo1.
     */
    @Test
    public void testGetProfile() throws Exception {
        System.out.println("getProfile");
        Profile result = instance.getProfile(i);

    }

    /**
     * Test of getDeviceMac method, of class HuaweiGponDslamVivo1.
     */
    @Test
    public void testGetDeviceMac() throws Exception {
        System.out.println("getDeviceMac");
        InventarioRede i = null;
        HuaweiGponDslamVivo1 instance = null;
        DeviceMAC expResult = null;
        DeviceMAC result = instance.getDeviceMac(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOntToOlt method, of class HuaweiGponDslamVivo1.
     */
    @Test
    public void testSetOntToOlt() throws Exception {
        System.out.println("setOntToOlt");
        InventarioRede i = null;
        SerialOntGpon s = null;
        HuaweiGponDslamVivo1 instance = null;
        SerialOntGpon expResult = null;
        SerialOntGpon result = instance.setOntToOlt(i, s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unsetOntFromOlt method, of class HuaweiGponDslamVivo1.
     */
    @Test
    public void testUnsetOntFromOlt() throws Exception {
        System.out.println("unsetOntFromOlt");
        InventarioRede i = null;
        HuaweiGponDslamVivo1 instance = null;
        instance.unsetOntFromOlt(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstadoDaPorta method, of class HuaweiGponDslamVivo1.
     */
    @Test
    public void testSetEstadoDaPorta() throws Exception {
        System.out.println("setEstadoDaPorta");
        EstadoDaPorta e = new EstadoDaPorta();
        e.setAdminState(true);
        EstadoDaPorta result = instance.setEstadoDaPorta(i, e);

    }

    /**
     * Test of setProfileDown method, of class HuaweiGponDslamVivo1.
     */
    @Test
    public void testSetProfileDown() throws Exception {
        System.out.println("setProfileDown");
        InventarioRede i = null;
        Velocidades v = null;
        HuaweiGponDslamVivo1 instance = null;
        instance.setProfileDown(i, v);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProfileUp method, of class HuaweiGponDslamVivo1.
     */
    @Test
    public void testSetProfileUp() throws Exception {
        System.out.println("setProfileUp");
        InventarioRede i = null;
        Velocidades vDown = null;
        Velocidades vUp = null;
        HuaweiGponDslamVivo1 instance = null;
        instance.setProfileUp(i, vDown, vUp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createVlanBanda method, of class HuaweiGponDslamVivo1.
     */
    @Test
    public void testCreateVlanBanda() throws Exception {
        System.out.println("createVlanBanda");
        VlanBanda result = instance.createVlanBanda(i, Velocidades.find(cust.getServicos().getVelDown()), Velocidades.find(cust.getServicos().getVelUp()));
        System.out.println(new JacksonMapper(VlanBanda.class).serialize(result));
    }

    /**
     * Test of createVlanVoip method, of class HuaweiGponDslamVivo1.
     */
    @Test
    public void testCreateVlanVoip() throws Exception {
        System.out.println("createVlanVoip");
        VlanVoip result = instance.createVlanVoip(i);

    }

    /**
     * Test of createVlanVod method, of class HuaweiGponDslamVivo1.
     */
    @Test
    public void testCreateVlanVod() throws Exception {
        System.out.println("createVlanVod");
        VlanVod result = instance.createVlanVod(i);

    }

    /**
     * Test of createVlanMulticast method, of class HuaweiGponDslamVivo1.
     */
    @Test
    public void testCreateVlanMulticast() throws Exception {
        System.out.println("createVlanMulticast");
        InventarioRede i = null;
        HuaweiGponDslamVivo1 instance = null;
        VlanMulticast expResult = null;
        VlanMulticast result = instance.createVlanMulticast(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteVlanBanda method, of class HuaweiGponDslamVivo1.
     */
    @Test
    public void testDeleteVlanBanda() throws Exception {
        System.out.println("deleteVlanBanda");
        instance.deleteVlanBanda(i);
    }

    /**
     * Test of deleteVlanVoip method, of class HuaweiGponDslamVivo1.
     */
    @Test
    public void testDeleteVlanVoip() throws Exception {
        System.out.println("deleteVlanVoip");
        instance.deleteVlanVoip(i);

    }

    /**
     * Test of deleteVlanVod method, of class HuaweiGponDslamVivo1.
     */
    @Test
    public void testDeleteVlanVod() throws Exception {
        System.out.println("deleteVlanVod");
        instance.deleteVlanVod(i);
    }

    /**
     * Test of deleteVlanMulticast method, of class HuaweiGponDslamVivo1.
     */
    @Test
    public void testDeleteVlanMulticast() throws Exception {
        System.out.println("deleteVlanMulticast");
        InventarioRede i = null;
        HuaweiGponDslamVivo1 instance = null;
        instance.deleteVlanMulticast(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSlotsAvailableOnts method, of class HuaweiGponDslamVivo1.
     */
    @Test
    public void testGetSlotsAvailableOnts() throws Exception {
        System.out.println("getSlotsAvailableOnts");
        List<SerialOntGpon> result = instance.getSlotsAvailableOnts(i);

    }

    /**
     * Test of obterVelocidadesDownVendor method, of class HuaweiGponDslamVivo1.
     */
    @Test
    public void testObterVelocidadesDownVendor() {
        System.out.println("obterVelocidadesDownVendor");
        HuaweiGponDslamVivo1 instance = null;
        List<VelocidadeVendor> expResult = null;
        List<VelocidadeVendor> result = instance.obterVelocidadesDownVendor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obterVelocidadesUpVendor method, of class HuaweiGponDslamVivo1.
     */
    @Test
    public void testObterVelocidadesUpVendor() {
        System.out.println("obterVelocidadesUpVendor");
        HuaweiGponDslamVivo1 instance = null;
        List<VelocidadeVendor> expResult = null;
        List<VelocidadeVendor> result = instance.obterVelocidadesUpVendor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstadoPortasProximas method, of class HuaweiGponDslamVivo1.
     */
    @Test
    public void testGetEstadoPortasProximas() throws Exception {
        System.out.println("getEstadoPortasProximas");
        List<Porta> result = instance.getEstadoPortasProximas(i);

    }

}
