/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.velocidade;

/**
 *
 * @author G0041775
 */
public enum Modulacoes {
    ADSL("15360"),
    VDSL("51200"),
    AUTO_NEGOTIATE("5120");

    private final String valor;

    private Modulacoes(String vel) {
        valor = vel;
    }

    public String getValor() {
        return valor;
    }

    public static Modulacoes find(Long vel) {
        for (Modulacoes value : Modulacoes.values()) {
            if(vel.compareTo(new Long(value.valor))<=0){
                return value;
            }
        }
        return null;
    }
    

}
