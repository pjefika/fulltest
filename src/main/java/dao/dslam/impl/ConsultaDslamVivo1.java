/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl;

import br.net.gvt.efika.fulltest.model.telecom.config.ComandoDslam;
import com.jcraft.jsch.Channel;
import dao.dslam.impl.login.LoginDslamStrategy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G0042204
 */
public class ConsultaDslamVivo1 extends ConsultaDslam {

    public ConsultaDslamVivo1(AbstractDslam dslam) {
        super(dslam);
    }

    @Override
    public void conectar() throws Exception {
        this.dslam.conectar();
    }

    private String readLinha() throws IOException {
        StringBuilder b = new StringBuilder();
        while (in.ready()) {
            int leRead = in.read();
            if (leRead == -1) {
                return b.toString();
            }
            b.appendCodePoint(leRead);
            if (leRead == 13) {
                int leReade = in.read();
                if (leReade == 10) {
                    return b.toString();
                } else {
                    b.appendCodePoint(leReade);
                }
            }
        }
        return null;
    }

    @Override
    public List<String> getRetorno() throws Exception {

        List<String> list = new ArrayList<>();

        try {
            String line;
            Integer i = 0;
            while ((line = readLinha()) != null) {
                System.out.println("line->" + line);

                if (line.isEmpty()) {
                    i++;
                    Thread.sleep(1000);
                } else {
                    i = 0;
                    list.add(line);
                }
                if (i > 3) {
                    return list;
                }
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

            comando.setRetorno(this.getRetorno());

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
