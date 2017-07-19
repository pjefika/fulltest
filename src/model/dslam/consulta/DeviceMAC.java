/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.consulta;

import br.net.gvt.efika.customer.EfikaCustomer;
import model.fulltest.validacao.Validavel;

/**
 *
 * @author G0041775
 */
public class DeviceMAC implements Validavel{
    
    public String mac = "";

    public DeviceMAC() {
    }
    
    public DeviceMAC(String m) {
        mac = m;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public Boolean validar(EfikaCustomer cust) {
        return !mac.isEmpty();
    }
    
    
}
