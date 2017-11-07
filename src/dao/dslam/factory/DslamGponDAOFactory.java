/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.factory;

import dao.dslam.factory.exception.DslamNaoImplException;
import dao.dslam.impl.AbstractDslam;
import dao.dslam.impl.gpon.alcatel.AlcatelGponDslam;
import dao.dslam.impl.gpon.huawei.HuaweiGponDslamVivo1;
import dao.dslam.impl.gpon.keymile.KeymileGponDslam;
import dao.dslam.impl.gpon.zhone.ZhoneGponDslam;

/**
 *
 * @author G0042204
 */
public class DslamGponDAOFactory {

    public static AbstractDslam getInstance(String modelo, String ip) throws DslamNaoImplException {

        if (modelo.trim().equalsIgnoreCase("GPON_CARD")) {
            return new AlcatelGponDslam(ip);
        } else if (modelo.trim().equalsIgnoreCase("GPON_CARD8")) {
            return new ZhoneGponDslam(ip);
        } else if (modelo.trim().equalsIgnoreCase("SUGP1")) {
            return new KeymileGponDslam(ip);
        } else if (modelo.trim().equalsIgnoreCase("MA5600T_FV1")) {
            return new HuaweiGponDslamVivo1(ip);
        } else {
            throw new DslamNaoImplException();
        }
    }

}
