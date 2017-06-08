/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.factory;

import dao.dslam.impl.AbstractDslam;
import dao.dslam.factory.exception.DslamNaoImplException;
import dao.dslam.impl.gpon.alcatel.AlcatelGponDslam;
import dao.dslam.impl.gpon.keymile.KeymileGponDslam;
import dao.dslam.impl.gpon.zhone.ZhoneGponDslam;

/**
 *
 * @author G0042204
 */
public class DslamGponDAOFactory implements FactoryDslamInterface {

    @Override
    public AbstractDslam getInstance(String modelo) throws DslamNaoImplException {

        if (modelo.trim().equalsIgnoreCase("ALCATEL")) {
            return new AlcatelGponDslam();
        } else if (modelo.trim().equalsIgnoreCase("GPON_CARD8")) {
            return new ZhoneGponDslam();
        } else if (modelo.trim().equalsIgnoreCase("SUGP1")) {
            return new KeymileGponDslam();
        } else {
            throw new DslamNaoImplException();
        }
    }

}
