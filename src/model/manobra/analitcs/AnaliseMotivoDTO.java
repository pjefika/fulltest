/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manobra.analitcs;

import model.manobra.MotivoManobraEnum;

/**
 *
 * @author G0042204
 */
public class AnaliseMotivoDTO {

    private MotivoManobraEnum motivo;

    private ConclusaoMotivo conclusao;

    public AnaliseMotivoDTO() {
    }

    public AnaliseMotivoDTO(MotivoManobraEnum motivo, ConclusaoMotivo conclusao) {
        this.motivo = motivo;
        this.conclusao = conclusao;
    }

    public MotivoManobraEnum getMotivo() {
        return motivo;
    }

    public void setMotivo(MotivoManobraEnum motivo) {
        this.motivo = motivo;
    }

    public ConclusaoMotivo getConclusao() {
        return conclusao;
    }

    public void setConclusao(ConclusaoMotivo conclusao) {
        this.conclusao = conclusao;
    }

}
