/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.manobra;

import model.dslam.consulta.EstadoDaPorta;
import model.validacao.ValidacaoEstadoPorta;

/**
 *
 * @author G0042204
 */
public class ValidacaoEstadoPortaManobra extends ValidacaoEstadoPorta {

    public ValidacaoEstadoPortaManobra(EstadoDaPorta e) {
        super(e);
    }

    /**
     * Implementar!
     *
     * @return
     */
    @Override
    public Boolean validar() {
        if (!estadoPorta.getAdminState().equalsIgnoreCase("UP")) {
            this.setMensagem("Porta Desativada (Adm state em Down).");
        } else if (estadoPorta.getAdminState().equalsIgnoreCase("UP") && estadoPorta.getOperState().equals("UP")) {
            this.setMensagem("Porta ativa e sincronizada.");
        } else {
            this.setMensagem("Porta Ativada porém sem sincronismo.");
        }
        
        Boolean b = estadoPorta.getAdminState().equalsIgnoreCase("UP");
        this.setResultado(b);
        return b;
    }
}
