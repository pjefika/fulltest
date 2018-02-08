/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional.facade;

import br.net.gvt.efika.customer.EfikaCustomer;
import model.fulltest.operacional.CustomerMock;
import model.fulltest.operacional.FullTest;
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
public class FullTestCOFacadeIT {

    private final EfikaCustomer cust = CustomerMock.getCustomer("4131543457");

    public FullTestCOFacadeIT() {
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
     * Test of executar method, of class FullTestCRMFacade.
     */
    @Test
    public void testExecutar() throws Exception {
        try {
            System.out.println("executar");
            FullTestInterface instance = new FullTestCOFacade();
            FullTest result = instance.executar(cust);
            System.out.println("end");

            assertTrue(result.getResultado());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
