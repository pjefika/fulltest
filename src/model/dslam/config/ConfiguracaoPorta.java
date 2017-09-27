/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.config;

import java.util.List;
import model.dslam.consulta.EstadoDaPorta;
import model.dslam.consulta.Profile;
import model.dslam.consulta.VlanAbstract;

/**
 *
 * @author G0042204
 */
public abstract class ConfiguracaoPorta {

    private EstadoDaPorta estadoPorta;

    private Profile profile;

    private List<VlanAbstract> vlans;

    public ConfiguracaoPorta() {
    }

    public EstadoDaPorta getEstadoPorta() {
        return estadoPorta;
    }

    public void setEstadoPorta(EstadoDaPorta estadoPorta) {
        this.estadoPorta = estadoPorta;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public List<VlanAbstract> getVlans() {
        return vlans;
    }

    public void setVlans(List<VlanAbstract> vlans) {
        this.vlans = vlans;
    }

}
