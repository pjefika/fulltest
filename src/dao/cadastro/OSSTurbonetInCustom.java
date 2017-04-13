/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.cadastro;

import com.gvt.ws.eai.oss.ossturbonet.OSSTurbonetIn;
import java.com_gvt_oss_ossturbonet.GetInfoOut;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

/**
 *
 * @author G0042204
 */
public class OSSTurbonetInCustom extends OSSTurbonetIn {

    public OSSTurbonetInCustom(String designador) {

        JAXBElement<String> jaxbElement
                = new JAXBElement(new QName("http://mycompany/services", "instancia"), String.class, designador);

        this.setDesignador(jaxbElement);
        this.setInstancia(jaxbElement);
        this.setDesignador(jaxbElement);
        this.setDesignadorAcesso(jaxbElement);
        this.setLogin("wise");
        this.setSistemaOriginario("wise");
        this.setUsuario("wise");
    }

    public OSSTurbonetInCustom(GetInfoOut info) {
        JAXBElement<String> jaxbElement
                = new JAXBElement(new QName("http://mycompany/services", "instancia"), String.class, info.getDesignator());

        this.setDesignador(jaxbElement);
        this.setInstancia(jaxbElement);
        this.setDesignador(jaxbElement);
        this.setDesignadorAcesso(jaxbElement);
        this.setLogin("wise");
        this.setSistemaOriginario("wise");
        this.setUsuario("wise");
    }

}
