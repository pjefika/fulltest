/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd.consultas;

import com.gvt.www.ws.eai.oss.OSSTurbonetStatusConexao.OSSTurbonetStatusConexaoOut;
import dao.cadastro.CadastroDAO;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
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

        CadastroDAO dao = new CadastroDAO();

        try {
            OSSTurbonetStatusConexaoOut oi = dao.getAuthenticationByIPorMac("84:E0:58:0F:79:08");
            System.out.println("");
        } catch (RemoteException ex) {
            Logger.getLogger(ConsultaTesteJUnitTest.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("");

    }
}
