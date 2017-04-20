/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.cadastro.CadastroDAO;
import model.entity.Cliente;
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
public class GetAssociatedDesignatorsJUnitTest {

    public GetAssociatedDesignatorsJUnitTest() {
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
    public void getAssociatedDesignators() {
        CadastroDAO dao = new CadastroDAO();
        Cliente c = dao.getAssociatedDesignators(new Cliente("4130222839"));
        System.out.println("Instancia: " + c.getInstancia());
        System.out.println("Designador: " + c.getDesignador());
        assertTrue(!c.getDesignador().isEmpty());

    }
}
