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
        return false;
    }
}
