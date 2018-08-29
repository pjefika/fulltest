/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import br.net.gvt.efika.fulltest.model.fulltest.FullTestAbs;

/**
 *
 * @author G0042204
 */
@Entity
@Table(name = "FULLTESTAPI_FULLTEST")
public class FulltestGenericEntity extends FullTestAbs {

    @Lob
    @Column(length = 255555)
    private String customer;

    @Lob
    @Column(length = 255555)
    private String valids;

    public FulltestGenericEntity() {
    }

    public FulltestGenericEntity(String customer, String valids, Boolean resultado, Calendar dataInicio, Calendar dataFim, String mensagem) {
        super(resultado, dataInicio, dataFim, mensagem);
        this.customer = customer;
        this.valids = valids;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getValids() {
        return valids;
    }

    public void setValids(String valids) {
        this.valids = valids;
    }

}
