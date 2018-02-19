/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manobra.facade;

import br.net.gvt.efika.asserts.AssertsEnum;
import br.net.gvt.efika.customer.CustomerAssert;
import br.net.gvt.efika.customer.EfikaCustomer;
import java.util.ArrayList;
import java.util.List;
import model.manobra.analitcs.AnaliseMotivo;
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
public class ManobraAssertsFacadeIT {

    public ManobraAssertsFacadeIT() {
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
     * Test of run method, of class ManobraAssertsFacade.
     */
    @Test
    public void testRun() {
        try {
            System.out.println("run");

            EfikaCustomer e = new EfikaCustomer();

            List<CustomerAssert> lst = new ArrayList<>();

            lst.add(new CustomerAssert(AssertsEnum.REDE_CONFIAVEL, Boolean.FALSE));
            lst.add(new CustomerAssert(AssertsEnum.RESYNC_MENOR_300, Boolean.TRUE));
            lst.add(new CustomerAssert(AssertsEnum.RESYNC_MENOR_50, Boolean.TRUE));
            lst.add(new CustomerAssert(AssertsEnum.RESYNC_MENOR_5, Boolean.TRUE));
            lst.add(new CustomerAssert(AssertsEnum.HAS_SYNC, Boolean.TRUE));
            lst.add(new CustomerAssert(AssertsEnum.AUTH_ABERTURA_ORDEM, Boolean.TRUE));
            lst.add(new CustomerAssert(AssertsEnum.ATT_DOWN_OK, Boolean.TRUE));
            lst.add(new CustomerAssert(AssertsEnum.ATT_UP_OK, Boolean.FALSE));

            lst.add(new CustomerAssert(AssertsEnum.PACOTES_DOWN_MAIOR_6000, Boolean.TRUE));
            lst.add(new CustomerAssert(AssertsEnum.PACOTES_UP_MAIOR_4000, Boolean.TRUE));
            e.setAsserts(lst);

            AnalisadorManobraFacade instance = new AnalisadorManobraFacade(e);
            List<AnaliseMotivo> result = instance.run();

            result.forEach((t) -> {
                System.out.println("Motivo: " + t.getMotivo() + " Conclusão:" + t.getConclusao().name());
            });

            assertTrue(result.size() > 0);
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

}
