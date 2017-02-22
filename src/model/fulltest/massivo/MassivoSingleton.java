/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.massivo;

import dao.massivo.LoteDAO;
import dao.massivo.TesteClienteDAO;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import model.entity.Lote;
import model.entity.TesteCliente;
import model.fulltest.Status;

/**
 *
 * @author G0042204
 */
@Singleton
@Startup
public class MassivoSingleton {

    @Inject
    private TesteClienteDAO dao;
    
    @Inject
    private LoteDAO lDao;

    @Schedule(second = "*/20", minute = "*/1", hour = "*")
    public void abreThread() throws InterruptedException {

        System.out.println("model.fulltest.massivo.MassivoSingleton.abreThread()");
        
        Integer quantTest = 40;
//        Integer quantThread = (quantTest-(quantTest/3));
        List<TesteCliente> l = dao.listarInstanciasPendentes(quantTest);
        if(l.isEmpty()){
            l = dao.listarInstanciasPresasExec(quantTest);
        }

        if (l != null) {
            ExecutorService exec = Executors.newCachedThreadPool();

            for (TesteCliente testeCliente : l) {
                BackgroundTestThread b = new BackgroundTestThread(testeCliente, lDao, dao);
                exec.execute(b);
            }

            exec.shutdown();

            while (!exec.isTerminated()) {

            }
            
           

            System.out.println("Cabo as thread!");
        }

    }
    @Schedule(second = "1", minute = "*/1", hour = "*")
    public void loteStatus(){

        List<Lote> ltExec = lDao.listarLotesEmExec();
        for (Lote lote : ltExec) {
            if(lote.isTestesConc()){
                lote.setStatus(Status.CONCLUIDO);
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
