/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao.decorator;

import java.util.Calendar;
import model.validacao.impl.both.ValidacaoEntity;
import model.validacao.impl.realtime.Validador;

/**
 *
 * @author G0041775
 */
public class ValidacaoEntityDecorator {

    public static ValidacaoEntity start(Validador valid) {
        ValidacaoEntity v = new ValidacaoEntity();
        v.setDataInicio(Calendar.getInstance().getTime());
        v.setCust(valid.getCust());
        v.setValid(valid.getResult());
        return v;
    }

    public static ValidacaoEntity end(ValidacaoEntity v, Validador valid) {
        v.setDataFim(Calendar.getInstance().getTime());
        v.setValid(valid.getResult());
        return v;
    }

}
