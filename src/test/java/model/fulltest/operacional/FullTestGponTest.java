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
                    + "   \"designador\":\"SPO-8152TQTV1H-013\","
                    + "   \"instancia\":\"110008450928008\","
                    + "   \"designadorAcesso\":\"SPO-30128377-069\","
                    + "   \"designadorTv\":null,"
                    + "   \"rede\":{"
                    + "      \"tipo\":\"GPON\","
                    + "      \"origem\":\"ONLINE\","
                    + "      \"planta\":\"VIVO1\","
                    + "      \"ipDslam\":\"10.58.238.122\","
                    + "      \"vendorDslam\":\"HUAWEI TECHNOLOGIES\","
                    + "      \"modeloDslam\":\"MA5600T\","
                    + "      \"idOnt\":\"0004430124\","
                    + "      \"terminal\":\"1184509280\","
                    + "      \"ipMulticast\":null,"
                    + "      \"nrc\":null,"
                    + "      \"slot\":6,"
                    + "      \"porta\":5,"
                    + "      \"sequencial\":19,"
                    + "      \"logica\":19,"
                    + "      \"rin\":63,"
                    + "      \"vlanVoip\":3004,"
                    + "      \"vlanVod\":3001,"
                    + "      \"vlanMulticast\":3001,"
                    + "      \"cvlan\":2011,"
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
                    + "      {"
                    + "         \"asserts\":\"CIRCUITO_ATIVO\","
                    + "         \"value\":true,"
                    + "         \"creationDate\":1545167857433"
                    + "      },"
                    + "      {"
                    + "         \"asserts\":\"DIVERGENCIA_TBS_RADIUS\","
                    + "         \"value\":false,"
                    + "         \"creationDate\":1545167857433"
                    + "      },"
                    + "      {"
                    + "         \"asserts\":\"HAS_BLOQUEIO_RADIUS\","
                    + "         \"value\":false,"
                    + "         \"creationDate\":1545167857433"
                    + "      }"
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
