/*
 *To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.efika_customer.model.customer.InventarioRede;
import br.net.gvt.efika.efika_customer.model.customer.InventarioServico;
import br.net.gvt.efika.efika_customer.model.customer.enums.TecnologiaLinha;
import br.net.gvt.efika.efika_customer.model.customer.enums.TecnologiaTv;
import br.net.gvt.efika.fulltest.model.fulltest.ValidacaoResult;
import br.net.gvt.efika.fulltest.model.telecom.config.ConfiguracaoDSLAM;
import br.net.gvt.efika.util.json.JacksonMapper;
import dao.dslam.impl.AlteracaoMetalicoDefault;
import dao.dslam.impl.ConsultaMetalicoDefault;
import model.fulltest.operacional.CustomerMock;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 *
 * @author G0041775
 */
public class ConfigDslamServiceImplIT {

    public ConfigDslamServiceImplIT() {
    }

    private static ConfigDslamServiceImpl instance;

    private static EfikaCustomer ec;

    private InventarioRede i;

    private InventarioServico s;

    @BeforeClass
    public static void setUpClass() {
        ec = CustomerMock.getCustomer("BHE-811OZ6Y6QU-013");
        instance = new ConfigDslamServiceImpl(ec);
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        i = ec.getRede();
        s = ec.getServicos();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of consultar method, of class ConfigDslamServiceImpl.
     */
    @Test
    public void testConsultar() throws Exception {
        System.out.println("consultar");
        s.setTipoTv(TecnologiaTv.HIBRIDA);
        s.setTipoLinha(TecnologiaLinha.SIP);

        try {

            ConfiguracaoDSLAM result = instance.consultar();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * Test of consulta method, of class ConfigDslamServiceImpl.
     */
    @Test
    public void testConsulta() throws Exception {
        System.out.println("consulta");
        ConfigDslamServiceImpl instance = null;
        ConsultaMetalicoDefault expResult = null;
        ConsultaMetalicoDefault result = instance.consulta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alteracao method, of class ConfigDslamServiceImpl.
     */
    @Test
    public void testAlteracao() throws Exception {
        System.out.println("alteracao");
        ConfigDslamServiceImpl instance = null;
        AlteracaoMetalicoDefault expResult = null;
        AlteracaoMetalicoDefault result = instance.alteracao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resetTabelaRede method, of class ConfigDslamServiceImpl.
     */
    @Test
    public void testResetTabelaRede() throws Exception {
        System.out.println("resetTabelaRede");
        ConfigDslamServiceImpl instance = null;
        instance.resetTabelaRede();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getterTabelaRede method, of class ConfigDslamServiceImpl.
     */
    @Test
    public void testGetterTabelaRede() throws Exception {
        System.out.println("getterTabelaRede");

        ValidacaoResult result = instance.getterTabelaRede();
        System.out.println(new JacksonMapper(ValidacaoResult.class).serialize(result));
    }

}
