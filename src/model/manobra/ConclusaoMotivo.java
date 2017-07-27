/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manobra;

/**
 *
 * @author G0042204
 */
public enum ConclusaoMotivo {

    PORTA_NOK("Porta com Defeito"), PORTA_OK("Porta Ok"), TROCAR_MODEM("Trocar Modem");

    private final String nome;

    private ConclusaoMotivo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

}
