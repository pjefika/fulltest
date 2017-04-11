/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author G0042204
 */
@Entity
@Table(name = "fulltestAPI_TesteCliente")
public class TesteClienteGpon extends ComponenteGenerico {

    @ManyToOne
    private Lote lote;

    @NotNull
    @Size(min = 5)
    private String instancia;
    
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "teste")
    private List<ValidacaoGpon> valid;

    public List<ValidacaoGpon> getValid() {
        return valid;
    }

    public void setValid(ValidacaoGpon valid) {
        this.valid = (List<ValidacaoGpon>) valid;
    }

    public TesteClienteGpon() {
    }

    public TesteClienteGpon(String instancia) {
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
