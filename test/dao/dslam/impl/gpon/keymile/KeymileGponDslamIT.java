/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.gpon.keymile;

import br.net.gvt.efika.customer.InventarioRede;
import dao.dslam.impl.ComandoDslam;
import java.util.List;
import model.dslam.consulta.DeviceMAC;
import model.dslam.consulta.EstadoDaPorta;
import model.dslam.consulta.Porta;
import model.dslam.consulta.Profile;
import model.dslam.consulta.VlanBanda;
import model.dslam.consulta.VlanMulticast;
import model.dslam.consulta.VlanVod;
import model.dslam.consulta.VlanVoip;
import model.dslam.consulta.gpon.AlarmesGpon;
import model.dslam.consulta.gpon.SerialOntGpon;
import model.dslam.consulta.gpon.TabelaParametrosGpon;
import model.dslam.velocidade.VelocidadeVendor;
import model.dslam.velocidade.Velocidades;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author G0041775
 */
public class KeymileGponDslamIT {
    
    public KeymileGponDslamIT() {
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
     * Test of getComandoPotOlt method, of class KeymileGponDslam.
     */
    @Test
    public void testGetComandoPotOlt() {
        System.out.println("getComandoPotOlt");
        InventarioRede i = null;
        KeymileGponDslam instance = null;
        ComandoDslam expResult = null;
        ComandoDslam result = instance.getComandoPotOlt(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComandoPotOnt method, of class KeymileGponDslam.
     */
    @Test
    public void testGetComandoPotOnt() {
        System.out.println("getComandoPotOnt");
        InventarioRede i = null;
        KeymileGponDslam instance = null;
        ComandoDslam expResult = null;
        ComandoDslam result = instance.getComandoPotOnt(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTabelaParametros method, of class KeymileGponDslam.
     */
    @Test
    public void testGetTabelaParametros() throws Exception {
        System.out.println("getTabelaParametros");
        InventarioRede i = null;
        KeymileGponDslam instance = null;
        TabelaParametrosGpon expResult = null;
        TabelaParametrosGpon result = instance.getTabelaParametros(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComandoSerialOnt method, of class KeymileGponDslam.
     */
    @Test
    public void testGetComandoSerialOnt() {
        System.out.println("getComandoSerialOnt");
        InventarioRede i = null;
        KeymileGponDslam instance = null;
        ComandoDslam expResult = null;
        ComandoDslam result = instance.getComandoSerialOnt(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComandoListaShelf method, of class KeymileGponDslam.
     */
    @Test
    public void testGetComandoListaShelf() {
        System.out.println("getComandoListaShelf");
        InventarioRede i = null;
        KeymileGponDslam instance = null;
        ComandoDslam expResult = null;
        ComandoDslam result = instance.getComandoListaShelf(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSerialOnt method, of class KeymileGponDslam.
     */
    @Test
    public void testGetSerialOnt() throws Exception {
        System.out.println("getSerialOnt");
        InventarioRede i = null;
        KeymileGponDslam instance = null;
        SerialOntGpon expResult = null;
        SerialOntGpon result = instance.getSerialOnt(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComandoConsultaEstadoAdminDaPorta method, of class KeymileGponDslam.
     */
    @Test
    public void testGetComandoConsultaEstadoAdminDaPorta() {
        System.out.println("getComandoConsultaEstadoAdminDaPorta");
        InventarioRede i = null;
        KeymileGponDslam instance = null;
        ComandoDslam expResult = null;
        ComandoDslam result = instance.getComandoConsultaEstadoAdminDaPorta(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComandoConsultaEstadoOperDaPorta method, of class KeymileGponDslam.
     */
    @Test
    public void testGetComandoConsultaEstadoOperDaPorta() {
        System.out.println("getComandoConsultaEstadoOperDaPorta");
        InventarioRede i = null;
        KeymileGponDslam instance = null;
        ComandoDslam expResult = null;
        ComandoDslam result = instance.getComandoConsultaEstadoOperDaPorta(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstadoDaPorta method, of class KeymileGponDslam.
     */
    @Test
    public void testGetEstadoDaPorta() throws Exception {
        System.out.println("getEstadoDaPorta");
        InventarioRede i = null;
        KeymileGponDslam instance = null;
        EstadoDaPorta expResult = null;
        EstadoDaPorta result = instance.getEstadoDaPorta(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComandoConsultaVlanBanda1 method, of class KeymileGponDslam.
     */
    @Test
    public void testGetComandoConsultaVlanBanda1() {
        System.out.println("getComandoConsultaVlanBanda1");
        InventarioRede i = null;
        KeymileGponDslam instance = null;
        ComandoDslam expResult = null;
        ComandoDslam result = instance.getComandoConsultaVlanBanda1(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComandoConsultaStatusVlanBanda method, of class KeymileGponDslam.
     */
    @Test
    public void testGetComandoConsultaStatusVlanBanda() {
        System.out.println("getComandoConsultaStatusVlanBanda");
        InventarioRede i = null;
        KeymileGponDslam instance = null;
        ComandoDslam expResult = null;
        ComandoDslam result = instance.getComandoConsultaStatusVlanBanda(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComandoConsultaVlan2 method, of class KeymileGponDslam.
     */
    @Test
    public void testGetComandoConsultaVlan2() {
        System.out.println("getComandoConsultaVlan2");
        String srvc = "";
        KeymileGponDslam instance = null;
        ComandoDslam expResult = null;
        ComandoDslam result = instance.getComandoConsultaVlan2(srvc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVlanBanda method, of class KeymileGponDslam.
     */
    @Test
    public void testGetVlanBanda() throws Exception {
        System.out.println("getVlanBanda");
        InventarioRede i = null;
        KeymileGponDslam instance = null;
        VlanBanda expResult = null;
        VlanBanda result = instance.getVlanBanda(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComandoConsultaVlanVoip1 method, of class KeymileGponDslam.
     */
    @Test
    public void testGetComandoConsultaVlanVoip1() {
        System.out.println("getComandoConsultaVlanVoip1");
        InventarioRede i = null;
        KeymileGponDslam instance = null;
        ComandoDslam expResult = null;
        ComandoDslam result = instance.getComandoConsultaVlanVoip1(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComandoConsultaStatusVlanVoip method, of class KeymileGponDslam.
     */
    @Test
    public void testGetComandoConsultaStatusVlanVoip() {
        System.out.println("getComandoConsultaStatusVlanVoip");
        InventarioRede i = null;
        KeymileGponDslam instance = null;
        ComandoDslam expResult = null;
        ComandoDslam result = instance.getComandoConsultaStatusVlanVoip(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVlanVoip method, of class KeymileGponDslam.
     */
    @Test
    public void testGetVlanVoip() throws Exception {
        System.out.println("getVlanVoip");
        InventarioRede i = null;
        KeymileGponDslam instance = null;
        VlanVoip expResult = null;
        VlanVoip result = instance.getVlanVoip(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComandoConsultaVlanVod1 method, of class KeymileGponDslam.
     */
    @Test
    public void testGetComandoConsultaVlanVod1() {
        System.out.println("getComandoConsultaVlanVod1");
        InventarioRede i = null;
        KeymileGponDslam instance = null;
        ComandoDslam expResult = null;
        ComandoDslam result = instance.getComandoConsultaVlanVod1(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComandoConsultaStatusVlanVod method, of class KeymileGponDslam.
     */
    @Test
    public void testGetComandoConsultaStatusVlanVod() {
        System.out.println("getComandoConsultaStatusVlanVod");
        InventarioRede i = null;
        KeymileGponDslam instance = null;
        ComandoDslam expResult = null;
        ComandoDslam result = instance.getComandoConsultaStatusVlanVod(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVlanVod method, of class KeymileGponDslam.
     */
    @Test
    public void testGetVlanVod() throws Exception {
        System.out.println("getVlanVod");
        InventarioRede i = null;
        KeymileGponDslam instance = null;
        VlanVod expResult = null;
        VlanVod result = instance.getVlanVod(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComandoConsultaVlanMulticast1 method, of class KeymileGponDslam.
     */
    @Test
    public void testGetComandoConsultaVlanMulticast1() {
        System.out.println("getComandoConsultaVlanMulticast1");
        InventarioRede i = null;
        KeymileGponDslam instance = null;
        ComandoDslam expResult = null;
        ComandoDslam result = instance.getComandoConsultaVlanMulticast1(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVlanMulticast method, of class KeymileGponDslam.
     */
    @Test
    public void testGetVlanMulticast() throws Exception {
        System.out.println("getVlanMulticast");
        InventarioRede i = null;
        KeymileGponDslam instance = null;
        VlanMulticast expResult = null;
        VlanMulticast result = instance.getVlanMulticast(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComandoConsultaAlarmes method, of class KeymileGponDslam.
     */
    @Test
    public void testGetComandoConsultaAlarmes() {
        System.out.println("getComandoConsultaAlarmes");
        InventarioRede i = null;
        KeymileGponDslam instance = null;
        ComandoDslam expResult = null;
        ComandoDslam result = instance.getComandoConsultaAlarmes(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAlarmes method, of class KeymileGponDslam.
     */
    @Test
    public void testGetAlarmes() throws Exception {
        System.out.println("getAlarmes");
        InventarioRede i = null;
        KeymileGponDslam instance = null;
        AlarmesGpon expResult = null;
        AlarmesGpon result = instance.getAlarmes(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComandoConsultaProfileUp method, of class KeymileGponDslam.
     */
    @Test
    public void testGetComandoConsultaProfileUp() {
        System.out.println("getComandoConsultaProfileUp");
        InventarioRede i = null;
        KeymileGponDslam instance = null;
        ComandoDslam expResult = null;
        ComandoDslam result = instance.getComandoConsultaProfileUp(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComandoConsultaProfileDown method, of class KeymileGponDslam.
     */
    @Test
    public void testGetComandoConsultaProfileDown() {
        System.out.println("getComandoConsultaProfileDown");
        InventarioRede i = null;
        KeymileGponDslam instance = null;
        ComandoDslam expResult = null;
        ComandoDslam result = instance.getComandoConsultaProfileDown(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProfile method, of class KeymileGponDslam.
     */
    @Test
    public void testGetProfile() throws Exception {
        System.out.println("getProfile");
        InventarioRede i = null;
        KeymileGponDslam instance = null;
        Profile expResult = null;
        Profile result = instance.getProfile(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obterVelocidadesDownVendor method, of class KeymileGponDslam.
     */
    @Test
    public void testObterVelocidadesDownVendor() {
        System.out.println("obterVelocidadesDownVendor");
        KeymileGponDslam instance = null;
        List<VelocidadeVendor> expResult = null;
        List<VelocidadeVendor> result = instance.obterVelocidadesDownVendor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obterVelocidadesUpVendor method, of class KeymileGponDslam.
     */
    @Test
    public void testObterVelocidadesUpVendor() {
        System.out.println("obterVelocidadesUpVendor");
        KeymileGponDslam instance = null;
        List<VelocidadeVendor> expResult = null;
        List<VelocidadeVendor> result = instance.obterVelocidadesUpVendor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComandoConsultaOnuTable method, of class KeymileGponDslam.
     */
    @Test
    public void testGetComandoConsultaOnuTable() {
        System.out.println("getComandoConsultaOnuTable");
        InventarioRede i = null;
        KeymileGponDslam instance = null;
        ComandoDslam expResult = null;
        ComandoDslam result = instance.getComandoConsultaOnuTable(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeviceMac method, of class KeymileGponDslam.
     */
    @Test
    public void testGetDeviceMac() throws Exception {
        System.out.println("getDeviceMac");
        InventarioRede i = null;
        KeymileGponDslam instance = null;
        DeviceMAC expResult = null;
        DeviceMAC result = instance.getDeviceMac(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComandoSetOntToOlt method, of class KeymileGponDslam.
     */
    @Test
    public void testGetComandoSetOntToOlt() {
        System.out.println("getComandoSetOntToOlt");
        InventarioRede i = null;
        SerialOntGpon s = null;
        Velocidades vUp = null;
        KeymileGponDslam instance = null;
        ComandoDslam expResult = null;
        ComandoDslam result = instance.getComandoSetOntToOlt(i, s, vUp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOntToOlt method, of class KeymileGponDslam.
     */
    @Test
    public void testSetOntToOlt() throws Exception {
        System.out.println("setOntToOlt");
        InventarioRede i = null;
        SerialOntGpon s = null;
        KeymileGponDslam instance = null;
        SerialOntGpon expResult = null;
        SerialOntGpon result = instance.setOntToOlt(i, s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComandoSetEstadoDaPorta method, of class KeymileGponDslam.
     */
    @Test
    public void testGetComandoSetEstadoDaPorta() {
        System.out.println("getComandoSetEstadoDaPorta");
        InventarioRede i = null;
        EstadoDaPorta e = null;
        KeymileGponDslam instance = null;
        ComandoDslam expResult = null;
        ComandoDslam result = instance.getComandoSetEstadoDaPorta(i, e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstadoDaPorta method, of class KeymileGponDslam.
     */
    @Test
    public void testSetEstadoDaPorta() throws Exception {
        System.out.println("setEstadoDaPorta");
        InventarioRede i = null;
        EstadoDaPorta e = null;
        KeymileGponDslam instance = null;
        EstadoDaPorta expResult = null;
        EstadoDaPorta result = instance.setEstadoDaPorta(i, e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComandoSetMacSourceFilteringMode method, of class KeymileGponDslam.
     */
    @Test
    public void testGetComandoSetMacSourceFilteringMode() {
        System.out.println("getComandoSetMacSourceFilteringMode");
        InventarioRede i = null;
        String intrf = "";
        String mode = "";
        KeymileGponDslam instance = null;
        ComandoDslam expResult = null;
        ComandoDslam result = instance.getComandoSetMacSourceFilteringMode(i, intrf, mode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComandoCreateVlanBanda method, of class KeymileGponDslam.
     */
    @Test
    public void testGetComandoCreateVlanBanda() {
        System.out.println("getComandoCreateVlanBanda");
        InventarioRede i = null;
        KeymileGponDslam instance = null;
        ComandoDslam expResult = null;
        ComandoDslam result = instance.getComandoCreateVlanBanda(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createVlanBanda method, of class KeymileGponDslam.
     */
    @Test
    public void testCreateVlanBanda() throws Exception {
        System.out.println("createVlanBanda");
        InventarioRede i = null;
        Velocidades vDown = null;
        Velocidades vUp = null;
        KeymileGponDslam instance = null;
        VlanBanda expResult = null;
        VlanBanda result = instance.createVlanBanda(i, vDown, vUp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComandoCreateVlanVoip method, of class KeymileGponDslam.
     */
    @Test
    public void testGetComandoCreateVlanVoip() {
        System.out.println("getComandoCreateVlanVoip");
        InventarioRede i = null;
        KeymileGponDslam instance = null;
        ComandoDslam expResult = null;
        ComandoDslam result = instance.getComandoCreateVlanVoip(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createVlanVoip method, of class KeymileGponDslam.
     */
    @Test
    public void testCreateVlanVoip() throws Exception {
        System.out.println("createVlanVoip");
        InventarioRede i = null;
        KeymileGponDslam instance = null;
        VlanVoip expResult = null;
        VlanVoip result = instance.createVlanVoip(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComandoCreateVlanVod method, of class KeymileGponDslam.
     */
    @Test
    public void testGetComandoCreateVlanVod() {
        System.out.println("getComandoCreateVlanVod");
        InventarioRede i = null;
        KeymileGponDslam instance = null;
        ComandoDslam expResult = null;
        ComandoDslam result = instance.getComandoCreateVlanVod(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createVlanVod method, of class KeymileGponDslam.
     */
    @Test
    public void testCreateVlanVod() throws Exception {
        System.out.println("createVlanVod");
        InventarioRede i = null;
        KeymileGponDslam instance = null;
        VlanVod expResult = null;
        VlanVod result = instance.createVlanVod(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComandoCreateVlanMulticast method, of class KeymileGponDslam.
     */
    @Test
    public void testGetComandoCreateVlanMulticast() {
        System.out.println("getComandoCreateVlanMulticast");
        InventarioRede i = null;
        KeymileGponDslam instance = null;
        ComandoDslam expResult = null;
        ComandoDslam result = instance.getComandoCreateVlanMulticast(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createVlanMulticast method, of class KeymileGponDslam.
     */
    @Test
    public void testCreateVlanMulticast() throws Exception {
        System.out.println("createVlanMulticast");
        InventarioRede i = null;
        KeymileGponDslam instance = null;
        VlanMulticast expResult = null;
        VlanMulticast result = instance.createVlanMulticast(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComandoUnsetOntFromOlt method, of class KeymileGponDslam.
     */
    @Test
    public void testGetComandoUnsetOntFromOlt() {
        System.out.println("getComandoUnsetOntFromOlt");
        InventarioRede i = null;
        KeymileGponDslam instance = null;
        ComandoDslam expResult = null;
        ComandoDslam result = instance.getComandoUnsetOntFromOlt(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unsetOntFromOlt method, of class KeymileGponDslam.
     */
    @Test
    public void testUnsetOntFromOlt() throws Exception {
        System.out.println("unsetOntFromOlt");
        InventarioRede i = null;
        KeymileGponDslam instance = null;
        instance.unsetOntFromOlt(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComandoGetSrvc method, of class KeymileGponDslam.
     */
    @Test
    public void testGetComandoGetSrvc() {
        System.out.println("getComandoGetSrvc");
        InventarioRede i = null;
        String intrf = "";
        KeymileGponDslam instance = null;
        ComandoDslam expResult = null;
        ComandoDslam result = instance.getComandoGetSrvc(i, intrf);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComandoDeleteVlan method, of class KeymileGponDslam.
     */
    @Test
    public void testGetComandoDeleteVlan() {
        System.out.println("getComandoDeleteVlan");
        String srvc = "";
        KeymileGponDslam instance = null;
        ComandoDslam expResult = null;
        ComandoDslam result = instance.getComandoDeleteVlan(srvc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComandoDeleteMulticast method, of class KeymileGponDslam.
     */
    @Test
    public void testGetComandoDeleteMulticast() {
        System.out.println("getComandoDeleteMulticast");
        String srvc = "";
        KeymileGponDslam instance = null;
        ComandoDslam expResult = null;
        ComandoDslam result = instance.getComandoDeleteMulticast(srvc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteVlanBanda method, of class KeymileGponDslam.
     */
    @Test
    public void testDeleteVlanBanda() throws Exception {
        System.out.println("deleteVlanBanda");
        InventarioRede i = null;
        KeymileGponDslam instance = null;
        instance.deleteVlanBanda(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteVlanVoip method, of class KeymileGponDslam.
     */
    @Test
    public void testDeleteVlanVoip() throws Exception {
        System.out.println("deleteVlanVoip");
        InventarioRede i = null;
        KeymileGponDslam instance = null;
        instance.deleteVlanVoip(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteVlanVod method, of class KeymileGponDslam.
     */
    @Test
    public void testDeleteVlanVod() throws Exception {
        System.out.println("deleteVlanVod");
        InventarioRede i = null;
        KeymileGponDslam instance = null;
        instance.deleteVlanVod(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteVlanMulticast method, of class KeymileGponDslam.
     */
    @Test
    public void testDeleteVlanMulticast() throws Exception {
        System.out.println("deleteVlanMulticast");
        InventarioRede i = null;
        KeymileGponDslam instance = null;
        instance.deleteVlanMulticast(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComandoSetProfileDown method, of class KeymileGponDslam.
     */
    @Test
    public void testGetComandoSetProfileDown() {
        System.out.println("getComandoSetProfileDown");
        InventarioRede i = null;
        Velocidades v = null;
        KeymileGponDslam instance = null;
        ComandoDslam expResult = null;
        ComandoDslam result = instance.getComandoSetProfileDown(i, v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProfileDown method, of class KeymileGponDslam.
     */
    @Test
    public void testSetProfileDown() throws Exception {
        System.out.println("setProfileDown");
        InventarioRede i = null;
        Velocidades v = null;
        KeymileGponDslam instance = null;
        instance.setProfileDown(i, v);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProfileUp method, of class KeymileGponDslam.
     */
    @Test
    public void testSetProfileUp() throws Exception {
        System.out.println("setProfileUp");
        InventarioRede i = null;
        Velocidades vDown = null;
        Velocidades vUp = null;
        KeymileGponDslam instance = null;
        instance.setProfileUp(i, vDown, vUp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComandoGetSlotsAvailableOnts method, of class KeymileGponDslam.
     */
    @Test
    public void testGetComandoGetSlotsAvailableOnts() {
        System.out.println("getComandoGetSlotsAvailableOnts");
        InventarioRede i = null;
        String slot = "";
        KeymileGponDslam instance = null;
        ComandoDslam expResult = null;
        ComandoDslam result = instance.getComandoGetSlotsAvailableOnts(i, slot);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSlotsAvailableOnts method, of class KeymileGponDslam.
     */
    @Test
    public void testGetSlotsAvailableOnts() throws Exception {
        System.out.println("getSlotsAvailableOnts");
        InventarioRede i = null;
        KeymileGponDslam instance = null;
        List<SerialOntGpon> expResult = null;
        List<SerialOntGpon> result = instance.getSlotsAvailableOnts(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstadoPortasProximas method, of class KeymileGponDslam.
     */
    @Test
    public void testGetEstadoPortasProximas() throws Exception {
        System.out.println("getEstadoPortasProximas");
        InventarioRede i = null;
        KeymileGponDslam instance = null;
        List<Porta> expResult = null;
        List<Porta> result = instance.getEstadoPortasProximas(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
