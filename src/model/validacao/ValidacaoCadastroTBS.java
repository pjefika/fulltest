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
public class ValidacaoCadastroTBS extends Validacao implements Validator{
    
    private GetInfoOut cad;

    public ValidacaoCadastroTBS(GetInfoOut cad) {
        this.cad = cad;
    }

    @Override
    public Boolean validar() {
        return false;
    }

    
}
