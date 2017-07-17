/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.impl.AbstractDslam;
import dao.dslam.impl.AlteracaoClienteInter;

/**
 *
 * @author G0042204
 */
public abstract class ValidacaoRealtimeCorretive extends ValidacaoRealtime {

    protected AlteracaoClienteInter alter;

    public ValidacaoRealtimeCorretive(AbstractDslam dslam, EfikaCustomer cust, String nome) {
        super(dslam, cust, nome);
        this.alter = (AlteracaoClienteInter) dslam;
    }

}
