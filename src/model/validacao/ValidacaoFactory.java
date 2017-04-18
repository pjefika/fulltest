/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao;

import java.util.ArrayList;
import java.util.List;
import model.Motivos;
import model.entity.Cliente;

/**
 *
 * @author G0042204
 */
public class ValidacaoFactory {

    private Cliente cl;

    public ValidacaoFactory(Cliente cl) {
        this.cl = cl;
    }

    public List<Validacao> getValids(Motivos m) {
        List<Validacao> vls = new ArrayList<>();
        
//        if(m.equals(Motivos.SEMSINC)){
//            vls.add(new ValidacaoEstadoPorta())
//        }else if(m.equals(Motivos.SEMAUTH)){
//        
//        }else if(m.equals(Motivos.MUDA)){
//            
//        }

        vls.add(new ValidacaoCadastroTBS(cl.getCadastro(), cl.getIncon()));

        return vls;
    }

}
