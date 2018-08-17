/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional;

import model.entity.LogEntity;

/**
 *
 * @author G0041775
 */
public class FactoryRunnable {

    public static FulltestRunnable coRunnable(LogEntity logzin) {
        return new RunnableCO(logzin);
    }

}
