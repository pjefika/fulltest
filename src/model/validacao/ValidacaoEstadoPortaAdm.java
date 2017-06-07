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
public class ValidacaoEstadoPortaAdm extends Validacao {

    protected transient EstadoDaPorta estadoPorta;

    public ValidacaoEstadoPortaAdm(EstadoDaPorta e) {
        this.estadoPorta = e;
        this.nome = "Estado Porta";

    }

    @Override
    public Boolean validar() {
        if (!estadoPorta.getAdminState().equalsIgnoreCase("UP")) {
            this.setMensagem("Porta Desativada (Adm state em Down).");
            this.setResultado(Boolean.FALSE);
            return false;
        } else if (estadoPorta.getAdminState().equalsIgnoreCase("UP") && estadoPorta.getOperState().equals("UP")) {
            this.setMensagem("Porta ativa e sincronizada.");
            this.setResultado(Boolean.TRUE);
            return true;
        } else {
            this.setResultado(Boolean.TRUE);
            this.setMensagem("Porta Ativada porém sem sincronismo.");
            return true;
        }
    }

}
