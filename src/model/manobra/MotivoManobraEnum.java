/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manobra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author G0034481
 */
public enum MotivoManobraEnum {

    AUTH_SINC("Sem Autenticação/Sincronismo"),
    MUDA("Linha Muda"),
    QUEDA("Quedas"),
    SEMNAVEG("Não Navega"),
    NAO_ATINGE("Não Atinge Velocidade");

    private String motivo;

    private MotivoManobraEnum(String m) {
        this.motivo = m;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    @Override
    public String toString() {
        return this.name();
    }

    public static List<String> toListString() {
        List<MotivoManobraEnum> lm = Arrays.asList(MotivoManobraEnum.values());
        List<String> l = new ArrayList<>();
        for (MotivoManobraEnum m : lm) {
            l.add(m.getMotivo());
        }
        return l;
    }
}
