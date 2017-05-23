/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.facade;

import dao.ManobraDAO;
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
public class ExisteValidacaoNegativaJUnitTest {
    
    private ManobraDAO mDao = new ManobraDAO();
    
    public ExisteValidacaoNegativaJUnitTest() {
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
    public void existeValidacao() {
        assertEquals(true, !mDao.listarValidEspecifo(new Cliente("4130886762")).isEmpty());
    }
}
