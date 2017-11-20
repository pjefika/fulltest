/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dslam.consulta;

/**
 *
 * @author G0034481
 */
public class StatusSlot {

    private String slot;
    private String actualType;
    private Boolean enabled;
    private String errorStatus;
    private String avialability;
    private Integer restrtCnt;

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public String getActualType() {
        return actualType;
    }

    public void setActualType(String actualType) {
        this.actualType = actualType;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getErrorStatus() {
        return errorStatus;
    }

    public void setErrorStatus(String errorStatus) {
        this.errorStatus = errorStatus;
    }

    public String getAvialability() {
        return avialability;
    }

    public void setAvialability(String avialability) {
        this.avialability = avialability;
    }

    public Integer getRestrtCnt() {
        return restrtCnt;
    }

    public void setRestrtCnt(Integer restrtCnt) {
        this.restrtCnt = restrtCnt;
    }

}
