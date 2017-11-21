/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.metalico.zhone;

import br.net.gvt.efika.customer.EfikaCustomer;
import br.net.gvt.efika.customer.InventarioRede;
import java.util.List;
import model.dslam.consulta.EstadoDaPorta;
import model.dslam.consulta.Profile;
import model.dslam.consulta.VlanBanda;
import model.dslam.consulta.VlanMulticast;
import model.dslam.consulta.VlanVod;
import model.dslam.consulta.VlanVoip;
import model.dslam.consulta.metalico.Modulacao;
import model.dslam.consulta.metalico.TabelaParametrosMetalico;
import model.dslam.consulta.metalico.TabelaRedeMetalico;
import model.dslam.velocidade.VelocidadeVendor;
import model.dslam.velocidade.Velocidades;
import model.fulltest.operacional.CustomerMock;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import util.GsonUtil;

/**
 *
 * @author G0041775
 */
public class ZhoneMetalicoMxkDslamIT {

    public ZhoneMetalicoMxkDslamIT() {
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
    private static EfikaCustomer cust = CustomerMock.getCustomer("1124088283");
    private static ZhoneMetalicoMxkDslam instance = new ZhoneMetalicoMxkDslam(cust.getRede().getIpDslam());
    private static InventarioRede i = cust.getRede();

    /**
     * Test of getTabelaParametros method, of class ZhoneMetalicoMxkDslam.
     */
    @Test
    public void testGetTabelaParametros() throws Exception {
        System.out.println("getTabelaParametros");
        InventarioRede i = null;
        ZhoneMetalicoMxkDslam instance = null;
        TabelaParametrosMetalico expResult = null;
        TabelaParametrosMetalico result = instance.getTabelaParametros(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTabelaRede method, of class ZhoneMetalicoMxkDslam.
     */
    @Test
    public void testGetTabelaRede() throws Exception {
        System.out.println("getTabelaRede");
        InventarioRede i = null;
        ZhoneMetalicoMxkDslam instance = null;
        TabelaRedeMetalico expResult = null;
        TabelaRedeMetalico result = instance.getTabelaRede(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstadoDaPorta method, of class ZhoneMetalicoMxkDslam.
     */
    @Test
    public void testGetEstadoDaPorta() throws Exception {
        System.out.println("getEstadoDaPorta");
        InventarioRede i = null;
        ZhoneMetalicoMxkDslam instance = null;
        EstadoDaPorta expResult = null;
        EstadoDaPorta result = instance.getEstadoDaPorta(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVlanBanda method, of class ZhoneMetalicoMxkDslam.
     */
    @Test
    public void testGetVlanBanda() throws Exception {
        System.out.println("getVlanBanda");
        VlanBanda result = instance.getVlanBanda(i);
        System.out.println(GsonUtil.serialize(result));
        assertTrue(result.getCvlan() != 0);
    }

    /**
     * Test of obterVelocidadesUpVendor method, of class ZhoneMetalicoMxkDslam.
     */
    @Test
    public void testObterVelocidadesUpVendor() {
        System.out.println("obterVelocidadesUpVendor");
        ZhoneMetalicoMxkDslam instance = null;
        List<VelocidadeVendor> expResult = null;
        List<VelocidadeVendor> result = instance.obterVelocidadesUpVendor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obterVelocidadesDownVendor method, of class
     * ZhoneMetalicoMxkDslam.
     */
    @Test
    public void testObterVelocidadesDownVendor() {
        System.out.println("obterVelocidadesDownVendor");
        ZhoneMetalicoMxkDslam instance = null;
        List<VelocidadeVendor> expResult = null;
        List<VelocidadeVendor> result = instance.obterVelocidadesDownVendor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVlanVoip method, of class ZhoneMetalicoMxkDslam.
     */
    @Test
    public void testGetVlanVoip() throws Exception {
        System.out.println("getVlanVoip");
        InventarioRede i = null;
        ZhoneMetalicoMxkDslam instance = null;
        VlanVoip expResult = null;
        VlanVoip result = instance.getVlanVoip(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVlanVod method, of class ZhoneMetalicoMxkDslam.
     */
    @Test
    public void testGetVlanVod() throws Exception {
        System.out.println("getVlanVod");
        InventarioRede i = null;
        ZhoneMetalicoMxkDslam instance = null;
        VlanVod expResult = null;
        VlanVod result = instance.getVlanVod(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVlanMulticast method, of class ZhoneMetalicoMxkDslam.
     */
    @Test
    public void testGetVlanMulticast() throws Exception {
        System.out.println("getVlanMulticast");
        InventarioRede i = null;
        ZhoneMetalicoMxkDslam instance = null;
        VlanMulticast expResult = null;
        VlanMulticast result = instance.getVlanMulticast(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProfile method, of class ZhoneMetalicoMxkDslam.
     */
    @Test
    public void testGetProfile() throws Exception {
        System.out.println("getProfile");

        Profile result = instance.getProfile(i);
        System.out.println(GsonUtil.serialize(result));

    }

    /**
     * Test of getModulacao method, of class ZhoneMetalicoMxkDslam.
     */
    @Test
    public void testGetModulacao() throws Exception {
        System.out.println("getModulacao");
        Modulacao result = instance.getModulacao(i);
        System.out.println(GsonUtil.serialize(result));
        assertTrue(result.validar(cust));
    }

    /**
     * Test of setModulacao method, of class ZhoneMetalicoMxkDslam.
     */
    @Test
    public void testSetModulacao() throws Exception {
        System.out.println("setModulacao");
        InventarioRede i = null;
        Velocidades v = null;
        ZhoneMetalicoMxkDslam instance = null;
        Modulacao expResult = null;
        Modulacao result = instance.setModulacao(i, v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstadoDaPorta method, of class ZhoneMetalicoMxkDslam.
     */
    @Test
    public void testSetEstadoDaPorta() throws Exception {
        System.out.println("setEstadoDaPorta");
        InventarioRede i = null;
        EstadoDaPorta e = null;
        ZhoneMetalicoMxkDslam instance = null;
        EstadoDaPorta expResult = null;
        EstadoDaPorta result = instance.setEstadoDaPorta(i, e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProfileDown method, of class ZhoneMetalicoMxkDslam.
     */
    @Test
    public void testSetProfileDown() throws Exception {
        System.out.println("setProfileDown");
        InventarioRede i = null;
        Velocidades v = null;
        ZhoneMetalicoMxkDslam instance = null;
        instance.setProfileDown(i, v);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProfileUp method, of class ZhoneMetalicoMxkDslam.
     */
    @Test
    public void testSetProfileUp() throws Exception {
        System.out.println("setProfileUp");
        InventarioRede i = null;
        Velocidades vDown = null;
        Velocidades vUp = null;
        ZhoneMetalicoMxkDslam instance = null;
        instance.setProfileUp(i, vDown, vUp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createVlanBanda method, of class ZhoneMetalicoMxkDslam.
     */
    @Test
    public void testCreateVlanBanda() throws Exception {
        System.out.println("createVlanBanda");
        VlanBanda result = instance.createVlanBanda(i, Velocidades.find(cust.getServicos().getVelDown()), Velocidades.find(cust.getServicos().getVelUp()));
        GsonUtil.serialize(result);
    }

    /**
     * Test of createVlanVoip method, of class ZhoneMetalicoMxkDslam.
     */
    @Test
    public void testCreateVlanVoip() throws Exception {
        System.out.println("createVlanVoip");
        InventarioRede i = null;
        ZhoneMetalicoMxkDslam instance = null;
        VlanVoip expResult = null;
        VlanVoip result = instance.createVlanVoip(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createVlanVod method, of class ZhoneMetalicoMxkDslam.
     */
    @Test
    public void testCreateVlanVod() throws Exception {
        System.out.println("createVlanVod");
        InventarioRede i = null;
        ZhoneMetalicoMxkDslam instance = null;
        VlanVod expResult = null;
        VlanVod result = instance.createVlanVod(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createVlanMulticast method, of class ZhoneMetalicoMxkDslam.
     */
    @Test
    public void testCreateVlanMulticast() throws Exception {
        System.out.println("createVlanMulticast");
        InventarioRede i = null;
        ZhoneMetalicoMxkDslam instance = null;
        VlanMulticast expResult = null;
        VlanMulticast result = instance.createVlanMulticast(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteVlanBanda method, of class ZhoneMetalicoMxkDslam.
     */
    @Test
    public void testDeleteVlanBanda() throws Exception {
        System.out.println("deleteVlanBanda");
        InventarioRede i = null;
        ZhoneMetalicoMxkDslam instance = null;
        instance.deleteVlanBanda(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteVlanVoip method, of class ZhoneMetalicoMxkDslam.
     */
    @Test
    public void testDeleteVlanVoip() throws Exception {
        System.out.println("deleteVlanVoip");
        InventarioRede i = null;
        ZhoneMetalicoMxkDslam instance = null;
        instance.deleteVlanVoip(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteVlanVod method, of class ZhoneMetalicoMxkDslam.
     */
    @Test
    public void testDeleteVlanVod() throws Exception {
        System.out.println("deleteVlanVod");
        InventarioRede i = null;
        ZhoneMetalicoMxkDslam instance = null;
        instance.deleteVlanVod(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteVlanMulticast method, of class ZhoneMetalicoMxkDslam.
     */
    @Test
    public void testDeleteVlanMulticast() throws Exception {
        System.out.println("deleteVlanMulticast");
        InventarioRede i = null;
        ZhoneMetalicoMxkDslam instance = null;
        instance.deleteVlanMulticast(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of castModulacao method, of class ZhoneMetalicoMxkDslam.
     */
    @Test
    public void testCastModulacao() {
        System.out.println("castModulacao");
        Velocidades v = null;
        ZhoneMetalicoMxkDslam instance = null;
        Modulacao expResult = null;
        Modulacao result = instance.castModulacao(v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of castProfile method, of class ZhoneMetalicoMxkDslam.
     */
    @Test
    public void testCastProfile() {
        System.out.println("castProfile");
        Velocidades v = null;
        ZhoneMetalicoMxkDslam instance = null;
        Profile expResult = null;
        Profile result = instance.castProfile(v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
