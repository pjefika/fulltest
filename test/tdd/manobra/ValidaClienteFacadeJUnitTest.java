/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd.manobra;

import model.Motivos;
import model.entity.Cliente;
import model.facade.ConsultaClienteFacade;
import model.facade.ValidaClienteFacade;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author G0042204
 */
public class ValidaClienteFacadeJUnitTest {

    private ValidaClienteFacade f;

    public ValidaClienteFacadeJUnitTest() {
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
    public void ValidarInconsistenciaTbsRadiusClienteJUnitTest() {
        try {
            ConsultaClienteFacade c = new ConsultaClienteFacade(new Cliente("CTA-81AFTMOU6-013"));
            c.consultar();

            ValidaClienteFacade f = new ValidaClienteFacade(c.getCl(), Motivos.SEMAUTH);
            f.validar();
            System.out.println("");
        } catch (Exception e) {
            e.printStackTrace();
            assertTrue(false);
        }
    }
}
