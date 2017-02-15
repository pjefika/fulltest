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
public class TesteCliente extends ComponenteGenerico {

    @ManyToOne(fetch = FetchType.EAGER)
    private Lote lote;

    @OneToMany(mappedBy = "teste", fetch = FetchType.EAGER)
    private List<ValidacaoGpon> valid;
    
    private Calendar dataInicio;
    
    private Calendar dataFim;

    @NotNull
    @Size(min=5)
    private String instancia;

    public TesteCliente() {
        this.valid = new ArrayList<>();
    }

    public TesteCliente(String instancia) {
        this.instancia = instancia;
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

    public List<ValidacaoGpon> getValid() {
        return valid;
    }

    public void setValid(List<ValidacaoGpon> valid) {
        this.valid = valid;
    }

}
