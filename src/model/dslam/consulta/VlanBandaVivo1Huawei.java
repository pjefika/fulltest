/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.consulta;

import br.net.gvt.efika.customer.EfikaCustomer;

public class VlanBandaVivo1Huawei extends VlanBandaVivo1 {

    private Integer gemport;

    public VlanBandaVivo1Huawei() {
    }

    @Override
    public Boolean validar(EfikaCustomer e) {
        return getGemport().compareTo((e.getRede().getLogica() + 128)) == 0 && getSvlan().compareTo(e.getRede().getRin()) == 0;
    }

    public Integer getGemport() {
        return gemport;
    }

    public void setGemport(Integer gemport) {
        this.gemport = gemport;
    }

}
