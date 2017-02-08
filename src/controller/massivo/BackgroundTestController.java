/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.massivo;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.view.Results;
import controller.AbstractController;
import dao.massivo.TesteClienteDAO;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.inject.Inject;
import model.entity.TesteCliente;
import model.entity.ValidacaoGpon;
import model.fulltest.Status;
import model.fulltest.massivo.BackgroundTestThread;

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
    public void load() {

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
                    
                    result.use(Results.json()).from(b.getCls()).include("valid").serialize();
                } catch (Exception ex) {
                    result.use(Results.json()).from(ex.getStackTrace()).serialize();
                }
            }
            exec.shutdown();
            
            while(!exec.isTerminated()){
                
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
                for(TesteCliente t : b.getCls().getLote().getTests()){
                    if(!t.getStatus().equals(Status.CONCLUIDO)){
                        o=1;
                    } 
                }
                if(o.equals(0)){
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
            this.includeSerializer(new ArrayList<TesteCliente>());
        }
    }

    @Override
    public void includeSerializer(Object a) {
        result.use(Results.json()).from(a).serialize();
    }
}
