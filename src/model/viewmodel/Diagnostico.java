/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.viewmodel;

/**
 *
 * @author G0042204
 */
public class Diagnostico {

    private String nome;

    private Boolean resultado;

    public Diagnostico(String nome, Boolean resultado) {
        this.nome = nome;
        this.resultado = resultado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getResultado() {
        return resultado;
    }

    public void setResultado(Boolean resultado) {
        this.resultado = resultado;
    }

}
