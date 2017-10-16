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
import java.net.SocketAddress;

/**
 *
 * @author G0042204
 */
public class LoginComJump implements LoginDslamStrategy {

    @Override
    public void conectar(ConsultaDslam cs) throws Exception {

        cs.pingSocket = new Socket();
        
        try {
            SocketAddress adr = new InetSocketAddress("10.18.81.96", 23);
            
            cs.pingSocket.connect(adr, 5000);
            cs.out = new PrintWriter(cs.pingSocket.getOutputStream(), false);
            cs.in = new BufferedReader(new InputStreamReader(cs.pingSocket.getInputStream()));
            cs.out.println("incid");
            cs.out.println("v!vo@incid");
            cs.out.println("telnet "+cs.dslam.getIpDslam());
            cs.out.println(cs.dslam.getCredencial().getLogin());
            cs.out.println(cs.dslam.getCredencial().getPass());
        } catch (Exception e) {
            e.printStackTrace();
            throw new SemGerenciaException();
        }
    }

}
