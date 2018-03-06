/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.realtime;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.fulltest.model.fulltest.ValidacaoResult;

/**
 *
 * @author G0042204
 */
abstract class ValidadorGeneric extends ValidadorCustomer {

    public ValidadorGeneric(EfikaCustomer cust) {
        super(cust);
    }

    protected abstract ValidacaoResult concluir();

    protected abstract String mensagemOk();

    protected abstract String mensagemNok();

}
