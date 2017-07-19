/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime.gpon;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.impl.AbstractDslam;
import model.validacao.ValidacaoEstadoPortaOper;
import model.validacao.realtime.ValidacaoRealtimeGpon;

public class ValidacaoRtEstadoOperPorta extends ValidacaoRealtimeGpon {

    private ValidacaoEstadoPortaOper valid;

    public ValidacaoRtEstadoOperPorta(AbstractDslam dslam, EfikaCustomer cl) {
        super(dslam, cl, "Estado Operacional da Porta");
    }

    @Override
    public Boolean validar() {
        try {
            valid = new ValidacaoEstadoPortaOper(consulta.getEstadoDaPorta(cust.getRede()));
            valid.validar();
            this.merge(valid);
            return valid.getResultado();
        } catch (Exception e) {
            return false;
        }
    }

}
