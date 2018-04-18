/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.factory;

import dao.dslam.factory.exception.DslamNaoImplException;
import dao.dslam.impl.AbstractDslam;
import dao.dslam.impl.metalico.alcatel.NfxsAFdDslamVivo1;
import dao.dslam.impl.metalico.huawei.MA5100DslamVivo1;
import dao.dslam.impl.metalico.huawei.MA5300DslamVivo1;
import dao.dslam.impl.metalico.huawei.MA5600TDslamVivo1;
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
public class DslamMetalicoDAOFactory {

    public static AbstractDslam getInstance(String modelo, String ip) throws DslamNaoImplException {

        /**
         * Tratativa para TELEDATA
         */
        if (modelo.contains("LIADSLPT48")) {
            throw new DslamNaoImplException();
        }

        if (modelo.contains("48")) {
            return new ZhoneMetalicoComboDslam(ip);
        } else if (modelo.contains("MXK") && !modelo.contains("48")) {
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
        } else if (modelo.equalsIgnoreCase("MA5600T")) {
            return new MA5600TDslamVivo1(ip);
        } else if (modelo.equalsIgnoreCase("MA5600")) {
            return new MA5600TDslamVivo1(ip);
        } else if (modelo.equalsIgnoreCase("MA5300")) {
            return new MA5300DslamVivo1(ip);
        } else if (modelo.equalsIgnoreCase("MA5100")) {
            return new MA5100DslamVivo1(ip);
        } else if (modelo.equalsIgnoreCase("MA5103")) {
            return new MA5100DslamVivo1(ip);
        } else if (modelo.equalsIgnoreCase("NFXS-A FD")) {
            return new NfxsAFdDslamVivo1(ip);
        } else if (modelo.equalsIgnoreCase("MILEGATE 2510")) {
            return new Keymile2510DslamVivo1(ip);
        } else {
            throw new DslamNaoImplException();
        }
    }

}
