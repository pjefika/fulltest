/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.metalico.manobra;

import java.util.Locale;
import model.validacao.impl.both.Validacao;
import model.dslam.consulta.metalico.TabelaParametrosMetalico;

/**
 *
 * @author G0042204
 */
public class ValidacaoAttainableUp extends Validacao {

    private final TabelaParametrosMetalico tab;
    
    private final TabelaParametrosMetalico ideal;

    public ValidacaoAttainableUp(TabelaParametrosMetalico tab, TabelaParametrosMetalico ideal, Locale local) {
        super("Attainable Upload", local);
        this.tab = tab;
        this.ideal = ideal;
    }
    
    @Override
    public Object getObject() {
        return tab;
    }

   
    @Override
    public Boolean checar() {
        return tab.validarAttainableUp(ideal);
    }

    @Override
    protected String frasePositiva() {
        return "frasePositiva - Attainable Upload";
    }

    @Override
    protected String fraseNegativa() {
        return "fraseNegativa - Attainable Upload";
    }

}
