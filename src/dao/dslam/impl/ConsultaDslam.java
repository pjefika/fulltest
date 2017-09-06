/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import dao.dslam.impl.login.LoginDslamStrategy;

/**
 *
 * @author G0042204
 */
public class ConsultaDslam implements Conector {

    public Socket pingSocket;
    public PrintWriter out;
    public BufferedReader in;

    public AbstractDslam dslam;

    public LoginDslamStrategy styLogin;

    public ConsultaDslam(AbstractDslam dslam) {
        this.dslam = dslam;

    }

    @Override
    public void conectar() throws Exception{
        this.dslam.conectar();
    }

    public List<String> getRetorno() throws IOException {

        List<String> list = new ArrayList<>();
        String line;
        try {
            while ((line = in.readLine()) != null) {
                list.add(line);
            }
        } catch (Exception e) {
            return list;
        }
        return list;
    }

    @Override
    public void close() throws IOException {
        if (out != null) {
            out.close();
            in.close();
            pingSocket.close();
        }
    }

    public ComandoDslam consulta(ComandoDslam comando) throws Exception {

        try {

            if (pingSocket == null) {
                this.conectar();
            }

            pingSocket.setSoTimeout(comando.getSleep());
            out.println(comando.getSintax());
            if (comando.getSintaxAux() != null) {
                Thread.sleep(comando.getSleep());
                pingSocket.setSoTimeout(comando.getSleepAux());
                out.println(comando.getSintaxAux());
                if (comando.getSintaxAux2() != null) {
                    Thread.sleep(comando.getSleepAux());
                    pingSocket.setSoTimeout(comando.getSleep());
                    out.println(comando.getSintaxAux2());
                }
            }

            comando.setRetorno(this.getRetorno());
            return comando;

        } catch (IOException e) {
            throw e;
        }
    }

}
