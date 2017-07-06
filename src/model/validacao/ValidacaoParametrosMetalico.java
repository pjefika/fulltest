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
public class ValidacaoParametrosMetalico extends Validacao {

    protected transient TabelaParametrosMetalico t;

    public ValidacaoParametrosMetalico(TabelaParametrosMetalico tab, AbstractDslam dsl) {
        super("Parâmetros de Sincronismo");
        this.t = tab;
    }

    @Override
    public Boolean validar() throws Exception {
        
        
        
        return false;
    }

}
