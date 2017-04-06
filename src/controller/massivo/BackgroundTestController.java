/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.massivo;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.view.Results;
import controller.AbstractController;
import dao.massivo.TesteClienteDAO;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import model.entity.TesteCliente;
import model.entity.ValidacaoGpon;
import model.fulltest.massivo.BackgroundTestThread;
import model.fulltest.massivo.InitSingleton;
import model.fulltest.validacao.ValidacaoFacade;

/**
 *
 * @author G0042204
 */
@Controller
public class BackgroundTestController extends AbstractController {

    @Inject
    private TesteClienteDAO dao;

    
    public BackgroundTestController() {
    }

    @Get
    @Path("/unitario/{inst}")
    public void execUnitario(String inst) throws Exception {
        TesteCliente t = new TesteCliente(inst);
        dao.cadastrar(t);

        ValidacaoFacade v = new ValidacaoFacade(t);
        ValidacaoGpon oi = v.validar();
        oi.setTeste(t);
        dao.cadastrar(oi);

        result.use(Results.json()).from(oi).recursive().serialize();
    }

    @Path("/execMassivo")
    public void execMassivo() throws InterruptedException {
        Integer i = 0;
        Integer o = 0;
//        System.out.println(InitSingleton.getInstance().getThreadsOn());
        while (InitSingleton.getInstance().getThreadsOn()) {
            
            List<TesteCliente> listTest = dao.listarInstanciasPendentes(40);
            if (listTest.isEmpty()) {
                listTest = dao.listarInstanciasPresasExec(40);
            }
            if (!listTest.isEmpty()) {

                ExecutorService exec = Executors.newCachedThreadPool();

                for (TesteCliente testeCliente : listTest) {
                    BackgroundTestThread b = new BackgroundTestThread(testeCliente, dao);
                    exec.execute(b);
                }

                exec.shutdown();
                exec.awaitTermination(150, TimeUnit.SECONDS);
                dao.clear();
                i++;
                System.out.println("cabo Threads " + i);
            } else {
                o++;
                System.out.println("lista Vazia " + o);
            }

            Thread.sleep(10000);
        }
    }
    
    @Path("/threadsOn/{state}")
    public void threadsOff(Boolean state){
        InitSingleton.getInstance().setThreadsOn(state);
    }
    
    @Path("/threads")
    public void threads(){
        includeSerializer(InitSingleton.getInstance());
    }

    @Override
    public void includeSerializer(Object a) {
        result.use(Results.json()).from(a).serialize();
    }
}
