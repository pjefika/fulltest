/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd.consultas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * i
 *
 * @author G0042204
 */
public class ConsultaTesteJUnitTest {

    public ConsultaTesteJUnitTest() {
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

    @Test
    public void consultar() {

        try {
            com.gvt.ws.eai.oss.setpvc.ConfigurarPVCIn configurarPVCIn = null;
            com.gvt.ws.eai.oss.ossturbonet.OSSTurbonetService service = new com.gvt.ws.eai.oss.ossturbonet.OSSTurbonetService();
            com.gvt.ws.eai.oss.ossturbonet.OSSTurbonet port = service.getOSSTurbonetSoapPort();
            // TODO process result here
            com.gvt.ws.eai.oss.setpvc.ConfigurarPVCOut result = port.configurarPVC(configurarPVCIn);
            System.out.println("Result = " + result);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
