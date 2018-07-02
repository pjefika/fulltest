/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.realtime;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.fulltest.model.telecom.properties.ValidavelAbs;
import dao.dslam.impl.gpon.huawei.HuaweiGponDslamVivo1;
import java.util.Locale;
import model.fulltest.operacional.CustomerMock;
import model.validacao.impl.both.Validacao;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author G0041775
 */
public class CorretorSerialOntGponIT {
    
    public CorretorSerialOntGponIT() {
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
     * Test of getObject method, of class CorretorSerialOntGpon.
     */
    @Test
    public void testGetObject() {
        System.out.println("getObject");
        CorretorSerialOntGpon instance = null;
        ValidavelAbs expResult = null;
        ValidavelAbs result = instance.getObject();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of corrigir method, of class CorretorSerialOntGpon.
     */
    @Test
    public void testCorrigir() throws Exception {
        System.out.println("corrigir");
        
        CorretorSerialOntGpon instance = new CorretorSerialOntGpon(new HuaweiGponDslamVivo1(CustomerMock.gponHuaweiV1().getRede().getIpDslam()), CustomerMock.gponHuaweiV1(), new Locale("co", "CO"));
        instance.consultar();
        System.out.println("");
    }

    /**
     * Test of consultar method, of class CorretorSerialOntGpon.
     */
    @Test
    public void testConsultar() throws Exception {
        System.out.println("consultar");
        CorretorSerialOntGpon instance = null;
        Validacao expResult = null;
        Validacao result = instance.consultar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fraseCorrecaoOk method, of class CorretorSerialOntGpon.
     */
    @Test
    public void testFraseCorrecaoOk() {
        System.out.println("fraseCorrecaoOk");
        CorretorSerialOntGpon instance = null;
        String expResult = "";
        String result = instance.fraseCorrecaoOk();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fraseFalhaCorrecao method, of class CorretorSerialOntGpon.
     */
    @Test
    public void testFraseFalhaCorrecao() {
        System.out.println("fraseFalhaCorrecao");
        CorretorSerialOntGpon instance = null;
        String expResult = "";
        String result = instance.fraseFalhaCorrecao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
