package controller.autenticacao;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.autenticacao.Usuario;

@SessionScoped
@Named
public class SessionUsuarioEfika implements Serializable {

    private static final long serialVersionUID = -253139602953530465L;

    private Usuario usuario;

    public SessionUsuarioEfika() {
        usuario = new Usuario();
    }

    @Inject
    public SessionUsuarioEfika(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public boolean isAtendente() {
        return this.usuario.getNivel() > 3;
    }

    public boolean isAdmin() {
        return this.usuario.getNivel() > 7;
    }

    public boolean isLogado() {
        return usuario.getLogin() != null;

    }
}
