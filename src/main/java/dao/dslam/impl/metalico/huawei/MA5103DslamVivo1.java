/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.metalico.huawei;

import br.net.gvt.efika.fulltest.model.telecom.velocidade.Velocidades;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author G0041775
 */
public class MA5103DslamVivo1 extends MA5100DslamVivo1{
    
    public MA5103DslamVivo1(String ipDslam) {
        super(ipDslam);
    }
    
    @Override
    protected Velocidades compareV1Metalico(String sintaxVendor, Boolean isDown) {
        String wichone = isDown ? "D" : "U";
        String checkType = isDown ? "D_" : "U_";
        if (sintaxVendor.contains(checkType)) {
            String[] leprof = sintaxVendor.split("_");
            Double profVendor = 0d;

            for (int i = 0; i < leprof.length; i++) {
                if (leprof[i].contains(wichone)) {
                    profVendor = new Double(leprof[i - 1]) / 1000;
                    System.out.println("profVendor->" + profVendor);
                }
            }
            Velocidades[] vels = Velocidades.values();
            for (int i = 0; i < vels.length; i++) {
                Double leVel = new Double(vels[i].getValor());
                System.out.println("leVel->" + leVel);
                if (leVel.compareTo(profVendor) > 0) {
                    return vels[i - 1];
                }
            }
        } else {
            String[] leprof = sintaxVendor.replaceAll("[a-z]?[A-Z]", "").split("_");
            List<Integer> vals = new ArrayList<>();
            for (String string : leprof) {
                if (!string.isEmpty()) {
                    vals.add(new Integer(string));
                }
            }
            Collections.sort(vals);
            Integer qual = isDown ? vals.get(vals.size()-1) : vals.get(vals.size()-2);
            Double profVendor = new Double(qual) / 1000;
            System.out.println("profVendor->"+profVendor);
            Velocidades[] vels = Velocidades.values();
            for (int i = 0; i < vels.length; i++) {
                Double leVel = new Double(vels[i].getValor());
                System.out.println("leVel->" + leVel);
                if (leVel.compareTo(profVendor) > 0) {
                    return vels[i - 1];
                }
            }
        }

        return null;
    }
    
}
