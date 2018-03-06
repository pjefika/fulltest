/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.metalico;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.fulltest.model.telecom.properties.ValidavelAbs;
import br.net.gvt.efika.fulltest.model.telecom.properties.metalico.TabelaParametrosAbstract;
import java.util.Locale;
import model.validacao.impl.both.ValidacaoEfikaCustomer;

/**
 *
 * @author G0041775
 */
public class ValidacaoParametrosMetalico extends ValidacaoEfikaCustomer {

    private final transient TabelaParametrosAbstract tab;
    private final transient TabelaParametrosAbstract ideal;

    public ValidacaoParametrosMetalico(TabelaParametrosAbstract tab, TabelaParametrosAbstract ideal, EfikaCustomer cust, Locale local) {
        super(cust, "Parâmetros", local);
        this.tab = tab;
        this.ideal = ideal;
    }

    @Override
    public ValidavelAbs getObject() {
        return tab;
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
