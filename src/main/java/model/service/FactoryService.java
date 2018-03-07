/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.efika_customer.model.customer.enums.TipoRede;
import br.net.gvt.efika.fulltest.model.telecom.config.ConfiguracaoDSLAM;
import br.net.gvt.efika.fulltest.model.telecom.config.ConfiguracaoOLT;
import br.net.gvt.efika.fulltest.model.telecom.config.ConfiguracaoPorta;

/**
 *
 * @author G0042204
 */
public class FactoryService {

    public static ConfigPortaService<ConfiguracaoOLT> createConfigOLTService(EfikaCustomer ec) {
        return new ConfigOLTServiceImpl(ec);
    }

    public static ConfigSetterGponService createConfigSetterGponService(EfikaCustomer ec) {
        return new ConfigOLTServiceImpl(ec);
    }

    public static ConfigGetterGponService createConfigGetterGponService(EfikaCustomer ec) {
        return new ConfigOLTServiceImpl(ec);
    }

    public static ConfigSetterService createConfigSetterService(EfikaCustomer ec) {
        return new ConfigPortaServiceImpl(ec);
    }

    public static ConfigSetterSpecific createConfigSpecificSetterService(EfikaCustomer ec) {
        if (ec.getRede().getTipo() == TipoRede.GPON) {
            return new ConfigOLTServiceImpl(ec);
        } else {
            return new ConfigDslamServiceImpl(ec);
        }

    }

    public static ConfigSetterMetalicoService createConfigSetterMetalicoService(EfikaCustomer ec) {
        return new ConfigDslamServiceImpl(ec);
    }

    public static ConfigGetterMetalicoService createConfigGetterMetalicoService(EfikaCustomer ec) {
        return new ConfigDslamServiceImpl(ec);
    }

    public static ConfigPortaService<ConfiguracaoDSLAM> createConfigDslamService(EfikaCustomer ec) {
        return new ConfigDslamServiceImpl(ec);
    }

    public static ConfigPortaService<ConfiguracaoPorta> create(EfikaCustomer ec) {
        return new ConfigPortaServiceImpl(ec);
    }

}
