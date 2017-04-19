/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd.validacao;

import com.gvt.www.ws.eai.oss.OSSTurbonetClienteAutenticado.OSSTurbonetClienteAutenticadoOut;
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
public class IsClienteAutenticadoJUnitTest {

    private OSSTurbonetClienteAutenticadoOut out;

    public IsClienteAutenticadoJUnitTest() {
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
    public void isClienteAutenticado() {

        CadastroDAO dao = new CadastroDAO();

        try {
            out = dao.isClienteAutenticado(dao.getInfo("CTA-81AFTMOU6-013"));
            System.out.println(out.getDataHoraAutenticacao().getTime());
            System.out.println("End");
        } catch (RemoteException ex) {
            Logger.getLogger(IsClienteAutenticadoJUnitTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
