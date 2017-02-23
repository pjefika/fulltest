/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.massivo;

import dao.massivo.LoteDAO;
import java.util.Calendar;
import java.util.List;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import model.entity.Lote;
import model.fulltest.Status;

/**
 *
 * @author G0042204
 */
@Singleton
@Startup
public class LoteSingleton {

    @Inject
    private LoteDAO lDao;

    
    @Schedule(second = "1", minute = "*/1", hour = "*")
    public void loteStatus(){

        List<Lote> ltExec = lDao.listarLotesEmExec();
        for (Lote lote : ltExec) {
            if(lote.isTestesConc()){
                lote.setStatus(Status.CONCLUIDO);
                lote.setDataFim(Calendar.getInstance());
                try {
                    lDao.editar(lote);    
                } catch (Exception e) {
                    System.out.println("paunolotepersist");
                    e.printStackTrace();
                }
                
            }
        }
        
    }

}
