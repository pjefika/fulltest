/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.metalico.zhone;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.efika_customer.model.customer.InventarioRede;
import br.net.gvt.efika.fulltest.model.telecom.properties.DeviceMAC;
import br.net.gvt.efika.fulltest.model.telecom.properties.EstadoDaPorta;
import br.net.gvt.efika.fulltest.model.telecom.properties.Profile;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanBanda;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanMulticast;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanVod;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanVoip;
import br.net.gvt.efika.fulltest.model.telecom.properties.metalico.Modulacao;
import br.net.gvt.efika.fulltest.model.telecom.properties.metalico.TabelaParametrosMetalico;
import br.net.gvt.efika.fulltest.model.telecom.properties.metalico.TabelaRedeMetalico;
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
 * @author G0042204
 */
public class ZhoneMetalicoComboDslamIT {

    public ZhoneMetalicoComboDslamIT() {
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
    private static EfikaCustomer cust = CustomerMock.getCustomer("4130157784");
    private static ZhoneMetalicoComboDslam instance = new ZhoneMetalicoComboDslam(cust.getRede().getIpDslam());
    private static InventarioRede i = cust.getRede();

    /**
     * Test of getTabelaParametros method, of class ZhoneMetalicoComboDslam.
     */
    @Test
    public void testGetTabelaParametros() throws Exception {
        System.out.println("getTabelaParametros");
        TabelaParametrosMetalico result = instance.getTabelaParametros(i);
        System.out.println(new JacksonMapper(TabelaParametrosMetalico.class).serialize(result));
    }

    /**
     * Test of getTabelaRede method, of class ZhoneMetalicoComboDslam.
     */
    @Test
    public void testGetTabelaRede() throws Exception {
        System.out.println("getTabelaRede");
        TabelaRedeMetalico result = instance.getTabelaRede(i);
        System.out.println(new JacksonMapper(TabelaRedeMetalico.class).serialize(result));
    }

    /**
     * Test of getEstadoDaPorta method, of class ZhoneMetalicoComboDslam.
     */
    @Test
    public void testGetEstadoDaPorta() throws Exception {
        System.out.println("getEstadoDaPorta");

        EstadoDaPorta result = instance.getEstadoDaPorta(i);
        System.out.println(new JacksonMapper(EstadoDaPorta.class).serialize(result));

    }

    /**
     * Test of getVlanBanda method, of class ZhoneMetalicoComboDslam.
     */
    @Test
    public void testGetVlanBanda() throws Exception {
        System.out.println("getVlanBanda");
        VlanBanda result = instance.getVlanBanda(i);
        System.out.println(new JacksonMapper(VlanBanda.class).serialize(result));

    }

    /**
     * Test of getVlanVoip method, of class ZhoneMetalicoComboDslam.
     */
    @Test
    public void testGetVlanVoip() throws Exception {
        System.out.println("getVlanVoip");
        VlanVoip result = instance.getVlanVoip(i);
        
        System.out.println(new JacksonMapper(VlanVoip.class).serialize(result));
    }

    /**
     * Test of getVlanVod method, of class ZhoneMetalicoComboDslam.
     */
    @Test
    public void testGetVlanVod() throws Exception {
        System.out.println("getVlanVod");
        VlanVod result = instance.getVlanVod(i);

        assertTrue(result.validar(cust));
    }

    /**
     * Test of getVlanMulticast method, of class ZhoneMetalicoComboDslam.
     */
    @Test
    public void testGetVlanMulticast() throws Exception {
        System.out.println("getVlanMulticast");
        VlanMulticast result = instance.getVlanMulticast(i);

        System.out.println(new JacksonMapper(VlanMulticast.class).serialize(result));

    }

    /**
     * Test of getProfile method, of class ZhoneMetalicoComboDslam.
     */
    @Test
    public void testGetProfile() throws Exception {
        System.out.println("getProfile");
        InventarioRede i = null;
        ZhoneMetalicoComboDslam instance = null;
        Profile expResult = null;
        Profile result = instance.getProfile(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModulacao method, of class ZhoneMetalicoComboDslam.
     */
    @Test
    public void testGetModulacao() throws Exception {
        System.out.println("getModulacao");
        Modulacao result = instance.getModulacao(i);

        assertTrue(result.validar(cust));
    }

    /**
     * Test of getTabelaParametrosIdeal method, of class
     * ZhoneMetalicoComboDslam.
     */
    @Test
    public void testGetTabelaParametrosIdeal() throws Exception {
        System.out.println("getTabelaParametrosIdeal");
        Velocidades v = null;
        ZhoneMetalicoComboDslam instance = null;
        TabelaParametrosMetalico expResult = null;
        TabelaParametrosMetalico result = instance.getTabelaParametrosIdeal(v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of castProfile method, of class ZhoneMetalicoComboDslam.
     */
    @Test
    public void testCastProfile() {
        System.out.println("castProfile");
        Velocidades v = null;
        ZhoneMetalicoComboDslam instance = null;
        Profile expResult = null;
        Profile result = instance.castProfile(v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModulacao method, of class ZhoneMetalicoComboDslam.
     */
    @Test
    public void testSetModulacao() throws Exception {
        System.out.println("setModulacao");
        Modulacao result = instance.setModulacao(i, Velocidades.find(cust.getServicos().getVelDown()));
        System.out.println(new JacksonMapper(Modulacao.class).serialize(result));
        
    }

    /**
     * Test of setEstadoDaPorta method, of class ZhoneMetalicoComboDslam.
     */
    @Test
    public void testSetEstadoDaPorta() throws Exception {
        System.out.println("setEstadoDaPorta");
        EstadoDaPorta e = new EstadoDaPorta(true);
        EstadoDaPorta result = instance.setEstadoDaPorta(i, e);
        System.out.println(new JacksonMapper(EstadoDaPorta.class).serialize(result));
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setProfileDown method, of class ZhoneMetalicoComboDslam.
     */
    @Test
    public void testSetProfileDown() throws Exception {
        System.out.println("setProfileDown");
        Profile result = instance.setProfileDown(i, Velocidades.find(cust.getServicos().getVelDown()));
        System.out.println(new JacksonMapper(Profile.class).serialize(result));
    }

    /**
     * Test of setProfileUp method, of class ZhoneMetalicoComboDslam.
     */
    @Test
    public void testSetProfileUp() throws Exception {
        System.out.println("setProfileUp");
        InventarioRede i = null;
        Velocidades vDown = null;
        Velocidades vUp = null;
        ZhoneMetalicoComboDslam instance = null;
        instance.setProfileUp(i, vDown, vUp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createVlanBanda method, of class ZhoneMetalicoComboDslam.
     */
    @Test
    public void testCreateVlanBanda() throws Exception {
        System.out.println("createVlanBanda");
        VlanBanda result = instance.createVlanBanda(i, Velocidades.find(cust.getServicos().getVelDown()), Velocidades.find(cust.getServicos().getVelUp()));
        System.out.println(new JacksonMapper(VlanBanda.class).serialize(result));
    }

    /**
     * Test of createVlanVoip method, of class ZhoneMetalicoComboDslam.
     */
    @Test
    public void testCreateVlanVoip() throws Exception {
        System.out.println("createVlanVoip");
        InventarioRede i = null;
        ZhoneMetalicoComboDslam instance = null;
        VlanVoip expResult = null;
        VlanVoip result = instance.createVlanVoip(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createVlanVod method, of class ZhoneMetalicoComboDslam.
     */
    @Test
    public void testCreateVlanVod() throws Exception {
        System.out.println("createVlanVod");
        InventarioRede i = null;
        ZhoneMetalicoComboDslam instance = null;
        VlanVod expResult = null;
        VlanVod result = instance.createVlanVod(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createVlanMulticast method, of class ZhoneMetalicoComboDslam.
     */
    @Test
    public void testCreateVlanMulticast() throws Exception {
        System.out.println("createVlanMulticast");
        VlanMulticast result = instance.createVlanMulticast(i);
        System.out.println(new JacksonMapper(VlanMulticast.class).serialize(result));
        
    }

    /**
     * Test of deleteVlanBanda method, of class ZhoneMetalicoComboDslam.
     */
    @Test
    public void testDeleteVlanBanda() throws Exception {
        System.out.println("deleteVlanBanda");
        VlanBanda result = instance.deleteVlanBanda(i);
        System.out.println(new JacksonMapper(VlanBanda.class).serialize(result));
    }

    /**
     * Test of deleteVlanVoip method, of class ZhoneMetalicoComboDslam.
     */
    @Test
    public void testDeleteVlanVoip() throws Exception {
        System.out.println("deleteVlanVoip");
        InventarioRede i = null;
        ZhoneMetalicoComboDslam instance = null;
        instance.deleteVlanVoip(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteVlanVod method, of class ZhoneMetalicoComboDslam.
     */
    @Test
    public void testDeleteVlanVod() throws Exception {
        System.out.println("deleteVlanVod");
        InventarioRede i = null;
        ZhoneMetalicoComboDslam instance = null;
        instance.deleteVlanVod(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteVlanMulticast method, of class ZhoneMetalicoComboDslam.
     */
    @Test
    public void testDeleteVlanMulticast() throws Exception {
        System.out.println("deleteVlanMulticast");
        VlanMulticast result = instance.deleteVlanMulticast(i);
        
        System.out.println(new JacksonMapper(VlanMulticast.class).serialize(result));
    }

    /**
     * Test of castModulacao method, of class ZhoneMetalicoComboDslam.
     */
    @Test
    public void testCastModulacao() {
        System.out.println("castModulacao");
        Velocidades v = null;
        ZhoneMetalicoComboDslam instance = null;
        Modulacao expResult = null;
        Modulacao result = instance.castModulacao(v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resetIptvStatistics method, of class ZhoneMetalicoComboDslam.
     */
    @Test
    public void testResetIptvStatistics() throws Exception {
        System.out.println("resetIptvStatistics");
        instance.resetIptvStatistics(i);
    }

    /**
     * Test of obterVelocidadesUpVendor method, of class
     * ZhoneMetalicoComboDslam.
     */
    @Test
    public void testObterVelocidadesUpVendor() {
        System.out.println("obterVelocidadesUpVendor");
        ZhoneMetalicoComboDslam instance = null;
        List<VelocidadeVendor> expResult = null;
        List<VelocidadeVendor> result = instance.obterVelocidadesUpVendor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obterVelocidadesDownVendor method, of class
     * ZhoneMetalicoComboDslam.
     */
    @Test
    public void testObterVelocidadesDownVendor() {
        System.out.println("obterVelocidadesDownVendor");
        ZhoneMetalicoComboDslam instance = null;
        List<VelocidadeVendor> expResult = null;
        List<VelocidadeVendor> result = instance.obterVelocidadesDownVendor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resetTabelaRede method, of class ZhoneMetalicoComboDslam.
     */
    @Test
    public void testResetTabelaRede() throws Exception {
        System.out.println("resetTabelaRede");
        TabelaRedeMetalico result = instance.resetTabelaRede(i);
        System.out.println(new JacksonMapper(TabelaRedeMetalico.class).serialize(result));
    }

    /**
     * Test of getHistoricoTabelaRede method, of class ZhoneMetalicoComboDslam.
     */
    @Test
    public void testGetHistoricoTabelaRede() throws Exception {
        System.out.println("getHistoricoTabelaRede");
        InventarioRede i = null;
        ZhoneMetalicoComboDslam instance = null;
        List<TabelaRedeMetalico> expResult = null;
        List<TabelaRedeMetalico> result = instance.getHistoricoTabelaRede(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeviceMac method, of class ZhoneMetalicoComboDslam.
     */
    @Test
    public void testGetDeviceMac() throws Exception {
        System.out.println("getDeviceMac");
        DeviceMAC result = instance.getDeviceMac(i);
        System.out.println(new JacksonMapper(DeviceMAC.class).serialize(result));
        
    }

}
