/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.in;

import br.net.gvt.efika.customer.EfikaCustomer;
import model.log.AcaoEnum;
import model.log.LogIn;
import telecom.properties.EstadoDaPorta;

/**
 *
 * @author G0042204
 */
public class SetAdminStateIn extends LogIn {

    private EfikaCustomer cust;

    private EstadoDaPorta estadoPorta;

    @Override
    public EfikaCustomer input() {
        return cust;
    }

    @Override
    public AcaoEnum acao() {
        return AcaoEnum.SET_ADM_STATE;
    }

    public EfikaCustomer getCust() {
        return cust;
    }

    public void setCust(EfikaCustomer cust) {
        this.cust = cust;
    }

    public EstadoDaPorta getEstadoPorta() {
        return estadoPorta;
    }

    public void setEstadoPorta(EstadoDaPorta estadoPorta) {
        this.estadoPorta = estadoPorta;
    }

}
