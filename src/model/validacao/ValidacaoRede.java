/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao;

import model.validacao.impl.Validacao;
import java.math.BigInteger;
import model.dslam.consulta.metalico.TabelaRedeMetalico;

/**
 *
 * @author G0042204
 */
public abstract class ValidacaoRede extends Validacao {

    private final TabelaRedeMetalico tabelaRede;

    public ValidacaoRede(TabelaRedeMetalico i) {
        super("Tabela de Rede");
        this.tabelaRede = i;
    }

    public Boolean isCrcOk() {
        BigInteger maxCrcDown = tabelaRede.getPctDown().divide(new BigInteger("6000"));
        BigInteger maxCrcUp = tabelaRede.getPctUp().divide(new BigInteger("5000"));
        if (tabelaRede.getCrcDown().compareTo(maxCrcDown) > 0 || tabelaRede.getCrcUp().compareTo(maxCrcUp) > 0) {
            return false;
        }
        return true;
    }

    /**
     * True para resync entre 5 e 60
     *
     * @return
     */
    public Boolean resyncA() {
        return tabelaRede.getResync().compareTo(new BigInteger("5")) > 0 && tabelaRede.getResync().compareTo(new BigInteger("60")) < 0;
    }

    /**
     * True para resync maior que 60
     *
     * @return
     */
    public Boolean resyncB() {
        return tabelaRede.getResync().compareTo(new BigInteger("60")) > 0;
    }

    /**
     * True para resync menor que 5
     *
     * @return
     */
    public Boolean resyncC() {
        return tabelaRede.getResync().compareTo(new BigInteger("5")) < 0;
    }

    /**
     * True para pacotes down E up menor que 50
     *
     * @return
     */
    public Boolean pctA() {
        return tabelaRede.getPctDown().compareTo(new BigInteger("50")) < 0 && tabelaRede.getPctUp().compareTo(new BigInteger("50")) < 0;
    }

    /**
     * True para pacotes down E up maior que 3000
     *
     * @return
     */
    public Boolean pctB() {
        return tabelaRede.getPctDown().compareTo(new BigInteger("3000")) > 0 && tabelaRede.getPctUp().compareTo(new BigInteger("3000")) > 0;
    }

    /**
     * True para pacotes down E up menor que 1000
     *
     * @return
     */
    public Boolean pctC() {
        return tabelaRede.getPctDown().compareTo(new BigInteger("1000")) < 0 && tabelaRede.getPctUp().compareTo(new BigInteger("1000")) < 0;
    }

}
