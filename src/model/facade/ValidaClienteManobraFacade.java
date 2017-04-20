/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.facade;

import dao.cadastro.CadastroDAO;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import model.Motivos;
import model.dslam.AbstractDslam;
import model.dslam.consulta.EstadoDaPorta;
import model.dslam.consulta.metalico.ConsultaMetalicoDefault;
import model.dslam.factory.exception.DslamNaoImplException;
import model.entity.Cliente;
import model.entity.ValidacaoFinal;
import model.validacao.Validacao;
import model.validacao.ValidacaoCadastroTBS;
import model.validacao.ValidacaoEstadoPorta;
import model.validacao.ValidacaoParametros;
import model.validacao.ValidacaoRede;
import model.validacao.ValidacaoVlanBanda;
import model.validacao.manobra.ValidacaoEstadoPortaManobra;
import model.validacao.manobra.ValidacaoParametrosManobra;
import model.validacao.manobra.ValidacaoRedeManobra;

/**
 *
 * @author G0042204
 */
public class ValidaClienteManobraFacade {

    private transient Cliente cl;

    private transient Motivos m;

    private transient CadastroDAO dao = new CadastroDAO();

    private transient ConsultaMetalicoDefault met;

    private transient AbstractDslam dslam;

    private List<Validacao> valids;

    private ValidacaoFinal conclusao;

    public ValidaClienteManobraFacade(Cliente cl, Motivos m) throws DslamNaoImplException, RemoteException {
        this.cl = dao.getCliente(cl);
        this.m = m;
        this.valids = new ArrayList<>();
        this.conclusao = new ValidacaoFinal();
    }

    public void validar() throws DslamNaoImplException, RemoteException, Exception {
        conclusao.setMotivo(m);
        ValidacaoCadastroTBS vTbs = new ValidacaoCadastroTBS(cl.getCadastro(), cl.getIncon());
        if (vTbs.validar()) {
            dslam = dao.getDslam(cl.getCadastro());
            met = (ConsultaMetalicoDefault) dslam;
            if (m.equals(Motivos.SEMAUTH) || m.equals(Motivos.SEMSINC)) {
                //cons. auth
                EstadoDaPorta ep = met.getEstadoDaPorta();
                ValidacaoEstadoPorta vEP = new ValidacaoEstadoPortaManobra(ep, m);
                valids.add(vEP);
                if (vEP.validar()) {
                    ValidacaoVlanBanda vlanValid = new ValidacaoVlanBanda(met.getVlanBanda(), dslam);
                    valids.add(vlanValid);

                    if (vlanValid.validar()) {
                        ValidacaoRede vR = new ValidacaoRedeManobra(met.getTabelaRede(), m);
                        valids.add(vR);

                        conclusao.setConclusao(vR.validar());
                        conclusao.setFraseologia(vR.getMensagem());
                    } else {
                        conclusao.setConclusao(vlanValid.getResultado());
                        conclusao.setFraseologia(vlanValid.getMensagem());
                    }
                } else {
                    conclusao.setConclusao(vEP.getResultado());
                    conclusao.setFraseologia(vEP.getMensagem());
                }

            } else if (m.equals(Motivos.QUEDA) || m.equals(Motivos.SEMNAVEG)) {
                ValidacaoRede vR = new ValidacaoRedeManobra(met.getTabelaRede(), m);
                valids.add(vR);

                conclusao.setConclusao(vR.validar());
                conclusao.setFraseologia(vR.getMensagem());
            } else if (m.equals(Motivos.SEMVEL)) {
                ValidacaoParametros vP = new ValidacaoParametrosManobra(met.getTabelaParametros(), dslam);
                valids.add(vP);

                if (!vP.validar()) {
                    ValidacaoRede vR = new ValidacaoRedeManobra(met.getTabelaRede(), m);
                    valids.add(vR);

                    conclusao.setConclusao(vR.validar());
                    conclusao.setFraseologia(vR.getMensagem());
                } else {
                    conclusao.setConclusao(vP.validar());
                    conclusao.setFraseologia(vP.getMensagem());
                }

            } else {
                conclusao.setConclusao(Boolean.FALSE);
                conclusao.setFraseologia("Motivo não implementado.");
            }
        } else {
            conclusao.setConclusao(vTbs.getResultado());
            conclusao.setFraseologia(vTbs.getMensagem());
        }
        dslam.desconectar();
    }

    public List<Validacao> getValids() {
        return valids;
    }

    public ValidacaoFinal getConclusao() {
        return conclusao;
    }

    public Cliente getCl() {
        return cl;
    }

    public Motivos getM() {
        return m;
    }

}
