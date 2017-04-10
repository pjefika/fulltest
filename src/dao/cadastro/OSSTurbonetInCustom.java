/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.cadastro;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetIn;

/**
 *
 * @author G0042204
 */
public class OSSTurbonetInCustom extends OSSTurbonetIn {

    public OSSTurbonetInCustom(String designador) {
        this.setInstancia(designador);
        this.setDesignador(designador);
        this.setDesignadorAcesso(designador);
        this.setLogin("wise");
        this.setSistemaOriginario("wise");
        this.setUsuario("wise");
    }

    public OSSTurbonetInCustom(GetInfoOut info) {
        this.setInstancia(info.getDesignator());
        this.setDesignador(info.getDesignator());
        this.setDesignadorAcesso(info.getAccessDesignator());
        this.setLogin("wise");
        this.setSistemaOriginario("wise");
        this.setUsuario("wise");
    }

}
