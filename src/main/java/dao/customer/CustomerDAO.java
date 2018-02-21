/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.customer;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import java.io.IOException;

/**
 *
 * @author G0041775
 */
public class CustomerDAO {

    public static EfikaCustomer getCustomer(String instancia) throws IOException, UnsupportedOperationException{

//            PoolingHttpClientConnectionManager cm = new PoolingHttpClientConnectionManager();
//            cm.setMaxTotal(1);
//            cm.setDefaultMaxPerRoute(1);
//            HttpHost ip = new HttpHost("10.40.195.81", 8080);
//            cm.setMaxPerRoute(new HttpRoute(ip), 50);
//
//            // Cookies
//            RequestConfig globalConfig = RequestConfig.custom()
//                    .setCookieSpec(CookieSpecs.DEFAULT)
//                    .build();
//
//            CloseableHttpClient httpclient = HttpClients.custom()
//                    .setConnectionManager(cm)
//                    .setDefaultRequestConfig(globalConfig)
//                    .build();
//
//            HttpGet httpget = new HttpGet("http://10.40.195.81:8080/stealerAPI/oss/" + instancia);
//            httpget.setHeader(HttpHeaders.CONTENT_TYPE, "text/html");
//            CloseableHttpResponse response = httpclient.execute(httpget);
//            InputStream instream = response.getEntity().getContent();
//            BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
//            StringBuffer result = new StringBuffer();
//            String line = "";
//            while ((line = rd.readLine()) != null) {
//                result.append(line);
//            }
//            instream.close();
//
//            

            

            return null;
        
    }
}
