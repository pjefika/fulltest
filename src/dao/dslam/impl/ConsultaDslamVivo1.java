/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl;

import com.jcraft.jsch.Channel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import dao.dslam.impl.login.LoginDslamStrategy;

/**
 *
 * @author G0042204
 */
public class ConsultaDslamVivo1 implements Conector {

    public Channel channel;
    public PrintWriter out;
    public BufferedReader in;

    public AbstractDslam dslam;

    public LoginDslamStrategy styLogin;

    public ConsultaDslamVivo1(AbstractDslam dslam) {
        this.dslam = dslam;
    }

    @Override
    public void conectar() throws Exception {
        this.dslam.conectar();
    }

    public List<String> getRetorno() throws Exception {

        List<String> list = new ArrayList<>();
        channel.disconnect();
        try {
            String line;
            Integer i = 0;
            while ((line = in.readLine()) != null) {
                System.out.println("comecoLoop");
                list.add(line);
                System.out.println("line->" + line);
                if (line.isEmpty()) {
                    i++;
                    System.out.println("linhaSEMcoisa");
                    Thread.sleep(1000);
                } else {
                    System.out.println("linhacomcoisa");
                    i = 0;
                }
                if (i > 3) {
                    System.out.println("tonobreak");

                    return list;
                }
                System.out.println("finalLoop");
                System.out.println(in.ready());
            }
        } catch (Exception e) {
            System.out.println("excecao");
            return list;
        }
        System.out.println("cabo");
        return list;
    }

    @Override
    public void close() throws IOException {
        if (out != null) {
            out.close();
            in.close();
            channel.disconnect();
        }
    }

    @Override
    public ComandoDslam consulta(ComandoDslam comando) throws Exception {

        try {

            if (channel == null || !channel.isConnected()) {
                this.conectar();
            }

            execComm(comando.getSintax(), comando.getSleep());
            if (comando.getSintaxAux() != null) {
                execComm(comando.getSintaxAux(), comando.getSleepAux());
            }
            if (comando.getSintaxAux2() != null) {
                execComm(comando.getSintaxAux2(), comando.getSleepAux());
            }

            if (comando.getHasRetorno()) {
                comando.setRetorno(this.getRetorno());
            }

            return comando;

        } catch (Exception e) {
            throw e;
        }
    }

    public void execComm(String sintax, Integer sleep) {
        out.print(sintax + "\r");
        out.flush();
        try {
            Thread.sleep(sleep);
        } catch (Exception e) {
        }
    }

}
