/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.facade;

import br.com.gvt.www.ResourceManagement.WorkforceManagement.WorkforceManagementReporting.workOrderReportingEntities.WorkOrder;
import dao.WorkOrderDAO;
import dao.cadastro.CadastroDAO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Motivos;
import model.dslam.AbstractDslam;
import model.dslam.consulta.metalico.ConsultaMetalicoDefault;
import model.dslam.factory.exception.CadastroITException;
import model.dslam.factory.exception.WorkOrderInexException;
import model.entity.Cliente;
import model.entity.ValidacaoFinal;
import model.validacao.Validacao;
import model.validacao.ValidacaoCadastroTBS;

/**
 *
 * @author G0042204
 */
public abstract class ValidaClienteManobraFacade {

    protected Cliente cl;

    protected Motivos m;

    protected transient CadastroDAO dao;

    protected transient WorkOrderDAO woDao;
    
    protected transient ConsultaMetalicoDefault met;

    protected transient AbstractDslam dslam;

    protected List<Validacao> valids;

    protected ValidacaoFinal conclusao;

    protected String workOrderId;

    protected String login;

    protected Date inicio, fim;

    protected transient WorkOrder workOrder;

    public ValidaClienteManobraFacade(Cliente cl, Motivos m, String workOrderId) {
        this.m = m;
        this.workOrderId = workOrderId;
        this.cl = cl;
    }

    public void validar() throws Exception {
        this.iniciar();
        this.cl = dao.getCliente(cl);
        conclusao.setMotivo(m);
        this.workOrder = woDao.getWorkOrder(workOrderId);
        if (workOrder == null) {
            throw new WorkOrderInexException();
        }
        ValidacaoCadastroTBS vTbs = new ValidacaoCadastroTBS(cl.getCadastro(), cl.getIncon());
        if (!vTbs.validar()) {
            throw new CadastroITException();
        }
        dslam = dao.getDslam(cl.getCadastro());
        met = (ConsultaMetalicoDefault) dslam;
    }

    public void iniciar() {
        dao = new CadastroDAO();
        woDao = new WorkOrderDAO();
        valids = new ArrayList<>();
        conclusao = new ValidacaoFinal();
        inicio = Calendar.getInstance().getTime();
    }

    public void finalizar() {
        try {
            dslam.desconectar();
        } catch (IOException ex) {
            Logger.getLogger(ValidaClienteManobraFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.fim = Calendar.getInstance().getTime();
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Date getInicio() {
        return inicio;
    }

    public Date getFim() {
        return fim;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public void setFim(Date fim) {
        this.fim = fim;
    }

    public CadastroDAO getDao() {
        return dao;
    }

    public void setDao(CadastroDAO dao) {
        this.dao = dao;
    }

    public WorkOrderDAO getWoDao() {
        return woDao;
    }

    public void setWoDao(WorkOrderDAO woDao) {
        this.woDao = woDao;
    }

    public ConsultaMetalicoDefault getMet() {
        return met;
    }

    public void setMet(ConsultaMetalicoDefault met) {
        this.met = met;
    }

    public AbstractDslam getDslam() {
        return dslam;
    }

    public void setDslam(AbstractDslam dslam) {
        this.dslam = dslam;
    }

    public WorkOrder getWorkOrder() {
        return workOrder;
    }

    public void setWorkOrder(WorkOrder workOrder) {
        this.workOrder = workOrder;
    }

    public void setCl(Cliente cl) {
        this.cl = cl;
    }

    public void setM(Motivos m) {
        this.m = m;
    }

    public void setValids(List<Validacao> valids) {
        this.valids = valids;
    }

    public void setConclusao(ValidacaoFinal conclusao) {
        this.conclusao = conclusao;
    }

    public void setWorkOrderId(String workOrderId) {
        this.workOrderId = workOrderId;
    }

}
