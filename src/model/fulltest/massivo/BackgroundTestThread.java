/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.massivo;

import dao.cadastro.CadastroDAO;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import model.decorator.ValidacaoGponDecorator;
import model.dslam.AbstractDslam;
import model.dslam.factory.exception.DslamNaoImplException;
import model.entity.TesteCliente;
import model.entity.ValidacaoGpon;
import model.fulltest.validacao.ValidacaoFacade;

/**
 *
 * @author G0042204
 */
public class BackgroundTestThread implements Runnable{

    private CadastroDAO dao;

    private TesteCliente cls;

    /**
     *
     * @param cls
     */
    public BackgroundTestThread(TesteCliente cls) {
        this.cls = cls;
        this.dao = new CadastroDAO();
    }

    @Override
    public void run() {

        ValidacaoGponDecorator d = new ValidacaoGponDecorator();
        ValidacaoGpon vg = null;

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
            List<ValidacaoGpon> vs = new ArrayList<>();
            vs.add(vg);
            cls.setValid(vs);
        }

    }

    public TesteCliente getCls() {
        return cls;
    }

}
