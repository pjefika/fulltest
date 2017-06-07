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
public enum ValidEnum {
    
    ESTADO_PORTA_ADM("Estado Administrativo da Porta", "Retorna verdadeiro se estado = UP"), 
    ESTADO_PORTA_OPER("Estado Operacional da Porta", "Retorna verdadeiro se estado = UP");
    
    String nome, desc;

    private ValidEnum(String nome, String desc) {
        this.nome = nome;
        this.desc = desc;
    }

    public String getNome() {
        return nome;
    }

    public String getDesc() {
        return desc;
    }
    
    
    
}
