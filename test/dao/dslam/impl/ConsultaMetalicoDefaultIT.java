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
import model.dslam.consulta.Profile;
import model.dslam.consulta.VlanBanda;
import model.dslam.consulta.VlanMulticast;
import model.dslam.consulta.VlanVod;
import model.dslam.consulta.VlanVoip;
import model.dslam.consulta.metalico.Modulacao;
import model.dslam.consulta.metalico.TabelaParametrosMetalico;
import model.dslam.consulta.metalico.TabelaRedeMetalico;
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
public class ConsultaMetalicoDefaultIT {

    private static DslamMetalico instance;
    private static EfikaCustomer ec = CustomerMock.getCustomer("1122297805");
    private static InventarioRede i = ec.getRede();

    public ConsultaMetalicoDefaultIT() {
    }

    @BeforeClass
    public static void setUpClass() throws DslamNaoImplException {
        instance = (DslamMetalico) DslamDAOFactory.getInstance(ec.getRede().getModeloDslam(), ec.getRede().getIpDslam());
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
     * Test of getTabelaParametros method, of class ConsultaMetalicoDefault.
     */
    @Test
    public void testGetTabelaParametros() {
        System.out.println("getTabelaParametros");
        try {
            TabelaParametrosMetalico result = instance.getTabelaParametros(i);
            assertTrue(result != null);
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

    /**
     * Test of getTabelaRede method, of class ConsultaMetalicoDefault.
     */
    @Test
    public void testGetTabelaRede() {
        System.out.println("getTabelaRede");

        try {
            TabelaRedeMetalico result = instance.getTabelaRede(i);
            assertTrue(result != null);
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

    /**
     * Test of getVlanBanda method, of class ConsultaMetalicoDefault.
     */
    @Test
    public void testGetVlanBanda() {
        System.out.println("getVlanBanda");

        try {
            VlanBanda result = instance.getVlanBanda(i);
            System.out.println("e"+result.getCvlan());
            assertTrue(result != null);
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

    /**
     * Test of getVlanMulticast method, of class ConsultaMetalicoDefault.
     */
    @Test
    public void testGetVlanMulticast() {
        System.out.println("getVlanMulticast");

        try {
            VlanMulticast result = instance.getVlanMulticast(i);
            assertTrue(!result.getCvlan().equals(0));
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

    /**
     * Test of getVlanVoip method, of class ConsultaMetalicoDefault.
     */
    @Test
    public void testGetVlanVoip() {
        System.out.println("getVlanVoip");

        try {
            VlanVoip result = instance.getVlanVoip(i);
            assertTrue(!result.getCvlan().equals(0));
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

    /**
     * Test of getVlanVod method, of class ConsultaMetalicoDefault.
     */
    @Test
    public void testGetVlanVod() {
        System.out.println("getVlanVod");

        try {
            VlanVod result = instance.getVlanVod(i);
            assertTrue(!result.getCvlan().equals(0));
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

    /**
     * Test of getProfile method, of class ConsultaMetalicoDefault.
     */
    @Test
    public void testGetProfile() {
        System.out.println("getProfile");

        try {
            Profile result = instance.getProfile(i);
            assertTrue(result != null);
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

    /**
     * Test of getModulacao method, of class ConsultaMetalicoDefault.
     */
    @Test
    public void testGetModulacao() {
        System.out.println("getModulacao");

        try {
            Modulacao result = instance.getModulacao(i);
            assertTrue(result != null);
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

    /**
     * Test of getTabelaParametrosIdeal method, of class
     * ConsultaMetalicoDefault.
     */
    @Test
    public void testGetTabelaParametrosIdeal() {
        System.out.println("getTabelaParametrosIdeal");
        Velocidades v = Velocidades.valueOf("VEL_" + ec.getServicos().getVelDown());

        try {
            TabelaParametrosMetalico result = instance.getTabelaParametrosIdeal(v);
            assertTrue(result != null);
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

}
