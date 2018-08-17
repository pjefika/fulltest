/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional;

import br.net.gvt.efika.mongo.model.entity.AbstractMongoEntity;
import java.util.Calendar;
import org.mongodb.morphia.annotations.Entity;

/**
 *
 * @author G0042204
 */
@Entity("fulltest_temp")
public abstract class FullTestAbs extends AbstractMongoEntity {

    protected Boolean resultado;

//    @Temporal(javax.persistence.TemporalType.DATE)
    protected Calendar dataInicio;

//    @Temporal(javax.persistence.TemporalType.DATE)
    protected Calendar dataFim;

    protected String mensagem;

    public FullTestAbs() {
    }

    public FullTestAbs(Boolean resultado, Calendar dataInicio, Calendar dataFim, String mensagem) {
        this.resultado = resultado;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.mensagem = mensagem;
    }

    public Boolean getResultado() {
        return resultado;
    }

    public void setResultado(Boolean resultado) {
        this.resultado = resultado;
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

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

}
