/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl;

import br.net.gvt.efika.customer.EfikaCustomer;
import br.net.gvt.efika.customer.InventarioRede;
import dao.dslam.factory.DslamDAOFactory;
import dao.dslam.factory.exception.DslamNaoImplException;
import dao.dslam.impl.metalico.DslamMetalico;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.dslam.consulta.EstadoDaPorta;
import model.dslam.consulta.VlanBanda;
import model.dslam.consulta.VlanMulticast;
import model.dslam.consulta.VlanVod;
import model.dslam.consulta.VlanVoip;
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
public class AlteracaoClienteInterIT {

    DslamMetalico instance;
    EfikaCustomer ec;
    InventarioRede i;

    public AlteracaoClienteInterIT() {
        ec = CustomerMock.getCustomer("7133817337");
        i = ec.getRede();
        try {
            instance = (DslamMetalico) DslamDAOFactory.getInstance(ec.getRede().getModeloDslam(), ec.getRede().getIpDslam());
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
        String leState = "up";

        EstadoDaPorta e = new EstadoDaPorta();
        e.setAdminState(leState);
        try {
            EstadoDaPorta result = instance.setEstadoDaPorta(i, e);
            assertTrue(result.getAdminState().equalsIgnoreCase(leState));
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
    public void testCreateVlanBanda() throws Exception {
        System.out.println("createVlanBanda");

        Velocidades vDown = null;
        Velocidades vUp = null;

        VlanBanda expResult = null;
        VlanBanda result = instance.createVlanBanda(i, vDown, vUp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createVlanVoip method, of class AlteracaoClienteInter.
     */
    @Test
    public void testCreateVlanVoip() throws Exception {
        System.out.println("createVlanVoip");

        VlanVoip expResult = null;
        VlanVoip result = instance.createVlanVoip(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createVlanVod method, of class AlteracaoClienteInter.
     */
    @Test
    public void testCreateVlanVod() throws Exception {
        System.out.println("createVlanVod");

        VlanVod expResult = null;
        VlanVod result = instance.createVlanVod(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createVlanMulticast method, of class AlteracaoClienteInter.
     */
    @Test
    public void testCreateVlanMulticast() throws Exception {
        System.out.println("createVlanMulticast");

        VlanMulticast expResult = null;
        VlanMulticast result = instance.createVlanMulticast(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteVlanBanda method, of class AlteracaoClienteInter.
     */
    @Test
    public void testDeleteVlanBanda() throws Exception {
        System.out.println("deleteVlanBanda");

        instance.deleteVlanBanda(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteVlanVoip method, of class AlteracaoClienteInter.
     */
    @Test
    public void testDeleteVlanVoip() throws Exception {
        System.out.println("deleteVlanVoip");

        instance.deleteVlanVoip(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteVlanVod method, of class AlteracaoClienteInter.
     */
    @Test
    public void testDeleteVlanVod() throws Exception {
        System.out.println("deleteVlanVod");

        instance.deleteVlanVod(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteVlanMulticast method, of class AlteracaoClienteInter.
     */
    @Test
    public void testDeleteVlanMulticast() throws Exception {
        System.out.println("deleteVlanMulticast");

        instance.deleteVlanMulticast(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of desconectar method, of class AlteracaoClienteInter.
     */
    @Test
    public void testDesconectar() {
        System.out.println("desconectar");

        instance.desconectar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
