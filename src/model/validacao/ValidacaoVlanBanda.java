/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao;

import dao.dslam.AbstractDslam;
import model.dslam.consulta.VlanBanda;

/**
 *
 * @author G0042204
 */
public class ValidacaoVlanBanda extends Validacao {

    private VlanBanda vlanBanda;

    private transient AbstractDslam ds;

    public ValidacaoVlanBanda(VlanBanda v, AbstractDslam ds) {
        this.vlanBanda = v;
        this.ds = ds;
        this.nome = "Vlan Banda Larga";
    }

    @Override
    public Boolean validar() {
        Boolean ret = vlanBanda.validar(ds);
        if (ret) {
            this.setMensagem("Vlan Banda configurado corretamente.");
        } else {
            this.setMensagem("Vlan Banda configurado incorretamente.");
        }

        this.setResultado(ret);
        return ret;
    }

}
