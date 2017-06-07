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
        this.estadoPorta = e;
        this.nome = "Estado Operacional da Porta";

    }

    @Override
    public Boolean validar() {
        if (!estadoPorta.getOperState().equalsIgnoreCase("UP")) {
            this.setMensagem("Não há Link.");
            this.setResultado(Boolean.FALSE);
            return false;
        } else {
            this.setResultado(Boolean.TRUE);
            this.setMensagem("Linkado ok.");
            return true;
        }
    }

}
