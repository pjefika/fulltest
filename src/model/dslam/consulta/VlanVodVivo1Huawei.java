/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.consulta;

import br.net.gvt.efika.customer.EfikaCustomer;

public class VlanVodVivo1Huawei extends VlanVodVivo1 {

    private Integer gemport;

    public VlanVodVivo1Huawei() {
        super(400);
    }

    @Override
    public Boolean validar(EfikaCustomer e) {
        return super.validar(e) && getGemport().compareTo((e.getRede().getLogica()+256)) == 0;
    }

    public Integer getGemport() {
        return gemport;
    }

    public void setGemport(Integer gemport) {
        this.gemport = gemport;
    }

}
