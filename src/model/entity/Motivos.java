/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

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

    private String motivos;

    private Motivos(String m) {
        this.motivos = m;
    }

    public String getMotivos() {
        return motivos;
    }

    public void setMotivos(String motivos) {
        this.motivos = motivos;
    }

    @Override
    public String toString() {
        return this.name();
    }

    public static List<String> toListString() {
        List<Motivos> lm = Arrays.asList(Motivos.values());
        List<String> l = new ArrayList<>();
        for (Motivos m : lm) {
            l.add(m.getMotivos());
        }
        return l;
    }
}
