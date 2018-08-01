/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.both;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.fulltest.model.telecom.properties.Profile;
import java.util.Locale;

/**
 *
 * @author G0042204
 */
public class ValidacaoProfile extends ValidacaoValidavel {

    public ValidacaoProfile(Profile profile, EfikaCustomer cust, Locale local) {
        super(cust, profile, local);
    }

    @Override
    protected String frasePositiva() {
        return bundle.getString("validacaoProfile_ok");
    }

    @Override
    protected String fraseNegativa() {
        return bundle.getString("validacaoProfile_nok");
    }

}
