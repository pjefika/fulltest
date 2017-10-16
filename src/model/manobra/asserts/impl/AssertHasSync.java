/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manobra.asserts.impl;

import br.net.gvt.efika.asserts.AssertsEnum;
import br.net.gvt.efika.asserts.EfikaAssertable;
import br.net.gvt.efika.customer.CustomerAssert;
import model.validacao.impl.both.ValidacaoEstadoPortaOper;

/**
 *
 * @author G0042204
 */
public class AssertHasSync implements EfikaAssertable {

    private final ValidacaoEstadoPortaOper v;

    public AssertHasSync(ValidacaoEstadoPortaOper v) {
        this.v = v;
    }

    @Override
    public CustomerAssert claim() {
        try {
            return new CustomerAssert(AssertsEnum.HAS_SYNC, v.validar().getResultado());
        } catch (Exception e) {
            return new CustomerAssert(AssertsEnum.HAS_SYNC, Boolean.FALSE);
        }
    }

}
