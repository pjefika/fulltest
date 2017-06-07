/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao;

import dao.dslam.impl.AbstractDslam;
import model.dslam.consulta.metalico.TabelaParametrosMetalico;

/**
 *
 * @author G0042204
 */
public abstract class ValidacaoParametros extends Validacao {

    protected TabelaParametrosMetalico t;

    protected transient AbstractDslam ds;

    public ValidacaoParametros(TabelaParametrosMetalico tab, AbstractDslam dsl) {
        this.t = tab;
        this.ds = dsl;
        this.nome = "Parâmetros de Sincronismo";
    }


}
