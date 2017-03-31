/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd.facade;

import java.util.logging.Level;
import java.util.logging.Logger;
import model.entity.TesteCliente;
import model.fulltest.validacao.ValidacaoFacade;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author G0042204
 */
public class ValidacaoFacadeJUnitTest {

    public ValidacaoFacadeJUnitTest() {
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
    public void validar() {
        ValidacaoFacade facade = new ValidacaoFacade(new TesteCliente("7930272843"));
        assertTrue(facade.validar() != null);
    }
}
