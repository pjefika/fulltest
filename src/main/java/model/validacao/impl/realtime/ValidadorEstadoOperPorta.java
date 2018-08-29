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
import model.validacao.impl.both.ValidacaoEstadoPortaOper;

public class ValidadorEstadoOperPorta extends Validador {

    public ValidadorEstadoOperPorta(AbstractDslam dslam, EfikaCustomer cust, Locale local) {
        super(dslam, cust, local);
        nome = "Estado Operacional da Porta";
    }

    @Override
    protected Validacao consultar() throws Exception {
        return new ValidacaoEstadoPortaOper(consulta.getEstadoDaPorta(cust.getRede()), bundle.getLocale());
    }

}
