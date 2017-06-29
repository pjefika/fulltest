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
        
        //3133933176
        r.setIpDslam("10.131.38.18");
        r.setModeloDslam("SUGP1");

        r.setSlot(13);
        r.setPorta(8);
        r.setSequencial(3230);
        r.setCvLan(3330);
        r.setLogica(6);
        r.setRin(162);

        r.setVlanVoip(1162);
        r.setVlanVod(3162);
        r.setVlanMulticast(4000);

        c.setRede(r);

        InventarioServico s = new InventarioServico();
        s.setIsHib(Boolean.FALSE);
        s.setIsSip(Boolean.TRUE);
        s.setVelDown(51200l);
        s.setVelUp(25600l);

        c.setServicos(s);

        return c;
    }

    public static EfikaCustomer gponZhone() {

        EfikaCustomer c = new EfikaCustomer();

        InventarioRede r = new InventarioRede();
        r.setIpDslam("10.214.57.7");
        r.setModeloDslam("GPON_CARD8");

        r.setSlot(13);
        r.setPorta(1);
        r.setSequencial(3074);
        r.setLogica(2);
        r.setRin(7);

        r.setVlanVoip(1007);
        r.setVlanVod(3007);
        r.setVlanMulticast(4000);

        c.setRede(r);

        InventarioServico s = new InventarioServico();
        s.setIsHib(Boolean.TRUE);
        s.setIsSip(Boolean.TRUE);
        s.setVelDown(15360l);
        s.setVelUp(1024l);

        c.setServicos(s);

        return c;
    }

    public static EfikaCustomer gponZhone1() {

        EfikaCustomer c = new EfikaCustomer();

        InventarioRede r = new InventarioRede();
        r.setIpDslam("10.214.57.14");
        r.setModeloDslam("GPON_CARD8");

        r.setSlot(2);
        r.setPorta(8);
        r.setSequencial(501);
        r.setLogica(21);
        r.setRin(6);

        r.setVlanVoip(1006);
        r.setVlanVod(3006);
        r.setVlanMulticast(4000);

        c.setRede(r);

        InventarioServico s = new InventarioServico();
        s.setIsHib(Boolean.FALSE);
        s.setIsSip(Boolean.TRUE);
        s.setVelDown(5120l);
        s.setVelUp(1024l);

        c.setServicos(s);

        return c;
    }

    public static EfikaCustomer gponAlcatel() {

        EfikaCustomer c = new EfikaCustomer();
        InventarioRede r = new InventarioRede();

        //1630145676
        r.setIpDslam("10.214.57.22");
        r.setModeloDslam("GPON_CARD");

        r.setSlot(7);
        r.setPorta(7);
        r.setSequencial(2749);
        r.setLogica(17);
        r.setRin(14);

        r.setVlanVoip(1014);
        r.setVlanVod(3014);
        r.setVlanMulticast(4000);

        c.setRede(r);

        InventarioServico s = new InventarioServico();
        s.setIsHib(Boolean.FALSE);
        s.setIsSip(Boolean.TRUE);
        s.setVelDown(51200l);
        s.setVelUp(25600l);

        c.setServicos(s);

        return c;
    }

}
