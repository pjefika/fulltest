/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.consulta.metalico;

import br.net.gvt.efika.customer.EfikaCustomer;
import java.math.BigInteger;
import model.dslam.consulta.Validavel;

public class TabelaRedeMetalico implements Validavel {

    private BigInteger pctDown, pctUp, crcDown, crcUp, fecDown, fecUp, resync, tempoMedicao;

    /**
     * *
     * Implementar
     *
     * @param cust
     * @return
     */
    @Override
    public Boolean validar(EfikaCustomer cust) {
        if (isCrcOk() && resync5()) {
            return enoughPcks();
        }
        return false;
    }

    @Override
    public String getNome() {
        return "Confiabilidade de Rede";
    }

    public BigInteger getResync() {
        return resync;
    }

    public void setResync(BigInteger resync) {
        this.resync = resync;
    }

    public BigInteger getPctDown() {
        return pctDown;
    }

    public void setPctDown(BigInteger pctDown) {
        this.pctDown = pctDown;
    }

    public BigInteger getPctUp() {
        return pctUp;
    }

    public void setPctUp(BigInteger pctUp) {
        this.pctUp = pctUp;
    }

    public BigInteger getCrcDown() {
        return crcDown;
    }

    public void setCrcDown(BigInteger crcDown) {
        this.crcDown = crcDown;
    }

    public BigInteger getCrcUp() {
        return crcUp;
    }

    public void setCrcUp(BigInteger crcUp) {
        this.crcUp = crcUp;
    }

    public BigInteger getFecDown() {
        return fecDown;
    }

    public void setFecDown(BigInteger fecDown) {
        this.fecDown = fecDown;
    }

    public BigInteger getFecUp() {
        return fecUp;
    }

    public void setFecUp(BigInteger fecUp) {
        this.fecUp = fecUp;
    }

    public BigInteger getTempoMedicao() {
        return tempoMedicao;
    }

    public void setTempoMedicao(BigInteger time) {
        this.tempoMedicao = time;
    }

    public Boolean isCrcOk() {
        BigInteger maxCrcDown = this.getPctDown().divide(new BigInteger("6000"));
        BigInteger maxCrcUp = this.getPctUp().divide(new BigInteger("5000"));
        if (this.getCrcDown().compareTo(maxCrcDown) > 0 || this.getCrcUp().compareTo(maxCrcUp) > 0) {
            return false;
        }
        return true;
    }

    /**
     * True para resync menor que 300
     *
     * @return
     */
    public Boolean resync300() {
        return this.getResync().compareTo(new BigInteger("300")) < 0;
    }

    /**
     * True para tempoMedicao maior que 5 minutos
     *
     * @return
     */
    public Boolean cincoMin() {
        return this.getTempoMedicao().compareTo(BigInteger.valueOf(300l)) > 0;
    }

    /**
     * True para resync menor que 50
     *
     * @return
     */
    public Boolean resync50() {
        return this.getResync().compareTo(new BigInteger("50")) < 0;
    }

    /**
     * True para resync menor que 5
     *
     * @return
     */
    public Boolean resync5() {
        return this.getResync().compareTo(new BigInteger("5")) < 0;
    }

    /**
     * True para resync 0
     *
     * @return
     */
    public Boolean resync0() {
        return this.getResync().compareTo(new BigInteger("0")) == 0;
    }

    /**
     * True para pacotes down E up menor que 50
     *
     * @return
     */
    public Boolean pctA() {
        return this.getPctDown().compareTo(new BigInteger("50")) < 0 && this.getPctUp().compareTo(new BigInteger("50")) < 0;
    }

    /**
     * True para pacotes down >= 6000
     *
     * @return
     */
    public Boolean pctDown() {
        return this.getPctDown().compareTo(new BigInteger("6000")) >= 0;
    }

    /**
     * True para pacotes up >= 5000
     *
     * @return
     */
    public Boolean pctUp() {
        return this.getPctDown().compareTo(new BigInteger("5000")) >= 0;
    }

    /**
     * True para pacotes up >= 5000
     *
     * @return
     */
    public Boolean enoughPcks() {
        return pctDown() && pctUp();
    }

    /**
     * True para pacotes down E up maior que 3000
     *
     * @return
     */
    public Boolean pctB() {
        return this.getPctDown().compareTo(new BigInteger("3000")) > 0 && this.getPctUp().compareTo(new BigInteger("3000")) > 0;
    }

    /**
     * True para pacotes down E up menor que 1000
     *
     * @return
     */
    public Boolean pctC() {
        return this.getPctDown().compareTo(new BigInteger("1000")) < 0 && this.getPctUp().compareTo(new BigInteger("1000")) < 0;
    }
}
