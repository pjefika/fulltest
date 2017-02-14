/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import java.util.logging.Level;
import java.util.logging.Logger;
import model.entity.TesteCliente;

/**
 *
 * @author G0042204
 */
public class testThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        TesteCliente cls = new TesteCliente("7930272843");
//        BackgroundTestThread ba = new BackgroundTestThread(cls);

        try {
//            ba.run();
        } catch (Exception ex) {
            Logger.getLogger(testThread.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
