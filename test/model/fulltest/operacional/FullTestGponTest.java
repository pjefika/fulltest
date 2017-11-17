/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional;

import br.net.gvt.efika.customer.EfikaCustomer;
import java.util.ArrayList;
import java.util.List;
import model.fulltest.operacional.facade.FullTestCOFacade;
import model.fulltest.operacional.facade.FullTestInterface;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import util.GsonUtil;

/**
 *
 * @author g0042204
 */
public class FullTestGponTest {

    private EfikaCustomer cust;

    public FullTestGponTest() {
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
    public void testValidar() {
        List<String> tests = new ArrayList<>();
        tests.add("1239341717");

        for (String test : tests) {
            try {
                cust = CustomerMock.getCustomer(test);
                FullTestInterface instance = new FullTestCOFacade();

                FullTest f = instance.executar(cust);

                System.out.println(GsonUtil.serialize(f));
                System.out.println("_____________________________________________________________________\n\n");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
