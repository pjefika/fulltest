/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manobra.asserts.impl;

import br.net.gvt.efika.efika_customer.model.customer.asserts.AssertsEnum;
import br.net.gvt.efika.efika_customer.model.customer.asserts.EfikaAssertable;

/**
 *
 * @author G0042204
 */
public abstract class AssertAbstract implements EfikaAssertable {

    protected AssertsEnum as;

    public AssertAbstract(AssertsEnum as) {
        this.as = as;
    }

}
