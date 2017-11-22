/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.consulta;

import br.net.gvt.efika.customer.EfikaCustomer;
import java.math.BigInteger;

public class ReConexao implements Validavel {

    private BigInteger reconnects;

    public ReConexao() {
    }

    public ReConexao(BigInteger reconnects) {
        this.reconnects = reconnects;
    }

    @Override
    public Boolean validar(EfikaCustomer cust) {
        return reconnects.compareTo(new BigInteger("3")) <= 0;
    }

    @Override
    public String getNome() {
        return "Reconexões";
    }

}
