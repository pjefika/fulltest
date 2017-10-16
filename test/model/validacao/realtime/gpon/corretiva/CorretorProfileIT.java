/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime.gpon.corretiva;

import model.validacao.impl.realtime.CorretorProfile;
import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.factory.DslamDAOFactory;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.fulltest.operacional.CustomerMock;
import model.validacao.impl.both.ValidacaoResult;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author G0042204
 */
public class CorretorProfileIT {

    private EfikaCustomer cust = CustomerMock.getCustomer("4130886762");

    public CorretorProfileIT() {
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
    public void testConsultar() {

        try {
            CorretorProfile c = new CorretorProfile(DslamDAOFactory.getInstance(cust.getRede()), cust, new Locale("co", "CO"));
            ValidacaoResult consultar = c.validar();
            assertTrue(consultar != null);
            System.out.println("end");
        } catch (Exception ex) {
            Logger.getLogger(CorretorProfileIT.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
