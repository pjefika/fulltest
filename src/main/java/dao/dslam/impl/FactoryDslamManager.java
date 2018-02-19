/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl;

import dao.dslam.factory.exception.FuncIndisponivelDslamException;

/**
 *
 * @author G0042204
 */
public class FactoryDslamManager {

    public static ConsultaClienteInter createConsulta(AbstractDslam dslam) throws FuncIndisponivelDslamException {
        if (dslam instanceof ConsultaClienteInter) {
            return (ConsultaClienteInter) dslam;
        } else {
            throw new FuncIndisponivelDslamException();
        }
    }

    public static AlteracaoMetalicoDefault createAlterMetalico(AbstractDslam dslam) throws FuncIndisponivelDslamException {
        if (dslam instanceof AlteracaoMetalicoDefault) {
            return (AlteracaoMetalicoDefault) dslam;
        } else {
            throw new FuncIndisponivelDslamException();
        }
    }

}
