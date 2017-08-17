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
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author G0042204
 */
public class AnaliseMotivoGenericIT {

    public AnaliseMotivoGenericIT() {
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
    public void testSomeMethod() {

        List<CustomerAssert> lst = new ArrayList<>();
        lst.add(new CustomerAssert(AssertsEnum.HAS_SYNC, Boolean.TRUE));
        lst.add(new CustomerAssert(AssertsEnum.AUTH_ABERTURA_ORDEM, Boolean.TRUE));
        lst.add(new CustomerAssert(AssertsEnum.ATT_UP_OK, Boolean.FALSE));
                

        for (MotivoManobraEnum v : MotivoManobraEnum.values()) {
            Analiser a = new AnaliseMotivoGeneric(lst, v);
            AnaliseMotivo result = a.run();
            System.out.println("Motivo: " + result.getMotivo().getMotivo() + " | Resultado: " + result.getConclusao());
            System.out.println();
        }


    }

}
