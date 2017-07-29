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
public enum ConclusaoManobraEnum {

    PORTA_NOK("Porta com Defeito"), PORTA_OK("Porta Ok"), TROCAR_MODEM("Trocar Modem");

    private final String nome;

    private ConclusaoManobraEnum(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public ConclusaoManobraDTO dto() {
        return new ConclusaoManobraDTO(this);
    }

}
