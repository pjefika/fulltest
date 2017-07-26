/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.manobra;

import model.validacao.impl.*;
import model.dslam.consulta.metalico.TabelaRedeMetalico;

/**
 *
 * @author G0042204
 */
public class ValidacaoPacotesDown extends Validacao {

    private final TabelaRedeMetalico tab;

    public ValidacaoPacotesDown(TabelaRedeMetalico tab) {
        super("Pacotes de DOWN > 6000?");
        this.tab = tab;
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
