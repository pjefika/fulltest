/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests.tdd.consultas;

import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ConsultaClienteFacade;
import model.dslam.factory.exception.DslamNaoImplException;
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
            f = new ConsultaClienteFacade(new Cliente("CTA-81AFTMOU6-013"));
            f.consultar();
            f.validar();
        } catch (DslamNaoImplException ex) {
            Logger.getLogger(ConsultaClienteJUnitTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ConsultaClienteJUnitTest.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("");

    }
}
