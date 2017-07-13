/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.factory;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.factory.exception.DslamNaoImplException;
import model.fulltest.operacional.FullTestCorrectiveGponFacade;
import model.fulltest.operacional.FullTestGponFacade;
import model.fulltest.operacional.FullTestInterface;

/**
 *
 * @author G0042204
 */
public class FactoryFulltest {

    public static FullTestInterface create(Boolean corretivo, EfikaCustomer cs) throws DslamNaoImplException {
        if (corretivo) {
            return new FullTestCorrectiveGponFacade(cs);
        } else {
            return new FullTestGponFacade(cs);
        }
    }
}
