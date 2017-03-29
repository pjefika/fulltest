/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests.dao;

import dao.massivo.LoteDAO;
import model.entity.Lote;
import model.fulltest.Status;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author G0042204
 */
public class JpaLocalJUnitTest {

    public JpaLocalJUnitTest() {
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
    public void jpaLocalJUnitTest() {

        LoteDAO dao = new LoteDAO();

        try {
            dao.startConnection();
            Lote l = new Lote();

            l.setMatricula("G0042204");
            l.setStatus(Status.EXCLUIDO);
            l.setObservacao("TDD dos Brother");

            dao.cadastrar(l);

            dao.closeConnection();

            assertTrue(true);

        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

    }
}
