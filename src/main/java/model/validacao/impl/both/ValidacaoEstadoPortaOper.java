/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.both;

import br.net.gvt.efika.fulltest.model.telecom.properties.EstadoDaPorta;
import br.net.gvt.efika.fulltest.model.telecom.properties.ValidavelAbs;
import java.util.Locale;

/**
 *
 * @author G0042204
 */
public class ValidacaoEstadoPortaOper extends Validacao {

    protected transient EstadoDaPorta ep;

    public ValidacaoEstadoPortaOper(EstadoDaPorta e, Locale local) {
        super("Estado Operacional da Porta", local);
        this.ep = e;
    }

    @Override
    public ValidavelAbs getObject() {
        return ep;
    }

    @Override
    public Boolean checar() {
        return ep.getOperState();
    }

    @Override
    protected String fraseNegativa() {
        return bundle.getString("validacaoEstadoOper_nok");
    }

    @Override
    protected String frasePositiva() {
        return bundle.getString("validacaoEstadoOper_ok");
    }

}
