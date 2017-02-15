/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.massivo;

import dao.cadastro.CadastroDAO;
import dao.massivo.TesteClienteDAO;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import model.decorator.ValidacaoGponDecorator;
import model.dslam.AbstractDslam;
import model.dslam.factory.exception.DslamNaoImplException;
import model.entity.TesteCliente;
import model.entity.ValidacaoGpon;
import model.fulltest.Status;
import model.fulltest.validacao.ValidacaoFacade;

/**
 *
 * @author G0042204
 */
public class BackgroundTestThread implements Runnable{

    private CadastroDAO dao;

    private TesteCliente cls;
    
    private TesteClienteDAO tcDao;

    /**
     *
     * @param cls
     * @param tcDao
     */
    public BackgroundTestThread(TesteCliente cls, TesteClienteDAO tcDao) {
        this.cls = cls;
        this.dao = new CadastroDAO();
        this.tcDao = tcDao;
    }

    @Override
    public void run() {

        ValidacaoGponDecorator d = new ValidacaoGponDecorator();
        ValidacaoGpon vg = null;
        
        Calendar inicio = Calendar.getInstance();
        cls.setStatus(Status.EM_EXECUCAO);
        if(cls.getLote().getStatus().equals(Status.ATIVO)){
            cls.getLote().setStatus(Status.EM_EXECUCAO);
            cls.getLote().setDataInicio(inicio);
        }
        
        try {
            tcDao.editar(cls);
            tcDao.editar(cls.getLote());
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
                System.out.println("erro");
                e.printStackTrace();
                vg = d.falhaConsulta();
            }

        } catch (RemoteException e) {
            vg = d.falhaCadastro();

        } catch (DslamNaoImplException e) {
            vg = d.falhaImplementacao();

        } finally {
            List<ValidacaoGpon> vs = null;
            if(cls.getValid().isEmpty()){
                vs = new ArrayList<>();
                if(!vg.getCadastro()||!vg.getConsulta()||!vg.getImplementacao()){
                    vg.setReteste(Boolean.TRUE);
                }
            }else{
                vs = cls.getValid();
            }
            vs.add(vg);
            cls.setValid(vs);
            vg.setTeste(cls);
            vg.setDataInicio(inicio);
            vg.setDataFim(Calendar.getInstance());
            
            try {
                if(vg.getReteste()){
                    cls.setStatus(Status.ATIVO);
                    tcDao.editar(cls);
                }else{
                    cls.setStatus(Status.CONCLUIDO);
                    tcDao.editar(cls);    
                }
                
                if(cls.getLote().isTestesConc()){
                    cls.getLote().setStatus(Status.CONCLUIDO);
                    cls.getLote().setDataFim(Calendar.getInstance());
                }
                
                tcDao.cadastrar(vg);
                tcDao.editar(cls.getLote());
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
