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
public class AnaliseMotivo {

    private MotivoManobraEnum motivo;

    private ConclusaoManobra conclusao;

    public AnaliseMotivo() {
    }

    public AnaliseMotivo(MotivoManobraEnum motivo, ConclusaoManobra conclusao) {
        this.motivo = motivo;
        this.conclusao = conclusao;
    }

    public MotivoManobraEnum getMotivo() {
        return motivo;
    }

    public void setMotivo(MotivoManobraEnum motivo) {
        this.motivo = motivo;
    }

    public ConclusaoManobra getConclusao() {
        return conclusao;
    }

    public void setConclusao(ConclusaoManobra conclusao) {
        this.conclusao = conclusao;
    }

}
