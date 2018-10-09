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
                    + "    \"designador\" : \"JCI-814ZQX9J1G-013\","
                    + "    \"designadorAcesso\" : \"JCI-28098790-069\","
                    + "    \"rede\" : {"
                    + "        \"tipo\" : \"GPON\","
                    + "        \"origem\" : \"OFFLINE\","
                    + "        \"planta\" : \"VIVO1\","
                    + "        \"ipDslam\" : \"BR_JCICF_OLT01\","
                    + "        \"vendorDslam\" : \"HUAWEI TECHNOLOGIES\","
                    + "        \"modeloDslam\" : \"MA5600T\","
                    + "        \"idOnt\" : \"0004174629\","
                    + "        \"terminal\" : \"113118384154305\","
                    + "        \"slot\" : 17,"
                    + "        \"porta\" : 2,"
                    + "        \"sequencial\" : 41,"
                    + "        \"logica\" : 41,"
                    + "        \"rin\" : 388,"
                    + "        \"vlanVoip\" : 3004,"
                    + "        \"vlanVod\" : 3001,"
                    + "        \"vlanMulticast\" : 3001,"
                    + "        \"cvlan\" : 285,"
                    + "        \"bhs\" : true"
                    + "    },"
                    + "    \"servicos\" : {"
                    + "        \"velDown\" : 108135,"
                    + "        \"velUp\" : 54067,"
                    + "        \"tipoTv\" : \"IPTV\","
                    + "        \"tipoLinha\" : \"SIP\""
                    + "    }"
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
