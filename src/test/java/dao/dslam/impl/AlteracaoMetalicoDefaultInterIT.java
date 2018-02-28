/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.efika_customer.model.customer.InventarioRede;
import dao.dslam.factory.DslamDAOFactory;
import dao.dslam.factory.exception.DslamNaoImplException;
import dao.dslam.impl.metalico.DslamMetalico;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.fulltest.operacional.CustomerMock;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author G0041775
 */
public class AlteracaoMetalicoDefaultInterIT {

    DslamMetalico instance;
    EfikaCustomer ec;
    InventarioRede i;

    public AlteracaoMetalicoDefaultInterIT() {
        ec = CustomerMock.getCustomer("1124013751");
        i = ec.getRede();
        try {
            instance = (DslamMetalico) DslamDAOFactory.getInstance(ec.getRede().getModeloDslam(), ec.getRede().getIpDslam());
        } catch (DslamNaoImplException ex) {
            Logger.getLogger(AlteracaoMetalicoDefaultInterIT.class.getName()).log(Level.SEVERE, null, ex);
        }
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
     * Test of setModulacao method, of class AlteracaoMetalicoDefaultInter.
     */
//    @Test
//    public void testSetModulacao() {
//        System.out.println("setModulacao");
//
//        Velocidades v = Velocidades.valueOf("VEL_" + ec.getServicos().getVelDown());
//
//        try {
//            Modulacao result = instance.setModulacao(i, v);
//            String anotherString = instance.castModulacao(v).getModulacao();
//
//            assertTrue(result.getModulacao().contains(anotherString));
//        } catch (Exception ex) {
//            fail(ex.getMessage());
//        }
//
//    }
//
//    @Test
//    public void testCastModulacao() {
//        System.out.println("castModulacao");
//
//        Velocidades[] vs = Velocidades.values();
//        for (Velocidades v : vs) {
//            System.out.println(instance.castModulacao(v).getModulacao() + " -> " + v.getVel());
//        }
//
//    }

}
