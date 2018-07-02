/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.gpon;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.TabelaParametrosGpon;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.TabelaParametrosGponBasic;
import java.util.Locale;
import model.validacao.impl.both.ValidacaoValidavel;

/**
 *
 * @author G0041775
 */
public class ValidacaoParametrosGpon extends ValidacaoValidavel {

    private final transient TabelaParametrosGpon t;

    public ValidacaoParametrosGpon(TabelaParametrosGponBasic t, EfikaCustomer cust, Locale local) {
        super(cust, t, local);
        this.t = (TabelaParametrosGpon) t;
    }

    @Override
    protected String frasePositiva() {
        return bundle.getString("validacaoParametros_ok");
    }

    @Override
    protected String fraseNegativa() {
        String complResp;
        if (t.getPotOlt() != null) {
            complResp = "Potência ONT deveria ser entre " + t.getPotOntMin() + " e " + t.getPotOntMax() + ", está em " + t.getPotOnt() + ". "
                    + "Potência OLT deveria ser entre " + t.getPotOltMin() + " e " + t.getPotOltMax() + ", está em " + t.getPotOlt() + ".";
        } else {
            complResp = "Potência OLT deveria ser entre " + t.getPotOltMin() + " e " + t.getPotOltMax() + ", está em " + t.getPotOlt() + ".";
        }

        return bundle.getString("validacaoParametros_nok") + " " + complResp;
    }

}
