/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.nosql;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import javax.ejb.Stateless;
import model.entity.TesteCliente;

@Stateless
public class DslamDAO {

    private MongoClient mongoClient;

    private DB db;

    private DBCollection collection;

    public DslamDAO() {
        this.mongoClient = new MongoClient("10.200.35.67", 27017);
        this.db = mongoClient.getDB("fulltest");
        this.collection = db.getCollection("testes");
    }

    public void salvar(TesteCliente t) {
        BasicDBObject basicDBObject = new BasicDBObject();
        Gson gson = new Gson();
        String result = gson.toJson(t);

        basicDBObject.put("name", "teste");
        basicDBObject.put("teste", result);

        collection.insert(basicDBObject);
    }

    public void listar() {

        BasicDBObject whereQuery = new BasicDBObject();
        whereQuery.put("name", "teste");

        DBCursor cursor = collection.find(whereQuery);
        // DBCursor cursor = collection.find();

        while (cursor.hasNext()) {
            System.out.println(cursor.next());
        }

    }

}
