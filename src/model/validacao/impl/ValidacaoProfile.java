/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl;

import br.net.gvt.efika.customer.EfikaCustomer;
import model.dslam.consulta.Profile;

/**
 *
 * @author G0042204
 */
public class ValidacaoProfile extends ValidacaoValidavel {

    private final Profile profile;

    public ValidacaoProfile(Profile profile, EfikaCustomer cust) {
        super(cust, profile);
        this.profile = profile;
    }

    @Override
    protected String frasePositiva() {
        return "Profile configurado corretamente.";
    }

    @Override
    protected String fraseNegativa() {
        return "Profile divergente da velocidade contratada.";
    }

}