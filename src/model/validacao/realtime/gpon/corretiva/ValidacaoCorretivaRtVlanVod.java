/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.realtime.gpon.corretiva;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.impl.AbstractDslam;
import model.validacao.ValidacaoVlanVod;
import model.validacao.realtime.ValidacaoRealtimeCorretiveGpon;

/**
 *
 * @author G0042204
 */
public class ValidacaoCorretivaRtVlanVod extends ValidacaoRealtimeCorretiveGpon {

    private ValidacaoVlanVod valid;

    public ValidacaoCorretivaRtVlanVod(AbstractDslam dslam, EfikaCustomer cust) {
        super(dslam, cust, "Vlan VoD");
    }

    @Override
    public Boolean validar() {
        try {
            if (cust.getServicos().getIsHib()) {
                valid = new ValidacaoVlanVod(cg.getVlanVod(cust.getRede()), cust);
                if (valid.validar()) {
                    this.merge(valid);
                } else {
                    setResultado(Boolean.FALSE);
                    alter.deleteVlanVod(cust.getRede());
                    valid = new ValidacaoVlanVod(alter.createVlanVod(cust.getRede()), cust);
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
