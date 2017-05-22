/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity.manobra;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import model.entity.AbstractEntity;
import model.entity.Cliente;
import model.facade.ValidaClienteManobraFacade;

/**
 *
 * @author G0042204
 */
@Entity
@Table(name = "MANOBRA_VALIDACAO")
public class ValidacaoManobra extends AbstractEntity {

    private String instancia, designador, modeloDslam;
    private BigInteger slot, porta, endSeqPorta;
    private String ipDslam, nomeArmario, nomeBras, mensagem, motivo, atividade, login;
    private Boolean resultado;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date inicio;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date fim;

    @Transient
    private Cliente c;

    public ValidacaoManobra() {
    }

    
    public ValidacaoManobra(ValidaClienteManobraFacade f) {
        if (f.getCl() != null) {
            c = f.getCl();
            GetInfoOut cad = c.getCadastro();
            this.instancia = c.getInstancia();
            this.designador = c.getDesignador();
            this.modeloDslam = cad.getInfoTBS().getDslamModel() + " " + cad.getInfoTBS().getDslamVendor();
            this.slot = cad.getInfoTBS().getSlot();
            this.porta = cad.getInfoTBS().getPortNumber();
            this.endSeqPorta = cad.getInfoTBS().getPortAddrSequence();
            this.ipDslam = cad.getInfoTBS().getIpDslam();
            this.nomeArmario = cad.getInfoRadius().getCabinet();
            this.nomeBras = cad.getInfoCricket().getIpGerenciaBRAS();
            this.mensagem = f.getConclusao().getFraseologia();
            this.motivo = f.getConclusao().getMotivo().getMotivo();
            this.resultado = f.getConclusao().getConclusao();
            this.atividade = f.getWorkOrderId();
            this.inicio = f.getInicio();
            this.fim = f.getFim();
            this.login = f.getLogin();
        }
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

    public String getModeloDslam() {
        return modeloDslam;
    }

    public void setModeloDslam(String modeloDslam) {
        this.modeloDslam = modeloDslam;
    }

    public BigInteger getSlot() {
        return slot;
    }

    public void setSlot(BigInteger slot) {
        this.slot = slot;
    }

    public BigInteger getPorta() {
        return porta;
    }

    public void setPorta(BigInteger porta) {
        this.porta = porta;
    }

    public BigInteger getEndSeqPorta() {
        return endSeqPorta;
    }

    public void setEndSeqPorta(BigInteger endSeqPorta) {
        this.endSeqPorta = endSeqPorta;
    }

    public String getIpDslam() {
        return ipDslam;
    }

    public void setIpDslam(String ipDslam) {
        this.ipDslam = ipDslam;
    }

    public String getNomeArmario() {
        return nomeArmario;
    }

    public void setNomeArmario(String nomeArmario) {
        this.nomeArmario = nomeArmario;
    }

    public String getNomeBras() {
        return nomeBras;
    }

    public void setNomeBras(String nomeBras) {
        this.nomeBras = nomeBras;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Boolean getResultado() {
        return resultado;
    }

    public void setResultado(Boolean resultado) {
        this.resultado = resultado;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFim() {
        return fim;
    }

    public void setFim(Date fim) {
        this.fim = fim;
    }

    public Cliente getC() {
        return c;
    }

    public void setC(Cliente c) {
        this.c = c;
    }
    
    
    

}
