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
//            FullTestGpon instance = new FullTestGpon(CustomerMock.gponZhone1());
            Boolean expResult = true;
            Boolean result = instance.validar();

            instance.getValids().forEach((valid) -> {
                System.out.println("Nome: " + valid.getNome() + " "
                        + "|  Resultado: " + valid.getResultado() + " "
                        + "|  Mensagem: " + valid.getMensagem());
            });

            assertEquals(expResult, result);
        } catch (Exception e) {
            e.printStackTrace();
            fail("The test case is a prototype.");
        }

        // TODO review the generated test code and remove the default call to fail.
    }

}
