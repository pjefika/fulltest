/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam;

import java.util.List;

/**
 *
 * @author G0042204
 */
public class ComandoDslam {

    private String sintax;
    
    private Integer sleep = 1000;

    private List<String> retorno;

    public ComandoDslam(String sintax) {
        this.sintax = sintax;
    }

    public ComandoDslam(String sintax, Integer sleep) {
        this.sintax = sintax;
        this.sleep = sleep;
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

}
