/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.dslam.consulta.ConsultaClienteInter;
import model.entity.Cliente;

/**
 *
 * @author G0042204
 */
public class ConsultaClienteFacade{
    
    private ConsultaClienteInter c;
        
    private Cliente cl;

    public ConsultaClienteFacade(ConsultaClienteInter c, Cliente cl) {
        this.c = c;
        this.cl = cl;
    }

    public Cliente consultar() {
        return c.consultar(cl);
    }
      
}
