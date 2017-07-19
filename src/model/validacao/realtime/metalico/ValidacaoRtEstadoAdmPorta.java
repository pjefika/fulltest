/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime.metalico;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.impl.AbstractDslam;
import model.validacao.ValidacaoEstadoPortaAdm;
import model.validacao.realtime.ValidacaoRealtime;

/**
 *
 * @author G0042204
 */
public class ValidacaoRtEstadoAdmPorta extends ValidacaoRealtime {

    private ValidacaoEstadoPortaAdm valid;

    public ValidacaoRtEstadoAdmPorta(AbstractDslam dslam, EfikaCustomer cust) {
        super(dslam, cust, "Estado Administrativo da Porta");
    }

    @Override
    public Boolean validar() {
        try {
            valid = new ValidacaoEstadoPortaAdm(consulta.getEstadoDaPorta(cust.getRede()));
            valid.validar();
            this.merge(valid);
            return valid.getResultado();
        } catch (Exception e) {
            return false;
        }
    }

}
