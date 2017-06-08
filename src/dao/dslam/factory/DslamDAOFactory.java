/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.factory;

import dao.dslam.impl.AbstractDslam;
import dao.dslam.factory.exception.DslamNaoImplException;

/**
 *
 * @author G0042204
 */
public class DslamDAOFactory implements FactoryDslamInterface {

    @Override
    public AbstractDslam getInstance(String modelo) throws DslamNaoImplException {
        try {
            FactoryDslamInterface fac = new DslamGponDAOFactory();
            return fac.getInstance(modelo);
        } catch (DslamNaoImplException e) {
            FactoryDslamInterface fac = new DslamMetalicoDAOFactory();
            return fac.getInstance(modelo);
        }
    }

}
