/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd.manobra;

import model.Motivos;
import model.entity.Cliente;
import model.facade.ValidaClienteManobraFacade;
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

    private ValidaClienteManobraFacade f;

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
    public void ValidarClienteJUnitTest() {
        try {
            ValidaClienteManobraFacade f = new ValidaClienteManobraFacade(new Cliente("1133701155"), Motivos.SEMAUTH, "8-2ECU32G8");
            f.validar();
            System.out.println("fim");
        } catch (Exception e) {
            e.printStackTrace();
            assertTrue(false);
        }
    }
}
