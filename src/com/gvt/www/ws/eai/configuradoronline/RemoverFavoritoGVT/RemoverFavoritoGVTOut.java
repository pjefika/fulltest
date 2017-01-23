/**
 * RemoverFavoritoGVTOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.RemoverFavoritoGVT;

public class RemoverFavoritoGVTOut  implements java.io.Serializable {
    private int codigo;

    private java.lang.String mensagem;

    private java.lang.String descricao;

    private java.lang.String[] instancia;

    public RemoverFavoritoGVTOut() {
    }

    public RemoverFavoritoGVTOut(
           int codigo,
           java.lang.String mensagem,
           java.lang.String descricao,
           java.lang.String[] instancia) {
           this.codigo = codigo;
           this.mensagem = mensagem;
           this.descricao = descricao;
           this.instancia = instancia;
    }


    /**
     * Gets the codigo value for this RemoverFavoritoGVTOut.
     * 
     * @return codigo
     */
    public int getCodigo() {
        return codigo;
    }


    /**
     * Sets the codigo value for this RemoverFavoritoGVTOut.
     * 
     * @param codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    /**
     * Gets the mensagem value for this RemoverFavoritoGVTOut.
     * 
     * @return mensagem
     */
    public java.lang.String getMensagem() {
        return mensagem;
    }


    /**
     * Sets the mensagem value for this RemoverFavoritoGVTOut.
     * 
     * @param mensagem
     */
    public void setMensagem(java.lang.String mensagem) {
        this.mensagem = mensagem;
    }


    /**
     * Gets the descricao value for this RemoverFavoritoGVTOut.
     * 
     * @return descricao
     */
    public java.lang.String getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this RemoverFavoritoGVTOut.
     * 
     * @param descricao
     */
    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }


    /**
     * Gets the instancia value for this RemoverFavoritoGVTOut.
     * 
     * @return instancia
     */
    public java.lang.String[] getInstancia() {
        return instancia;
    }


    /**
     * Sets the instancia value for this RemoverFavoritoGVTOut.
     * 
     * @param instancia
     */
    public void setInstancia(java.lang.String[] instancia) {
        this.instancia = instancia;
    }

    public java.lang.String getInstancia(int i) {
        return this.instancia[i];
    }

    public void setInstancia(int i, java.lang.String _value) {
        this.instancia[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoverFavoritoGVTOut)) return false;
        RemoverFavoritoGVTOut other = (RemoverFavoritoGVTOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.codigo == other.getCodigo() &&
            ((this.mensagem==null && other.getMensagem()==null) || 
             (this.mensagem!=null &&
              this.mensagem.equals(other.getMensagem()))) &&
            ((this.descricao==null && other.getDescricao()==null) || 
             (this.descricao!=null &&
              this.descricao.equals(other.getDescricao()))) &&
            ((this.instancia==null && other.getInstancia()==null) || 
             (this.instancia!=null &&
              java.util.Arrays.equals(this.instancia, other.getInstancia())));
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
        _hashCode += getCodigo();
        if (getMensagem() != null) {
            _hashCode += getMensagem().hashCode();
        }
        if (getDescricao() != null) {
            _hashCode += getDescricao().hashCode();
        }
        if (getInstancia() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInstancia());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInstancia(), i);
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
        new org.apache.axis.description.TypeDesc(RemoverFavoritoGVTOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/RemoverFavoritoGVT", "RemoverFavoritoGVTOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/RemoverFavoritoGVT", "codigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensagem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/RemoverFavoritoGVT", "mensagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/RemoverFavoritoGVT", "descricao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instancia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/RemoverFavoritoGVT", "instancia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
