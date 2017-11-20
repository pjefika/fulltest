/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manobra.asserts.impl;

import br.net.gvt.efika.asserts.AssertsEnum;
import br.net.gvt.efika.asserts.EfikaAssertable;
import br.net.gvt.efika.customer.CustomerAssert;
import model.validacao.impl.metalico.manobra.ValidacaoPacotesUp;

/**
 *
 * @author G0042204
 */
public class AssertPacotesUp implements EfikaAssertable {

    private final ValidacaoPacotesUp v;

    public AssertPacotesUp(ValidacaoPacotesUp v) {
        this.v = v;
    }

    @Override
    public CustomerAssert claim() {
        try {
            return new CustomerAssert(AssertsEnum.PACOTES_UP_MAIOR_4000, v.validar().getResultado());
        } catch (Exception e) {
            return new CustomerAssert(AssertsEnum.PACOTES_UP_MAIOR_4000, Boolean.FALSE);
        }
    }

}
