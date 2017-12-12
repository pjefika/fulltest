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
import model.validacao.impl.both.ValidacaoFake;
import model.validacao.impl.both.ValidacaoPortaPON;

public class ValidadorVizinhanca extends ValidadorGpon {

    private String nome = "Teste de Vizinhança";

    public ValidadorVizinhanca(AbstractDslam dslam, EfikaCustomer cust, Locale local) {
        super(dslam, cust, local);
    }

    @Override
    protected Validacao consultar() throws Exception {
        if (!consulta.getEstadoDaPorta(cust.getRede()).getOperState()) {
            if (new ValidacaoPortaPON(cg.getPortaPON(cust.getRede()), cust, bundle.getLocale()).validar().getResultado()) {

            } else {
                return new ValidacaoFake(nome, locale, "Identificado falha massiva.", Boolean.FALSE);
            }
        }
        return new ValidacaoFake(nome, locale, "Não foi identificado falha massiva.", Boolean.TRUE);
    }

}
