/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.both;

import java.util.Locale;

public class ValidacaoFake extends Validacao {

    private String saida;

    public ValidacaoFake(String nome, Locale local, String saida) {
        super(nome, local);
        this.saida = saida;
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
        return true;
    }

    @Override
    public Object getObject() {
        return null;
    }

}
