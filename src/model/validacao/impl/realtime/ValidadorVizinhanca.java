/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.realtime;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.impl.AbstractDslam;
import java.util.Locale;
import model.validacao.impl.both.Validacao;
import model.validacao.impl.both.ValidacaoPortaPON;

public class ValidadorVizinhanca extends ValidadorGpon {

    public ValidadorVizinhanca(AbstractDslam dslam, EfikaCustomer cust, Locale local) {
        super(dslam, cust, local);
    }

    @Override
    protected Validacao consultar() throws Exception {
        ValidacaoPortaPON valid = new ValidacaoPortaPON(cg.getPortaPON(cust.getRede()), cust, bundle.getLocale());
        return null;
    }

}
