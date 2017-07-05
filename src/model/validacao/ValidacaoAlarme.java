/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao;

import br.net.gvt.efika.customer.EfikaCustomer;
import model.dslam.consulta.EstadoDaPorta;
import model.dslam.consulta.gpon.AlarmesGpon;

/**
 *
 * @author G0042204
 */
public class ValidacaoAlarme extends Validacao {

    protected transient AlarmesGpon alarm;
    protected transient EfikaCustomer ec;

    public ValidacaoAlarme(AlarmesGpon e, EfikaCustomer ec) {
        super("Lista de Alarmes");
        this.alarm = e;
        this.ec = ec;
    }

    @Override
    public Boolean validar() {
        if(alarm.validar(ec)){
            setMensagem("Não existem alarmes para a porta.");
            setResultado(Boolean.TRUE);
        }else{
            setMensagem("Existem alarmes para a porta, necessário verificação física.");
            setResultado(Boolean.FALSE);
        }
        return getResultado();
    }

}
