/**
 * ProdutoCatalogo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.obterHierarquiaProdutosCatalogo;

public class ProdutoCatalogo  implements java.io.Serializable {
    private int id;

    private java.lang.String nome;

    private java.lang.String tipo;

    private java.lang.String idProdutoCrm;

    private java.lang.String provisioningType;

    private java.lang.Boolean ativadoNoAprovisionamento;

    private com.gvt.www.ws.eai.configuradoronline.obterHierarquiaProdutosCatalogo.ParamProdutoCatalogo[] parametrosProdutoCatalogo;

    public ProdutoCatalogo() {
    }

    public ProdutoCatalogo(
           int id,
           java.lang.String nome,
           java.lang.String tipo,
           java.lang.String idProdutoCrm,
           java.lang.String provisioningType,
           java.lang.Boolean ativadoNoAprovisionamento,
           com.gvt.www.ws.eai.configuradoronline.obterHierarquiaProdutosCatalogo.ParamProdutoCatalogo[] parametrosProdutoCatalogo) {
           this.id = id;
           this.nome = nome;
           this.tipo = tipo;
           this.idProdutoCrm = idProdutoCrm;
           this.provisioningType = provisioningType;
           this.ativadoNoAprovisionamento = ativadoNoAprovisionamento;
           this.parametrosProdutoCatalogo = parametrosProdutoCatalogo;
    }


    /**
     * Gets the id value for this ProdutoCatalogo.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this ProdutoCatalogo.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the nome value for this ProdutoCatalogo.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this ProdutoCatalogo.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the tipo value for this ProdutoCatalogo.
     * 
     * @return tipo
     */
    public java.lang.String getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this ProdutoCatalogo.
     * 
     * @param tipo
     */
    public void setTipo(java.lang.String tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the idProdutoCrm value for this ProdutoCatalogo.
     * 
     * @return idProdutoCrm
     */
    public java.lang.String getIdProdutoCrm() {
        return idProdutoCrm;
    }


    /**
     * Sets the idProdutoCrm value for this ProdutoCatalogo.
     * 
     * @param idProdutoCrm
     */
    public void setIdProdutoCrm(java.lang.String idProdutoCrm) {
        this.idProdutoCrm = idProdutoCrm;
    }


    /**
     * Gets the provisioningType value for this ProdutoCatalogo.
     * 
     * @return provisioningType
     */
    public java.lang.String getProvisioningType() {
        return provisioningType;
    }


    /**
     * Sets the provisioningType value for this ProdutoCatalogo.
     * 
     * @param provisioningType
     */
    public void setProvisioningType(java.lang.String provisioningType) {
        this.provisioningType = provisioningType;
    }


    /**
     * Gets the ativadoNoAprovisionamento value for this ProdutoCatalogo.
     * 
     * @return ativadoNoAprovisionamento
     */
    public java.lang.Boolean getAtivadoNoAprovisionamento() {
        return ativadoNoAprovisionamento;
    }


    /**
     * Sets the ativadoNoAprovisionamento value for this ProdutoCatalogo.
     * 
     * @param ativadoNoAprovisionamento
     */
    public void setAtivadoNoAprovisionamento(java.lang.Boolean ativadoNoAprovisionamento) {
        this.ativadoNoAprovisionamento = ativadoNoAprovisionamento;
    }


    /**
     * Gets the parametrosProdutoCatalogo value for this ProdutoCatalogo.
     * 
     * @return parametrosProdutoCatalogo
     */
    public com.gvt.www.ws.eai.configuradoronline.obterHierarquiaProdutosCatalogo.ParamProdutoCatalogo[] getParametrosProdutoCatalogo() {
        return parametrosProdutoCatalogo;
    }


    /**
     * Sets the parametrosProdutoCatalogo value for this ProdutoCatalogo.
     * 
     * @param parametrosProdutoCatalogo
     */
    public void setParametrosProdutoCatalogo(com.gvt.www.ws.eai.configuradoronline.obterHierarquiaProdutosCatalogo.ParamProdutoCatalogo[] parametrosProdutoCatalogo) {
        this.parametrosProdutoCatalogo = parametrosProdutoCatalogo;
    }

    public com.gvt.www.ws.eai.configuradoronline.obterHierarquiaProdutosCatalogo.ParamProdutoCatalogo getParametrosProdutoCatalogo(int i) {
        return this.parametrosProdutoCatalogo[i];
    }

    public void setParametrosProdutoCatalogo(int i, com.gvt.www.ws.eai.configuradoronline.obterHierarquiaProdutosCatalogo.ParamProdutoCatalogo _value) {
        this.parametrosProdutoCatalogo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProdutoCatalogo)) return false;
        ProdutoCatalogo other = (ProdutoCatalogo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo()))) &&
            ((this.idProdutoCrm==null && other.getIdProdutoCrm()==null) || 
             (this.idProdutoCrm!=null &&
              this.idProdutoCrm.equals(other.getIdProdutoCrm()))) &&
            ((this.provisioningType==null && other.getProvisioningType()==null) || 
             (this.provisioningType!=null &&
              this.provisioningType.equals(other.getProvisioningType()))) &&
            ((this.ativadoNoAprovisionamento==null && other.getAtivadoNoAprovisionamento()==null) || 
             (this.ativadoNoAprovisionamento!=null &&
              this.ativadoNoAprovisionamento.equals(other.getAtivadoNoAprovisionamento()))) &&
            ((this.parametrosProdutoCatalogo==null && other.getParametrosProdutoCatalogo()==null) || 
             (this.parametrosProdutoCatalogo!=null &&
              java.util.Arrays.equals(this.parametrosProdutoCatalogo, other.getParametrosProdutoCatalogo())));
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
        _hashCode += getId();
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        if (getIdProdutoCrm() != null) {
            _hashCode += getIdProdutoCrm().hashCode();
        }
        if (getProvisioningType() != null) {
            _hashCode += getProvisioningType().hashCode();
        }
        if (getAtivadoNoAprovisionamento() != null) {
            _hashCode += getAtivadoNoAprovisionamento().hashCode();
        }
        if (getParametrosProdutoCatalogo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParametrosProdutoCatalogo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParametrosProdutoCatalogo(), i);
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
        new org.apache.axis.description.TypeDesc(ProdutoCatalogo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/obterHierarquiaProdutosCatalogo", "ProdutoCatalogo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/obterHierarquiaProdutosCatalogo", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/obterHierarquiaProdutosCatalogo", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/obterHierarquiaProdutosCatalogo", "tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idProdutoCrm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/obterHierarquiaProdutosCatalogo", "idProdutoCrm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provisioningType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/obterHierarquiaProdutosCatalogo", "provisioningType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ativadoNoAprovisionamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/obterHierarquiaProdutosCatalogo", "ativadoNoAprovisionamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parametrosProdutoCatalogo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/obterHierarquiaProdutosCatalogo", "parametrosProdutoCatalogo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/obterHierarquiaProdutosCatalogo", "ParamProdutoCatalogo"));
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
