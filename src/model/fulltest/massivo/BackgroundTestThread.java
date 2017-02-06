/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.massivo;

import dao.cadastro.CadastroDAO;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import model.dslam.AbstractDslam;
import model.dslam.factory.exception.DslamNaoImplException;
import model.entity.TesteCliente;
import model.fulltest.validacao.ValidacaoFacade;
import model.entity.ValidacaoGpon;

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

            AbstractDslam oi = dao.getDslam(cl.getInstancia());

            ValidacaoFacade v = new ValidacaoFacade(oi);

            ValidacaoGpon vg = v.validar();

            List<ValidacaoGpon> vs = new ArrayList<>();

            vs.add(vg);

            cl.setValid(vs);
    

        }
    }

    public List<TesteCliente> getCls() {
        return cls;
    }

}
