/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.metalico.huawei;

import br.net.gvt.efika.fulltest.exception.FalhaAoExecutarComandoException;
import br.net.gvt.efika.fulltest.model.telecom.config.ComandoDslam;
import br.net.gvt.efika.fulltest.model.telecom.properties.ValidavelAbs;
import dao.dslam.impl.login.LoginDslamStrategy;
import dao.dslam.impl.metalico.DslamMetalicoVivo1;
import model.dslam.credencial.Credencial;

/**
 *
 * @author G0041775
 */
public abstract class HuaweiDslamMetalicoVivo1 extends DslamMetalicoVivo1 {

    public HuaweiDslamMetalicoVivo1(String ipDslam, Credencial credencial, LoginDslamStrategy loginStrategy) {
        super(ipDslam, credencial, loginStrategy);
    }

    protected String getCommBlob(ComandoDslam command) throws Exception {
        String blob = getCd().consulta(command).getBlob();
        if (blob.contains("is busy")) {
            Thread.sleep(7500);
            blob = getCd().consulta(command).getBlob();
            if (blob.contains("is busy")) {
                throw new FalhaAoExecutarComandoException();
            }
        }
        return blob;
    }

    protected ValidavelAbs execComm(ComandoDslam command, ValidavelAbs v) throws Exception {
        ComandoDslam cmd = getCd().consulta(command);
        v.addInteracao(cmd);
        String blob = cmd.getBlob();
        if (blob.contains("is busy")) {
            Thread.sleep(7500);
            cmd = getCd().consulta(command);
            v.addInteracao(cmd);
            blob = cmd.getBlob();
            if (blob.contains("is busy")) {
                throw new FalhaAoExecutarComandoException();
            }
        }
        return v;
    }

}
