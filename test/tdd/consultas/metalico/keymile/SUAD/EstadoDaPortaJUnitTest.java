/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests.tdd.consultas.metalico.keymile.SUAD;

import java.math.BigInteger;
import model.dslam.consulta.EstadoDaPorta;
import model.dslam.vivo2.metalico.keymile.KeymileMetalicoDslam;
import model.dslam.vivo2.metalico.keymile.KeymileMetalicoSuadDslam;
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
    public void consultarEstadoPorta() {
        try {

            KeymileMetalicoDslam d = new KeymileMetalicoSuadDslam();
            d.setIpDslam("10.141.228.1");
            d.setSlot(new BigInteger("3"));
            d.setPorta(new BigInteger("20"));
            EstadoDaPorta est = d.getEstadoDaPorta();

            System.out.println("Adm " + est.getAdminState());
            System.out.println("Oper " + est.getOperState());
           

            d.desconectar();

            assertTrue(true);
        } catch (Exception e) {
            e.printStackTrace();
            assertTrue(false);
        }
    }
}
