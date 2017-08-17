/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime.gpon.corretiva;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.factory.DslamDAOFactory;
import dao.dslam.factory.exception.DslamNaoImplException;
import model.fulltest.operacional.CustomerMock;
import model.fulltest.operacional.FullTest;
import model.validacao.ValidacaoResult;
import model.validacao.realtime.Corretor;
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
public class CorretorVlanBandaIT {

    private EfikaCustomer cust = CustomerMock.getCustomer("4130886762");

    public CorretorVlanBandaIT() {
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
            Corretor c = new CorretorVlanBanda(DslamDAOFactory.getInstance(cust.getRede()), cust);
            ValidacaoResult vr =  c.validar();
            System.out.println("");
            assertTrue(vr.getResultado());
        } catch (DslamNaoImplException e) {
            fail(e.getMessage());
        }

    }

}
