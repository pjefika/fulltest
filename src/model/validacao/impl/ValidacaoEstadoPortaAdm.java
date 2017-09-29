/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl;

import model.dslam.consulta.EstadoDaPorta;

/**
 *
 * @author G0042204
 */
public class ValidacaoEstadoPortaAdm extends Validacao {

    protected transient EstadoDaPorta ep;

    public ValidacaoEstadoPortaAdm(EstadoDaPorta e) {
        super("Estado Administrativo da Porta");
        this.ep = e;
    }

    @Override
    public Boolean checar() {
        return ep.getAdminState();
    }

    @Override
    protected String frasePositiva() {
        return "Porta Ativada (Adm state Up).";
    }

    @Override
    protected String fraseNegativa() {
        return "Porta Desativada (Adm state em Down).";
    }

}
