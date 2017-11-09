/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional;

import br.net.gvt.efika.customer.EfikaCustomer;
import br.net.gvt.efika.customer.InventarioRede;
import br.net.gvt.efika.customer.InventarioServico;
import br.net.gvt.efika.customer.OrigemPlanta;
import br.net.gvt.efika.enums.TecnologiaLinha;
import br.net.gvt.efika.enums.TecnologiaTv;
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
        s.setTipoTv(TecnologiaTv.IPTV);
        s.setTipoLinha(TecnologiaLinha.SIP);
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
        s.setTipoTv(TecnologiaTv.IPTV);
        s.setTipoLinha(TecnologiaLinha.SIP);
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
        s.setTipoTv(TecnologiaTv.IPTV);
        s.setTipoLinha(TecnologiaLinha.SIP);
        s.setVelDown(51200l);
        s.setVelUp(25600l);

        c.setServicos(s);

        return c;
    }

    public static EfikaCustomer gponHuaweiV1() {
        EfikaCustomer c = new EfikaCustomer();
        InventarioRede r = new InventarioRede();

        //115027500879602 - 1334729066
        r.setTerminal("115027500879602");
        r.setIpDslam("BR_SPOPE_OLT03");
        r.setModeloDslam("MA5600T_FV1");

        r.setSlot(3);
        r.setPorta(2);
        r.setLogica(56);
        r.setCvLan(1719);
        r.setRin(125);

        r.setVlanVoip(3004);

        //todo huawei utiliza 400
        r.setVlanVod(400);
        r.setVlanMulticast(3009);
        r.setPlanta(OrigemPlanta.VIVO1);

        c.setRede(r);

        InventarioServico s = new InventarioServico();
        s.setTipoTv(TecnologiaTv.IPTV);
        s.setTipoLinha(TecnologiaLinha.SIP);
        s.setVelDown(51200l);
        s.setVelUp(25600l);

        c.setServicos(s);

        return c;
    }

    public static EfikaCustomer alcatel7302() {
        EfikaCustomer c = new EfikaCustomer();
        InventarioRede r = new InventarioRede();

        // Achar cliente 
        //110007570563807 - 1137587599
        //115637212216107 - 1239112215
        //110007556549800 - 1127811121
        r.setTerminal("111747672560806");
        r.setIpDslam("BR_CMPMC_OLT01");
        r.setModeloDslam("ALCATEL7302/7360_V1");

        r.setSlot(5); // Slot
        r.setPorta(16); // Porta Pon
        r.setLogica(1); // Id cliente
        r.setCvLan(130); // Vlan usuario
        r.setRin(280); // Vlan Rede

        r.setVlanVoip(3004); // Vlan Voz
        r.setVlanVod(3001); // Vlan Multicast
        r.setVlanMulticast(3001); // Vlan Multicast
        r.setIdOnt("0002734019");
        r.setBhs(Boolean.TRUE);
        r.setPlanta(OrigemPlanta.VIVO1);

        c.setRede(r);

        InventarioServico s = new InventarioServico();
        s.setTipoTv(TecnologiaTv.IPTV);
        s.setTipoLinha(TecnologiaLinha.SIP);
        s.setVelDown(51200l);
        s.setVelUp(25600l);

        c.setServicos(s);

        return c;
    }

}
