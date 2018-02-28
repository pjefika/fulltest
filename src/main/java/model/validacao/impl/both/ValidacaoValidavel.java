/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.both;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.fulltest.model.telecom.properties.Validavel;
import br.net.gvt.efika.fulltest.model.telecom.properties.ValidavelAbs;
import java.util.Locale;

/**
 *
 * @author g0042204
 */
public abstract class ValidacaoValidavel extends ValidacaoEfikaCustomer {

    private final Validavel v;

    public ValidacaoValidavel(EfikaCustomer cust, Validavel v, Locale local) {
        super(cust, v.getNome(), local);
        this.v = v;
    }

    @Override
    public Boolean checar() {
        return v.validar(this.getCust());
    }

    @Override
    public ValidavelAbs getObject() {
        return (ValidavelAbs) v;
    }

}
