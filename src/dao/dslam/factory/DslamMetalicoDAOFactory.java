/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.factory;

import dao.dslam.impl.AbstractDslam;
import dao.dslam.factory.exception.DslamNaoImplException;
import dao.dslam.impl.metalico.keymile.KeymileMetalicoSuad1;
import dao.dslam.impl.metalico.keymile.KeymileMetalicoSuad3;
import dao.dslam.impl.metalico.keymile.KeymileMetalicoSuad5;
import dao.dslam.impl.metalico.keymile.KeymileMetalicoSuvd1;
import dao.dslam.impl.metalico.keymile.KeymileMetalicoSuvd11;
import dao.dslam.impl.metalico.keymile.KeymileMetalicoSuvd3;
import dao.dslam.impl.metalico.zhone.ZhoneMetalicoComboDslam;
import dao.dslam.impl.metalico.zhone.ZhoneMetalicoMxkDslam;

/**
 *
 * @author G0042204
 */
public class DslamMetalicoDAOFactory{

    public static AbstractDslam getInstance(String modelo, String ip) throws DslamNaoImplException {

        if (modelo.equalsIgnoreCase("COMBOZH48")) {
            return new ZhoneMetalicoComboDslam(ip);
        } else if (modelo.contains("MXK")) {
            return new ZhoneMetalicoMxkDslam(ip);
        } else if (modelo.equalsIgnoreCase("SUVD3")) {
            return new KeymileMetalicoSuvd3(ip);
        } else if (modelo.equalsIgnoreCase("SUVD11")) {
            return new KeymileMetalicoSuvd11(ip);
        } else if (modelo.equalsIgnoreCase("SUVD1")) {
            return new KeymileMetalicoSuvd1(ip);
        } else if (modelo.equalsIgnoreCase("SUAD1")) {
            return new KeymileMetalicoSuad1(ip);
        } else if (modelo.equalsIgnoreCase("SUAD3")) {
            return new KeymileMetalicoSuad3(ip);
        } else if (modelo.equalsIgnoreCase("SUAD5")) {
            return new KeymileMetalicoSuad5(ip);
        }else {
            throw new DslamNaoImplException();
        }
    }

}
