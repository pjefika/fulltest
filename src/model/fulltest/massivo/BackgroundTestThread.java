/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.massivo;

import dao.cadastro.CadastroDAO;
import java.util.List;
import javax.inject.Inject;
import model.entity.TesteCliente;
import model.fulltest.validacao.ValidacaoFacade;

/**
 *
 * @author G0042204
 */
public class BackgroundTestThread implements Runnable {

    @Inject
    private CadastroDAO dao;

    private List<TesteCliente> cls;

    /**
     *
     * @param cls
     */
    public BackgroundTestThread(List<TesteCliente> cls) {
        this.cls = cls;
    }

    @Override
    public void run() {
        for (TesteCliente cl : cls) {

            try {
                ValidacaoFacade v = new ValidacaoFacade(dao.getDslam(cl.getInstancia()));
                cl.setValid(v.validar());

            } catch (Exception e) {

                System.out.println(e.getMessage());
            }

        }
    }

}
