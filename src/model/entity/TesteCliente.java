/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import model.fulltest.validacao.tipo.ValidacaoGpon;

/**
 *
 * @author G0042204
 */
@Entity
@Table(name = "fulltestAPI_TesteCliente")
public class TesteCliente extends ComponenteGenerico {

    @ManyToOne
    private Lote lote;

    @OneToOne
    @MapsId
    private ValidacaoGpon valid;

    private String instancia;

    public TesteCliente() {
    }

    public TesteCliente(String instancia) {
        this.instancia = instancia;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    public String getInstancia() {
        return instancia;
    }

    public void setInstancia(String instancia) {
        this.instancia = instancia;
    }

    public ValidacaoGpon getValid() {
        return valid;
    }

    public void setValid(ValidacaoGpon valid) {
        this.valid = valid;
    }

}
