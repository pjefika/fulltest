/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.in;

import br.net.gvt.efika.customer.EfikaCustomer;
import model.dslam.consulta.EstadoDaPorta;
import model.dslam.consulta.Profile;
import model.log.AcaoEnum;
import model.log.LogIn;

/**
 *
 * @author G0042204
 */
public class SetProfileIn extends LogIn {

    private EfikaCustomer cust;

    private Profile profile;

    @Override
    public EfikaCustomer input() {
        return cust;
    }

    @Override
    public AcaoEnum acao() {
        return AcaoEnum.SET_PROFILE;
    }

    public EfikaCustomer getCust() {
        return cust;
    }

    public void setCust(EfikaCustomer cust) {
        this.cust = cust;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

}
