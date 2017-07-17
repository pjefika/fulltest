/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional;

import dao.dslam.factory.exception.DslamNaoImplException;
import dao.dslam.factory.exception.FuncIndisponivelDslamException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.fulltest.operacional.factory.FactoryFulltest;
import model.validacao.Validacao;
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
public class FullTestInterfaceIT {

    private FullTestInterface instance;

    public FullTestInterfaceIT() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        try {
            instance = FactoryFulltest.create(Boolean.TRUE, CustomerMock.getCustomer("1630107429"));
        } catch (DslamNaoImplException ex) {
            fail(ex.getMessage());
        } catch (FuncIndisponivelDslamException ex) {
            fail(ex.getMessage());
        }
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of executar method, of class FullTestInterface.
     */
    @Test
    public void testExecutar(){
        try {
            System.out.println("executar");
            List<Validacao> bateria = null;
            FullTest expResult = null;
            FullTest result = instance.executar();
            assertTrue(result != null);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

}
