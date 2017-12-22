/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.realtime;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.factory.DslamDAOFactory;
import dao.dslam.impl.AbstractDslam;
import java.util.Locale;
import model.fulltest.operacional.CustomerMock;
import model.validacao.impl.both.Validacao;
import model.validacao.impl.both.ValidacaoResult;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import util.GsonUtil;
import util.LocaleFactory;

/**
 *
 * @author G0042204
 */
public class ValidadorVizinhancaIT {

    public ValidadorVizinhancaIT() {
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
     * Test of consultar method, of class ValidadorVizinhanca.
     */
    @Test
    public void testValidar() {
        try {
            System.out.println("validar");
            EfikaCustomer cust = CustomerMock.getCustomer("1138468335");
            AbstractDslam dslam = DslamDAOFactory.getInstance(cust.getRede());
            ValidadorVizinhanca instance = new ValidadorVizinhanca(dslam, cust, LocaleFactory.co());
            ValidacaoResult result = instance.validar();
            System.out.println(GsonUtil.serialize(result));
            assertTrue(result.getResultado());
        } catch (Exception e) {
            e.printStackTrace();
            fail(e.getMessage());
        }
    }

}
