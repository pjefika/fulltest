/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.fulltest.model.fulltest.ValidacaoResult;
import br.net.gvt.efika.fulltest.model.telecom.config.ConfiguracaoOLT;
import br.net.gvt.efika.fulltest.model.telecom.config.ProfileGpon;
import br.net.gvt.efika.fulltest.model.telecom.properties.Porta;
import br.net.gvt.efika.fulltest.model.telecom.properties.Profile;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.SerialOntGpon;
import dao.dslam.impl.AlteracaoGponDefault;
import dao.dslam.impl.ConsultaGponDefault;
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
public class ConfigOLTServiceImplIT {

    public ConfigOLTServiceImplIT() {
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

    private static EfikaCustomer cust = CustomerMock.gponAlcatel();

    /**
     * Test of consultar method, of class ConfigOLTServiceImpl.
     */
    @Test
    public void testConsultar() throws Exception {
        System.out.println("consultar");
        ConfigOLTServiceImpl instance = new ConfigOLTServiceImpl(cust);

        ConfiguracaoOLT result = instance.consultar();

        assertTrue(result != null);
    }

    

    /**
     * Test of alteracao method, of class ConfigOLTServiceImpl.
     */
    @Test
    public void testAlteracao() throws Exception {
        System.out.println("alteracao");
        ConfigOLTServiceImpl instance = null;
        AlteracaoGponDefault expResult = null;
        AlteracaoGponDefault result = instance.alteracao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unsetterOntFromOlt method, of class ConfigOLTServiceImpl.
     */
    @Test
    public void testUnsetterOntFromOlt() throws Exception {
        System.out.println("unsetterOntFromOlt");
        ConfigOLTServiceImpl instance = null;
        List<SerialOntGpon> expResult = null;
        List<SerialOntGpon> result = instance.unsetterOntFromOlt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setterOntToOlt method, of class ConfigOLTServiceImpl.
     */
    @Test
    public void testSetterOntToOlt() throws Exception {
        System.out.println("setterOntToOlt");
        SerialOntGpon serial = null;
        ConfigOLTServiceImpl instance = null;
        ValidacaoResult expResult = null;
        ValidacaoResult result = instance.setterOntToOlt(serial);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getterEstadoPortasProximas method, of class ConfigOLTServiceImpl.
     */
    @Test
    public void testGetterEstadoPortasProximas() throws Exception {
        System.out.println("getterEstadoPortasProximas");
        ConfigOLTServiceImpl instance = null;
        List<Porta> expResult = null;
        List<Porta> result = instance.getterEstadoPortasProximas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setterProfile method, of class ConfigOLTServiceImpl.
     */
    @Test
    public void testSetterProfile() throws Exception {
        System.out.println("setterProfile");
        Profile p = null;
        ConfigOLTServiceImpl instance = null;
        ProfileGpon expResult = null;
        ProfileGpon result = instance.setterProfile(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
