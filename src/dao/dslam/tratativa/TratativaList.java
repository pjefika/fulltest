/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.tratativa;

import java.util.List;

/**
 *
 * @author G0042204
 * @param <T>
 */
public interface TratativaList<T> {

    public T parse(List<String> str) throws TratativaException;

}
