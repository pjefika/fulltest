/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.consulta.metalico;

import br.net.gvt.efika.customer.EfikaCustomer;
import model.dslam.consulta.Validavel;
import model.dslam.consulta.ValidavelAbs;
import model.dslam.velocidade.Modulacoes;

/**
 *
 * @author G0041775
 */
public class Modulacao extends ValidavelAbs implements Validavel {

    private String modulacao;

    private Modulacoes modulEnum;

    public Modulacao() {
        super("Modulação");
    }

    public String getModulacao() {
        return modulacao;
    }

    public void setModulacao(String modulacao) {
        this.modulacao = modulacao;
    }

    public Modulacoes getModulEnum() {
        return modulEnum;
    }

    public void setModulEnum(Modulacoes modulEnum) {
        this.modulEnum = modulEnum;
    }

    @Override
    public Boolean validar(EfikaCustomer cust) {
        return modulEnum == Modulacoes.find(cust.getServicos().getVelDown());
    }

}
