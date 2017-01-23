/**
 * InformacaoTV.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.configuracaoTV;

public class InformacaoTV  implements java.io.Serializable {
    private java.lang.String designadorTV;

    private java.util.Calendar dataCriacao;

    private br.com.gvt.www.tv.configuracaoTV.InstanciaServicos[] informacoesServicos;

    private java.lang.String cep;

    public InformacaoTV() {
    }

    public InformacaoTV(
           java.lang.String designadorTV,
           java.util.Calendar dataCriacao,
           br.com.gvt.www.tv.configuracaoTV.InstanciaServicos[] informacoesServicos,
           java.lang.String cep) {
           this.designadorTV = designadorTV;
           this.dataCriacao = dataCriacao;
           this.informacoesServicos = informacoesServicos;
           this.cep = cep;
    }


    /**
     * Gets the designadorTV value for this InformacaoTV.
     * 
     * @return designadorTV
     */
    public java.lang.String getDesignadorTV() {
        return designadorTV;
    }


    /**
     * Sets the designadorTV value for this InformacaoTV.
     * 
     * @param designadorTV
     */
    public void setDesignadorTV(java.lang.String designadorTV) {
        this.designadorTV = designadorTV;
    }


    /**
     * Gets the dataCriacao value for this InformacaoTV.
     * 
     * @return dataCriacao
     */
    public java.util.Calendar getDataCriacao() {
        return dataCriacao;
    }


    /**
     * Sets the dataCriacao value for this InformacaoTV.
     * 
     * @param dataCriacao
     */
    public void setDataCriacao(java.util.Calendar dataCriacao) {
        this.dataCriacao = dataCriacao;
    }


    /**
     * Gets the informacoesServicos value for this InformacaoTV.
     * 
     * @return informacoesServicos
     */
    public br.com.gvt.www.tv.configuracaoTV.InstanciaServicos[] getInformacoesServicos() {
        return informacoesServicos;
    }


    /**
     * Sets the informacoesServicos value for this InformacaoTV.
     * 
     * @param informacoesServicos
     */
    public void setInformacoesServicos(br.com.gvt.www.tv.configuracaoTV.InstanciaServicos[] informacoesServicos) {
        this.informacoesServicos = informacoesServicos;
    }

    public br.com.gvt.www.tv.configuracaoTV.InstanciaServicos getInformacoesServicos(int i) {
        return this.informacoesServicos[i];
    }

    public void setInformacoesServicos(int i, br.com.gvt.www.tv.configuracaoTV.InstanciaServicos _value) {
        this.informacoesServicos[i] = _value;
    }


    /**
     * Gets the cep value for this InformacaoTV.
     * 
     * @return cep
     */
    public java.lang.String getCep() {
        return cep;
    }


    /**
     * Sets the cep value for this InformacaoTV.
     * 
     * @param cep
     */
    public void setCep(java.lang.String cep) {
        this.cep = cep;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InformacaoTV)) return false;
        InformacaoTV other = (InformacaoTV) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.designadorTV==null && other.getDesignadorTV()==null) || 
             (this.designadorTV!=null &&
              this.designadorTV.equals(other.getDesignadorTV()))) &&
            ((this.dataCriacao==null && other.getDataCriacao()==null) || 
             (this.dataCriacao!=null &&
              this.dataCriacao.equals(other.getDataCriacao()))) &&
            ((this.informacoesServicos==null && other.getInformacoesServicos()==null) || 
             (this.informacoesServicos!=null &&
              java.util.Arrays.equals(this.informacoesServicos, other.getInformacoesServicos()))) &&
            ((this.cep==null && other.getCep()==null) || 
             (this.cep!=null &&
              this.cep.equals(other.getCep())));
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
        if (getDesignadorTV() != null) {
            _hashCode += getDesignadorTV().hashCode();
        }
        if (getDataCriacao() != null) {
            _hashCode += getDataCriacao().hashCode();
        }
        if (getInformacoesServicos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInformacoesServicos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInformacoesServicos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCep() != null) {
            _hashCode += getCep().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InformacaoTV.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "InformacaoTV"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designadorTV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "designadorTV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataCriacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "dataCriacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("informacoesServicos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "informacoesServicos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "InstanciaServicos"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cep");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "cep"));
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
