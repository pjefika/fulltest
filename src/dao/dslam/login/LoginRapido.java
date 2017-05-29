/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.login;

import dao.dslam.ConsultaDslam;
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
public class LoginRapido implements LoginDslamStrategy {

    @Override
    public void conectar(ConsultaDslam cs) {
        try {
            cs.pingSocket = new Socket(cs.dslam.getIpDslam(), 23);
            cs.out = new PrintWriter(cs.pingSocket.getOutputStream(), true);
            cs.in = new BufferedReader(new InputStreamReader(cs.pingSocket.getInputStream()));
            cs.out.println(cs.dslam.getCredencial().getLogin());
            cs.out.println(cs.dslam.getCredencial().getPass());

            /**
             * Anotação para discussão sobre arquitetura.
             *
             * Dar preferencia ao polimorfismo.
             *
             * Principio da responsabilidade unica: Esses comandos são
             * especificos do ALCATEL GPON;
             *
             * @see Construtor AlcatelGponDslam
             * @author G0042204
             */
//            if(cs.dslam.getVendor().equalsIgnoreCase("ALCATEL")){
//                cs.out.println("environment inhibit-alarms");
//                cs.out.println("environment mode batch");
//                cs.out.println("exit");
//            }
            System.out.println("Connect!");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
