/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.cadastro.util;

import com.gvt.ws.eai.oss.inventory.api.Designator;
import com.gvt.ws.eai.oss.inventory.api.InventoryDesignatorsResponse;
import model.entity.Cliente;

/**
 *
 * @author G0042204
 */
public class TratativaDesignadores {

    private InventoryDesignatorsResponse r;

    private Cliente c;

    public TratativaDesignadores(InventoryDesignatorsResponse r, Cliente c) {
        this.r = r;
        this.c = c;
    }

    public Cliente getC() {
        this.tratativa();
        return c;
    }

    protected void tratativa() {
        for (Designator designator : r.getDesignator()) {

            // Instancia
            if (designator.getDesignatorType().getValue().equals(2)) {
                c.setInstancia(designator.getValue());
            }

            // Designador de Banda
            if (designator.getDesignatorType().getValue().equals(3)) {
                c.setDesignador(designator.getValue());
            }
        }

    }

}
