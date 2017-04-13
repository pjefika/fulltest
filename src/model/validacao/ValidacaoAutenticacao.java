/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao;

import java.com_gvt_oss_ossturbonet.InfoRadius;

/**
 *
 * @author G0042204
 */
public class ValidacaoAutenticacao extends Validacao {

    private InfoRadius info;

    public ValidacaoAutenticacao(InfoRadius info) {
        this.info = info;
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
