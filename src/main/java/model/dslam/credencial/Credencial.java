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
    ALCATEL_LEITURA("co", "#operco33"),
    ALCATEL("alcatel", "#alcatel101"),
    VIVO1("s_efika_cf", "@Ef1k@!"),
    ALCATEL7342("SUPERUSER", "ANS#150"),
    HUAWEI_METALICOV1("root", "br-hu4we1"),
    ALCATEL_METALICOV1("isadmin", "ANS#150"),
    KEYMILE("manager", ""),
    KEYMILEV1("s_keymale_cf", "Km@il376");

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
