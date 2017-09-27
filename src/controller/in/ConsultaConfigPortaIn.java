/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.in;

import br.net.gvt.efika.customer.EfikaCustomer;
import model.log.AcaoEnum;
import model.log.LogIn;

/**
 *
 * @author G0042204
 */
public class ConsultaConfigPortaIn extends LogIn {

    private EfikaCustomer cust;

    @Override
    public Object input() {
        return cust;
    }

    @Override
    public AcaoEnum acao() {
        return AcaoEnum.CONSULTA_CONFIG_PORTA;
    }

    public EfikaCustomer getCust() {
        return cust;
    }

    public void setCust(EfikaCustomer cust) {
        this.cust = cust;
    }

}
