/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.gpon.keymile;

import br.net.gvt.efika.customer.EfikaCustomer;
import br.net.gvt.efika.customer.InventarioRede;
import java.util.ArrayList;
import java.util.List;
import model.fulltest.operacional.CustomerMock;
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
import telecom.properties.gpon.AlarmesGpon;
import telecom.properties.gpon.SerialOntGpon;
import telecom.properties.gpon.TabelaParametrosGpon;
import telecom.velocidade.VelocidadeVendor;
import util.GsonUtil;

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

//    KeymileGponDslam instance = new KeymileGponDslam(CustomerMock.gponKeymile().getRede().getIpDslam());
    EfikaCustomer cust = CustomerMock.getCustomer("6239327446");
    InventarioRede i = cust.getRede();
    KeymileGponDslam instance = new KeymileGponDslam(i.getIpDslam());

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
        System.out.println(i.getSlot() + " " + i.getPorta());
        try {
            SerialOntGpon result = instance.getSerialOnt(i);
            System.out.println(result.getSerial());
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
            System.out.println(GsonUtil.serialize(result));
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
            System.out.println(GsonUtil.serialize(result));
            assertTrue(result.validar(cust));
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
            System.out.println(GsonUtil.serialize(result));
            assertTrue(result.validar(cust));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    /**
     * Test of ResetIptvStatistics method, of class KeymileGponDslam.
     */
    @Test
    public void testResetIptvStatistics() throws Exception {
        System.out.println("ResetIptvStatistics");
        try {
            instance.resetIptvStatistics(i);
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
            System.out.println(GsonUtil.serialize(result));
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
            s.setSerial("PACED8A69E13");
            SerialOntGpon result = instance.setOntToOlt(i, s);
            assertTrue(result.getSerial().equalsIgnoreCase("PACED8A69E13"));
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
        e.setAdminState(Boolean.TRUE);
        try {
            EstadoDaPorta result = instance.setEstadoDaPorta(i, e);
            assertTrue(result.getAdminState());
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
            assertTrue(instance.getSerialOnt(i).getSerial().equalsIgnoreCase(""));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    /**
     * Test of setProfileDown method, of class KeymileGponDslam.
     */
    @Test
    public void testSetProfileDown() throws Exception {
        System.out.println("setProfileDown");
        Profile p = instance.getProfile(i);
        List<String> errors = new ArrayList<>();
        for (VelocidadeVendor vDown : instance.obterVelocidadesDownVendor()) {
            try {
                instance.setProfileDown(i, vDown.getVel());
                System.out.println(GsonUtil.serialize(instance.getProfile(i)));

            } catch (Exception e) {
                errors.add(vDown.getVel().name() + "-" + e.getMessage());
            }
        }
        assertTrue(errors.isEmpty());

    }

    /**
     * Test of setProfileUp method, of class KeymileGponDslam.
     */
    @Test
    public void testSetProfileUp() throws Exception {
        System.out.println("setProfileUp");
        Profile p = instance.getProfile(i);
        List<String> errors = new ArrayList<>();
        for (VelocidadeVendor vUp : instance.obterVelocidadesUpVendor()) {
            try {
                instance.setProfileUp(i, p.getDown(), vUp.getVel());
                System.out.println(GsonUtil.serialize(instance.getProfile(i)));

            } catch (Exception e) {
                errors.add(vUp.getVel().name() + "-" + e.getMessage());
            }
        }
        errors.forEach((t) -> {
            System.out.println(t);
        });
        assertTrue(errors.isEmpty());
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
                System.out.println(GsonUtil.serialize(serialOntGpon));
            }
            assertTrue(result != null);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    /**
     * Test of getEstadoPortasProximas method, of class KeymileGponDslam.
     */
    @Test
    public void testGetEstadoPortasProximas() {
        System.out.println("getSlotsAvailableOnts");

        try {
            List<Porta> result = instance.getEstadoPortasProximas(i);
            for (Porta porta : result) {
                System.out.println(GsonUtil.serialize(porta));
            }
            assertTrue(result != null);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

}
