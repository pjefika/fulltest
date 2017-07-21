/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao;

import dao.dslam.factory.exception.FuncIndisponivelDslamException;

/**
 *
 * @author g0042204
 */
public abstract class ValidFlow {

    protected abstract void iniciar() throws FuncIndisponivelDslamException;

    protected abstract Boolean checar();

    protected abstract void processar();
}
