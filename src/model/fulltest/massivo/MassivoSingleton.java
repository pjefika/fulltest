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
import java.util.concurrent.TimeUnit;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.enterprise.concurrent.ManagedScheduledExecutorService;
import javax.inject.Inject;
import model.entity.TesteCliente;

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

    @Resource
    private ManagedScheduledExecutorService scheduledExecutorService;

    @PostConstruct
    public void comecaAi() {
        scheduledExecutorService.scheduleWithFixedDelay(this::abreThread, 1, 10, TimeUnit.SECONDS);
    }
//    @Schedule(hour = "*", minute = "*", second = "*/20")
    public void abreThread() {
        System.out.println("model.fulltest.massivo.MassivoSingleton.abreThread()");

        Integer quantTest = 40;
//        Integer quantThread = (quantTest-(quantTest/3));
        List<TesteCliente> l = dao.listarInstanciasPendentes(quantTest);
        System.out.println("leLista : " + l.toString());
        
        if (l.isEmpty()) {
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

}
