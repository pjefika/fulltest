/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.tratativa;

import java.util.List;

public abstract class TratativaListImpl<T> implements TratativaList<T> {

    @Override
    public T parse(List<String> str) throws TratativaException {
        try {
            return this.parser(str);
        } catch (Exception e) {
            throw new TratativaException(e.getClass().getName());
        }
    }

    protected abstract T parser(List<String> str) throws Exception;

}
