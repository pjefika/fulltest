/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional.facade;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.fulltest.model.fulltest.FullTest;

/**
 *
 * @author G0041775
 */
public interface FullTestInterface {

    FullTest executar(EfikaCustomer cl) throws Exception;

}
