/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.realtime;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.impl.metalico.zhone.ZhoneMetalicoComboDslam;
import java.util.Locale;
import model.fulltest.operacional.CustomerMock;
import model.validacao.impl.both.Validacao;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import util.GsonUtil;

/**
 *
 * @author G0041775
 */
public class CorretorEstadoAdmPortaIT {
    
    public CorretorEstadoAdmPortaIT() {
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
     * Test of getObject method, of class CorretorEstadoAdmPorta.
     */
    @Test
    public void testGetObject() {
        System.out.println("getObject");
        CorretorEstadoAdmPorta instance = null;
        Object expResult = null;
        Object result = instance.getObject();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of corrigir method, of class CorretorEstadoAdmPorta.
     */
    @Test
    public void testCorrigir() throws Exception {
        System.out.println("corrigir");
        EfikaCustomer ec = CustomerMock.getCustomer("6239416181");
        CorretorEstadoAdmPorta instance = new CorretorEstadoAdmPorta(new ZhoneMetalicoComboDslam(ec.getRede().getIpDslam()), ec, new Locale("manobra", "CO"));
        instance.corrigir();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultar method, of class CorretorEstadoAdmPorta.
     */
    @Test
    public void testConsultar() throws Exception {
        System.out.println("consultar");
        CorretorEstadoAdmPorta instance = null;
        Validacao expResult = null;
        Validacao result = instance.consultar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fraseCorrecaoOk method, of class CorretorEstadoAdmPorta.
     */
    @Test
    public void testFraseCorrecaoOk() {
        System.out.println("fraseCorrecaoOk");
        CorretorEstadoAdmPorta instance = null;
        String expResult = "";
        String result = instance.fraseCorrecaoOk();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fraseFalhaCorrecao method, of class CorretorEstadoAdmPorta.
     */
    @Test
    public void testFraseFalhaCorrecao() {
        System.out.println("fraseFalhaCorrecao");
        CorretorEstadoAdmPorta instance = null;
        String expResult = "";
        String result = instance.fraseFalhaCorrecao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
