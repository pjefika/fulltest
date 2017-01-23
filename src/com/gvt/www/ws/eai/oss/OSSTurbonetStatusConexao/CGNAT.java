/**
 * CGNAT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.OSSTurbonetStatusConexao;

public class CGNAT  implements java.io.Serializable {
    private com.gvt.www.ws.eai.oss.CGNAT.StatusCGNAT status;

    private com.gvt.www.ws.eai.oss.CGNAT.DadosCGNAT dados;

    public CGNAT() {
    }

    public CGNAT(
           com.gvt.www.ws.eai.oss.CGNAT.StatusCGNAT status,
           com.gvt.www.ws.eai.oss.CGNAT.DadosCGNAT dados) {
           this.status = status;
           this.dados = dados;
    }


    /**
     * Gets the status value for this CGNAT.
     * 
     * @return status
     */
    public com.gvt.www.ws.eai.oss.CGNAT.StatusCGNAT getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CGNAT.
     * 
     * @param status
     */
    public void setStatus(com.gvt.www.ws.eai.oss.CGNAT.StatusCGNAT status) {
        this.status = status;
    }


    /**
     * Gets the dados value for this CGNAT.
     * 
     * @return dados
     */
    public com.gvt.www.ws.eai.oss.CGNAT.DadosCGNAT getDados() {
        return dados;
    }


    /**
     * Sets the dados value for this CGNAT.
     * 
     * @param dados
     */
    public void setDados(com.gvt.www.ws.eai.oss.CGNAT.DadosCGNAT dados) {
        this.dados = dados;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CGNAT)) return false;
        CGNAT other = (CGNAT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.dados==null && other.getDados()==null) || 
             (this.dados!=null &&
              this.dados.equals(other.getDados())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getDados() != null) {
            _hashCode += getDados().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CGNAT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetStatusConexao", "CGNAT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetStatusConexao", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/CGNAT", "StatusCGNAT"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dados");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetStatusConexao", "dados"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/CGNAT", "DadosCGNAT"));
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
