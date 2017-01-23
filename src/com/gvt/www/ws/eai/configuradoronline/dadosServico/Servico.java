/**
 * Servico.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.dadosServico;

public class Servico  implements java.io.Serializable {
    private java.lang.String idElementoCRM;

    private com.gvt.www.ws.eai.configuradoronline.dadosServico.CatalogoServico catalogo;

    private com.gvt.www.ws.eai.configuradoronline.dadosServico.StatusInstServico status;

    private com.gvt.www.ws.eai.configuradoronline.dadosServico.ParamInstServico[] paramServico;

    public Servico() {
    }

    public Servico(
           java.lang.String idElementoCRM,
           com.gvt.www.ws.eai.configuradoronline.dadosServico.CatalogoServico catalogo,
           com.gvt.www.ws.eai.configuradoronline.dadosServico.StatusInstServico status,
           com.gvt.www.ws.eai.configuradoronline.dadosServico.ParamInstServico[] paramServico) {
           this.idElementoCRM = idElementoCRM;
           this.catalogo = catalogo;
           this.status = status;
           this.paramServico = paramServico;
    }


    /**
     * Gets the idElementoCRM value for this Servico.
     * 
     * @return idElementoCRM
     */
    public java.lang.String getIdElementoCRM() {
        return idElementoCRM;
    }


    /**
     * Sets the idElementoCRM value for this Servico.
     * 
     * @param idElementoCRM
     */
    public void setIdElementoCRM(java.lang.String idElementoCRM) {
        this.idElementoCRM = idElementoCRM;
    }


    /**
     * Gets the catalogo value for this Servico.
     * 
     * @return catalogo
     */
    public com.gvt.www.ws.eai.configuradoronline.dadosServico.CatalogoServico getCatalogo() {
        return catalogo;
    }


    /**
     * Sets the catalogo value for this Servico.
     * 
     * @param catalogo
     */
    public void setCatalogo(com.gvt.www.ws.eai.configuradoronline.dadosServico.CatalogoServico catalogo) {
        this.catalogo = catalogo;
    }


    /**
     * Gets the status value for this Servico.
     * 
     * @return status
     */
    public com.gvt.www.ws.eai.configuradoronline.dadosServico.StatusInstServico getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Servico.
     * 
     * @param status
     */
    public void setStatus(com.gvt.www.ws.eai.configuradoronline.dadosServico.StatusInstServico status) {
        this.status = status;
    }


    /**
     * Gets the paramServico value for this Servico.
     * 
     * @return paramServico
     */
    public com.gvt.www.ws.eai.configuradoronline.dadosServico.ParamInstServico[] getParamServico() {
        return paramServico;
    }


    /**
     * Sets the paramServico value for this Servico.
     * 
     * @param paramServico
     */
    public void setParamServico(com.gvt.www.ws.eai.configuradoronline.dadosServico.ParamInstServico[] paramServico) {
        this.paramServico = paramServico;
    }

    public com.gvt.www.ws.eai.configuradoronline.dadosServico.ParamInstServico getParamServico(int i) {
        return this.paramServico[i];
    }

    public void setParamServico(int i, com.gvt.www.ws.eai.configuradoronline.dadosServico.ParamInstServico _value) {
        this.paramServico[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Servico)) return false;
        Servico other = (Servico) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idElementoCRM==null && other.getIdElementoCRM()==null) || 
             (this.idElementoCRM!=null &&
              this.idElementoCRM.equals(other.getIdElementoCRM()))) &&
            ((this.catalogo==null && other.getCatalogo()==null) || 
             (this.catalogo!=null &&
              this.catalogo.equals(other.getCatalogo()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.paramServico==null && other.getParamServico()==null) || 
             (this.paramServico!=null &&
              java.util.Arrays.equals(this.paramServico, other.getParamServico())));
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
        if (getIdElementoCRM() != null) {
            _hashCode += getIdElementoCRM().hashCode();
        }
        if (getCatalogo() != null) {
            _hashCode += getCatalogo().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getParamServico() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParamServico());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParamServico(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Servico.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "Servico"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idElementoCRM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "idElementoCRM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catalogo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "catalogo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "CatalogoServico"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "StatusInstServico"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paramServico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "paramServico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "ParamInstServico"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
