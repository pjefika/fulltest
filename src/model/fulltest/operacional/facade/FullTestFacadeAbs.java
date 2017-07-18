/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional.facade;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.factory.DslamDAOFactory;
import dao.dslam.factory.exception.DslamNaoImplException;
import dao.dslam.impl.AbstractDslam;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import model.fulltest.operacional.strategy.CondicionalStrategy;
import model.fulltest.operacional.strategy.ExecutionStrategy;
import model.fulltest.operacional.strategy.FactoryExecutionStrategy;
import model.fulltest.validacao.factory.FactoryValidacao;
import model.validacao.Validacao;

/**
 *
 * @author g0042204
 */
public abstract class FullTestFacadeAbs {

    protected EfikaCustomer cl;

    private List<Validacao> bateria;

    protected List<Validacao> valids;

    protected Calendar dataInicio;

    protected Calendar dataFim;

    protected String mensagem;

    protected Boolean resultado;

    protected AbstractDslam dslam;

    private ExecutionStrategy exec;

    public FullTestFacadeAbs() {
    }

    public void exec(EfikaCustomer cl) throws DslamNaoImplException {
        this.cl = cl;
        this.exec = FactoryExecutionStrategy.condicional();
        this.dslam = DslamDAOFactory.getInstance(cl.getRede());
        this.bateria = FactoryValidacao.crm(dslam, cl);
        this.valids = new ArrayList<>();
        this.dataInicio = Calendar.getInstance();
        this.exec.action(this);
    }

    public void finalizar() {
        dslam.desconectar();
        dataFim = Calendar.getInstance();
        this.tratativaMensagemEncerramento();
    }

    protected void tratativaMensagemEncerramento() {
        if (mensagem == null) {
            mensagem = "Não foram identificados problemas de configuração. Se o problema/sintoma informado pelo cliente persiste, seguir o fluxo.";
        }
    }

    public EfikaCustomer getCl() {
        return cl;
    }

    public void setCl(EfikaCustomer cl) {
        this.cl = cl;
    }

    public List<Validacao> getBateria() {
        return bateria;
    }

    public void setBateria(List<Validacao> bateria) {
        this.bateria = bateria;
    }

    public List<Validacao> getValids() {
        return valids;
    }

    public void setValids(List<Validacao> valids) {
        this.valids = valids;
    }

    public Calendar getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Calendar dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Calendar getDataFim() {
        return dataFim;
    }

    public void setDataFim(Calendar dataFim) {
        this.dataFim = dataFim;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Boolean getResultado() {
        return resultado;
    }

    public void setResultado(Boolean resultado) {
        this.resultado = resultado;
    }

    public AbstractDslam getDslam() {
        return dslam;
    }

    public void setDslam(AbstractDslam dslam) {
        this.dslam = dslam;
    }

}
