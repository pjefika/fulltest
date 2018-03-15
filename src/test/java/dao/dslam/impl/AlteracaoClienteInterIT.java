/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.efika_customer.model.customer.InventarioRede;
import br.net.gvt.efika.fulltest.model.telecom.properties.EstadoDaPorta;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanBanda;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanMulticast;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanVod;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanVoip;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.Velocidades;
import dao.dslam.factory.DslamDAOFactory;
import dao.dslam.factory.exception.DslamNaoImplException;
import dao.dslam.impl.gpon.DslamGpon;
import dao.dslam.impl.metalico.DslamMetalico;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class AlteracaoClienteInterIT {

    DslamGpon instance;
    EfikaCustomer ec;
    InventarioRede i;

    public AlteracaoClienteInterIT() {
        ec = CustomerMock.getCustomer("4133721441");
        i = ec.getRede();
        try {
            instance = (DslamGpon) DslamDAOFactory.getInstance(ec.getRede().getModeloDslam(), ec.getRede().getIpDslam());
        } catch (DslamNaoImplException ex) {
            Logger.getLogger(AlteracaoClienteInterIT.class.getName()).log(Level.SEVERE, null, ex);
        }
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
     * Test of setEstadoDaPorta method, of class AlteracaoClienteInter.
     */
    @Test
    public void testSetEstadoDaPorta() {
        System.out.println("setEstadoDaPorta");
        EstadoDaPorta e = new EstadoDaPorta();
        e.setAdminState(Boolean.FALSE);
        try {
            EstadoDaPorta result = instance.setEstadoDaPorta(i, e);
            assertTrue(result.getAdminState());
        } catch (Exception ex) {
            fail(ex.getMessage());
        }

    }

    /**
     * Test of setProfileDown method, of class AlteracaoClienteInter.
     */
    @Test
    public void testSetProfileDown() {
        System.out.println("setProfileDown");

        Velocidades v = Velocidades.valueOf("VEL_" + ec.getServicos().getVelDown());
        try {
            instance.setProfileDown(i, v);
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

    /**
     * Test of setProfileUp method, of class AlteracaoClienteInter.
     */
    @Test
    public void testSetProfileUp() {
        System.out.println("setProfileUp");

        Velocidades vDown = Velocidades.valueOf("VEL_" + ec.getServicos().getVelDown());
        Velocidades vUp = Velocidades.valueOf("VEL_" + ec.getServicos().getVelDown());
        try {
            instance.setProfileUp(i, vDown, vUp);
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

    /**
     * Test of createVlanBanda method, of class AlteracaoClienteInter.
     */
    @Test
    public void testCreateVlanBanda() {
        System.out.println("createVlanBanda");

        Velocidades vDown = Velocidades.valueOf("VEL_" + ec.getServicos().getVelDown());
        Velocidades vUp = Velocidades.valueOf("VEL_" + ec.getServicos().getVelDown());
        try {
            VlanBanda result = instance.createVlanBanda(i, vDown, vUp);
            assertTrue(!result.getCvlan().equals("0"));
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

    /**
     * Test of createVlanVoip method, of class AlteracaoClienteInter.
     */
    @Test
    public void testCreateVlanVoip() {
        System.out.println("createVlanVoip");

        try {
            VlanVoip result = instance.createVlanVoip(i);
            assertTrue(!result.getCvlan().equals("0"));
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    /**
     * Test of createVlanVod method, of class AlteracaoClienteInter.
     */
    @Test
    public void testCreateVlanVod() {
        System.out.println("createVlanVod");

        try {
            VlanVod result = instance.createVlanVod(i);
            assertTrue(!result.getCvlan().equals("0"));
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    /**
     * Test of createVlanMulticast method, of class AlteracaoClienteInter.
     */
    @Test
    public void testCreateVlanMulticast() throws Exception {
        System.out.println("createVlanMulticast");

        try {
            VlanMulticast result = instance.createVlanMulticast(i);
            assertTrue(!result.getCvlan().equals("0"));
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    /**
     * Test of deleteVlanBanda method, of class AlteracaoClienteInter.
     */
    @Test
    public void testDeleteVlanBanda() {
        System.out.println("deleteVlanBanda");
        try {
            instance.deleteVlanBanda(i);
        } catch (Exception e) {
            e.printStackTrace();
            fail(e.getMessage());
        }

    }

    /**
     * Test of deleteVlanVoip method, of class AlteracaoClienteInter.
     */
    @Test
    public void testDeleteVlanVoip() {
        System.out.println("deleteVlanVoip");
        try {
            instance.deleteVlanVoip(i);
        } catch (Exception e) {
            e.printStackTrace();
            fail(e.getMessage());
        }
    }

    /**
     * Test of deleteVlanVod method, of class AlteracaoClienteInter.
     */
    @Test
    public void testDeleteVlanVod() {
        System.out.println("deleteVlanVod");
        try {
            instance.deleteVlanVod(i);
        } catch (Exception e) {
            e.printStackTrace();
            fail(e.getMessage());
        }
    }

    /**
     * Test of deleteVlanMulticast method, of class AlteracaoClienteInter.
     */
    @Test
    public void testDeleteVlanMulticast() {
        System.out.println("deleteVlanMulticast");
        try {
            instance.deleteVlanMulticast(i);
        } catch (Exception e) {
            e.printStackTrace();
            fail(e.getMessage());
        }
    }

    /**
     * Test of desconectar method, of class AlteracaoClienteInter.
     */
    @Test
    public void testDesconectar() {
        System.out.println("desconectar");
        instance.desconectar();
    }
}
