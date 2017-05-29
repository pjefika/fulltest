/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests.tdd.consultas.metalico.keymile.SUAD;

import java.math.BigInteger;
import model.dslam.consulta.VlanMulticast;
import dao.dslam.metalico.keymile.KeymileMetalicoDslam;
import dao.dslam.metalico.keymile.KeymileMetalicoSuadDslam;
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
public class VlanMulticastJUnitTest {

    public VlanMulticastJUnitTest() {
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
    public void consultarVlanMulticast() {
        try {

            KeymileMetalicoDslam d = new KeymileMetalicoSuadDslam();
            d.setIpDslam("10.141.228.1");
            d.setSlot(new BigInteger("3"));
            d.setPorta(new BigInteger("20"));
            VlanMulticast vm = d.getVlanMulticast();

            System.out.println("Cvlan " + vm.getCvlan());

            d.desconectar();

            assertTrue(true);
        } catch (Exception e) {
            e.printStackTrace();
            assertTrue(false);
        }
    }
}
