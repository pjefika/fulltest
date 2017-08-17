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
public class FinalizacaoManobraAdapter {

    public static FinalizacaoManobraDTO adapter(FinalizacaoManobra f) {

        FinalizacaoManobraDTO dto = new FinalizacaoManobraDTO();

        dto.setManobrar(f.getManobrar());
        f.getAnalises().forEach((t) -> {
            dto.adicionarAnalise(new AnaliseMotivoDTO(t.getMotivo(), t.getConclusao()));
        });

        dto.setConclusao(new AnaliseMotivoDTO(f.getConclusao()));

        return dto;
    }

}
