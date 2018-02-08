/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.both;

import br.net.gvt.efika.customer.EfikaCustomer;
import java.util.Locale;
import telecom.properties.ReConexao;

/**
 *
 * @author G0042204
 */
public class ValidacaoReConexao extends ValidacaoValidavel {

    public ValidacaoReConexao(ReConexao reconnect, EfikaCustomer cust, Locale local) {
        super(cust, reconnect, local);
    }

    @Override
    protected String frasePositiva() {
        return "Quantidade de quedas aceitável.";
    }

    @Override
    protected String fraseNegativa() {
        return "A quantidade de quedas é inaceitável.";
    }

}
