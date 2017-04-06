/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.massivo;

import dao.massivo.LoteDAO;
import dao.massivo.TesteClienteDAO;
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
    
    @Inject
    private TesteClienteDAO tDao;

    @Schedule(minute = "*/2", hour = "*")
    public void loteStatus() {
        System.out.println("olhando lote");
        Integer i = 0;
        List<Lote> ltExec = lDao.listarLotesEmExec();
        for (Lote lote : ltExec) {
            lote.setTests(tDao.listarInstanciasPorLote(lote));
            if (lote.getStatus().equals(Status.ATIVO) && lote.isTestesExec()) {
                lote.setStatus(Status.EM_EXECUCAO);
                lote.setDataInicio(Calendar.getInstance());
                i++;
            }

            if (lote.isTestesConc()) {
                lote.setStatus(Status.CONCLUIDO);
                lote.setDataFim(Calendar.getInstance());
                i++;
            }

            if (i > 0) {

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
