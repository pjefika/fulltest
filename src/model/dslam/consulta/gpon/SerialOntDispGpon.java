/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.consulta.gpon;

/**
 *
 * @author G0041775
 */
public class SerialOntDispGpon {

    private String serial, slot, porta;

    public SerialOntDispGpon() {
    }

    public SerialOntDispGpon(String serial, String slot, String porta) {
        this.serial = serial;
        this.slot = slot;
        this.porta = porta;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public String getPorta() {
        return porta;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

}
