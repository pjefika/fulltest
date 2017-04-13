/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd.validacao;

import java.math.BigInteger;
import model.dslam.consulta.metalico.TabelaRedeMetalico;
import model.validacao.ValidacaoRede;
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
public class ValidarRedeJUnitTest {

    public ValidarRedeJUnitTest() {
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
    public void hello() {
        TabelaRedeMetalico tb = new TabelaRedeMetalico();
        tb.setResync(BigInteger.ONE);
        ValidacaoRede r = new ValidacaoRede(tb);
        assertTrue(r.validar());
    }
}
