/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity.manobra;

import br.net.gvt.efika.asserts.AssertsEnum;
import br.net.gvt.efika.customer.CustomerAssert;
import br.net.gvt.efika.customer.EfikaCustomer;
import controller.in.AnaliticoIn;
import dao.FactoryDAO;
import dao.InterfaceDAO;
import java.util.ArrayList;
import java.util.List;
import model.manobra.analitcs.FinalizacaoManobra;
import model.manobra.analitcs.MotivoManobraEnum;
import model.manobra.facade.AnalisadorManobra;
import model.manobra.facade.AnalisadorManobraFacade;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 *
 * @author G0042204
 */
public class LogManobraIT {

    public LogManobraIT() {
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
    public void test() {

        AnaliticoIn in = new AnaliticoIn();
        EfikaCustomer e = new EfikaCustomer();

        e.setInstancia("instancia");
        e.setDesignador("designador");
        e.setDesignadorAcesso("designadorAcesso");

        List<CustomerAssert> lst = new ArrayList<>();

        lst.add(new CustomerAssert(AssertsEnum.REDE_CONFIAVEL, Boolean.FALSE));
        lst.add(new CustomerAssert(AssertsEnum.RESYNC_MENOR_300, Boolean.TRUE));
        lst.add(new CustomerAssert(AssertsEnum.RESYNC_MENOR_50, Boolean.TRUE));
        lst.add(new CustomerAssert(AssertsEnum.RESYNC_MENOR_5, Boolean.TRUE));
        lst.add(new CustomerAssert(AssertsEnum.HAS_SYNC, Boolean.TRUE));
        lst.add(new CustomerAssert(AssertsEnum.AUTH_ABERTURA_ORDEM, Boolean.TRUE));
        lst.add(new CustomerAssert(AssertsEnum.ATT_DOWN_OK, Boolean.TRUE));
        lst.add(new CustomerAssert(AssertsEnum.ATT_UP_OK, Boolean.FALSE));

        lst.add(new CustomerAssert(AssertsEnum.PACOTES_DOWN_MAIOR_6000, Boolean.TRUE));
        lst.add(new CustomerAssert(AssertsEnum.PACOTES_UP_MAIOR_4000, Boolean.TRUE));
        e.setAsserts(lst);

        AnalisadorManobra f = new AnalisadorManobraFacade(e);
        FinalizacaoManobra fim = f.analisar();

        in.setCust(e);
        in.setExecutor("G0042204");
        in.setMotivo(MotivoManobraEnum.RUIDO);

        LogManobra l = new LogManobra(in.getCust());



        l.setExecutor(in.getExecutor());
        l.setConclusao(fim.getConclusao().getConclusao());
        l.setMotivo(fim.getConclusao().getMotivo());
        l.setManobrar(fim.getManobrar());
        l.setMotivoEntrada(MotivoManobraEnum.NAO_ATINGE);



        try {
            InterfaceDAO<LogManobra> dao = FactoryDAO.create();
            dao.cadastrar(l);
            dao.close();
            assertTrue(l.getId() != null);
        } catch (Exception ex) {
            ex.printStackTrace();
            fail(ex.getMessage());
        }

    }

}
