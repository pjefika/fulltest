/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.filter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G0042204
 * @param <T>
 */
public abstract class AbstractFilter<T> implements Filter<T> {

    private final List<T> retorno = new ArrayList<>();

    protected abstract boolean criteria(T param);

    @Override
    public List<T> filter(List<T> lst) {
        lst.forEach((t) -> {
            if(criteria(t)){
                retorno.add(t);
            }
        });
        return retorno;
    }

}
