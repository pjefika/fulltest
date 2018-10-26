/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.gpon.alcatel;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.efika_customer.model.customer.InventarioRede;
import br.net.gvt.efika.fulltest.model.telecom.properties.DeviceMAC;
import br.net.gvt.efika.fulltest.model.telecom.properties.EstadoDaPorta;
import br.net.gvt.efika.fulltest.model.telecom.properties.Porta;
import br.net.gvt.efika.fulltest.model.telecom.properties.Profile;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanBanda;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanMulticast;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanVod;
import br.net.gvt.efika.fulltest.model.telecom.properties.VlanVoip;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.PortaPON;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.SerialOntGpon;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.TabelaParametrosGponVivo1;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.VelocidadeVendor;
import br.net.gvt.efika.util.json.JacksonMapper;
import java.util.List;
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
public class Alcatel7342GponDslamVivo1IT {

    private static EfikaCustomer cust;
    private static Alcatel7342GponDslamVivo1 instance;
    private static InventarioRede i;

    public Alcatel7342GponDslamVivo1IT() {
    }

    @BeforeClass
    public static void setUpClass() {
        try {
            cust = (EfikaCustomer) new JacksonMapper(EfikaCustomer.class).deserialize("{"
                    + "   \"designador\":\"SPO-813MK3AFCQ-013\","
                    + "   \"instancia\":\"110007796069803\","
                    + "   \"designadorAcesso\":\"SPO-15696861-069\","
                    + "   \"designadorTv\":\"TV-SPO-813MK3AFCV-050\","
                    + "   \"rede\":{"
                    + "      \"tipo\":\"GPON\","
                    + "      \"origem\":\"ONLINE\","
                    + "      \"planta\":\"VIVO1\","
                    + "      \"ipDslam\":\"10.23.38.178\","
                    + "      \"vendorDslam\":\"ALCATEL\","
                    + "      \"modeloDslam\":\"7342 ISAM FTTU\","
                    + "      \"idOnt\":\"0002884296\","
                    + "      \"terminal\":\"1177960698\","
                    + "      \"ipMulticast\":null,"
                    + "      \"nrc\":null,"
                    + "      \"slot\":13,"
                    + "      \"porta\":1,"
                    + "      \"sequencial\":23,"
                    + "      \"logica\":23,"
                    + "      \"rin\":33,"
                    + "      \"vlanVoip\":3004,"
                    + "      \"vlanVod\":3001,"
                    + "      \"vlanMulticast\":3001,"
                    + "      \"cvlan\":502,"
                    + "      \"bhs\":true"
                    + "   },"
                    + "   \"redeExterna\":{"
                    + "      \"tipo\":null,"
                    + "      \"origem\":null,"
                    + "      \"planta\":null,"
                    + "      \"splitter1n\":null,"
                    + "      \"splitter2n\":null,"
                    + "      \"caboAlim\":null,"
                    + "      \"fibra1n\":null,"
                    + "      \"fibra2n\":null"
                    + "   },"
                    + "   \"servicos\":{"
                    + "      \"origem\":null,"
                    + "      \"velDown\":102400,"
                    + "      \"velUp\":51200,"
                    + "      \"tipoTv\":\"IPTV\","
                    + "      \"tipoLinha\":\"SIP\""
                    + "   },"
                    + "   \"linha\":{"
                    + "      \"tipo\":null,"
                    + "      \"dn\":null,"
                    + "      \"central\":null"
                    + "   },"
                    + "   \"radius\":{"
                    + "      \"status\":null,"
                    + "      \"armario\":null,"
                    + "      \"rin\":null,"
                    + "      \"velocidade\":null,"
                    + "      \"ipFixo\":null,"
                    + "      \"profile\":null,"
                    + "      \"porta\":null,"
                    + "      \"isIpFixo\":null"
                    + "   },"
                    + "   \"asserts\":["
                    + "      {"
                    + "         \"asserts\":\"CIRCUITO_ATIVO\","
                    + "         \"value\":true,"
                    + "         \"creationDate\":1540577254417"
                    + "      },"
                    + "      {"
                    + "         \"asserts\":\"DIVERGENCIA_TBS_RADIUS\","
                    + "         \"value\":false,"
                    + "         \"creationDate\":1540577254417"
                    + "      },"
                    + "      {"
                    + "         \"asserts\":\"HAS_BLOQUEIO_RADIUS\","
                    + "         \"value\":false,"
                    + "         \"creationDate\":1540577254417"
                    + "      }"
                    + "   ],"
                    + "   \"eventos\":["
                    + ""
                    + "   ]"
                    + "}");
        } catch (Exception e) {
        }
        i = cust.getRede();
        instance = new Alcatel7342GponDslamVivo1(i.getIpDslam());
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {
        instance.desconectar();
    }

    /**
     * Test of obterVelocidadesDownVendor method, of class
     * Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testObterVelocidadesDownVendor() {
        System.out.println("obterVelocidadesDownVendor");
        Alcatel7342GponDslamVivo1 instance = null;
        List<VelocidadeVendor> expResult = null;
        List<VelocidadeVendor> result = instance.obterVelocidadesDownVendor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obterVelocidadesUpVendor method, of class
     * Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testObterVelocidadesUpVendor() {
        System.out.println("obterVelocidadesUpVendor");
        Alcatel7342GponDslamVivo1 instance = null;
        List<VelocidadeVendor> expResult = null;
        List<VelocidadeVendor> result = instance.obterVelocidadesUpVendor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstadoDaPorta method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testGetEstadoDaPorta() throws Exception {
        System.out.println("getEstadoDaPorta");
        EstadoDaPorta result = instance.getEstadoDaPorta(i);
        assertTrue(result.validar(null));
        //System.out.println(GsonUtil.serialize(result));
    }

    @Test
    public void testGetPortaPON() throws Exception {
        System.out.println("getPortaPON");
        PortaPON result = instance.getPortaPON(i);
        assertTrue(result.validar(null));
        //System.out.println(GsonUtil.serialize(result));
    }

    /**
     * Test of getDeviceMac method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testGetDeviceMac() throws Exception {
        System.out.println("getDeviceMac");
        DeviceMAC result = instance.getDeviceMac(i);
        //System.out.println(GsonUtil.serialize(result));
    }

    /**
     * Test of getProfile method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testGetProfile() throws Exception {
        System.out.println("getProfile");
        Profile result = instance.getProfile(i);
        //System.out.println(GsonUtil.serialize(result));
    }

    /**
     * Test of getVlanBanda method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testGetVlanBanda() throws Exception {
        System.out.println("getVlanBanda");
        VlanBanda result = instance.getVlanBanda(i);
        //System.out.println(GsonUtil.serialize(result));
        assertTrue(result.validar(cust));
    }

    /**
     * Test of getVlanMulticast method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testGetVlanMulticast() throws Exception {
        System.out.println("getVlanMulticast");
        VlanMulticast result = instance.getVlanMulticast(i);
        //System.out.println(GsonUtil.serialize(result));
        assertTrue(result.validar(cust));
    }

    /**
     * Test of getVlanVoip method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testGetVlanVoip() throws Exception {
        System.out.println("getVlanVoip");
        VlanVoip result = instance.getVlanVoip(i);
        //System.out.println(GsonUtil.serialize(result));
        assertTrue(result.validar(cust));
    }

    /**
     * Test of getVlanVod method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testGetVlanVod() throws Exception {
        System.out.println("getVlanVod");
        VlanVod result = instance.getVlanVod(i);
        //System.out.println(GsonUtil.serialize(result));
        assertTrue(result.validar(cust));
    }

    /**
     * Test of getSerialOnt method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testGetSerialOnt() throws Exception {
        System.out.println("getSerialOnt");
        SerialOntGpon result = instance.getSerialOnt(i);
        //System.out.println(GsonUtil.serialize(result));
    }

    /**
     * Test of getTabelaParametros method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testGetTabelaParametros() throws Exception {
        System.out.println("getTabelaParametros");
        TabelaParametrosGponVivo1 result = instance.getTabelaParametros(i);
        //System.out.println(GsonUtil.serialize(result));
    }

    /**
     * Test of getAlarmes method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testGetAlarmes() throws Exception {
        System.out.println("getAlarmes");
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSlotsAvailableOnts method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testGetSlotsAvailableOnts() throws Exception {
        System.out.println("getSlotsAvailableOnts");
        List<SerialOntGpon> result = instance.getSlotsAvailableOnts(i);
        //System.out.println(GsonUtil.serialize(result));
    }

    /**
     * Test of getEstadoPortasProximas method, of class
     * Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testGetEstadoPortasProximas() throws Exception {
        System.out.println("getEstadoPortasProximas");
        InventarioRede i = null;
        Alcatel7342GponDslamVivo1 instance = null;
        List<Porta> expResult = null;
        List<Porta> result = instance.getEstadoPortasProximas(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOntToOlt method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testSetOntToOlt() throws Exception {
        System.out.println("setOntToOlt");
        SerialOntGpon s = new SerialOntGpon();
        SerialOntGpon result = instance.setOntToOlt(i, s);
        //System.out.println(GsonUtil.serialize(result));
    }

    /**
     * Test of unsetOntFromOlt method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testUnsetOntFromOlt() throws Exception {
        System.out.println("unsetOntFromOlt");
        instance.unsetOntFromOlt(i);
    }

    /**
     * Test of setEstadoDaPorta method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testSetEstadoDaPorta() throws Exception {
        System.out.println("setEstadoDaPorta");
        EstadoDaPorta e = new EstadoDaPorta();
        e.setAdminState(Boolean.FALSE);
        EstadoDaPorta result = instance.setEstadoDaPorta(i, e);
        //System.out.println(GsonUtil.serialize(result));
    }

    /**
     * Test of setProfileDown method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testSetProfileDown() throws Exception {
        System.out.println("setProfileDown");
        Profile result = instance.setProfileDown(i, null);
        System.out.println(new JacksonMapper(Profile.class).serialize(result));
    }

    /**
     * Test of setProfileUp method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testSetProfileUp() throws Exception {
        System.out.println("setProfileUp");
        instance.setProfileUp(i, null, null);
    }

    /**
     * Test of createVlanBanda method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testCreateVlanBanda() throws Exception {
        System.out.println("createVlanBanda");
        VlanBanda result = instance.createVlanBanda(i, null, null);
        //System.out.println(GsonUtil.serialize(result));
    }

    /**
     * Test of createVlanVoip method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testCreateVlanVoip() throws Exception {
        System.out.println("createVlanVoip");
        VlanVoip result = instance.createVlanVoip(i);
        //System.out.println(GsonUtil.serialize(result));
    }

    /**
     * Test of createVlanVod method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testCreateVlanVod() throws Exception {
        System.out.println("createVlanVod");
        VlanVod result = instance.createVlanVod(i);
        //System.out.println(GsonUtil.serialize(result));
    }

    /**
     * Test of createVlanMulticast method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testCreateVlanMulticast() throws Exception {
        System.out.println("createVlanMulticast");
    }

    /**
     * Test of deleteVlanBanda method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testDeleteVlanBanda() throws Exception {
        System.out.println("deleteVlanBanda");
        instance.deleteVlanBanda(i);
    }

    /**
     * Test of deleteVlanVoip method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testDeleteVlanVoip() throws Exception {
        System.out.println("deleteVlanVoip");
        instance.deleteVlanVoip(i);
    }

    /**
     * Test of deleteVlanVod method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testDeleteVlanVod() throws Exception {
        System.out.println("deleteVlanVod");
        instance.deleteVlanVod(i);
    }

    /**
     * Test of deleteVlanMulticast method, of class Alcatel7342GponDslamVivo1.
     */
    @Test
    public void testDeleteVlanMulticast() throws Exception {
        System.out.println("deleteVlanMulticast");
    }

}
