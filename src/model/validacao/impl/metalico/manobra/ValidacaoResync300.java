/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.metalico.manobra;

import java.util.Locale;
import model.validacao.impl.both.Validacao;
import model.dslam.consulta.metalico.TabelaRedeMetalico;

/**
 *
 * @author G0042204
 */
public class ValidacaoResync300 extends Validacao {

    private final TabelaRedeMetalico tab;

    public ValidacaoResync300(TabelaRedeMetalico tab, Locale local) {
        super("Resync < 300?", local);
        this.tab = tab;
    }
    
    @Override
    public Object getObject() {
        return tab;
    }

    @Override
    public Boolean checar() {
        return tab.resync300();
    }

    @Override
    protected String frasePositiva() {
        return "frasePositiva - resync300";
    }

    @Override
    protected String fraseNegativa() {
        return "fraseNegativa - resync300";
    }

}
