/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime.metalico;

import model.validacao.impl.realtime.ValidadorDeviceMAC;
import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.factory.DslamDAOFactory;
import dao.dslam.factory.exception.DslamNaoImplException;
import model.validacao.impl.realtime.Validator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tests.CustomerTest;

/**
 *
 * @author g0042204
 */
public class ValidacaoRtDeviceMACIT {

    private EfikaCustomer cust = CustomerTest.create();

    public ValidacaoRtDeviceMACIT() {
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
    public void testValidar(){
        try {
            System.out.println("validar");
            Validator mac = new ValidadorDeviceMAC(DslamDAOFactory.getInstance(cust.getRede()), cust);
            assertTrue(mac.validar().getResultado());
            System.out.println("end");
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

}
