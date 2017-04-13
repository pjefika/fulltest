/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import com.gvt.www.ws.eai.oss.OSSTurbonetInconsistenciaTBSRadius.OSSTurbonetInconsistenciaTBSRadiusOut;

/**
 *
 * @author G0042204
 */
public class ValidacaoEstadoPorta extends Validacao {

    private GetInfoOut info;

    private OSSTurbonetInconsistenciaTBSRadiusOut i;

    public ValidacaoEstadoPorta(GetInfoOut info, OSSTurbonetInconsistenciaTBSRadiusOut i) {
        this.info = info;
        this.i = i;
        this.nome = "Cadastro TBS";
    }

    /**
     * Implementar!
     *
     * @return
     */
    @Override
    public Boolean validar() {
        return !i.getEhInconsistente() && info != null && info.getInfoTBS().getStatus().equalsIgnoreCase("ATIVO");
    }
}
