/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime.metalico;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.factory.DslamDAOFactory;
import model.validacao.Validator;
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
public class ValidacaoRtEstadoAdmPortaIT {

    private EfikaCustomer cust = CustomerTest.create();

    public ValidacaoRtEstadoAdmPortaIT() {
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
     * Test of validar method, of class ValidacaoRtEstadoAdmPorta.
     */
    @Test
    public void testValidar() {

        try {
            Validator instance = new ValidacaoRtEstadoAdmPorta(DslamDAOFactory.getInstance(cust.getRede()), cust);
            Boolean expResult = true;
            Boolean result = instance.validar();
            assertEquals(expResult, result);
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

}
