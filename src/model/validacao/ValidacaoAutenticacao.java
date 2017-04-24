/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao;

import br.com.gvt.www.ResourceManagement.WorkforceManagement.WorkforceManagementReporting.workOrderReportingEntities.WorkOrder;
import com.gvt.www.ws.eai.oss.OSSTurbonetClienteAutenticado.OSSTurbonetClienteAutenticadoOut;

/**
 *
 * @author G0042204
 */
public class ValidacaoAutenticacao extends Validacao {

    private OSSTurbonetClienteAutenticadoOut auth;

    private WorkOrder order;

    public ValidacaoAutenticacao(OSSTurbonetClienteAutenticadoOut auth, WorkOrder order) {
        this.auth = auth;
        this.order = order;
    }

    /**
     * Houve autenticação após abertura da ordem
     *
     * @return
     */
    @Override
    public Boolean validar() {
        return !(auth.getDataHoraAutenticacao().after(order.getDateOfSale()) && auth.isClienteAutenticado());
    }

}
