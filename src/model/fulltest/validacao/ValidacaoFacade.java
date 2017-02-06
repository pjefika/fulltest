/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.validacao;

import model.dslam.AbstractDslam;
import model.dslam.consulta.ConsultaGponDefault;
import model.entity.ValidacaoGpon;

/**
 *
 * @author G0041775
 */
public class ValidacaoFacade {

    private ConsultaGponDefault gpon;

    private ValidacaoGpon valid;

    private AbstractDslam dslam;

    public ValidacaoFacade(AbstractDslam gpon) {
        this.gpon = (ConsultaGponDefault) gpon;
        this.dslam = gpon;
        this.valid = new ValidacaoGpon();
    }

    public ValidacaoGpon validar() throws Exception {

        this.valid.setAdmState(gpon.getEstadoDaPorta().validar(dslam));
        System.out.println("Estado da Porta: " + this.valid.getAdmState());

        this.valid.setProfile(gpon.getProfile().validar(dslam));
        System.out.println("Profile: " + this.valid.getProfile());

        this.valid.setParametros(gpon.getTabelaParametros().validar(dslam));
        System.out.println("Parametros: " + this.valid.getParametros());

        this.valid.setPotOlt(gpon.getTabelaParametros().getPotOlt());
        this.valid.setPotOnt(gpon.getTabelaParametros().getPotOnt());

        this.valid.setVlanBanda(gpon.getVlanBanda().validar(dslam));
        System.out.println("VlanBanda: " + this.valid.getVlanBanda());

        if (!dslam.getProd().getLinha().getTipo().equals("TDM/H248")) {
            this.valid.setVlanVoip(gpon.getVlanVoip().validar(dslam));
            System.out.println("VlanVoip: " + this.valid.getVlanVoip());
        }

        if (dslam.getProd().getTv().getTipo().equals("HIBRIDA")) {
            this.valid.setVlanVod(gpon.getVlanVod().validar(dslam));
            System.out.println("VlanVod: " + this.valid.getVlanVod());

            this.valid.setVlanMulticast(gpon.getVlanMulticast().validar(dslam));
            System.out.println("VlanMulticast: " + this.valid.getVlanMulticast());
        }

        this.valid.setSemAlarme(gpon.getAlarmes().validar(dslam));
        System.out.println("SemAlarme: " + this.valid.getSemAlarme());

        return null;
    }

}
