/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.metalico.keymile;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.efika_customer.model.customer.InventarioRede;
import br.net.gvt.efika.fulltest.model.telecom.properties.DeviceMAC;
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
 * @author G0041775
 */
public class KeymileMetalicoSuvdDslamIT {

    public KeymileMetalicoSuvdDslamIT() {
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

    private static EfikaCustomer cust3 = CustomerMock.getCustomer("4133335556");
    private static KeymileMetalicoSuvd3 instance3 = new KeymileMetalicoSuvd3(cust3.getRede().getIpDslam());
    private static InventarioRede i3 = cust3.getRede();
    private static EfikaCustomer cust1 = CustomerMock.getCustomer("8133283074");
    private static KeymileMetalicoSuvd1 instance1 = new KeymileMetalicoSuvd1(cust1.getRede().getIpDslam());
    private static InventarioRede i1 = cust1.getRede();
    private static EfikaCustomer cust11 = CustomerMock.getCustomer("5130133356");
    private static KeymileMetalicoSuvd11 instance11 = new KeymileMetalicoSuvd11(cust11.getRede().getIpDslam());
    private static InventarioRede i11 = cust11.getRede();

    /**
     * Test of obterVelocidadesUpVendor method, of class
     * KeymileMetalicoSuvdDslam.
     */
    @Test
    public void testObterVelocidadesUpVendor() {
        System.out.println("obterVelocidadesUpVendor");
        KeymileMetalicoSuvdDslam instance = null;
        List<VelocidadeVendor> expResult = null;
        List<VelocidadeVendor> result = instance.obterVelocidadesUpVendor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obterVelocidadesDownVendor method, of class
     * KeymileMetalicoSuvdDslam.
     */
    @Test
    public void testObterVelocidadesDownVendor() {
        System.out.println("obterVelocidadesDownVendor");
        KeymileMetalicoSuvdDslam instance = null;
        List<VelocidadeVendor> expResult = null;
        List<VelocidadeVendor> result = instance.obterVelocidadesDownVendor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTabelaParametros method, of class KeymileMetalicoSuvdDslam.
     */
    @Test
    public void testGetTabelaParametros() throws Exception {
        System.out.println("getTabelaParametros");
        try {
            TabelaParametrosMetalico result3 = instance3.getTabelaParametros(i3);
            System.out.println(new JacksonMapper(TabelaParametrosMetalico.class).serialize(result3));
        } catch (Exception e) {
            System.out.println("erro3");
        }
        try {
            TabelaParametrosMetalico result1 = instance1.getTabelaParametros(i1);
            System.out.println(new JacksonMapper(TabelaParametrosMetalico.class).serialize(result1));
        } catch (Exception e) {
            System.out.println("erro1");
        }
        try {
            TabelaParametrosMetalico result11 = instance11.getTabelaParametros(i11);
            System.out.println(new JacksonMapper(TabelaParametrosMetalico.class).serialize(result11));
        } catch (Exception e) {
            System.out.println("erro11");
        }
    }

    /**
     * Test of getVlanBanda method, of class KeymileMetalicoSuvdDslam.
     */
    @Test
    public void testGetVlanBanda() throws Exception {
        System.out.println("getVlanBanda");
        try {
            VlanBanda result3 = instance3.getVlanBanda(i3);
            System.out.println(new JacksonMapper(VlanBanda.class).serialize(result3));
        } catch (Exception e) {
            System.out.println("erro3");
        }
        try {
            VlanBanda result1 = instance1.getVlanBanda(i1);
            System.out.println(new JacksonMapper(VlanBanda.class).serialize(result1));
        } catch (Exception e) {
            System.out.println("erro1");
        }
        try {
            VlanBanda result11 = instance11.getVlanBanda(i11);
            System.out.println(new JacksonMapper(VlanBanda.class).serialize(result11));
        } catch (Exception e) {
            System.out.println("erro11");
        }

    }

    /**
     * Test of getVlanVoip method, of class KeymileMetalicoSuvdDslam.
     */
    @Test
    public void testGetVlanVoip() throws Exception {
        System.out.println("getVlanVoip");
        InventarioRede i = null;
        KeymileMetalicoSuvdDslam instance = null;
        VlanVoip expResult = null;
        VlanVoip result = instance.getVlanVoip(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVlanVod method, of class KeymileMetalicoSuvdDslam.
     */
    @Test
    public void testGetVlanVod() throws Exception {
        System.out.println("getVlanVod");

        try {
            VlanVod result3 = instance3.getVlanVod(i3);
            System.out.println(new JacksonMapper(VlanVod.class).serialize(result3));
        } catch (Exception e) {
            System.out.println("erro3");
        }
        try {
            VlanVod result1 = instance1.getVlanVod(i1);
            System.out.println(new JacksonMapper(VlanVod.class).serialize(result1));
        } catch (Exception e) {
            System.out.println("erro1");
        }
        try {
            VlanVod result11 = instance11.getVlanVod(i11);
            System.out.println(new JacksonMapper(VlanVod.class).serialize(result11));
        } catch (Exception e) {
            System.out.println("erro11");
        }

    }

    /**
     * Test of getVlanMulticast method, of class KeymileMetalicoSuvdDslam.
     */
    @Test
    public void testGetVlanMulticast() throws Exception {
        System.out.println("getVlanMulticast");
        try {
            VlanMulticast result3 = instance3.getVlanMulticast(i3);
            System.out.println(new JacksonMapper(VlanVod.class).serialize(result3));
        } catch (Exception e) {
            System.out.println("erro3");
        }
        try {
            VlanMulticast result1 = instance1.getVlanMulticast(i1);
            System.out.println(new JacksonMapper(VlanVod.class).serialize(result1));
        } catch (Exception e) {
            System.out.println("erro1");
        }
        try {
            VlanMulticast result11 = instance11.getVlanMulticast(i11);
            System.out.println(new JacksonMapper(VlanVod.class).serialize(result11));
        } catch (Exception e) {
            System.out.println("erro11");
        }

    }

    /**
     * Test of getProfile method, of class KeymileMetalicoSuvdDslam.
     */
    @Test
    public void testGetProfile() throws Exception {
        System.out.println("getProfile");

        try {
            Profile result3 = instance3.getProfile(i3);
            System.out.println(new JacksonMapper(Profile.class).serialize(result3));
        } catch (Exception e) {
            System.out.println("erro3");
        }
        try {
            Profile result1 = instance1.getProfile(i1);
            System.out.println(new JacksonMapper(Profile.class).serialize(result1));
        } catch (Exception e) {
            System.out.println("erro1");
        }
        try {
            Profile result11 = instance11.getProfile(i11);
            System.out.println(new JacksonMapper(Profile.class).serialize(result11));
        } catch (Exception e) {
            System.out.println("erro11");
        }
    }

    /**
     * Test of getModulacao method, of class KeymileMetalicoSuvdDslam.
     */
    @Test
    public void testGetModulacao() throws Exception {
        System.out.println("getModulacao");
        try {
            Modulacao result3 = instance3.getModulacao(i3);
            System.out.println(new JacksonMapper(Modulacao.class).serialize(result3));
        } catch (Exception e) {
            System.out.println("erro3");
        }
        try {
            Modulacao result1 = instance1.getModulacao(i1);
            System.out.println(new JacksonMapper(Modulacao.class).serialize(result1));
        } catch (Exception e) {
            System.out.println("erro1");
        }
        try {
            Modulacao result11 = instance11.getModulacao(i11);
            System.out.println(new JacksonMapper(Modulacao.class).serialize(result11));
        } catch (Exception e) {
            System.out.println("erro11");
        }

    }

    /**
     * Test of setProfileDown method, of class KeymileMetalicoSuvdDslam.
     */
    @Test
    public void testSetProfileDown() throws Exception {
        System.out.println("setProfileDown");

        try {
            Profile result3 = instance3.setProfileDown(i3, Velocidades.find(cust3.getServicos().getVelDown()));
            System.out.println(new JacksonMapper(Modulacao.class).serialize(result3));
        } catch (Exception e) {
            System.out.println("erro3");
        }
        try {
            Profile result1 = instance1.setProfileDown(i1, Velocidades.find(cust1.getServicos().getVelDown()));
            System.out.println(new JacksonMapper(Modulacao.class).serialize(result1));
        } catch (Exception e) {
            System.out.println("erro1");
        }
        try {
            Profile result11 = instance11.setProfileDown(i11, Velocidades.find(cust11.getServicos().getVelDown()));
            System.out.println(new JacksonMapper(Modulacao.class).serialize(result11));
        } catch (Exception e) {
            System.out.println("erro11");
        }
//      
    }

    /**
     * Test of setProfileUp method, of class KeymileMetalicoSuvdDslam.
     */
    @Test
    public void testSetProfileUp() throws Exception {
        System.out.println("setProfileUp");
        InventarioRede i = null;
        Velocidades vDown = null;
        Velocidades vUp = null;
        KeymileMetalicoSuvdDslam instance = null;
        instance.setProfileUp(i, vDown, vUp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createVlanBanda method, of class KeymileMetalicoSuvdDslam.
     */
    @Test
    public void testCreateVlanBanda() throws Exception {
        System.out.println("createVlanBanda");

        try {
            VlanBanda result3 = instance3.createVlanBanda(i3, Velocidades.find(cust3.getServicos().getVelDown()), Velocidades.find(cust3.getServicos().getVelUp()));
            System.out.println(new JacksonMapper(VlanBanda.class).serialize(result3));
        } catch (Exception e) {
            System.out.println("erro3");
        }
        try {
            VlanBanda result1 = instance1.createVlanBanda(i1, Velocidades.find(cust1.getServicos().getVelDown()), Velocidades.find(cust1.getServicos().getVelUp()));
            System.out.println(new JacksonMapper(VlanBanda.class).serialize(result1));
        } catch (Exception e) {
            System.out.println("erro1");
        }
        try {
            VlanBanda result11 = instance11.createVlanBanda(i11, Velocidades.find(cust11.getServicos().getVelDown()), Velocidades.find(cust11.getServicos().getVelUp()));
            System.out.println(new JacksonMapper(VlanBanda.class).serialize(result11));
        } catch (Exception e) {
            System.out.println("erro11");
        }

    }

    /**
     * Test of createVlanVoip method, of class KeymileMetalicoSuvdDslam.
     */
    @Test
    public void testCreateVlanVoip() throws Exception {
        System.out.println("createVlanVoip");
        InventarioRede i = null;
        KeymileMetalicoSuvdDslam instance = null;
        VlanVoip expResult = null;
        VlanVoip result = instance.createVlanVoip(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createVlanVod method, of class KeymileMetalicoSuvdDslam.
     */
    @Test
    public void testCreateVlanVod() throws Exception {
        System.out.println("createVlanVod");
        InventarioRede i = null;
        KeymileMetalicoSuvdDslam instance = null;
        VlanVod expResult = null;
        VlanVod result = instance.createVlanVod(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createVlanMulticast method, of class KeymileMetalicoSuvdDslam.
     */
    @Test
    public void testCreateVlanMulticast() throws Exception {
        System.out.println("createVlanMulticast");
        InventarioRede i = null;
        KeymileMetalicoSuvdDslam instance = null;
        VlanMulticast expResult = null;
        VlanMulticast result = instance.createVlanMulticast(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteVlanBanda method, of class KeymileMetalicoSuvdDslam.
     */
    @Test
    public void testDeleteVlanBanda() throws Exception {
        System.out.println("deleteVlanBanda");
        try {
            VlanBanda result3 = instance3.deleteVlanBanda(i3);
            System.out.println(new JacksonMapper(VlanBanda.class).serialize(result3));
        } catch (Exception e) {
            System.out.println("erro3");
        }
        try {
            VlanBanda result1 = instance1.deleteVlanBanda(i1);
            System.out.println(new JacksonMapper(VlanBanda.class).serialize(result1));
        } catch (Exception e) {
            System.out.println("erro1");
        }
        try {
            VlanBanda result11 = instance11.deleteVlanBanda(i11);
            System.out.println(new JacksonMapper(VlanBanda.class).serialize(result11));
        } catch (Exception e) {
            System.out.println("erro11");
        }

    }

    /**
     * Test of deleteVlanVoip method, of class KeymileMetalicoSuvdDslam.
     */
    @Test
    public void testDeleteVlanVoip() throws Exception {
        System.out.println("deleteVlanVoip");
        InventarioRede i = null;
        KeymileMetalicoSuvdDslam instance = null;
        instance.deleteVlanVoip(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteVlanVod method, of class KeymileMetalicoSuvdDslam.
     */
    @Test
    public void testDeleteVlanVod() throws Exception {
        System.out.println("deleteVlanVod");
        InventarioRede i = null;
        KeymileMetalicoSuvdDslam instance = null;
        instance.deleteVlanVod(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteVlanMulticast method, of class KeymileMetalicoSuvdDslam.
     */
    @Test
    public void testDeleteVlanMulticast() throws Exception {
        System.out.println("deleteVlanMulticast");
        InventarioRede i = null;
        KeymileMetalicoSuvdDslam instance = null;
        instance.deleteVlanMulticast(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModulacao method, of class KeymileMetalicoSuvdDslam.
     */
    @Test
    public void testSetModulacao() throws Exception {
        System.out.println("setModulacao");
        InventarioRede i = null;
        Velocidades v = null;
        KeymileMetalicoSuvdDslam instance = null;
        Modulacao expResult = null;
        Modulacao result = instance.setModulacao(i, v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of castProfile method, of class KeymileMetalicoSuvdDslam.
     */
    @Test
    public void testCastProfile() {
        System.out.println("castProfile");
        Velocidades v = null;
        KeymileMetalicoSuvdDslam instance = null;
        Profile expResult = null;
        Profile result = instance.castProfile(v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of castModulacao method, of class KeymileMetalicoSuvdDslam.
     */
    @Test
    public void testCastModulacao() {
        System.out.println("castModulacao");
        Velocidades v = null;
        KeymileMetalicoSuvdDslam instance = null;
        Modulacao expResult = null;
        Modulacao result = instance.castModulacao(v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTabelaRede method, of class KeymileMetalicoSuvdDslam.
     */
    @Test
    public void testGetTabelaRede() throws Exception {
        System.out.println("getTabelaRede");

        try {
            TabelaRedeMetalico result3 = instance3.getTabelaRede(i3);
            System.out.println(new JacksonMapper(TabelaRedeMetalico.class).serialize(result3));
        } catch (Exception e) {
            System.out.println("erro3");
        }
        try {
            TabelaRedeMetalico result1 = instance1.getTabelaRede(i1);
            System.out.println(new JacksonMapper(TabelaRedeMetalico.class).serialize(result1));
        } catch (Exception e) {
            System.out.println("erro1");
        }
        try {
            TabelaRedeMetalico result11 = instance11.getTabelaRede(i11);
            System.out.println(new JacksonMapper(TabelaRedeMetalico.class).serialize(result11));
        } catch (Exception e) {
            System.out.println("erro11");
        }
    }

    @Test
    public void testResetTabelaRede() throws Exception {
        System.out.println("resetTabelaRede");
        try {
            TabelaRedeMetalico result3 = instance3.resetTabelaRede(i3);
            System.out.println(new JacksonMapper(TabelaRedeMetalico.class).serialize(result3));
        } catch (Exception e) {
            System.out.println("erro3");
        }
        try {
            TabelaRedeMetalico result1 = instance1.resetTabelaRede(i1);
            System.out.println(new JacksonMapper(TabelaRedeMetalico.class).serialize(result1));
        } catch (Exception e) {
            System.out.println("erro1");
        }
        try {
            TabelaRedeMetalico result11 = instance11.resetTabelaRede(i11);
            System.out.println(new JacksonMapper(TabelaRedeMetalico.class).serialize(result11));
        } catch (Exception e) {
            System.out.println("erro11");
        }
    }

    /**
     * Test of getDeviceMac method, of class KeymileMetalicoSuvdDslam.
     */
    @Test
    public void testGetDeviceMac() throws Exception {
        System.out.println("getDeviceMac");
        
        try {
            DeviceMAC result3 = instance3.getDeviceMac(i3);
            System.out.println(new JacksonMapper(DeviceMAC.class).serialize(result3));
        } catch (Exception e) {
            System.out.println("erro3");
        }
        try {
            DeviceMAC result1 = instance1.getDeviceMac(i1);
            System.out.println(new JacksonMapper(DeviceMAC.class).serialize(result1));
        } catch (Exception e) {
            System.out.println("erro1");
        }
        try {
            DeviceMAC result11 = instance11.getDeviceMac(i11);
            System.out.println(new JacksonMapper(DeviceMAC.class).serialize(result11));
        } catch (Exception e) {
            System.out.println("erro11");
        }

    }

    /**
     * Test of resetIptvStatistics method, of class KeymileMetalicoSuvdDslam.
     */
    @Test
    public void testResetIptvStatistics() throws Exception {
        System.out.println("resetIptvStatistics");
//        instance.resetIptvStatistics(i);
    }

}
