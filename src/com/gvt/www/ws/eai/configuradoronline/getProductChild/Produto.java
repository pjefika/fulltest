/**
 * Produto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.getProductChild;

public class Produto  implements java.io.Serializable {
    private int id;

    private java.lang.String nome;

    private java.lang.Integer idProdutoPai;

    private java.lang.Integer idProdutoSubst;

    public Produto() {
    }

    public Produto(
           int id,
           java.lang.String nome,
           java.lang.Integer idProdutoPai,
           java.lang.Integer idProdutoSubst) {
           this.id = id;
           this.nome = nome;
           this.idProdutoPai = idProdutoPai;
           this.idProdutoSubst = idProdutoSubst;
    }


    /**
     * Gets the id value for this Produto.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Produto.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the nome value for this Produto.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this Produto.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the idProdutoPai value for this Produto.
     * 
     * @return idProdutoPai
     */
    public java.lang.Integer getIdProdutoPai() {
        return idProdutoPai;
    }


    /**
     * Sets the idProdutoPai value for this Produto.
     * 
     * @param idProdutoPai
     */
    public void setIdProdutoPai(java.lang.Integer idProdutoPai) {
        this.idProdutoPai = idProdutoPai;
    }


    /**
     * Gets the idProdutoSubst value for this Produto.
     * 
     * @return idProdutoSubst
     */
    public java.lang.Integer getIdProdutoSubst() {
        return idProdutoSubst;
    }


    /**
     * Sets the idProdutoSubst value for this Produto.
     * 
     * @param idProdutoSubst
     */
    public void setIdProdutoSubst(java.lang.Integer idProdutoSubst) {
        this.idProdutoSubst = idProdutoSubst;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Produto)) return false;
        Produto other = (Produto) obj;
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
            ((this.idProdutoPai==null && other.getIdProdutoPai()==null) || 
             (this.idProdutoPai!=null &&
              this.idProdutoPai.equals(other.getIdProdutoPai()))) &&
            ((this.idProdutoSubst==null && other.getIdProdutoSubst()==null) || 
             (this.idProdutoSubst!=null &&
              this.idProdutoSubst.equals(other.getIdProdutoSubst())));
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
        if (getIdProdutoPai() != null) {
            _hashCode += getIdProdutoPai().hashCode();
        }
        if (getIdProdutoSubst() != null) {
            _hashCode += getIdProdutoSubst().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Produto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/getProductChild", "Produto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/getProductChild", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/getProductChild", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idProdutoPai");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/getProductChild", "idProdutoPai"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idProdutoSubst");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/getProductChild", "idProdutoSubst"));
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
