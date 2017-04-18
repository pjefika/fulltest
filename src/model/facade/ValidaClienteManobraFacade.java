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
import model.dslam.consulta.EstadoDaPorta;
import model.dslam.consulta.metalico.ConsultaMetalicoDefault;
import model.dslam.factory.exception.DslamNaoImplException;
import model.entity.Cliente;
import model.entity.ValidacaoFinal;
import model.validacao.ValidacaoCadastroTBS;
import model.validacao.ValidacaoEstadoPorta;
import model.validacao.ValidacaoRede;
import model.validacao.manobra.ValidacaoEstadoPortaManobra;
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

        if (new ValidacaoCadastroTBS(cl.getCadastro(), cl.getIncon()).validar()) {
            dslam = dao.getDslam(cl.getCadastro());
            met = (ConsultaMetalicoDefault) dslam;
            if (m.equals(Motivos.SEMAUTH) || m.equals(Motivos.SEMSINC)) {
                //cons. auth
                EstadoDaPorta ep = met.getEstadoDaPorta();
                ValidacaoEstadoPorta vEP = new ValidacaoEstadoPortaManobra(ep);
                if (ep.getAdminState().equalsIgnoreCase("UP")) {
                    if (met.getVlanBanda().validar(dslam)) {
                        ValidacaoRede vR = new ValidacaoRedeManobra(met.getTabelaRede(), m);    
                        v.setConclusao(vR.validar());
                        v.setFraseologia(vR.getMensagem());
                    } else {
                        v.setConclusao(Boolean.FALSE);
                        v.setFraseologia("Configuração da bridge de autenticação incorreta, refaça a validação após a correção.");
                    }
                } else {
                    v.setConclusao(Boolean.FALSE);
                    v.setFraseologia(vEP.getMensagem() + " Altere o Adm State da porta para Up e valide novamente.");
                }

            } else if (m.equals(Motivos.QUEDA) || m.equals(Motivos.SEMNAVEG)) {

            } else {
                v.setConclusao(Boolean.FALSE);
                v.setFraseologia("Motivo não implementado.");
            }
        } else {
            v.setConclusao(Boolean.FALSE);
            v.setFraseologia("Inconsistência no cadastro entre TBS x Radius");
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
