/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests.tdd.consultas.gpon;

import dao.dslam.impl.gpon.alcatel.AlcatelGponDslam;
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
public class consultasGpon {

    public consultasGpon() {
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
    public void alcatel() {
        try {
            AlcatelGponDslam dslam = new AlcatelGponDslam();
            //AbstractDslam dslam = new ZhoneGponDslam();

            // ZHONE
            //dslam.setIpDslam("10.171.21.86");
            /// ALCATEL
            dslam.setIpDslam("10.171.33.150");

            assertNotEquals(dslam.getDumpRafael(), "");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void zhone() {
        assertTrue(true);

    }

    @Test
    public void keymile() {
        assertTrue(false);
    }
}
