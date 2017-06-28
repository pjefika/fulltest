/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.gpon.alcatel;

import br.net.gvt.efika.customer.InventarioRede;
import java.util.ArrayList;
import java.util.List;
import model.dslam.consulta.DeviceMAC;
import model.dslam.consulta.EstadoDaPorta;
import model.dslam.consulta.Profile;
import model.dslam.consulta.VlanBanda;
import model.dslam.consulta.VlanMulticast;
import model.dslam.consulta.VlanVod;
import model.dslam.consulta.VlanVoip;
import model.dslam.consulta.gpon.AlarmesGpon;
import model.dslam.consulta.gpon.SerialOntGpon;
import model.dslam.consulta.gpon.TabelaParametrosGpon;
import model.dslam.velocidade.Velocidades;
import model.fulltest.operacional.CustomerMock;
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
public class AlcatelGponDslamTest {

    public AlcatelGponDslamTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }
    }

    @AfterClass
    public static void tearDownClass() {
        instance.desconectar();
    }

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {
    }

    private static AlcatelGponDslam instance = new AlcatelGponDslam(CustomerMock.gponAlcatel().getRede().getIpDslam());

    /**
     * Test of getTabelaParametros method, of class AlcatelGponDslam.
     */
    @Test
    public void testGetTabelaParametros() {
        System.out.println("getTabelaParametros");
        InventarioRede i = CustomerMock.gponAlcatel().getRede();
        try {
            TabelaParametrosGpon result = instance.getTabelaParametros(i);
            assertTrue(result.getPotOlt() != null);
        } catch (Exception e) {
            fail(e.getMessage());
        }

        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getSerialOnt method, of class AlcatelGponDslam.
     */
    @Test
    public void testGetSerialOnt() {
        System.out.println("getSerialOnt");
        InventarioRede i = CustomerMock.gponAlcatel().getRede();
        try {
            SerialOntGpon result = instance.getSerialOnt(i);
            assertTrue(result.getSerial() != null);
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

    /**
     * Test of getEstadoDaPorta method, of class AlcatelGponDslam.
     */
    @Test
    public void testGetEstadoDaPorta() {
        System.out.println("getEstadoDaPorta");
        InventarioRede i = CustomerMock.gponAlcatel().getRede();
        try {
            EstadoDaPorta result = instance.getEstadoDaPorta(i);
            assertTrue(result.getAdminState() != null);
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

    /**
     * Test of getVlanBanda method, of class AlcatelGponDslam.
     */
    @Test
    public void testGetVlanBanda() {
        System.out.println("getVlanBanda");
        InventarioRede i = CustomerMock.gponAlcatel().getRede();
        try {
            VlanBanda result = instance.getVlanBanda(i);
            assertTrue(result.getCvlan() != null);
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

    /**
     * Test of getVlanVoip method, of class AlcatelGponDslam.
     */
    @Test
    public void testGetVlanVoip() {
        System.out.println("getVlanVoip");
        InventarioRede i = CustomerMock.gponAlcatel().getRede();
        try {
            VlanVoip result = instance.getVlanVoip(i);
            assertTrue(result.getCvlan() != null);
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

    /**
     * Test of getVlanVod method, of class AlcatelGponDslam.
     */
    @Test
    public void testGetVlanVod() {
        System.out.println("getVlanVod");
        InventarioRede i = CustomerMock.gponAlcatel().getRede();
        try {
            VlanVod result = instance.getVlanVod(i);
            assertTrue(result.getCvlan() != null);
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

    /**
     * Test of getVlanMulticast method, of class AlcatelGponDslam.
     */
    @Test
    public void testGetVlanMulticast() {
        System.out.println("getVlanMulticast");
        InventarioRede i = CustomerMock.gponAlcatel().getRede();
        try {
            VlanMulticast result = instance.getVlanMulticast(i);
            assertTrue(result.getSvlan() != null);
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

    /**
     * Test of getAlarmes method, of class AlcatelGponDslam.
     */
    @Test
    public void testGetAlarmes() {
        System.out.println("getAlarmes");
        InventarioRede i = CustomerMock.gponAlcatel().getRede();
        try {
            AlarmesGpon result = instance.getAlarmes(i);
            assertTrue(result.getListAlarmes() != null);
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

    /**
     * Test of getProfile method, of class AlcatelGponDslam.
     */
    @Test
    public void testGetProfile() {
        System.out.println("getProfile");
        InventarioRede i = CustomerMock.gponAlcatel().getRede();
        try {
            Profile result = instance.getProfile(i);
            assertTrue(result.getProfileDown() != null);
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

    /**
     * Test of getDeviceMac method, of class AlcatelGponDslam.
     */
    @Test
    public void testGetDeviceMac() {
        System.out.println("getDeviceMac");
        InventarioRede i = CustomerMock.gponAlcatel().getRede();
        try {
            DeviceMAC result = instance.getDeviceMac(i);
            assertTrue(result.getMac() != null);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    /**
     * Test of setEstadoDaPorta method, of class AlcatelGponDslam.
     */
    @Test
    public void testSetEstadoDaPorta() {
        System.out.println("setEstadoDaPorta");
        InventarioRede i = CustomerMock.gponAlcatel().getRede();

        try {
            EstadoDaPorta e = new EstadoDaPorta();
            e.setAdminState("up");
            EstadoDaPorta result = instance.setEstadoDaPorta(i, e);

            assertTrue(result.getAdminState().equalsIgnoreCase("up"));
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

    /**
     * Test of setOntToOlt method, of class AlcatelGponDslam.
     */
    @Test
    public void testSetOntToOlt() {
        System.out.println("setOntToOlt");
        InventarioRede i = CustomerMock.gponAlcatel().getRede();
        try {
            SerialOntGpon s = instance.getSerialOnt(i);
            SerialOntGpon result = instance.setOntToOlt(i, s);
            assertTrue(result.getSerial() != null);
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

    /**
     * Test of setProfileDown method, of class AlcatelGponDslam.
     */
    @Test
    public void testSetProfileDown() {
        System.out.println("setProfileDown");
        InventarioRede i = CustomerMock.gponAlcatel().getRede();
        try {
            Profile result = instance.setProfileDown(i, Velocidades.VEL_51200);
            assertTrue(result.getProfileDown() != null);
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

    /**
     * Test of setProfileUp method, of class AlcatelGponDslam.
     */
    @Test
    public void testSetProfileUp() {
        System.out.println("setProfileUp");
        InventarioRede i = CustomerMock.gponAlcatel().getRede();
        try {
            Profile p = instance.getProfile(i);
            Profile result = instance.setProfileUp(i, Velocidades.VEL_25600);
            assertTrue(result.getProfileDown() != null);
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

    /**
     * Test of deleteVlanBanda method, of class AlcatelGponDslam.
     */
    @Test
    public void testDeleteVlanBanda() {
        System.out.println("deleteVlanBanda");
        InventarioRede i = CustomerMock.gponAlcatel().getRede();
        try {
            instance.deleteVlanBanda(i);
            assertTrue(instance.getVlanBanda(i).getSvlan() == 0);
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

    /**
     * Test of createVlanBanda method, of class AlcatelGponDslam.
     */
    @Test
    public void testCreateVlanBanda() {
        System.out.println("createVlanBanda");
        InventarioRede i = CustomerMock.gponAlcatel().getRede();
        try {
            VlanBanda result = instance.createVlanBanda(i);
            assertTrue(result.getSvlan() != 0);
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

    /**
     * Test of deleteVlanVoip method, of class AlcatelGponDslam.
     */
    @Test
    public void testDeleteVlanVoip() {
        System.out.println("deleteVlanVoip");
        InventarioRede i = CustomerMock.gponAlcatel().getRede();
        try {
            instance.deleteVlanVoip(i);
            assertTrue(instance.getVlanVoip(i).getSvlan() == 0);
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

    /**
     * Test of createVlanVoip method, of class AlcatelGponDslam.
     */
    @Test
    public void testCreateVlanVoip() {
        System.out.println("createVlanVoip");
        InventarioRede i = CustomerMock.gponAlcatel().getRede();
        try {
            VlanVoip result = instance.createVlanVoip(i);
            assertTrue(result.getSvlan() != 0);
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

    /**
     * Test of deleteVlanVod method, of class AlcatelGponDslam.
     */
    @Test
    public void testDeleteVlanVod() {
        System.out.println("deleteVlanVod");
        InventarioRede i = CustomerMock.gponAlcatel().getRede();
        try {
            instance.deleteVlanVod(i);
            assertTrue(instance.getVlanVod(i).getSvlan() == 0);
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

    /**
     * Test of createVlanVod method, of class AlcatelGponDslam.
     */
    @Test
    public void testCreateVlanVod() {
        System.out.println("createVlanVod");
        InventarioRede i = CustomerMock.gponAlcatel().getRede();
        try {
            VlanVod result = instance.createVlanVod(i);
            assertTrue(result.getSvlan() != 0);
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

    /**
     * Test of deleteVlanMulticast method, of class AlcatelGponDslam.
     */
    @Test
    public void testDeleteVlanMulticast() {
        System.out.println("deleteVlanMulticast");
        InventarioRede i = CustomerMock.gponAlcatel().getRede();
        try {
            instance.deleteVlanMulticast(i);
            assertTrue(instance.getVlanMulticast(i).getSvlan() == 0);
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

    /**
     * Test of createVlanMulticast method, of class AlcatelGponDslam.
     */
    @Test
    public void testCreateVlanMulticast() {
        System.out.println("createVlanMulticast");
        InventarioRede i = CustomerMock.gponAlcatel().getRede();
        try {
            VlanMulticast result = instance.createVlanMulticast(i);
            assertTrue(result.getSvlan() != 0);
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

    /**
     * Test of castProfile method, of class AlcatelGponDslam.
     */
    @Test
    public void testCastProfile() {
        System.out.println("castProfile");
        try {
            List<Profile> profiles = new ArrayList<>();
            for (Velocidades v : Velocidades.values()) {
                Profile p = instance.castProfile(v);
                profiles.add(p);
                System.out.println(v.name() + " Down ->" + p.getProfileDown());
                System.out.println(v.name() + " Up ->" + p.getProfileUp());
            }
            assertEquals(profiles.size(), Velocidades.values().length);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

    }

}
