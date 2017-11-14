/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.metalico.manobra;

import java.util.Locale;
import model.dslam.consulta.metalico.TabelaRedeMetalico;
import model.validacao.impl.both.Validacao;

/**
 *
 * @author G0042204
 */
public class ValidacaoResync50 extends Validacao {

    private final TabelaRedeMetalico tab;

    public ValidacaoResync50(TabelaRedeMetalico tab, Locale local) {
        super("Resync < 50?", local);
        this.tab = tab;
    }
    
    @Override
    public Object getObject() {
        return tab;
    }

    @Override
    public Boolean checar() {
        return tab.resync50();
    }

    @Override
    protected String frasePositiva() {
        return "frasePositiva - resync50";
    }

    @Override
    protected String fraseNegativa() {
        return "fraseNegativa - resync50";
    }

}