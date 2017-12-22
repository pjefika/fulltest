/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.filter;

import java.util.List;

/**
 *
 * @author G0042204
 * @param <T>
 */
public interface Filter<T> {

    public List<T> filter(List<T> lst);

}
