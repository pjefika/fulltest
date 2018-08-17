/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import controller.FullTestController;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.entity.LogEntity;
import model.fulltest.operacional.facade.FullTestCOFacade;
import model.fulltest.operacional.facade.FullTestInterface;

public class RunnableCO extends FulltestRunnable {

    public RunnableCO(LogEntity logzin) {
        super(logzin);
    }

    @Override
    public void run() {
        try {
            EfikaCustomer cust = (EfikaCustomer) logzin.getEntrada();
            FullTestInterface v = new FullTestCOFacade();
            FullTest res = v.executar(cust);
            logzin.setSaida(res);
        } catch (Exception e) {
            logzin.setSaida(e.getMessage());
        } finally {
            try {
                logzin.setDataOut(Calendar.getInstance());
                getLogDao().update(logzin, getLogDao().createUpdateOperations().set("saida", logzin.getSaida()).set("dataOut", logzin.getDataOut()));
            } catch (Exception ex) {
                Logger.getLogger(RunnableCO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
