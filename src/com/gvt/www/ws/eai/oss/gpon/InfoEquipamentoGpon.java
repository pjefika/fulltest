/**
 * InfoEquipamentoGpon.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.gpon;

public class InfoEquipamentoGpon  implements java.io.Serializable {
    private java.lang.String statusUplink;

    private java.lang.String statusPorta;

    private int profileDownload;

    private int profileUpload;

    private java.lang.String serialOnt;

    private java.lang.String vendorOnt;

    private float potenciaOnt;

    private float potenciaOlt;

    private float distanciaOltOnt;

    public InfoEquipamentoGpon() {
    }

    public InfoEquipamentoGpon(
           java.lang.String statusUplink,
           java.lang.String statusPorta,
           int profileDownload,
           int profileUpload,
           java.lang.String serialOnt,
           java.lang.String vendorOnt,
           float potenciaOnt,
           float potenciaOlt,
           float distanciaOltOnt) {
           this.statusUplink = statusUplink;
           this.statusPorta = statusPorta;
           this.profileDownload = profileDownload;
           this.profileUpload = profileUpload;
           this.serialOnt = serialOnt;
           this.vendorOnt = vendorOnt;
           this.potenciaOnt = potenciaOnt;
           this.potenciaOlt = potenciaOlt;
           this.distanciaOltOnt = distanciaOltOnt;
    }


    /**
     * Gets the statusUplink value for this InfoEquipamentoGpon.
     * 
     * @return statusUplink
     */
    public java.lang.String getStatusUplink() {
        return statusUplink;
    }


    /**
     * Sets the statusUplink value for this InfoEquipamentoGpon.
     * 
     * @param statusUplink
     */
    public void setStatusUplink(java.lang.String statusUplink) {
        this.statusUplink = statusUplink;
    }


    /**
     * Gets the statusPorta value for this InfoEquipamentoGpon.
     * 
     * @return statusPorta
     */
    public java.lang.String getStatusPorta() {
        return statusPorta;
    }


    /**
     * Sets the statusPorta value for this InfoEquipamentoGpon.
     * 
     * @param statusPorta
     */
    public void setStatusPorta(java.lang.String statusPorta) {
        this.statusPorta = statusPorta;
    }


    /**
     * Gets the profileDownload value for this InfoEquipamentoGpon.
     * 
     * @return profileDownload
     */
    public int getProfileDownload() {
        return profileDownload;
    }


    /**
     * Sets the profileDownload value for this InfoEquipamentoGpon.
     * 
     * @param profileDownload
     */
    public void setProfileDownload(int profileDownload) {
        this.profileDownload = profileDownload;
    }


    /**
     * Gets the profileUpload value for this InfoEquipamentoGpon.
     * 
     * @return profileUpload
     */
    public int getProfileUpload() {
        return profileUpload;
    }


    /**
     * Sets the profileUpload value for this InfoEquipamentoGpon.
     * 
     * @param profileUpload
     */
    public void setProfileUpload(int profileUpload) {
        this.profileUpload = profileUpload;
    }


    /**
     * Gets the serialOnt value for this InfoEquipamentoGpon.
     * 
     * @return serialOnt
     */
    public java.lang.String getSerialOnt() {
        return serialOnt;
    }


    /**
     * Sets the serialOnt value for this InfoEquipamentoGpon.
     * 
     * @param serialOnt
     */
    public void setSerialOnt(java.lang.String serialOnt) {
        this.serialOnt = serialOnt;
    }


    /**
     * Gets the vendorOnt value for this InfoEquipamentoGpon.
     * 
     * @return vendorOnt
     */
    public java.lang.String getVendorOnt() {
        return vendorOnt;
    }


    /**
     * Sets the vendorOnt value for this InfoEquipamentoGpon.
     * 
     * @param vendorOnt
     */
    public void setVendorOnt(java.lang.String vendorOnt) {
        this.vendorOnt = vendorOnt;
    }


    /**
     * Gets the potenciaOnt value for this InfoEquipamentoGpon.
     * 
     * @return potenciaOnt
     */
    public float getPotenciaOnt() {
        return potenciaOnt;
    }


    /**
     * Sets the potenciaOnt value for this InfoEquipamentoGpon.
     * 
     * @param potenciaOnt
     */
    public void setPotenciaOnt(float potenciaOnt) {
        this.potenciaOnt = potenciaOnt;
    }


    /**
     * Gets the potenciaOlt value for this InfoEquipamentoGpon.
     * 
     * @return potenciaOlt
     */
    public float getPotenciaOlt() {
        return potenciaOlt;
    }


    /**
     * Sets the potenciaOlt value for this InfoEquipamentoGpon.
     * 
     * @param potenciaOlt
     */
    public void setPotenciaOlt(float potenciaOlt) {
        this.potenciaOlt = potenciaOlt;
    }


    /**
     * Gets the distanciaOltOnt value for this InfoEquipamentoGpon.
     * 
     * @return distanciaOltOnt
     */
    public float getDistanciaOltOnt() {
        return distanciaOltOnt;
    }


    /**
     * Sets the distanciaOltOnt value for this InfoEquipamentoGpon.
     * 
     * @param distanciaOltOnt
     */
    public void setDistanciaOltOnt(float distanciaOltOnt) {
        this.distanciaOltOnt = distanciaOltOnt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InfoEquipamentoGpon)) return false;
        InfoEquipamentoGpon other = (InfoEquipamentoGpon) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.statusUplink==null && other.getStatusUplink()==null) || 
             (this.statusUplink!=null &&
              this.statusUplink.equals(other.getStatusUplink()))) &&
            ((this.statusPorta==null && other.getStatusPorta()==null) || 
             (this.statusPorta!=null &&
              this.statusPorta.equals(other.getStatusPorta()))) &&
            this.profileDownload == other.getProfileDownload() &&
            this.profileUpload == other.getProfileUpload() &&
            ((this.serialOnt==null && other.getSerialOnt()==null) || 
             (this.serialOnt!=null &&
              this.serialOnt.equals(other.getSerialOnt()))) &&
            ((this.vendorOnt==null && other.getVendorOnt()==null) || 
             (this.vendorOnt!=null &&
              this.vendorOnt.equals(other.getVendorOnt()))) &&
            this.potenciaOnt == other.getPotenciaOnt() &&
            this.potenciaOlt == other.getPotenciaOlt() &&
            this.distanciaOltOnt == other.getDistanciaOltOnt();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getStatusUplink() != null) {
            _hashCode += getStatusUplink().hashCode();
        }
        if (getStatusPorta() != null) {
            _hashCode += getStatusPorta().hashCode();
        }
        _hashCode += getProfileDownload();
        _hashCode += getProfileUpload();
        if (getSerialOnt() != null) {
            _hashCode += getSerialOnt().hashCode();
        }
        if (getVendorOnt() != null) {
            _hashCode += getVendorOnt().hashCode();
        }
        _hashCode += new Float(getPotenciaOnt()).hashCode();
        _hashCode += new Float(getPotenciaOlt()).hashCode();
        _hashCode += new Float(getDistanciaOltOnt()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InfoEquipamentoGpon.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "InfoEquipamentoGpon"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusUplink");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "statusUplink"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusPorta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "statusPorta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileDownload");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "profileDownload"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileUpload");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "profileUpload"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialOnt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "serialOnt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorOnt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "vendorOnt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("potenciaOnt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "potenciaOnt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("potenciaOlt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "potenciaOlt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distanciaOltOnt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "distanciaOltOnt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
