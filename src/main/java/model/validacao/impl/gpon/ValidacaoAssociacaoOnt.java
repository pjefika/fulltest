/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.gpon;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.SerialOntGpon;
import java.util.Locale;
import model.validacao.impl.both.ValidacaoValidavel;

/**
 *
 * @author G0042204
 */
public class ValidacaoAssociacaoOnt extends ValidacaoValidavel {

    private final SerialOntGpon serial;

    public ValidacaoAssociacaoOnt(SerialOntGpon serial, EfikaCustomer cust, Locale local) {
        super(cust, serial, local);
        this.serial = serial;
    }

    @Override
    protected String fraseNegativa() {
        return bundle.getString("validacaoSerialOnt_nok");
    }

    @Override
    protected String frasePositiva() {
        String serialOuId = cust.getRede().getIdOnt() == null ? serial.getSerial() : serial.getIdOnt();
        return bundle.getString("validacaoSerialOnt_ok") + serialOuId + ".";
    }

}
