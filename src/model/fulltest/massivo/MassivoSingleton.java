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
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.ScheduleExpression;
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
        abreThread();
    }

    @PostConstruct
    public void initTimer() {
        System.out.println("INIT-CALLED");
        ScheduleExpression exp = new ScheduleExpression();
        exp.hour("*/2").minute("*");
        timerService.createCalendarTimer(exp);
    }

    public void abreThread() {

        System.out.println("model.fulltest.massivo.MassivoSingleton.abreThread()");
        List<TesteCliente> l = dao.listarInstanciasPendentes();

        if (l != null) {
            ExecutorService exec = Executors.newFixedThreadPool(10);
            List<BackgroundTestThread> bs = new ArrayList<>();
            for (TesteCliente testeCliente : l) {
                BackgroundTestThread b = new BackgroundTestThread(testeCliente);
                exec.execute(b);
                try {
                    b.getCls().setStatus(Status.CONCLUIDO);
                    dao.editar(b.getCls());
                    bs.add(b);

//                    result.use(Results.json()).from(b.getCls()).include("valid").serialize();
                } catch (Exception ex) {
//                    result.use(Results.json()).from(ex.getStackTrace()).serialize();
                }
            }
            exec.shutdown();

            while (!exec.isTerminated()) {

            }
            System.out.println("acabô!");
            for (BackgroundTestThread b : bs) {
                for (ValidacaoGpon validacaoGpon : b.getCls().getValid()) {
                    try {
                        validacaoGpon.setTeste(b.getCls());
                        dao.cadastrar(validacaoGpon);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
                Integer o = 0;
                for (TesteCliente t : b.getCls().getLote().getTests()) {
                    if (!t.getStatus().equals(Status.CONCLUIDO)) {
                        o = 1;
                    }
                }
                if (o.equals(0)) {
                    try {
                        b.getCls().getLote().setStatus(Status.CONCLUIDO);
                        dao.editar(b.getCls().getLote());
                    } catch (Exception ex) {
                        System.out.println("leErro");
                        ex.printStackTrace();
                    }
                }

            }

            System.out.println("acabô de vdd!");

        } else {
//            this.includeSerializer(new ArrayList<TesteCliente>());
        }

    }

}
