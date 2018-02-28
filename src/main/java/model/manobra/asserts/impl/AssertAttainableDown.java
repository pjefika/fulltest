/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manobra.asserts.impl;

import br.net.gvt.efika.efika_customer.model.customer.CustomerAssert;
import br.net.gvt.efika.efika_customer.model.customer.asserts.AssertsEnum;
import br.net.gvt.efika.efika_customer.model.customer.asserts.EfikaAssertable;
import model.validacao.impl.metalico.manobra.ValidacaoAttainableDown;

/**
 *
 * @author G0042204
 */
public class AssertAttainableDown implements EfikaAssertable {

    private final ValidacaoAttainableDown v;

    public AssertAttainableDown(ValidacaoAttainableDown v) {
        this.v = v;
    }

    @Override
    public CustomerAssert claim() {
        try {
            return new CustomerAssert(AssertsEnum.ATT_DOWN_OK, v.validar().getResultado());
        } catch (Exception e) {
            return new CustomerAssert(AssertsEnum.ATT_DOWN_OK, Boolean.FALSE);
        }
    }

}
