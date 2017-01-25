/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import dao.cadastro.CadastroDAO;
import model.fulltest.FullTestFacade;

/**
 *
 * @author G0042204
 */
public class testRefactoringSocketClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        CadastroDAO dao = new CadastroDAO();

        FullTestFacade f = new FullTestFacade(dao.montaDslamGpon("1630105408"));

        f.dev();

    }

}
