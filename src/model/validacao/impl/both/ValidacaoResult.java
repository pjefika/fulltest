/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.both;

/**
 *
 * @author G0042204
 */
public class ValidacaoResult {

    private String nome;

    private String mensagem;

    private Boolean resultado;

    private Boolean foiCorrigido;

    private Object result;

    public ValidacaoResult() {
    }

    public ValidacaoResult(String nome, String mensagem, Boolean resultado, Boolean foiCorrigido) {
        this.nome = nome;
        this.mensagem = mensagem;
        this.resultado = resultado;
        this.foiCorrigido = foiCorrigido;
    }

    public ValidacaoResult(String nome, String mensagem, Boolean resultado, Object result, Boolean foiCorrigido) {
        this.nome = nome;
        this.mensagem = mensagem;
        this.resultado = resultado;
        this.result = result;
        this.foiCorrigido = foiCorrigido;
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

    public Boolean getResultado() {
        return resultado;
    }

    public void setResultado(Boolean resultado) {
        this.resultado = resultado;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public Boolean getFoiCorrigido() {
        return foiCorrigido;
    }

    public void setFoiCorrigido(Boolean foiCorrigido) {
        this.foiCorrigido = foiCorrigido;
    }

}
