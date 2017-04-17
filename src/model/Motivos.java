/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author G0034481
 */
public enum Motivos {

    SEMSINC("Sem sincronismo"),
    SEMAUTH("Sem autenticação"),
    MUDA("Porta muda");

    private String motivo;

    private Motivos(String m) {
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
        List<Motivos> lm = Arrays.asList(Motivos.values());
        List<String> l = new ArrayList<>();
        for (Motivos m : lm) {
            l.add(m.getMotivo());
        }
        return l;
    }
}
