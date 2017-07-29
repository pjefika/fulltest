/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manobra.analitcs;

/**
 *
 * @author G0042204
 */
public class ConclusaoManobraDTO {

    private final String nome, frase;

    public ConclusaoManobraDTO(ConclusaoManobraEnum c) {
        this.nome = c.name();
        this.frase = c.getNome();
    }

    public String getNome() {
        return nome;
    }

    public String getFrase() {
        return frase;
    }

}
