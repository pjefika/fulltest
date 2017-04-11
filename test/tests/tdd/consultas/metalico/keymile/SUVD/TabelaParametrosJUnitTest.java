/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests.tdd.consultas.metalico.keymile.SUVD;

import java.math.BigInteger;
import model.dslam.consulta.metalico.TabelaParametrosMetalicoVdsl;
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
    public void consultarTabelaParametrosSUVD11() {
        try {

            KeymileMetalicoDslam d = new KeymileMetalicoSuvdDslam();

            d.setIpDslam("10.221.97.23");
            d.setSlot(new BigInteger("1"));
            d.setPorta(new BigInteger("41"));

            TabelaParametrosMetalicoVdsl tab = (TabelaParametrosMetalicoVdsl) d.getTabelaParametros();

            System.out.println("Vel Down " + tab.getVelSincDown());
            System.out.println("Vel Up " + tab.getVelSincUp());
            System.out.println("Snr Down " + tab.getSnrDown());
            System.out.println("Snr Up " + tab.getSnrUp());
            System.out.println("Atn Down " + tab.getAtnDown());
            System.out.println("Atn Up " + tab.getAtnUp());
            System.out.println("Snr1 Down " + tab.getSnrDown1());
            System.out.println("Snr1 Up " + tab.getSnrUp1());
            System.out.println("Atn1 Down " + tab.getAtnDown1());
            System.out.println("Atn1 Up " + tab.getAtnUp1());
            System.out.println("Snr2 Down " + tab.getSnrDown2());
            System.out.println("Snr2 Up " + tab.getSnrUp2());
            System.out.println("Atn2 Down " + tab.getAtnDown2());
            System.out.println("Atn2 Up " + tab.getAtnUp2());

            d.desconectar();

            assertTrue(true);
        } catch (Exception e) {
            e.printStackTrace();
            assertTrue(false);
        }
    }

    @Test
    public void consultarTabelaParametrosSUVD3() {
        try {

            KeymileMetalicoDslam d = new KeymileMetalicoSuvdDslam();

            d.setIpDslam("10.185.9.162");
            d.setSlot(new BigInteger("9"));
            d.setPorta(new BigInteger("7"));

            TabelaParametrosMetalicoVdsl tab = (TabelaParametrosMetalicoVdsl) d.getTabelaParametros();

            System.out.println("Vel Down " + tab.getVelSincDown());
            System.out.println("Vel Up " + tab.getVelSincUp());
            System.out.println("Snr Down " + tab.getSnrDown());
            System.out.println("Snr Up " + tab.getSnrUp());
            System.out.println("Atn Down " + tab.getAtnDown());
            System.out.println("Atn Up " + tab.getAtnUp());
            System.out.println("Snr1 Down " + tab.getSnrDown1());
            System.out.println("Snr1 Up " + tab.getSnrUp1());
            System.out.println("Atn1 Down " + tab.getAtnDown1());
            System.out.println("Atn1 Up " + tab.getAtnUp1());
            System.out.println("Snr2 Down " + tab.getSnrDown2());
            System.out.println("Snr2 Up " + tab.getSnrUp2());
            System.out.println("Atn2 Down " + tab.getAtnDown2());
            System.out.println("Atn2 Up " + tab.getAtnUp2());

            d.desconectar();

            assertTrue(true);
        } catch (Exception e) {
            e.printStackTrace();
            assertTrue(false);
        }
    }
}
