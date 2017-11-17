/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.consulta;

import br.net.gvt.efika.customer.EfikaCustomer;

public class VlanVoipVivo1Huawei extends VlanVoipVivo1 {

    private Integer gemport;

    public VlanVoipVivo1Huawei() {
    }

    @Override
    public Boolean validar(EfikaCustomer e) {
        return super.validar(e) && getGemport().compareTo((e.getRede().getLogica()+384)) == 0;
    }

    public Integer getGemport() {
        return gemport;
    }

    public void setGemport(Integer gemport) {
        this.gemport = gemport;
    }

}
