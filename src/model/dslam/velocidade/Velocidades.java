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
public enum Velocidades {
    VEL_307200("300"),
    VEL_204800("200"),
    VEL_153600("150"),
    VEL_102400("100"),
    VEL_76800("75"),
    VEL_51200("50"),
    VEL_35840("35"),
    VEL_25600("25"),
    VEL_15360("15"),
    VEL_12800("12.5"),
    VEL_10240("10"),
    VEL_7680("7.5"),
    VEL_5120("5"),
    VEL_3072("3"),
    VEL_2048("2"),
    VEL_1024("1");

    private final String valor;
    
    private Velocidades(String vel) {
        valor = vel;
    }
    
    public String getVel(){
        return valor;
    }
    
}
