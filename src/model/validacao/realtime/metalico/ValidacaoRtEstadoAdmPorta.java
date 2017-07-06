/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime.metalico;

import model.validacao.realtime.gpon.*;
import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.impl.ConsultaClienteInter;
import dao.dslam.impl.ConsultaGponDefault;
import model.validacao.ValidacaoEstadoPortaAdm;
import model.validacao.realtime.ValidacaoRealtimeGpon;

/**
 *
 * @author G0042204
 */
public class ValidacaoRtEstadoAdmPorta extends ValidacaoRealtimeGpon {

    private ValidacaoEstadoPortaAdm valid;

    public ValidacaoRtEstadoAdmPorta(ConsultaClienteInter dslam, EfikaCustomer cust) {
        super(dslam, cust, "Estado Administrativo da Porta");
    }

    @Override
    public Boolean validar() {
        try {
            valid = new ValidacaoEstadoPortaAdm(consultaGpon.getEstadoDaPorta(cust.getRede()));
            valid.validar();
            this.merge(valid);
            return valid.getResultado();
        } catch (Exception e) {
            return false;
        }
    }

}
