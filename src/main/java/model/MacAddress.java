package model;

import java.util.Date;

/**
 * Tiago Henrique Iwamoto
 * tiago.iwamoto@telefonica.com
 * System Analyst
 * 41 9 9513-0230
 **/
public class MacAddress {

    private Integer id;
    private Date dtTimeStamp;
    private String designador;
    private String macAddr;

    public MacAddress() {
    }

    public MacAddress(Date dtTimeStamp, String designador, String macAddr) {
        this.dtTimeStamp = dtTimeStamp;
        this.designador = designador;
        this.macAddr = macAddr;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDtTimeStamp() {
        return dtTimeStamp;
    }

    public void setDtTimeStamp(Date dtTimeStamp) {
        this.dtTimeStamp = dtTimeStamp;
    }

    public String getDesignador() {
        return designador;
    }

    public void setDesignador(String designador) {
        this.designador = designador;
    }

    public String getMacAddr() {
        return macAddr;
    }

    public void setMacAddr(String macAddr) {
        this.macAddr = macAddr;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MacAddress{");
        sb.append("id=").append(id);
        sb.append(", dtTimeStamp=").append(dtTimeStamp);
        sb.append(", designador='").append(designador).append('\'');
        sb.append(", macAddr='").append(macAddr).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
