/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests.tdd.consultas.metalico.keymile.SUAD;

import java.math.BigInteger;
import model.dslam.consulta.metalico.TabelaParametrosMetalico;
import model.dslam.vivo2.metalico.keymile.KeymileMetalicoSuadDslam;
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
public class TabelaParametrosJUnitTest {

    public TabelaParametrosJUnitTest() {
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
    public void consultarTabParam() {
        try {

            KeymileMetalicoSuadDslam d = new KeymileMetalicoSuadDslam();
            d.setIpDslam("10.141.228.1");
            d.setSlot(new BigInteger("3"));
            d.setPorta(new BigInteger("20"));
            TabelaParametrosMetalico tab = d.getTabelaParametros();
           
            System.out.println("Vel Down "+ tab.getVelSincDown());
            System.out.println("Vel Up "+ tab.getVelSincUp());
            System.out.println("Snr Down "+ tab.getSnrDown());
            System.out.println("Snr Up "+ tab.getSnrUp());
            System.out.println("Atn Down "+ tab.getAtnDown());
            System.out.println("Atn Up "+ tab.getAtnUp());
            
            d.desconectar();
            
            assertTrue(true);
        } catch (Exception e) {
            assertTrue(false);
            e.printStackTrace();
        }
    }
}
