/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam;

/**
 *
 * @author G0042204
 */
public class ComandoDslam {

    private String sintax;

    private String retorno;

    public ComandoDslam(String sintax) {
        this.sintax = sintax;
    }

    public String getSintax() {
        return sintax;
    }

    public void setSintax(String sintax) {
        this.sintax = sintax;
    }

    public String getRetorno() {
        return retorno;
    }

    public void setRetorno(String retorno) {
        this.retorno = retorno;
    }

}
