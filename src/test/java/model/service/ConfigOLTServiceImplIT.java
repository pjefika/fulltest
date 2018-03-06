/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.fulltest.model.telecom.config.ConfiguracaoOLT;
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

    private static EfikaCustomer cust = CustomerMock.getCustomer("3125211148");

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

}
