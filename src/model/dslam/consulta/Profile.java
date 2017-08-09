/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.consulta;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.impl.retorno.TratativaRetornoUtil;
import model.dslam.ValidavelAbs;
import model.dslam.velocidade.Velocidades;
import model.fulltest.validacao.Validavel;

/**
 *
 * @author G0041775
 */
public class Profile extends ValidavelAbs implements Validavel {

    private String profileUp;

    private String profileDown;

    private static final String NOME = "Profile";

    public Profile() {
        super(NOME);
    }

    public String getProfileUp() {
        return profileUp;
    }

    public void setProfileUp(String profileUp) {
        this.profileUp = profileUp;
    }

    public String getProfileDown() {
        return profileDown;
    }

    public void setProfileDown(String profileDown) {
        this.profileDown = profileDown;
    }

    @Override
    public Boolean validar(EfikaCustomer ec) {

        String leprofDown = TratativaRetornoUtil.numberFromString(this.profileDown).get(0);
        String leprofUp;
        leprofUp = TratativaRetornoUtil.numberFromString(this.profileUp).get(0);

        if (leprofUp.length() > 3 && !leprofUp.contains(".")) {
            Integer leFloat = new Integer(leprofUp) / 1000;
            leprofUp = leFloat.toString();
        }

        return (leprofDown.equals(velDown(ec)) && leprofUp.equals(velUp(ec)));
    }

    protected static String velDown(EfikaCustomer ec) {
        System.out.println("ec" + ec.getServicos().getVelDown());
        Velocidades velDown = Velocidades.valueOf("VEL_" + ec.getServicos().getVelDown());
        return velDown.getVel();
    }

    protected static String velUp(EfikaCustomer ec) {
        Velocidades velUp = Velocidades.valueOf("VEL_" + ec.getServicos().getVelUp());
        return velUp.getVel();
    }

}
