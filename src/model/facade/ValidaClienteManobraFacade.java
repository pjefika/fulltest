/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.facade;

import dao.cadastro.CadastroDAO;
import java.rmi.RemoteException;
import model.Motivos;
import model.dslam.AbstractDslam;
import model.dslam.consulta.metalico.ConsultaMetalicoDefault;
import model.dslam.factory.exception.DslamNaoImplException;
import model.entity.Cliente;
import model.entity.ValidacaoFinal;
import model.validacao.ValidacaoCadastroTBS;
import model.validacao.ValidacaoRede;
import model.validacao.manobra.ValidacaoRedeManobra;

/**
 *
 * @author G0042204
 */
public class ValidaClienteManobraFacade {

    private Cliente cl;

    private Motivos m;

    private CadastroDAO dao = new CadastroDAO();

    private ConsultaMetalicoDefault met;

    private AbstractDslam dslam;

    public ValidaClienteManobraFacade(Cliente cl, Motivos m) throws DslamNaoImplException, RemoteException {
        this.cl = dao.getCliente(cl);
        this.m = m;
    }

    public ValidacaoFinal validar() throws DslamNaoImplException, RemoteException, Exception {

        ValidacaoFinal v = new ValidacaoFinal();

        if (m.equals(Motivos.SEMAUTH)) {
            if (new ValidacaoCadastroTBS(cl.getCadastro(), cl.getIncon()).validar()) {
                dslam = dao.getDslam(cl.getCadastro());
                met = (ConsultaMetalicoDefault) dslam;
                //cons. auth
                if (true) {
                    ValidacaoRede vR = new ValidacaoRedeManobra(met.getTabelaRede());
                    v.setConclusao(Boolean.FALSE);
                    v.setFraseologia(vR.getMensagem());
                } else {
                    if (met.getVlanBanda().validar(dslam)) {
                        v.setConclusao(Boolean.TRUE);
                        v.setFraseologia("");
                    }else{
                        v.setConclusao(Boolean.FALSE);
                        v.setFraseologia("Bridge configurada incorretamente, necessário reconfigurar e então refazer a validação.");
                    }
                }
            } else {
                v.setConclusao(Boolean.FALSE);
                v.setFraseologia("Inconsistência no cadastro entre TBS x Radius");
            }
        }else{
            v.setConclusao(Boolean.FALSE);
            v.setFraseologia("Motivo não implementado.");
        }

        return v;
    }

    public Cliente getCl() {
        return cl;
    }

    public void setCl(Cliente cl) {
        this.cl = cl;
    }
}
