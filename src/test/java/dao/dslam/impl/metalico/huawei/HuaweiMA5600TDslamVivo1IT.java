/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.metalico.huawei;

import br.net.gvt.efika.customer.EfikaCustomer;
import br.net.gvt.efika.customer.InventarioRede;
import java.util.List;
import model.fulltest.operacional.CustomerMock;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import telecom.properties.EstadoDaPorta;
import telecom.properties.Profile;
import telecom.properties.ReConexao;
import telecom.properties.VlanBanda;
import telecom.properties.VlanMulticast;
import telecom.properties.VlanVod;
import telecom.properties.VlanVoip;
import telecom.properties.metalico.Modulacao;
import telecom.properties.metalico.TabelaParametrosMetalico;
import telecom.properties.metalico.TabelaRedeMetalico;
import telecom.velocidade.VelocidadeVendor;
import telecom.velocidade.Velocidades;

/**
 *
 * @author G0041775
 */
public class HuaweiMA5600TDslamVivo1IT {

    private static EfikaCustomer cust = CustomerMock.metalicoHuawei5600t();
    private static HuaweiMA5600TDslamVivo1 instance = new HuaweiMA5600TDslamVivo1(cust.getRede().getIpDslam());
    private static InventarioRede i = cust.getRede();

    public HuaweiMA5600TDslamVivo1IT() {
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
     * Test of conectar method, of class HuaweiMA5600TDslamVivo1.
     */
    @Test
    public void testConectar() throws Exception {
        System.out.println("conectar");
        instance.conectar();
    }

    /**
     * Test of enableCommandsInDslam method, of class HuaweiMA5600TDslamVivo1.
     */
    @Test
    public void testEnableCommandsInDslam() throws Exception {
        System.out.println("enableCommandsInDslam");
        HuaweiMA5600TDslamVivo1 instance = null;
        instance.enableCommandsInDslam();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obterVelocidadesDownVendor method, of class
     * HuaweiMA5600TDslamVivo1.
     */
    @Test
    public void testObterVelocidadesDownVendor() {
        System.out.println("obterVelocidadesDownVendor");
        HuaweiMA5600TDslamVivo1 instance = null;
        List<VelocidadeVendor> expResult = null;
        List<VelocidadeVendor> result = instance.obterVelocidadesDownVendor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obterVelocidadesUpVendor method, of class
     * HuaweiMA5600TDslamVivo1.
     */
    @Test
    public void testObterVelocidadesUpVendor() {
        System.out.println("obterVelocidadesUpVendor");
        HuaweiMA5600TDslamVivo1 instance = null;
        List<VelocidadeVendor> expResult = null;
        List<VelocidadeVendor> result = instance.obterVelocidadesUpVendor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstadoDaPorta method, of class HuaweiMA5600TDslamVivo1.
     */
    @Test
    public void testGetEstadoDaPorta() throws Exception {
        System.out.println("getEstadoDaPorta");
        InventarioRede i = null;
        HuaweiMA5600TDslamVivo1 instance = null;
        EstadoDaPorta expResult = null;
        EstadoDaPorta result = instance.getEstadoDaPorta(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProfile method, of class HuaweiMA5600TDslamVivo1.
     */
    @Test
    public void testGetProfile() throws Exception {
        System.out.println("getProfile");
        InventarioRede i = null;
        HuaweiMA5600TDslamVivo1 instance = null;
        Profile expResult = null;
        Profile result = instance.getProfile(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVlanBanda method, of class HuaweiMA5600TDslamVivo1.
     */
    @Test
    public void testGetVlanBanda() throws Exception {
        System.out.println("getVlanBanda");
        InventarioRede i = null;
        HuaweiMA5600TDslamVivo1 instance = null;
        VlanBanda expResult = null;
        VlanBanda result = instance.getVlanBanda(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVlanMulticast method, of class HuaweiMA5600TDslamVivo1.
     */
    @Test
    public void testGetVlanMulticast() throws Exception {
        System.out.println("getVlanMulticast");
        InventarioRede i = null;
        HuaweiMA5600TDslamVivo1 instance = null;
        VlanMulticast expResult = null;
        VlanMulticast result = instance.getVlanMulticast(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVlanVoip method, of class HuaweiMA5600TDslamVivo1.
     */
    @Test
    public void testGetVlanVoip() throws Exception {
        System.out.println("getVlanVoip");
        InventarioRede i = null;
        HuaweiMA5600TDslamVivo1 instance = null;
        VlanVoip expResult = null;
        VlanVoip result = instance.getVlanVoip(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVlanVod method, of class HuaweiMA5600TDslamVivo1.
     */
    @Test
    public void testGetVlanVod() throws Exception {
        System.out.println("getVlanVod");
        InventarioRede i = null;
        HuaweiMA5600TDslamVivo1 instance = null;
        VlanVod expResult = null;
        VlanVod result = instance.getVlanVod(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReconexoes method, of class HuaweiMA5600TDslamVivo1.
     */
    @Test
    public void testGetReconexoes() throws Exception {
        System.out.println("getReconexoes");
        InventarioRede i = null;
        HuaweiMA5600TDslamVivo1 instance = null;
        ReConexao expResult = null;
        ReConexao result = instance.getReconexoes(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTabelaParametros method, of class HuaweiMA5600TDslamVivo1.
     */
    @Test
    public void testGetTabelaParametros() throws Exception {
        System.out.println("getTabelaParametros");
        InventarioRede i = null;
        HuaweiMA5600TDslamVivo1 instance = null;
        TabelaParametrosMetalico expResult = null;
        TabelaParametrosMetalico result = instance.getTabelaParametros(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTabelaRede method, of class HuaweiMA5600TDslamVivo1.
     */
    @Test
    public void testGetTabelaRede() throws Exception {
        System.out.println("getTabelaRede");
        InventarioRede i = null;
        HuaweiMA5600TDslamVivo1 instance = null;
        TabelaRedeMetalico expResult = null;
        TabelaRedeMetalico result = instance.getTabelaRede(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHistoricoTabelaRede method, of class HuaweiMA5600TDslamVivo1.
     */
    @Test
    public void testGetHistoricoTabelaRede() throws Exception {
        System.out.println("getHistoricoTabelaRede");
        InventarioRede i = null;
        HuaweiMA5600TDslamVivo1 instance = null;
        List<TabelaRedeMetalico> expResult = null;
        List<TabelaRedeMetalico> result = instance.getHistoricoTabelaRede(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModulacao method, of class HuaweiMA5600TDslamVivo1.
     */
    @Test
    public void testGetModulacao() throws Exception {
        System.out.println("getModulacao");
        InventarioRede i = null;
        HuaweiMA5600TDslamVivo1 instance = null;
        Modulacao expResult = null;
        Modulacao result = instance.getModulacao(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTabelaParametrosIdeal method, of class
     * HuaweiMA5600TDslamVivo1.
     */
    @Test
    public void testGetTabelaParametrosIdeal() throws Exception {
        System.out.println("getTabelaParametrosIdeal");
        Velocidades v = null;
        HuaweiMA5600TDslamVivo1 instance = null;
        TabelaParametrosMetalico expResult = null;
        TabelaParametrosMetalico result = instance.getTabelaParametrosIdeal(v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModulacao method, of class HuaweiMA5600TDslamVivo1.
     */
    @Test
    public void testSetModulacao() throws Exception {
        System.out.println("setModulacao");
        InventarioRede i = null;
        Velocidades v = null;
        HuaweiMA5600TDslamVivo1 instance = null;
        Modulacao expResult = null;
        Modulacao result = instance.setModulacao(i, v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resetTabelaRede method, of class HuaweiMA5600TDslamVivo1.
     */
    @Test
    public void testResetTabelaRede() throws Exception {
        System.out.println("resetTabelaRede");
        InventarioRede i = null;
        HuaweiMA5600TDslamVivo1 instance = null;
        instance.resetTabelaRede(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstadoDaPorta method, of class HuaweiMA5600TDslamVivo1.
     */
    @Test
    public void testSetEstadoDaPorta() throws Exception {
        System.out.println("setEstadoDaPorta");
        InventarioRede i = null;
        EstadoDaPorta e = null;
        HuaweiMA5600TDslamVivo1 instance = null;
        EstadoDaPorta expResult = null;
        EstadoDaPorta result = instance.setEstadoDaPorta(i, e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProfileDown method, of class HuaweiMA5600TDslamVivo1.
     */
    @Test
    public void testSetProfileDown() throws Exception {
        System.out.println("setProfileDown");
        InventarioRede i = null;
        Velocidades v = null;
        HuaweiMA5600TDslamVivo1 instance = null;
        instance.setProfileDown(i, v);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProfileUp method, of class HuaweiMA5600TDslamVivo1.
     */
    @Test
    public void testSetProfileUp() throws Exception {
        System.out.println("setProfileUp");
        InventarioRede i = null;
        Velocidades vDown = null;
        Velocidades vUp = null;
        HuaweiMA5600TDslamVivo1 instance = null;
        instance.setProfileUp(i, vDown, vUp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createVlanBanda method, of class HuaweiMA5600TDslamVivo1.
     */
    @Test
    public void testCreateVlanBanda() throws Exception {
        System.out.println("createVlanBanda");
        InventarioRede i = null;
        Velocidades vDown = null;
        Velocidades vUp = null;
        HuaweiMA5600TDslamVivo1 instance = null;
        VlanBanda expResult = null;
        VlanBanda result = instance.createVlanBanda(i, vDown, vUp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createVlanVoip method, of class HuaweiMA5600TDslamVivo1.
     */
    @Test
    public void testCreateVlanVoip() throws Exception {
        System.out.println("createVlanVoip");
        InventarioRede i = null;
        HuaweiMA5600TDslamVivo1 instance = null;
        VlanVoip expResult = null;
        VlanVoip result = instance.createVlanVoip(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createVlanVod method, of class HuaweiMA5600TDslamVivo1.
     */
    @Test
    public void testCreateVlanVod() throws Exception {
        System.out.println("createVlanVod");
        InventarioRede i = null;
        HuaweiMA5600TDslamVivo1 instance = null;
        VlanVod expResult = null;
        VlanVod result = instance.createVlanVod(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createVlanMulticast method, of class HuaweiMA5600TDslamVivo1.
     */
    @Test
    public void testCreateVlanMulticast() throws Exception {
        System.out.println("createVlanMulticast");
        InventarioRede i = null;
        HuaweiMA5600TDslamVivo1 instance = null;
        VlanMulticast expResult = null;
        VlanMulticast result = instance.createVlanMulticast(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteVlanBanda method, of class HuaweiMA5600TDslamVivo1.
     */
    @Test
    public void testDeleteVlanBanda() throws Exception {
        System.out.println("deleteVlanBanda");
        InventarioRede i = null;
        HuaweiMA5600TDslamVivo1 instance = null;
        instance.deleteVlanBanda(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteVlanVoip method, of class HuaweiMA5600TDslamVivo1.
     */
    @Test
    public void testDeleteVlanVoip() throws Exception {
        System.out.println("deleteVlanVoip");
        InventarioRede i = null;
        HuaweiMA5600TDslamVivo1 instance = null;
        instance.deleteVlanVoip(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteVlanVod method, of class HuaweiMA5600TDslamVivo1.
     */
    @Test
    public void testDeleteVlanVod() throws Exception {
        System.out.println("deleteVlanVod");
        InventarioRede i = null;
        HuaweiMA5600TDslamVivo1 instance = null;
        instance.deleteVlanVod(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteVlanMulticast method, of class HuaweiMA5600TDslamVivo1.
     */
    @Test
    public void testDeleteVlanMulticast() throws Exception {
        System.out.println("deleteVlanMulticast");
        InventarioRede i = null;
        HuaweiMA5600TDslamVivo1 instance = null;
        instance.deleteVlanMulticast(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
