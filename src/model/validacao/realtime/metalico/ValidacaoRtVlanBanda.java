/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime.metalico;

import model.validacao.realtime.gpon.*;
import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.impl.ConsultaGponDefault;
import model.validacao.ValidacaoVlanBanda;
import model.validacao.realtime.ValidacaoRealtimeGpon;

/**
 *
 * @author G0042204
 */
public class ValidacaoRtVlanBanda extends ValidacaoRealtimeGpon {

    private ValidacaoVlanBanda valid;

    public ValidacaoRtVlanBanda(ConsultaGponDefault dslam, EfikaCustomer cust) {
        super(dslam, cust, "Vlan Banda");
    }

    @Override
    public Boolean validar() {
        try {
            valid = new ValidacaoVlanBanda(consultaGpon.getVlanBanda(cust.getRede()), cust);
            valid.validar();
            this.merge(valid);
            return valid.getResultado();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}