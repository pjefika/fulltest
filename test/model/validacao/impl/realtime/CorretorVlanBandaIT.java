/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.realtime;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.factory.DslamDAOFactory;
import dao.dslam.impl.AbstractDslam;
import fulltest.ValidacaoResult;
import model.fulltest.operacional.CustomerMock;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import util.GsonUtil;
import util.LocaleFactory;

/**
 *
 * @author g0042204
 */
public class CorretorVlanBandaIT {

    public CorretorVlanBandaIT() {
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
     * Test of corrigir method, of class CorretorVlanBanda.
     */
    @Test
    public void testCorrigir() throws Exception {
        System.out.println("corrigir");
        CorretorVlanBanda instance = null;
        instance.corrigir();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fraseCorrecaoOk method, of class CorretorVlanBanda.
     */
    @Test
    public void testFraseCorrecaoOk() {
        System.out.println("fraseCorrecaoOk");
        CorretorVlanBanda instance = null;
        String expResult = "";
        String result = instance.fraseCorrecaoOk();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fraseFalhaCorrecao method, of class CorretorVlanBanda.
     */
    @Test
    public void testFraseFalhaCorrecao() {
        System.out.println("fraseFalhaCorrecao");
        CorretorVlanBanda instance = null;
        String expResult = "";
        String result = instance.fraseFalhaCorrecao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultar method, of class CorretorVlanBanda.
     */
    @Test
    public void testValidar() {
        try {
            System.out.println("consultar");
            EfikaCustomer cust = CustomerMock.getCustomer("4131543457");
            AbstractDslam dslam = DslamDAOFactory.getInstance(cust.getRede());
            CorretorVlanBanda instance = new CorretorVlanBanda(dslam, cust, LocaleFactory.co());
            ValidacaoResult result = instance.validar();
            System.out.println(GsonUtil.serialize(cust));
            System.out.println(GsonUtil.serialize(result));
            assertTrue(result.getResultado());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
