/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.gpon.zhone;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.efika_customer.model.customer.InventarioRede;
import br.net.gvt.efika.fulltest.model.telecom.properties.EstadoDaPorta;
import br.net.gvt.efika.fulltest.model.telecom.properties.Profile;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanBanda;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanMulticast;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanVod;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanVoip;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.AlarmesGpon;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.SerialOntGpon;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.TabelaParametrosGpon;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.VelocidadeVendor;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.Velocidades;
import java.util.ArrayList;
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
public class ZhoneGponDslamTest {

    private EfikaCustomer cl = CustomerMock.gponZhone();
    ZhoneGponDslam instance = new ZhoneGponDslam(cl.getRede().getIpDslam());
    InventarioRede i = cl.getRede();

    public ZhoneGponDslamTest() {

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

    /**
     * Test of getTabelaParametros method, of class ZhoneGponDslam.
     */
    @Test
    public void testGetTabelaParametros() {
        try {
            TabelaParametrosGpon result = instance.getTabelaParametros(cl.getRede());
            assertTrue(result.getPotOlt() != null);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    /**
     * Test of getSerialOnt method, of class ZhoneGponDslam.
     */
    @Test
    public void testGetSerialOnt() {
        System.out.println("getSerialOnt");
        try {
            SerialOntGpon result = instance.getSerialOnt(i);
            System.out.println(result.getSerial());
            assertTrue(!result.getSerial().isEmpty());
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

    }

    /**
     * Test of getEstadoDaPorta method, of class ZhoneGponDslam.
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
     * Test of getVlanBanda method, of class ZhoneGponDslam.
     */
    @Test
    public void testGetVlanBanda() throws Exception {
        System.out.println("getVlanBanda");
        try {
            VlanBanda result = instance.getVlanBanda(i);

            assertTrue(!result.getSvlan().equals(0));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    /**
     * Test of getVlanVoip method, of class ZhoneGponDslam.
     */
    @Test
    public void testGetVlanVoip() throws Exception {
        System.out.println("getVlanVoip");
        try {
            VlanVoip result = instance.getVlanVoip(i);
            assertTrue(!result.getSvlan().equals(0));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    /**
     * Test of getVlanVod method, of class ZhoneGponDslam.
     */
    @Test
    public void testGetVlanVod() throws Exception {
        System.out.println("getVlanVod");
        try {
            VlanVod result = instance.getVlanVod(i);
            assertTrue(!result.getSvlan().equals(0));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    /**
     * Test of getVlanMulticast method, of class ZhoneGponDslam.
     */
    @Test
    public void testGetVlanMulticast() throws Exception {
        System.out.println("getVlanMulticast");
        try {
            VlanMulticast result = instance.getVlanMulticast(i);
            assertTrue(!result.getSvlan().equals(0));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    /**
     * Test of getAlarmes method, of class ZhoneGponDslam.
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
     * Test of getProfile method, of class ZhoneGponDslam.
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
     * Test of setOntToOlt method, of class ZhoneGponDslam.
     */
    @Test
    public void testSetOntToOlt() {
        System.out.println("setOntToOlt");
        try {
            SerialOntGpon s = new SerialOntGpon();
            s.setSerial("SAGE000002EF");
            SerialOntGpon result = instance.setOntToOlt(i, s);
            assertTrue(result.getSerial().equalsIgnoreCase("SAGE000002EF"));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    /**
     * Test of setEstadoDaPorta method, of class ZhoneGponDslam.
     */
    @Test
    public void testSetEstadoDaPorta() {
        System.out.println("setEstadoDaPorta");
        try {
            EstadoDaPorta es = new EstadoDaPorta();
            es.setAdminState(Boolean.TRUE);
            EstadoDaPorta result = instance.setEstadoDaPorta(i, es);
            assertTrue(result.getAdminState());
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    /**
     * Test of createVlanBanda method, of class ZhoneGponDslam.
     */
    @Test
    public void testCreateVlanBanda() {
        System.out.println("createVlanBanda");
        try {
            VlanBanda result = instance.createVlanBanda(i, Velocidades.VEL_51200, Velocidades.VEL_25600);
            assertTrue(!result.getSvlan().equals(0));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    /**
     * Test of deleteVlanBanda method, of class ZhoneGponDslam.
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
     * Test of createVlanVoip method, of class ZhoneGponDslam.
     */
    @Test
    public void testCreateVlanVoip() {
        System.out.println("createVlanVoip");
        try {
            VlanVoip result = instance.createVlanVoip(i);
            assertTrue(!result.getSvlan().equals(0));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    /**
     * Test of deleteVlanVoip method, of class ZhoneGponDslam.
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
     * Test of createVlanVod method, of class ZhoneGponDslam.
     */
    @Test
    public void testCreateVlanVod() {
        System.out.println("createVlanVod");
        try {
            VlanVod result = instance.createVlanVod(i);
            assertTrue(!result.getSvlan().equals(0));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    /**
     * Test of deleteVlanVod method, of class ZhoneGponDslam.
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
     * Test of setProfileDown method, of class ZhoneGponDslam.
     */
    @Test
    public void testSetProfileDown() throws Exception {
        System.out.println("setProfileDown");
        Profile p = instance.getProfile(i);
        List<String> errors = new ArrayList<>();
        for (VelocidadeVendor vDown : instance.obterVelocidadesDownVendor()) {
            try {
                instance.setProfileDown(i, vDown.getVel());


            } catch (Exception e) {
                errors.add(vDown.getVel().name() + "-" + e.getMessage());
            }
        }
        errors.forEach((t) -> {
            System.out.println(t);
        });
        assertTrue(errors.isEmpty());
    }

    /**
     * Test of setProfileUp method, of class ZhoneGponDslam.
     */
    @Test
    public void testSetProfileUp() throws Exception {
        System.out.println("setProfileUp");
        Profile p = instance.getProfile(i);
        List<String> errors = new ArrayList<>();
        for (VelocidadeVendor vUp : instance.obterVelocidadesUpVendor()) {
            try {
                instance.setProfileUp(i, p.getDown(), vUp.getVel());


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
     * Test of getSlotsAvailableOnts method, of class ZhoneGponDslam.
     */
    @Test
    public void testGetSlotsAvailableOnts() {
        System.out.println("getSlotsAvailableOnts");
        //SAGE0000032C - lab
        try {
            List<SerialOntGpon> ls = instance.getSlotsAvailableOnts(i);
            for (SerialOntGpon l : ls) {

            }
            assertTrue(ls != null);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    /**
     * Test of unsetOntFromOlt method, of class ZhoneGponDslam.
     */
    @Test
    public void testUnsetOntFromOlt() throws Exception {
        System.out.println("unsetOntFromOlt");
        instance.unsetOntFromOlt(i);


        assertTrue(true);
    }

    @Test
    public void testC() {
        //1630144309
        EfikaCustomer ec = CustomerMock.getCustomer("2135563108");
        System.out.println(ec.getRede().getVendorDslam());
        System.out.println(ec.getRede().getModeloDslam());
        System.out.println(ec.getRede().getIpDslam());
        System.out.println(ec.getRede().getSlot());
        System.out.println(ec.getRede().getPorta());
        System.out.println(ec.getRede().getLogica());
        System.out.println(ec.getRede().getCvlan());
        System.out.println(ec.getServicos().getVelDown());
        System.out.println(ec.getServicos().getVelUp());
//        System.out.println(g.toJson(ec));
        assertTrue(ec != null);

    }

}
