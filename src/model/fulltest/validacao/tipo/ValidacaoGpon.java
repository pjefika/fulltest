/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.validacao.tipo;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import model.entity.AbstractEntity;
import model.entity.TesteCliente;

/**
 *
 * @author G0041775
 */
@Entity
@Table(name = "fulltestAPI_ValidacaoGpon")
public class ValidacaoGpon extends AbstractEntity {

    @ManyToOne
    private TesteCliente teste;

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

    private Double potOnt;

    private Double potOlt;

    public ValidacaoGpon() {
    }

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

    public Double getPotOlt() {
        return potOlt;
    }

    public void setPotOlt(Double potOlt) {
        this.potOlt = potOlt;
    }

    public Double getPotOnt() {
        return potOnt;
    }

    public void setPotOnt(Double potOnt) {
        this.potOnt = potOnt;
    }

    public TesteCliente getTeste() {
        return teste;
    }

    public void setTeste(TesteCliente teste) {
        this.teste = teste;
    }
}
