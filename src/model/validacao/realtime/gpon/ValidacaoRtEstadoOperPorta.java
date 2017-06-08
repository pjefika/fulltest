/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime.gpon;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.impl.AbstractDslam;
import model.validacao.ValidacaoEstadoPortaOper;
import model.validacao.realtime.ValidacaoRealtimeAbs;

/**
 *
 * @author G0041775
 */
public class ValidacaoRtEstadoOperPorta extends ValidacaoRealtimeAbs {

    private ValidacaoEstadoPortaOper valid;

    public ValidacaoRtEstadoOperPorta(AbstractDslam ds, EfikaCustomer cl) {
        super(ds, cl);
    }

    @Override
    public Boolean validar() {

        try {
            valid = new ValidacaoEstadoPortaOper(dslam.getEstadoDaPorta(cl.getRede()));
            return valid.validar();
        } catch (Exception e) {
            return false;
        }

    }

}
