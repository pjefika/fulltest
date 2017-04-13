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
        if (resyncA() && isCrcOk()) {
            this.setMensagem("Falha de rede.Quedas");
        } else if (resyncA() && !isCrcOk()) {
            this.setMensagem("Falha de rede.Taxa de erro e quedas");
        } else if (pctA()) {
            this.setMensagem("Possível falha de porta ou modem1");
        } else if (resyncB() && isCrcOk()) {
            this.setMensagem("Possível falha de porta ou modem");
        } else if (resyncB() && !isCrcOk()) {
            this.setMensagem("Falha de rede.Taxa de erro e quedas");
        } else if (resyncC() && pctB() && isCrcOk()) {
            this.setMensagem("Navegação Ok");
        } else if (resyncC() && !isCrcOk()) {
            this.setMensagem("Falha de rede. Taxa de erro");
        } else if (resyncC() && pctC() && isCrcOk()) {
            this.setMensagem("Faha de rede. Taxa de erro");
        }

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
    private Boolean resyncA() {
        return tabelaRede.getResync().compareTo(new BigInteger("5")) > 0 && tabelaRede.getResync().compareTo(new BigInteger("60")) < 0;
    }

    /**
     * True para resync maior que 60
     *
     * @return
     */
    private Boolean resyncB() {
        return tabelaRede.getResync().compareTo(new BigInteger("60")) > 0;
    }

    /**
     * True para resync menor que 5
     *
     * @return
     */
    private Boolean resyncC() {
        return tabelaRede.getResync().compareTo(new BigInteger("5")) < 0;
    }

    /**
     * True para pacotes down E up menor que 50
     *
     * @return
     */
    private Boolean pctA() {
        return tabelaRede.getPctDown().compareTo(new BigInteger("50")) < 0 && tabelaRede.getPctUp().compareTo(new BigInteger("50")) < 0;
    }

    /**
     * True para pacotes down E up maior que 3000
     *
     * @return
     */
    private Boolean pctB() {
        return tabelaRede.getPctDown().compareTo(new BigInteger("3000")) > 0 && tabelaRede.getPctUp().compareTo(new BigInteger("3000")) > 0;
    }

    /**
     * True para pacotes down E up menor que 1000
     *
     * @return
     */
    private Boolean pctC() {
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
