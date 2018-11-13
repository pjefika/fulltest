/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.login;

import br.net.gvt.efika.fulltest.exception.FalhaJumpAccessEsception;
import br.net.gvt.efika.fulltest.exception.SemGerenciaException;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import dao.dslam.impl.Conector;
import dao.dslam.impl.ConsultaDslamVivo1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.security.Security;
import java.util.Properties;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/**
 *
 * @author G0042204
 */
public class Login1023ComJump implements LoginDslamStrategy {

    private JSch jsch;
    private Session session;
    private ConsultaDslamVivo1 cs;

    @Override
    public void conectar(Conector css) throws Exception {

        this.cs = (ConsultaDslamVivo1) css;

        try {
            BouncyCastleProvider bouncyCastleProvider = new BouncyCastleProvider();
            Security.insertProviderAt(bouncyCastleProvider, 2);
            jsch = new JSch();
            session = jsch.getSession("efika", "10.18.81.96", 22);
            session.setPassword("Vivo@2018");

            Properties config = new Properties();
            config.put("StrictHostKeyChecking", "no");
            session.setConfig(config);

            session.connect();
        } catch (Exception e) {
            e.printStackTrace();
            throw new FalhaJumpAccessEsception();
        }

        try {
            String telnet = "telnet " + cs.dslam.getIpDslam() + " 1023";

            cs.channel = session.openChannel("shell");

            cs.out = new PrintWriter(cs.channel.getOutputStream(), false);
            cs.in = new BufferedReader(new InputStreamReader(cs.channel.getInputStream()));

            cs.channel.connect();
            Thread.sleep(1000);

            cs.out.print(telnet + "\r");
            cs.out.flush();
            Thread.sleep(7000);
            cs.out.print("\r");
            cs.out.flush();
            Thread.sleep(3000);
            cs.out.print("Y\r");
            cs.out.flush();
            Thread.sleep(4000);
            cs.out.print(this.cs.dslam.getCredencial().getLogin() + "\r");
            cs.out.flush();
            Thread.sleep(1000);
            cs.out.print(this.cs.dslam.getCredencial().getPass() + "\r");
            cs.out.flush();
            Thread.sleep(4500);
        } catch (Exception e) {
            e.printStackTrace();
            throw new SemGerenciaException();
        }
    }

}
