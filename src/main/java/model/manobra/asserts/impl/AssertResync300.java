/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manobra.asserts.impl;

import br.net.gvt.efika.efika_customer.model.customer.CustomerAssert;
import br.net.gvt.efika.efika_customer.model.customer.asserts.AssertsEnum;
import br.net.gvt.efika.efika_customer.model.customer.asserts.EfikaAssertable;
import model.validacao.impl.metalico.manobra.ValidacaoResync300;

/**
 *
 * @author G0042204
 */
public class AssertResync300 implements EfikaAssertable {

    private final ValidacaoResync300 v;

    public AssertResync300(ValidacaoResync300 v) {
        this.v = v;
    }

    @Override
    public CustomerAssert claim() {
        try {
            return new CustomerAssert(AssertsEnum.RESYNC_MENOR_300, v.validar().getResultado());
        } catch (Exception e) {
            return new CustomerAssert(AssertsEnum.RESYNC_MENOR_300, Boolean.FALSE);
        }
    }

}
