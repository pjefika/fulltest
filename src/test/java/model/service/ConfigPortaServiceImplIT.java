/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.efika_customer.model.customer.mock.CustomerMock;
import br.net.gvt.efika.fulltest.model.fulltest.ValidacaoResult;
import br.net.gvt.efika.fulltest.model.telecom.config.ConfiguracaoPorta;
import br.net.gvt.efika.fulltest.model.telecom.properties.EstadoDaPorta;
import br.net.gvt.efika.util.json.JacksonMapper;
import dao.dslam.impl.AlteracaoClienteInter;
import dao.dslam.impl.ConsultaClienteInter;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author G0041775
 */
public class ConfigPortaServiceImplIT {

    public ConfigPortaServiceImplIT() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    EfikaCustomer cust = model.fulltest.operacional.CustomerMock.getCustomer("4730441489");

    ConfigPortaServiceImpl instance = new ConfigPortaServiceImpl(cust);

    @Before
    public void setUp() {
//        try {
//            cust = (EfikaCustomer) new JacksonMapper(EfikaCustomer.class).deserialize("{\"designador\":\"FNS-8148UP9JME-013\",\"instancia\":\"4830309808\",\"designadorAcesso\":\"FNS-17997319-069\",\"designadorTv\":null,\"rede\":{\"tipo\":\"GPON\",\"origem\":\"ONLINE\",\"planta\":\"VIVO2\",\"ipDslam\":\"10.141.76.150\",\"vendorDslam\":\"ALCATEL\",\"modeloDslam\":\"GPON_CARD\",\"idOnt\":null,\"terminal\":null,\"ipMulticast\":null,\"nrc\":null,\"slot\":7,\"porta\":3,\"sequencial\":2225,\"logica\":49,\"rin\":242,\"vlanVoip\":1242,\"vlanVod\":3242,\"vlanMulticast\":4000,\"cvlan\":2325,\"bhs\":null},\"redeExterna\":{\"tipo\":null,\"origem\":null,\"planta\":null,\"splitter1n\":null,\"splitter2n\":null,\"caboAlim\":null,\"fibra1n\":null,\"fibra2n\":null},\"servicos\":{\"origem\":null,\"velDown\":102400,\"velUp\":51200,\"tipoTv\":null,\"tipoLinha\":\"SIP\"},\"linha\":{\"tipo\":\"IMS\",\"dn\":\"4830309808\",\"central\":\"PRCTA_VMS02\"},\"radius\":{\"status\":\"ATIVO\",\"armario\":\"SCFNS_G1I13\",\"rin\":\"242\",\"velocidade\":\"102400 - 51200\",\"ipFixo\":\"NAO ENCONTROU\",\"profile\":\"r51200b102400 op:FNS-8148UP9JME-013\",\"porta\":\"2225\",\"isIpFixo\":false},\"asserts\":[{\"asserts\":\"DIVERGENCIA_TBS_RADIUS\",\"value\":false,\"creationDate\":1525097434471},{\"asserts\":\"CIRCUITO_ATIVO\",\"value\":true,\"creationDate\":1525097434471},{\"asserts\":\"HAS_BLOQUEIO_RADIUS\",\"value\":false,\"creationDate\":1525097434471}],\"eventos\":[]}");
//        } catch (Exception e) {
//        }
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of consulta method, of class ConfigPortaServiceImpl.
     */
    @Test
    public void testConsulta() throws Exception {
        System.out.println("consulta");
        ConfigPortaServiceImpl instance = null;
        ConsultaClienteInter expResult = null;
        ConsultaClienteInter result = instance.consulta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alteracao method, of class ConfigPortaServiceImpl.
     */
    @Test
    public void testAlteracao() throws Exception {
        System.out.println("alteracao");
        ConfigPortaServiceImpl instance = null;
        AlteracaoClienteInter expResult = null;
        AlteracaoClienteInter result = instance.alteracao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultar method, of class ConfigPortaServiceImpl.
     */
    @Test
    public void testConsultar() throws Exception {
        System.out.println("consultar");
        ConfigPortaServiceImpl instance = null;
        ConfiguracaoPorta expResult = null;
        ConfiguracaoPorta result = instance.consultar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setterEstadoDaPorta method, of class ConfigPortaServiceImpl.
     */
    @Test
    public void testSetterEstadoDaPorta() throws Exception {
        System.out.println("setterEstadoDaPorta");
        EstadoDaPorta est = new EstadoDaPorta(false);
        
        ValidacaoResult result = instance.setterEstadoDaPorta(est);
        System.out.println(new JacksonMapper(ValidacaoResult.class).serialize(result));
        
    }

    /**
     * Test of setterVlanBanda method, of class ConfigPortaServiceImpl.
     */
    @Test
    public void testSetterVlanBanda() throws Exception {
        System.out.println("setterVlanBanda");
        ConfigPortaServiceImpl instance = null;
        ValidacaoResult expResult = null;
        ValidacaoResult result = instance.setterVlanBanda();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setterVlanVoip method, of class ConfigPortaServiceImpl.
     */
    @Test
    public void testSetterVlanVoip() throws Exception {
        System.out.println("setterVlanVoip");
        ConfigPortaServiceImpl instance = null;
        ValidacaoResult expResult = null;
        ValidacaoResult result = instance.setterVlanVoip();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setterVlanVod method, of class ConfigPortaServiceImpl.
     */
    @Test
    public void testSetterVlanVod() throws Exception {
        System.out.println("setterVlanVod");
        ConfigPortaServiceImpl instance = null;
        ValidacaoResult expResult = null;
        ValidacaoResult result = instance.setterVlanVod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setterVlanMulticast method, of class ConfigPortaServiceImpl.
     */
    @Test
    public void testSetterVlanMulticast() throws Exception {
        System.out.println("setterVlanMulticast");
        ConfigPortaServiceImpl instance = null;
        ValidacaoResult expResult = null;
        ValidacaoResult result = instance.setterVlanMulticast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resetIptvStatistics method, of class ConfigPortaServiceImpl.
     */
    @Test
    public void testResetIptvStatistics() throws Exception {
        System.out.println("resetIptvStatistics");
        ConfigPortaServiceImpl instance = null;
        instance.resetIptvStatistics();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIptvVlans method, of class ConfigPortaServiceImpl.
     */
    @Test
    public void testGetIptvVlans() throws Exception {
        System.out.println("getIptvVlans");
        ConfigPortaServiceImpl instance = null;
        List<ValidacaoResult> expResult = null;
        List<ValidacaoResult> result = instance.getIptvVlans();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isManageable method, of class ConfigPortaServiceImpl.
     */
    @Test
    public void testIsManageable() throws Exception {
        System.out.println("isManageable");
        ConfigPortaServiceImpl instance = new ConfigPortaServiceImpl(cust);
        Boolean result = instance.isManageable();
        System.out.println(new JacksonMapper(Boolean.class).serialize(result));
    }

    /**
     * Test of corretorEstadoDaPorta method, of class ConfigPortaServiceImpl.
     */
    @Test
    public void testCorretorEstadoDaPorta() throws Exception {
        System.out.println("corretorEstadoDaPorta");
        ValidacaoResult result = instance.corretorEstadoDaPorta();
        System.out.println(new JacksonMapper(ValidacaoResult.class).serialize(result));
    }

}
