/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional;

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
public class FullTestMetalicoManobraFacadeIT {

    private FullTestMetalicoManobraFacade instance;

    public FullTestMetalicoManobraFacadeIT() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        try {
            instance = new FullTestMetalicoManobraFacade(CustomerTest.create());
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of executar method, of class FullTestMetalicoManobraFacade.
     * @throws java.lang.Exception
     */
    @Test
    public void testExecutar() throws Exception {
        System.out.println("executar");
        FullTest result = instance.executar();
        System.out.println("End");
    }

}
