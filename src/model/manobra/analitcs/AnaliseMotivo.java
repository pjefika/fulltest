/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manobra.analitcs;

/**
 *
 * @author G0042204
 */
public class AnaliseMotivo {

    private MotivoManobraEnum motivo;

    private ConclusaoManobraEnum conclusao;

    public AnaliseMotivo() {
    }

    public AnaliseMotivo(MotivoManobraEnum motivo, ConclusaoManobraEnum conclusao) {
        this.motivo = motivo;
        this.conclusao = conclusao;
    }

    public MotivoManobraEnum getMotivo() {
        return motivo;
    }

    public void setMotivo(MotivoManobraEnum motivo) {
        this.motivo = motivo;
    }

    public ConclusaoManobraEnum getConclusao() {
        return conclusao;
    }

    public void setConclusao(ConclusaoManobraEnum conclusao) {
        this.conclusao = conclusao;
    }

}
