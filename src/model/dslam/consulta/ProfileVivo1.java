/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.consulta;

import br.net.gvt.efika.customer.EfikaCustomer;
import model.dslam.velocidade.Velocidades;

public class ProfileVivo1 extends Profile {

    public ProfileVivo1() {
    }

    @Override
    public Boolean validar(EfikaCustomer ec) {
        return (new Double(getDown().getValor()).compareTo(new Double(Velocidades.find(ec.getServicos().getVelDown()).getValor())) >= 0
                && new Double(getUp().getValor()).compareTo(new Double(Velocidades.find(ec.getServicos().getVelUp()).getValor())) >= 0);
    }

}