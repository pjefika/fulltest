/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.gpon;

import br.net.gvt.efika.customer.EfikaCustomer;
import java.util.Locale;
import model.dslam.consulta.gpon.SerialOntGpon;
import model.validacao.impl.both.ValidacaoValidavel;

/**
 *
 * @author G0042204
 */
public class ValidacaoVizinhanca extends ValidacaoValidavel {

    private final SerialOntGpon serial;

    public ValidacaoVizinhanca(SerialOntGpon serial, EfikaCustomer cust, Locale local) {
        super(cust, serial, local);
        this.serial = serial;
    }

    @Override
    protected String fraseNegativa() {
        return bundle.getString("validacaoSerialOnt_nok");
    }

    @Override
    protected String frasePositiva() {
        return bundle.getString("validacaoSerialOnt_ok") + serial.getSerial() + ".";
    }

}