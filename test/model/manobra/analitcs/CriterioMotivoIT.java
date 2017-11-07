/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manobra.analitcs;

import br.net.gvt.efika.asserts.AssertsEnum;
import br.net.gvt.efika.customer.CustomerAssert;
import java.util.ArrayList;
import java.util.List;
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
public class CriterioMotivoIT {

    public CriterioMotivoIT() {
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
     * Test of adicionarCriterio method, of class CriterioMotivo.
     */
    @Test
    public void testAdicionarCriterio() {
        try {
            System.out.println("adicionarCriterio");
            CustomerAssert c = new CustomerAssert();
            CriterioMotivo instance = new CriterioMotivo();
            instance.adicionarCriterio(c);
            assertTrue(instance.getCriterios().size() > 0);

        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

    /**
     * Test of check method, of class CriterioMotivo.
     */
    @Test
    public void testCheck() {
        try {
            System.out.println("check");
            List<CustomerAssert> lst = new ArrayList<>();
            lst.add(new CustomerAssert(AssertsEnum.HAS_SYNC, Boolean.TRUE));
            lst.add(new CustomerAssert(AssertsEnum.AUTH_ABERTURA_ORDEM, Boolean.TRUE));

            
            for (CriterioMotivo c : FactoryCriterio.obter(MotivoManobraEnum.AUTH_SINC)) {
                System.out.println("Value: " + c.check(lst));
            }

            assertTrue(false);

        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

}
