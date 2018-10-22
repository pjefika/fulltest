/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity.manobra;
import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.mongo.model.entity.AbstractMongoEntity;
import java.util.Calendar;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import model.manobra.analitcs.ConclusaoManobraEnum;
import model.manobra.analitcs.FinalizacaoManobra;
import model.manobra.analitcs.MotivoManobraEnum;
import org.mongodb.morphia.annotations.Entity;

/**
 *
 * @author G0042204
 */
@Entity("manobra")
public class LogManobra extends AbstractMongoEntity {

    @NotNull(message = "Campo obrigatório")
    @Size(min = 1)
    private String instancia, designador, designadorAcesso, executor;

    protected EfikaCustomer customer;

    protected FinalizacaoManobra analises;

    private Boolean manobrar;

    private ConclusaoManobraEnum conclusao;

    private MotivoManobraEnum motivoSaida;

    private MotivoManobraEnum motivoEntrada;

    private Date datahora;

    public LogManobra() {
    }

    public LogManobra(EfikaCustomer c) {
        this.setInstancia(c.getInstancia());
        this.setDesignador(c.getDesignador());
        this.setDesignadorAcesso(c.getDesignadorAcesso());
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

    public EfikaCustomer getCustomer() {
        return customer;
    }

    public void setCustomer(EfikaCustomer customer) {
        this.customer = customer;
    }

    public FinalizacaoManobra getAnalises() {
        return analises;
    }

    public void setAnalises(FinalizacaoManobra analises) {
        this.analises = analises;
    }

    public MotivoManobraEnum getMotivoSaida() {
        return motivoSaida;
    }

    public void setMotivoSaida(MotivoManobraEnum motivoSaida) {
        this.motivoSaida = motivoSaida;
    }

    public Date getDatahora() {
        return datahora;
    }

    public void setDatahora(Date datahora) {
        this.datahora = datahora;
    }

}
