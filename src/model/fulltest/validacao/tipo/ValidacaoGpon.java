/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.validacao.tipo;

import javax.persistence.Entity;
import model.entity.AbstractEntity;

/**
 *
 * @author G0041775
 */
@Entity
public class ValidacaoGpon extends AbstractEntity{
    
    private Boolean semAlarme;
    
    private Boolean aprovisionado;
    
    private Boolean parametros;
    
    private Boolean link;
    
    private Boolean admState;
    
    private Boolean vlanBanda;
    
    private Boolean vlanVoip;
    
    private Boolean vlanVod;
    
    private Boolean vlanMulticast;
    
    private Boolean profile;

    public Boolean getAprovisionado() {
        return aprovisionado;
    }

    public void setAprovisionado(Boolean aprovisionado) {
        this.aprovisionado = aprovisionado;
    }

    public Boolean getParametros() {
        return parametros;
    }

    public void setParametros(Boolean parametros) {
        this.parametros = parametros;
    }

    public Boolean getLink() {
        return link;
    }

    public void setLink(Boolean link) {
        this.link = link;
    }

    public Boolean getAdmState() {
        return admState;
    }

    public void setAdmState(Boolean admState) {
        this.admState = admState;
    }

    public Boolean getVlanBanda() {
        return vlanBanda;
    }

    public void setVlanBanda(Boolean vlanBanda) {
        this.vlanBanda = vlanBanda;
    }

    public Boolean getVlanVoip() {
        return vlanVoip;
    }

    public void setVlanVoip(Boolean vlanVoip) {
        this.vlanVoip = vlanVoip;
    }

    public Boolean getVlanVod() {
        return vlanVod;
    }

    public void setVlanVod(Boolean vlanVod) {
        this.vlanVod = vlanVod;
    }

    public Boolean getVlanMulticast() {
        return vlanMulticast;
    }

    public void setVlanMulticast(Boolean vlanMulticast) {
        this.vlanMulticast = vlanMulticast;
    }

    public Boolean getProfile() {
        return profile;
    }

    public void setProfile(Boolean profile) {
        this.profile = profile;
    }

    public Boolean getSemAlarme() {
        return semAlarme;
    }

    public void setSemAlarme(Boolean semAlarme) {
        this.semAlarme = semAlarme;
    }
    
    

    
}
