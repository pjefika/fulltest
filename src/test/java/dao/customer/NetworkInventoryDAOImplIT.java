/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.customer;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import java.util.List;
import model.fulltest.operacional.CustomerMock;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author G0042204
 */
public class NetworkInventoryDAOImplIT {

    private List<EfikaCustomer> result;

    public NetworkInventoryDAOImplIT() {
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
     * Test of consultarVizinhos method, of class NetworkInventoryDAOImpl.
     */
    @Test
    public void testConsultarVizinhos() throws Exception {
        try {
            System.out.println("consultarVizinhos");
            EfikaCustomer ec = CustomerMock.getCustomer("1138468335");
            Integer qtde = 5;
            NetworkInventoryDAOImpl instance = new NetworkInventoryDAOImpl();
            result = instance.consultarVizinhos(ec, qtde);
//            System.out.println(GsonUtil.serialize(result));
            assertTrue(!result.isEmpty());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
