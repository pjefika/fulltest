/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.credencial;

/**
 *
 * @author G0042204
 */
public enum Credencial {

    ZHONE("admin", "zhone"),
    ALCATEL("co", "#operco33"),
    KEYMILE("manager", "");

    private String login;
    private String pass;

    private Credencial(String login, String pass) {
        this.login = login;
        this.pass = pass;
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }

}