/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.metalico.manobra;

import br.net.gvt.efika.efika_customer.model.customer.InventarioServico;
import br.net.gvt.efika.efika_customer.model.customer.enums.TecnologiaLinha;
import br.net.gvt.efika.fulltest.model.telecom.properties.ValidavelAbs;
import java.util.Locale;
import model.validacao.impl.both.Validacao;

/**
 *
 * @author G0042204
 */
public class ValidacaoIsSip extends Validacao {

    private final InventarioServico iS;

    public ValidacaoIsSip(InventarioServico tab, Locale local) {
        super("Linha é SIP?", local);
        this.iS = tab;
    }

    @Override
    public ValidavelAbs getObject() {
        return null;
    }

    @Override
    public Boolean checar() {
        return iS.getTipoLinha() == TecnologiaLinha.SIP;
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
