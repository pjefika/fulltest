/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.both;

import br.net.gvt.efika.customer.EfikaCustomer;
import java.util.Locale;
import telecom.properties.metalico.Modulacao;

/**
 *
 * @author G0042204
 */
public class ValidacaoModulacao extends ValidacaoValidavel {

    public ValidacaoModulacao(Modulacao modul, EfikaCustomer cust, Locale local) {
        super(cust, modul, local);
    }

    @Override
    protected String frasePositiva() {
        return "Modulação configurada corretamente.";
    }

    @Override
    protected String fraseNegativa() {
        return "Modulação divergente da velocidade contratada.";
    }

}
