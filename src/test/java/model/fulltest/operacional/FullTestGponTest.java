/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional;

import br.net.gvt.efika.fulltest.model.fulltest.FullTest;
import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.util.json.JacksonMapper;
import java.util.ArrayList;
import java.util.List;
import model.fulltest.operacional.facade.FullTestCOFacade;
import model.fulltest.operacional.facade.FullTestInterface;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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
    public void testCustomerGetCustomer() {
        List<String> tests = new ArrayList<>();
        tests.add("8131323529");
//        tests.add("5132242735");
        for (String test : tests) {
            try {
//                System.out.println(test + "->" + GsonUtil.serialize(CustomerMock.getCustomer(test)));
            } catch (Exception e) {
                System.out.println("Numtem -> " + test);
            }

        }
    }

    @Test
    public void testValidar() {

        try {
            String lejson = "{"
                    + "   \"designador\":\"SPO-814ZP9A2U8-013\","
                    + "   \"instancia\":\"110008367742903\","
                    + "   \"designadorAcesso\":\"SPO-28007125-069\","
                    + "   \"designadorTv\":null,"
                    + "   \"rede\":{"
                    + "      \"tipo\":\"GPON\","
                    + "      \"origem\":\"ONLINE\","
                    + "      \"planta\":\"VIVO1\","
                    + "      \"ipDslam\":\"10.23.43.174\","
                    + "      \"vendorDslam\":\"ALCATEL\","
                    + "      \"modeloDslam\":\"7342 ISAM FTTU\","
                    + "      \"idOnt\":\"0004169686\","
                    + "      \"terminal\":\"1183677429\","
                    + "      \"ipMulticast\":null,"
                    + "      \"nrc\":null,"
                    + "      \"slot\":6,"
                    + "      \"porta\":3,"
                    + "      \"sequencial\":8,"
                    + "      \"logica\":8,"
                    + "      \"rin\":32,"
                    + "      \"vlanVoip\":3004,"
                    + "      \"vlanVod\":3001,"
                    + "      \"vlanMulticast\":3001,"
                    + "      \"cvlan\":1283,"
                    + "      \"bhs\":true"
                    + "   },"
                    
                    + "   \"servicos\":{"
                    + "      \"origem\":null,"
                    + "      \"velDown\":102400,"
                    + "      \"velUp\":51200,"
                    + "      \"tipoTv\":null,"
                    + "      \"tipoLinha\":\"SIP\""
                    + "   }"
                    + "}";
            cust = (EfikaCustomer) new JacksonMapper(EfikaCustomer.class).deserialize(lejson);

            FullTestInterface instance = new FullTestCOFacade();
            FullTest f = instance.executar(cust);

            System.out.println("_____________________________________________________________________\n\n");
            System.out.println(new JacksonMapper(FullTest.class).serialize(f));
            System.out.println("_____________________________________________________________________\n\n");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
