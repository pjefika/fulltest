/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.consulta.gpon;

import br.net.gvt.efika.customer.EfikaCustomer;
import model.fulltest.validacao.Validavel;

/**
 *
 * @author G0042204
 */
public class TabelaParametrosGpon implements Validavel {

    private Double potOnt;

    private Double potOlt;

    public TabelaParametrosGpon() {
    }

    @Override
    public String getNome() {
        throw new UnsupportedOperationException("Not supported yethis."); //To change body of generated methods, choose Tools | Templates.
    }

    public Double getPotOnt() {
        return potOnt;
    }

    public void setPotOnt(Double potOnt) {
        this.potOnt = potOnt;
    }

    public Double getPotOlt() {
        return potOlt;
    }

    public void setPotOlt(Double potOlt) {
        this.potOlt = potOlt;
    }

    @Override
    public Boolean validar(EfikaCustomer e) {
        return this.getPotOlt().compareTo(new Double("-8")) <= 0 && this.getPotOlt().compareTo(new Double("-30")) >= 0
                && this.getPotOnt().compareTo(new Double("-8")) <= 0 && this.getPotOnt().compareTo(new Double("-30")) >= 0;
    }

}
