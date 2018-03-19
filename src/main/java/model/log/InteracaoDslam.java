/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.log;

import br.net.gvt.efika.mongo.model.entity.AbstractMongoEntity;
import dao.dslam.impl.AbstractDslam;
import dao.dslam.impl.ComandoDslam;
import java.util.Calendar;
import java.util.Date;
import org.mongodb.morphia.annotations.PrePersist;

/**
 *
 * @author G0041775
 */
public class InteracaoDslam extends AbstractMongoEntity {

    private ComandoDslam comandoDslam;

    private AbstractDslam dslam;

    public InteracaoDslam() {
    }

    public InteracaoDslam(ComandoDslam comandoDslam, AbstractDslam dslam) {
        this.comandoDslam = comandoDslam;
        this.dslam = dslam;
    }

    public ComandoDslam getComandoDslam() {
        return comandoDslam;
    }

    public void setComandoDslam(ComandoDslam comandoDslam) {
        this.comandoDslam = comandoDslam;
    }

    public AbstractDslam getDslam() {
        return dslam;
    }

    public void setDslam(AbstractDslam dslam) {
        this.dslam = dslam;
    }

}
