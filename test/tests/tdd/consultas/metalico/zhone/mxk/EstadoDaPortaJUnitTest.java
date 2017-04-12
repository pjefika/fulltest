/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests.tdd.consultas.metalico.zhone.mxk;

import com.google.gson.Gson;
import java.math.BigInteger;
import model.dslam.consulta.EstadoDaPorta;
import model.dslam.vivo2.metalico.zhone.ZhoneMetalicoDslam;
import model.dslam.vivo2.metalico.zhone.ZhoneMetalicoMxkDslam;
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
public class EstadoDaPortaJUnitTest {

    public EstadoDaPortaJUnitTest() {
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
    public void consultarEstadoDaPorta() {
        try {

            ZhoneMetalicoDslam d = new ZhoneMetalicoMxkDslam();
            //1134525550
            d.setIpDslam("10.209.97.250");
            d.setSlot(new BigInteger("2"));
            d.setPorta(new BigInteger("23"));
  
            EstadoDaPorta tab = d.getEstadoDaPorta();

            Gson g = new Gson();

            System.out.println(g.toJson(tab));

            d.desconectar();

            assertTrue(true);
        } catch (Exception e) {
            e.printStackTrace();
            assertTrue(false);
        }
    }
}
