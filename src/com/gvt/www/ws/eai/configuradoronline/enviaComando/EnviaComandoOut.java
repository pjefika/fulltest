/**
 * EnviaComandoOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.enviaComando;

public class EnviaComandoOut  implements java.io.Serializable {
    private com.gvt.www.metaData.configuradoronline.DadosStatusExecucao statusExecucao;

    private java.lang.String causa;

    private java.lang.Integer sla;

    public EnviaComandoOut() {
    }

    public EnviaComandoOut(
           com.gvt.www.metaData.configuradoronline.DadosStatusExecucao statusExecucao,
           java.lang.String causa,
           java.lang.Integer sla) {
           this.statusExecucao = statusExecucao;
           this.causa = causa;
           this.sla = sla;
    }


    /**
     * Gets the statusExecucao value for this EnviaComandoOut.
     * 
     * @return statusExecucao
     */
    public com.gvt.www.metaData.configuradoronline.DadosStatusExecucao getStatusExecucao() {
        return statusExecucao;
    }


    /**
     * Sets the statusExecucao value for this EnviaComandoOut.
     * 
     * @param statusExecucao
     */
    public void setStatusExecucao(com.gvt.www.metaData.configuradoronline.DadosStatusExecucao statusExecucao) {
        this.statusExecucao = statusExecucao;
    }


    /**
     * Gets the causa value for this EnviaComandoOut.
     * 
     * @return causa
     */
    public java.lang.String getCausa() {
        return causa;
    }


    /**
     * Sets the causa value for this EnviaComandoOut.
     * 
     * @param causa
     */
    public void setCausa(java.lang.String causa) {
        this.causa = causa;
    }


    /**
     * Gets the sla value for this EnviaComandoOut.
     * 
     * @return sla
     */
    public java.lang.Integer getSla() {
        return sla;
    }


    /**
     * Sets the sla value for this EnviaComandoOut.
     * 
     * @param sla
     */
    public void setSla(java.lang.Integer sla) {
        this.sla = sla;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnviaComandoOut)) return false;
        EnviaComandoOut other = (EnviaComandoOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.statusExecucao==null && other.getStatusExecucao()==null) || 
             (this.statusExecucao!=null &&
              this.statusExecucao.equals(other.getStatusExecucao()))) &&
            ((this.causa==null && other.getCausa()==null) || 
             (this.causa!=null &&
              this.causa.equals(other.getCausa()))) &&
            ((this.sla==null && other.getSla()==null) || 
             (this.sla!=null &&
              this.sla.equals(other.getSla())));
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
        if (getStatusExecucao() != null) {
            _hashCode += getStatusExecucao().hashCode();
        }
        if (getCausa() != null) {
            _hashCode += getCausa().hashCode();
        }
        if (getSla() != null) {
            _hashCode += getSla().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnviaComandoOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/enviaComando", "EnviaComandoOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusExecucao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/enviaComando", "statusExecucao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosStatusExecucao"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("causa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/enviaComando", "causa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sla");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/enviaComando", "sla"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
