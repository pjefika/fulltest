/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional;

import br.net.gvt.efika.customer.EfikaCustomer;
import java.util.Calendar;
import java.util.List;
import model.entity.AbstractEntity;
import model.validacao.Validacao;

/**
 *
 * @author G0042204
 */
public class FullTest extends AbstractEntity {

    protected Boolean resultado;

    protected EfikaCustomer cl;

    protected List<Validacao> valids;

    protected Calendar dataInicio;

    protected Calendar dataFim;

    protected String mensagem;

    public FullTest() {
    }

    public Boolean getResultado() {
        return resultado;
    }

    public void setResultado(Boolean resultado) {
        this.resultado = resultado;
    }

    public EfikaCustomer getCl() {
        return cl;
    }

    public void setCl(EfikaCustomer cl) {
        this.cl = cl;
    }

    public List<Validacao> getValids() {
        return valids;
    }

    public void setValids(List<Validacao> valids) {
        this.valids = valids;
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
