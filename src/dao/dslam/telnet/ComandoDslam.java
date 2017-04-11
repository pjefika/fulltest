/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.telnet;

import java.util.List;

/**
 *
 * @author G0042204
 */
public class ComandoDslam {

    private String sintax;

    private Integer sleep = 1000;

    private String sintaxAux;

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
