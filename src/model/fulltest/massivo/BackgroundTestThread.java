/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.massivo;

import dao.cadastro.CadastroDAO;
import dao.massivo.LoteDAO;
import dao.massivo.TesteClienteDAO;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import model.dslam.AbstractDslam;
import model.dslam.factory.exception.DslamNaoImplException;
import model.entity.Lote;
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
    
    private LoteDAO lDao;
    
    private TesteClienteDAO tcDao;

    /**
     *
     * @param cls
     * @param lDao
     * @param tcDao
     */
    public BackgroundTestThread(TesteCliente cls, LoteDAO lDao, TesteClienteDAO tcDao) {
        this.dao = new CadastroDAO();
        this.lDao = lDao;
        this.tcDao = tcDao;
        this.cls = cls;
    }

    @Override
    public void run() {

        ValidacaoGponDecorator d = new ValidacaoGponDecorator();
        ValidacaoGpon vg = new ValidacaoGpon();
        
        
        
        Calendar inicio = Calendar.getInstance();
        cls.setStatus(Status.EM_EXECUCAO);
        
        
        if(cls.getLote().getStatus().equals(Status.ATIVO)){
            cls.getLote().setStatus(Status.EM_EXECUCAO);
            cls.getLote().setDataInicio(inicio);
        }
        
        try {
            lDao.editar(cls);
            lDao.editar(cls.getLote());
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
            vg.setReteste(Boolean.TRUE);

        } finally {
            TesteCliente leTeste = tcDao.buscarInstanciaPorId(cls);
                try {
                                List<ValidacaoGpon> vs;
                if(cls.getValid().isEmpty()){
                    vs = new ArrayList<>();
                }else{
                    vg.setReteste(Boolean.FALSE);
                    vs = cls.getValid();
                }
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
                lDao.editar(leTeste);
            } catch (Exception e) {
                System.out.println("naoeditoleTeste");
                try {
                    lDao.editar(cls);
                } catch (Exception ex) {
                    System.out.println("naoeditocls");
                    ex.printStackTrace();
                    System.out.println("leTeste:");
                    e.printStackTrace();
                }
            }
            
            try {
                lDao.cadastrar(vg);
            } catch (Exception e) {
                System.out.println("naocadastrouvg");
                e.printStackTrace();
            }
               
            
            try {
                Integer i = 0;
                for (TesteCliente test : cls.getLote().getTests()) {
                    if(!test.getStatus().equals(Status.CONCLUIDO)){
                        i = 1;
                    }
                }
                if(i == 0){
                    cls.getLote().setStatus(Status.CONCLUIDO);
                    cls.getLote().setDataFim(Calendar.getInstance());
                }
                Lote leLote = (Lote) lDao.buscarLotePorId(cls.getLote()); 
                lDao.editar(leLote);
                
            } catch (Exception e) {
                System.out.println("deunao");
                e.printStackTrace();
            }
        }

    }

    public TesteCliente getCls() {
        return cls;
    }

}
