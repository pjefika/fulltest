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
public class MotivoManobraDTO {

    private MotivoManobraEnum name;

    private String motivo;

    public MotivoManobraDTO(MotivoManobraEnum name) {
        this.name = name;
        this.motivo = name.getMotivo();
    }

    public MotivoManobraEnum getName() {
        return name;
    }

    public void setName(MotivoManobraEnum name) {
        this.name = name;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

}
