/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime.gpon;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.impl.ConsultaGponDefault;
import model.validacao.ValidacaoParametrosGpon;
import model.validacao.realtime.ValidacaoRealtimeGpon;

/**
 *
 * @author G0041775
 */
public class ValidacaoRtParametrosGpon extends ValidacaoRealtimeGpon {

    private ValidacaoParametrosGpon valid;

    public ValidacaoRtParametrosGpon(ConsultaGponDefault dslam, EfikaCustomer cl) {
        super(dslam, cl);
    }

    @Override
    public Boolean validar() {
        try {
            valid = new ValidacaoParametrosGpon(dslam.getTabelaParametros(cust.getRede()));
            return valid.validar();
        } catch (Exception e) {
            return false;
        }

    }

}
