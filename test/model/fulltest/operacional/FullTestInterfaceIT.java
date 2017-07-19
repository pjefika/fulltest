/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional;

import model.fulltest.operacional.facade.FullTestInterface;
import br.net.gvt.efika.customer.EfikaCustomer;
import model.fulltest.operacional.facade.FullTestManobraFacade;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tests.CustomerTest;

/**
 *
 * @author G0042204
 */
public class FullTestInterfaceIT {

    private final EfikaCustomer cust = CustomerTest.create();

    public FullTestInterfaceIT() {
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
     * Test of exec method, of class FullTestInterface.
     */
    @Test
    public void testExecutar() {
        System.out.println("executar");
        try {
            //FullTestInterface instance = new FullTestFacade();
            FullTestInterface instance = new FullTestManobraFacade();
            FullTest result = instance.executar(cust);

            assertTrue(result.getResultado());
        } catch (Exception e) {
            e.printStackTrace();
            fail(e.getMessage());
        }
    }

}
