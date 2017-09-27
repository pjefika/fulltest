/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import br.net.gvt.efika.customer.EfikaCustomer;
import br.net.gvt.efika.customer.TipoRede;
import dao.dslam.impl.ConsultaClienteInter;
import model.dslam.config.ConfiguracaoPorta;

/**
 *
 * @author G0042204
 */
public class ConfigPortaServiceImpl extends ConfigGenericService implements ConfigPortaService<ConfiguracaoPorta> {

    public ConfigPortaServiceImpl(EfikaCustomer ec) {
        super(ec);
    }

    @Override
    public ConsultaClienteInter consulta() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ConfiguracaoPorta consultar() throws Exception {
        if(this.getEc().getRede().getTipo() == TipoRede.GPON){
            return FactoryService.createConfigOLTService(this.getEc()).consultar();
        }else{
            return FactoryService.createConfigDslamService(this.getEc()).consultar();
        }        
    }

  

}
