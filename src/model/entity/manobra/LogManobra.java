/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity.manobra;

import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import model.entity.AbstractEntity;

/**
 *
 * @author G0042204
 */
@Entity
@Table(name = "FULLTESTAPI_MANOBRA")
public class LogManobra extends AbstractEntity {

    @NotNull(message = "Campo obrigatório")
    @Size(min = 1)
    private String instancia, designador, designadorAcesso, executor;

    @Lob
    private String customer;

    @Lob
    private String analises;

    private Boolean manobrar;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar datahora = Calendar.getInstance();

    public String getInstancia() {
        return instancia;
    }

    public void setInstancia(String instancia) {
        this.instancia = instancia;
    }

    public String getDesignador() {
        return designador;
    }

    public void setDesignador(String designador) {
        this.designador = designador;
    }

    public String getDesignadorAcesso() {
        return designadorAcesso;
    }

    public void setDesignadorAcesso(String designadorAcesso) {
        this.designadorAcesso = designadorAcesso;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Calendar getDatahora() {
        return datahora;
    }

    public void setDatahora(Calendar datahora) {
        this.datahora = datahora;
    }

}
