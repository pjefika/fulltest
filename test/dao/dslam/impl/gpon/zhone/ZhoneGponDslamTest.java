/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.gpon.zhone;

import br.net.gvt.efika.customer.EfikaCustomer;
import br.net.gvt.efika.customer.InventarioRede;
import dao.dslam.impl.ComandoDslam;
import model.dslam.consulta.EstadoDaPorta;
import model.dslam.consulta.Profile;
import model.dslam.consulta.VlanBanda;
import model.dslam.consulta.VlanMulticast;
import model.dslam.consulta.VlanVod;
import model.dslam.consulta.VlanVoip;
import model.dslam.consulta.gpon.AlarmesGpon;
import model.dslam.consulta.gpon.SerialOntGpon;
import model.dslam.consulta.gpon.TabelaParametrosGpon;
import model.fulltest.operacional.CustomerMock;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author G0042204
 */
public class ZhoneGponDslamTest {

    private EfikaCustomer cl = CustomerMock.gponZhone();

    public ZhoneGponDslamTest() {

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
     * Test of getTabelaParametros method, of class ZhoneGponDslam.
     */
    @Test
    public void testGetTabelaParametros() throws Exception {
        ZhoneGponDslam instance = new ZhoneGponDslam(cl.getRede().getIpDslam());
        TabelaParametrosGpon result = instance.getTabelaParametros(cl.getRede());
        assertTrue(result.validar(cl));
    }

    /**
     * Test of getComandoSerialOnt method, of class ZhoneGponDslam.
     */
    @Test
    public void testGetComandoSerialOnt() {
        System.out.println("getComandoSerialOnt");
        InventarioRede i = null;
        ZhoneGponDslam instance = null;
        ComandoDslam expResult = null;
        ComandoDslam result = instance.getComandoSerialOnt(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSerialOnt method, of class ZhoneGponDslam.
     */
    @Test
    public void testGetSerialOnt() throws Exception {
        System.out.println("getSerialOnt");
        InventarioRede i = null;
        ZhoneGponDslam instance = null;
        SerialOntGpon expResult = null;
        SerialOntGpon result = instance.getSerialOnt(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComandoConsultaEstadoDaPorta method, of class ZhoneGponDslam.
     */
    @Test
    public void testGetComandoConsultaEstadoDaPorta() {
        System.out.println("getComandoConsultaEstadoDaPorta");
        InventarioRede i = null;
        ZhoneGponDslam instance = null;
        ComandoDslam expResult = null;
        ComandoDslam result = instance.getComandoConsultaEstadoDaPorta(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstadoDaPorta method, of class ZhoneGponDslam.
     */
    @Test
    public void testGetEstadoDaPorta() throws Exception {
        System.out.println("getEstadoDaPorta");
        InventarioRede i = null;
        ZhoneGponDslam instance = null;
        EstadoDaPorta expResult = null;
        EstadoDaPorta result = instance.getEstadoDaPorta(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComandoConsultaVlan method, of class ZhoneGponDslam.
     */
    @Test
    public void testGetComandoConsultaVlan() {
        System.out.println("getComandoConsultaVlan");
        InventarioRede i = null;
        ZhoneGponDslam instance = null;
        ComandoDslam expResult = null;
        ComandoDslam result = instance.getComandoConsultaVlan(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVlanBanda method, of class ZhoneGponDslam.
     */
    @Test
    public void testGetVlanBanda() throws Exception {
        System.out.println("getVlanBanda");
        InventarioRede i = null;
        ZhoneGponDslam instance = null;
        VlanBanda expResult = null;
        VlanBanda result = instance.getVlanBanda(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVlanVoip method, of class ZhoneGponDslam.
     */
    @Test
    public void testGetVlanVoip() throws Exception {
        System.out.println("getVlanVoip");
        InventarioRede i = null;
        ZhoneGponDslam instance = null;
        VlanVoip expResult = null;
        VlanVoip result = instance.getVlanVoip(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVlanVod method, of class ZhoneGponDslam.
     */
    @Test
    public void testGetVlanVod() throws Exception {
        System.out.println("getVlanVod");
        InventarioRede i = null;
        ZhoneGponDslam instance = null;
        VlanVod expResult = null;
        VlanVod result = instance.getVlanVod(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComandoConsultaVlanMulticast method, of class ZhoneGponDslam.
     */
    @Test
    public void testGetComandoConsultaVlanMulticast() {
        System.out.println("getComandoConsultaVlanMulticast");
        InventarioRede i = null;
        ZhoneGponDslam instance = null;
        ComandoDslam expResult = null;
        ComandoDslam result = instance.getComandoConsultaVlanMulticast(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVlanMulticast method, of class ZhoneGponDslam.
     */
    @Test
    public void testGetVlanMulticast() throws Exception {
        System.out.println("getVlanMulticast");
        InventarioRede i = null;
        ZhoneGponDslam instance = null;
        VlanMulticast expResult = null;
        VlanMulticast result = instance.getVlanMulticast(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComandoConsultaAlarmes method, of class ZhoneGponDslam.
     */
    @Test
    public void testGetComandoConsultaAlarmes() {
        System.out.println("getComandoConsultaAlarmes");
        InventarioRede i = null;
        ZhoneGponDslam instance = null;
        ComandoDslam expResult = null;
        ComandoDslam result = instance.getComandoConsultaAlarmes(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAlarmes method, of class ZhoneGponDslam.
     */
    @Test
    public void testGetAlarmes() throws Exception {
        System.out.println("getAlarmes");
        InventarioRede i = null;
        ZhoneGponDslam instance = null;
        AlarmesGpon expResult = null;
        AlarmesGpon result = instance.getAlarmes(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComandoConsultaProfileDown method, of class ZhoneGponDslam.
     */
    @Test
    public void testGetComandoConsultaProfileDown() {
        System.out.println("getComandoConsultaProfileDown");
        InventarioRede i = null;
        ZhoneGponDslam instance = null;
        ComandoDslam expResult = null;
        ComandoDslam result = instance.getComandoConsultaProfileDown(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComandoConsultaProfileUp method, of class ZhoneGponDslam.
     */
    @Test
    public void testGetComandoConsultaProfileUp() {
        System.out.println("getComandoConsultaProfileUp");
        InventarioRede i = null;
        ZhoneGponDslam instance = null;
        ComandoDslam expResult = null;
        ComandoDslam result = instance.getComandoConsultaProfileUp(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProfile method, of class ZhoneGponDslam.
     */
    @Test
    public void testGetProfile() throws Exception {
        System.out.println("getProfile");
        InventarioRede i = null;
        ZhoneGponDslam instance = null;
        Profile expResult = null;
        Profile result = instance.getProfile(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
