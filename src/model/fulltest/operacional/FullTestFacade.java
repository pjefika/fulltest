/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.factory.exception.DslamNaoImplException;
import dao.dslam.factory.exception.FuncIndisponivelDslamException;
import dao.dslam.impl.AbstractDslam;
import dao.dslam.impl.ConsultaClienteInter;
import java.util.Calendar;
import java.util.List;
import model.validacao.Validacao;

/**
 *
 * @author g0042204
 */
public abstract class FullTestFacade {

    protected EfikaCustomer cl;

    protected List<Validacao> bateria;

    protected List<Validacao> valids;

    protected Calendar dataInicio;

    protected Calendar dataFim;

    protected String mensagem;

    protected Boolean resultado;

    protected AbstractDslam dslam;

    protected ConsultaClienteInter consulta;

    public FullTestFacade(EfikaCustomer cl) throws DslamNaoImplException, FuncIndisponivelDslamException {
        this.cl = cl;
    }

    protected abstract void preparaDslam() throws DslamNaoImplException;

    protected abstract void preparaBateria();

    public List<Validacao> getValids() {
        return valids;
    }

}
