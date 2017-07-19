/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.impl.AbstractDslam;
import dao.dslam.impl.ConsultaGponDefault;

/**
 *
 * @author G0042204
 */
public abstract class ValidacaoRealtimeGpon extends ValidacaoRealtime {

    protected ConsultaGponDefault cg;

    public ValidacaoRealtimeGpon(AbstractDslam dslam, EfikaCustomer cust, String nome) {
        super(dslam, cust, nome);
        this.cg = (ConsultaGponDefault) dslam;
    }

}
