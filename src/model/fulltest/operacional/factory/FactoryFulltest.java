/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional.factory;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.factory.exception.DslamNaoImplException;
import dao.dslam.factory.exception.FuncIndisponivelDslamException;
import model.fulltest.operacional.facade.FullTestInterface;

/**
 *
 * @author G0042204
 */
public class FactoryFulltest {

    /**
     * *
     * Fabrica de criação de Fulltests
     *
     * @param corretivo
     * @param cs
     * @return
     * @throws DslamNaoImplException
     * @throws dao.dslam.factory.exception.FuncIndisponivelDslamException
     */
    public static FullTestInterface create(Boolean corretivo, EfikaCustomer cs) throws DslamNaoImplException, FuncIndisponivelDslamException {
//        // Bloco Corretivo
//        if (corretivo) {
//            try {
//                return new FullTestCorrectiveGponFacade();
//            } catch (DslamNaoImplException e) {
//                return new FullTestCorrectiveMetalicoFacade();
//            }
//        } else {
//            // Bloco Não Corretivo
//            try {
//                return new FullTestGponFacade();
//            } catch (DslamNaoImplException e) {
//                return new FullTestCorrectiveMetalicoFacade();
//            }
//        }
        return null;
    }
}
