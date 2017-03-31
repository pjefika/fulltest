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
        this.cls = new TesteCliente(tc);
        this.vg = new ValidacaoGpon();
    }

    @Override
    public void run() {
        Calendar inicio = Calendar.getInstance();
        cls.setStatus(Status.EM_EXECUCAO);

        ValidacaoFacade v = new ValidacaoFacade(cls);

        vg = v.validar();
        List<ValidacaoGpon> vs;
        if (!cls.getValid().isEmpty()) {
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
         * Verifica se precisa retestar aguarda 15 segundos e retesta
         */
        if (vg.getReteste()) {
            try {
                Thread.sleep(15000);
            } catch (InterruptedException ex) {
                Logger.getLogger(BackgroundTestThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            run();
            return;
        }
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
            this.getCls().getLote().setStatus(Status.EM_EXECUCAO);
            tcDao.editar(cls);
            tcDao.cadastrar(this.getVg());
            tcDao.clear();
        } catch (Exception ex) {
            Logger.getLogger(BackgroundTestThread.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
