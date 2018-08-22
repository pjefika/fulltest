/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.realtime;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import dao.dslam.impl.AbstractDslam;
import java.util.Locale;
import model.validacao.impl.both.Validacao;
import model.validacao.impl.both.ValidacaoTabelaRede;

/**
 *
 * @author G0041775
 */
public class ValidadorTabelaRede extends ValidadorMetalico {

    public ValidadorTabelaRede(AbstractDslam dslam, EfikaCustomer cust, Locale local) {
        super(dslam, cust, local);
        nome = "Confiabilidade de Rede";
    }

    @Override
    protected Validacao consultar() throws Exception {
        return new ValidacaoTabelaRede(metalico.getTabelaRede(cust.getRede()), cust, bundle.getLocale());
    }

}