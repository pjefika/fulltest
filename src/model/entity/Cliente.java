/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import com.gvt.www.ws.eai.oss.OSSTurbonetClienteAutenticado.OSSTurbonetClienteAutenticadoOut;
import com.gvt.www.ws.eai.oss.OSSTurbonetInconsistenciaTBSRadius.OSSTurbonetInconsistenciaTBSRadiusOut;
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

    private OSSTurbonetInconsistenciaTBSRadiusOut incon;

    private OSSTurbonetClienteAutenticadoOut auth;

    private TabelaParamAbstract tabela;

    private List<Validacao> valid;

    public Cliente(String designador) {
        this.designador = designador;
        valid = new ArrayList<>();
    }

    public void setCadastro(GetInfoOut cadastro) {
        this.cadastro = cadastro;
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

    public OSSTurbonetInconsistenciaTBSRadiusOut getIncon() {
        return incon;
    }

    public void setIncon(OSSTurbonetInconsistenciaTBSRadiusOut incon) {
        this.incon = incon;
    }

    public OSSTurbonetClienteAutenticadoOut getAuth() {
        return auth;
    }

    public void setAuth(OSSTurbonetClienteAutenticadoOut auth) {
        this.auth = auth;
    }

    @Override
    public Boolean validar() {
        valid.add(new ValidacaoCadastroTBS(cadastro, incon));

        for (Validacao v : valid) {
            if (!v.validar()) {
                return false;
            }
        }
        return true;
    }
}
