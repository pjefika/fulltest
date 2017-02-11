/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.massivo;

import dao.massivo.TesteClienteDAO;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.annotation.Resource;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.Timeout;
import javax.ejb.TimerService;
import javax.inject.Inject;
import model.entity.TesteCliente;
import model.entity.ValidacaoGpon;
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
    
    @Resource
    private TimerService timerService;
    
    @Timeout
    public void timeOut() {
//        abreThread();
    }
    
    @Schedule(second= "1", minute = "*/2", hour = "*")
    public void abreThread() {

        System.out.println("model.fulltest.massivo.MassivoSingleton.abreThread()");
        List<TesteCliente> l = dao.listarInstanciasPendentes();

        if (l != null) {
            ExecutorService exec = Executors.newFixedThreadPool(5);
            List<BackgroundTestThread> bs = new ArrayList<>();
            for (TesteCliente testeCliente : l) {
                BackgroundTestThread b = new BackgroundTestThread(testeCliente);
                exec.execute(b);
                try {
                    b.getCls().setStatus(Status.EM_EXECUCAO);
                    dao.editar(b.getCls());
                    bs.add(b);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            }

            exec.shutdown();

            while (!exec.isTerminated()) {

            }

            for (BackgroundTestThread b : bs) {

                for (ValidacaoGpon validacaoGpon : b.getCls().getValid()) {
                    try {
                        validacaoGpon.setTeste(b.getCls());
                        dao.cadastrar(validacaoGpon);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }

                b.getCls().setStatus(Status.CONCLUIDO);

                try {
                    dao.editar(b.getCls());
                } catch (Exception e) {
                    e.printStackTrace();
                }

                if (b.getCls().getLote().isTestesConc()) {
                    try {
                        b.getCls().getLote().setStatus(Status.CONCLUIDO);
                        dao.editar(b.getCls().getLote());
                    } catch (Exception ex) {
                        System.out.println("leErro");
                        ex.printStackTrace();
                    }
                }else{
                    try {
                        b.getCls().getLote().setStatus(Status.EM_EXECUCAO);
                        dao.editar(b.getCls().getLote());
                    } catch (Exception ex) {
                        System.out.println("leErro");
                        ex.printStackTrace();
                    }
                }

            }
        }

    }

}
