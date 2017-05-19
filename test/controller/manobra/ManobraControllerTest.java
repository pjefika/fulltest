/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.manobra;

import model.Motivos;
import model.entity.Cliente;
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
public class ManobraControllerTest {
    
    
    
    public ManobraControllerTest() {
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
    public void testValidarManobra() {
        System.out.println("validarManobra");
        Cliente cliente = new Cliente("4130886762");
        String motivo = Motivos.SEMSINC.name();
        String atividade = "8-2LI6KSEJ";
        ManobraController instance = new ManobraController();
        instance.validarManobra(cliente, motivo, atividade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
