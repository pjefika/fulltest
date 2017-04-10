/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import java.util.ArrayList;
import java.util.List;
import model.dslam.consulta.TabelaParamAbstract;
import model.validacao.Validacao;
import model.validacao.ValidacaoCadastroTBS;
import model.validacao.Validator;

/**
 *
 * @author G0041775
 */
public class Cliente extends AbstractEntity implements Validator {

    private String nome, designador;

    private GetInfoOut cadastro;

    private TabelaParamAbstract tabela;

    private List<Validacao> valid;

    public Cliente(String designador) {
        this.designador = designador;
        valid = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesignador() {
        return designador;
    }

    public void setDesignador(String designador) {
        this.designador = designador;
    }

    public GetInfoOut getCadastro() {
        return cadastro;
    }

    public TabelaParamAbstract getTabela() {
        return tabela;
    }

    public void setTabela(TabelaParamAbstract tabela) {
        this.tabela = tabela;
    }

    public List<Validacao> getValid() {
        return valid;
    }

    public void setValid(List<Validacao> valid) {
        this.valid = valid;
    }

    @Override
    public Boolean validar() {
        valid.add(new ValidacaoCadastroTBS(cadastro));

        for (Validacao v : valid) {
            if (!v.validar()) {
                return false;
            }
        }
        return true;
    }
}
