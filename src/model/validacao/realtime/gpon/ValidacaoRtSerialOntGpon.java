/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime.gpon;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.impl.AbstractDslam;
import model.validacao.gpon.ValidacaoAssociacaoOnt;
import model.validacao.realtime.ValidacaoRealtimeGpon;

/**
 *
 * @author G0041775
 */
public class ValidacaoRtSerialOntGpon extends ValidacaoRealtimeGpon {

    private ValidacaoAssociacaoOnt valid;

    public ValidacaoRtSerialOntGpon(AbstractDslam dslam, EfikaCustomer cl) {
        super(dslam, cl, "Associação Serial ONT");
    }

    @Override
    public Boolean validar() {
        try {
            valid = new ValidacaoAssociacaoOnt(cg.getSerialOnt(cust.getRede()));
            valid.validar();
            this.merge(valid);
            return valid.getResultado();
        } catch (Exception e) {
            return false;
        }

    }

}
