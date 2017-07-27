/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manobra.analitcs;

import br.net.gvt.efika.asserts.AssertsEnum;
import br.net.gvt.efika.customer.CustomerAssert;

/**
 *
 * @author G0042204
 */
public class CustomerAssertImpl extends CustomerAssert {

    public CustomerAssertImpl(AssertsEnum asserts, Boolean value) {
        super(asserts, value);
    }

    public CustomerAssertImpl() {
    }
    
    

    @Override
    public boolean equals(Object obj) {
        return equals((CustomerAssertImpl) obj);
    }

    public boolean equals(CustomerAssertImpl dev) {
        return dev.getAsserts().equals(this.getAsserts()) && dev.getValue().equals(this.getValue());
    }

}
