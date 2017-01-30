/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.telnet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import model.dslam.AbstractDslam;
import model.dslam.login.LoginDslamStrategy;

/**
 *
 * @author G0042204
 */
public class ConsultaDslam {

    public Socket pingSocket;
    public PrintWriter out;
    public BufferedReader in;

    public AbstractDslam dslam;

    public LoginDslamStrategy styLogin;

    public ConsultaDslam(AbstractDslam dslam) {
        this.dslam = dslam;

    }

    public void conectar() throws IOException {
        this.dslam.getLoginStrategy().conectar(this);
    }

    public List<String> getRetorno() throws IOException {

        List<String> list = new ArrayList<>();

        for (int i = 0; i < 999; i++) {

            String line = in.readLine();
            if (line.contains("||")) {
                break;
            }

            list.add(line);
        }
        return list;
    }

    public void close() throws IOException {
        out.close();
        in.close();
        pingSocket.close();
    }

    public ComandoDslam consulta(ComandoDslam comando) throws Exception {

        try {

            if (pingSocket == null) {
                this.conectar();
            }

            out.println(comando.getSintax());
            Thread.sleep(comando.getSleep());
            out.println("||");
            comando.setRetorno(this.getRetorno());
            return comando;

        } catch (IOException e) {
            System.out.println("erro");
        }
        return null;
    }

}