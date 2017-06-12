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
        this.nome = "Estado Administrativo da Porta";

    }

    @Override
    public Boolean validar() {
        System.out.println("estadoPorta.getAdminState(): " + estadoPorta.getAdminState());
        if (estadoPorta.getAdminState().equalsIgnoreCase("UP")) {
            this.setResultado(Boolean.TRUE);
            this.setMensagem("Porta Ativada (Adm state Up)");
            return true;
        } else {
            this.setResultado(Boolean.FALSE);
            this.setMensagem("Porta Desativada (Adm state em Down).");
            return false;
        }
    }

}
