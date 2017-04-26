/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao;

import br.com.gvt.www.ResourceManagement.WorkforceManagement.WorkforceManagementReporting.workOrderReportingEntities.WorkOrder;
import com.gvt.www.ws.eai.oss.OSSTurbonetClienteAutenticado.OSSTurbonetClienteAutenticadoOut;
import model.Motivos;

/**
 *
 * @author G0042204
 */
public class ValidacaoAutenticacao extends Validacao {

    private OSSTurbonetClienteAutenticadoOut auth;

    private WorkOrder order;

    private transient Motivos m;

    public ValidacaoAutenticacao(OSSTurbonetClienteAutenticadoOut auth, WorkOrder order, Motivos ms) {
        this.auth = auth;
        this.order = order;
        this.m = ms;
    }

    /**
     * Houve autenticação após abertura da ordem
     *
     * @return
     */
    @Override
    public Boolean validar() {
        Boolean ret = !(auth.getDataHoraAutenticacao().after(order.getDateOfSale()));
        this.setResultado(ret);
        if (ret) {
            this.setMensagem("Não existe autenticação após abertura da atividade.");
        } else {
            this.setMensagem("Existe autenticação após abertura da atividade.");
        }
        if (m.equals(Motivos.SEMSINC)) {
            return true;
        }

        return ret;
    }

}
