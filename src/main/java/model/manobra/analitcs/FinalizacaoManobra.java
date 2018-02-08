/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manobra.analitcs;

import java.util.List;

/**
 *
 * @author G0042204
 */
public class FinalizacaoManobra {

    private List<AnaliseMotivo> analises;

    private Boolean manobrar;

    private AnaliseMotivo conclusao;
    
    public FinalizacaoManobra() {
    }

    public List<AnaliseMotivo> getAnalises() {
        return analises;
    }

    public void setAnalises(List<AnaliseMotivo> analises) {
        this.analises = analises;
    }

    public Boolean getManobrar() {
        return manobrar;
    }

    public void setManobrar(Boolean manobrar) {
        this.manobrar = manobrar;
    }

    public AnaliseMotivo getConclusao() {
        return conclusao;
    }

    public void setConclusao(AnaliseMotivo conclusao) {
        this.conclusao = conclusao;
    }

}
