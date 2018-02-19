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
public class ValidacaoPacotesUp extends Validacao {

    private final TabelaRedeMetalico tab;

    public ValidacaoPacotesUp(TabelaRedeMetalico tab, Locale local) {
        super("Pacotes de UP > 4000?", local);
        this.tab = tab;
    }

    @Override
    public ValidavelAbs getObject() {
        return tab;
    }

    @Override
    public Boolean checar() {
        return tab.pctUp();
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
