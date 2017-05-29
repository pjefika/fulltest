/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests.tdd.consultas.metalico.zhone.mxk;

import com.google.gson.Gson;
import java.math.BigInteger;
import model.dslam.consulta.VlanBanda;
import dao.dslam.metalico.zhone.ZhoneMetalicoComboDslam;
import dao.dslam.metalico.zhone.ZhoneMetalicoDslam;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author G0042204
 */
public class VlanBandaJUnitTest {

    public VlanBandaJUnitTest() {
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
    public void consultarVlanBanda() {
        try {

            ZhoneMetalicoDslam d = new ZhoneMetalicoComboDslam();
            d.setIpDslam("10.151.12.40");
            d.setSlot(new BigInteger("8"));
            d.setPorta(new BigInteger("12"));
            d.setP100("208");
            d.setP100("1195");
  
            VlanBanda v = d.getVlanBanda();

            Gson g = new Gson();

            System.out.println(g.toJson(v));

            d.desconectar();

            assertTrue(true);
        } catch (Exception e) {
            e.printStackTrace();
            assertTrue(false);
        }
    }
}
