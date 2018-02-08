/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.log;

import dao.InterfaceDAO;
import model.entity.crm.LogCrm;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author G0042204
 */
public class LogCrmDAOIT {

    private InterfaceDAO<LogCrm> instance = new LogCrmDAO();

    public LogCrmDAOIT() {
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

    /**
     * Test of cadastrar method, of class LogCrmDAO.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testCadastrar() {
        try {
            System.out.println("cadastrar");
            LogCrm t = new LogCrm();

            t.setInstancia("INSTANCIA");
            t.setDesignador("DESIGNADOR");
            t.setDesignadorAcesso("DESIGNADOR ACESSO");
            t.setExecutor("EXECUTOR");
            t.setConclusao("CONCLUSÃO");
            t.setCustomer("CUSTOMER");
            t.setValids("VALIDS");

            t.setCadastro(Boolean.FALSE);
            t.setFulltest(Boolean.FALSE);
            t.setSemBloqueio(Boolean.TRUE);

            instance.cadastrar(t);
            assertTrue(t.getId() != null);
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

}
