/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao;

import model.dslam.consulta.EstadoDaPorta;

/**
 *
 * @author G0042204
 */
public class ValidacaoEstadoPortaOper extends Validacao {

    protected transient EstadoDaPorta estadoPorta;

    public ValidacaoEstadoPortaOper(EstadoDaPorta e) {
        super("Estado Operacional da Porta");
        this.estadoPorta = e;
    }

    @Override
    public Boolean validar() {
        if (!estadoPorta.getOperState().equalsIgnoreCase("UP")) {
            this.setMensagem("Identificado que o modem está sem sincronismo, certifique-se com o cliente se está ligado e com os cabos conectados. Se sim, solicite ao cliente que reinicialize o modem e teste novamente.");
            this.setResultado(Boolean.FALSE);
            return false;
        } else {
            this.setResultado(Boolean.TRUE);
            this.setMensagem("Sincronismo ok.");
            return true;
        }
    }

}
