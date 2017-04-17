/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.facade;

import dao.cadastro.CadastroDAO;
import java.rmi.RemoteException;
import model.dslam.consulta.ConsultaClienteInter;
import model.dslam.factory.exception.DslamNaoImplException;
import model.entity.Cliente;
import model.Motivos;
import model.validacao.ValidacaoFactory;

/**
 *
 * @author G0042204
 */
public class ConsultaClienteFacade {

    private ConsultaClienteInter c;

    private Cliente cl;

    private CadastroDAO dao = new CadastroDAO();

    public ConsultaClienteFacade(Cliente cl) {
        this.cl = cl;
    }

    public void consultar() throws DslamNaoImplException, RemoteException {
        cl = dao.getCliente(cl);
        c = dao.getDslam(cl.getCadastro());
    }

    public Boolean validar() {

        if (this.cl != null) {
            ValidacaoFactory fac = new ValidacaoFactory(cl);
            cl.setValid(fac.getValids(Motivos.MUDA));
        }

        return cl.validar();
    }

    public Cliente getCl() {
        return cl;
    }

    public void setCl(Cliente cl) {
        this.cl = cl;
    }
}
