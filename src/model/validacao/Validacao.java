/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao;

/**
 *
 * @author G0042204
 */
public abstract class Validacao implements Validator {

    protected String nome;

    private String mensagem;

    private Boolean resultado;

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
