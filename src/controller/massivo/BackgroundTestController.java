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
import dao.cadastro.CadastroDAO;
import dao.massivo.TesteClienteDAO;
import java.rmi.RemoteException;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.inject.Inject;
import model.dslam.AbstractDslam;
import model.dslam.factory.exception.DslamNaoImplException;
import model.entity.TesteCliente;
import model.entity.ValidacaoGpon;
import model.fulltest.massivo.BackgroundTestThread;
import model.fulltest.validacao.ValidacaoFacade;
import model.fulltest.validacao.decorator.ValidacaoGponDecorator;

/**
 *
 * @author G0042204
 */
@Controller
public class BackgroundTestController extends AbstractController {

    @Inject
    private TesteClienteDAO dao;
    
    @Inject
    private CadastroDAO cDao;
    

    public BackgroundTestController() {
    }

    @Get
    @Path("/unitario/{inst}")
    public void execUnitario(String inst) throws Exception {
        AbstractDslam oi = null;
        ValidacaoGponDecorator d = new ValidacaoGponDecorator();
        ValidacaoGpon vg = new ValidacaoGpon();
        try {
            oi = cDao.getDslam(inst);
            ValidacaoFacade v = new ValidacaoFacade(oi);
            try {
                vg = v.validar();
            } catch (Exception e) {
                e.printStackTrace();
                vg = d.falhaConsulta();
                vg.setReteste(Boolean.TRUE);
            }
        } catch (DslamNaoImplException ex) {
            vg = d.falhaImplementacao();
        } catch (RemoteException ex) {
            try {
                Thread.sleep(10000);
                oi = cDao.getDslam(inst);
            } catch (Exception e) {
                vg = d.falhaCadastro();
            }
        }
        
        
        
        TesteCliente t = new TesteCliente(inst);
        t.getValid().add(vg);
        dao.cadastrar(t);
        dao.cadastrar(vg);
        
        result.use(Results.json()).from(t).include("valid").serialize();
        
        
    }

    @Path("/massivo")
    public void execMassivo() throws InterruptedException{
        Integer i = 0;
        Integer o = 0;
        while (true) {

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

                while (!exec.isTerminated()) {

                }
                i++;
                System.out.println("cabo Threads " + i);
            }else{
                o++;
                System.out.println("lista Vazia " + o);
            }
            
            Thread.sleep(10000);
        }
    }

    @Override
    public void includeSerializer(Object a) {
        result.use(Results.json()).from(a).serialize();
    }
}
