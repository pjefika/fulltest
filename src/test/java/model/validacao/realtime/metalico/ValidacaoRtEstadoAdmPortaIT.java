/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime.metalico;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.factory.DslamDAOFactory;
import fulltest.ValidacaoResult;
import java.util.Locale;
import model.validacao.impl.realtime.ValidadorEstadoAdmPorta;
import model.validacao.impl.realtime.Validator;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
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
     * Test of validar method, of class ValidadorRtEstadoAdmPorta.
     */
    @Test
    public void testValidar() {

        try {
            Validator instance = new ValidadorEstadoAdmPorta(DslamDAOFactory.getInstance(cust.getRede()), cust, new Locale("co", "CO"));
            Boolean expResult = true;
            ValidacaoResult r = instance.validar();
            assertEquals(expResult, r.getResultado());
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

}
