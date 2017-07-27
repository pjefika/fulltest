/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manobra.analitcs;

import br.net.gvt.efika.customer.CustomerAssert;
import java.util.List;
import model.manobra.MotivoManobraEnum;

/**
 *
 * @author G0042204
 */
public abstract class AnaliseMotivoAbstract {

    private final MotivoManobraEnum motivo;

    private final List<CustomerAssert> cas;

    public AnaliseMotivoAbstract(MotivoManobraEnum motivo, List<CustomerAssert> cas) {
        this.motivo = motivo;
        this.cas = cas;
    }
    
    protected abstract List<CustomerAssert> criterio();

}
