/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author G0042204
 * @param <T>
 */
public class JacksonMapper<T> {

    final Class<T> typeParameterClass;

    public JacksonMapper(Class<T> typeParameterClass) {
        this.typeParameterClass = typeParameterClass;
    }

    public T deserialize(String string) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(string, typeParameterClass);
        } catch (IOException ex) {
            Logger.getLogger(JacksonMapper.class.getName()).log(Level.SEVERE, null, ex);
            throw new Exception();
        }
    }

    public String serialize(T obj) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(obj);
    }

}
