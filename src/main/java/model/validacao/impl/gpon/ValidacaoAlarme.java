/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.gpon;

import br.net.gvt.efika.customer.EfikaCustomer;
import java.util.Locale;
import model.validacao.impl.both.ValidacaoValidavel;
import telecom.properties.gpon.AlarmesGpon;

/**
 *
 * @author G0042204
 */
public class ValidacaoAlarme extends ValidacaoValidavel {

    protected transient AlarmesGpon alarm;

    public ValidacaoAlarme(AlarmesGpon alarm, EfikaCustomer cust, Locale local) {
        super(cust, alarm, local);
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
