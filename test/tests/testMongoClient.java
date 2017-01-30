/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.BasicDBObject;
import java.io.ByteArrayOutputStream;
import model.entity.TesteCliente;
import org.bson.BSON;
import org.bson.BSONObject;

/**
 *
 * @author G0042204
 */
public class testMongoClient {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {

        Object o = new TesteCliente("4130222839");

    }

}
