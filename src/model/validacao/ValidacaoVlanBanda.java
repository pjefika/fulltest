/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao;

import br.net.gvt.efika.customer.EfikaCustomer;
import model.dslam.consulta.VlanBanda;

/**
 *
 * @author G0042204
 */
public class ValidacaoVlanBanda extends Validacao {

    private transient VlanBanda vlan;
    
    private transient EfikaCustomer e;

    public ValidacaoVlanBanda(VlanBanda v, EfikaCustomer ec) {
        super("Vlan Banda Larga");
        this.vlan = v;
        this.e = ec;
    }

    @Override
    public Boolean validar() {
        if(vlan.validar(e)){
            setMensagem("Vlan de Banda configurado corretamente.");
            setResultado(true);
            return true;
        } else {
            setMensagem("Vlan de Banda configurado incorretamente.\\n Cvlan esperado: "+
                    e.getRede().getCvLan()+" - Cvlan configurado: "+vlan.getCvlan()+
                    "\\n Svlan esperado: "+ e.getRede().getRin()+ " - Svlan configurado: "+vlan.getSvlan()+
                    "\\n Estado Vlan: "+vlan.getState().toString());
            setResultado(false);
        }
        
        return false;
    }

}
