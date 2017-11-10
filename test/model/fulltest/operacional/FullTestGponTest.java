/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional;

import br.net.gvt.efika.customer.EfikaCustomer;
import model.fulltest.operacional.facade.FullTestCOFacade;
import model.fulltest.operacional.facade.FullTestInterface;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author g0042204
 */
public class FullTestGponTest {

    private final EfikaCustomer cust = CustomerMock.getCustomer("8730240032");

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

    @Test
    public void testValidar() {

        try {
            //zhone - 1630103256
            //2135562376
            FullTestInterface instance = new FullTestCOFacade();
            Boolean expResult = true;

            FullTest f = instance.executar(cust);

            f.getValids().forEach((valid) -> {
                System.out.println("Nome: " + valid.getNome() + " "
                        + "|  Resultado: " + valid.getResultado() + " "
                        + "|  Mensagem: " + valid.getMensagem());
            });
            
            System.out.println(f.getMensagem());

            assertEquals(false, f.getResultado());
        } catch (Exception e) {
            System.out.println("ola");
            e.printStackTrace();
            fail(e.getMessage());
        }
    }

}
