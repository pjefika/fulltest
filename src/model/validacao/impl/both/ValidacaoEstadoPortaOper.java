/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.impl.both;

import java.util.Locale;
import model.dslam.consulta.EstadoDaPorta;

/**
 *
 * @author G0042204
 */
public class ValidacaoEstadoPortaOper extends Validacao {

    protected transient EstadoDaPorta ep;

    public ValidacaoEstadoPortaOper(EstadoDaPorta e, Locale local) {
        super("Estado Operacional da Porta", local);
        this.ep = e;
    }

    @Override
    public Object getObject() {
        return ep;
    }

    @Override
    public Boolean checar() {
        return ep.getOperState();
    }

    @Override
    protected String fraseNegativa() {
        return "Identificado que o modem está sem sincronismo, certifique-se com o cliente se está ligado e com os cabos conectados. Se sim, solicite ao cliente que reinicialize o modem e teste novamente.";
    }

    @Override
    protected String frasePositiva() {
        return "Sincronismo OK.";
    }

}
