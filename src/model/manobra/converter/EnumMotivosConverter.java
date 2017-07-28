/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manobra.converter;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import javax.enterprise.context.Dependent;
import model.manobra.MotivoManobraEnum;

/**
 *
 * @author G0042204
 */
@Dependent
public class EnumMotivosConverter implements JsonDeserializer<MotivoManobraEnum>, JsonSerializer<MotivoManobraEnum> {

    @Override
    public MotivoManobraEnum deserialize(JsonElement json, Type type, JsonDeserializationContext jdc) throws JsonParseException {
        if (!((Class) type).isEnum()) {
            throw new IllegalArgumentException("Expected an enum type");
        }
        Class<? extends Enum> classOfT = (Class<? extends Enum>) type;
        if (json != null && !json.isJsonNull()) {
            if (json.isJsonPrimitive()) {
                return (MotivoManobraEnum) Enum.valueOf(classOfT, json.getAsString());
            } else {
                JsonObject jsonObject = (JsonObject) json;
                JsonElement value = jsonObject.get("name");
                if (value != null) {
                    return (MotivoManobraEnum) Enum.valueOf(classOfT, value.getAsString());
                }
            }
        }
        return null;
    }

    @Override
    public JsonElement serialize(MotivoManobraEnum src, Type type, JsonSerializationContext jsc) {
        Class<?> classOfSrc = (Class<?>) type;
        if (!classOfSrc.isEnum()) {
            throw new IllegalArgumentException("Expected an enum type");
        }
        if (src != null) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("nome", ((Enum) src).name());
            jsonObject.addProperty("motivo", src.getMotivo());
            return jsonObject;
        }
        return null;
    }

}
