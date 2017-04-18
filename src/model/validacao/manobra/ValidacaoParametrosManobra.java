/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.manobra;

import model.dslam.AbstractDslam;
import model.dslam.consulta.metalico.TabelaParametrosMetalico;
import model.validacao.*;

/**
 *
 * @author G0042204
 */
public class ValidacaoParametrosManobra extends ValidacaoParametros {

    public ValidacaoParametrosManobra(TabelaParametrosMetalico tab, AbstractDslam ds) {
        super(tab, ds);
    }

    private Boolean isAtnUpOk() {
        return t.getAtnUp().compareTo(new Double("0")) == 0;
    }

    private Boolean isVelOk() {
        ds.getProd().getBanda().setMin();
        return t.getVelSincDown().compareTo(ds.getProd().getBanda().getMin().getMinDown()) > 0 || t.getVelSincUp().compareTo(ds.getProd().getBanda().getMin().getMinUp()) > 0;
    }

    @Override
    public Boolean validar() {
        if(isAtnUpOk() && !isVelOk()){
            setMensagem("Velocidade fora do padrão.");
            setResultado(true);
            return true;
        }
        setResultado(false);
        return false;
    }

}
