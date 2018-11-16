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
                    + "   \"designador\":\"RCO-814ZNKWYXC-013\","
                    + "   \"instancia\":\"115358354031500\","
                    + "   \"designadorAcesso\":\"RCO-27982296-069\","
                    + "   \"designadorTv\":null,"
                    + "   \"rede\":{"
                    + "      \"tipo\":\"GPON\","
                    + "      \"origem\":\"ONLINE\","
                    + "      \"planta\":\"VIVO1\","
                    + "      \"ipDslam\":\"10.58.223.150\","
                    + "      \"vendorDslam\":\"HUAWEI TECHNOLOGIES\","
                    + "      \"modeloDslam\":\"MA5800\","
                    + "      \"idOnt\":\"0004164436\","
                    + "      \"terminal\":\"1983540315\","
                    + "      \"ipMulticast\":null,"
                    + "      \"nrc\":null,"
                    + "      \"slot\":3,"
                    + "      \"porta\":11,"
                    + "      \"sequencial\":3,"
                    + "      \"logica\":3,"
                    + "      \"rin\":171,"
                    + "      \"vlanVoip\":3008,"
                    + "      \"vlanVod\":3005,"
                    + "      \"vlanMulticast\":3005,"
                    + "      \"cvlan\":198,"
                    + "      \"bhs\":true"
                    + "   },"
                    + "   \"redeExterna\":{"
                    + "      \"tipo\":null,"
                    + "      \"origem\":null,"
                    + "      \"planta\":null,"
                    + "      \"splitter1n\":null,"
                    + "      \"splitter2n\":null,"
                    + "      \"caboAlim\":null,"
                    + "      \"fibra1n\":null,"
                    + "      \"fibra2n\":null"
                    + "   },"
                    + "   \"servicos\":{"
                    + "      \"origem\":null,"
                    + "      \"velDown\":204800,"
                    + "      \"velUp\":102400,"
                    + "      \"tipoTv\":null,"
                    + "      \"tipoLinha\":\"SIP\""
                    + "   },"
                    + "   \"linha\":{"
                    + "      \"tipo\":null,"
                    + "      \"dn\":null,"
                    + "      \"central\":null"
                    + "   },"
                    + "   \"radius\":{"
                    + "      \"status\":null,"
                    + "      \"armario\":null,"
                    + "      \"rin\":null,"
                    + "      \"velocidade\":null,"
                    + "      \"ipFixo\":null,"
                    + "      \"profile\":null,"
                    + "      \"porta\":null,"
                    + "      \"isIpFixo\":null"
                    + "   },"
                    + "   \"asserts\":["
                    + "   ],"
                    + "   \"eventos\":["
                    + ""
                    + "   ]"
                    + "}";
            cust = (EfikaCustomer) new JacksonMapper(EfikaCustomer.class).deserialize(lejson);

            FullTestInterface instance = new FullTestCOFacade();
            FullTest f = instance.executar(cust);

            System.out.println("_____________________________________________________________________");
            System.out.println(new JacksonMapper(FullTest.class).serialize(f));
            System.out.println("_____________________________________________________________________");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
