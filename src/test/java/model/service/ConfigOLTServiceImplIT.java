/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.fulltest.model.fulltest.ValidacaoResult;
import br.net.gvt.efika.fulltest.model.telecom.config.ConfiguracaoOLT;
import br.net.gvt.efika.fulltest.model.telecom.config.ProfileGpon;
import br.net.gvt.efika.fulltest.model.telecom.properties.Porta;
import br.net.gvt.efika.fulltest.model.telecom.properties.Profile;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.SerialOntGpon;
import br.net.gvt.efika.util.json.JacksonMapper;
import dao.dslam.impl.AlteracaoGponDefault;
import dao.dslam.impl.ConsultaGponDefault;
import java.util.List;
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
public class ConfigOLTServiceImplIT {

    public ConfigOLTServiceImplIT() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    EfikaCustomer cust;

    @Before
    public void setUp() {
        try {
            cust = (EfikaCustomer) new JacksonMapper(EfikaCustomer.class).deserialize("{\"designador\":\"FNS-8148UP9JME-013\",\"instancia\":\"4830309808\",\"designadorAcesso\":\"FNS-17997319-069\",\"designadorTv\":null,\"rede\":{\"tipo\":\"GPON\",\"origem\":\"ONLINE\",\"planta\":\"VIVO2\",\"ipDslam\":\"10.141.76.150\",\"vendorDslam\":\"ALCATEL\",\"modeloDslam\":\"GPON_CARD\",\"idOnt\":null,\"terminal\":null,\"ipMulticast\":null,\"nrc\":null,\"slot\":7,\"porta\":3,\"sequencial\":2225,\"logica\":49,\"rin\":242,\"vlanVoip\":1242,\"vlanVod\":3242,\"vlanMulticast\":4000,\"cvlan\":2325,\"bhs\":null},\"redeExterna\":{\"tipo\":null,\"origem\":null,\"planta\":null,\"splitter1n\":null,\"splitter2n\":null,\"caboAlim\":null,\"fibra1n\":null,\"fibra2n\":null},\"servicos\":{\"origem\":null,\"velDown\":102400,\"velUp\":51200,\"tipoTv\":null,\"tipoLinha\":\"SIP\"},\"linha\":{\"tipo\":\"IMS\",\"dn\":\"4830309808\",\"central\":\"PRCTA_VMS02\"},\"radius\":{\"status\":\"ATIVO\",\"armario\":\"SCFNS_G1I13\",\"rin\":\"242\",\"velocidade\":\"102400 - 51200\",\"ipFixo\":\"NAO ENCONTROU\",\"profile\":\"r51200b102400 op:FNS-8148UP9JME-013\",\"porta\":\"2225\",\"isIpFixo\":false},\"asserts\":[{\"asserts\":\"DIVERGENCIA_TBS_RADIUS\",\"value\":false,\"creationDate\":1525097434471},{\"asserts\":\"CIRCUITO_ATIVO\",\"value\":true,\"creationDate\":1525097434471},{\"asserts\":\"HAS_BLOQUEIO_RADIUS\",\"value\":false,\"creationDate\":1525097434471}],\"eventos\":[]}");
        } catch (Exception e) {
        }
    }

    @After
    public void tearDown() {
    }

//    private static EfikaCustomer cust = CustomerMock.gponAlcatel();

    /**
     * Test of consultar method, of class ConfigOLTServiceImpl.
     */
    @Test
    public void testConsultar() throws Exception {
        System.out.println("consultar");
        ConfigOLTServiceImpl instance = new ConfigOLTServiceImpl(cust);

        ConfiguracaoOLT result = instance.consultar();

        assertTrue(result != null);
    }

    /**
     * Test of alteracao method, of class ConfigOLTServiceImpl.
     */
    @Test
    public void testAlteracao() throws Exception {
        System.out.println("alteracao");
        ConfigOLTServiceImpl instance = null;
        AlteracaoGponDefault expResult = null;
        AlteracaoGponDefault result = instance.alteracao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unsetterOntFromOlt method, of class ConfigOLTServiceImpl.
     */
    @Test
    public void testUnsetterOntFromOlt() throws Exception {
        System.out.println("unsetterOntFromOlt");
        ConfigOLTServiceImpl instance = null;
        List<SerialOntGpon> expResult = null;
        List<SerialOntGpon> result = instance.unsetterOntFromOlt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setterOntToOlt method, of class ConfigOLTServiceImpl.
     */
    @Test
    public void testSetterOntToOlt() throws Exception {
        System.out.println("setterOntToOlt");
        SerialOntGpon serial = null;
        ConfigOLTServiceImpl instance = null;
        ValidacaoResult expResult = null;
        ValidacaoResult result = instance.setterOntToOlt(serial);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getterEstadoPortasProximas method, of class ConfigOLTServiceImpl.
     */
    @Test
    public void testGetterEstadoPortasProximas() throws Exception {
        System.out.println("getterEstadoPortasProximas");
        ConfigOLTServiceImpl instance = null;
        List<Porta> expResult = null;
        List<Porta> result = instance.getterEstadoPortasProximas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setterProfile method, of class ConfigOLTServiceImpl.
     */
    @Test
    public void testSetterProfile() throws Exception {
        System.out.println("setterProfile");
        Profile p = null;
        ConfigOLTServiceImpl instance = null;
        ProfileGpon expResult = null;
        ProfileGpon result = instance.setterProfile(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consulta method, of class ConfigOLTServiceImpl.
     */
    @Test
    public void testConsulta() throws Exception {
        System.out.println("consulta");
        ConfigOLTServiceImpl instance = null;
        ConsultaGponDefault expResult = null;
        ConsultaGponDefault result = instance.consulta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getterOntFromOlt method, of class ConfigOLTServiceImpl.
     */
    @Test
    public void testGetterOntToOlt() throws Exception {
        System.out.println("getterOntToOlt");

        ConfigOLTServiceImpl instance = new ConfigOLTServiceImpl(cust);

//        ValidacaoResult expResult = null;
        ValidacaoResult result = instance.getterOntFromOlt();
        System.out.println(new JacksonMapper(ValidacaoResult.class).serialize(result));
    }

}
