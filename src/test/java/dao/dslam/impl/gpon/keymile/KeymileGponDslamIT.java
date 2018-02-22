/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.gpon.keymile;

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
import br.net.gvt.efika.fulltest.model.telecom.velocidade.VelocidadeVendor;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.Velocidades;
import dao.dslam.impl.ComandoDslam;
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
 * @author G0041775
 */
public class KeymileGponDslamIT {

    private KeymileGponDslam instance;

    private EfikaCustomer ec;

    private InventarioRede i;

    public KeymileGponDslamIT() {
        ec = CustomerMock.getCustomer("2730191082");
        i = ec.getRede();
        instance = new KeymileGponDslam(i.getIpDslam());
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

        SerialOntGpon expResult = null;
        SerialOntGpon result = instance.getSerialOnt(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComandoConsultaEstadoAdminDaPorta method, of class
     * KeymileGponDslam.
     */
    @Test
    public void testGetComandoConsultaEstadoAdminDaPorta() {
        System.out.println("getComandoConsultaEstadoAdminDaPorta");

        ComandoDslam expResult = null;
        ComandoDslam result = instance.getComandoConsultaEstadoAdminDaPorta(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComandoConsultaEstadoOperDaPorta method, of class
     * KeymileGponDslam.
     */
    @Test
    public void testGetComandoConsultaEstadoOperDaPorta() {
        System.out.println("getComandoConsultaEstadoOperDaPorta");

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

        ComandoDslam expResult = null;
        ComandoDslam result = instance.getComandoConsultaVlanBanda1(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComandoConsultaStatusVlanBanda method, of class
     * KeymileGponDslam.
     */
    @Test
    public void testGetComandoConsultaStatusVlanBanda() {
        System.out.println("getComandoConsultaStatusVlanBanda");

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

        ComandoDslam expResult = null;
        ComandoDslam result = instance.getComandoConsultaVlanVoip1(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComandoConsultaStatusVlanVoip method, of class
     * KeymileGponDslam.
     */
    @Test
    public void testGetComandoConsultaStatusVlanVoip() {
        System.out.println("getComandoConsultaStatusVlanVoip");

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

        ComandoDslam expResult = null;
        ComandoDslam result = instance.getComandoConsultaVlanVod1(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComandoConsultaStatusVlanVod method, of class
     * KeymileGponDslam.
     */
    @Test
    public void testGetComandoConsultaStatusVlanVod() {
        System.out.println("getComandoConsultaStatusVlanVod");

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

        VlanVod expResult = null;
        VlanVod result = instance.getVlanVod(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComandoConsultaVlanMulticast1 method, of class
     * KeymileGponDslam.
     */
    @Test
    public void testGetComandoConsultaVlanMulticast1() {
        System.out.println("getComandoConsultaVlanMulticast1");

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

        SerialOntGpon s = null;
        Velocidades vUp = null;

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

        SerialOntGpon s = null;

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

        EstadoDaPorta e = null;

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

        EstadoDaPorta e = null;

        EstadoDaPorta expResult = null;
        EstadoDaPorta result = instance.setEstadoDaPorta(i, e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComandoSetMacSourceFilteringMode method, of class
     * KeymileGponDslam.
     */
    @Test
    public void testGetComandoSetMacSourceFilteringMode() {
        System.out.println("getComandoSetMacSourceFilteringMode");

        String intrf = "";
        String mode = "";

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

        Velocidades vDown = null;
        Velocidades vUp = null;

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

        String intrf = "";

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

        Velocidades v = null;

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

        Velocidades v = null;

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

        Velocidades vDown = null;
        Velocidades vUp = null;

        instance.setProfileUp(i, vDown, vUp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComandoGetSlotsAvailableOnts method, of class
     * KeymileGponDslam.
     */
    @Test
    public void testGetComandoGetSlotsAvailableOnts() {
        System.out.println("getComandoGetSlotsAvailableOnts");

        String slot = "";

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

        List<Porta> expResult = null;
        List<Porta> result = instance.getEstadoPortasProximas(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPortaPON() throws Exception {
        try {
            System.out.println("getPortaPON");
            PortaPON result = instance.getPortaPON(i);
            assertTrue(result.validar(ec));
        } catch (Exception e) {
            e.printStackTrace();
            fail(e.getMessage());
        }

    }

}
