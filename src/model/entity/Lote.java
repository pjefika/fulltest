/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author G0042204
 */
@Entity
@Table(name = "fulltestAPI_Lote")
public class Lote extends ComponenteGenerico {

    @OneToMany(mappedBy = "lote", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<TesteCliente> tests;

    private String observacao;
    
    private Date dataCriacao;
    
    private String matricula;

    public Lote() {
        this.tests = new ArrayList<>();
    }

    public List<TesteCliente> getTests() {
        return tests;
    }

    public void setTests(List<TesteCliente> tests) {
        this.tests = tests;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }       
}
