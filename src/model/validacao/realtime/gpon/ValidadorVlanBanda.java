/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime.gpon;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.impl.AbstractDslam;
import model.validacao.impl.Validacao;
import model.validacao.impl.ValidacaoVlanBanda;
import model.validacao.realtime.Validador;

/**
 *
 * @author G0042204
 */
public class ValidadorVlanBanda extends Validador {

    public ValidadorVlanBanda(AbstractDslam dslam, EfikaCustomer cust) {
        super(dslam, cust);
    }

    @Override
    protected Validacao consultar() throws Exception {
        return new ValidacaoVlanBanda(consulta.getVlanBanda(cust.getRede()), cust);
    }

}
