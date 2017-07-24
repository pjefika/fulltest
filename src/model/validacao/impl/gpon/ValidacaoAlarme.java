/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.gpon;

import br.net.gvt.efika.customer.EfikaCustomer;
import model.dslam.consulta.gpon.AlarmesGpon;
import model.validacao.impl.ValidacaoValidavel;

/**
 *
 * @author G0042204
 */
public class ValidacaoAlarme extends ValidacaoValidavel {

    protected transient AlarmesGpon alarm;

    public ValidacaoAlarme(AlarmesGpon alarm, EfikaCustomer cust) {
        super(cust, alarm);
        this.alarm = alarm;
    }

    @Override
    protected String frasePositiva() {
        return "Não existem alarmes para a porta.";
    }

    @Override
    protected String fraseNegativa() {
        return "Existem alarmes para a porta, necessário verificação física.";
    }

}
