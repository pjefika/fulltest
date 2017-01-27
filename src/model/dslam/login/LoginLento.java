/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.login;

import dao.dslam.telnet.ConsultaDslam;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author G0042204
 */
public class LoginLento implements LoginDslamStrategy {

    @Override
    public void conectar(ConsultaDslam cs) {

        try {
            cs.pingSocket = new Socket(cs.dslam.getIpDslam(), 23);
            cs.out = new PrintWriter(cs.pingSocket.getOutputStream(), true);
            cs.in = new BufferedReader(new InputStreamReader(cs.pingSocket.getInputStream()));
            Thread.sleep(5000);
            cs.out.println(cs.dslam.getCredencial().getLogin());
            Thread.sleep(3000);
            cs.out.println(cs.dslam.getCredencial().getPass());
            Thread.sleep(3000);
        } catch (IOException ex) {
            Logger.getLogger(LoginRapido.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(LoginLento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
