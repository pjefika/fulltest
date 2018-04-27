/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.both;

import br.net.gvt.efika.fulltest.exception.FuncIndisponivelDslamException;
import br.net.gvt.efika.fulltest.model.fulltest.ValidacaoResult;
import java.util.Locale;
import java.util.ResourceBundle;
import model.validacao.impl.realtime.Validator;

/**
 *
 * @author G0042204
 */
public abstract class Validacao implements Validator {

    private String nome;

    private String mensagem;

    private Boolean resultado;

    protected ResourceBundle bundle;

    public Validacao(String nome, Locale local) {
        this.nome = nome;
        this.bundle = ResourceBundle.getBundle("messages", local);
    }

    /**
     *
     * @return
     */
    @Override
    public ValidacaoResult validar() {
        try {
            iniciar();
            processar();
            return new ValidacaoResult(nome, mensagem, resultado, Boolean.FALSE);
        } catch (FuncIndisponivelDslamException e) {
            return new ValidacaoResult(nome, e.getMessage(), Boolean.TRUE, Boolean.FALSE);
        }
    }

    protected void processar() {
        if (checar()) {
            this.finalizar(frasePositiva(), Boolean.TRUE);
        } else {
            this.finalizar(fraseNegativa(), Boolean.FALSE);
        }
    }

    protected abstract String frasePositiva();

    protected abstract String fraseNegativa();

    protected void iniciar() throws FuncIndisponivelDslamException {
    }

    protected void finalizar(String msg, Boolean result) {
        this.mensagem = msg;
        this.resultado = result;
    }

    public abstract Boolean checar();

    public void merge(Validacao v) {
        this.setNome(v.getNome());
        this.finalizar(v.getMensagem(), v.getResultado());
    }

    public void setResultado(Boolean resultado) {
        this.resultado = resultado;
    }

    public Boolean getResultado() {
        return resultado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

}
