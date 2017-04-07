/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.factory;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import model.dslam.AbstractDslam;
import model.dslam.factory.exception.DslamNaoImplException;

/**
 *
 * @author G0042204
 */
public class DslamDAOFactory implements ContratoFactoryDslam {

    @Override
    public AbstractDslam getInstance(GetInfoOut info) throws DslamNaoImplException {

        System.out.println(info.getTechnology());
        System.out.println(info.getInfoTBS().getDslamModel());
        System.out.println(info.getInfoTBS().getDslamVendor());

        if (info.getTechnology().trim().equalsIgnoreCase("GPON")) {
            ContratoFactoryDslam fac = new DslamGponDAOFactory();
            return fac.getInstance(info);
        } else {
            ContratoFactoryDslam fac = new DslamMetalicoDAOFactory();
            return fac.getInstance(info);
        }

    }

}
