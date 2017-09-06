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
public class LoginLento implements LoginDslamStrategy {

    @Override
    public void conectar(ConsultaDslam cs) throws Exception {
        cs.pingSocket = new Socket();
        try {
            cs.pingSocket.connect(new InetSocketAddress(cs.dslam.getIpDslam(), 23), 10000);
            cs.out = new PrintWriter(cs.pingSocket.getOutputStream(), true);
            cs.in = new BufferedReader(new InputStreamReader(cs.pingSocket.getInputStream()));
            Thread.sleep(10000);
            cs.out.println(cs.dslam.getCredencial().getLogin());
            Thread.sleep(3000);
            cs.out.println(cs.dslam.getCredencial().getPass());
            Thread.sleep(3000);
        } catch (Exception e) {
            throw new SemGerenciaException();
        }

    }

}
