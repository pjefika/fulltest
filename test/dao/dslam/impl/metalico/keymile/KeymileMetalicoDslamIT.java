/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.metalico.keymile;

import br.net.gvt.efika.customer.EfikaCustomer;
import br.net.gvt.efika.customer.InventarioRede;
import java.util.List;
import model.fulltest.operacional.CustomerMock;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import telecom.properties.EstadoDaPorta;
import telecom.properties.ReConexao;
import telecom.properties.metalico.TabelaRedeMetalico;
import util.GsonUtil;

/**
 *
 * @author G0041775
 */
public class KeymileMetalicoDslamIT {

    public KeymileMetalicoDslamIT() {
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

    private static EfikaCustomer cust = CustomerMock.getCustomer("2139705185");
    private static KeymileMetalicoSuadDslam instance = new KeymileMetalicoSuad1(cust.getRede().getIpDslam());
//    private static KeymileMetalicoSuvd11 instance = new KeymileMetalicoSuvd11(cust.getRede().getIpDslam());
    private static InventarioRede i = cust.getRede();

    /**
     * Test of getEstadoDaPorta method, of class KeymileMetalicoDslam.
     */
    @Test
    public void testGetEstadoDaPorta() throws Exception {
        System.out.println("getEstadoDaPorta");
        InventarioRede i = null;
        KeymileMetalicoDslam instance = null;
        EstadoDaPorta expResult = null;
        EstadoDaPorta result = instance.getEstadoDaPorta(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTabelaRede method, of class KeymileMetalicoDslam.
     */
    @Test
    public void testGetTabelaRede() throws Exception {
        System.out.println("getTabelaRede");
        TabelaRedeMetalico result = instance.getTabelaRede(i);
        System.out.println(GsonUtil.serialize(result));
        assertTrue(result.validar(cust));
    }

    /**
     * Test of getHistoricoTabelaRede method, of class KeymileMetalicoDslam.
     */
    @Test
    public void testGetHistoricoTabelaRede() throws Exception {
        System.out.println("getHistoricoTabelaRede");
        List<TabelaRedeMetalico> result = instance.getHistoricoTabelaRede(i);
        System.out.println(GsonUtil.serialize(result));
    }

    /**
     * Test of setEstadoDaPorta method, of class KeymileMetalicoDslam.
     */
    @Test
    public void testSetEstadoDaPorta() throws Exception {
        System.out.println("setEstadoDaPorta");
        InventarioRede i = null;
        EstadoDaPorta e = null;
        KeymileMetalicoDslam instance = null;
        EstadoDaPorta expResult = null;
        EstadoDaPorta result = instance.setEstadoDaPorta(i, e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resetTabelaRede method, of class KeymileMetalicoDslam.
     */
    @Test
    public void testResetTabelaRede() throws Exception {
        System.out.println("resetTabelaRede");
        InventarioRede i = null;
        KeymileMetalicoDslam instance = null;
        instance.resetTabelaRede(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReconexoes method, of class KeymileMetalicoDslam.
     */
    @Test
    public void testGetReconexoes() throws Exception {
        System.out.println("getReconexoes");
        ReConexao result = instance.getReconexoes(i);
        System.out.println(GsonUtil.serialize(result));
        assertTrue(result.validar(cust));
    }

}
