/**
 * IdInstanciaServicoComposto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico;

public class IdInstanciaServicoComposto  implements java.io.Serializable {
    private java.lang.String idElementoCrm;

    private java.math.BigInteger idInstanciaServicoPai;

    private java.lang.String nomeServico;

    private java.lang.String tipo;

    public IdInstanciaServicoComposto() {
    }

    public IdInstanciaServicoComposto(
           java.lang.String idElementoCrm,
           java.math.BigInteger idInstanciaServicoPai,
           java.lang.String nomeServico,
           java.lang.String tipo) {
           this.idElementoCrm = idElementoCrm;
           this.idInstanciaServicoPai = idInstanciaServicoPai;
           this.nomeServico = nomeServico;
           this.tipo = tipo;
    }


    /**
     * Gets the idElementoCrm value for this IdInstanciaServicoComposto.
     * 
     * @return idElementoCrm
     */
    public java.lang.String getIdElementoCrm() {
        return idElementoCrm;
    }


    /**
     * Sets the idElementoCrm value for this IdInstanciaServicoComposto.
     * 
     * @param idElementoCrm
     */
    public void setIdElementoCrm(java.lang.String idElementoCrm) {
        this.idElementoCrm = idElementoCrm;
    }


    /**
     * Gets the idInstanciaServicoPai value for this IdInstanciaServicoComposto.
     * 
     * @return idInstanciaServicoPai
     */
    public java.math.BigInteger getIdInstanciaServicoPai() {
        return idInstanciaServicoPai;
    }


    /**
     * Sets the idInstanciaServicoPai value for this IdInstanciaServicoComposto.
     * 
     * @param idInstanciaServicoPai
     */
    public void setIdInstanciaServicoPai(java.math.BigInteger idInstanciaServicoPai) {
        this.idInstanciaServicoPai = idInstanciaServicoPai;
    }


    /**
     * Gets the nomeServico value for this IdInstanciaServicoComposto.
     * 
     * @return nomeServico
     */
    public java.lang.String getNomeServico() {
        return nomeServico;
    }


    /**
     * Sets the nomeServico value for this IdInstanciaServicoComposto.
     * 
     * @param nomeServico
     */
    public void setNomeServico(java.lang.String nomeServico) {
        this.nomeServico = nomeServico;
    }


    /**
     * Gets the tipo value for this IdInstanciaServicoComposto.
     * 
     * @return tipo
     */
    public java.lang.String getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this IdInstanciaServicoComposto.
     * 
     * @param tipo
     */
    public void setTipo(java.lang.String tipo) {
        this.tipo = tipo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdInstanciaServicoComposto)) return false;
        IdInstanciaServicoComposto other = (IdInstanciaServicoComposto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idElementoCrm==null && other.getIdElementoCrm()==null) || 
             (this.idElementoCrm!=null &&
              this.idElementoCrm.equals(other.getIdElementoCrm()))) &&
            ((this.idInstanciaServicoPai==null && other.getIdInstanciaServicoPai()==null) || 
             (this.idInstanciaServicoPai!=null &&
              this.idInstanciaServicoPai.equals(other.getIdInstanciaServicoPai()))) &&
            ((this.nomeServico==null && other.getNomeServico()==null) || 
             (this.nomeServico!=null &&
              this.nomeServico.equals(other.getNomeServico()))) &&
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
        if (getIdElementoCrm() != null) {
            _hashCode += getIdElementoCrm().hashCode();
        }
        if (getIdInstanciaServicoPai() != null) {
            _hashCode += getIdInstanciaServicoPai().hashCode();
        }
        if (getNomeServico() != null) {
            _hashCode += getNomeServico().hashCode();
        }
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IdInstanciaServicoComposto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/AtualizaInventarioServico", "IdInstanciaServicoComposto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idElementoCrm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/AtualizaInventarioServico", "idElementoCrm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idInstanciaServicoPai");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/AtualizaInventarioServico", "idInstanciaServicoPai"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeServico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/AtualizaInventarioServico", "nomeServico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/AtualizaInventarioServico", "tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
