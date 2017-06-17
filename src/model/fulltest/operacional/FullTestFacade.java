/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional;

import br.net.gvt.efika.customer.EfikaCustomer;
import dao.dslam.factory.exception.DslamNaoImplException;
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

    public FullTestFacade(EfikaCustomer cl) throws DslamNaoImplException {
        this.cl = cl;
        preparaDslam();
        preparaBateria();
    }

    protected abstract void preparaDslam() throws DslamNaoImplException;
    
    protected abstract void preparaBateria();
}
