/**
 * ValidateTbsSwitchDivergencyOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.uraservices;

public class ValidateTbsSwitchDivergencyOut  implements java.io.Serializable {
    private java.lang.String armarioOptico;

    private java.lang.String mensagemResultado;

    private java.lang.String portaLogica;

    private java.lang.String shasta;

    private java.lang.String shelf;

    private int statusResultado;

    private java.lang.String vlan;

    public ValidateTbsSwitchDivergencyOut() {
    }

    public ValidateTbsSwitchDivergencyOut(
           java.lang.String armarioOptico,
           java.lang.String mensagemResultado,
           java.lang.String portaLogica,
           java.lang.String shasta,
           java.lang.String shelf,
           int statusResultado,
           java.lang.String vlan) {
           this.armarioOptico = armarioOptico;
           this.mensagemResultado = mensagemResultado;
           this.portaLogica = portaLogica;
           this.shasta = shasta;
           this.shelf = shelf;
           this.statusResultado = statusResultado;
           this.vlan = vlan;
    }


    /**
     * Gets the armarioOptico value for this ValidateTbsSwitchDivergencyOut.
     * 
     * @return armarioOptico
     */
    public java.lang.String getArmarioOptico() {
        return armarioOptico;
    }


    /**
     * Sets the armarioOptico value for this ValidateTbsSwitchDivergencyOut.
     * 
     * @param armarioOptico
     */
    public void setArmarioOptico(java.lang.String armarioOptico) {
        this.armarioOptico = armarioOptico;
    }


    /**
     * Gets the mensagemResultado value for this ValidateTbsSwitchDivergencyOut.
     * 
     * @return mensagemResultado
     */
    public java.lang.String getMensagemResultado() {
        return mensagemResultado;
    }


    /**
     * Sets the mensagemResultado value for this ValidateTbsSwitchDivergencyOut.
     * 
     * @param mensagemResultado
     */
    public void setMensagemResultado(java.lang.String mensagemResultado) {
        this.mensagemResultado = mensagemResultado;
    }


    /**
     * Gets the portaLogica value for this ValidateTbsSwitchDivergencyOut.
     * 
     * @return portaLogica
     */
    public java.lang.String getPortaLogica() {
        return portaLogica;
    }


    /**
     * Sets the portaLogica value for this ValidateTbsSwitchDivergencyOut.
     * 
     * @param portaLogica
     */
    public void setPortaLogica(java.lang.String portaLogica) {
        this.portaLogica = portaLogica;
    }


    /**
     * Gets the shasta value for this ValidateTbsSwitchDivergencyOut.
     * 
     * @return shasta
     */
    public java.lang.String getShasta() {
        return shasta;
    }


    /**
     * Sets the shasta value for this ValidateTbsSwitchDivergencyOut.
     * 
     * @param shasta
     */
    public void setShasta(java.lang.String shasta) {
        this.shasta = shasta;
    }


    /**
     * Gets the shelf value for this ValidateTbsSwitchDivergencyOut.
     * 
     * @return shelf
     */
    public java.lang.String getShelf() {
        return shelf;
    }


    /**
     * Sets the shelf value for this ValidateTbsSwitchDivergencyOut.
     * 
     * @param shelf
     */
    public void setShelf(java.lang.String shelf) {
        this.shelf = shelf;
    }


    /**
     * Gets the statusResultado value for this ValidateTbsSwitchDivergencyOut.
     * 
     * @return statusResultado
     */
    public int getStatusResultado() {
        return statusResultado;
    }


    /**
     * Sets the statusResultado value for this ValidateTbsSwitchDivergencyOut.
     * 
     * @param statusResultado
     */
    public void setStatusResultado(int statusResultado) {
        this.statusResultado = statusResultado;
    }


    /**
     * Gets the vlan value for this ValidateTbsSwitchDivergencyOut.
     * 
     * @return vlan
     */
    public java.lang.String getVlan() {
        return vlan;
    }


    /**
     * Sets the vlan value for this ValidateTbsSwitchDivergencyOut.
     * 
     * @param vlan
     */
    public void setVlan(java.lang.String vlan) {
        this.vlan = vlan;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidateTbsSwitchDivergencyOut)) return false;
        ValidateTbsSwitchDivergencyOut other = (ValidateTbsSwitchDivergencyOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.armarioOptico==null && other.getArmarioOptico()==null) || 
             (this.armarioOptico!=null &&
              this.armarioOptico.equals(other.getArmarioOptico()))) &&
            ((this.mensagemResultado==null && other.getMensagemResultado()==null) || 
             (this.mensagemResultado!=null &&
              this.mensagemResultado.equals(other.getMensagemResultado()))) &&
            ((this.portaLogica==null && other.getPortaLogica()==null) || 
             (this.portaLogica!=null &&
              this.portaLogica.equals(other.getPortaLogica()))) &&
            ((this.shasta==null && other.getShasta()==null) || 
             (this.shasta!=null &&
              this.shasta.equals(other.getShasta()))) &&
            ((this.shelf==null && other.getShelf()==null) || 
             (this.shelf!=null &&
              this.shelf.equals(other.getShelf()))) &&
            this.statusResultado == other.getStatusResultado() &&
            ((this.vlan==null && other.getVlan()==null) || 
             (this.vlan!=null &&
              this.vlan.equals(other.getVlan())));
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
        if (getArmarioOptico() != null) {
            _hashCode += getArmarioOptico().hashCode();
        }
        if (getMensagemResultado() != null) {
            _hashCode += getMensagemResultado().hashCode();
        }
        if (getPortaLogica() != null) {
            _hashCode += getPortaLogica().hashCode();
        }
        if (getShasta() != null) {
            _hashCode += getShasta().hashCode();
        }
        if (getShelf() != null) {
            _hashCode += getShelf().hashCode();
        }
        _hashCode += getStatusResultado();
        if (getVlan() != null) {
            _hashCode += getVlan().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidateTbsSwitchDivergencyOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "validateTbsSwitchDivergencyOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("armarioOptico");
        elemField.setXmlName(new javax.xml.namespace.QName("", "armarioOptico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensagemResultado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mensagemResultado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portaLogica");
        elemField.setXmlName(new javax.xml.namespace.QName("", "portaLogica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shasta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shasta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shelf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shelf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusResultado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusResultado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
