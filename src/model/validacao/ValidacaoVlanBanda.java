/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.impl.AbstractDslam;
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

    public Boolean validar(EfikaCustomer e) {
        Boolean ret = vlanBanda.validar(e);
        if (ret) {
            this.setMensagem("Vlan Banda configurado corretamente.");
        } else {
            this.setMensagem("Vlan Banda configurado incorretamente.");
        }

        this.setResultado(ret);
        return ret;
    }

    @Override
    public Boolean validar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
