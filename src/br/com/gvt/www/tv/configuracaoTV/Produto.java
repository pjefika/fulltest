/**
 * Produto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.configuracaoTV;

public class Produto  implements java.io.Serializable {
    private java.lang.String categoria;

    private br.com.gvt.www.tv.configuracaoTV.Parametro[] parametroProduto;

    public Produto() {
    }

    public Produto(
           java.lang.String categoria,
           br.com.gvt.www.tv.configuracaoTV.Parametro[] parametroProduto) {
           this.categoria = categoria;
           this.parametroProduto = parametroProduto;
    }


    /**
     * Gets the categoria value for this Produto.
     * 
     * @return categoria
     */
    public java.lang.String getCategoria() {
        return categoria;
    }


    /**
     * Sets the categoria value for this Produto.
     * 
     * @param categoria
     */
    public void setCategoria(java.lang.String categoria) {
        this.categoria = categoria;
    }


    /**
     * Gets the parametroProduto value for this Produto.
     * 
     * @return parametroProduto
     */
    public br.com.gvt.www.tv.configuracaoTV.Parametro[] getParametroProduto() {
        return parametroProduto;
    }


    /**
     * Sets the parametroProduto value for this Produto.
     * 
     * @param parametroProduto
     */
    public void setParametroProduto(br.com.gvt.www.tv.configuracaoTV.Parametro[] parametroProduto) {
        this.parametroProduto = parametroProduto;
    }

    public br.com.gvt.www.tv.configuracaoTV.Parametro getParametroProduto(int i) {
        return this.parametroProduto[i];
    }

    public void setParametroProduto(int i, br.com.gvt.www.tv.configuracaoTV.Parametro _value) {
        this.parametroProduto[i] = _value;
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
            ((this.categoria==null && other.getCategoria()==null) || 
             (this.categoria!=null &&
              this.categoria.equals(other.getCategoria()))) &&
            ((this.parametroProduto==null && other.getParametroProduto()==null) || 
             (this.parametroProduto!=null &&
              java.util.Arrays.equals(this.parametroProduto, other.getParametroProduto())));
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
        if (getCategoria() != null) {
            _hashCode += getCategoria().hashCode();
        }
        if (getParametroProduto() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParametroProduto());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParametroProduto(), i);
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
        new org.apache.axis.description.TypeDesc(Produto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "Produto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoria");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "categoria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parametroProduto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "parametroProduto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "Parametro"));
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
