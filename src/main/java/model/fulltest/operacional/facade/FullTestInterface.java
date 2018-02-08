/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional.facade;

import br.net.gvt.efika.customer.EfikaCustomer;
import model.fulltest.operacional.FullTest;

/**
 *
 * @author G0041775
 */
public interface FullTestInterface {

    FullTest executar(EfikaCustomer cl) throws Exception;

}
