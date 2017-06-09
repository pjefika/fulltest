/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl;

/**
 *
 * @author G0042204
 */
public interface Conector {

    public void conectar() throws Exception;

    public void close() throws Exception;

}
