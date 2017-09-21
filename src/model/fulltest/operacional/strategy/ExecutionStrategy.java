/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional.strategy;

import model.fulltest.operacional.facade.FullTestGenericFacade;

/**
 *
 * @author G0042204
 */
public interface ExecutionStrategy {

    public void action(FullTestGenericFacade ft) throws Exception;
}
