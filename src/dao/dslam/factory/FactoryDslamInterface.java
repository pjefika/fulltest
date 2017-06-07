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
public interface FactoryDslamInterface {

    public AbstractDslam getInstance(GetInfoOut info) throws DslamNaoImplException;

}