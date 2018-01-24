/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.http;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;

/**
 *
 * @author G0042204
 * @param <T>
 */
public abstract class GenericHttpDAO<T> {

    public T jsonPost(Object data) throws Exception {
        HttpClient httpcliente = HttpClients.createDefault();
        HttpPost httppost = new HttpPost("http://10.200.35.67:80/networkInventoryAPI/networkInventoryGpon/vizinhos");

        // Request parameters and other properties.
        StringEntity param = new StringEntity(new Gson().toJson(data));
        httppost.addHeader("content-type", "application/json");
        httppost.setEntity(param);

        //Execute and get the response.
        HttpResponse response = httpcliente.execute(httppost);
        HttpEntity entity = response.getEntity();

        InputStream instream = entity.getContent();
        BufferedReader rd = new BufferedReader(new InputStreamReader(entity.getContent()));
        StringBuffer result = new StringBuffer();
        String line = "";
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }

        instream.close();
        return new Gson().fromJson(result.toString(), getClass().getGenericSuperclass());
    }

}
