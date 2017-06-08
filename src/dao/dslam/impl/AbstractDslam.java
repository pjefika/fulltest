/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl;

import java.io.IOException;
import model.dslam.credencial.Credencial;
import dao.dslam.impl.login.LoginDslamStrategy;
import model.produtos.ProdutoCliente;

/**
 *
 * @author G0041775
 */
public abstract class AbstractDslam implements Conector, ConsultaClienteInter {

    private String ipDslam;
    private Credencial credencial;
    public LoginDslamStrategy loginStrategy;

    private ConsultaDslam cd;

    @Override
    public void conectar() {
        this.loginStrategy.conectar(this.getCd());
    }

    public void desconectar() throws IOException {
        this.cd.close();
    }

    public String getIpDslam() {
        return this.ipDslam;
    }

    public Credencial getCredencial() {
        return credencial;
    }

    public void setCredencial(Credencial credencial) {
        this.credencial = credencial;
    }

    public LoginDslamStrategy getLoginStrategy() {
        return loginStrategy;
    }

    public void setLoginStrategy(LoginDslamStrategy loginStrategy) {
        this.loginStrategy = loginStrategy;
    }

    public ConsultaDslam getCd() {
        return cd;
    }

    public void setCd(ConsultaDslam cd) {
        this.cd = cd;
    }

}
