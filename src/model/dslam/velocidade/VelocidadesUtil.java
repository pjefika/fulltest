/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.velocidade;

import br.net.gvt.efika.customer.EfikaCustomer;

/**
 *
 * @author G0042204
 */
public class VelocidadesUtil {

    public static Velocidades obterDown(EfikaCustomer c) {
        return Velocidades.valueOf("VEL_" + c.getServicos().getVelDown());
    }

    public static Velocidades obterUp(EfikaCustomer c) {
        return Velocidades.valueOf("VEL_" + c.getServicos().getVelUp());
    }

}
