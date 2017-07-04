/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl;

import java.util.List;

/**
 *
 * @author G0042204
 */
public class ComandoDslam {

    private String sintax;

    private Integer sleep = 1000;
    
    private Integer sleepAux = 1000;

    private String sintaxAux;

    private String sintaxAux2;

    private List<String> retorno;

    public ComandoDslam(String sintax) {
        this.sintax = sintax;
    }

    public ComandoDslam(String sintax, Integer sleep) {
        this.sintax = sintax;
        this.sleep = sleep;
    }

    public ComandoDslam(String sintax, Integer sleep, String sintaxAux) {
        this.sintax = sintax;
        this.sleep = sleep;
        this.sintaxAux = sintaxAux;
    }

    public ComandoDslam(String sintax, Integer sleep, String sintaxAux, Integer sleepAux) {
        this.sintax = sintax;
        this.sleep = sleep;
        this.sintaxAux = sintaxAux;
        this.sleepAux = sleepAux;
    }

    public ComandoDslam(String sintax, Integer sleep, String sintaxAux, Integer sleepAux, String sintaxAux2) {
        this.sintax = sintax;
        this.sleep = sleep;
        this.sintaxAux = sintaxAux;
        this.sintaxAux2 = sintaxAux2;
        this.sleepAux = sleepAux;
    }

    public String getSintax() {
        return sintax;
    }

    public void setSintax(String sintax) {
        this.sintax = sintax;
    }

    public List<String> getRetorno() {
        return retorno;
    }

    public String getBlob() {
        StringBuilder resp = new StringBuilder();
        for (String string : retorno) {
            resp.append(string);
        }
        return resp.toString();
    }

    public String getSintaxAux2() {
        return sintaxAux2;
    }

    public void setSintaxAux2(String sintaxAux2) {
        this.sintaxAux2 = sintaxAux2;
    }

    public Integer getSleepAux() {
        return sleepAux;
    }

    public void setSleepAux(Integer sleepAux) {
        this.sleepAux = sleepAux;
    }

    public void setRetorno(List<String> retorno) {
        this.retorno = retorno;
    }

    public Integer getSleep() {
        return sleep;
    }

    public void setSleep(Integer sleep) {
        this.sleep = sleep;
    }

    public String getSintaxAux() {
        return sintaxAux;
    }

    public void setSintaxAux(String sintaxAux) {
        this.sintaxAux = sintaxAux;
    }

}
