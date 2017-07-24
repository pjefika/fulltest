/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl;

import br.net.gvt.efika.customer.EfikaCustomer;
import model.fulltest.validacao.Validavel;

/**
 *
 * @author g0042204
 */
public abstract class ValidacaoValidavel extends ValidacaoEfikaCustomer {

    private final Validavel v;

    public ValidacaoValidavel(EfikaCustomer cust, Validavel v) {
        super(cust, v.getNome());
        this.v = v;
    }

    @Override
    public Boolean checar() {
        return v.validar(this.getCust());
    }

   
}
