/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

import javax.persistence.MappedSuperclass;
import model.Status;

/**
 *
 * @author G0042204
 */
@MappedSuperclass
public class ComponenteGenerico extends AbstractEntity {

    private Status status;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
