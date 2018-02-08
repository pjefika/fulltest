/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl;

/**
 *
 * @author G0041775
 */
public class ConsultaDslam1023Vivo1 extends ConsultaDslamVivo1 {

    public ConsultaDslam1023Vivo1(AbstractDslam dslam) {
        super(dslam);
    }

    @Override
    public void execComm(String sintax, Integer sleep) {
        out.print(sintax);
        out.flush();
        try {
            Thread.sleep(sleep);
        } catch (Exception e) {
        }
    }

}
