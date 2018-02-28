/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.both;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.PortaPON;
import java.util.Locale;

/**
 *
 * @author G0042204
 */
public class ValidacaoPortaPON extends ValidacaoValidavel {

    protected transient PortaPON pon;

    public ValidacaoPortaPON(PortaPON pon, EfikaCustomer cust, Locale local) {
        super(cust, pon, local);
        this.pon = pon;
    }

    @Override
    protected String frasePositiva() {
        return "Estado Operacional da Porta PON OK.";
    }

    @Override
    protected String fraseNegativa() {
        return "Orientação Abertura de Massiva, Porta PON desabilitada.";
    }

}
