/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime.metalico;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.impl.ConsultaClienteInter;
import model.validacao.ValidacaoProfile;
import model.validacao.realtime.ValidacaoRealtimeMetalico;

/**
 *
 * @author G0041775
 */
public class ValidacaoRtProfile extends ValidacaoRealtimeMetalico {

    private ValidacaoProfile valid;

    public ValidacaoRtProfile(ConsultaClienteInter dslam, EfikaCustomer cl) {
        super(dslam, cl, "Profile");
    }

    @Override
    public Boolean validar() {
        try {
            valid = new ValidacaoProfile(consultaMetalico.getProfile(cust.getRede()), cust);
            valid.validar();
            this.merge(valid);
            return valid.getResultado();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

}
