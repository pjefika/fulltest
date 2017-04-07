/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.gvt.www.ws.eai.oss.OSSTurbonetShortCircuit.OSSTurbonetShortCircuitIn;
import com.gvt.www.ws.eai.oss.OSSTurbonetShortCircuit.OSSTurbonetShortCircuitOut;
import com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetProxy;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author G0042204
 */
public class GetCadastroJUnitTest {

    public GetCadastroJUnitTest() {
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
    public void getCadastro() {

        try {

            OSSTurbonetProxy ws = new OSSTurbonetProxy();
            OSSTurbonetShortCircuitOut infoShortCircuit = ws.getInfoShortCircuit(new OSSTurbonetShortCircuitIn("CTA-811C0EFT9-013", "ura", "ura", "ura"));
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
