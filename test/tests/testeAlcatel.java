/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import dao.dslam.telnet.ConsultaDslam;
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
    public static void main(String[] args) throws Exception {

        AlcatelGponDslam dslam = new AlcatelGponDslam();

        dslam.setIpDslam("10.227.26.12");

        System.out.println(dslam.getDumpRafael());

    }

}
