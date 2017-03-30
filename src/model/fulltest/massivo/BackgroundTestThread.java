/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.massivo;

import dao.cadastro.CadastroDAO;
import dao.massivo.TesteClienteDAO;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;
import model.dslam.AbstractDslam;
import model.dslam.factory.exception.DslamNaoImplException;
import model.entity.TesteCliente;
import model.entity.ValidacaoGpon;
import model.fulltest.Status;
import model.fulltest.validacao.ValidacaoFacade;
import model.fulltest.validacao.decorator.ValidacaoGponDecorator;

/**
 *
 * @author G0042204
 */
public class BackgroundTestThread implements Runnable{

    private CadastroDAO dao;

    private TesteCliente cls;
    
    @Inject
    private TesteClienteDAO tcDao;
    
    private ValidacaoGpon vg; 

    /**
     *
     * @param tc
     * @param tcDao
     */
    public BackgroundTestThread(TesteCliente tc, TesteClienteDAO tcDao) {
        this.dao = new CadastroDAO();
        this.tcDao = tcDao;
        this.cls = new TesteCliente(tc);
        this.vg = new ValidacaoGpon();
    }

    @Override
    public void run() {
        
        ValidacaoGponDecorator d = new ValidacaoGponDecorator();
        
        
        Calendar inicio = Calendar.getInstance();
        cls.setStatus(Status.EM_EXECUCAO);
                
        try {
            AbstractDslam oi = dao.getDslam(cls.getInstancia());
            ValidacaoFacade v = new ValidacaoFacade(oi);

            try {
                vg = v.validar();
            } catch (Exception e) {
                e.printStackTrace();
                vg = d.falhaConsulta();
                vg.setReteste(Boolean.TRUE);
            }

        } catch (RemoteException e) {
            vg = d.falhaCadastro();
        } catch (DslamNaoImplException e) {
            vg = d.falhaImplementacao();
        } finally {
                        
            try {
                List<ValidacaoGpon> vs;
                if(!cls.getValid().isEmpty()){
                    vg.setReteste(Boolean.FALSE);
                }
                
                vs = cls.getValid();
                vs.add(vg);
                cls.setValid(vs);
                vg.setTeste(cls);
                vg.setDataInicio(inicio);
                vg.setDataFim(Calendar.getInstance());
                cls.setStatus(Status.CONCLUIDO);

                /**
                 * Verifica se precisa retestar
                 * aguarda 15 segundos e retesta
                 */
                if(vg.getReteste()){
                    Thread.sleep(15000);
                    run();
                    return;
                }
                salvaAi();
            } catch (Exception e) {
                System.out.println("lecrazy");
                e.printStackTrace();
            }
            

        }

    }

    public TesteCliente getCls() {
        return cls;
    }

    public ValidacaoGpon getVg(){
        return vg;
    }
    
    private void salvaAi(){
        try {
            tcDao.editar(cls);
            tcDao.cadastrar(this.getVg());
            this.getCls().getLote().setStatus(Status.EM_EXECUCAO);
            tcDao.editar(cls.getLote());
            tcDao.clear();
        } catch (Exception ex) {
            Logger.getLogger(BackgroundTestThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
