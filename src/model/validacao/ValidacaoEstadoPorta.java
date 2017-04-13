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
public class ValidacaoEstadoPorta extends Validacao {

    private EstadoDaPorta estadoPorta;

    public ValidacaoEstadoPorta(EstadoDaPorta e) {
        this.estadoPorta = e;
        this.nome = "Estado Porta";
        
        if(!estadoPorta.getAdminState().equalsIgnoreCase("UP")){
//            this.setDiagnostico(Boolean.FALSE);
            this.setMensagem("Porta Desativada (Adm state em Down)");
        }else if(estadoPorta.getAdminState().equalsIgnoreCase("UP") && estadoPorta.getOperState().equals("UP")){
//            this.setDiagnostico(Boolean.TRUE);
            this.setMensagem("Porta ativa e sincronizada");
        }else{
//            this.setDiagnostico(Boolean.FALSE);
            this.setMensagem("Porta Ativada porém sem sincronismo");
        }
    }

    /**
     * Implementar!
     *
     * @return
     */
    @Override
    public Boolean validar() {
        return false;
    }
}
