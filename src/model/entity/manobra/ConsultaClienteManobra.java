/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity.manobra;

import java.util.Calendar;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import model.entity.AbstractEntity;
import model.facade.ConsultaClienteFacade;

/**
 *
 * @author G0042204
 */
@Entity
@Table(name = "MANOBRA_CONSULTA")
public class ConsultaClienteManobra extends AbstractEntity {

    private String instancia, designador, login;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dataConsulta;

    public ConsultaClienteManobra() {
        this.dataConsulta = Calendar.getInstance().getTime();
    }

    public ConsultaClienteManobra(ConsultaClienteFacade c) {
        this.instancia = c.getCl().getInstancia();
        this.designador = c.getCl().getDesignador();
        this.dataConsulta = Calendar.getInstance().getTime();
    }

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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Date getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(Date dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

}
