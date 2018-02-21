/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.in;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.SerialOntGpon;
import model.log.AcaoEnum;
import model.log.LogIn;

/**
 *
 * @author G0042204
 */
public class SetOntToOltIn extends LogIn {

    private EfikaCustomer cust;
    
    private SerialOntGpon serial;

    @Override
    public EfikaCustomer input() {
        return cust;
    }

    @Override
    public AcaoEnum acao() {
        return AcaoEnum.SET_ONT_TO_OLT;
    }

    public EfikaCustomer getCust() {
        return cust;
    }

    public void setCust(EfikaCustomer cust) {
        this.cust = cust;
    }

    public SerialOntGpon getSerial() {
        return serial;
    }

    public void setSerial(SerialOntGpon serial) {
        this.serial = serial;
    }
    
    

}
