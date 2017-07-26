/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manobra.asserts.facade;

import br.net.gvt.efika.customer.CustomerAssert;
import br.net.gvt.efika.customer.EfikaCustomer;
import java.util.List;
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
public class AssertterManobraIT {

    private final EfikaCustomer cust = CustomerMock.getCustomer("4130222839");

    public AssertterManobraIT() {
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
     * Test of assertThese method, of class Assertter.
     */
    @Test
    public void testAssertThese() throws Exception {
        try {
            System.out.println("assertThese");
            Assertter instance = new AssertsManobra(cust);
            List<CustomerAssert> result = instance.assertThese();

            result.forEach((t) -> {
                System.out.println("Assert: " + t.getAsserts().name() + " | R: " + t.getValue());
            });

            assertTrue(!result.isEmpty());
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

}
