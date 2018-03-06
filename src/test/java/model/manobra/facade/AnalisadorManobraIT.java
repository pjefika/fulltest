/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manobra.facade;

import br.net.gvt.efika.efika_customer.model.customer.CustomerAssert;
import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.efika_customer.model.customer.asserts.AssertsEnum;
import java.util.ArrayList;
import java.util.List;
import model.manobra.analitcs.FinalizacaoManobra;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author G0042204
 */
public class AnalisadorManobraIT {

    public AnalisadorManobraIT() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of analisar method, of class AnalisadorManobra.
     */
    @Test
    public void testAnalisar() {
        System.out.println("analisar");

        EfikaCustomer e = new EfikaCustomer();

        List<CustomerAssert> lst = new ArrayList<>();

        lst.add(new CustomerAssert(AssertsEnum.REDE_CONFIAVEL, Boolean.FALSE));
        lst.add(new CustomerAssert(AssertsEnum.RESYNC_MENOR_300, Boolean.TRUE));
        lst.add(new CustomerAssert(AssertsEnum.RESYNC_MENOR_50, Boolean.TRUE));
        lst.add(new CustomerAssert(AssertsEnum.RESYNC_MENOR_5, Boolean.TRUE));
        lst.add(new CustomerAssert(AssertsEnum.HAS_SYNC, Boolean.TRUE));
        lst.add(new CustomerAssert(AssertsEnum.AUTH_ABERTURA_ORDEM, Boolean.TRUE));
        lst.add(new CustomerAssert(AssertsEnum.ATT_DOWN_OK, Boolean.TRUE));
        lst.add(new CustomerAssert(AssertsEnum.ATT_UP_OK, Boolean.TRUE));

        lst.add(new CustomerAssert(AssertsEnum.PACOTES_DOWN_MAIOR_6000, Boolean.TRUE));
        lst.add(new CustomerAssert(AssertsEnum.PACOTES_UP_MAIOR_4000, Boolean.TRUE));
        e.setAsserts(lst);

        AnalisadorManobra instance = new AnalisadorManobraFacade(e);
        FinalizacaoManobra result = instance.analisar();
        
        System.out.println("end");
        
    }

}
