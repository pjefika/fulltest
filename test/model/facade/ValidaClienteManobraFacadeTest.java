/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.facade;

import model.entity.Cliente;
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
public class ValidaClienteManobraFacadeTest {

    public ValidaClienteManobraFacadeTest() {
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
     * Test of validar method, of class ValidaClienteManobraFacade.
     */
    @Test
    public void testValidar() {
        try {
            System.out.println("validar");

            Cliente cliente = new Cliente("4130886762");
            String atividade = "8-2LI6KSEJ";
            ValidaClienteManobraFacade instance = new ValidaClienteManobraSemSincFacade(cliente, atividade);
            instance.setLogin("JUnit");
            instance.validar();
            // TODO review the generated test code and remove the default call to fail.
            System.out.println("End");
            assertTrue(true);
        } catch (Exception e) {
            e.printStackTrace();
            assertTrue(false);

        }

    }

}
