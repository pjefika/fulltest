/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl;

import com.jcraft.jsch.Channel;
import dao.dslam.impl.login.LoginDslamStrategy;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.List;

/**
 *
 * @author G0042204
 */
public abstract class ConsultaDslam implements Conector {

    public Channel channel;
    public PrintWriter out;
    public BufferedReader in;

    public AbstractDslam dslam;

    public LoginDslamStrategy styLogin;


    
    public ConsultaDslam(AbstractDslam dslam) {
        this.dslam = dslam;
    }

    @Override
    public void conectar() throws Exception {
        this.dslam.conectar();
    }

    public abstract List<String> getRetorno() throws Exception;

}
