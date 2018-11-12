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
import dao.dslam.impl.retorno.TratativaRetornoUtil;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.security.Security;
import java.util.Properties;
import model.dslam.credencial.Credencial;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/**
 *
 * @author G0041775
 */
public class LoginComJumpMetalico implements LoginDslamStrategy {

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
            String telnet = "telnet " + cs.dslam.getIpDslam();

            cs.channel = session.openChannel("shell");

            cs.out = new PrintWriter(cs.channel.getOutputStream(), false);
            cs.in = new BufferedReader(new InputStreamReader(cs.channel.getInputStream()));

            cs.channel.connect();
            Thread.sleep(1000);

            cs.out.print(telnet + "\r");
            cs.out.flush();
            Thread.sleep(3000);
            if (TratativaRetornoUtil.tratHuawei(cs.getRetorno(), "Connected").contains("Parâmetro não encontrado")) {
                Thread.sleep(5000);
                if (TratativaRetornoUtil.tratHuawei(cs.getRetorno(), "Connected").contains("Parâmetro não encontrado")) {
                    throw new SemGerenciaException();
                }
            }
            cs.out.print(this.cs.dslam.getCredencial().getLogin() + "\r");
            cs.out.flush();
            Thread.sleep(2500);
            cs.out.print(this.cs.dslam.getCredencial().getPass() + "\r");
            cs.out.flush();
            Thread.sleep(2000);

            if (!TratativaRetornoUtil.tratHuawei(cs.getRetorno(), "Username or password invalid").contains("enc")) {
                cs.out.print(Credencial.VIVO1.getLogin() + "\r");
                cs.out.flush();
                Thread.sleep(2500);
                cs.out.print(Credencial.VIVO1.getPass() + "\r");
                cs.out.flush();
                Thread.sleep(2000);
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new SemGerenciaException();
        }

    }
}
