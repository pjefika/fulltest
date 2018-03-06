/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.realtime.gpon;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import dao.dslam.impl.AbstractDslam;
import java.util.Locale;
import model.validacao.impl.both.Validacao;
import model.validacao.impl.gpon.ValidacaoAssociacaoOnt;
import model.validacao.impl.realtime.ValidadorGpon;

/**
 *
 * @author G0041775
 */
public class ValidadorSerialOntGpon extends ValidadorGpon {

    public ValidadorSerialOntGpon(AbstractDslam dslam, EfikaCustomer cust, Locale local) {
        super(dslam, cust, local);
    }

    @Override
    protected Validacao consultar() throws Exception {
        return new ValidacaoAssociacaoOnt(cg.getSerialOnt(cust.getRede()), cust, bundle.getLocale());
    }

}
