/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.gpon.keymile;

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
public class KeymileGponDslamTest {

    public KeymileGponDslamTest() {
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
        instance.desconectar();
    }

    KeymileGponDslam instance = new KeymileGponDslam(CustomerMock.getCustomer("3125205633").getRede().getIpDslam());
    InventarioRede i = CustomerMock.getCustomer("3125205633").getRede();

    /**
     * Test of getTabelaParametros method, of class KeymileGponDslam.
     */
    @Test
    public void testGetTabelaParametros() {
        System.out.println("getTabelaParametros");
        try {
            TabelaParametrosGpon result = instance.getTabelaParametros(i);
            assertTrue(result.getPotOlt() != null);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    /**
     * Test of getSerialOnt method, of class KeymileGponDslam.
     */
    @Test
    public void testGetSerialOnt() throws Exception {
        System.out.println("getSerialOnt");
        try {
            SerialOntGpon result = instance.getSerialOnt(i);
            assertTrue(result.getSerial() != null);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    /**
     * Test of getEstadoDaPorta method, of class KeymileGponDslam.
     */
    @Test
    public void testGetEstadoDaPorta() throws Exception {
        System.out.println("getEstadoDaPorta");
        try {
            EstadoDaPorta result = instance.getEstadoDaPorta(i);
            assertTrue(result.getAdminState() != null);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    /**
     * Test of getVlanBanda method, of class KeymileGponDslam.
     */
    @Test
    public void testGetVlanBanda() throws Exception {
        System.out.println("getVlanBanda");
        try {
            VlanBanda result = instance.getVlanBanda(i);
            assertTrue(result.getSvlan() != null);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    /**
     * Test of getVlanVoip method, of class KeymileGponDslam.
     */
    @Test
    public void testGetVlanVoip() throws Exception {
        System.out.println("getVlanVoip");
        try {
            VlanVoip result = instance.getVlanVoip(i);
            assertTrue(result.getSvlan() != null);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    /**
     * Test of getVlanVod method, of class KeymileGponDslam.
     */
    @Test
    public void testGetVlanVod() throws Exception {
        System.out.println("getVlanVod");
        try {
            VlanVod result = instance.getVlanVod(i);
            assertTrue(result.getSvlan() != null);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    /**
     * Test of getVlanMulticast method, of class KeymileGponDslam.
     */
    @Test
    public void testGetVlanMulticast() throws Exception {
        System.out.println("getVlanMulticast");
        try {
            VlanMulticast result = instance.getVlanMulticast(i);
            assertTrue(result.getSvlan() != null);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    /**
     * Test of getAlarmes method, of class KeymileGponDslam.
     */
    @Test
    public void testGetAlarmes() throws Exception {
        System.out.println("getAlarmes");
        try {
            AlarmesGpon result = instance.getAlarmes(i);
            assertTrue(result.getListAlarmes() != null);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    /**
     * Test of getProfile method, of class KeymileGponDslam.
     */
    @Test
    public void testGetProfile() throws Exception {
        System.out.println("getProfile");
        try {
            Profile result = instance.getProfile(i);
            assertTrue(result.getProfileDown() != null);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    /**
     * Test of getDeviceMac method, of class KeymileGponDslam.
     */
    @Test
    public void testGetDeviceMac() throws Exception {
        System.out.println("getDeviceMac");
        try {
            DeviceMAC result = instance.getDeviceMac(i);
            assertTrue(result.getMac() != null);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    /**
     * Test of setOntToOlt method, of class KeymileGponDslam.
     */
    @Test
    public void testSetOntToOlt() {
        System.out.println("setOntToOlt");
        try {
            SerialOntGpon s = new SerialOntGpon();
            s.setSerial("PACED8A7CD4B");
            SerialOntGpon result = instance.setOntToOlt(i, s);
            assertTrue(result.getSerial().equalsIgnoreCase("PACED8A7CD4B"));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    /**
     * Test of setEstadoDaPorta method, of class KeymileGponDslam.
     */
    @Test
    public void testSetEstadoDaPorta() throws Exception {
        System.out.println("setEstadoDaPorta");
        EstadoDaPorta e = new EstadoDaPorta();
        e.setAdminState("Up");
        try {
            EstadoDaPorta result = instance.setEstadoDaPorta(i, e);
            assertTrue(result.getAdminState().equals("Up"));
        } catch (Exception ex) {
            ex.printStackTrace();
            fail();
        }
    }

    /**
     * Test of createVlanBanda method, of class KeymileGponDslam.
     */
    @Test
    public void testCreateVlanBanda() {
        System.out.println("createVlanBanda");
        try {
            VlanBanda result = instance.createVlanBanda(i, null, null);
            assertTrue(!result.getSvlan().equals(0));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    /**
     * Test of deleteVlanBanda method, of class KeymileGponDslam.
     */
    @Test
    public void testDeleteVlanBanda() {
        System.out.println("deleteVlanBanda");
        try {
            instance.deleteVlanBanda(i);
            assertTrue(instance.getVlanBanda(i).getSvlan().equals(0));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    /**
     * Test of createVlanVoip method, of class KeymileGponDslam.
     */
    @Test
    public void testCreateVlanVoip() {
        System.out.println("createVlanVoip");
        try {
            VlanVoip result = instance.createVlanVoip(i);
            assertTrue(result.getSvlan().equals(i.getVlanVoip()));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    /**
     * Test of deleteVlanVoip method, of class KeymileGponDslam.
     */
    @Test
    public void testDeleteVlanVoip() {
        System.out.println("deleteVlanVoip");
        try {
            instance.deleteVlanVoip(i);
            assertTrue(instance.getVlanVoip(i).getSvlan().equals(0));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

    }

    /**
     * Test of createVlanVod method, of class KeymileGponDslam.
     */
    @Test
    public void testCreateVlanVod() {
        System.out.println("createVlanVod");
        try {
            VlanVod result = instance.createVlanVod(i);
            assertTrue(result.getSvlan().equals(i.getVlanVod()));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    /**
     * Test of deleteVlanVod method, of class KeymileGponDslam.
     */
    @Test
    public void testDeleteVlanVod() {
        System.out.println("deleteVlanVod");
        try {
            instance.deleteVlanVod(i);
            assertTrue(instance.getVlanVod(i).getSvlan().equals(0));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

    }

    /**
     * Test of createVlanMulticast method, of class KeymileGponDslam.
     */
    @Test
    public void testCreateVlanMulticast() {
        System.out.println("createVlanMulticast");
        try {
            VlanMulticast result = instance.createVlanMulticast(i);
            assertTrue(result.getSvlan().equals(4000));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    /**
     * Test of deleteVlanMulticast method, of class KeymileGponDslam.
     */
    @Test
    public void testDeleteVlanMulticast() {
        System.out.println("deleteVlanMulticast");
        try {
            instance.deleteVlanMulticast(i);
            assertTrue(instance.getVlanMulticast(i).getSvlan().equals(0));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

    }

    /**
     * Test of unsetOntFromOlt method, of class KeymileGponDslam.
     */
    @Test
    public void testUnsetOntFromOlt() throws Exception {
        System.out.println("unsetOntFromOlt");
        try {
            instance.unsetOntFromOlt(i);
            assertTrue(instance.getSerialOnt(i).getSerial().equalsIgnoreCase("ABCD00000000"));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    /**
     * Test of setProfileDown method, of class KeymileGponDslam.
     */
    @Test
    public void testSetProfileDown() {
        System.out.println("setProfileDown");
        try {
            instance.setProfileDown(i, Velocidades.VEL_51200);
            assertTrue(instance.getProfile(i)!=null);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

    }

    /**
     * Test of setProfileUp method, of class KeymileGponDslam.
     */
    @Test
    public void testSetProfileUp() {
        System.out.println("setProfileUp");
        try {
            instance.setProfileUp(i, Velocidades.VEL_51200, Velocidades.VEL_25600);
            assertTrue(instance.getProfile(i)!=null);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    /**
     * Test of getSlotsAvailableOnts method, of class KeymileGponDslam.
     */
    @Test
    public void testGetSlotsAvailableOnts() {
        System.out.println("getSlotsAvailableOnts");
        try {
            List<SerialOntGpon> result = instance.getSlotsAvailableOnts(i);
            for (SerialOntGpon serialOntGpon : result) {
                System.out.println(serialOntGpon.getSerial());
            }
            assertTrue(result!=null);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    

}
