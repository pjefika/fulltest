/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl;

import br.net.gvt.efika.fulltest.model.telecom.config.ComandoDslam;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G0042204
 */
public class ConsultaDslamVivo2 extends ConsultaDslam {

    public Socket pingSocket;

    public ConsultaDslamVivo2(AbstractDslam dslam) {
        super(dslam);
    }

    @Override
    public List<String> getRetorno() throws IOException {

        List<String> list = new ArrayList<>();
        String line;
        try {
            Integer i = 0;
            while (i < 5) {
                line = in.readLine();
                System.out.println("line->" + line);
                if (line == null) {
                    i++;
                }
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

    @Override
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
