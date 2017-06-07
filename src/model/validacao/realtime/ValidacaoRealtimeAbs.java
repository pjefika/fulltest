/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime;

import dao.dslam.impl.AbstractDslam;
import model.validacao.Validacao;

/**
 *
 * @author G0042204
 */
public abstract class ValidacaoRealtimeAbs extends  Validacao{

    protected AbstractDslam dslam;

    public ValidacaoRealtimeAbs(AbstractDslam dslam) {
        this.dslam = dslam;
    }

}
