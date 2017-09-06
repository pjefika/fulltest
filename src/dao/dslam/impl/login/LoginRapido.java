/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.login;

import dao.dslam.impl.ConsultaDslam;
import exception.SemGerenciaException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 *
 * @author G0042204
 */
public class LoginRapido implements LoginDslamStrategy {

    @Override
    public void conectar(ConsultaDslam cs) throws Exception {

        cs.pingSocket = new Socket();
        try {
            cs.pingSocket.connect(new InetSocketAddress(cs.dslam.getIpDslam(), 23), 10000);
        } catch (Exception e) {
            throw new SemGerenciaException();
        }

        cs.out = new PrintWriter(cs.pingSocket.getOutputStream(), true);
        cs.in = new BufferedReader(new InputStreamReader(cs.pingSocket.getInputStream()));
        cs.out.println(cs.dslam.getCredencial().getLogin());
        cs.out.println(cs.dslam.getCredencial().getPass());
    }

}
