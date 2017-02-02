/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.massivo;

import model.fulltest.BackgroudTestSingleton;

/**
 *
 * @author G0042204
 */
public class BackgroundTestController {

    private BackgroudTestSingleton sing;

    public BackgroundTestController() {
        this.sing = BackgroudTestSingleton.getInstance();
    }

}
