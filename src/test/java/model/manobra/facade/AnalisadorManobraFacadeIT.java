/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manobra.facade;

import java.util.List;
import model.manobra.analitcs.AnaliseMotivo;
import model.manobra.analitcs.ConclusaoManobraEnum;
import model.manobra.analitcs.FinalizacaoManobra;
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
public class AnalisadorManobraFacadeIT {
    
    public AnalisadorManobraFacadeIT() {
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
     * Test of analisar method, of class AnalisadorManobraFacade.
     */
    @Test
    public void testAnalisar() {
        System.out.println("analisar");
        AnalisadorManobraFacade instance = null;
        FinalizacaoManobra expResult = null;
        FinalizacaoManobra result = instance.analisar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class AnalisadorManobraFacade.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        AnalisadorManobraFacade instance = null;
        List<AnaliseMotivo> expResult = null;
        List<AnaliseMotivo> result = instance.run();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of processar method, of class AnalisadorManobraFacade.
     */
    @Test
    public void testProcessar() {
        System.out.println("processar");
        List<AnaliseMotivo> an = null;
        AnalisadorManobraFacade instance = null;
        AnaliseMotivo expResult = null;
        AnaliseMotivo result = instance.processar(an);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarNecessidadeManobra method, of class AnalisadorManobraFacade.
     */
    @Test
    public void testVerificarNecessidadeManobra() {
        System.out.println("verificarNecessidadeManobra");
        ConclusaoManobraEnum c = null;
        AnalisadorManobraFacade instance = null;
        Boolean expResult = null;
        Boolean result = instance.verificarNecessidadeManobra(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
