/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.enumsservice;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import util.GsonUtil;

/**
 *
 * @author G0041775
 */
public class EnumServiceIT {
    
    public EnumServiceIT() {
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
     * Test of getVelocidades method, of class EnumService.
     */
    @Test
    public void testGetVelocidades() {
        System.out.println("getVelocidades");
        List<Long> result = EnumService.getVelocidades();
        System.out.println(GsonUtil.serialize(result));
    }

    /**
     * Test of getTecnologiasTv method, of class EnumService.
     */
    @Test
    public void testGetTecnologiasTv() {
        System.out.println("getTecnologiasTv");
        List<String> result = EnumService.getTecnologiasTv();
        System.out.println(GsonUtil.serialize(result));
    }

    /**
     * Test of getTecnologiasVoz method, of class EnumService.
     */
    @Test
    public void testGetTecnologiasVoz() {
        System.out.println("getTecnologiasVoz");
        List<String> result = EnumService.getTecnologiasVoz();
        System.out.println(GsonUtil.serialize(result));
    }
    
}
