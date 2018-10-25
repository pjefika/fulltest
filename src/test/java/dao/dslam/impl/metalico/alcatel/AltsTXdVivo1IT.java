/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.metalico.alcatel;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.efika_customer.model.customer.InventarioRede;
import br.net.gvt.efika.fulltest.model.telecom.properties.EstadoDaPorta;
import br.net.gvt.efika.fulltest.model.telecom.properties.Profile;
import br.net.gvt.efika.fulltest.model.telecom.properties.ReConexao;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanBanda;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanMulticast;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanVod;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanVoip;
import br.net.gvt.efika.fulltest.model.telecom.properties.metalico.Modulacao;
import br.net.gvt.efika.fulltest.model.telecom.properties.metalico.TabelaParametrosMetalico;
import br.net.gvt.efika.fulltest.model.telecom.properties.metalico.TabelaRedeMetalico;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.VelocidadeVendor;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.Velocidades;
import br.net.gvt.efika.util.json.JacksonMapper;
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
public class AltsTXdVivo1IT {

    public AltsTXdVivo1IT() {
    }

    static EfikaCustomer cust;

    static InventarioRede i;

    static AltsTXdVivo1 instance;

    @BeforeClass
    public static void setUpClass() {
        try {
            cust = (EfikaCustomer) new JacksonMapper(EfikaCustomer.class).deserialize("{"
                    + "   \"designador\":\"SPO-067487882900-013\","
                    + "   \"instancia\":\"110005667693709\","
                    + "   \"designadorAcesso\":\"SPO-14283704-069\","
                    + "   \"designadorTv\":null,"
                    + "   \"rede\":{"
                    + "      \"tipo\":\"METALICA\","
                    + "      \"origem\":\"OFFLINE\","
                    + "      \"planta\":\"VIVO1\","
                    + "      \"ipDslam\":\"10.118.62.106\","
                    + "      \"vendorDslam\":\"ALCATEL\","
                    + "      \"modeloDslam\":\"ALTS-T XD\","
                    + "      \"idOnt\":null,"
                    + "      \"terminal\":\"1156676937\","
                    + "      \"ipMulticast\":null,"
                    + "      \"nrc\":null,"
                    + "      \"slot\":8,"
                    + "      \"porta\":47,"
                    + "      \"sequencial\":null,"
                    + "      \"logica\":null,"
                    + "      \"rin\":647,"
                    + "      \"vlanVoip\":null,"
                    + "      \"vlanVod\":null,"
                    + "      \"vlanMulticast\":null,"
                    + "      \"cvlan\":349,"
                    + "      \"bhs\":null"
                    + "   },"
                    + "   \"servicos\":{"
                    + "      \"origem\":null,"
                    + "      \"velDown\":4096,"
                    + "      \"velUp\":600,"
                    + "      \"tipoTv\":null,"
                    + "      \"tipoLinha\":\"TDM\""
                    + "   },"
                    + "   \"linha\":{"
                    + "      \"tipo\":null,"
                    + "      \"dn\":null,"
                    + "      \"central\":null"
                    + "   },"
                    + "   \"asserts\":["
                    + ""
                    + "   ],"
                    + "   \"eventos\":["
                    + ""
                    + "   ]"
                    + "}");
        } catch (Exception e) {
        }
        i = cust.getRede();
        instance = new AltsTXdVivo1(i.getIpDslam());
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
     * Test of obterVelocidadesDownVendor method, of class AltsTXdVivo1.
     */
    @Test
    public void testObterVelocidadesDownVendor() {
        System.out.println("obterVelocidadesDownVendor");
        AltsTXdVivo1 instance = null;
        List<VelocidadeVendor> expResult = null;
        List<VelocidadeVendor> result = instance.obterVelocidadesDownVendor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obterVelocidadesUpVendor method, of class AltsTXdVivo1.
     */
    @Test
    public void testObterVelocidadesUpVendor() {
        System.out.println("obterVelocidadesUpVendor");
        AltsTXdVivo1 instance = null;
        List<VelocidadeVendor> expResult = null;
        List<VelocidadeVendor> result = instance.obterVelocidadesUpVendor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstadoDaPorta method, of class AltsTXdVivo1.
     */
    @Test
    public void testGetEstadoDaPorta() throws Exception {
        System.out.println("getEstadoDaPorta");

        EstadoDaPorta result = instance.getEstadoDaPorta(i);
        System.out.println(new JacksonMapper(EstadoDaPorta.class).serialize(result));
    }

    /**
     * Test of getProfile method, of class AltsTXdVivo1.
     */
    @Test
    public void testGetProfile() throws Exception {
        System.out.println("getProfile");

        Profile result = instance.getProfile(i);
        System.out.println(new JacksonMapper(Profile.class).serialize(result));
    }

    /**
     * Test of getVlanBanda method, of class AltsTXdVivo1.
     */
    @Test
    public void testGetVlanBanda() throws Exception {
        System.out.println("getVlanBanda");

        VlanBanda result = instance.getVlanBanda(i);
        System.out.println(new JacksonMapper(VlanBanda.class).serialize(result));
    }

    /**
     * Test of getVlanMulticast method, of class AltsTXdVivo1.
     */
    @Test
    public void testGetVlanMulticast() throws Exception {
        System.out.println("getVlanMulticast");
        InventarioRede i = null;
        AltsTXdVivo1 instance = null;
        VlanMulticast expResult = null;
        VlanMulticast result = instance.getVlanMulticast(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVlanVoip method, of class AltsTXdVivo1.
     */
    @Test
    public void testGetVlanVoip() throws Exception {
        System.out.println("getVlanVoip");
        InventarioRede i = null;
        AltsTXdVivo1 instance = null;
        VlanVoip expResult = null;
        VlanVoip result = instance.getVlanVoip(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVlanVod method, of class AltsTXdVivo1.
     */
    @Test
    public void testGetVlanVod() throws Exception {
        System.out.println("getVlanVod");
        InventarioRede i = null;
        AltsTXdVivo1 instance = null;
        VlanVod expResult = null;
        VlanVod result = instance.getVlanVod(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReconexoes method, of class AltsTXdVivo1.
     */
    @Test
    public void testGetReconexoes() throws Exception {
        System.out.println("getReconexoes");

        ReConexao result = instance.getReconexoes(i);
        System.out.println(new JacksonMapper(ReConexao.class).serialize(result));
    }

    /**
     * Test of getTabelaParametros method, of class AltsTXdVivo1.
     */
    @Test
    public void testGetTabelaParametros() throws Exception {
        System.out.println("getTabelaParametros");

        TabelaParametrosMetalico result = instance.getTabelaParametros(i);
        System.out.println(new JacksonMapper(TabelaParametrosMetalico.class).serialize(result));

    }

    /**
     * Test of getTabelaRede method, of class AltsTXdVivo1.
     */
    @Test
    public void testGetTabelaRede() throws Exception {
        System.out.println("getTabelaRede");

        TabelaRedeMetalico result = instance.getTabelaRede(i);
        System.out.println(new JacksonMapper(TabelaRedeMetalico.class).serialize(result));
    }

    /**
     * Test of getHistoricoTabelaRede method, of class AltsTXdVivo1.
     */
    @Test
    public void testGetHistoricoTabelaRede() throws Exception {
        System.out.println("getHistoricoTabelaRede");
        InventarioRede i = null;
        AltsTXdVivo1 instance = null;
        List<TabelaRedeMetalico> expResult = null;
        List<TabelaRedeMetalico> result = instance.getHistoricoTabelaRede(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModulacao method, of class AltsTXdVivo1.
     */
    @Test
    public void testGetModulacao() throws Exception {
        System.out.println("getModulacao");
        InventarioRede i = null;
        AltsTXdVivo1 instance = null;
        Modulacao expResult = null;
        Modulacao result = instance.getModulacao(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTabelaParametrosIdeal method, of class AltsTXdVivo1.
     */
    @Test
    public void testGetTabelaParametrosIdeal() throws Exception {
        System.out.println("getTabelaParametrosIdeal");
        Velocidades v = null;
        AltsTXdVivo1 instance = null;
        TabelaParametrosMetalico expResult = null;
        TabelaParametrosMetalico result = instance.getTabelaParametrosIdeal(v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModulacao method, of class AltsTXdVivo1.
     */
    @Test
    public void testSetModulacao() throws Exception {
        System.out.println("setModulacao");
        InventarioRede i = null;
        Velocidades v = null;
        AltsTXdVivo1 instance = null;
        Modulacao expResult = null;
        Modulacao result = instance.setModulacao(i, v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resetTabelaRede method, of class AltsTXdVivo1.
     */
    @Test
    public void testResetTabelaRede() throws Exception {
        System.out.println("resetTabelaRede");

        TabelaRedeMetalico result = instance.resetTabelaRede(i);

    }

    /**
     * Test of setEstadoDaPorta method, of class AltsTXdVivo1.
     */
    @Test
    public void testSetEstadoDaPorta() throws Exception {
        System.out.println("setEstadoDaPorta");
        EstadoDaPorta e = new EstadoDaPorta(Boolean.TRUE);

        EstadoDaPorta result = instance.setEstadoDaPorta(i, e);
        System.out.println(new JacksonMapper(EstadoDaPorta.class).serialize(result));

    }

    /**
     * Test of setProfileDown method, of class AltsTXdVivo1.
     */
    @Test
    public void testSetProfileDown() throws Exception {
        System.out.println("setProfileDown");
        Velocidades v = Velocidades.find(cust.getServicos().getVelDown());
        Profile result = instance.setProfileDown(i, v);
        System.out.println(new JacksonMapper(Profile.class).serialize(result));
    }

    /**
     * Test of setProfileUp method, of class AltsTXdVivo1.
     */
    @Test
    public void testSetProfileUp() throws Exception {
        System.out.println("setProfileUp");
        InventarioRede i = null;
        Velocidades vDown = null;
        Velocidades vUp = null;
        AltsTXdVivo1 instance = null;
        Profile expResult = null;
        Profile result = instance.setProfileUp(i, vDown, vUp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createVlanBanda method, of class AltsTXdVivo1.
     */
    @Test
    public void testCreateVlanBanda() throws Exception {
        System.out.println("createVlanBanda");
        InventarioRede i = null;
        Velocidades vDown = null;
        Velocidades vUp = null;
        AltsTXdVivo1 instance = null;
        VlanBanda expResult = null;
        VlanBanda result = instance.createVlanBanda(i, vDown, vUp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createVlanVoip method, of class AltsTXdVivo1.
     */
    @Test
    public void testCreateVlanVoip() throws Exception {
        System.out.println("createVlanVoip");
        InventarioRede i = null;
        AltsTXdVivo1 instance = null;
        VlanVoip expResult = null;
        VlanVoip result = instance.createVlanVoip(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createVlanVod method, of class AltsTXdVivo1.
     */
    @Test
    public void testCreateVlanVod() throws Exception {
        System.out.println("createVlanVod");
        InventarioRede i = null;
        AltsTXdVivo1 instance = null;
        VlanVod expResult = null;
        VlanVod result = instance.createVlanVod(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createVlanMulticast method, of class AltsTXdVivo1.
     */
    @Test
    public void testCreateVlanMulticast() throws Exception {
        System.out.println("createVlanMulticast");
        InventarioRede i = null;
        AltsTXdVivo1 instance = null;
        VlanMulticast expResult = null;
        VlanMulticast result = instance.createVlanMulticast(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteVlanBanda method, of class AltsTXdVivo1.
     */
    @Test
    public void testDeleteVlanBanda() throws Exception {
        System.out.println("deleteVlanBanda");
        InventarioRede i = null;
        AltsTXdVivo1 instance = null;
        VlanBanda expResult = null;
        VlanBanda result = instance.deleteVlanBanda(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteVlanVoip method, of class AltsTXdVivo1.
     */
    @Test
    public void testDeleteVlanVoip() throws Exception {
        System.out.println("deleteVlanVoip");
        InventarioRede i = null;
        AltsTXdVivo1 instance = null;
        VlanVoip expResult = null;
        VlanVoip result = instance.deleteVlanVoip(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteVlanVod method, of class AltsTXdVivo1.
     */
    @Test
    public void testDeleteVlanVod() throws Exception {
        System.out.println("deleteVlanVod");
        InventarioRede i = null;
        AltsTXdVivo1 instance = null;
        VlanVod expResult = null;
        VlanVod result = instance.deleteVlanVod(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteVlanMulticast method, of class AltsTXdVivo1.
     */
    @Test
    public void testDeleteVlanMulticast() throws Exception {
        System.out.println("deleteVlanMulticast");
        InventarioRede i = null;
        AltsTXdVivo1 instance = null;
        VlanMulticast expResult = null;
        VlanMulticast result = instance.deleteVlanMulticast(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
