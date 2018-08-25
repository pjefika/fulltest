/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional.facade;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import model.fulltest.operacional.CustomerMock;
import br.net.gvt.efika.fulltest.model.fulltest.FullTest;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import util.PrintUtil;

/**
 *
 * @author G0042204
 */
public class FullTestManobraFacadeIT {

    private final EfikaCustomer cust = CustomerMock.getCustomer("6239416181");

    public FullTestManobraFacadeIT() {
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
     * Test of executar method, of class FullTestManobraFacade.
     * @throws java.lang.Exception
     */
    @Test
    public void testExecutar() throws Exception {
        try {
            System.out.println("executar");
            FullTestManobraFacade instance = new FullTestManobraFacade();
            FullTest result = instance.executar(cust);
            PrintUtil.print(result);
            assertEquals(true, result.getResultado());
        } catch (Exception e) {
            e.printStackTrace();
            fail(e.getMessage());
        }

    }

}
