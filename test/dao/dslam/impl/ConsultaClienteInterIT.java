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
import dao.dslam.impl.gpon.DslamGpon;
import dao.dslam.impl.metalico.DslamMetalico;
import model.dslam.consulta.DeviceMAC;
import model.dslam.consulta.EstadoDaPorta;
import model.dslam.consulta.Profile;
import model.dslam.consulta.VlanBanda;
import model.dslam.consulta.VlanMulticast;
import model.dslam.consulta.VlanVod;
import model.dslam.consulta.VlanVoip;
import model.fulltest.operacional.CustomerMock;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author G0042204
 */
public class ConsultaClienteInterIT {

//    private static DslamMetalico instance;
    private static DslamGpon instance;
    private static EfikaCustomer ec = CustomerMock.getCustomer("3131769345");
    private static InventarioRede i = ec.getRede();

    public ConsultaClienteInterIT() {
    }

    @BeforeClass
    public static void setUpClass() throws DslamNaoImplException {
        instance = (DslamGpon) DslamDAOFactory.getInstance(ec.getRede().getModeloDslam(), ec.getRede().getIpDslam());
        instance.conectar();
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
     * Test of getEstadoDaPorta method, of class ConsultaClienteInter.
     */
    @Test
    public void testGetEstadoDaPorta() {
        System.out.println("getEstadoDaPorta");
        try {
            EstadoDaPorta result = instance.getEstadoDaPorta(i);
            assertTrue(result != null);
        } catch (Exception e) {
            e.printStackTrace();
            fail(e.getMessage());
        }

    }

    /**
     * Test of getDeviceMac method, of class ConsultaClienteInter.
     */
    @Test
    public void testGetDeviceMac() {
        System.out.println("getDeviceMac");
        try {
            DeviceMAC result = instance.getDeviceMac(i);
            assertTrue(result != null);
        } catch (Exception e) {
            e.printStackTrace();
            fail(e.getMessage());
        }
    }

    /**
     * Test of getProfile method, of class ConsultaClienteInter.
     */
    @Test
    public void testGetProfile() throws Exception {
        System.out.println("getProfile");
        try {
            Profile result = instance.getProfile(i);
            assertTrue(result != null);
        } catch (Exception e) {
            e.printStackTrace();
            fail(e.getMessage());
        }
    }

    /**
     * Test of getVlanBanda method, of class ConsultaClienteInter.
     */
    @Test
    public void testGetVlanBanda() {
        System.out.println("getVlanBanda");
        try {
            VlanBanda result = instance.getVlanBanda(i);
            assertTrue(result.validar(ec));
        } catch (Exception e) {
            e.printStackTrace();
            fail(e.getMessage());
        }
    }

    /**
     * Test of getVlanMulticast method, of class ConsultaClienteInter.
     */
    @Test
    public void testGetVlanMulticast() throws Exception {
        System.out.println("getVlanMulticast");
        try {
            VlanMulticast result = instance.getVlanMulticast(i);
            assertTrue(result.validar(ec));
        } catch (Exception e) {
            e.printStackTrace();
            fail(e.getMessage());
        }
    }

    /**
     * Test of getVlanVoip method, of class ConsultaClienteInter.
     */
    @Test
    public void testGetVlanVoip() throws Exception {
        System.out.println("getVlanVoip");
        try {
            VlanVoip result = instance.getVlanVoip(i);
            
            assertTrue(result.validar(ec));
        } catch (Exception e) {
            e.printStackTrace();
            fail(e.getMessage());
        }
    }

    /**
     * Test of getVlanVod method, of class ConsultaClienteInter.
     */
    @Test
    public void testGetVlanVod() throws Exception {
        System.out.println("getVlanVod");
        try {
            VlanVod result = instance.getVlanVod(i);
            assertTrue(result.validar(ec));
        } catch (Exception e) {
            e.printStackTrace();
            fail(e.getMessage());
        }
    }

}
