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
public class AnaliseMotivoDTO {

    private MotivoManobraDTO motivo;

    private ConclusaoManobraDTO conclusao;

    public AnaliseMotivoDTO() {
    }

    public AnaliseMotivoDTO(AnaliseMotivo am) {
        if (am.getMotivo() != null) {
            this.motivo = am.getMotivo().dto();
        }
        this.conclusao = am.getConclusao().dto();
    }

    public AnaliseMotivoDTO(MotivoManobraDTO motivo, ConclusaoManobraDTO conclusao) {
        this.motivo = motivo;
        this.conclusao = conclusao;
    }

    public AnaliseMotivoDTO(MotivoManobraEnum motivo, ConclusaoManobraEnum conclusao) {
        this.motivo = motivo.dto();
        this.conclusao = conclusao.dto();
    }

    public MotivoManobraDTO getMotivo() {
        return motivo;
    }

    public void setMotivo(MotivoManobraDTO motivo) {
        this.motivo = motivo;
    }

    public ConclusaoManobraDTO getConclusao() {
        return conclusao;
    }

    public void setConclusao(ConclusaoManobraDTO conclusao) {
        this.conclusao = conclusao;
    }

}
