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
public class VlanVod extends VlanAbstract {

    public VlanVod() {
        super(null, null);
    }

    public VlanVod(Integer p100, Integer cvlan, EnumEstadoVlan est) {
        super(p100, cvlan, est);
    }

    @Deprecated
    public VlanVod(Integer p100, Integer cvlan) {
        super(p100, cvlan);
    }

    @Override
    public Boolean validar(EfikaCustomer e) {
        return this.getSvlan().equals(e.getRede().getVlanVod()) && this.getCvlan().equals(e.getRede().getCvLan()) && this.getState().equals(EnumEstadoVlan.UP);
    }
}
