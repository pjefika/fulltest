/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime.gpon.corretiva;

import model.validacao.realtime.gpon.*;
import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.impl.ConsultaGponDefault;
import model.validacao.gpon.ValidacaoAssociacaoOnt;

/**
 *
 * @author G0041775
 */
public class ValidacaoCorretivaRtSerialOntGpon extends ValidacaoRtSerialOntGpon {

    private ValidacaoAssociacaoOnt valid;

    public ValidacaoCorretivaRtSerialOntGpon(ConsultaGponDefault dslam, EfikaCustomer cl) {
        super(dslam, cl);
    }

    @Override
    public Boolean validar() {
        try {
            valid = new ValidacaoAssociacaoOnt(consultaGpon.getSerialOnt(cust.getRede()));
            valid.validar();
            this.merge(valid);
            return valid.getResultado();
        } catch (Exception e) {
            return false;
        }

    }

}
