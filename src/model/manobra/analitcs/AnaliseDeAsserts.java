/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manobra.analitcs;

import br.net.gvt.efika.asserts.AssertsEnum;
import br.net.gvt.efika.customer.CustomerAssert;
import br.net.gvt.efika.customer.EfikaCustomer;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

/**
 *
 * @author G0041775
 */
public class AnaliseDeAsserts {

    private EfikaCustomer ec;

    private Boolean isPortOk;

    private Boolean isModemOk;

    private String fraseologia;

    public AnaliseDeAsserts(EfikaCustomer ec) {
        this.isPortOk = true;
        this.isModemOk = true;
        this.fraseologia = "Sem problemas na porta.";
        this.ec = ec;
    }

    public void run() {
        List<CustomerAssert> leAsserts = ec.getAsserts();
        CustomerAssert hasSync = leAsserts.stream().filter((t) -> {
            return t.getAsserts().compareTo(AssertsEnum.HAS_SYNC) == 0;
        }).findFirst().get();
        CustomerAssert authOrdem = leAsserts.stream().filter((t) -> {
            return t.getAsserts().compareTo(AssertsEnum.AUTH_ABERTURA_ORDEM) == 0;
        }).findFirst().get();
        if (hasSync.getValue() && !authOrdem.getValue()) {
            setIsPortOk(false);
            setFraseologia("Porta NOK. Motivo não autentica.");
        }
        if (!hasSync.getValue() && !authOrdem.getValue()) {
            setIsPortOk(false);
            setFraseologia("Porta NOK. Motivo não sincroniza.");
        }
        CustomerAssert attDown = leAsserts.stream().filter((t) -> {
            return t.getAsserts().compareTo(AssertsEnum.ATT_DOWN_OK) == 0;
        }).findFirst().get();
        CustomerAssert attUp = leAsserts.stream().filter((t) -> {
            return t.getAsserts().compareTo(AssertsEnum.ATT_UP_OK) == 0;
        }).findFirst().get();
        CustomerAssert isAdsl = leAsserts.stream().filter((t) -> {
            return t.getAsserts().compareTo(AssertsEnum.IS_ADSL) == 0;
        }).findFirst().get();
        if (hasSync.getValue() && attDown.getValue() && !attUp.getValue() && isAdsl.getValue()) {
            setIsPortOk(false);
            setFraseologia("Porta NOK up. Motivo Não atinge velocidade ADSL.");
        }
        if (hasSync.getValue() && !attDown.getValue() && attUp.getValue() && isAdsl.getValue()) {
            setIsPortOk(false);
            setFraseologia("Porta NOK down. Motivo Não atinge velocidade ADSL.");
        }
        if (hasSync.getValue() && !attDown.getValue() && !attUp.getValue() && isAdsl.getValue()) {
            setIsPortOk(false);
            setFraseologia("Porta NOK up e down. Motivo Não atinge velocidade ADSL.");
        }
        if (hasSync.getValue() && attDown.getValue() && !attUp.getValue() && !isAdsl.getValue()) {
            setIsPortOk(false);
            setFraseologia("Porta NOK up. Motivo Não atinge velocidade VDSL.");
        }
        if (hasSync.getValue() && !attDown.getValue() && attUp.getValue() && !isAdsl.getValue()) {
            setIsPortOk(false);
            setFraseologia("Porta NOK down. Motivo Não atinge velocidade VDSL.");
        }
        if (hasSync.getValue() && !attDown.getValue() && !attUp.getValue() && !isAdsl.getValue()) {
            setIsPortOk(false);
            setFraseologia("Porta NOK up e down. Motivo Não atinge velocidade VDSL.");
        }
        CustomerAssert pctDown = leAsserts.stream().filter((t) -> {
            return t.getAsserts().compareTo(AssertsEnum.PACOTES_DOWN_MENOR_6000) == 0;
        }).findFirst().get();
        CustomerAssert pctUp = leAsserts.stream().filter((t) -> {
            return t.getAsserts().compareTo(AssertsEnum.PACOTES_UP_MENOR_4000) == 0;
        }).findFirst().get();
        if (!pctDown.getValue() || !pctUp.getValue()) {
            setFraseologia("Troca modem. Baixo volume de pacotes.");
            setIsModemOk(false);
        }
        CustomerAssert isTt = leAsserts.stream().filter((t) -> {
            return t.getAsserts().compareTo(AssertsEnum.IS_REPARO) == 0;
        }).findFirst().get();
        CustomerAssert rsync300 = leAsserts.stream().filter((t) -> {
            return t.getAsserts().compareTo(AssertsEnum.RESYNC_MENOR_300) == 0;
        }).findFirst().get();
        CustomerAssert rsync50 = leAsserts.stream().filter((t) -> {
            return t.getAsserts().compareTo(AssertsEnum.RESYNC_MENOR_50) == 0;
        }).findFirst().get();
        if(isTt.getValue() && !rsync300.getValue()){
            setFraseologia("Trocar modem. Motivo Quedas TT.");
            setIsModemOk(false);
        }
        if(!isTt.getValue() && rsync300.getValue() && !rsync50.getValue()){
            setFraseologia("Porta NOK. Motivo Quedas BA.");
            setIsPortOk(false);
        }
        if(!isTt.getValue() && !rsync300.getValue()){
            setFraseologia("Porta NOK. Motivo Quedas BA.");
            setIsPortOk(false);
        }

    }

    public Boolean getIsPortOk() {
        return isPortOk;
    }

    public void setIsPortOk(Boolean resultado) {
        this.isPortOk = resultado;
    }

    public String getFraseologia() {
        return fraseologia;
    }

    public void setFraseologia(String fraseologia) {
        this.fraseologia = fraseologia;
    }

    public Boolean getIsModemOk() {
        return isModemOk;
    }

    public void setIsModemOk(Boolean isModemOk) {
        this.isModemOk = isModemOk;
    }

}
