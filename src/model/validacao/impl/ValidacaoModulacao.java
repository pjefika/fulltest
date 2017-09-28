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
public class ValidacaoModulacao extends ValidacaoValidavel {

    public ValidacaoModulacao(Profile profile, EfikaCustomer cust) {
        super(cust, profile);
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
