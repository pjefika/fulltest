/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.realtime;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.FactoryDAO;
import dao.customer.NetworkInventoryDAO;
import dao.customer.NetworkInventoryDAOImpl;
import dao.dslam.factory.exception.FuncIndisponivelDslamException;
import dao.dslam.impl.AbstractDslam;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import model.validacao.filter.ValidacaoResultResultFalseFilter;
import model.validacao.impl.both.Validacao;
import model.validacao.impl.both.ValidacaoEstadoPortaOper;
import model.validacao.impl.both.ValidacaoFake;
import model.validacao.impl.both.ValidacaoPortaPON;
import model.validacao.impl.both.ValidacaoResult;

public class ValidadorVizinhanca extends ValidadorGpon {

    private NetworkInventoryDAO dao = new NetworkInventoryDAOImpl();

    public ValidadorVizinhanca(AbstractDslam dslam, EfikaCustomer cust, Locale local) {
        super(dslam, cust, local);
    }

    @Override
    protected Validacao consultar() throws Exception {
        if (!consulta.getEstadoDaPorta(cust.getRede()).validar(cust)) {
            if (new ValidacaoPortaPON(cg.getPortaPON(cust.getRede()), cust, bundle.getLocale()).validar().getResultado()) {
                // Validação Vizinhança
                dao = FactoryDAO.createNetworkInventoryDAO();

                List<ValidacaoResult> rst = new ArrayList<>();
                List<EfikaCustomer> vizinhos = dao.consultarVizinhos(cust, 5);
                vizinhos.forEach((t) -> {
                    try {
                        rst.add(new ValidacaoEstadoPortaOper(cg.getEstadoDaPorta(t.getRede()), bundle.getLocale()).validar());
                    } catch (Exception e) {
                    }
                });

                if (vizinhos.size() == new ValidacaoResultResultFalseFilter().filter(rst).size()) {
                    return null;
                } else {
                    return null;
                }
            } else {
                // PortaPON OFF
                //return ValidacaoFake();
                return null;
            }
        } else {
            return new ValidacaoFake(null, locale, "Não foi identificado falha massiva.", Boolean.TRUE);
        }
    }

}
