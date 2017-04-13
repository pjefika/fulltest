/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao;

import com.gvt.ws.eai.oss.ossturbonetinconsistenciatbsradius.OSSTurbonetInconsistenciaTBSRadiusOut;
import java.com_gvt_oss_ossturbonet.GetInfoOut;

/**
 *
 * @author G0042204
 */
public class ValidacaoCadastroTBS extends Validacao {

    private GetInfoOut info;

    private OSSTurbonetInconsistenciaTBSRadiusOut i;

    public ValidacaoCadastroTBS(GetInfoOut info, OSSTurbonetInconsistenciaTBSRadiusOut i) {
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
        return !i.isEhInconsistente() && info != null && info.getInfoTBS().getStatus().equalsIgnoreCase("ATIVO");
    }
}
