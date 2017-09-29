/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.metalico.manobra;

import model.validacao.impl.both.Validacao;
import br.net.gvt.efika.customer.InventarioServico;

/**
 *
 * @author G0042204
 */
public class ValidacaoIsSip extends Validacao {

    private final InventarioServico iS;

    public ValidacaoIsSip(InventarioServico tab) {
        super("Linha é SIP?");
        this.iS = tab;
    }

    @Override
    public Object getObject() {
        return iS;
    }

    @Override
    public Boolean checar() {
        return iS.getIsSip();
    }

    @Override
    protected String frasePositiva() {
        return "frasePositiva - IsSip";
    }

    @Override
    protected String fraseNegativa() {
        return "fraseNegativa - IsSip";
    }

}
