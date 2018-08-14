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
public abstract class FulltestRunnable implements Runnable {

    private LogEntity logzin;

    public FulltestRunnable(LogEntity logzin) {
        this.logzin = logzin;
    }

    public LogEntity getLogzin() {
        return logzin;
    }

    public void setLogzin(LogEntity logzin) {
        this.logzin = logzin;
    }

}
