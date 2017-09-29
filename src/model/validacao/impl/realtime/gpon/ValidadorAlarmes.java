/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.realtime.gpon;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.impl.AbstractDslam;
import model.validacao.impl.both.Validacao;
import model.validacao.impl.gpon.ValidacaoAlarme;
import model.validacao.impl.realtime.ValidadorGpon;

/**
 *
 * @author G0042204
 */
public class ValidadorAlarmes extends ValidadorGpon {

    public ValidadorAlarmes(AbstractDslam dslam, EfikaCustomer cust) {
        super(dslam, cust);
    }

    @Override
    protected Validacao consultar() throws Exception {
        return new ValidacaoAlarme(cg.getAlarmes(cust.getRede()), cust);
    }

}
