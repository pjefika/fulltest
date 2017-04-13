/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao;

import java.math.BigInteger;
import model.dslam.consulta.metalico.TabelaRedeMetalico;

/**
 *
 * @author G0042204
 */
public class ValidacaoRede extends Validacao {

    private TabelaRedeMetalico t;

    public ValidacaoRede(TabelaRedeMetalico i) {
        this.t = i;
        this.nome = "Rede";
    }

    /**
     * Implementar!
     *
     * @return
     */
    @Override
    public Boolean validar() {

        if (t.getResync() != null) {
            return t.getResync().compareTo(new BigInteger("5")) < 0;
        }
        return false;
    }
}
