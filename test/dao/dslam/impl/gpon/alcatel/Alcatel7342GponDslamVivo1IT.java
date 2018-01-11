/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.gpon.alcatel;

import br.net.gvt.efika.customer.EfikaCustomer;
import br.net.gvt.efika.customer.InventarioRede;
import java.security.Security;
import java.util.List;

import model.fulltest.operacional.CustomerMock;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
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
import telecom.properties.gpon.PortaPON;
import telecom.properties.gpon.SerialOntGpon;
import telecom.properties.gpon.TabelaParametrosGpon;
import telecom.velocidade.VelocidadeVendor;
import util.GsonUtil;

/**
 *
 * @author G0041775
 */
public class Alcatel7342GponDslamVivo1IT {

    private EfikaCustomer cust;
    private Alcatel7342GponDslamVivo1 instance;
    private InventarioRede i;

    public Alcatel7342GponDslamVivo1IT() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        BouncyCastleProvider bouncyCastleProvider = new BouncyCastleProvider();
//        Security.addProvider(bouncyCastleProvider);
        Security.insertProviderAt(bouncyCastleProvider, 1);
        cust = CustomerMock.getCustomer("1143622905");
        instance = new Alcatel7342GponDslamVivo1(cust.getRede().getIpDslam());
        i = cust.getRede();
    }

    @After
    public void tearDown() {
        instance.desconectar();
    }

    /**
     * Test of obterVelocidadesDownVendor method, of class
     * Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testObterVelocidadesDownVendor() {
        System.out.println("obterVelocidadesDownVendor");
        Alcatel7342GponDslamVivo1 instance = null;
        List<VelocidadeVendor> expResult = null;
        List<VelocidadeVendor> result = instance.obterVelocidadesDownVendor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obterVelocidadesUpVendor method, of class
     * Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testObterVelocidadesUpVendor() {
        System.out.println("obterVelocidadesUpVendor");
        Alcatel7342GponDslamVivo1 instance = null;
        List<VelocidadeVendor> expResult = null;
        List<VelocidadeVendor> result = instance.obterVelocidadesUpVendor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstadoDaPorta method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testGetEstadoDaPorta() throws Exception {
        System.out.println("getEstadoDaPorta");
        EstadoDaPorta result = instance.getEstadoDaPorta(i);
        assertTrue(result.validar(null));
        System.out.println(GsonUtil.serialize(result));
    }

    @Test
    public void testGetPortaPON() throws Exception {
        System.out.println("getPortaPON");
        PortaPON result = instance.getPortaPON(i);
        assertTrue(result.validar(null));
        System.out.println(GsonUtil.serialize(result));
    }

    /**
     * Test of getDeviceMac method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testGetDeviceMac() throws Exception {
        System.out.println("getDeviceMac");
        DeviceMAC result = instance.getDeviceMac(i);
        System.out.println(GsonUtil.serialize(result));
    }

    /**
     * Test of getProfile method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testGetProfile() throws Exception {
        System.out.println("getProfile");
        Profile result = instance.getProfile(i);
        System.out.println(GsonUtil.serialize(result));
    }

    /**
     * Test of getVlanBanda method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testGetVlanBanda() throws Exception {
        System.out.println("getVlanBanda");
        VlanBanda result = instance.getVlanBanda(i);
        System.out.println(GsonUtil.serialize(result));
        assertTrue(result.validar(cust));
    }

    /**
     * Test of getVlanMulticast method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testGetVlanMulticast() throws Exception {
        System.out.println("getVlanMulticast");
        VlanMulticast result = instance.getVlanMulticast(i);
        System.out.println(GsonUtil.serialize(result));
        assertTrue(result.validar(cust));
    }

    /**
     * Test of getVlanVoip method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testGetVlanVoip() throws Exception {
        System.out.println("getVlanVoip");
        VlanVoip result = instance.getVlanVoip(i);
        System.out.println(GsonUtil.serialize(result));
        assertTrue(result.validar(cust));
    }

    /**
     * Test of getVlanVod method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testGetVlanVod() throws Exception {
        System.out.println("getVlanVod");
        VlanVod result = instance.getVlanVod(i);
        System.out.println(GsonUtil.serialize(result));
        assertTrue(result.validar(cust));
    }

    /**
     * Test of getSerialOnt method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testGetSerialOnt() throws Exception {
        System.out.println("getSerialOnt");
        SerialOntGpon result = instance.getSerialOnt(i);
        System.out.println(GsonUtil.serialize(result));
    }

    /**
     * Test of getTabelaParametros method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testGetTabelaParametros() throws Exception {
        System.out.println("getTabelaParametros");
        TabelaParametrosGpon result = instance.getTabelaParametros(i);
        System.out.println(GsonUtil.serialize(result));
    }

    /**
     * Test of getAlarmes method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testGetAlarmes() throws Exception {
        System.out.println("getAlarmes");
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSlotsAvailableOnts method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testGetSlotsAvailableOnts() throws Exception {
        System.out.println("getSlotsAvailableOnts");
        List<SerialOntGpon> result = instance.getSlotsAvailableOnts(i);
        System.out.println(GsonUtil.serialize(result));
    }

    /**
     * Test of getEstadoPortasProximas method, of class
     * Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testGetEstadoPortasProximas() throws Exception {
        System.out.println("getEstadoPortasProximas");
        InventarioRede i = null;
        Alcatel7342GponDslamVivo1 instance = null;
        List<Porta> expResult = null;
        List<Porta> result = instance.getEstadoPortasProximas(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOntToOlt method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testSetOntToOlt() throws Exception {
        System.out.println("setOntToOlt");
        SerialOntGpon s = new SerialOntGpon();
        SerialOntGpon result = instance.setOntToOlt(i, s);
        System.out.println(GsonUtil.serialize(result));
    }

    /**
     * Test of unsetOntFromOlt method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testUnsetOntFromOlt() throws Exception {
        System.out.println("unsetOntFromOlt");
        instance.unsetOntFromOlt(i);
    }

    /**
     * Test of setEstadoDaPorta method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testSetEstadoDaPorta() throws Exception {
        System.out.println("setEstadoDaPorta");
        EstadoDaPorta e = new EstadoDaPorta();
        e.setAdminState(Boolean.FALSE);
        EstadoDaPorta result = instance.setEstadoDaPorta(i, e);
        System.out.println(GsonUtil.serialize(result));
    }

    /**
     * Test of setProfileDown method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testSetProfileDown() throws Exception {
        System.out.println("setProfileDown");
        instance.setProfileDown(i, null);
    }

    /**
     * Test of setProfileUp method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testSetProfileUp() throws Exception {
        System.out.println("setProfileUp");
        instance.setProfileUp(i, null, null);
    }

    /**
     * Test of createVlanBanda method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testCreateVlanBanda() throws Exception {
        System.out.println("createVlanBanda");
        VlanBanda result = instance.createVlanBanda(i, null, null);
        System.out.println(GsonUtil.serialize(result));
    }

    /**
     * Test of createVlanVoip method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testCreateVlanVoip() throws Exception {
        System.out.println("createVlanVoip");
        VlanVoip result = instance.createVlanVoip(i);
        System.out.println(GsonUtil.serialize(result));
    }

    /**
     * Test of createVlanVod method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testCreateVlanVod() throws Exception {
        System.out.println("createVlanVod");
        VlanVod result = instance.createVlanVod(i);
        System.out.println(GsonUtil.serialize(result));
    }

    /**
     * Test of createVlanMulticast method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testCreateVlanMulticast() throws Exception {
        System.out.println("createVlanMulticast");
    }

    /**
     * Test of deleteVlanBanda method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testDeleteVlanBanda() throws Exception {
        System.out.println("deleteVlanBanda");
        instance.deleteVlanBanda(i);
    }

    /**
     * Test of deleteVlanVoip method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testDeleteVlanVoip() throws Exception {
        System.out.println("deleteVlanVoip");
        instance.deleteVlanVoip(i);
    }

    /**
     * Test of deleteVlanVod method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testDeleteVlanVod() throws Exception {
        System.out.println("deleteVlanVod");
        instance.deleteVlanVod(i);
    }

    /**
     * Test of deleteVlanMulticast method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testDeleteVlanMulticast() throws Exception {
        System.out.println("deleteVlanMulticast");
    }

}
