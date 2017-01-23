/**
 * CriarInstanciaProdutoIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.criarInstanciaProduto;

public class CriarInstanciaProdutoIn  implements java.io.Serializable {
    private java.lang.String tipoInstancia;

    private java.lang.String rpon;

    private java.lang.String documento;

    private java.lang.String codigoCliente;

    private java.lang.String crmOrigem;

    public CriarInstanciaProdutoIn() {
    }

    public CriarInstanciaProdutoIn(
           java.lang.String tipoInstancia,
           java.lang.String rpon,
           java.lang.String documento,
           java.lang.String codigoCliente,
           java.lang.String crmOrigem) {
           this.tipoInstancia = tipoInstancia;
           this.rpon = rpon;
           this.documento = documento;
           this.codigoCliente = codigoCliente;
           this.crmOrigem = crmOrigem;
    }


    /**
     * Gets the tipoInstancia value for this CriarInstanciaProdutoIn.
     * 
     * @return tipoInstancia
     */
    public java.lang.String getTipoInstancia() {
        return tipoInstancia;
    }


    /**
     * Sets the tipoInstancia value for this CriarInstanciaProdutoIn.
     * 
     * @param tipoInstancia
     */
    public void setTipoInstancia(java.lang.String tipoInstancia) {
        this.tipoInstancia = tipoInstancia;
    }


    /**
     * Gets the rpon value for this CriarInstanciaProdutoIn.
     * 
     * @return rpon
     */
    public java.lang.String getRpon() {
        return rpon;
    }


    /**
     * Sets the rpon value for this CriarInstanciaProdutoIn.
     * 
     * @param rpon
     */
    public void setRpon(java.lang.String rpon) {
        this.rpon = rpon;
    }


    /**
     * Gets the documento value for this CriarInstanciaProdutoIn.
     * 
     * @return documento
     */
    public java.lang.String getDocumento() {
        return documento;
    }


    /**
     * Sets the documento value for this CriarInstanciaProdutoIn.
     * 
     * @param documento
     */
    public void setDocumento(java.lang.String documento) {
        this.documento = documento;
    }


    /**
     * Gets the codigoCliente value for this CriarInstanciaProdutoIn.
     * 
     * @return codigoCliente
     */
    public java.lang.String getCodigoCliente() {
        return codigoCliente;
    }


    /**
     * Sets the codigoCliente value for this CriarInstanciaProdutoIn.
     * 
     * @param codigoCliente
     */
    public void setCodigoCliente(java.lang.String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }


    /**
     * Gets the crmOrigem value for this CriarInstanciaProdutoIn.
     * 
     * @return crmOrigem
     */
    public java.lang.String getCrmOrigem() {
        return crmOrigem;
    }


    /**
     * Sets the crmOrigem value for this CriarInstanciaProdutoIn.
     * 
     * @param crmOrigem
     */
    public void setCrmOrigem(java.lang.String crmOrigem) {
        this.crmOrigem = crmOrigem;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CriarInstanciaProdutoIn)) return false;
        CriarInstanciaProdutoIn other = (CriarInstanciaProdutoIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tipoInstancia==null && other.getTipoInstancia()==null) || 
             (this.tipoInstancia!=null &&
              this.tipoInstancia.equals(other.getTipoInstancia()))) &&
            ((this.rpon==null && other.getRpon()==null) || 
             (this.rpon!=null &&
              this.rpon.equals(other.getRpon()))) &&
            ((this.documento==null && other.getDocumento()==null) || 
             (this.documento!=null &&
              this.documento.equals(other.getDocumento()))) &&
            ((this.codigoCliente==null && other.getCodigoCliente()==null) || 
             (this.codigoCliente!=null &&
              this.codigoCliente.equals(other.getCodigoCliente()))) &&
            ((this.crmOrigem==null && other.getCrmOrigem()==null) || 
             (this.crmOrigem!=null &&
              this.crmOrigem.equals(other.getCrmOrigem())));
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
        if (getTipoInstancia() != null) {
            _hashCode += getTipoInstancia().hashCode();
        }
        if (getRpon() != null) {
            _hashCode += getRpon().hashCode();
        }
        if (getDocumento() != null) {
            _hashCode += getDocumento().hashCode();
        }
        if (getCodigoCliente() != null) {
            _hashCode += getCodigoCliente().hashCode();
        }
        if (getCrmOrigem() != null) {
            _hashCode += getCrmOrigem().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CriarInstanciaProdutoIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarInstanciaProduto", "criarInstanciaProdutoIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoInstancia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarInstanciaProduto", "tipoInstancia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rpon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarInstanciaProduto", "Rpon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarInstanciaProduto", "documento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarInstanciaProduto", "codigoCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crmOrigem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarInstanciaProduto", "crmOrigem"));
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
