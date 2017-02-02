/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import dao.cadastro.CadastroDAO;
import model.dslam.AbstractDslam;
import model.dslam.consulta.ConsultaGponDefault;
import model.fulltest.FullTestFacade;
import model.fulltest.validacao.ValidacaoFacade;

/**
 *
 * @author G0042204
 */
public class testRefactoringSocketClass {

    /**
     * Alcatel: 7530301249 | Zhone: 7130520294 - 1630143618 | Keymile: 7930272843 - 3125714804
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        CadastroDAO dao = new CadastroDAO();

        try {

            AbstractDslam ds = dao.getDslam("3125714804");
            FullTestFacade f = new FullTestFacade(ds);

//            f.estadoPorta();
//            f.serialOnt();
//            f.consultaParametros();
//            f.consultaVlanBanda();
//            f.consultaVlanVoip();
//            f.consultaVlanVod();
//            f.consultaVlanMulticast();
//            f.consultaAlarmes();
//            f.consultaProfile();

            ValidacaoFacade v = new ValidacaoFacade((ConsultaGponDefault) ds);
            
            v.validar();
            
            f.close();
            
            

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
