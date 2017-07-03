/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime.gpon;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.impl.ConsultaGponDefault;
import model.validacao.ValidacaoProfile;
import model.validacao.realtime.ValidacaoRealtimeGpon;

/**
 *
 * @author G0041775
 */
public class ValidacaoRtProfile extends ValidacaoRealtimeGpon {

    private ValidacaoProfile valid;

    public ValidacaoRtProfile(ConsultaGponDefault dslam, EfikaCustomer cl) {
        super(dslam, cl, "Profile");
    }

    @Override
    public Boolean validar() {
        try {
            valid = new ValidacaoProfile(consultaGpon.getProfile(cust.getRede()), cust);
            valid.validar();
            this.merge(valid);
            return valid.getResultado();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

}
