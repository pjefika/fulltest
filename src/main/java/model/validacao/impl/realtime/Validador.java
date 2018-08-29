/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.realtime;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.fulltest.exception.FuncIndisponivelDslamException;
import br.net.gvt.efika.fulltest.model.fulltest.ValidacaoResult;
import br.net.gvt.efika.fulltest.model.telecom.properties.ValidavelAbs;
import dao.FactoryDAO;
import dao.dslam.impl.AbstractDslam;
import dao.dslam.impl.ConsultaClienteInter;
import dao.log.ValidacaoEntityDAO;
import java.util.Locale;
import java.util.ResourceBundle;
import model.validacao.impl.both.Validacao;

/**
 *
 * @author G0042204
 */
public abstract class Validador extends ValidFlow implements Validator {

    private AbstractDslam dslam;

    protected Validacao valid;

    protected EfikaCustomer cust;

    protected ConsultaClienteInter consulta;

    protected ResourceBundle bundle;

    protected Locale locale;

    protected ValidacaoResult result;

    protected ValidacaoEntityDAO validDao = FactoryDAO.createValidacaoDAO();

    protected String nome;

    public Validador(AbstractDslam dslam, EfikaCustomer cust, Locale local) {
        this.dslam = dslam;
        this.cust = cust;
        this.locale = local;
        this.bundle = ResourceBundle.getBundle("messages", local);
    }

    @Override
    public ValidavelAbs getObject() {
        return valid.getObject();
    }

    @Override
    public ValidacaoResult validar() throws Exception {
        iniciar();
        this.valid = consultar();
        processar();
        result = new ValidacaoResult(valid.getNome(), valid.getMensagem(), valid.getResultado(), this.getObject(), null);
        return result;
    }

    @Override
    protected void iniciar() throws FuncIndisponivelDslamException {
        if (this.getDslam() instanceof ConsultaClienteInter) {
            this.consulta = (ConsultaClienteInter) this.getDslam();
        } else {
            throw new FuncIndisponivelDslamException();
        }
    }

    @Override
    public Boolean checar() {
        return valid.validar().getResultado();
    }

    @Override
    protected void processar() {
        checar();
    }

    protected ValidacaoResult finalizar(String mensagem, Boolean resultado) {
        result = new ValidacaoResult(valid.getNome(), valid.getNome(), valid.getResultado(), Boolean.FALSE);
        return result;
    }

    protected abstract Validacao consultar() throws Exception;

    public AbstractDslam getDslam() {
        return dslam;
    }

    public void setDslam(AbstractDslam dslam) {
        this.dslam = dslam;
    }

    public Validacao getValid() {
        return valid;
    }

    public void setValid(Validacao valid) {
        this.valid = valid;
    }

    public EfikaCustomer getCust() {
        return cust;
    }

    public void setCust(EfikaCustomer cust) {
        this.cust = cust;
    }

    public ValidacaoResult getResult() {
        return result;
    }

    public void setResult(ValidacaoResult result) {
        this.result = result;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
