/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manobra.analitcs;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G0042204
 */
public class FinalizacaoManobraDTO {

    private List<AnaliseMotivoDTO> analises;

    private Boolean manobrar;

    private AnaliseMotivoDTO conclusao;

    public List<AnaliseMotivoDTO> getAnalises() {
        if(analises == null){
            analises = new ArrayList<>();
        } 
        return analises;
    }

    public void adicionarAnalise(AnaliseMotivoDTO am) {
        getAnalises().add(am);
    }

    public void setAnalises(List<AnaliseMotivoDTO> analises) {
        this.analises = analises;
    }

    public Boolean getManobrar() {
        return manobrar;
    }

    public void setManobrar(Boolean manobrar) {
        this.manobrar = manobrar;
    }

    public AnaliseMotivoDTO getConclusao() {
        return conclusao;
    }

    public void setConclusao(AnaliseMotivoDTO conclusao) {
        this.conclusao = conclusao;
    }

}
