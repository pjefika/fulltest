/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional.facade;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.fulltest.model.fulltest.ValidacaoResult;
import dao.dslam.factory.DslamDAOFactory;
import dao.dslam.impl.AbstractDslam;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import br.net.gvt.efika.fulltest.model.fulltest.FullTest;
import model.fulltest.operacional.FullTestAdapter;
import model.fulltest.operacional.strategy.ExecutionStrategy;
import model.fulltest.operacional.strategy.FactoryExecutionStrategy;
import model.validacao.impl.realtime.FactoryValidador;
import model.validacao.impl.realtime.Validator;

/**
 *
 * @author g0042204
 */
public abstract class FullTestGenericFacade extends FulltestExecution {

    private String owner;

    protected EfikaCustomer cl;

    private List<Validator> bateria;

    protected List<ValidacaoResult> valids;

    protected Calendar dataInicio;

    protected Calendar dataFim;

    protected String mensagem;

    protected Boolean resultado;

    protected AbstractDslam dslam;

    protected ExecutionStrategy exec;

    public FullTestGenericFacade(String owner) {
        this.owner = owner;
    }

    public FullTestGenericFacade() {
    }

    @Override
    void iniciar(EfikaCustomer e) throws Exception {
        this.cl = e;
        this.exec = FactoryExecutionStrategy.condicional();
        this.dataInicio = Calendar.getInstance();
        this.dslam = DslamDAOFactory.getInstance(this.cl.getRede());
        this.valids = new ArrayList<>();
    }

    @Override
    void encerrar() {
        dslam.desconectar();
        dataFim = Calendar.getInstance();
        this.encerramento();
    }

    @Override
    void validar() throws Exception {
        this.exec.action(this);
        for (ValidacaoResult valid : getValids()) {
            if (!valid.getResultado() && this.mensagem == null) {
                this.setResultado(Boolean.FALSE);
                this.setMensagem(valid.getMensagem());
            }
        }
    }

    public FullTest cast() {
        return FullTestAdapter.adapter(this);
    }

    @Override
    protected void encerramento() {

        if (mensagem == null) {
            mensagem = "Não foram identificados problemas de configuração. Se o problema/sintoma informado pelo cliente persiste, seguir o fluxo.";
        }

        if (resultado == null) {
            resultado = true;
        }
    }

    public EfikaCustomer getCl() {
        return cl;
    }

    public void setCl(EfikaCustomer cl) {
        this.cl = cl;
    }

    public List<Validator> getBateria() {
        if (bateria == null) {
            bateria = FactoryValidador.crm(this.dslam, this.cl);
        }
        return bateria;
    }

    public void setBateria(List<Validator> bateria) {
        this.bateria = bateria;
    }

    public List<ValidacaoResult> getValids() {
        if (valids == null) {
            valids = new ArrayList<>();
        }
        return valids;
    }

    public void setValids(List<ValidacaoResult> valids) {
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

    public ExecutionStrategy getExec() {
        return exec;
    }

    public void setExec(ExecutionStrategy exec) {
        this.exec = exec;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

}
