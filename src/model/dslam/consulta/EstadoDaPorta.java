/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.consulta;

import dao.dslam.AbstractDslam;
import model.fulltest.validacao.Validador;

/**
 *
 * @author G0041775
 */
public class EstadoDaPorta implements Validador{

    private String adminState;

    private String operState;

    public String getAdminState() {
        return adminState;
    }

    public void setAdminState(String adminState) {
        this.adminState = adminState;
    }

    public String getOperState() {
        return operState;
    }

    public void setOperState(String operState) {
        this.operState = operState;
    }

    @Override
    public Boolean validar(AbstractDslam ds) {
        return this.adminState.equalsIgnoreCase("UP") && this.operState.equalsIgnoreCase("UP");
    }

}
