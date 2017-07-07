/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.gpon;

import model.dslam.consulta.gpon.SerialOntGpon;
import model.validacao.Validacao;

/**
 *
 * @author G0042204
 */
public class ValidacaoAssociacaoOnt extends Validacao {

    private final SerialOntGpon serial;

    public ValidacaoAssociacaoOnt(SerialOntGpon serial) {
        super("Associação Serial ONT");
        this.serial = serial;
    }

    @Override
    public Boolean validar() {
        if (serial.getSerial().isEmpty()) {
            this.setMensagem("Não foi identificado serial Gpon associado. Solicite o serial para o cliente e configure no Wise Tool(somente letras maiúsculas, ex.:MSTC010101).");
            this.setResultado(Boolean.FALSE);
            return true;
        } else {
            this.setResultado(Boolean.TRUE);
            this.setMensagem("Identificado ONT associada: " + serial.getSerial()+".");
            return false;
        }
    }

}
