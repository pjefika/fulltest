/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional.facade;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
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
public class FullTestCRMFacadeIT {

    private final EfikaCustomer cust = CustomerMock.getCustomer("4430405872");

    public FullTestCRMFacadeIT() {
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
            FullTestCRMFacade instance = new FullTestCRMFacade();
            FullTest result = instance.executar(cust);
            System.out.println("end");

            assertTrue(result != null);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
