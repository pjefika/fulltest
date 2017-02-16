/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import model.viewmodel.Diagnostico;

/**
 *
 * @author G0041775
 */
@Entity
@Table(name = "fulltestAPI_ValidacaoGpon")
public class ValidacaoGpon extends AbstractEntity {

    @ManyToOne(fetch = FetchType.EAGER)
    private TesteCliente teste;

    /**
     * Atributos normais
     */
    private Double potOnt;

    private Double potOlt;

    private String listaAlarmes;

    private String ontAssociado;

    /**
     * Atributos normais
     */
    private Boolean implementacao;

    private Boolean consulta;

    private Boolean cadastro;

    private Boolean semAlarme;

    private Boolean parametros;

    private Boolean portState;

    private Boolean vlanBanda;

    private Boolean vlanVoip;

    private Boolean vlanVod;

    private Boolean vlanMulticast;

    private Boolean profile;
    
    private Calendar dataInicio;
    
    private Calendar dataFim;

    private Boolean reteste = false;

    public ValidacaoGpon() {
    }

    public List<Diagnostico> getDiagnosticoList() {
        List<Diagnostico> a = new ArrayList<>();

        a.add(new Diagnostico("Implementacao", implementacao));
        a.add(new Diagnostico("Consulta", consulta));
        a.add(new Diagnostico("Cadastro", cadastro));
        a.add(new Diagnostico("Sem Alarme", semAlarme));
        a.add(new Diagnostico("Parâmetros", parametros));
        a.add(new Diagnostico("portState", portState));
        a.add(new Diagnostico("vlanBanda", vlanBanda));
        a.add(new Diagnostico("vlanVoip", vlanVoip));
        a.add(new Diagnostico("vlanVod", vlanVod));
        a.add(new Diagnostico("vlanMulticast", vlanMulticast));
        a.add(new Diagnostico("profile", profile));

        return a;
    }

    public Calendar getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Calendar dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Calendar getDataFim() {
        return dataFim;
    }

    public void setDataFim(Calendar dataFim) {
        this.dataFim = dataFim;
    }

    public Boolean getReteste() {
        return reteste;
    }

    public void setReteste(Boolean reteste) {
        this.reteste = reteste;
    }

    public String getOntAssociado() {
        return ontAssociado;
    }

    public void setOntAssociado(String ontAssociado) {
        this.ontAssociado = ontAssociado;
    }

    public Boolean getParametros() {
        return parametros;
    }

    public void setParametros(Boolean parametros) {
        this.parametros = parametros;
    }

    public Boolean getPortState() {
        return portState;
    }

    public void setPortState(Boolean portState) {
        this.portState = portState;
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

    public Boolean getImplementacao() {
        return implementacao.booleanValue();
    }

    public void setImplementacao(Boolean implementacao) {
        this.implementacao = implementacao;
    }

    public Boolean getCadastro() {
        return cadastro;
    }

    public void setCadastro(Boolean cadastro) {
        this.cadastro = cadastro;
    }

    public Boolean getConsulta() {
        return consulta;
    }

    public void setConsulta(Boolean consulta) {
        this.consulta = consulta;
    }

    public String getListaAlarmes() {
        return listaAlarmes;
    }

    public void setListaAlarmes(String listaAlarmes) {
        this.listaAlarmes = listaAlarmes;
    }

}
