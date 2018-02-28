/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import model.fulltest.operacional.CustomerMock;

/**
 *
 * @author G0042204
 */
public class CustomerTest {

    
//    private static final EfikaCustomer CLIENTE_TESTE = CustomerMock.getCustomer("4130886762");
    private static final EfikaCustomer CLIENTE_TESTE = CustomerMock.getCustomer("4130886762");

    public static EfikaCustomer create() {
        return CLIENTE_TESTE;
    }

}
