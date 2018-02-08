/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.metalico.keymile;

import br.net.gvt.efika.customer.EfikaCustomer;
import br.net.gvt.efika.customer.InventarioRede;
import java.util.List;
import model.fulltest.operacional.CustomerMock;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import telecom.properties.DeviceMAC;
import telecom.properties.Profile;
import telecom.properties.VlanBanda;
import telecom.properties.VlanMulticast;
import telecom.properties.VlanVod;
import telecom.properties.VlanVoip;
import telecom.properties.metalico.Modulacao;
import telecom.properties.metalico.TabelaParametrosMetalico;
import telecom.velocidade.VelocidadeVendor;
import telecom.velocidade.Velocidades;


/**
 *
 * @author G0041775
 */
public class KeymileMetalicoSuadDslamIT {

    public KeymileMetalicoSuadDslamIT() {
    }

    private static EfikaCustomer cust = CustomerMock.getCustomer("4130886762");
    private static KeymileMetalicoSuadDslam instance = new KeymileMetalicoSuad3(cust.getRede().getIpDslam());
    private static InventarioRede i = cust.getRede();

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
     * Test of getTabelaParametros method, of class KeymileMetalicoSuadDslam.
     */
    @Test
    public void testGetTabelaParametros() throws Exception {
        System.out.println("getTabelaParametros");
        InventarioRede i = null;
        KeymileMetalicoSuadDslam instance = null;
        TabelaParametrosMetalico expResult = null;
        TabelaParametrosMetalico result = instance.getTabelaParametros(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVlanBanda method, of class KeymileMetalicoSuadDslam.
     */
    @Test
    public void testGetVlanBanda() throws Exception {
        System.out.println("getVlanBanda");
        InventarioRede i = null;
        KeymileMetalicoSuadDslam instance = null;
        VlanBanda expResult = null;
        VlanBanda result = instance.getVlanBanda(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVlanVoip method, of class KeymileMetalicoSuadDslam.
     */
    @Test
    public void testGetVlanVoip() throws Exception {
        System.out.println("getVlanVoip");
        InventarioRede i = null;
        KeymileMetalicoSuadDslam instance = null;
        VlanVoip expResult = null;
        VlanVoip result = instance.getVlanVoip(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVlanVod method, of class KeymileMetalicoSuadDslam.
     */
    @Test
    public void testGetVlanVod() throws Exception {
        System.out.println("getVlanVod");
        VlanVod result = instance.getVlanVod(i);

        assertTrue(result.validar(cust));
    }

    /**
     * Test of getVlanMulticast method, of class KeymileMetalicoSuadDslam.
     */
    @Test
    public void testGetVlanMulticast() throws Exception {
        System.out.println("getVlanMulticast");
        VlanMulticast result = instance.getVlanMulticast(i);

        assertTrue(result.validar(cust));
    }

    /**
     * Test of getProfile method, of class KeymileMetalicoSuadDslam.
     */
    @Test
    public void testGetProfile() throws Exception {
        System.out.println("getProfile");
        Profile result = instance.getProfile(i);

    }

    /**
     * Test of getModulacao method, of class KeymileMetalicoSuadDslam.
     */
    @Test
    public void testGetModulacao() throws Exception {
        System.out.println("getModulacao");
        Modulacao result = instance.getModulacao(i);

        assertTrue(result.validar(cust));
    }

    /**
     * Test of setProfileDown method, of class KeymileMetalicoSuadDslam.
     */
    @Test
    public void testSetProfileDown() throws Exception {
        System.out.println("setProfileDown");
        InventarioRede i = null;
        Velocidades v = null;
        KeymileMetalicoSuadDslam instance = null;
        instance.setProfileDown(i, v);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProfileUp method, of class KeymileMetalicoSuadDslam.
     */
    @Test
    public void testSetProfileUp() throws Exception {
        System.out.println("setProfileUp");
        InventarioRede i = null;
        Velocidades vDown = null;
        Velocidades vUp = null;
        KeymileMetalicoSuadDslam instance = null;
        instance.setProfileUp(i, vDown, vUp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModulacao method, of class KeymileMetalicoSuadDslam.
     */
    @Test
    public void testSetModulacao() throws Exception {
        System.out.println("setModulacao");
        InventarioRede i = null;
        Velocidades v = null;
        KeymileMetalicoSuadDslam instance = null;
        Modulacao expResult = null;
        Modulacao result = instance.setModulacao(i, v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createVlanBanda method, of class KeymileMetalicoSuadDslam.
     */
    @Test
    public void testCreateVlanBanda() throws Exception {
        System.out.println("createVlanBanda");
        InventarioRede i = null;
        Velocidades vDown = null;
        Velocidades vUp = null;
        KeymileMetalicoSuadDslam instance = null;
        VlanBanda expResult = null;
        VlanBanda result = instance.createVlanBanda(i, vDown, vUp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createVlanVoip method, of class KeymileMetalicoSuadDslam.
     */
    @Test
    public void testCreateVlanVoip() throws Exception {
        System.out.println("createVlanVoip");
        InventarioRede i = null;
        KeymileMetalicoSuadDslam instance = null;
        VlanVoip expResult = null;
        VlanVoip result = instance.createVlanVoip(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createVlanVod method, of class KeymileMetalicoSuadDslam.
     */
    @Test
    public void testCreateVlanVod() throws Exception {
        System.out.println("createVlanVod");
        InventarioRede i = null;
        KeymileMetalicoSuadDslam instance = null;
        VlanVod expResult = null;
        VlanVod result = instance.createVlanVod(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createVlanMulticast method, of class KeymileMetalicoSuadDslam.
     */
    @Test
    public void testCreateVlanMulticast() throws Exception {
        System.out.println("createVlanMulticast");
        InventarioRede i = null;
        KeymileMetalicoSuadDslam instance = null;
        VlanMulticast expResult = null;
        VlanMulticast result = instance.createVlanMulticast(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteVlanBanda method, of class KeymileMetalicoSuadDslam.
     */
    @Test
    public void testDeleteVlanBanda() throws Exception {
        System.out.println("deleteVlanBanda");
        InventarioRede i = null;
        KeymileMetalicoSuadDslam instance = null;
        instance.deleteVlanBanda(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteVlanVoip method, of class KeymileMetalicoSuadDslam.
     */
    @Test
    public void testDeleteVlanVoip() throws Exception {
        System.out.println("deleteVlanVoip");
        InventarioRede i = null;
        KeymileMetalicoSuadDslam instance = null;
        instance.deleteVlanVoip(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteVlanVod method, of class KeymileMetalicoSuadDslam.
     */
    @Test
    public void testDeleteVlanVod() throws Exception {
        System.out.println("deleteVlanVod");
        InventarioRede i = null;
        KeymileMetalicoSuadDslam instance = null;
        instance.deleteVlanVod(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteVlanMulticast method, of class KeymileMetalicoSuadDslam.
     */
    @Test
    public void testDeleteVlanMulticast() throws Exception {
        System.out.println("deleteVlanMulticast");
        InventarioRede i = null;
        KeymileMetalicoSuadDslam instance = null;
        instance.deleteVlanMulticast(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obterVelocidadesDownVendor method, of class
     * KeymileMetalicoSuadDslam.
     */
    @Test
    public void testObterVelocidadesDownVendor() {
        System.out.println("obterVelocidadesDownVendor");
        KeymileMetalicoSuadDslam instance = null;
        List<VelocidadeVendor> expResult = null;
        List<VelocidadeVendor> result = instance.obterVelocidadesDownVendor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obterVelocidadesUpVendor method, of class
     * KeymileMetalicoSuadDslam.
     */
    @Test
    public void testObterVelocidadesUpVendor() {
        System.out.println("obterVelocidadesUpVendor");
        KeymileMetalicoSuadDslam instance = null;
        List<VelocidadeVendor> expResult = null;
        List<VelocidadeVendor> result = instance.obterVelocidadesUpVendor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of castProfile method, of class KeymileMetalicoSuadDslam.
     */
    @Test
    public void testCastProfile() {
        System.out.println("castProfile");
        Velocidades v = null;
        KeymileMetalicoSuadDslam instance = null;
        Profile expResult = null;
        Profile result = instance.castProfile(v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of castModulacao method, of class KeymileMetalicoSuadDslam.
     */
    @Test
    public void testCastModulacao() {
        System.out.println("castModulacao");
        Velocidades v = null;
        KeymileMetalicoSuadDslam instance = null;
        Modulacao expResult = null;
        Modulacao result = instance.castModulacao(v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeviceMac method, of class KeymileMetalicoSuadDslam.
     */
    @Test
    public void testGetDeviceMac() throws Exception {
        System.out.println("getDeviceMac");
        DeviceMAC result = instance.getDeviceMac(i);

        assertTrue(result.validar(cust));
    }

}
