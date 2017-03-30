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
public class BackgroundTestThread {

    private CadastroDAO dao;

    private TesteCliente cls;
    
    @Inject
    private TesteClienteDAO tcDao;

    /**
     *
     * @param cls
     * @param tcDao
     */
    public BackgroundTestThread(TesteCliente cls, TesteClienteDAO tcDao) {
        this.dao = new CadastroDAO();
        this.tcDao = tcDao;
        this.cls = cls;
    }

    public void run() {
//        lDao.startConnection();
//        tcDao.startConnection();
        
        ValidacaoGponDecorator d = new ValidacaoGponDecorator();
        ValidacaoGpon vg = new ValidacaoGpon();
        
        Calendar inicio = Calendar.getInstance();
        cls.setStatus(Status.EM_EXECUCAO);
        
        try {
            tcDao.cadastrar(cls);
        } catch (Exception e) {
            System.out.println("Erro de alteracao de status");
            e.printStackTrace();
        }
        
        try {
            AbstractDslam oi = dao.getDslam(cls.getInstancia());
            ValidacaoFacade v = new ValidacaoFacade(oi);

            try {
                vg = v.validar();
            } catch (Exception e) {
                System.out.println("");
                e.printStackTrace();
                vg = d.falhaConsulta();
                vg.setReteste(Boolean.TRUE);
            }

        } catch (RemoteException e) {
            vg = d.falhaCadastro();
        } catch (DslamNaoImplException e) {
            vg = d.falhaImplementacao();
        } finally {
            System.out.println(cls.getId());
            TesteCliente leTeste = tcDao.buscarInstanciaPorId(cls);
            
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

                if(vg.getReteste()){
                    cls.setStatus(Status.ATIVO);
                }

                leTeste.setStatus(cls.getStatus());
            } catch (Exception e) {
                System.out.println("lecrazy");
                e.printStackTrace();
            }
            
            try {
                tcDao.cadastrar(vg);
            } catch (Exception e) {
                System.out.println("naocadastrouvg");
                e.printStackTrace();
            }
            
            
            try {
                tcDao.editar(leTeste);
            } catch (Exception e) {
                System.out.println("naoeditoleTeste");
                try {
                    tcDao.editar(cls);
                } catch (Exception ex) {
                    System.out.println("naoeditocls");
                    ex.printStackTrace();
                    System.out.println("leTeste:");
                    e.printStackTrace();
                }
            }
//            lDao.closeConnection();
//            tcDao.closeConnection();
        }

    }

    public TesteCliente getCls() {
        return cls;
    }

}
