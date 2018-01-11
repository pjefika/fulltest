/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.both;

import br.net.gvt.efika.customer.EfikaCustomer;
import br.net.gvt.efika.enums.TecnologiaTv;
import java.math.BigInteger;
import java.util.Locale;
import telecom.properties.VlanAbstract;

/**
 *
 * @author G0042204
 */
public abstract class ValidacaoPacotesVlan extends ValidacaoValidavel {

    private final transient VlanAbstract vlan;

    public ValidacaoPacotesVlan(VlanAbstract v, EfikaCustomer cust, Locale local) {
        super(cust, v, local);
        this.vlan = v;
    }

    public Boolean validarPacotes() {
        return vlan.getPctDown().compareTo(BigInteger.ZERO) == 1
                && vlan.getPctUp().compareTo(BigInteger.ZERO) == 1;
    }

    @Override
    protected void processar() {
        if (getCust().getServicos().getTipoTv() != null) {
            if (getCust().getServicos().getTipoTv() != TecnologiaTv.DTH) {
                if (super.checar()) {
                    if (validarPacotes()) {
                        this.finalizar("Vlan configurado e identificada troca de pacotes.", Boolean.TRUE);
                    } else {
                        this.finalizar("Não identificada troca de pacotes.", Boolean.FALSE);
                    }
                } else {
                    this.finalizar(this.fraseNegativa(), Boolean.FALSE);
                }
            } else {
                this.finalizar("Cliente sem TV Híbrida/IPTV.", Boolean.TRUE);
            }
        } else {
            this.finalizar("Cliente sem TV.", Boolean.TRUE);
        }

    }

}
