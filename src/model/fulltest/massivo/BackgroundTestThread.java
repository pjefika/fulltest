/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.massivo;

import dao.massivo.TesteClienteDAO;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;
import model.entity.TesteCliente;
import model.entity.ValidacaoGpon;
import model.fulltest.Status;
import model.fulltest.validacao.ValidacaoFacade;

/**
 *
 * @author G0042204
 */
public class BackgroundTestThread implements Runnable {

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
        this.tcDao = tcDao;
        this.cls = tcDao.buscarInstanciaPorId(tc);
        this.vg = new ValidacaoGpon();
    }

    @Override
    public void run() {
        Calendar inicio = Calendar.getInstance();
        cls.setStatus(Status.EM_EXECUCAO);

        ValidacaoFacade v = new ValidacaoFacade(cls);

        vg = v.validar();
        vg.setDataInicio(inicio);
        vg.setDataFim(Calendar.getInstance());
        
        
        if(vg.getCadastro() == null || (vg.getCadastro().equals(Boolean.FALSE)&&cls.getValid().size()<1)){
            vg.setReteste(Boolean.TRUE);
        }else{
            cls.setStatus(Status.CONCLUIDO);    
        }
        
        vg.setTeste(cls);
        
        salvaAi();
    }

    public TesteCliente getCls() {
        return cls;
    }

    public ValidacaoGpon getVg() {
        return vg;
    }

    private void salvaAi() {
        try {
            tcDao.editar(getCls());
            tcDao.editar(getVg());
        } catch (Exception ex) {
            Logger.getLogger(BackgroundTestThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
