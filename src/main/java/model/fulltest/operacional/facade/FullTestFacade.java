/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional.facade;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import br.net.gvt.efika.fulltest.model.fulltest.FullTest;

/**
 *
 * @author G0042204
 */
@JsonSerialize
@JsonIgnoreProperties(ignoreUnknown = true, value = {"cl", "dslam", "bateria"})
public class FullTestFacade extends FullTestGenericFacade implements FullTestInterface {

    public FullTestFacade() {
    }

    @Override
    public FullTest executar(EfikaCustomer cl) throws Exception {
        super.exec(cl);
        return cast();
    }

}
