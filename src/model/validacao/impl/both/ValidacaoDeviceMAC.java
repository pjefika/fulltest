/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.both;

import br.net.gvt.efika.customer.EfikaCustomer;
import java.util.Locale;
import model.dslam.consulta.DeviceMAC;

/**
 *
 * @author G0041775
 */
public class ValidacaoDeviceMAC extends ValidacaoValidavel {

    private final transient DeviceMAC mac;

    public ValidacaoDeviceMAC(DeviceMAC mac, EfikaCustomer cust, Locale local) {
        super(cust, mac, local);
        this.mac = mac;
    }
    
    

    @Override
    protected String frasePositiva() {
        return "Mac identificado " + mac.getMac() + ".";
    }

    @Override
    protected String fraseNegativa() {
        return "Não identificado MAC do modem, solicite ao cliente que reinicialize o equipamento e execute o teste novamente.";
    }

}
