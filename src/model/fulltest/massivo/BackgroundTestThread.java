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
public class BackgroundTestThread {

    private CadastroDAO dao;

    private List<TesteCliente> cls;

    /**
     *
     * @param cls
     */
    public BackgroundTestThread(List<TesteCliente> cls) {
        this.cls = cls;
        this.dao = new CadastroDAO();
    }

    public void run() throws DslamNaoImplException, Exception {

        for (TesteCliente cl : cls) {

            ValidacaoGponDecorator d = new ValidacaoGponDecorator();
            ValidacaoGpon vg = null;

            try {

                AbstractDslam oi = dao.getDslam(cl.getInstancia());
                ValidacaoFacade v = new ValidacaoFacade(oi);

                try {
                    vg = v.validar();
                } catch (Exception e) {
                    vg = d.falhaConsulta();
                }

            } catch (RemoteException e) {
                vg = d.falhaCadastro();

            } catch (DslamNaoImplException e) {
                vg = d.falhaImplementacao();

            } finally {
                List<ValidacaoGpon> vs = new ArrayList<>();
                vs.add(vg);
                cl.setValid(vs);
            }

        }
    }

    public List<TesteCliente> getCls() {
        return cls;
    }

}
