/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests.tdd.consultas.metalico.keymile.SUVD;

import com.google.gson.Gson;
import java.math.BigInteger;
import model.dslam.consulta.VlanVod;
import model.dslam.vivo2.metalico.keymile.KeymileMetalicoDslam;
import model.dslam.vivo2.metalico.keymile.KeymileMetalicoSuvdDslam;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author G0041775
 */
public class VlanVodJUnitTest {

    public VlanVodJUnitTest() {
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
    public void consultarVlanVodSUVD11() {
        try {

            KeymileMetalicoDslam d = new KeymileMetalicoSuvdDslam();

//            d.setIpDslam("10.221.97.23");
//            d.setSlot(new BigInteger("1"));
//            d.setPorta(new BigInteger("41"));
            d.setIpDslam("10.161.93.238");
            d.setSlot(new BigInteger("9"));
            d.setPorta(new BigInteger("30"));

            VlanVod vb = d.getVlanVod();

            Gson g = new Gson();

            System.out.println(g.toJson(vb));


            d.desconectar();

            assertTrue(true);
        } catch (Exception e) {
            e.printStackTrace();
            assertTrue(false);
        }
    }

    @Test
    public void consultarVlanVodSUVD3() {
        try {

            KeymileMetalicoDslam d = new KeymileMetalicoSuvdDslam();

            d.setIpDslam("10.185.9.162");
            d.setSlot(new BigInteger("9"));
            d.setPorta(new BigInteger("7"));

            VlanVod vb = d.getVlanVod();

            Gson g = new Gson();

            System.out.println(g.toJson(vb));

            d.desconectar();

            assertTrue(true);
        } catch (Exception e) {
            e.printStackTrace();
            assertTrue(false);
        }
    }
    
}
