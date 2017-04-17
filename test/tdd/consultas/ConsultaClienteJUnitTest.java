/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd.consultas;

import model.facade.ConsultaClienteFacade;
import model.entity.Cliente;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author G0042204
 */
public class ConsultaClienteJUnitTest {

    private ConsultaClienteFacade f;

    public ConsultaClienteJUnitTest() {
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
    public void consultar() {

        try {
            f = new ConsultaClienteFacade(new Cliente("4133335556"));
            f.consultar();
            f.validar();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println("");

    }
}
