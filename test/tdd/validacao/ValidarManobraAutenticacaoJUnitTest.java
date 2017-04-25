/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd.validacao;

import java.util.logging.Level;
import java.util.logging.Logger;
import model.Motivos;
import model.entity.Cliente;
import model.facade.ValidaClienteManobraFacade;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author G0042204
 */
public class ValidarManobraAutenticacaoJUnitTest {

    public ValidarManobraAutenticacaoJUnitTest() {
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
    public void autenticacao() {

        ValidaClienteManobraFacade f;
        try {
            f = new ValidaClienteManobraFacade(new Cliente("4130222839"), Motivos.SEMAUTH, "");
            f.validar();
            System.out.println("Teste");
        } catch (Exception ex) {
            Logger.getLogger(ValidarManobraAutenticacaoJUnitTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
