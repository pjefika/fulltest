/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.config;

import java.util.List;
import model.dslam.config.velocidade.VelocidadeDTO;
import model.validacao.impl.both.ValidacaoResult;

/**
 *
 * @author G0042204
 */
public class ProfileConfig {

    private ValidacaoResult atual;

    private List<VelocidadeDTO> downValues;

    public ProfileConfig() {
    }

    public ProfileConfig(ValidacaoResult atual, List<VelocidadeDTO> downValues) {
        this.atual = atual;
        this.downValues = downValues;
    }

    public ValidacaoResult getAtual() {
        return atual;
    }

    public void setAtual(ValidacaoResult atual) {
        this.atual = atual;
    }

    public List<VelocidadeDTO> getDownValues() {
        return downValues;
    }

    public void setDownValues(List<VelocidadeDTO> downValues) {
        this.downValues = downValues;
    }

}
