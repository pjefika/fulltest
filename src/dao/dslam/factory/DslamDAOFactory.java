/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.factory;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import dao.dslam.impl.AbstractDslam;
import dao.dslam.factory.exception.DslamNaoImplException;

/**
 *
 * @author G0042204
 */
public class DslamDAOFactory implements FactoryDslamInterface {

    @Override
    public AbstractDslam getInstance(GetInfoOut info) throws DslamNaoImplException {

        System.out.println(info.getTechnology());
        System.out.println(info.getInfoTBS().getDslamModel());
        System.out.println(info.getInfoTBS().getDslamVendor());

        if (info.getTechnology().trim().equalsIgnoreCase("GPON")) {
            FactoryDslamInterface fac = new DslamGponDAOFactory();
            return fac.getInstance(info);
        } else {
            FactoryDslamInterface fac = new DslamMetalicoDAOFactory();
            return fac.getInstance(info);
        }

    }

}
