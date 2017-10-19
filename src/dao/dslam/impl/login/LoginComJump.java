/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.login;

import dao.dslam.impl.Conector;
import dao.dslam.impl.ConsultaDslamVivo1;
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
    public void conectar(Conector cs) throws Exception {

        ConsultaDslamVivo1 css = (ConsultaDslamVivo1) cs;
        css.pingSocket = new Socket();

        try {
            SocketAddress adr = new InetSocketAddress("10.18.81.96", 23);
//            cs.pingSocket = new Socket("10.18.81.96", 22);
            
            css.pingSocket.connect(adr);
            css.out = new PrintWriter(css.pingSocket.getOutputStream(), false);
            css.in = new BufferedReader(new InputStreamReader(css.pingSocket.getInputStream()));
            css.out.println("incid");
            css.out.println("v!vo@incid");
            css.out.println("telnet " + css.dslam.getIpDslam());
            css.out.println(css.dslam.getCredencial().getLogin());
            css.out.println(css.dslam.getCredencial().getPass());
        } catch (Exception e) {
            e.printStackTrace();
            throw new SemGerenciaException();
        }
    }

}
