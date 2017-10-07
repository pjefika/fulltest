/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.both;

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
public class ValidacaoEstadoPortaAdmIT {
    
    public ValidacaoEstadoPortaAdmIT() {
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
     * Test of getObject method, of class ValidacaoEstadoPortaAdm.
     */
    @Test
    public void testGetObject() {
        System.out.println("getObject");
        ValidacaoEstadoPortaAdm instance = null;
        Object expResult = null;
        Object result = instance.getObject();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checar method, of class ValidacaoEstadoPortaAdm.
     */
    @Test
    public void testChecar() {
        System.out.println("checar");
        ValidacaoEstadoPortaAdm instance = null;
        Boolean expResult = null;
        Boolean result = instance.checar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
