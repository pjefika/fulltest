/**
 * ManobraDslamGponIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.gpon;

public class ManobraDslamGponIn  implements java.io.Serializable {
    private java.lang.String designadorAcesso;

    private com.gvt.www.ws.eai.oss.gpon.ManobraDe manobraDe;

    private com.gvt.www.ws.eai.oss.gpon.ManobraPara manobaPara;

    public ManobraDslamGponIn() {
    }

    public ManobraDslamGponIn(
           java.lang.String designadorAcesso,
           com.gvt.www.ws.eai.oss.gpon.ManobraDe manobraDe,
           com.gvt.www.ws.eai.oss.gpon.ManobraPara manobaPara) {
           this.designadorAcesso = designadorAcesso;
           this.manobraDe = manobraDe;
           this.manobaPara = manobaPara;
    }


    /**
     * Gets the designadorAcesso value for this ManobraDslamGponIn.
     * 
     * @return designadorAcesso
     */
    public java.lang.String getDesignadorAcesso() {
        return designadorAcesso;
    }


    /**
     * Sets the designadorAcesso value for this ManobraDslamGponIn.
     * 
     * @param designadorAcesso
     */
    public void setDesignadorAcesso(java.lang.String designadorAcesso) {
        this.designadorAcesso = designadorAcesso;
    }


    /**
     * Gets the manobraDe value for this ManobraDslamGponIn.
     * 
     * @return manobraDe
     */
    public com.gvt.www.ws.eai.oss.gpon.ManobraDe getManobraDe() {
        return manobraDe;
    }


    /**
     * Sets the manobraDe value for this ManobraDslamGponIn.
     * 
     * @param manobraDe
     */
    public void setManobraDe(com.gvt.www.ws.eai.oss.gpon.ManobraDe manobraDe) {
        this.manobraDe = manobraDe;
    }


    /**
     * Gets the manobaPara value for this ManobraDslamGponIn.
     * 
     * @return manobaPara
     */
    public com.gvt.www.ws.eai.oss.gpon.ManobraPara getManobaPara() {
        return manobaPara;
    }


    /**
     * Sets the manobaPara value for this ManobraDslamGponIn.
     * 
     * @param manobaPara
     */
    public void setManobaPara(com.gvt.www.ws.eai.oss.gpon.ManobraPara manobaPara) {
        this.manobaPara = manobaPara;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManobraDslamGponIn)) return false;
        ManobraDslamGponIn other = (ManobraDslamGponIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.designadorAcesso==null && other.getDesignadorAcesso()==null) || 
             (this.designadorAcesso!=null &&
              this.designadorAcesso.equals(other.getDesignadorAcesso()))) &&
            ((this.manobraDe==null && other.getManobraDe()==null) || 
             (this.manobraDe!=null &&
              this.manobraDe.equals(other.getManobraDe()))) &&
            ((this.manobaPara==null && other.getManobaPara()==null) || 
             (this.manobaPara!=null &&
              this.manobaPara.equals(other.getManobaPara())));
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
        if (getDesignadorAcesso() != null) {
            _hashCode += getDesignadorAcesso().hashCode();
        }
        if (getManobraDe() != null) {
            _hashCode += getManobraDe().hashCode();
        }
        if (getManobaPara() != null) {
            _hashCode += getManobaPara().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManobraDslamGponIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "ManobraDslamGponIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designadorAcesso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "designadorAcesso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manobraDe");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "manobraDe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "ManobraDe"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manobaPara");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "manobaPara"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "ManobraPara"));
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
