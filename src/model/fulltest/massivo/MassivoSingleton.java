/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.massivo;

/**
 *
 * @author G0042204
 */
//@Singleton
public class MassivoSingleton {
//
//    @Inject
//    private TesteClienteDAO dao;
//
//    @Inject
//    private LoteDAO lDao;
//
////    @Resource
////    private ManagedScheduledExecutorService scheduledExecutorService;
//
////    @PostConstruct
////    public void comecaAi() {
//////        scheduledExecutorService.scheduleWithFixedDelay(this::abreThread, 1, 10, TimeUnit.SECONDS);
////        while (1 == 1) {
////            Thread oi = new Thread(this::abreThread);
////            oi.start();
////            try {
////                oi.join();
////            } catch (InterruptedException ex) {
////                Logger.getLogger(MassivoSingleton.class.getName()).log(Level.SEVERE, null, ex);
////            }
////        }
////
////    }
////    @Schedule(hour = "*", minute = "*", second = "*/20")
//
//    public void abreThread() {
//        System.out.println("model.fulltest.massivo.MassivoSingleton.abreThread()");
//
//        Integer quantTest = 40;
////        Integer quantThread = (quantTest-(quantTest/3));
//        List<TesteCliente> l = dao.listarInstanciasPendentes(quantTest);
//        System.out.println("leLista : " + l.toString());
//
//        if (l.isEmpty()) {
//            l = dao.listarInstanciasPresasExec(quantTest);
//        }
//
//        if (l != null) {
//            ExecutorService exec = Executors.newCachedThreadPool();
//
//            for (TesteCliente testeCliente : l) {
//                BackgroundTestThread b = new BackgroundTestThread(testeCliente, lDao, dao);
//                exec.execute(b);
//            }
//
//            exec.shutdown();
//
//            while (!exec.isTerminated()) {
//
//            }
//
//            System.out.println("Cabo as thread!");
//        }
//
//    }

}