/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.consulta;

import br.net.gvt.efika.customer.EfikaCustomer;
import model.EnumEstadoVlan;

/**
 *
 * @author G0041775
 */
public class VlanVoip extends VlanAbstract {

    public VlanVoip() {
        super(null, null);
    }

    @Override
    public String getNome() {
        return "Vlan VoIP";
    }

    public VlanVoip(Integer p100, Integer cvlan, EnumEstadoVlan est) {
        super(p100, cvlan, est);
    }

    @Deprecated
    public VlanVoip(Integer p100, Integer cvlan) {
        super(p100, cvlan);
    }

    @Override
    public Boolean validar(EfikaCustomer e) {
        return this.getSvlan().equals(e.getRede().getVlanVoip()) && this.getCvlan().equals(e.getRede().getCvLan()) && this.getState().equals(EnumEstadoVlan.UP);
    }
}
