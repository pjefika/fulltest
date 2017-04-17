/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.facade;

import model.entity.Cliente;
import model.Motivos;
import model.validacao.ValidacaoFactory;

/**
 *
 * @author G0042204
 */
public class ValidaClienteFacade {

    private Cliente cl;

    private Motivos m;

    public ValidaClienteFacade(Cliente cl, Motivos m) {
        this.cl = cl;
        this.m = m;
    }

    public Boolean validar() {
        if (this.cl != null) {
            ValidacaoFactory fac = new ValidacaoFactory(cl);
            cl.setValid(fac.getValids(m));
        }

        return cl.validar();
    }

    public Cliente getCl() {
        return cl;
    }

    public void setCl(Cliente cl) {
        this.cl = cl;
    }
}
