/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.metalico;

import br.net.gvt.efika.customer.EfikaCustomer;
import model.dslam.consulta.metalico.TabelaRedeMetalico;
import model.validacao.impl.both.ValidacaoValidavel;

/**
 *
 * @author G0042204
 */
public class ValidacaoRedeConfiavel extends ValidacaoValidavel {

    private final TabelaRedeMetalico tab;

    public ValidacaoRedeConfiavel(EfikaCustomer cust, TabelaRedeMetalico tab) {
        super(cust, tab);
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
