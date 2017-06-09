/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime.gpon;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.impl.ConsultaGponDefault;
import model.validacao.ValidacaoEstadoPortaOper;
import model.validacao.realtime.ValidacaoRealtimeGpon;


public class ValidacaoRtEstadoOperPorta extends ValidacaoRealtimeGpon {

    private ValidacaoEstadoPortaOper valid;

    public ValidacaoRtEstadoOperPorta(ConsultaGponDefault dslam, EfikaCustomer cl) {
        super(dslam, cl);
    }

    @Override
    public Boolean validar() {
        try {
            valid = new ValidacaoEstadoPortaOper(dslam.getEstadoDaPorta(cust.getRede()));
            return valid.validar();
        } catch (Exception e) {
            return false;
        }
    }

}
