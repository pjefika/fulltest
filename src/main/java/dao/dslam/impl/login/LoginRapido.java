/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.login;

import dao.dslam.impl.Conector;
import dao.dslam.impl.ConsultaDslamVivo2;
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
    public void conectar(Conector cs) throws Exception {

        ConsultaDslamVivo2 css = (ConsultaDslamVivo2) cs;
        css.pingSocket = new Socket();
        try {
            css.pingSocket.connect(new InetSocketAddress(css.dslam.getIpDslam(), 23), 5000);
            css.out = new PrintWriter(css.pingSocket.getOutputStream(), true);
            css.in = new BufferedReader(new InputStreamReader(css.pingSocket.getInputStream()));
            css.out.println(css.dslam.getCredencial().getLogin());
            css.out.println(css.dslam.getCredencial().getPass());
        } catch (Exception e) {
            throw new SemGerenciaException();
        }
    }

}
