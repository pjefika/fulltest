/**
 * OSSTurbonetChangeRateIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.OSSTurbonetChangeRate;

public class OSSTurbonetChangeRateIn  implements java.io.Serializable {
    private com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetIn ossTurbonetIn;

    private java.lang.String protocolo;

    private java.lang.String atualVelDownUp;

    private java.math.BigInteger novaVelDown;

    private java.math.BigInteger novaVelUp;

    public OSSTurbonetChangeRateIn() {
    }

    public OSSTurbonetChangeRateIn(
           com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetIn ossTurbonetIn,
           java.lang.String protocolo,
           java.lang.String atualVelDownUp,
           java.math.BigInteger novaVelDown,
           java.math.BigInteger novaVelUp) {
           this.ossTurbonetIn = ossTurbonetIn;
           this.protocolo = protocolo;
           this.atualVelDownUp = atualVelDownUp;
           this.novaVelDown = novaVelDown;
           this.novaVelUp = novaVelUp;
    }


    /**
     * Gets the ossTurbonetIn value for this OSSTurbonetChangeRateIn.
     * 
     * @return ossTurbonetIn
     */
    public com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetIn getOssTurbonetIn() {
        return ossTurbonetIn;
    }


    /**
     * Sets the ossTurbonetIn value for this OSSTurbonetChangeRateIn.
     * 
     * @param ossTurbonetIn
     */
    public void setOssTurbonetIn(com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetIn ossTurbonetIn) {
        this.ossTurbonetIn = ossTurbonetIn;
    }


    /**
     * Gets the protocolo value for this OSSTurbonetChangeRateIn.
     * 
     * @return protocolo
     */
    public java.lang.String getProtocolo() {
        return protocolo;
    }


    /**
     * Sets the protocolo value for this OSSTurbonetChangeRateIn.
     * 
     * @param protocolo
     */
    public void setProtocolo(java.lang.String protocolo) {
        this.protocolo = protocolo;
    }


    /**
     * Gets the atualVelDownUp value for this OSSTurbonetChangeRateIn.
     * 
     * @return atualVelDownUp
     */
    public java.lang.String getAtualVelDownUp() {
        return atualVelDownUp;
    }


    /**
     * Sets the atualVelDownUp value for this OSSTurbonetChangeRateIn.
     * 
     * @param atualVelDownUp
     */
    public void setAtualVelDownUp(java.lang.String atualVelDownUp) {
        this.atualVelDownUp = atualVelDownUp;
    }


    /**
     * Gets the novaVelDown value for this OSSTurbonetChangeRateIn.
     * 
     * @return novaVelDown
     */
    public java.math.BigInteger getNovaVelDown() {
        return novaVelDown;
    }


    /**
     * Sets the novaVelDown value for this OSSTurbonetChangeRateIn.
     * 
     * @param novaVelDown
     */
    public void setNovaVelDown(java.math.BigInteger novaVelDown) {
        this.novaVelDown = novaVelDown;
    }


    /**
     * Gets the novaVelUp value for this OSSTurbonetChangeRateIn.
     * 
     * @return novaVelUp
     */
    public java.math.BigInteger getNovaVelUp() {
        return novaVelUp;
    }


    /**
     * Sets the novaVelUp value for this OSSTurbonetChangeRateIn.
     * 
     * @param novaVelUp
     */
    public void setNovaVelUp(java.math.BigInteger novaVelUp) {
        this.novaVelUp = novaVelUp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OSSTurbonetChangeRateIn)) return false;
        OSSTurbonetChangeRateIn other = (OSSTurbonetChangeRateIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ossTurbonetIn==null && other.getOssTurbonetIn()==null) || 
             (this.ossTurbonetIn!=null &&
              this.ossTurbonetIn.equals(other.getOssTurbonetIn()))) &&
            ((this.protocolo==null && other.getProtocolo()==null) || 
             (this.protocolo!=null &&
              this.protocolo.equals(other.getProtocolo()))) &&
            ((this.atualVelDownUp==null && other.getAtualVelDownUp()==null) || 
             (this.atualVelDownUp!=null &&
              this.atualVelDownUp.equals(other.getAtualVelDownUp()))) &&
            ((this.novaVelDown==null && other.getNovaVelDown()==null) || 
             (this.novaVelDown!=null &&
              this.novaVelDown.equals(other.getNovaVelDown()))) &&
            ((this.novaVelUp==null && other.getNovaVelUp()==null) || 
             (this.novaVelUp!=null &&
              this.novaVelUp.equals(other.getNovaVelUp())));
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
        if (getOssTurbonetIn() != null) {
            _hashCode += getOssTurbonetIn().hashCode();
        }
        if (getProtocolo() != null) {
            _hashCode += getProtocolo().hashCode();
        }
        if (getAtualVelDownUp() != null) {
            _hashCode += getAtualVelDownUp().hashCode();
        }
        if (getNovaVelDown() != null) {
            _hashCode += getNovaVelDown().hashCode();
        }
        if (getNovaVelUp() != null) {
            _hashCode += getNovaVelUp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OSSTurbonetChangeRateIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetChangeRate", "OSSTurbonetChangeRateIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ossTurbonetIn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "ossTurbonetIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "OSSTurbonetIn"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocolo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetChangeRate", "protocolo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atualVelDownUp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetChangeRate", "atualVelDownUp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("novaVelDown");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetChangeRate", "novaVelDown"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("novaVelUp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetChangeRate", "novaVelUp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
