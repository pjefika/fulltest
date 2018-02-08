/*
 *To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import br.net.gvt.efika.customer.EfikaCustomer;
import br.net.gvt.efika.customer.InventarioRede;
import br.net.gvt.efika.customer.InventarioServico;
import br.net.gvt.efika.enums.TecnologiaLinha;
import br.net.gvt.efika.enums.TecnologiaTv;
import dao.dslam.impl.AlteracaoMetalicoDefault;
import dao.dslam.impl.ConsultaMetalicoDefault;
import fulltest.ValidacaoResult;
import model.fulltest.operacional.CustomerMock;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import telecom.config.ConfiguracaoDSLAM;


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
        ec = CustomerMock.getCustomer("4133335556");
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
        ConfigDslamServiceImpl instance = null;
        ValidacaoResult expResult = null;
        ValidacaoResult result = instance.getterTabelaRede();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
