/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao;

import br.net.gvt.efika.customer.EfikaCustomer;
import model.dslam.consulta.VlanVod;

/**
 *
 * @author G0042204
 */
public class ValidacaoVlanVod extends Validacao {

    private transient VlanVod vlan;

    private transient EfikaCustomer e;

    public ValidacaoVlanVod(VlanVod v, EfikaCustomer ec) {
        super("Vlan VoD");
        this.vlan = v;
        this.e = ec;
    }

    @Override
    public Boolean validar() {
        if (e.getServicos().getIsHib()) {
            if (vlan.validar(e)) {
                setMensagem("Vlan de VoD configurado corretamente.");
                setResultado(true);
                return true;
            } else {
                setMensagem("Vlan de VoD configurado incorretamente. Cvlan esperado: "
                        + e.getRede().getCvLan() + " - Cvlan configurado: " + vlan.getCvlan()
                        + " Svlan esperado: " + e.getRede().getVlanVod()+ " - Svlan configurado: " + vlan.getSvlan()
                        + " Estado Vlan: " + vlan.getState().getEstadoVlan());
                setResultado(false);
            }
        }else{
            setMensagem("Cliente sem TV Híbrida.");
            setResultado(Boolean.TRUE);
            return true;
        }

        return false;
    }

}
