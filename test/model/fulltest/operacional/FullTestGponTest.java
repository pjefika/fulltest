/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional;

import model.fulltest.operacional.facade.FullTestInterface;
import br.net.gvt.efika.customer.EfikaCustomer;
import model.fulltest.operacional.facade.FullTestCOFacade;
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

    private final EfikaCustomer cust = CustomerMock.getCustomer("3136691162");

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
//            FullTestGponFacade instance = new FullTestFacade(CustomerMock.getCustomer("7932321318"));
            Boolean expResult = true;
            FullTest f = instance.executar(cust);

            f.getValids().forEach((valid) -> {
                System.out.println("Nome: " + valid.getNome() + " "
                        + "|  Resultado: " + valid.getResultado() + " "
                        + "|  Mensagem: " + valid.getMensagem());
            });
            
            System.out.println(f.getMensagem());

            assertEquals(expResult, f.getResultado());
        } catch (Exception e) {
            e.printStackTrace();
            fail(e.getMessage());
        }
    }

}
