/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import com.google.gson.Gson;

/**
 *
 * @author G0042204
 */
public class GsonUtil {

    private static final Gson GSON = new Gson();

    public static String serialize(Object ob) {
        return GSON.toJson(ob, ob.getClass());
    }

}
