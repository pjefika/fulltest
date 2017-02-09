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

        try {
            this.valid.setAdmState(gpon.getEstadoDaPorta().validar(dslam));
            System.out.println("Estado da Porta: " + this.valid.getAdmState());    
        } catch (Exception e) {
            Thread.sleep(5000);
            this.valid.setAdmState(gpon.getEstadoDaPorta().validar(dslam));
            System.out.println("No Catch-> Estado da Porta: " + this.valid.getAdmState());    
        }
        
        try {
            this.valid.setProfile(gpon.getProfile().validar(dslam));
            System.out.println("Profile: " + this.valid.getProfile());    
        } catch (Exception e) {
            Thread.sleep(5000);
            this.valid.setProfile(gpon.getProfile().validar(dslam));
            System.out.println("No Catch-> Profile: " + this.valid.getProfile());
        }
        
        try {
            this.valid.setParametros(gpon.getTabelaParametros().validar(dslam));
            this.valid.setPotOlt(gpon.getTabelaParametros().getPotOlt());
            this.valid.setPotOnt(gpon.getTabelaParametros().getPotOnt());
            System.out.println("Parametros: " + this.valid.getParametros());
        } catch (Exception e) {
            Thread.sleep(5000);
            this.valid.setParametros(gpon.getTabelaParametros().validar(dslam));
            this.valid.setPotOlt(gpon.getTabelaParametros().getPotOlt());
            this.valid.setPotOnt(gpon.getTabelaParametros().getPotOnt());
            System.out.println("No Catch-> Parametros: " + this.valid.getParametros());
        }
        
        try {
            this.valid.setVlanBanda(gpon.getVlanBanda().validar(dslam));
            System.out.println("VlanBanda: " + this.valid.getVlanBanda());
        } catch (Exception e) {
            Thread.sleep(5000);
            this.valid.setVlanBanda(gpon.getVlanBanda().validar(dslam));
            System.out.println("No Catch-> VlanBanda: " + this.valid.getVlanBanda());
        }
        

        if (!dslam.getProd().getLinha().getTipo().equals("TDM/H248")) {
            try {
                this.valid.setVlanVoip(gpon.getVlanVoip().validar(dslam));
                System.out.println("VlanVoip: " + this.valid.getVlanVoip());
            } catch (Exception e) {
                Thread.sleep(5000);
                this.valid.setVlanVoip(gpon.getVlanVoip().validar(dslam));
                System.out.println("No Catch-> VlanVoip: " + this.valid.getVlanVoip());
            }
            
        }
        
        if(dslam.getProd().getTv().getTipo() != null){
            if (dslam.getProd().getTv().getTipo().contains("HIBRIDA")) {
                try {
                    this.valid.setVlanVod(gpon.getVlanVod().validar(dslam));
                    System.out.println("VlanVod: " + this.valid.getVlanVod());
                    this.valid.setVlanMulticast(gpon.getVlanMulticast().validar(dslam));
                    System.out.println("VlanMulticast: " + this.valid.getVlanMulticast());
                } catch (Exception e) {
                    Thread.sleep(5000);
                    this.valid.setVlanVod(gpon.getVlanVod().validar(dslam));
                    System.out.println("No Catch-> VlanVod: " + this.valid.getVlanVod());
                    this.valid.setVlanMulticast(gpon.getVlanMulticast().validar(dslam));
                    System.out.println("No Catch-> VlanMulticast: " + this.valid.getVlanMulticast());
                    
                }
        
            }    
        }
        try {
            this.valid.setSemAlarme(gpon.getAlarmes().validar(dslam));
            this.valid.setListaAlarmes(gpon.getAlarmes().getListAlarmes().toString());

            System.out.println("SemAlarme: " + this.valid.getSemAlarme());
        } catch (Exception e) {
            Thread.sleep(5000);
            this.valid.setSemAlarme(gpon.getAlarmes().validar(dslam));
            this.valid.setListaAlarmes(gpon.getAlarmes().getListAlarmes().toString());

            System.out.println("SemAlarme: " + this.valid.getSemAlarme());
        }
       

        return valid;
    }

}
