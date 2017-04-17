/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao;

import java.math.BigInteger;
import model.dslam.consulta.metalico.TabelaRedeMetalico;

/**
 *
 * @author G0042204
 */
public class ValidacaoRede extends Validacao {

    private TabelaRedeMetalico tabelaRede;

    public ValidacaoRede(TabelaRedeMetalico i) {
        this.tabelaRede = i;
        this.nome = "Tabela de Rede";
        

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
    protected Boolean resyncA() {
        return tabelaRede.getResync().compareTo(new BigInteger("5")) > 0 && tabelaRede.getResync().compareTo(new BigInteger("60")) < 0;
    }

    /**
     * True para resync maior que 60
     *
     * @return
     */
    protected Boolean resyncB() {
        return tabelaRede.getResync().compareTo(new BigInteger("60")) > 0;
    }

    /**
     * True para resync menor que 5
     *
     * @return
     */
    protected Boolean resyncC() {
        return tabelaRede.getResync().compareTo(new BigInteger("5")) < 0;
    }

    /**
     * True para pacotes down E up menor que 50
     *
     * @return
     */
    protected Boolean pctA() {
        return tabelaRede.getPctDown().compareTo(new BigInteger("50")) < 0 && tabelaRede.getPctUp().compareTo(new BigInteger("50")) < 0;
    }

    /**
     * True para pacotes down E up maior que 3000
     *
     * @return
     */
    protected Boolean pctB() {
        return tabelaRede.getPctDown().compareTo(new BigInteger("3000")) > 0 && tabelaRede.getPctUp().compareTo(new BigInteger("3000")) > 0;
    }

    /**
     * True para pacotes down E up menor que 1000
     *
     * @return
     */
    protected Boolean pctC() {
        return tabelaRede.getPctDown().compareTo(new BigInteger("1000")) < 0 && tabelaRede.getPctUp().compareTo(new BigInteger("1000")) < 0;
    }

    /**
     * Implementar!
     *
     * @return
     */
    @Override
    public Boolean validar() {

//        if (t.getResync() != null) {
//            return t.getResync().compareTo(new BigInteger("5")) < 0;
//        }
        return false;
    }
}
