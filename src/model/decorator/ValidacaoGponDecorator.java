/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.decorator;

import model.entity.ValidacaoGpon;

/**
 *
 * @author G0041775
 */
public class ValidacaoGponDecorator {

    private final ValidacaoGpon v;

    public ValidacaoGponDecorator() {
        this.v =  new ValidacaoGpon();
    }
     
    public ValidacaoGpon falhaCadastro(){
        v.setCadastro(Boolean.FALSE);
        return v;
    }
     
    public ValidacaoGpon falhaImplementacao(){
        v.setImplementacao(Boolean.FALSE);
        return v;
    }
     
    public ValidacaoGpon falhaConsulta(){
        v.setConsulta(Boolean.TRUE);
        return v;
    }
    
}
