/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity.manobra;

import br.net.gvt.efika.customer.EfikaCustomer;
import java.util.Calendar;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import static javax.persistence.FetchType.LAZY;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import model.entity.AbstractEntity;
import model.manobra.analitcs.ConclusaoManobraEnum;
import model.manobra.analitcs.MotivoManobraEnum;

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
    @Basic(fetch = LAZY)
    @Column(columnDefinition = "LONGVARCHAR")
    protected String customer;

    @Lob
    @Basic(fetch = LAZY)
    @Column(columnDefinition = "LONGVARCHAR")
    protected String analises;

    private Boolean manobrar;

    @Enumerated(EnumType.STRING)
    private ConclusaoManobraEnum conclusao;

    @Enumerated(EnumType.STRING)
    private MotivoManobraEnum motivoSaida;

    @Enumerated(EnumType.STRING)
    private MotivoManobraEnum motivoEntrada;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar datahora = Calendar.getInstance();

    public LogManobra() {
    }

    public LogManobra(EfikaCustomer c) {
        this.setInstancia(c.getInstancia());
        this.setDesignador(c.getDesignador());
        this.setDesignadorAcesso(c.getDesignadorAcesso());
    }

    public String getAnalises() {
        return analises;
    }

    public void setAnalises(String analises) {
        this.analises = analises;
    }

    public Boolean getManobrar() {
        return manobrar;
    }

    public void setManobrar(Boolean manobrar) {
        this.manobrar = manobrar;
    }

    public ConclusaoManobraEnum getConclusao() {
        return conclusao;
    }

    public void setConclusao(ConclusaoManobraEnum conclusao) {
        this.conclusao = conclusao;
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

    public MotivoManobraEnum getMotivo() {
        return motivoSaida;
    }

    public void setMotivo(MotivoManobraEnum motivo) {
        this.motivoSaida = motivo;
    }

    public MotivoManobraEnum getMotivoEntrada() {
        return motivoEntrada;
    }

    public void setMotivoEntrada(MotivoManobraEnum motivoEntrada) {
        this.motivoEntrada = motivoEntrada;
    }

}
