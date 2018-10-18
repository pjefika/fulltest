/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.gpon.alcatel;

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
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.TabelaParametrosGpon;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.TabelaParametrosGponVivo1;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.VelocidadeVendor;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.Velocidades;
import br.net.gvt.efika.util.json.JacksonMapper;
import java.util.List;
import model.fulltest.operacional.CustomerMock;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author G0034481
 */
public class Alcatel7302GponDslamVivo1IT {

    /**
     * 2430282756 - Ready | 5137240278 - Falha Leitura
     */
    private static EfikaCustomer cust;
    private static Alcatel7302GponDslamVivo1 instance;
    private static InventarioRede i;

    public Alcatel7302GponDslamVivo1IT() {
    }

    @BeforeClass
    public static void setUpClass() {
        try {
            cust = (EfikaCustomer) new JacksonMapper(EfikaCustomer.class).deserialize(
                    "{"
                    + "   \"designador\":\"SRR-814Z1ADHQ1-013\","
                    + "   \"instancia\":\"115628348344507\","
                    + "   \"designadorAcesso\":\"SRR-27461824-069\","
                    + "   \"designadorTv\":\"TV-SRR-814Z1ADHQ5-050\","
                    + "   \"rede\":{"
                    + "      \"tipo\":\"GPON\","
                    + "      \"origem\":\"ONLINE\","
                    + "      \"planta\":\"VIVO1\","
                    + "      \"ipDslam\":\"10.58.245.238\","
                    + "      \"vendorDslam\":\"ALCATEL\","
                    + "      \"modeloDslam\":\"7302 ISAM FTTU\","
                    + "      \"idOnt\":\"0004103941\","
                    + "      \"terminal\":\"1783483445\","
                    + "      \"ipMulticast\":null,"
                    + "      \"nrc\":null,"
                    + "      \"slot\":18,"
                    + "      \"porta\":5,"
                    + "      \"sequencial\":31,"
                    + "      \"logica\":31,"
                    + "      \"rin\":242,"
                    + "      \"vlanVoip\":3004,"
                    + "      \"vlanVod\":3001,"
                    + "      \"vlanMulticast\":3001,"
                    + "      \"cvlan\":2276,"
                    + "      \"bhs\":true"
                    + "   },"
                    + "   \"redeExterna\":{"
                    + "      \"tipo\":null,"
                    + "      \"origem\":null,"
                    + "      \"planta\":null,"
                    + "      \"splitter1n\":null,"
                    + "      \"splitter2n\":null,"
                    + "      \"caboAlim\":null,"
                    + "      \"fibra1n\":null,"
                    + "      \"fibra2n\":null"
                    + "   },"
                    + "   \"servicos\":{"
                    + "      \"origem\":null,"
                    + "      \"velDown\":102400,"
                    + "      \"velUp\":51200,"
                    + "      \"tipoTv\":\"IPTV\","
                    + "      \"tipoLinha\":\"SIP\""
                    + "   },"
                    + "   \"linha\":{"
                    + "      \"tipo\":null,"
                    + "      \"dn\":null,"
                    + "      \"central\":null"
                    + "   },"
                    + "   \"radius\":{"
                    + "      \"status\":null,"
                    + "      \"armario\":null,"
                    + "      \"rin\":null,"
                    + "      \"velocidade\":null,"
                    + "      \"ipFixo\":null,"
                    + "      \"profile\":null,"
                    + "      \"porta\":null,"
                    + "      \"isIpFixo\":null"
                    + "   },"
                    + "   \"asserts\":["
                    + "      {"
                    + "         \"asserts\":\"CIRCUITO_ATIVO\","
                    + "         \"value\":true,"
                    + "         \"creationDate\":1539877732740"
                    + "      },"
                    + "      {"
                    + "         \"asserts\":\"DIVERGENCIA_TBS_RADIUS\","
                    + "         \"value\":false,"
                    + "         \"creationDate\":1539877732740"
                    + "      },"
                    + "      {"
                    + "         \"asserts\":\"HAS_BLOQUEIO_RADIUS\","
                    + "         \"value\":false,"
                    + "         \"creationDate\":1539877732740"
                    + "      }"
                    + "   ],"
                    + "   \"eventos\":["
                    + ""
                    + "   ]"
                    + "}");
            instance = new Alcatel7302GponDslamVivo1(cust.getRede().getIpDslam());
            i = cust.getRede();
        } catch (Exception e) {

        }
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
     * Test of obterVelocidadesDownVendor method, of class
     * Alcatel7302GponDslamVivo1.
     */
    @Test
    public void testObterVelocidadesDownVendor() {
        System.out.println("obterVelocidadesDownVendor");
        List<VelocidadeVendor> result = instance.obterVelocidadesDownVendor();
        //System.out.println(GsonUtil.serialize(result));
    }

    /**
     * Test of obterVelocidadesUpVendor method, of class
     * Alcatel7302GponDslamVivo1.
     */
    @Test
    public void testObterVelocidadesUpVendor() {
        System.out.println("obterVelocidadesUpVendor");
        List<VelocidadeVendor> result = instance.obterVelocidadesUpVendor();
        //System.out.println(GsonUtil.serialize(result));
    }

    /**
     * Test of getEstadoDaPorta method, of class Alcatel7302GponDslamVivo1.
     */
    @Test
    public void testGetEstadoDaPorta() throws Exception {
        System.out.println("getEstadoDaPorta");
        EstadoDaPorta result = instance.getEstadoDaPorta(i);
        System.out.println(new JacksonMapper(EstadoDaPorta.class
        ).serialize(result));
        assertTrue(result.validar(cust));
    }

    /**
     * Test of getDeviceMac method, of class Alcatel7302GponDslamVivo1.
     */
    @Test
    public void testGetDeviceMac() throws Exception {
        System.out.println("getDeviceMac");
        DeviceMAC result = instance.getDeviceMac(i);
        //System.out.println(GsonUtil.serialize(result));
    }

    /**
     * Test of getProfile method, of class Alcatel7302GponDslamVivo1.
     */
    @Test
    public void testGetProfile() throws Exception {
        System.out.println("getProfile");
        Profile result = instance.getProfile(i);
        System.out.println(new JacksonMapper(Profile.class
        ).serialize(result));
    }

    /**
     * Test of getVlanBanda method, of class Alcatel7302GponDslamVivo1.
     */
    @Test
    public void testGetVlanBanda() throws Exception {
        System.out.println("getVlanBanda");
        VlanBanda result = instance.getVlanBanda(i);
        System.out.println(new JacksonMapper<>(VlanBanda.class
        ).serialize(result));
    }

    /**
     * Test of getVlanMulticast method, of class Alcatel7302GponDslamVivo1.
     */
    @Test
    public void testGetVlanMulticast() throws Exception {
        System.out.println("getVlanMulticast");
//        VlanMulticast result = instance.getVlanMulticast(i);
//        //System.out.println(GsonUtil.serialize(result));
//        assertTrue(result.validar(cust));
    }

    /**
     * Test of getVlanVoip method, of class Alcatel7302GponDslamVivo1.
     */
    @Test
    public void testGetVlanVoip() throws Exception {
        System.out.println("getVlanVoip");
        VlanVoip result = instance.getVlanVoip(i);
        //System.out.println(GsonUtil.serialize(result));
        assertTrue(result.validar(cust));
    }

    /**
     * Test of getVlanVod method, of class Alcatel7302GponDslamVivo1.
     */
    @Test
    public void testGetVlanVod() throws Exception {
        System.out.println("getVlanVod");
        VlanVod result = instance.getVlanVod(i);
        //System.out.println(GsonUtil.serialize(result));
        assertTrue(result.validar(cust));
    }

    /**
     * Test of getSerialOnt method, of class Alcatel7302GponDslamVivo1.
     */
    @Test
    public void testGetSerialOnt() throws Exception {
        System.out.println("getSerialOnt");
        SerialOntGpon result = instance.getSerialOnt(i);
        //System.out.println(GsonUtil.serialize(result));
    }

    /**
     * Test of getTabelaParametros method, of class Alcatel7302GponDslamVivo1.
     */
    @Test
    public void testGetTabelaParametros() throws Exception {
        System.out.println("getTabelaParametros");
        TabelaParametrosGponVivo1 result = instance.getTabelaParametros(i);
        //System.out.println(GsonUtil.serialize(result));
    }

    /**
     * Test of getAlarmes method, of class Alcatel7302GponDslamVivo1.
     */
    @Test
    public void testGetAlarmes() throws Exception {
        System.out.println("getAlarmes");
        InventarioRede i = null;
        Alcatel7302GponDslamVivo1 instance = null;
        AlarmesGpon expResult = null;
        AlarmesGpon result = instance.getAlarmes(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSlotsAvailableOnts method, of class Alcatel7302GponDslamVivo1.
     */
    @Test
    public void testGetSlotsAvailableOnts() throws Exception {
        System.out.println("getSlotsAvailableOnts");
        InventarioRede i = null;
        Alcatel7302GponDslamVivo1 instance = null;
        List<SerialOntGpon> expResult = null;
        List<SerialOntGpon> result = instance.getSlotsAvailableOnts(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstadoPortasProximas method, of class
     * Alcatel7302GponDslamVivo1.
     */
    @Test
    public void testGetEstadoPortasProximas() throws Exception {
        System.out.println("getEstadoPortasProximas");
        List<Porta> result = instance.getEstadoPortasProximas(i);
        //System.out.println(GsonUtil.serialize(result));
    }

    /**
     * Test of setOntToOlt method, of class Alcatel7302GponDslamVivo1.
     */
    @Test
    public void testSetOntToOlt() throws Exception {
        System.out.println("setOntToOlt");
        InventarioRede i = null;
        SerialOntGpon s = null;
        Alcatel7302GponDslamVivo1 instance = null;
        SerialOntGpon expResult = null;
        SerialOntGpon result = instance.setOntToOlt(i, s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unsetOntFromOlt method, of class Alcatel7302GponDslamVivo1.
     */
    @Test
    public void testUnsetOntFromOlt() throws Exception {
        System.out.println("unsetOntFromOlt");
        InventarioRede i = null;
        Alcatel7302GponDslamVivo1 instance = null;
        instance.unsetOntFromOlt(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstadoDaPorta method, of class Alcatel7302GponDslamVivo1.
     */
    @Test
    public void testSetEstadoDaPorta() throws Exception {
        System.out.println("setEstadoDaPorta");
        EstadoDaPorta e = new EstadoDaPorta();
        e.setAdminState(Boolean.TRUE);
        EstadoDaPorta result = instance.setEstadoDaPorta(i, e);
        //System.out.println(GsonUtil.serialize(result));
    }

    /**
     * Test of setProfileDown method, of class Alcatel7302GponDslamVivo1.
     */
    @Test
    public void testSetProfileDown() throws Exception {
        System.out.println("setProfileDown");
        InventarioRede i = null;
        Velocidades v = null;
        Alcatel7302GponDslamVivo1 instance = null;
        instance.setProfileDown(i, v);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProfileUp method, of class Alcatel7302GponDslamVivo1.
     */
    @Test
    public void testSetProfileUp() throws Exception {
        System.out.println("setProfileUp");
        InventarioRede i = null;
        Velocidades vDown = null;
        Velocidades vUp = null;
        Alcatel7302GponDslamVivo1 instance = null;
        instance.setProfileUp(i, vDown, vUp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createVlanBanda method, of class Alcatel7302GponDslamVivo1.
     */
    @Test
    public void testCreateVlanBanda() throws Exception {
        System.out.println("createVlanBanda");
        VlanBanda result = instance.createVlanBanda(i, null, null);
        //System.out.println(GsonUtil.serialize(result));
    }

    /**
     * Test of createVlanVoip method, of class Alcatel7302GponDslamVivo1.
     */
    @Test
    public void testCreateVlanVoip() throws Exception {
        System.out.println("createVlanVoip");
        VlanVoip result = instance.createVlanVoip(i);
        //System.out.println(GsonUtil.serialize(result));
    }

    /**
     * Test of createVlanVod method, of class Alcatel7302GponDslamVivo1.
     */
    @Test
    public void testCreateVlanVod() throws Exception {
        System.out.println("createVlanVod");
        VlanVod result = instance.createVlanVod(i);
        //System.out.println(GsonUtil.serialize(result));
    }

    /**
     * Test of createVlanMulticast method, of class Alcatel7302GponDslamVivo1.
     */
    @Test
    public void testCreateVlanMulticast() throws Exception {
        System.out.println("createVlanMulticast");
        InventarioRede i = null;
        Alcatel7302GponDslamVivo1 instance = null;
        VlanMulticast expResult = null;
        VlanMulticast result = instance.createVlanMulticast(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteVlanBanda method, of class Alcatel7302GponDslamVivo1.
     */
    @Test
    public void testDeleteVlanBanda() throws Exception {
        System.out.println("deleteVlanBanda");

        VlanBanda v = instance.deleteVlanBanda(i);
        System.out.println(new JacksonMapper(VlanBanda.class
        ).serialize(v));
    }

    /**
     * Test of deleteVlanVoip method, of class Alcatel7302GponDslamVivo1.
     */
    @Test
    public void testDeleteVlanVoip() throws Exception {
        System.out.println("deleteVlanVoip");
        instance.deleteVlanVoip(i);

    }

    /**
     * Test of deleteVlanVod method, of class Alcatel7302GponDslamVivo1.
     */
    @Test
    public void testDeleteVlanVod() throws Exception {
        System.out.println("deleteVlanVod");
        InventarioRede i = null;
        Alcatel7302GponDslamVivo1 instance = null;
        instance.deleteVlanVod(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteVlanMulticast method, of class Alcatel7302GponDslamVivo1.
     */
    @Test
    public void testDeleteVlanMulticast() throws Exception {
        System.out.println("deleteVlanMulticast");
        InventarioRede i = null;
        Alcatel7302GponDslamVivo1 instance = null;
        instance.deleteVlanMulticast(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testFazcomando() throws Exception {
        System.out.println("ComandosGenericos");
        //List<StatusSlot> result = instance.fazcomando(i);
        ////System.out.println(GsonUtil.serialize(result));
    }

    @Test
    public void testGetPortaPON() {
        System.out.println("testGetPortaPON");
        try {
            PortaPON result = instance.getPortaPON(i);
//            System.out.println(GsonUtil.serialize(result.validar(cust)));
            assertTrue(result.validar(null));
        } catch (Exception e) {
            e.printStackTrace();
            fail(e.getMessage());
        }
    }

}
