/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd.validacao;

import com.google.gson.Gson;
import java.math.BigInteger;
import model.Motivos;
import model.dslam.consulta.metalico.TabelaRedeMetalico;
import dao.dslam.impl.metalico.keymile.KeymileMetalicoDslam;
import dao.dslam.impl.metalico.keymile.KeymileMetalicoSuadDslam;
import dao.dslam.impl.metalico.keymile.KeymileMetalicoSuvd11;
import dao.dslam.impl.metalico.zhone.ZhoneMetalicoComboDslam;
import dao.dslam.impl.metalico.zhone.ZhoneMetalicoDslam;
import dao.dslam.impl.metalico.zhone.ZhoneMetalicoMxkDslam;
import model.validacao.ValidacaoRede;
import model.validacao.manobra.ValidacaoRedeManobra;
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
public class ValidarRedeJUnitTest {

    public ValidarRedeJUnitTest() {
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
    public void validRedeKeymileSUVD() {
        KeymileMetalicoDslam d = new KeymileMetalicoSuvd11();
        d.setIpDslam("10.161.93.238");
        d.setSlot(new BigInteger("9"));
        d.setPorta(new BigInteger("30"));

        try {
            TabelaRedeMetalico tb = d.getTabelaRede();
            ValidacaoRedeManobra r = new ValidacaoRedeManobra(tb, Motivos.QUEDA);
            Gson g = new Gson();
            System.out.println(g.toJson(r));
            assertTrue(r.getMensagem() != null);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

    }

    @Test
    public void validRedeKeymileSUAD() {
        KeymileMetalicoDslam d = new KeymileMetalicoSuadDslam();
        d.setIpDslam("10.141.228.1");
        d.setSlot(new BigInteger("3"));
        d.setPorta(new BigInteger("20"));

        try {
            TabelaRedeMetalico tb = d.getTabelaRede();
            ValidacaoRedeManobra r = new ValidacaoRedeManobra(tb, Motivos.QUEDA);
            Gson g = new Gson();
            System.out.println(g.toJson(r));
            assertTrue(r.getMensagem() != null);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

    }

    @Test
    public void validRedeZhoneCombo() {
        ZhoneMetalicoDslam d = new ZhoneMetalicoComboDslam();
        d.setIpDslam("10.151.12.40");
        d.setSlot(new BigInteger("8"));
        d.setPorta(new BigInteger("12"));

        try {
            TabelaRedeMetalico tb = d.getTabelaRede();
            ValidacaoRedeManobra r = new ValidacaoRedeManobra(tb, Motivos.QUEDA);
            Gson g = new Gson();
            System.out.println(g.toJson(r));
            assertTrue(r.getMensagem() != null);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

    }

    @Test
    public void validRedeZhoneMxk() {
        ZhoneMetalicoDslam d = new ZhoneMetalicoMxkDslam();
        d.setIpDslam("10.209.97.250");
        d.setSlot(new BigInteger("2"));
        d.setPorta(new BigInteger("23"));

        try {
            TabelaRedeMetalico tb = d.getTabelaRede();
            ValidacaoRede r = new ValidacaoRedeManobra(tb, Motivos.QUEDA);
            Gson g = new Gson();
            System.out.println(g.toJson(r));
            assertTrue(r.getMensagem() != null);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

    }
}
