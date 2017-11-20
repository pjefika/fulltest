/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.realtime;

import br.net.gvt.efika.customer.EfikaCustomer;

/**
 *
 * @author G0041775
 */
public interface Corrigivel {

    public Boolean corrigir(EfikaCustomer cust);

    public String getNome();

}
