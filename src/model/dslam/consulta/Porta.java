/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.consulta;

/**
 *
 * @author G0041775
 */
public class Porta {

    private EstadoDaPorta estadoPorta;

    private Integer numPorta;

    public Porta() {
    }

    public Integer getNumPorta() {
        return numPorta;
    }

    public void setNumPorta(Integer numPorta) {
        this.numPorta = numPorta;
    }

    public EstadoDaPorta getEstadoPorta() {
        return estadoPorta;
    }

    public void setEstadoPorta(EstadoDaPorta estadoPorta) {
        this.estadoPorta = estadoPorta;
    }

    public void setEstadoPorta(String adminState, String operState) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
