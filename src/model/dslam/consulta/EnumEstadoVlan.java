/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.consulta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author G0041775
 */
public enum EnumEstadoVlan {
    
    UP("Ativo"),
    DOWN("Inativo"),
    FLOODINGPREVENTION("Flooding Prevention");

    private String estadoVlan;

    private EnumEstadoVlan(String estadoVlan) {
        this.estadoVlan = estadoVlan;
    }

    public String getEstadoVlan() {
        return estadoVlan;
    }

    public void setEstadoVlan(String estadoVlan) {
        this.estadoVlan = estadoVlan;
    }
    
    @Override
    public String toString() {
        return this.name();
    }

    public static List<String> toListString() {
        List<EnumEstadoVlan> lm = Arrays.asList(EnumEstadoVlan.values());
        List<String> l = new ArrayList<>();
        for (EnumEstadoVlan m : lm) {
            l.add(m.getEstadoVlan());
        }
        return l;
    }
    
    
}
