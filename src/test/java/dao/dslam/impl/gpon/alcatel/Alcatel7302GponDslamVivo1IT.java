/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.gpon.alcatel;

import br.net.gvt.efika.customer.EfikaCustomer;
import br.net.gvt.efika.customer.InventarioRede;
import br.net.gvt.efika.util.util.json.JacksonMapper;
import java.util.List;
import model.fulltest.operacional.CustomerMock;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import telecom.properties.DeviceMAC;
import telecom.properties.EstadoDaPorta;
import telecom.properties.Porta;
import telecom.properties.Profile;
import telecom.properties.VlanBanda;
import telecom.properties.VlanMulticast;
import telecom.properties.VlanVod;
import telecom.properties.VlanVoip;
import telecom.properties.gpon.AlarmesGpon;
import telecom.properties.gpon.PortaPON;
import telecom.properties.gpon.SerialOntGpon;
import telecom.properties.gpon.TabelaParametrosGpon;
import telecom.velocidade.VelocidadeVendor;
import telecom.velocidade.Velocidades;

/**
 *
 * @author G0034481
 */
public class Alcatel7302GponDslamVivo1IT {

    /**
     * 2430282756 - Ready | 5137240278 - Falha Leitura
     */
    private static EfikaCustomer cust = CustomerMock.getCustomer("1732270283");
    private static Alcatel7302GponDslamVivo1 instance = new Alcatel7302GponDslamVivo1(cust.getRede().getIpDslam());
    private static InventarioRede i = cust.getRede();

    public Alcatel7302GponDslamVivo1IT() {
    }

    @BeforeClass
    public static void setUpClass() {
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
        System.out.println(new JacksonMapper(EstadoDaPorta.class).serialize(result));
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
//        System.out.println(GsonUtil.serialize(result.validar(cust)));
    }

    /**
     * Test of getVlanBanda method, of class Alcatel7302GponDslamVivo1.
     */
    @Test
    public void testGetVlanBanda() throws Exception {
        System.out.println("getVlanBanda");
        VlanBanda result = instance.getVlanBanda(i);
        //System.out.println(GsonUtil.serialize(result));
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
        TabelaParametrosGpon result = instance.getTabelaParametros(i);
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
        instance.deleteVlanBanda(i);
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
