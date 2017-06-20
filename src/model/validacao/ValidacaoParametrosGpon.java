/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao;

import model.dslam.consulta.gpon.TabelaParametrosGpon;

/**
 *
 * @author G0041775
 */
public class ValidacaoParametrosGpon extends Validacao {

    private transient TabelaParametrosGpon t;

    public ValidacaoParametrosGpon(TabelaParametrosGpon tab) {
        super("Parâmetros Ópticos");
        t = tab;
    }

    @Override
    public Boolean validar() {

        if (t.getPotOlt().compareTo(new Double("-8")) <= 0 && t.getPotOlt().compareTo(new Double("-25")) >= 0
                && t.getPotOnt().compareTo(new Double("-8")) <= 0 && t.getPotOnt().compareTo(new Double("-25")) >= 0) {
            setMensagem("Parâmetros dentro do padrão (entre -8 e -25).");
            setResultado(Boolean.TRUE);
            return true;
        } else {
            setMensagem("Parâmetros fora do padrão (entre -8 e -25). Pot. OLT: " + t.getPotOlt() + ". Pot. ONT: " + t.getPotOnt());
            setResultado(Boolean.FALSE);
            return false;
        }

    }

}
