/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.massivo;

import dao.massivo.TesteClienteDAO;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.Timeout;
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
//
//    @Resource
//    private TimerService timerService;
//

    @Timeout
    public void timeOut() {
    }

    @Schedule(second = "*/20", minute = "*/1", hour = "*")
    public void abreThread() throws InterruptedException {

        System.out.println("model.fulltest.massivo.MassivoSingleton.abreThread()");
        Integer quantTest = 60;
        Integer quantThread = (quantTest-(quantTest/3));
        List<TesteCliente> l = dao.listarInstanciasPendentes(quantTest);

        if (l != null) {
            ExecutorService exec = Executors.newFixedThreadPool(quantThread);

            for (TesteCliente testeCliente : l) {
                BackgroundTestThread b = new BackgroundTestThread(testeCliente, dao);
                exec.execute(b);
            }

            exec.shutdown();

            while (!exec.isTerminated()) {

            }

            System.out.println("Cabo as thread!");
        }

    }

}
