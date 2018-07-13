/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.metalico.huawei;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.efika_customer.model.customer.InventarioRede;
import br.net.gvt.efika.fulltest.model.telecom.properties.DeviceMAC;
import br.net.gvt.efika.fulltest.model.telecom.properties.EstadoDaPorta;
import br.net.gvt.efika.fulltest.model.telecom.properties.Profile;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanBanda;
import br.net.gvt.efika.fulltest.model.telecom.properties.metalico.TabelaParametrosMetalico;
import br.net.gvt.efika.fulltest.model.telecom.properties.metalico.TabelaRedeMetalico;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.Velocidades;
import br.net.gvt.efika.util.json.JacksonMapper;
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
public class MA5600TDslamVivo1IT {

    public MA5600TDslamVivo1IT() {
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

    private static MA5600TDslamVivo1 instance = new MA5600TDslamVivo1(CustomerMock.metalicoHuawei5600tt().getRede().getIpDslam());
    private static InventarioRede i = CustomerMock.metalicoHuawei5600tt().getRede();
    private static MA5600TDslamVivo1 instanceMS = new MA5600TDslamVivo1(CustomerMock.metalicoHuawei5600tMS().getRede().getIpDslam());
    private static InventarioRede iMS = CustomerMock.metalicoHuawei5600tMS().getRede();
    private static MA5600TDslamVivo1 instanceV = new MA5600TDslamVivo1(CustomerMock.metalicoHuawei5600tV().getRede().getIpDslam());
    private static InventarioRede iV = CustomerMock.metalicoHuawei5600tV().getRede();

    /**
     * Test of conectar method, of class MA5600TDslamVivo1.
     */
    @Test
    public void testConectar() throws Exception {
        System.out.println("conectar");
        instance.conectar();

    }

    /**
     * Test of getEstadoDaPorta method, of class MA5600TDslamVivo1.
     */
    @Test
    public void testGetEstadoDaPorta() throws Exception {
        System.out.println("getEstadoDaPorta");
        EstadoDaPorta result = instance.getEstadoDaPorta(i);

        System.out.println(new JacksonMapper(EstadoDaPorta.class).serialize(result));
    }

    /**
     * Test of getProfile method, of class MA5600TDslamVivo1.
     */
    @Test
    public void testGetProfile() throws Exception {
        System.out.println("getProfile");

        Profile result = instance.getProfile(i);
        System.out.println(new JacksonMapper(Profile.class).serialize(result));
        System.out.println(result.validar(CustomerMock.metalicoHuawei5600tt()));
    }

    /**
     * Test of getVlanBanda method, of class MA5600TDslamVivo1.
     */
    @Test
    public void testGetVlanBanda() throws Exception {
        System.out.println("getVlanBanda");

        VlanBanda result = instance.getVlanBanda(i);
        System.out.println(new JacksonMapper(VlanBanda.class).serialize(result));

    }

//    /**
//     * Test of getVlanMulticast method, of class MA5600TDslamVivo1.
//     */
//    @Test
//    public void testGetVlanMulticast() throws Exception {
//        System.out.println("getVlanMulticast");
//        
//        VlanMulticast result = instance.getVlanMulticast(i);
//        
//    }
    /**
     * Test of getVlanVoip method, of class HuaweiMA5600TDslamVivo1.
     */
//    @Test
//    public void testGetVlanVoip() throws Exception {
//        System.out.println("getVlanVoip");
//        InventarioRede i = null;
//        MA5600TDslamVivo1 instance = null;
//        VlanVoip expResult = null;
//        VlanVoip result = instance.getVlanVoip(i);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of getVlanVod method, of class HuaweiMA5600TDslamVivo1.
     */
//    @Test
//    public void testGetVlanVod() throws Exception {
//        System.out.println("getVlanVod");
//        InventarioRede i = null;
//        MA5600TDslamVivo1 instance = null;
//        VlanVod expResult = null;
//        VlanVod result = instance.getVlanVod(i);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of getReconexoes method, of class HuaweiMA5600TDslamVivo1.
     */
//    @Test
//    public void testGetReconexoes() throws Exception {
//        System.out.println("getReconexoes");
//        InventarioRede i = null;
//        MA5600TDslamVivo1 instance = null;
//        ReConexao expResult = null;
//        ReConexao result = instance.getReconexoes(i);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of getTabelaParametros method, of class MA5600TDslamVivo1.
     */
    @Test
    public void testGetTabelaParametros() throws Exception {
        System.out.println("getTabelaParametros");

        TabelaParametrosMetalico result = instanceMS.getTabelaParametros(iMS);
        System.out.println(new JacksonMapper(TabelaParametrosMetalico.class).serialize(result));
    }

    /**
     * Test of getTabelaRede method, of class MA5600TDslamVivo1.
     */
    @Test
    public void testGetTabelaRede() throws Exception {
        System.out.println("getTabelaRede");

        TabelaRedeMetalico result = instanceV.getTabelaRede(iV);
        System.out.println(new JacksonMapper(TabelaRedeMetalico.class).serialize(result));
    }

    /**
     * Test of getHistoricoTabelaRede method, of class HuaweiMA5600TDslamVivo1.
     */
//    @Test
//    public void testGetHistoricoTabelaRede() throws Exception {
//        System.out.println("getHistoricoTabelaRede");
//        InventarioRede i = null;
//        MA5600TDslamVivo1 instance = null;
//        List<TabelaRedeMetalico> expResult = null;
//        List<TabelaRedeMetalico> result = instance.getHistoricoTabelaRede(i);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of getModulacao method, of class HuaweiMA5600TDslamVivo1.
     */
//    @Test
//    public void testGetModulacao() throws Exception {
//        System.out.println("getModulacao");
//        InventarioRede i = null;
//        MA5600TDslamVivo1 instance = null;
//        Modulacao expResult = null;
//        Modulacao result = instance.getModulacao(i);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of getTabelaParametrosIdeal method, of class
 MA5600TDslamVivo1.
     */
    @Test
    public void testGetTabelaParametrosIdeal() throws Exception {
        System.out.println("getTabelaParametrosIdeal");
        Velocidades v = Velocidades.find(CustomerMock.metalicoHuawei5600tA().getServicos().getVelDown());
        TabelaParametrosMetalico result = instance.getTabelaParametrosIdeal(v);
        System.out.println(new JacksonMapper(TabelaParametrosMetalico.class).serialize(result));
    }

    /**
     * Test of setModulacao method, of class HuaweiMA5600TDslamVivo1.
     */
//    @Test
//    public void testSetModulacao() throws Exception {
//        System.out.println("setModulacao");
//        InventarioRede i = null;
//        Velocidades v = null;
//        MA5600TDslamVivo1 instance = null;
//        Modulacao expResult = null;
//        Modulacao result = instance.setModulacao(i, v);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of resetTabelaRede method, of class HuaweiMA5600TDslamVivo1.
     */
//    @Test
//    public void testResetTabelaRede() throws Exception {
//        System.out.println("resetTabelaRede");
//        InventarioRede i = null;
//        MA5600TDslamVivo1 instance = null;
//        instance.resetTabelaRede(i);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of setEstadoDaPorta method, of class MA5600TDslamVivo1.
     */
    @Test
    public void testSetEstadoDaPorta() throws Exception {
        System.out.println("setEstadoDaPorta");

        EstadoDaPorta e = new EstadoDaPorta();
        e.setAdminState(Boolean.TRUE);
        EstadoDaPorta result = instanceMS.setEstadoDaPorta(iMS, e);
        System.out.println(new JacksonMapper(EstadoDaPorta.class).serialize(result));
    }

    /**
     * Test of setProfileDown method, of class MA5600TDslamVivo1.
     */
    @Test
    public void testSetProfileDown() throws Exception {
        System.out.println("setProfileDown");
        System.out.println(new JacksonMapper(EfikaCustomer.class).serialize(CustomerMock.metalicoHuawei5600tt()));
        Velocidades v = Velocidades.find(CustomerMock.metalicoHuawei5600tA().getServicos().getVelDown());
        instance.setProfileDown(i, v);
        Profile result = instance.getProfile(i);
        System.out.println(new JacksonMapper(Profile.class).serialize(result));
    }

    /**
     * Test of setProfileUp method, of class MA5600TDslamVivo1.
     */
    @Test
    public void testSetProfileUp() throws Exception {
        System.out.println("setProfileUp");
        InventarioRede i = null;
        Velocidades vDown = null;
        Velocidades vUp = null;
        MA5600TDslamVivo1 instance = null;
        instance.setProfileUp(i, vDown, vUp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createVlanBanda method, of class HuaweiMA5600TDslamVivo1.
     */
//    @Test
//    public void testCreateVlanBanda() throws Exception {
//        System.out.println("createVlanBanda");
//        InventarioRede i = null;
//        Velocidades vDown = null;
//        Velocidades vUp = null;
//        MA5600TDslamVivo1 instance = null;
//        VlanBanda expResult = null;
//        VlanBanda result = instance.createVlanBanda(i, vDown, vUp);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of createVlanVoip method, of class HuaweiMA5600TDslamVivo1.
     */
//    @Test
//    public void testCreateVlanVoip() throws Exception {
//        System.out.println("createVlanVoip");
//        InventarioRede i = null;
//        MA5600TDslamVivo1 instance = null;
//        VlanVoip expResult = null;
//        VlanVoip result = instance.createVlanVoip(i);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of createVlanVod method, of class HuaweiMA5600TDslamVivo1.
     */
//    @Test
//    public void testCreateVlanVod() throws Exception {
//        System.out.println("createVlanVod");
//        InventarioRede i = null;
//        MA5600TDslamVivo1 instance = null;
//        VlanVod expResult = null;
//        VlanVod result = instance.createVlanVod(i);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of createVlanMulticast method, of class HuaweiMA5600TDslamVivo1.
     */
//    @Test
//    public void testCreateVlanMulticast() throws Exception {
//        System.out.println("createVlanMulticast");
//        InventarioRede i = null;
//        MA5600TDslamVivo1 instance = null;
//        VlanMulticast expResult = null;
//        VlanMulticast result = instance.createVlanMulticast(i);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of deleteVlanBanda method, of class HuaweiMA5600TDslamVivo1.
     */
//    @Test
//    public void testDeleteVlanBanda() throws Exception {
//        System.out.println("deleteVlanBanda");
//        InventarioRede i = null;
//        MA5600TDslamVivo1 instance = null;
//        instance.deleteVlanBanda(i);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of deleteVlanVoip method, of class HuaweiMA5600TDslamVivo1.
     */
//    @Test
//    public void testDeleteVlanVoip() throws Exception {
//        System.out.println("deleteVlanVoip");
//        InventarioRede i = null;
//        MA5600TDslamVivo1 instance = null;
//        instance.deleteVlanVoip(i);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of deleteVlanVod method, of class HuaweiMA5600TDslamVivo1.
     */
//    @Test
//    public void testDeleteVlanVod() throws Exception {
//        System.out.println("deleteVlanVod");
//        InventarioRede i = null;
//        MA5600TDslamVivo1 instance = null;
//        instance.deleteVlanVod(i);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of deleteVlanMulticast method, of class HuaweiMA5600TDslamVivo1.
     */
//    @Test
//    public void testDeleteVlanMulticast() throws Exception {
//        System.out.println("deleteVlanMulticast");
//        InventarioRede i = null;
//        MA5600TDslamVivo1 instance = null;
//        instance.deleteVlanMulticast(i);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
    /**
     * Test of getDeviceMac method, of class MA5600TDslamVivo1.
     */
    @Test
    public void testGetDeviceMac() throws Exception {
        System.out.println("getDeviceMac");
       
        DeviceMAC result = instance.getDeviceMac(i);
        System.out.println(new JacksonMapper(DeviceMAC.class).serialize(result));
    }
}
