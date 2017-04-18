/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd.validacao;

import com.google.gson.Gson;
import model.dslam.consulta.EstadoDaPorta;
import model.validacao.manobra.ValidacaoEstadoPortaManobra;
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
public class ValidarEstadoDaPortaJUnitTest {

    public ValidarEstadoDaPortaJUnitTest() {
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
    public void validEstPorta() {
        EstadoDaPorta e = new EstadoDaPorta();
        e.setAdminState("UP");
        e.setOperState("DOWN");
        ValidacaoEstadoPortaManobra r = new ValidacaoEstadoPortaManobra(e);
        Gson g = new Gson();
        System.out.println(g.toJson(r));
        assertTrue(true);
    }
}
