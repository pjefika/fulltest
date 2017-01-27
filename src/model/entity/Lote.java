/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

/**
 *
 * @author G0042204
 */
@Entity
public class Lote extends ComponenteGenerico {

    @OneToMany(mappedBy = "lote", fetch = FetchType.LAZY)
    private List<TesteCliente> tests;

    private String observacao;

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
}
