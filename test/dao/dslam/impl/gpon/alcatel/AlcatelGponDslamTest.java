/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.gpon.alcatel;

import br.net.gvt.efika.customer.EfikaCustomer;
import br.net.gvt.efika.customer.InventarioRede;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import model.dslam.velocidade.VelocidadeVendor;
import model.dslam.velocidade.Velocidades;
import model.fulltest.operacional.CustomerMock;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import util.GsonUtil;

/**
 *
 * @author G0041775
 */
public class AlcatelGponDslamTest {

    /**
     * 2430282756 - Ready | 5137240278 - Falha Leitura
     */
    private static EfikaCustomer cust = CustomerMock.getCustomer("1133605807");
    private static AlcatelGponDslam instance = new AlcatelGponDslam(cust.getRede().getIpDslam());
    private static InventarioRede i = cust.getRede();

    public AlcatelGponDslamTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        try {
            instance.conectar();
        } catch (Exception ex) {
            Logger.getLogger(AlcatelGponDslamTest.class.getName()).log(Level.SEVERE, null, ex);
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

    /**
     * Test of getTabelaParametros method, of class AlcatelGponDslam.
     */
    @Test
    public void testGetTabelaParametros() {
        System.out.println("getTabelaParametros");
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
        try {
            SerialOntGpon result = instance.getSerialOnt(i);
            assertTrue(result.getSerial() != null);
            System.out.println("");
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

        try {
            Profile result = instance.getProfile(i);
            System.out.println(GsonUtil.serialize(result));
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

        try {
            EstadoDaPorta e = new EstadoDaPorta();
            e.setAdminState(Boolean.TRUE);
            EstadoDaPorta result = instance.setEstadoDaPorta(i, e);

            assertTrue(result.getAdminState());
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

        try {
//            SerialOntGpon s = instance.getSerialOnt(i);
            SerialOntGpon s = new SerialOntGpon();
            s.setSerial("MSTC2AEA625C");
            SerialOntGpon result = instance.setOntToOlt(i, s);
            assertTrue(result.getSerial() != null);
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

    /**
     * Test of unsetOntToOlt method, of class AlcatelGponDslam.
     */
    @Test
    public void testUnsetOntToOlt() throws Exception {
        System.out.println("unsetOntToOlt");

        SerialOntGpon s = instance.getSerialOnt(i);
        try {
            instance.unsetOntFromOlt(i);
            Boolean leBoolean = instance.getSerialOnt(i).getSerial().equals("ALCL00000000");
            instance.setOntToOlt(i, s);
            assertTrue(leBoolean);
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

    /**
     * Test of setProfileDown method, of class AlcatelGponDslam.
     */
    @Test
    public void testSetProfileDown() throws Exception {
        System.out.println("setProfileDown");
        Profile p = instance.getProfile(i);
        List<String> errors = new ArrayList<>();
//        for (VelocidadeVendor vDown : instance.obterVelocidadesDownVendor()) {
//            try {
                instance.setProfileDown(i, Velocidades.VEL_10240);
                System.out.println(GsonUtil.serialize(instance.getProfile(i)));

//            } catch (Exception e) {
//                errors.add(vDown.getVel().name() + "-" + e.getMessage());
//            }
//        }
        assertTrue(errors.isEmpty());

    }

    /**
     * Test of setProfileUp method, of class AlcatelGponDslam.
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
        assertTrue(errors.isEmpty());

    }

    /**
     * Test of deleteVlanBanda method, of class AlcatelGponDslam.
     */
    @Test
    public void testDeleteVlanBanda() {
        System.out.println("deleteVlanBanda");

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

        try {
            VlanBanda result = instance.createVlanBanda(i, null, null);
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

        try {
            VlanMulticast result = instance.createVlanMulticast(i);
            assertTrue(result.getSvlan() != 0);
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

    /**
     * Test of getSlotsAvailableOnts method, of class AlcatelGponDslam.
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
//            fail(e.getMessage());
        }

    }

}
