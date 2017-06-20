/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao;

import br.net.gvt.efika.customer.EfikaCustomer;
import model.dslam.consulta.VlanVoip;

/**
 *
 * @author G0042204
 */
public class ValidacaoVlanVoip extends Validacao {

    private transient VlanVoip vlan;

    private transient EfikaCustomer e;

    public ValidacaoVlanVoip(VlanVoip v, EfikaCustomer ec) {
        super("Vlan VoIP");
        this.vlan = v;
        this.e = ec;
    }

    @Override
    public Boolean validar() {
        if (e.getServicos().getIsSip()) {
            if (vlan.validar(e)) {
                setMensagem("Vlan de Voip configurado corretamente.");
                setResultado(true);
                return true;
            } else {
                setMensagem("Vlan de Voip configurado incorretamente. Cvlan esperado: "
                        + e.getRede().getCvLan() + " - Cvlan configurado: " + vlan.getCvlan()
                        + " Svlan esperado: " + e.getRede().getVlanVoip()+ " - Svlan configurado: " + vlan.getSvlan()
                        + " Estado Vlan: " + vlan.getState().toString()+".");
                setResultado(false);
            }
        }else{
            setMensagem("Cliente sem VoIP.");
            setResultado(Boolean.TRUE);
            return true;
        }

        return false;
    }

}
