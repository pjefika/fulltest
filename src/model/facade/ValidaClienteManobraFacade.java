/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.facade;

import br.com.gvt.www.ResourceManagement.WorkforceManagement.WorkforceManagementReporting.workOrderReportingEntities.WorkOrder;
import dao.WorkOrderDAO;
import dao.cadastro.CadastroDAO;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import model.Motivos;
import model.dslam.AbstractDslam;
import model.dslam.consulta.EstadoDaPorta;
import model.dslam.consulta.metalico.ConsultaMetalicoDefault;
import model.dslam.factory.exception.DslamNaoImplException;
import model.dslam.factory.exception.FuncIndisponivelDslamException;
import model.dslam.factory.exception.WorkOrderInexException;
import model.entity.Cliente;
import model.entity.ValidacaoFinal;
import model.validacao.Validacao;
import model.validacao.ValidacaoAutenticacao;
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

    private transient WorkOrderDAO woDao = new WorkOrderDAO();

    private transient ConsultaMetalicoDefault met;

    private transient AbstractDslam dslam;

    private List<Validacao> valids;

    private ValidacaoFinal conclusao;

    private String workOrderId;

    public ValidaClienteManobraFacade(Cliente cl, Motivos m, String workOrderId) throws DslamNaoImplException, RemoteException {
        this.cl = dao.getCliente(cl);
        this.m = m;
        this.valids = new ArrayList<>();
        this.conclusao = new ValidacaoFinal();
        this.workOrderId = workOrderId;
    }

    public void validar() throws DslamNaoImplException, RemoteException, Exception, FuncIndisponivelDslamException {
        conclusao.setMotivo(m);
        WorkOrder workOrder = woDao.getWorkOrder(workOrderId);
        if (workOrder == null) {
            throw new WorkOrderInexException();
        }
        ValidacaoCadastroTBS vTbs = new ValidacaoCadastroTBS(cl.getCadastro(), cl.getIncon());
        if (vTbs.validar()) {
            try {
                dslam = dao.getDslam(cl.getCadastro());
                met = (ConsultaMetalicoDefault) dslam;
            } catch (Exception e) {
                throw new FuncIndisponivelDslamException();
            }
            if (m.equals(Motivos.SEMAUTH) || m.equals(Motivos.SEMSINC)) {
                ValidacaoAutenticacao vA = new ValidacaoAutenticacao(cl.getAuth(), workOrder, m);
                if (vA.validar()) {
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
                } else {
                    conclusao.setConclusao(vA.getResultado());
                    conclusao.setFraseologia(vA.getMensagem());
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

    public String getWorkOrderId() {
        return workOrderId;
    }

}
