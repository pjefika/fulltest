/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.gpon;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.TabelaParametrosGponBasic;
import java.util.Locale;
import model.validacao.impl.both.ValidacaoValidavel;

/**
 *
 * @author G0041775
 */
public class ValidacaoParametrosGpon extends ValidacaoValidavel {

    private final transient TabelaParametrosGponBasic t;

    public ValidacaoParametrosGpon(TabelaParametrosGponBasic t, EfikaCustomer cust, Locale local) {
        super(cust, t, local);
        this.t = t;
    }

    @Override
    protected String frasePositiva() {
        return "Parâmetros dentro do padrão (entre -8 e -26).";
    }

    @Override
    protected String fraseNegativa() {
//        return "Parâmetros fora do padrão (entre -8 e -28). Pot. OLT: " + t.getPotOlt() + ". "
//                + "Pot. ONT: " + t.getPotOnt() + ". Seguir o fluxo com o problema/sintoma informado pelo cliente.";
        return "Parâmetros fora do padrão (entre -8 e -26).";
    }

}
