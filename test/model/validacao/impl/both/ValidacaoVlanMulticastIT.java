/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.both;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author g0042204
 */
public class ValidacaoVlanMulticastIT {
    
    public ValidacaoVlanMulticastIT() {
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
     * Test of frasePositiva method, of class ValidacaoVlanMulticast.
     */
    @Test
    public void testFrasePositiva() {
        System.out.println("frasePositiva");
        ValidacaoVlanMulticastComPacotes instance = null;
        String expResult = "";
        String result = instance.frasePositiva();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fraseNegativa method, of class ValidacaoVlanMulticast.
     */
    @Test
    public void testFraseNegativa() {
        System.out.println("fraseNegativa");
        ValidacaoVlanMulticastComPacotes instance = null;
        String expResult = "";
        String result = instance.fraseNegativa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
