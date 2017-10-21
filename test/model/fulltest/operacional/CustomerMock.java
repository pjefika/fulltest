/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional;

import br.net.gvt.efika.customer.EfikaCustomer;
import br.net.gvt.efika.customer.InventarioRede;
import br.net.gvt.efika.customer.InventarioServico;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpHost;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;

/**
 *
 * @author G0042204
 */
public class CustomerMock {

    public static EfikaCustomer gponKeymile() {

        EfikaCustomer c = new EfikaCustomer();

        InventarioRede r = new InventarioRede();

        //lab
        r.setIpDslam("10.200.38.155");
        r.setModeloDslam("SUGP1");

        r.setSlot(21);
        r.setPorta(1);
        r.setSequencial(2023);
        r.setCvLan(2123);
        r.setLogica(23);
        r.setRin(111);

        r.setVlanVoip(1111);
        r.setVlanVod(3111);
        r.setVlanMulticast(4000);

        c.setRede(r);
        c.setServicos(sipVdsl());

        return c;
    }

    public static InventarioServico sipVdsl() {
        InventarioServico s = new InventarioServico();
        s.setIsHib(Boolean.FALSE);
        s.setIsSip(Boolean.TRUE);
        s.setVelDown(51200l);
        s.setVelUp(25600l);
        return s;
    }

    public static EfikaCustomer getCustomer(String instancia) {
        try {

            PoolingHttpClientConnectionManager cm = new PoolingHttpClientConnectionManager();
            cm.setMaxTotal(1);
            cm.setDefaultMaxPerRoute(1);
            HttpHost ip = new HttpHost("10.40.195.81", 8080);
            cm.setMaxPerRoute(new HttpRoute(ip), 50);

            // Cookies
            RequestConfig globalConfig = RequestConfig.custom()
                    .setCookieSpec(CookieSpecs.DEFAULT)
                    .build();

            CloseableHttpClient httpclient = HttpClients.custom()
                    .setConnectionManager(cm)
                    .setDefaultRequestConfig(globalConfig)
                    .build();

            HttpGet httpget = new HttpGet("http://10.40.195.81:8080/stealerAPI/oss/" + instancia);
            httpget.setHeader(HttpHeaders.CONTENT_TYPE, "text/html");
            CloseableHttpResponse response = httpclient.execute(httpget);
            InputStream instream = response.getEntity().getContent();
            BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            StringBuffer result = new StringBuffer();
            String line = "";
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }
            instream.close();

            Gson g = new Gson();

            EfikaCustomer ec = g.fromJson(result.toString(), EfikaCustomer.class);

            return ec;
        } catch (Exception e) {
            return null;
        }
    }

    public static EfikaCustomer gponZhone() {

        EfikaCustomer c = new EfikaCustomer();
        //lab
        InventarioRede r = new InventarioRede();
        r.setIpDslam("10.200.38.121");
        r.setModeloDslam("GPON_CARD8");

        r.setSlot(5);
        r.setPorta(2);
        r.setSequencial(135);
        r.setCvLan(235);
        r.setLogica(11);
        r.setRin(121);

        r.setVlanVoip(1121);
        r.setVlanVod(3121);
        r.setVlanMulticast(4000);

        c.setRede(r);

        InventarioServico s = new InventarioServico();
        s.setIsHib(Boolean.TRUE);
        s.setIsSip(Boolean.TRUE);
        s.setVelDown(15360l);
        s.setVelUp(1024l);

        c.setServicos(s);

        return c;
    }

    public static EfikaCustomer gponAlcatel() {

        EfikaCustomer c = new EfikaCustomer();
        InventarioRede r = new InventarioRede();

        //1630145676
        r.setIpDslam("10.214.57.22");
        r.setModeloDslam("GPON_CARD");

        r.setSlot(7);
        r.setPorta(7);
        r.setSequencial(2749);
        r.setLogica(17);
        r.setRin(14);

        r.setVlanVoip(1014);
        r.setVlanVod(3014);
        r.setVlanMulticast(4000);

        c.setRede(r);

        InventarioServico s = new InventarioServico();
        s.setIsHib(Boolean.FALSE);
        s.setIsSip(Boolean.TRUE);
        s.setVelDown(51200l);
        s.setVelUp(25600l);

        c.setServicos(s);

        return c;
    }

    public static EfikaCustomer gponHuaweiV1() {
        EfikaCustomer c = new EfikaCustomer();
        InventarioRede r = new InventarioRede();

        //1630145676
        r.setIpDslam("BR_SPOVG_OLT05");
        r.setModeloDslam("MA5600Tx1");

        r.setSlot(5);
        r.setPorta(6);
        r.setLogica(6);
        r.setCvLan(r.getLogica() + 128);
        r.setRin(141);

        r.setVlanVoip(3020);
        r.setVlanVod(3017);
        r.setVlanMulticast(3017);

        c.setRede(r);

        InventarioServico s = new InventarioServico();
        s.setIsHib(Boolean.FALSE);
        s.setIsSip(Boolean.TRUE);
        s.setVelDown(102400l);
        s.setVelUp(5120l);

        c.setServicos(s);

        return c;
    }

}
