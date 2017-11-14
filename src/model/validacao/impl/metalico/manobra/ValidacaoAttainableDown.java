/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.metalico.manobra;

import java.util.Locale;
import model.dslam.consulta.metalico.TabelaParametrosMetalico;
import model.validacao.impl.both.Validacao;

/**
 *
 * @author G0042204
 */
public class ValidacaoAttainableDown extends Validacao {

    private final TabelaParametrosMetalico tab;

    private final TabelaParametrosMetalico ideal;

    public ValidacaoAttainableDown(TabelaParametrosMetalico tab, TabelaParametrosMetalico ideal, Locale local) {
        super("Attainable Download", local);
        this.tab = tab;
        this.ideal = ideal;
    }

    @Override
    public Object getObject() {
        return tab;
    }

    @Override
    public Boolean checar() {
        return tab.validarAttainableDown(ideal);
    }

    @Override
    protected String frasePositiva() {
        return "frasePositiva - Attainable Download";
    }

    @Override
    protected String fraseNegativa() {
        return "fraseNegativa - Attainable Download";
    }

}