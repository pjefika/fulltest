/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.factory;

import dao.dslam.impl.AbstractDslam;
import dao.dslam.impl.gpon.keymile.KeymileGponDslam;
import dao.dslam.impl.gpon.zhone.ZhoneGponDslam;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author g0042204
 */
public class DslamGponDAOFactoryTest {

    public DslamGponDAOFactoryTest() {
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
     * Test of getInstance method, of class DslamGponDAOFactory.
     */
    @Test
    public void keymileGPON() throws Exception {
        String modelo = "SUGP1";
        String ip = "10.200.35.66";
        DslamGponDAOFactory instance = new DslamGponDAOFactory();
        AbstractDslam expResult = new KeymileGponDslam(ip);
        AbstractDslam result = instance.getInstance(modelo, ip);
        assertEquals(expResult.getClass(), result.getClass());
    }

    @Test
    public void zhoneGPON() throws Exception {
        String modelo = "GPON_CARD8";
        String ip = "10.200.35.66";
        DslamGponDAOFactory instance = new DslamGponDAOFactory();
        AbstractDslam expResult = new ZhoneGponDslam(ip);
        AbstractDslam result = instance.getInstance(modelo, ip);
        assertEquals(expResult.getClass(), result.getClass());
    }

}
