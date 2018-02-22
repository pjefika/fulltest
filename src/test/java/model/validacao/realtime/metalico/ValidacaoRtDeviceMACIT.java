/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime.metalico;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import dao.dslam.factory.DslamDAOFactory;
import java.util.Locale;
import model.validacao.impl.realtime.ValidadorDeviceMAC;
import model.validacao.impl.realtime.Validator;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
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
            Validator mac = new ValidadorDeviceMAC(DslamDAOFactory.getInstance(cust.getRede()), cust, new Locale("co", "CO"));
            assertTrue(mac.validar().getResultado());
            System.out.println("end");
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

}
