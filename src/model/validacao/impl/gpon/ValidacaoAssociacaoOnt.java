/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.gpon;

import br.net.gvt.efika.customer.EfikaCustomer;
import model.dslam.consulta.gpon.SerialOntGpon;
import model.validacao.impl.both.ValidacaoValidavel;

/**
 *
 * @author G0042204
 */
public class ValidacaoAssociacaoOnt extends ValidacaoValidavel {

    private final SerialOntGpon serial;

    public ValidacaoAssociacaoOnt(SerialOntGpon serial, EfikaCustomer cust) {
        super(cust, serial);
        this.serial = serial;
    }

    @Override
    protected String fraseNegativa() {
        return "Não foi identificado serial Gpon associado. Solicite o serial para o cliente e configure no Wise Tool(somente letras maiúsculas, ex.:MSTC010101).";
    }

    @Override
    protected String frasePositiva() {
        return "Identificado ONT associada: " + serial.getSerial() + ".";
    }

}
