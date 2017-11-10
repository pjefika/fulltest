/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.fulltest;

import dao.FactoryDAO;
import dao.InterfaceDAO;
import java.util.Calendar;
import model.entity.FulltestGenericEntity;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author G0042204
 */
public class FulltestGenericDAOIT {
    
    private InterfaceDAO<FulltestGenericEntity> instance = FactoryDAO.createFtDAO();
    
    public FulltestGenericDAOIT() {
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
     * Test of buscarPorId method, of class FulltestGenericDAO.
     */
    @Test
    public void testBuscarPorId() throws Exception {
        FulltestGenericEntity t = new FulltestGenericEntity();
        t.setId(1);
        assertTrue(instance.buscarPorId(t) != null);
    }

    /**
     * Test of cadastrar method, of class FulltestGenericDAO.
     */
    @Test
    public void testCadastrar() throws Exception {
        System.out.println("cadastrar");
        try {
            FulltestGenericEntity t = new FulltestGenericEntity("customer",
                    "valids",
                    Boolean.TRUE,
                    Calendar.getInstance(),
                    Calendar.getInstance(), "mensagem");
            FulltestGenericDAO instance = new FulltestGenericDAO();
            
            instance.cadastrar(t);
            
            assertTrue(t.getId() != null);
            
        } catch (Exception e) {
            fail(e.getMessage());
        }
        
    }
    
}
