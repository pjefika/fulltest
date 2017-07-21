/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime.gpon;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.impl.AbstractDslam;
import model.validacao.impl.Validacao;
import model.validacao.impl.ValidacaoVlanMulticast;
import model.validacao.realtime.ValidadorGpon;

/**
 *
 * @author G0042204
 */
public class ValidadorMulticast extends ValidadorGpon {

    public ValidadorMulticast(AbstractDslam dslam, EfikaCustomer cust) {
        super(dslam, cust);
    }

    @Override
    protected Validacao consultar() throws Exception {
        return new ValidacaoVlanMulticast(cg.getVlanMulticast(cust.getRede()), cust);
    }

    

}
