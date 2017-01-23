/**
 * CriterioBuscaAssinante.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.consultaInfoAssinante;

public class CriterioBuscaAssinante  implements java.io.Serializable {
    private java.lang.String designadorTv;

    public CriterioBuscaAssinante() {
    }

    public CriterioBuscaAssinante(
           java.lang.String designadorTv) {
           this.designadorTv = designadorTv;
    }


    /**
     * Gets the designadorTv value for this CriterioBuscaAssinante.
     * 
     * @return designadorTv
     */
    public java.lang.String getDesignadorTv() {
        return designadorTv;
    }


    /**
     * Sets the designadorTv value for this CriterioBuscaAssinante.
     * 
     * @param designadorTv
     */
    public void setDesignadorTv(java.lang.String designadorTv) {
        this.designadorTv = designadorTv;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CriterioBuscaAssinante)) return false;
        CriterioBuscaAssinante other = (CriterioBuscaAssinante) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.designadorTv==null && other.getDesignadorTv()==null) || 
             (this.designadorTv!=null &&
              this.designadorTv.equals(other.getDesignadorTv())));
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
        if (getDesignadorTv() != null) {
            _hashCode += getDesignadorTv().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CriterioBuscaAssinante.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/consultaInfoAssinante", "CriterioBuscaAssinante"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designadorTv");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/consultaInfoAssinante", "designadorTv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
