/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.tratativa;

public abstract class TratativaGenericImpl<T> implements Tratativa<T> {

    @Override
    public T parse(String str) throws TratativaException {
        try {
            return this.parser(str);
        } catch (Exception e) {
            throw new TratativaException(e.getClass().getName());
        }
    }

    protected abstract T parser(String str) throws Exception;

}
