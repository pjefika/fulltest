/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.manobra;

import model.dslam.consulta.metalico.TabelaRedeMetalico;
import model.validacao.ValidacaoRede;

/**
 *
 * @author G0042204
 */
public class ValidacaoRedeManobra extends ValidacaoRede {

    public ValidacaoRedeManobra(TabelaRedeMetalico i) {
        super(i);
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
    
}
