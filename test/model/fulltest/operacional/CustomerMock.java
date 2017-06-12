/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional;

import br.net.gvt.efika.customer.EfikaCustomer;
import br.net.gvt.efika.customer.InventarioRede;
import br.net.gvt.efika.customer.InventarioServico;

/**
 *
 * @author G0042204
 */
public class CustomerMock {

    public static EfikaCustomer gponKeymile() {

        EfikaCustomer c = new EfikaCustomer();

        InventarioRede r = new InventarioRede();
        r.setIpDslam("10.131.41.172");
        r.setModeloDslam("SUGP1");

        r.setSlot(20);
        r.setPorta(4);
        r.setSequencial(3356);
        r.setLogica(4);
        r.setRin(573);

        r.setVlanVoip(1573);
        r.setVlanVod(3573);
        r.setVlanMulticast(4000);

        c.setRede(r);

        InventarioServico s = new InventarioServico();
        s.setIsHib(Boolean.FALSE);
        s.setIsSip(Boolean.TRUE);

        c.setServicos(s);

        return c;
    }
}
