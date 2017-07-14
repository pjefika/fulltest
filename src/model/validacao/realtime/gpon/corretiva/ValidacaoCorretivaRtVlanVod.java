/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime.gpon.corretiva;

import model.validacao.realtime.gpon.*;
import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.impl.ConsultaGponDefault;
import model.validacao.ValidacaoVlanVod;

/**
 *
 * @author G0042204
 */
public class ValidacaoCorretivaRtVlanVod extends ValidacaoRtVlanVod {

    private ValidacaoVlanVod valid;

    public ValidacaoCorretivaRtVlanVod(ConsultaGponDefault dslam, EfikaCustomer cust) {
        super(dslam, cust);
    }

    @Override
    public Boolean validar() {
        try {
            if (cust.getServicos().getIsHib()) {
                valid = new ValidacaoVlanVod(consultaGpon.getVlanVod(cust.getRede()), cust);
                if (valid.validar()) {
                    this.merge(valid);
                } else {
                    setResultado(Boolean.FALSE);
                    alteracaoGpon.deleteVlanVod(cust.getRede());
                    valid = new ValidacaoVlanVod(alteracaoGpon.createVlanVod(cust.getRede()), cust);
                    if (valid.validar()) {
                        setMensagem("Efetuado correção de bridge, solicite ao cliente que reinicialize o modem e teste novamente.");
                    } else {
                        setMensagem("Não foi possível corrigir o a bridge. Seguir o fluxo com o problema/sintoma informado pelo cliente.");
                    }
                }
            } else {
                setMensagem("Cliente sem TV Híbrida.");
                setResultado(Boolean.TRUE);
            }
            return getResultado();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
