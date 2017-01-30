/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

import javax.persistence.ManyToOne;
import model.dslam.AbstractDslam;

public class TesteCliente extends ComponenteGenerico {

    @ManyToOne
    public Lote lote;

    public String instancia;

    public AbstractDslam dadosDslam;

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

}
