/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.customer;

import br.net.gvt.efika.customer.EfikaCustomer;

/**
 *
 * @author G0042204
 */
public class ClientesVizinhosRequest {

    private EfikaCustomer ec;

    private Integer qtde;

    public ClientesVizinhosRequest(EfikaCustomer ec, Integer qtde) {
        this.ec = ec;
        this.qtde = qtde;
    }

    public ClientesVizinhosRequest() {
        this.qtde = 5;
    }

    public EfikaCustomer getEc() {
        return ec;
    }

    public void setEc(EfikaCustomer ec) {
        this.ec = ec;
    }

    public Integer getQtde() {
        return qtde;
    }

    public void setQtde(Integer qtde) {
        this.qtde = qtde;
    }

}
