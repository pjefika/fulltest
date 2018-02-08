/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manobra.asserts.facade;

import br.net.gvt.efika.customer.EfikaCustomer;
import br.net.gvt.efika.customer.InventarioServico;
import dao.dslam.factory.DslamDAOFactory;
import dao.dslam.factory.exception.DslamNaoImplException;
import dao.dslam.impl.AbstractDslam;
import dao.dslam.impl.ConsultaMetalicoDefault;
import java.util.Locale;
import model.manobra.asserts.impl.AssertAttainableDown;
import model.manobra.asserts.impl.AssertAttainableUp;
import model.manobra.asserts.impl.AssertHasSync;
import model.manobra.asserts.impl.AssertIsSip;
import model.manobra.asserts.impl.AssertPacotesDown;
import model.manobra.asserts.impl.AssertPacotesUp;
import model.manobra.asserts.impl.AssertRedeConfiavel;
import model.manobra.asserts.impl.AssertResync300;
import model.manobra.asserts.impl.AssertResync5;
import model.manobra.asserts.impl.AssertResync50;
import model.validacao.impl.both.ValidacaoEstadoPortaOper;
import model.validacao.impl.metalico.ValidacaoRedeConfiavel;
import model.validacao.impl.metalico.manobra.ValidacaoAttainableDown;
import model.validacao.impl.metalico.manobra.ValidacaoAttainableUp;
import model.validacao.impl.metalico.manobra.ValidacaoIsSip;
import model.validacao.impl.metalico.manobra.ValidacaoPacotesDown;
import model.validacao.impl.metalico.manobra.ValidacaoPacotesUp;
import model.validacao.impl.metalico.manobra.ValidacaoResync300;
import model.validacao.impl.metalico.manobra.ValidacaoResync5;
import model.validacao.impl.metalico.manobra.ValidacaoResync50;
import telecom.properties.metalico.TabelaParametrosMetalico;
import telecom.properties.metalico.TabelaRedeMetalico;
import telecom.velocidade.VelocidadesUtil;

/**
 *
 * @author G0042204
 */
public class AssertsManobra extends AbstractAssertFacade {

    private final EfikaCustomer cust;

    private AbstractDslam dslam;

    protected transient Locale local = new Locale("manobra", "CO");

    public AssertsManobra(EfikaCustomer cust) {
        this.cust = cust;

    }

    @Override
    public void afirmar() throws Exception {
        TabelaRedeMetalico trede = consultar().getTabelaRede(cust.getRede());
        TabelaParametrosMetalico param = consultar().getTabelaParametros(cust.getRede());
        TabelaParametrosMetalico ideal = consultar().getTabelaParametrosIdeal(VelocidadesUtil.obterDown(cust));
        InventarioServico serviceInventory = cust.getServicos();

        adicionarAssert(new AssertHasSync(new ValidacaoEstadoPortaOper(consultar().getEstadoDaPorta(cust.getRede()), local)).claim());
        adicionarAssert(new AssertRedeConfiavel(new ValidacaoRedeConfiavel(cust, trede, local)).claim());
        adicionarAssert(new AssertResync300(new ValidacaoResync300(trede, local)).claim());
        adicionarAssert(new AssertResync50(new ValidacaoResync50(trede, local)).claim());
        adicionarAssert(new AssertResync5(new ValidacaoResync5(trede, local)).claim());
        adicionarAssert(new AssertPacotesDown(new ValidacaoPacotesDown(trede, local)).claim());
        adicionarAssert(new AssertPacotesUp(new ValidacaoPacotesUp(trede, local)).claim());
        adicionarAssert(new AssertAttainableDown(new ValidacaoAttainableDown(param, ideal, local)).claim());
        adicionarAssert(new AssertAttainableUp(new ValidacaoAttainableUp(param, ideal, local)).claim());
        adicionarAssert(new AssertIsSip(new ValidacaoIsSip(serviceInventory, local)).claim());

    }

    public ConsultaMetalicoDefault consultar() throws Exception {
        if (dslam == null) {
            try {
                dslam = DslamDAOFactory.getInstance(this.cust.getRede());
                return (ConsultaMetalicoDefault) dslam;
            } catch (DslamNaoImplException e) {
                return null;
            }
        } else {
            return (ConsultaMetalicoDefault) dslam;
        }
    }

}
