/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

import br.net.gvt.efika.mongo.model.entity.AbstractMongoEntity;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import java.util.Calendar;
import model.log.AcaoEnum;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 *
 * @author G0034481
 */
@Entity("fulltest")
public class LogEntity extends AbstractMongoEntity {

//    @Id
//    @JsonSerialize(using = ToStringSerializer.class)
//    private ObjectId id;

    private Object entrada;

    private Object saida;

    private String executor;

    private AcaoEnum acao;

    private Calendar dataIn = Calendar.getInstance();

    private Calendar dataOut;

    public LogEntity() {
    }

    public Object getEntrada() {
        return entrada;
    }

    public void setEntrada(Object entrada) {
        this.entrada = entrada;
    }

    public Object getSaida() {
        return saida;
    }

    public void setSaida(Object saida) {
        dataOut = Calendar.getInstance();
        this.saida = saida;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public AcaoEnum getAcao() {
        return acao;
    }

    public void setAcao(AcaoEnum acao) {
        this.acao = acao;
    }

    public Calendar getDataIn() {
        return dataIn;
    }

    public void setDataIn(Calendar dataIn) {
        this.dataIn = dataIn;
    }

    public Calendar getDataOut() {
        return dataOut;
    }

    public void setDataOut(Calendar dataOut) {
        this.dataOut = dataOut;
    }

}
