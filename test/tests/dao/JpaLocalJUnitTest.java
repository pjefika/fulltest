/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests.dao;

import dao.massivo.LoteDAO;
import dao.massivo.TesteClienteDAO;
import java.util.List;
import model.entity.Lote;
import model.entity.TesteCliente;
import model.fulltest.Status;
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
        TesteClienteDAO tDao = new TesteClienteDAO();

        try {
      
            Lote l = new Lote();
            TesteCliente t = new TesteCliente();

            l.setId(22);
            l = dao.buscarLotePorId(l);
            l.setStatus(Status.ATIVO);
            dao.editar(l);
            List<Lote> list = dao.listarLotes();
            for (Lote lote : list) {
                System.out.println(lote.getMatricula());
            }
//            l.setMatricula("G0042204");
//            l.setStatus(Status.EXCLUIDO);
//            l.setObservacao("TDD dos Brother");
//            t.setId(9998);
//            t.setLote(l);
//            dao.cadastrar(l);
//            List<TesteCliente> lTests = tDao.listarInstanciasPorLote(l);
//            for (TesteCliente lTest : lTests) {
//                System.out.println(lTest.getInstancia());
//            }

            assertTrue(true);

        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

    }
}
