/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

import model.manobra.analitcs.MotivoManobraEnum;

/**
 *
 * @author G0041775
 */
public class ValidacaoFinal {

    private Boolean conclusao;

    private String fraseologia;
    
    private MotivoManobraEnum motivo;

    public MotivoManobraEnum getMotivo() {
        return motivo;
    }

    public void setMotivo(MotivoManobraEnum m) {
        this.motivo = m;
    }

    public Boolean getConclusao() {
        return conclusao;
    }

    public void setConclusao(Boolean conclusao) {
        this.conclusao = conclusao;
    }

    public String getFraseologia() {
        return fraseologia;
    }

    public void setFraseologia(String fraseologia) {
        this.fraseologia = fraseologia;
    }

}
