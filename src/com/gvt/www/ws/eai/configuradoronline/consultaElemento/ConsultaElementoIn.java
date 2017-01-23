/**
 * ConsultaElementoIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.consultaElemento;

public class ConsultaElementoIn  implements java.io.Serializable {
    private java.lang.String numeroLista;

    private java.lang.String numeroEquipamento;

    private java.lang.String clliCode;

    private java.lang.String cidade;

    private java.lang.String estado;

    private java.lang.String ipControlador;

    public ConsultaElementoIn() {
    }

    public ConsultaElementoIn(
           java.lang.String numeroLista,
           java.lang.String numeroEquipamento,
           java.lang.String clliCode,
           java.lang.String cidade,
           java.lang.String estado,
           java.lang.String ipControlador) {
           this.numeroLista = numeroLista;
           this.numeroEquipamento = numeroEquipamento;
           this.clliCode = clliCode;
           this.cidade = cidade;
           this.estado = estado;
           this.ipControlador = ipControlador;
    }


    /**
     * Gets the numeroLista value for this ConsultaElementoIn.
     * 
     * @return numeroLista
     */
    public java.lang.String getNumeroLista() {
        return numeroLista;
    }


    /**
     * Sets the numeroLista value for this ConsultaElementoIn.
     * 
     * @param numeroLista
     */
    public void setNumeroLista(java.lang.String numeroLista) {
        this.numeroLista = numeroLista;
    }


    /**
     * Gets the numeroEquipamento value for this ConsultaElementoIn.
     * 
     * @return numeroEquipamento
     */
    public java.lang.String getNumeroEquipamento() {
        return numeroEquipamento;
    }


    /**
     * Sets the numeroEquipamento value for this ConsultaElementoIn.
     * 
     * @param numeroEquipamento
     */
    public void setNumeroEquipamento(java.lang.String numeroEquipamento) {
        this.numeroEquipamento = numeroEquipamento;
    }


    /**
     * Gets the clliCode value for this ConsultaElementoIn.
     * 
     * @return clliCode
     */
    public java.lang.String getClliCode() {
        return clliCode;
    }


    /**
     * Sets the clliCode value for this ConsultaElementoIn.
     * 
     * @param clliCode
     */
    public void setClliCode(java.lang.String clliCode) {
        this.clliCode = clliCode;
    }


    /**
     * Gets the cidade value for this ConsultaElementoIn.
     * 
     * @return cidade
     */
    public java.lang.String getCidade() {
        return cidade;
    }


    /**
     * Sets the cidade value for this ConsultaElementoIn.
     * 
     * @param cidade
     */
    public void setCidade(java.lang.String cidade) {
        this.cidade = cidade;
    }


    /**
     * Gets the estado value for this ConsultaElementoIn.
     * 
     * @return estado
     */
    public java.lang.String getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this ConsultaElementoIn.
     * 
     * @param estado
     */
    public void setEstado(java.lang.String estado) {
        this.estado = estado;
    }


    /**
     * Gets the ipControlador value for this ConsultaElementoIn.
     * 
     * @return ipControlador
     */
    public java.lang.String getIpControlador() {
        return ipControlador;
    }


    /**
     * Sets the ipControlador value for this ConsultaElementoIn.
     * 
     * @param ipControlador
     */
    public void setIpControlador(java.lang.String ipControlador) {
        this.ipControlador = ipControlador;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultaElementoIn)) return false;
        ConsultaElementoIn other = (ConsultaElementoIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numeroLista==null && other.getNumeroLista()==null) || 
             (this.numeroLista!=null &&
              this.numeroLista.equals(other.getNumeroLista()))) &&
            ((this.numeroEquipamento==null && other.getNumeroEquipamento()==null) || 
             (this.numeroEquipamento!=null &&
              this.numeroEquipamento.equals(other.getNumeroEquipamento()))) &&
            ((this.clliCode==null && other.getClliCode()==null) || 
             (this.clliCode!=null &&
              this.clliCode.equals(other.getClliCode()))) &&
            ((this.cidade==null && other.getCidade()==null) || 
             (this.cidade!=null &&
              this.cidade.equals(other.getCidade()))) &&
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            ((this.ipControlador==null && other.getIpControlador()==null) || 
             (this.ipControlador!=null &&
              this.ipControlador.equals(other.getIpControlador())));
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
        if (getNumeroLista() != null) {
            _hashCode += getNumeroLista().hashCode();
        }
        if (getNumeroEquipamento() != null) {
            _hashCode += getNumeroEquipamento().hashCode();
        }
        if (getClliCode() != null) {
            _hashCode += getClliCode().hashCode();
        }
        if (getCidade() != null) {
            _hashCode += getCidade().hashCode();
        }
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        if (getIpControlador() != null) {
            _hashCode += getIpControlador().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultaElementoIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaElemento", "ConsultaElementoIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroLista");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaElemento", "numeroLista"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroEquipamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaElemento", "numeroEquipamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clliCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaElemento", "clliCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaElemento", "cidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaElemento", "estado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipControlador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/consultaElemento", "ipControlador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
