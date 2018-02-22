/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.both;

import br.net.gvt.efika.fulltest.model.telecom.properties.ValidavelAbs;
import java.util.Locale;

public class ValidacaoFake extends Validacao {

    private String saida;

    private Boolean resultado;

    public ValidacaoFake(String nome, Locale local, String saida, Boolean resultado) {
        super(nome, local);
        this.saida = saida;
        this.resultado = resultado;
    }

    @Override
    protected String frasePositiva() {
        return this.saida;
    }

    @Override
    protected String fraseNegativa() {
        return this.saida;
    }

    @Override
    public Boolean checar() {
        return this.resultado;
    }

    @Override
    public ValidavelAbs getObject() {
        return null;
    }

}
