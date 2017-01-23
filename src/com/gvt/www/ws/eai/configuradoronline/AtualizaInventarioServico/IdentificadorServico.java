/**
 * IdentificadorServico.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico;

public class IdentificadorServico  implements java.io.Serializable {
    private java.math.BigInteger idInstanciaServico;

    private com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico.IdInstanciaServicoComposto idInstanciaServicoComposto;

    private java.lang.String valorResource;

    public IdentificadorServico() {
    }

    public IdentificadorServico(
           java.math.BigInteger idInstanciaServico,
           com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico.IdInstanciaServicoComposto idInstanciaServicoComposto,
           java.lang.String valorResource) {
           this.idInstanciaServico = idInstanciaServico;
           this.idInstanciaServicoComposto = idInstanciaServicoComposto;
           this.valorResource = valorResource;
    }


    /**
     * Gets the idInstanciaServico value for this IdentificadorServico.
     * 
     * @return idInstanciaServico
     */
    public java.math.BigInteger getIdInstanciaServico() {
        return idInstanciaServico;
    }


    /**
     * Sets the idInstanciaServico value for this IdentificadorServico.
     * 
     * @param idInstanciaServico
     */
    public void setIdInstanciaServico(java.math.BigInteger idInstanciaServico) {
        this.idInstanciaServico = idInstanciaServico;
    }


    /**
     * Gets the idInstanciaServicoComposto value for this IdentificadorServico.
     * 
     * @return idInstanciaServicoComposto
     */
    public com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico.IdInstanciaServicoComposto getIdInstanciaServicoComposto() {
        return idInstanciaServicoComposto;
    }


    /**
     * Sets the idInstanciaServicoComposto value for this IdentificadorServico.
     * 
     * @param idInstanciaServicoComposto
     */
    public void setIdInstanciaServicoComposto(com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico.IdInstanciaServicoComposto idInstanciaServicoComposto) {
        this.idInstanciaServicoComposto = idInstanciaServicoComposto;
    }


    /**
     * Gets the valorResource value for this IdentificadorServico.
     * 
     * @return valorResource
     */
    public java.lang.String getValorResource() {
        return valorResource;
    }


    /**
     * Sets the valorResource value for this IdentificadorServico.
     * 
     * @param valorResource
     */
    public void setValorResource(java.lang.String valorResource) {
        this.valorResource = valorResource;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdentificadorServico)) return false;
        IdentificadorServico other = (IdentificadorServico) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idInstanciaServico==null && other.getIdInstanciaServico()==null) || 
             (this.idInstanciaServico!=null &&
              this.idInstanciaServico.equals(other.getIdInstanciaServico()))) &&
            ((this.idInstanciaServicoComposto==null && other.getIdInstanciaServicoComposto()==null) || 
             (this.idInstanciaServicoComposto!=null &&
              this.idInstanciaServicoComposto.equals(other.getIdInstanciaServicoComposto()))) &&
            ((this.valorResource==null && other.getValorResource()==null) || 
             (this.valorResource!=null &&
              this.valorResource.equals(other.getValorResource())));
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
        if (getIdInstanciaServico() != null) {
            _hashCode += getIdInstanciaServico().hashCode();
        }
        if (getIdInstanciaServicoComposto() != null) {
            _hashCode += getIdInstanciaServicoComposto().hashCode();
        }
        if (getValorResource() != null) {
            _hashCode += getValorResource().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IdentificadorServico.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/AtualizaInventarioServico", "IdentificadorServico"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idInstanciaServico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/AtualizaInventarioServico", "idInstanciaServico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idInstanciaServicoComposto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/AtualizaInventarioServico", "idInstanciaServicoComposto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/AtualizaInventarioServico", "IdInstanciaServicoComposto"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorResource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/AtualizaInventarioServico", "valorResource"));
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
