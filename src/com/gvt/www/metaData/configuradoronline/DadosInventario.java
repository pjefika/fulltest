/**
 * DadosInventario.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.metaData.configuradoronline;

public class DadosInventario  implements java.io.Serializable {
    private java.lang.Boolean operadoraGvt;

    private com.gvt.www.metaData.configuradoronline.DadosProduto produto;

    private com.gvt.www.metaData.configuradoronline.DadosStatusBloqueio statusInstancia;

    private com.gvt.www.metaData.configuradoronline.DadosStatusBloqueio statusDesignador;

    private com.gvt.www.metaData.configuradoronline.DadosStatusBloqueio statusDesignadorTv;

    private com.gvt.www.metaData.configuradoronline.DadosStatusBloqueio[] statusRange;

    public DadosInventario() {
    }

    public DadosInventario(
           java.lang.Boolean operadoraGvt,
           com.gvt.www.metaData.configuradoronline.DadosProduto produto,
           com.gvt.www.metaData.configuradoronline.DadosStatusBloqueio statusInstancia,
           com.gvt.www.metaData.configuradoronline.DadosStatusBloqueio statusDesignador,
           com.gvt.www.metaData.configuradoronline.DadosStatusBloqueio statusDesignadorTv,
           com.gvt.www.metaData.configuradoronline.DadosStatusBloqueio[] statusRange) {
           this.operadoraGvt = operadoraGvt;
           this.produto = produto;
           this.statusInstancia = statusInstancia;
           this.statusDesignador = statusDesignador;
           this.statusDesignadorTv = statusDesignadorTv;
           this.statusRange = statusRange;
    }


    /**
     * Gets the operadoraGvt value for this DadosInventario.
     * 
     * @return operadoraGvt
     */
    public java.lang.Boolean getOperadoraGvt() {
        return operadoraGvt;
    }


    /**
     * Sets the operadoraGvt value for this DadosInventario.
     * 
     * @param operadoraGvt
     */
    public void setOperadoraGvt(java.lang.Boolean operadoraGvt) {
        this.operadoraGvt = operadoraGvt;
    }


    /**
     * Gets the produto value for this DadosInventario.
     * 
     * @return produto
     */
    public com.gvt.www.metaData.configuradoronline.DadosProduto getProduto() {
        return produto;
    }


    /**
     * Sets the produto value for this DadosInventario.
     * 
     * @param produto
     */
    public void setProduto(com.gvt.www.metaData.configuradoronline.DadosProduto produto) {
        this.produto = produto;
    }


    /**
     * Gets the statusInstancia value for this DadosInventario.
     * 
     * @return statusInstancia
     */
    public com.gvt.www.metaData.configuradoronline.DadosStatusBloqueio getStatusInstancia() {
        return statusInstancia;
    }


    /**
     * Sets the statusInstancia value for this DadosInventario.
     * 
     * @param statusInstancia
     */
    public void setStatusInstancia(com.gvt.www.metaData.configuradoronline.DadosStatusBloqueio statusInstancia) {
        this.statusInstancia = statusInstancia;
    }


    /**
     * Gets the statusDesignador value for this DadosInventario.
     * 
     * @return statusDesignador
     */
    public com.gvt.www.metaData.configuradoronline.DadosStatusBloqueio getStatusDesignador() {
        return statusDesignador;
    }


    /**
     * Sets the statusDesignador value for this DadosInventario.
     * 
     * @param statusDesignador
     */
    public void setStatusDesignador(com.gvt.www.metaData.configuradoronline.DadosStatusBloqueio statusDesignador) {
        this.statusDesignador = statusDesignador;
    }


    /**
     * Gets the statusDesignadorTv value for this DadosInventario.
     * 
     * @return statusDesignadorTv
     */
    public com.gvt.www.metaData.configuradoronline.DadosStatusBloqueio getStatusDesignadorTv() {
        return statusDesignadorTv;
    }


    /**
     * Sets the statusDesignadorTv value for this DadosInventario.
     * 
     * @param statusDesignadorTv
     */
    public void setStatusDesignadorTv(com.gvt.www.metaData.configuradoronline.DadosStatusBloqueio statusDesignadorTv) {
        this.statusDesignadorTv = statusDesignadorTv;
    }


    /**
     * Gets the statusRange value for this DadosInventario.
     * 
     * @return statusRange
     */
    public com.gvt.www.metaData.configuradoronline.DadosStatusBloqueio[] getStatusRange() {
        return statusRange;
    }


    /**
     * Sets the statusRange value for this DadosInventario.
     * 
     * @param statusRange
     */
    public void setStatusRange(com.gvt.www.metaData.configuradoronline.DadosStatusBloqueio[] statusRange) {
        this.statusRange = statusRange;
    }

    public com.gvt.www.metaData.configuradoronline.DadosStatusBloqueio getStatusRange(int i) {
        return this.statusRange[i];
    }

    public void setStatusRange(int i, com.gvt.www.metaData.configuradoronline.DadosStatusBloqueio _value) {
        this.statusRange[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DadosInventario)) return false;
        DadosInventario other = (DadosInventario) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operadoraGvt==null && other.getOperadoraGvt()==null) || 
             (this.operadoraGvt!=null &&
              this.operadoraGvt.equals(other.getOperadoraGvt()))) &&
            ((this.produto==null && other.getProduto()==null) || 
             (this.produto!=null &&
              this.produto.equals(other.getProduto()))) &&
            ((this.statusInstancia==null && other.getStatusInstancia()==null) || 
             (this.statusInstancia!=null &&
              this.statusInstancia.equals(other.getStatusInstancia()))) &&
            ((this.statusDesignador==null && other.getStatusDesignador()==null) || 
             (this.statusDesignador!=null &&
              this.statusDesignador.equals(other.getStatusDesignador()))) &&
            ((this.statusDesignadorTv==null && other.getStatusDesignadorTv()==null) || 
             (this.statusDesignadorTv!=null &&
              this.statusDesignadorTv.equals(other.getStatusDesignadorTv()))) &&
            ((this.statusRange==null && other.getStatusRange()==null) || 
             (this.statusRange!=null &&
              java.util.Arrays.equals(this.statusRange, other.getStatusRange())));
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
        if (getOperadoraGvt() != null) {
            _hashCode += getOperadoraGvt().hashCode();
        }
        if (getProduto() != null) {
            _hashCode += getProduto().hashCode();
        }
        if (getStatusInstancia() != null) {
            _hashCode += getStatusInstancia().hashCode();
        }
        if (getStatusDesignador() != null) {
            _hashCode += getStatusDesignador().hashCode();
        }
        if (getStatusDesignadorTv() != null) {
            _hashCode += getStatusDesignadorTv().hashCode();
        }
        if (getStatusRange() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatusRange());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatusRange(), i);
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
        new org.apache.axis.description.TypeDesc(DadosInventario.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosInventario"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operadoraGvt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "operadoraGvt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("produto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "produto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosProduto"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusInstancia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "statusInstancia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosStatusBloqueio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusDesignador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "statusDesignador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosStatusBloqueio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusDesignadorTv");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "statusDesignadorTv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosStatusBloqueio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusRange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "statusRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosStatusBloqueio"));
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
