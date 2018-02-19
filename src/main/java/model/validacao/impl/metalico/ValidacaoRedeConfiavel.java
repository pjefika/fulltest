/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.metalico;

import br.net.gvt.efika.customer.EfikaCustomer;
import java.util.Locale;
import model.validacao.impl.both.ValidacaoValidavel;
import telecom.properties.metalico.TabelaRedeMetalico;

/**
 *
 * @author G0042204
 */
public class ValidacaoRedeConfiavel extends ValidacaoValidavel {

    private final TabelaRedeMetalico tab;

    public ValidacaoRedeConfiavel(EfikaCustomer cust, TabelaRedeMetalico tab, Locale local) {
        super(cust, tab, local);
        this.tab = tab;
    }

    @Override
    protected String frasePositiva() {
        return "Rede confiável";
    }

    @Override
    protected String fraseNegativa() {
        return "Rede não confiável";
    }

}
