/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao;

import br.net.gvt.efika.customer.EfikaCustomer;
import model.dslam.consulta.metalico.TabelaParametrosAbstract;
import model.validacao.impl.ValidacaoEfikaCustomer;

/**
 *
 * @author G0041775
 */
public class ValidacaoParametrosMetalico extends ValidacaoEfikaCustomer {

    private final transient TabelaParametrosAbstract tab;
    private final transient TabelaParametrosAbstract ideal;

    public ValidacaoParametrosMetalico(TabelaParametrosAbstract tab, TabelaParametrosAbstract ideal, EfikaCustomer cust) {
        super(cust, "Parâmetros");
        this.tab = tab;
        this.ideal = ideal;
    }

    @Override
    protected String frasePositiva() {
        return "Parâmetros dentro dos padrões.";
    }

    @Override
    protected String fraseNegativa() {
        return "Parâmetros fora dos padrões.";
    }

    @Override
    public Boolean checar() {
        return tab.validar(ideal);
    }

}
