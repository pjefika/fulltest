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
public class EstadoDaPorta extends ValidavelAbs implements Validavel {

    private Boolean adminState;

    private Boolean operState;

    private static final String NOME = "Estado da Porta";

    public EstadoDaPorta() {
        super(NOME);
    }

    public EstadoDaPorta(Boolean adminState) {
        super(NOME);
        this.adminState = adminState;
    }
    
    

    public Boolean getAdminState() {
        return adminState;
    }

    public void setAdminState(Boolean adminState) {
        this.adminState = adminState;
    }

    public Boolean getOperState() {
        return operState;
    }

    public void setOperState(Boolean operState) {
        this.operState = operState;
    }

    @Override
    public String toString() {
        return adminState == true ? "up" : "down";
    }
    
    

    @Override
    public Boolean validar(EfikaCustomer e) {
        return this.adminState && this.operState;
    }

}
