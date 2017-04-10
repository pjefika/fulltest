/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests.tdd.consultas.metalico.keymile.SUAD;

import java.math.BigInteger;
import model.dslam.consulta.metalico.TabelaRedeMetalico;
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
public class TabelaRedeJUnitTest {

    public TabelaRedeJUnitTest() {
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
    public void consultarTabRede() {
        try {

            KeymileMetalicoSuadDslam d = new KeymileMetalicoSuadDslam();
            d.setIpDslam("10.141.228.1");
            d.setSlot(new BigInteger("3"));
            d.setPorta(new BigInteger("20"));
            TabelaRedeMetalico tab = d.getTabelaRede();

            System.out.println("Resync " + tab.getResync());
            System.out.println("Pct Down " + tab.getPctDown());
            System.out.println("Pct Up " + tab.getPctUp());
            System.out.println("CRC Down " + tab.getCrcDown());
            System.out.println("CRC Up " + tab.getCrcUp());
            System.out.println("FEC Down " + tab.getFecDown());
            System.out.println("FEC Up " + tab.getFecUp());

            d.desconectar();

            assertTrue(true);
        } catch (Exception e) {
            e.printStackTrace();
            assertTrue(false);
        }
    }
}
