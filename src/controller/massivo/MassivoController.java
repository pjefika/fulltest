/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.massivo;

import br.com.caelum.vraptor.Controller;
import controller.AbstractController;
import model.annotation.Logado;

/**
 *
 * @author G0034481
 */
@Controller
public class MassivoController extends AbstractController {

//    @Inject
//    private TesteClienteDAO dao;
//    
//    @Inject
//    private LoteDAO lDao;
    
    public MassivoController() {
        
    }

    @Logado
    public void create() {

    }

//    public void abreThread() {
//        while (1 == 1) {
//
//            System.out.println("model.fulltest.massivo.MassivoSingleton.abreThread()");
//
//            Integer quantTest = 40;
////        Integer quantThread = (quantTest-(quantTest/3));
//            List<TesteCliente> l = dao.listarInstanciasPendentes(quantTest);
//            System.out.println("leLista : " + l.toString());
//
//            if (l.isEmpty()) {
//                l = dao.listarInstanciasPresasExec(quantTest);
//            }
//
//            if (l != null) {
//                ExecutorService exec = Executors.newCachedThreadPool();
//
//                for (TesteCliente testeCliente : l) {
//                    BackgroundTestThread b = new BackgroundTestThread(testeCliente, dao);
////                    exec.execute(b);
//                }
//
//                exec.shutdown();
//
//                while (!exec.isTerminated()) {
//
//                }
//
//                System.out.println("Cabo as thread!");
//            }
//            try {
//                Thread.sleep(10000);
//            } catch (Exception ex) {
//
//            }
//        }
//
//    }

}
