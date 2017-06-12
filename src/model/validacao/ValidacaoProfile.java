/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao;

import br.net.gvt.efika.customer.EfikaCustomer;
import model.dslam.consulta.Profile;

/**
 *
 * @author G0042204
 */
public class ValidacaoProfile extends ValidacaoEfikaCustomer {

    private Profile profile;

    public ValidacaoProfile(Profile profile, EfikaCustomer cust) {
        super(cust, "Profile");
        this.profile = profile;
    }

    
    @Override
    public Boolean validar() {
        if (profile.validar(cust)) {
            this.setResultado(Boolean.TRUE);
            this.setMensagem("Profile OK.");
            return true;
        } else {
            this.setResultado(Boolean.FALSE);
            this.setMensagem("Profile NOK.");
            return false;
        }
    }

}
