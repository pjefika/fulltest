/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime.gpon;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.impl.AbstractDslam;
import model.validacao.ValidacaoEstadoPortaAdm;
import model.validacao.realtime.ValidacaoRealtimeAbs;

/**
 *
 * @author G0042204
 */
public class ValidacaoRtEstadoAdmPorta extends ValidacaoRealtimeAbs {

    private ValidacaoEstadoPortaAdm valid;

    public ValidacaoRtEstadoAdmPorta(AbstractDslam ds, EfikaCustomer cl) {
        super(ds, cl);
    }

    @Override
    public Boolean validar() {

        try {
            valid = new ValidacaoEstadoPortaAdm(dslam.getEstadoDaPorta(cl.getRede()));
            return valid.validar();
        } catch (Exception e) {
            return false;
        }

    }

}
