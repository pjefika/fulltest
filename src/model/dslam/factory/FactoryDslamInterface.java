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
public interface FactoryDslamInterface {

    public AbstractDslam getInstance(GetInfoOut info) throws DslamNaoImplException;

}
