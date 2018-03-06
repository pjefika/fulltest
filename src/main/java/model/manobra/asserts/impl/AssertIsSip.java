/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manobra.asserts.impl;

import br.net.gvt.efika.efika_customer.model.customer.CustomerAssert;
import br.net.gvt.efika.efika_customer.model.customer.asserts.AssertsEnum;
import br.net.gvt.efika.efika_customer.model.customer.asserts.EfikaAssertable;
import model.validacao.impl.metalico.manobra.ValidacaoIsSip;

/**
 *
 * @author G0042204
 */
public class AssertIsSip implements EfikaAssertable {

    private final ValidacaoIsSip v;

    public AssertIsSip(ValidacaoIsSip v) {
        this.v = v;
    }

    @Override
    public CustomerAssert claim() {
        try {
            return new CustomerAssert(AssertsEnum.IS_SIP, v.validar().getResultado());
        } catch (Exception e) {
            return new CustomerAssert(AssertsEnum.IS_SIP, Boolean.TRUE);
        }
    }

}
