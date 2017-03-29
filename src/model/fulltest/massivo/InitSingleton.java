/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.massivo;

import java.net.HttpURLConnection;
import java.net.URL;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 *
 * @author G0042204
 */
@Singleton
@Startup
public class InitSingleton {

    @PostConstruct
    public void init() {
        try {
            String url = "http://localhost:8080/fulltestAPI/massivo/abreThread";
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            System.out.println("Passou por aqui");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
