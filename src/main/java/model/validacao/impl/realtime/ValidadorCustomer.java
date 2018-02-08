/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.realtime;

import br.net.gvt.efika.customer.EfikaCustomer;

/**
 *
 * @author G0042204
 */
public abstract class ValidadorCustomer {

    private EfikaCustomer cust;

    public ValidadorCustomer(EfikaCustomer cust) {
        this.cust = cust;
    }

    public EfikaCustomer getCust() {
        return cust;
    }

    public void setCust(EfikaCustomer cust) {
        this.cust = cust;
    }

}
