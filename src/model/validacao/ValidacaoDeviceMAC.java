/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao;

import br.net.gvt.efika.customer.EfikaCustomer;
import exception.MetodoNaoImplementadoException;
import model.dslam.consulta.DeviceMAC;

/**
 *
 * @author G0041775
 */
public class ValidacaoDeviceMAC extends Validacao {
    
    private transient DeviceMAC mac;
    
    private transient EfikaCustomer e;
    
    public ValidacaoDeviceMAC(DeviceMAC v, EfikaCustomer ec) {
        super("MAC do Equipamento.");
        this.mac = v;
        this.e = ec;
    }
    
    @Override
    public Boolean validar() throws Exception{
        if (mac.validar(e)) {
            setMensagem("Mac identificado " + mac.getMac());
            setResultado(Boolean.TRUE);
            return true;
        }
        setMensagem("Não identificado MAC.");
        setResultado(Boolean.FALSE);
        return false;
    }
    
}
