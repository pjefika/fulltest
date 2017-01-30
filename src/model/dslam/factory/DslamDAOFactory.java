/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.factory;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import model.dslam.AbstractDslam;
import model.dslam.factory.exception.DslamNaoImplException;
import model.dslam.vivo2.gpon.alcatel.AlcatelGponDslam;

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

        try{
            if (info.getTechnology().trim().equalsIgnoreCase("GPON")) {
            ContratoFactoryDslam fac = new DslamGponDAOFactory();
            return fac.getInstance(info);
            }
        }catch (Exception e){
            throw new DslamNaoImplException();
        }
        return null;
    }

}
