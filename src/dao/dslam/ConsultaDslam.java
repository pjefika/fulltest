/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import model.dslam.AbstractDslam;

/**
 *
 * @author G0042204
 */
public class ConsultaDslam {

    private Socket pingSocket;
    private PrintWriter out;
    private BufferedReader in;

    private AbstractDslam dslam;

    public ConsultaDslam(AbstractDslam dslam) {
        this.dslam = dslam;
    }

    public void conectar() throws IOException {
        pingSocket = new Socket(dslam.getIpDslam(), 23);
        out = new PrintWriter(pingSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(pingSocket.getInputStream()));
        out.println(dslam.getCredencial().getLogin());
        out.println(dslam.getCredencial().getPass());
    }

    public String getRetorno() throws IOException {
        StringBuilder resp = new StringBuilder();
        for (int i = 0; i < 999; i++) {

            String line = in.readLine();
            if (line.contains("||")) {
                break;
            }
            resp.append(line);
        }
        return resp.toString();
    }

    public ComandoDslam consulta(ComandoDslam comando) throws Exception {

        try {

            if (pingSocket == null) {
                this.conectar();
            }

            out.println(comando.getSintax());
            Thread.sleep(1000);
            out.println("||");
            comando.setRetorno(this.getRetorno());
            return comando;

        } catch (IOException e) {
            System.out.println("erro");
        } finally {
            out.close();
            in.close();
            pingSocket.close();
        }
        return null;
    }

}
