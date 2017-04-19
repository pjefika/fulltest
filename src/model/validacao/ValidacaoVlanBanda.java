/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao;

import model.dslam.AbstractDslam;
import model.dslam.consulta.VlanBanda;

/**
 *
 * @author G0042204
 */
public class ValidacaoVlanBanda extends Validacao {

    private VlanBanda v;

    private AbstractDslam ds;

    public ValidacaoVlanBanda(VlanBanda v, AbstractDslam ds) {
        this.v = v;
        this.ds = ds;
        this.nome = "VLAN Banda Larga";
    }

    @Override
    public Boolean validar() {
        Boolean ret = v.validar(ds);
        if (ret) {
            this.setMensagem("Validar ok");
        } else {
            this.setMensagem("Validar nok");
        }

        this.setResultado(ret);
        return ret;
    }

}
