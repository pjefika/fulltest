/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;

/**
 *
 * @author G0042204
 */
public class ValidacaoCadastroTBS extends Validacao {

    private GetInfoOut info;

    public ValidacaoCadastroTBS(GetInfoOut info) {
        this.info = info;
    }

    /**
     * Implementar!
     *
     * @return
     */
    @Override
    public Boolean validar() {
        if (info.getInfoRadius().getRadiusProfile().contains("vala")) {
            return false;
        }

        return true;
    }
}
