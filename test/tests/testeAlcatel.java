/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import model.dslam.vivo2.gpon.alcatel.AlcatelGponDslam;

/**
 *
 * @author G0042204
 */
public class testeAlcatel {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) {

        try {
            AlcatelGponDslam dslam = new AlcatelGponDslam();
            //AbstractDslam dslam = new ZhoneGponDslam();

            // ZHONE
            //dslam.setIpDslam("10.171.21.86");
            /// ALCATEL
            dslam.setIpDslam("10.171.33.150");
            System.out.println(dslam.getDumpRafael());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
