/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests.dao;

import dao.cadastro.CadastroDAO;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.dslam.factory.exception.DslamNaoImplException;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author G0042204
 */
public class getCadastro {

    public getCadastro() {
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
    public void testCadastro() {
        
        CadastroDAO d = new CadastroDAO();
        
        System.out.println(Calendar.getInstance().getTime());
        try {
            d.getDslam("AJU-81KXMFMIR-013").conectar();
            assertTrue(true);
        } catch (DslamNaoImplException ex) {
            Logger.getLogger(getCadastro.class.getName()).log(Level.SEVERE, null, ex);
            assertTrue(true);
        } catch (RemoteException ex) {
            Logger.getLogger(getCadastro.class.getName()).log(Level.SEVERE, null, ex);
            assertTrue(false);
        } finally{
            System.out.println(Calendar.getInstance().getTime());
        }

    }
}
