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
public class VlanBanda extends VlanAbstract {

    public VlanBanda() {
        super(null, null, null);
    }

    public VlanBanda(Integer cvlan, Integer p100, EnumEstadoVlan estado) {
        super(p100, cvlan, estado);
    }
    
    @Deprecated
    public VlanBanda(Integer cvlan, Integer p100){
        super(cvlan, p100);
    }

    @Override
    public Boolean validar(EfikaCustomer e) {
        return this.getSvlan().equals(e.getRede().getRin()) && this.getCvlan().equals(e.getRede().getCvLan()) && this.getState().equals(EnumEstadoVlan.UP);
    }
}
