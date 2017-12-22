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
                double perc = 1 - (double) (vizinhos.size() / new ValidacaoResultResultFalseFilter().filter(rst).size());
                if (perc > 0.49) {
                    return new ValidacaoFake("Afetação Vizinhança", locale, "Não foi identificada falha massiva.", Boolean.TRUE);
                } else {
                    return new ValidacaoFake("Afetação Vizinhança", locale, "{{Orientação abertura massiva}}, vizinhança.", Boolean.FALSE);
                }
            } else {
                // PortaPON OFF
                return new ValidacaoFake("Afetação Vizinhança", locale, "{{Orientação abertura massiva}}, Porta PON.", Boolean.FALSE);
            }
        } else {
            return new ValidacaoFake("Afetação Vizinhança", locale, "Não foi identificada falha massiva.", Boolean.TRUE);
        }
    }

}
