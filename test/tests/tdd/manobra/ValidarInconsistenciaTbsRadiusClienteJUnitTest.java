/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd.manobra;

import model.ConsultaClienteFacade;
import model.entity.Cliente;
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
public class ValidarInconsistenciaTbsRadiusClienteJUnitTest {

    public ValidarInconsistenciaTbsRadiusClienteJUnitTest() {
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

            Cliente c = new Cliente("4133335556");
            ConsultaClienteFacade f = new ConsultaClienteFacade(c);
            f.consultar();
            assertTrue(f.validar());
        } catch (Exception e) {
            e.printStackTrace();
            assertTrue(false);
        }
    }
}
