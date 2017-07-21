/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime.gpon;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.impl.AbstractDslam;
import model.validacao.impl.Validacao;
import model.validacao.impl.ValidacaoEstadoPortaOper;
import model.validacao.realtime.ValidadorGpon;

public class ValidadorEstadoOperPorta extends ValidadorGpon {

    public ValidadorEstadoOperPorta(AbstractDslam dslam, EfikaCustomer cust) {
        super(dslam, cust);
    }

    @Override
    protected Validacao consultar() throws Exception {
        return new ValidacaoEstadoPortaOper(consulta.getEstadoDaPorta(cust.getRede()));
    }


}
