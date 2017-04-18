/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.facade;

import br.com.caelum.vraptor.serialization.SkipSerialization;
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
import model.validacao.ValidacaoRede;
import model.validacao.ValidacaoVlanBanda;
import model.validacao.manobra.ValidacaoEstadoPortaManobra;
import model.validacao.manobra.ValidacaoRedeManobra;

/**
 *
 * @author G0042204
 */
public class ValidaClienteManobraFacade {

    @SkipSerialization
    private Cliente cl;

    @SkipSerialization
    private Motivos m;

    @SkipSerialization
    private CadastroDAO dao = new CadastroDAO();

    private ConsultaMetalicoDefault met;

    @SkipSerialization
    private AbstractDslam dslam;

    private List<Validacao> valids;

    private ValidacaoFinal conclusao;

    public ValidaClienteManobraFacade(Cliente cl, Motivos m) throws DslamNaoImplException, RemoteException {
        this.cl = dao.getCliente(cl);
        this.m = m;
        this.valids = new ArrayList<>();
        this.conclusao = new ValidacaoFinal();
    }

    public void validar() throws DslamNaoImplException, RemoteException, Exception {
        if (new ValidacaoCadastroTBS(cl.getCadastro(), cl.getIncon()).validar()) {
            dslam = dao.getDslam(cl.getCadastro());
            met = (ConsultaMetalicoDefault) dslam;
            if (m.equals(Motivos.SEMAUTH) || m.equals(Motivos.SEMSINC)) {
                //cons. auth
                EstadoDaPorta ep = met.getEstadoDaPorta();
                ValidacaoEstadoPorta vEP = new ValidacaoEstadoPortaManobra(ep);
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
                        conclusao.setConclusao(Boolean.FALSE);
                        conclusao.setFraseologia("Configuração da bridge de autenticação incorreta, refaça a validação após a correção.");
                    }
                } else {
                    conclusao.setConclusao(Boolean.FALSE);
                    conclusao.setFraseologia(vEP.getMensagem() + " Altere o Adm State da porta para Up e valide novamente.");
                }

            } else if (m.equals(Motivos.QUEDA) || m.equals(Motivos.SEMNAVEG)) {

            } else {
                conclusao.setConclusao(Boolean.FALSE);
                conclusao.setFraseologia("Motivo não implementado.");
            }
        } else {
            conclusao.setConclusao(Boolean.FALSE);
            conclusao.setFraseologia("Inconsistência no cadastro entre TBS x Radius");
        }
    }

    public List<Validacao> getValids() {
        return valids;
    }

}
