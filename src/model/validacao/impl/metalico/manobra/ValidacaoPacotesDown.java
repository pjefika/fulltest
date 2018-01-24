/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.metalico.manobra;

import java.util.Locale;
import model.validacao.impl.both.Validacao;
import telecom.properties.ValidavelAbs;
import telecom.properties.metalico.TabelaRedeMetalico;

/**
 *
 * @author G0042204
 */
public class ValidacaoPacotesDown extends Validacao {

    private final TabelaRedeMetalico tab;

    public ValidacaoPacotesDown(TabelaRedeMetalico tab, Locale local) {
        super("Pacotes de DOWN > 6000?", local);
        this.tab = tab;
    }

    @Override
    public ValidavelAbs getObject() {
        return tab;
    }

    @Override
    public Boolean checar() {
        return tab.pctDown();
    }

    @Override
    protected String frasePositiva() {
        return "frasePositiva - pctDown";
    }

    @Override
    protected String fraseNegativa() {
        return "fraseNegativa - pctDown";
    }

}
