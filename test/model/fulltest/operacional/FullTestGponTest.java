/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional;

import br.net.gvt.efika.customer.EfikaCustomer;
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

    private EfikaCustomer cust = CustomerMock.getCustomer("1630107429");
    
    /**
     * Test of validar method, of class FullTestGpon.
     */
    @Test
    public void testValidar() {

        try {
//zhone - 1630103256
//2135562376
            FullTestGponFacade instance = new FullTestGponFacade(cust);
//            FullTestGponFacade instance = new FullTestCorrectiveGponFacade(CustomerMock.getCustomer("7932321318"));
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

    /**
     * Test of validar method, of class FullTestGpon.
     */
    @Test
    public void testValidarCorrective() {

        try {
//zhone - 1630103256
//2135562376
//            FullTestGponFacade instance = new FullTestGponFacade(CustomerMock.getCustomer("7932321318"));
            FullTestGponFacade instance = new FullTestCorrectiveGponFacade(cust);
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
    
    /**
     * Test of validar method, of class FullTestGpon.
     */
    @Test
    public void testValidarMetalico() {

        try {

            FullTestMetalicoFacade instance = new FullTestMetalicoFacade(CustomerMock.getCustomer("4130222839"));

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
