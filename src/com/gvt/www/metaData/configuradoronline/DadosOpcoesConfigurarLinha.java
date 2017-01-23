/**
 * DadosOpcoesConfigurarLinha.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.metaData.configuradoronline;

public class DadosOpcoesConfigurarLinha  implements java.io.Serializable {
    private java.lang.String cidade;

    private java.lang.String uf;

    private com.gvt.www.metaData.configuradoronline.DadosServico[] servico;

    public DadosOpcoesConfigurarLinha() {
    }

    public DadosOpcoesConfigurarLinha(
           java.lang.String cidade,
           java.lang.String uf,
           com.gvt.www.metaData.configuradoronline.DadosServico[] servico) {
           this.cidade = cidade;
           this.uf = uf;
           this.servico = servico;
    }


    /**
     * Gets the cidade value for this DadosOpcoesConfigurarLinha.
     * 
     * @return cidade
     */
    public java.lang.String getCidade() {
        return cidade;
    }


    /**
     * Sets the cidade value for this DadosOpcoesConfigurarLinha.
     * 
     * @param cidade
     */
    public void setCidade(java.lang.String cidade) {
        this.cidade = cidade;
    }


    /**
     * Gets the uf value for this DadosOpcoesConfigurarLinha.
     * 
     * @return uf
     */
    public java.lang.String getUf() {
        return uf;
    }


    /**
     * Sets the uf value for this DadosOpcoesConfigurarLinha.
     * 
     * @param uf
     */
    public void setUf(java.lang.String uf) {
        this.uf = uf;
    }


    /**
     * Gets the servico value for this DadosOpcoesConfigurarLinha.
     * 
     * @return servico
     */
    public com.gvt.www.metaData.configuradoronline.DadosServico[] getServico() {
        return servico;
    }


    /**
     * Sets the servico value for this DadosOpcoesConfigurarLinha.
     * 
     * @param servico
     */
    public void setServico(com.gvt.www.metaData.configuradoronline.DadosServico[] servico) {
        this.servico = servico;
    }

    public com.gvt.www.metaData.configuradoronline.DadosServico getServico(int i) {
        return this.servico[i];
    }

    public void setServico(int i, com.gvt.www.metaData.configuradoronline.DadosServico _value) {
        this.servico[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DadosOpcoesConfigurarLinha)) return false;
        DadosOpcoesConfigurarLinha other = (DadosOpcoesConfigurarLinha) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cidade==null && other.getCidade()==null) || 
             (this.cidade!=null &&
              this.cidade.equals(other.getCidade()))) &&
            ((this.uf==null && other.getUf()==null) || 
             (this.uf!=null &&
              this.uf.equals(other.getUf()))) &&
            ((this.servico==null && other.getServico()==null) || 
             (this.servico!=null &&
              java.util.Arrays.equals(this.servico, other.getServico())));
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
        if (getCidade() != null) {
            _hashCode += getCidade().hashCode();
        }
        if (getUf() != null) {
            _hashCode += getUf().hashCode();
        }
        if (getServico() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServico());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServico(), i);
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
        new org.apache.axis.description.TypeDesc(DadosOpcoesConfigurarLinha.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosOpcoesConfigurarLinha"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "cidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "uf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "servico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosServico"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
