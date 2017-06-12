/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.impl.ConsultaGponDefault;
import model.validacao.ValidacaoEfikaCustomer;

/**
 *
 * @author G0042204
 */
public abstract class ValidacaoRealtimeGpon extends ValidacaoEfikaCustomer {

    protected ConsultaGponDefault dslam;

    public ValidacaoRealtimeGpon(ConsultaGponDefault dslam, EfikaCustomer cust, String nome) {
        super(cust, nome);
        this.dslam = dslam;
    }

}
