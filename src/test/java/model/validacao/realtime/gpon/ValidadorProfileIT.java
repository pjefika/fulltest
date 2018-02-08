/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime.gpon;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.factory.DslamDAOFactory;
import java.util.Locale;
import model.fulltest.operacional.CustomerMock;
import model.validacao.impl.realtime.ValidadorProfile;
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
public class ValidadorProfileIT {

    private EfikaCustomer cust = CustomerMock.getCustomer("4130886762");

    public ValidadorProfileIT() {
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

    /**
     * Test of validar method, of class ValidadorProfile.
     */
    @Test
    public void testValidar() {

        try {
            ValidadorProfile instance = new ValidadorProfile(DslamDAOFactory.getInstance(cust.getRede()), cust, new Locale("co", "CO"));
            assertEquals(true, instance.validar().getResultado());
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

}
