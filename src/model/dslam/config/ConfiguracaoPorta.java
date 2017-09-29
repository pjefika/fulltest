/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.config;

import model.dslam.consulta.EstadoDaPorta;
import model.dslam.consulta.Profile;
import model.dslam.consulta.VlanBanda;
import model.dslam.consulta.VlanMulticast;
import model.dslam.consulta.VlanVod;
import model.dslam.consulta.VlanVoip;

/**
 *
 * @author G0042204
 */
public abstract class ConfiguracaoPorta {

    private EstadoDaPorta estadoPorta;

//    private Profile profile;
    
    private VlanBanda vlanBanda;
    
    private VlanVoip vlanVoip;
    
    private VlanVod vlanVod;
    
    private VlanMulticast vlanMulticast;

    public ConfiguracaoPorta() {
    }

    public EstadoDaPorta getEstadoPorta() {
        return estadoPorta;
    }

    public void setEstadoPorta(EstadoDaPorta estadoPorta) {
        this.estadoPorta = estadoPorta;
    }

//    public Profile getProfile() {
//        return profile;
//    }
//
//    public void setProfile(Profile profile) {
//        this.profile = profile;
//    }

    public VlanBanda getVlanBanda() {
        return vlanBanda;
    }

    public void setVlanBanda(VlanBanda vlanBanda) {
        this.vlanBanda = vlanBanda;
    }

    public VlanVoip getVlanVoip() {
        return vlanVoip;
    }

    public void setVlanVoip(VlanVoip vlanVoip) {
        this.vlanVoip = vlanVoip;
    }

    public VlanVod getVlanVod() {
        return vlanVod;
    }

    public void setVlanVod(VlanVod vlanVod) {
        this.vlanVod = vlanVod;
    }

    public VlanMulticast getVlanMulticast() {
        return vlanMulticast;
    }

    public void setVlanMulticast(VlanMulticast vlanMulticast) {
        this.vlanMulticast = vlanMulticast;
    }

}
