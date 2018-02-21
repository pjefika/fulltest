/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.log;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import dao.InterfaceDAO;
import java.util.List;
import model.entity.manobra.LogManobra;

/**
 *
 * @author G0042204
 */
public interface ManobraDAO extends InterfaceDAO<LogManobra> {

    public List<LogManobra> listarLogManobraPorCustomer(EfikaCustomer e) throws Exception;

}
