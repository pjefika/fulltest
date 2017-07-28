/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manobra.asserts.impl;

import br.net.gvt.efika.asserts.AssertsEnum;
import br.net.gvt.efika.asserts.EfikaAssertable;
import br.net.gvt.efika.customer.CustomerAssert;
import model.validacao.impl.manobra.ValidacaoIsSip;

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
