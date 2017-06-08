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
import tdd.consultas.CustomerMock;

/**
 *
 * @author g0042204
 */
public class FullTestGponTest {

    public FullTestGponTest() {
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
     * Test of validar method, of class FullTestGpon.
     */
    @Test
    public void testValidar() {

        try {
            FullTestGpon instance = new FullTestGpon(CustomerMock.gponKeymile());
            Boolean expResult = null;
            Boolean result = instance.validar();
            System.out.println("end");
            assertEquals(expResult, result);
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }

        // TODO review the generated test code and remove the default call to fail.
    }

}
