/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.consulta;

import br.net.gvt.efika.customer.EfikaCustomer;

/**
 *
 * @author G0041775
 */
public class VlanMulticast extends VlanAbstract {

    private String ipIgmp;

    public VlanMulticast() {
        super(null, null);
    }

    @Override
    public String getNome() {
        return "Vlan Multicast";
    }

    public VlanMulticast(Integer cvlan, Integer svlan, EnumEstadoVlan estado) {
        super(cvlan, svlan, estado);
    }

    public String getIpIgmp() {
        return ipIgmp;
    }

    public void setIpIgmp(String ipIgmp) {
        this.ipIgmp = ipIgmp;
    }

    @Override
    public Boolean validar(EfikaCustomer e) {
        if (getSvlan() == null || getIpIgmp() == null) {
            return false;
        }
        return getSvlan().equals(e.getRede().getVlanMulticast()) && getState().equals(EnumEstadoVlan.UP) &&
                getIpIgmp().equalsIgnoreCase(e.getRede().getIpMulticast());
    }

}
