/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.fulltest.exception.DslamNaoImplException;
import br.net.gvt.efika.fulltest.model.fulltest.ValidacaoResult;
import dao.dslam.factory.DslamDAOFactory;
import java.util.Locale;
import model.fulltest.operacional.CustomerMock;
import model.validacao.impl.realtime.Validador;
import model.validacao.impl.realtime.ValidadorVlanBanda;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author G0042204
 */
public class ValidacaoVlanBandaIT {

    private final EfikaCustomer cust = CustomerMock.getCustomer("4130222839");

    public ValidacaoVlanBandaIT() {
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
    public void testSomeMethod() throws Exception {

        try {
            Validador v = new ValidadorVlanBanda(DslamDAOFactory.getInstance(cust.getRede()), cust, new Locale("co", "CO"));
            ValidacaoResult r = v.validar();
            System.out.println("d");
            assertTrue(r.getResultado());
        } catch (DslamNaoImplException e) { 
            e.printStackTrace();
        }

    }

}
