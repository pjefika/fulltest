/**
 * ObterHierarquiaProdutosCatalogoIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.obterHierarquiaProdutosCatalogo;

public class ObterHierarquiaProdutosCatalogoIn  implements java.io.Serializable {
    private java.lang.String idProdutoCRM;

    private java.lang.String nomeProduto;

    private java.lang.String tipo;

    public ObterHierarquiaProdutosCatalogoIn() {
    }

    public ObterHierarquiaProdutosCatalogoIn(
           java.lang.String idProdutoCRM,
           java.lang.String nomeProduto,
           java.lang.String tipo) {
           this.idProdutoCRM = idProdutoCRM;
           this.nomeProduto = nomeProduto;
           this.tipo = tipo;
    }


    /**
     * Gets the idProdutoCRM value for this ObterHierarquiaProdutosCatalogoIn.
     * 
     * @return idProdutoCRM
     */
    public java.lang.String getIdProdutoCRM() {
        return idProdutoCRM;
    }


    /**
     * Sets the idProdutoCRM value for this ObterHierarquiaProdutosCatalogoIn.
     * 
     * @param idProdutoCRM
     */
    public void setIdProdutoCRM(java.lang.String idProdutoCRM) {
        this.idProdutoCRM = idProdutoCRM;
    }


    /**
     * Gets the nomeProduto value for this ObterHierarquiaProdutosCatalogoIn.
     * 
     * @return nomeProduto
     */
    public java.lang.String getNomeProduto() {
        return nomeProduto;
    }


    /**
     * Sets the nomeProduto value for this ObterHierarquiaProdutosCatalogoIn.
     * 
     * @param nomeProduto
     */
    public void setNomeProduto(java.lang.String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }


    /**
     * Gets the tipo value for this ObterHierarquiaProdutosCatalogoIn.
     * 
     * @return tipo
     */
    public java.lang.String getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this ObterHierarquiaProdutosCatalogoIn.
     * 
     * @param tipo
     */
    public void setTipo(java.lang.String tipo) {
        this.tipo = tipo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObterHierarquiaProdutosCatalogoIn)) return false;
        ObterHierarquiaProdutosCatalogoIn other = (ObterHierarquiaProdutosCatalogoIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idProdutoCRM==null && other.getIdProdutoCRM()==null) || 
             (this.idProdutoCRM!=null &&
              this.idProdutoCRM.equals(other.getIdProdutoCRM()))) &&
            ((this.nomeProduto==null && other.getNomeProduto()==null) || 
             (this.nomeProduto!=null &&
              this.nomeProduto.equals(other.getNomeProduto()))) &&
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo())));
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
        if (getIdProdutoCRM() != null) {
            _hashCode += getIdProdutoCRM().hashCode();
        }
        if (getNomeProduto() != null) {
            _hashCode += getNomeProduto().hashCode();
        }
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObterHierarquiaProdutosCatalogoIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/obterHierarquiaProdutosCatalogo", "obterHierarquiaProdutosCatalogoIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idProdutoCRM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/obterHierarquiaProdutosCatalogo", "idProdutoCRM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeProduto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/obterHierarquiaProdutosCatalogo", "nomeProduto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/obterHierarquiaProdutosCatalogo", "tipo"));
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
