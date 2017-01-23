/**
 * Resource.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.criarInstanciaServico;

public class Resource  implements java.io.Serializable {
    private int idTipoResource;

    private java.lang.String valorResource;

    public Resource() {
    }

    public Resource(
           int idTipoResource,
           java.lang.String valorResource) {
           this.idTipoResource = idTipoResource;
           this.valorResource = valorResource;
    }


    /**
     * Gets the idTipoResource value for this Resource.
     * 
     * @return idTipoResource
     */
    public int getIdTipoResource() {
        return idTipoResource;
    }


    /**
     * Sets the idTipoResource value for this Resource.
     * 
     * @param idTipoResource
     */
    public void setIdTipoResource(int idTipoResource) {
        this.idTipoResource = idTipoResource;
    }


    /**
     * Gets the valorResource value for this Resource.
     * 
     * @return valorResource
     */
    public java.lang.String getValorResource() {
        return valorResource;
    }


    /**
     * Sets the valorResource value for this Resource.
     * 
     * @param valorResource
     */
    public void setValorResource(java.lang.String valorResource) {
        this.valorResource = valorResource;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Resource)) return false;
        Resource other = (Resource) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.idTipoResource == other.getIdTipoResource() &&
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
        _hashCode += getIdTipoResource();
        if (getValorResource() != null) {
            _hashCode += getValorResource().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Resource.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarInstanciaServico", "resource"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idTipoResource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarInstanciaServico", "idTipoResource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorResource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarInstanciaServico", "valorResource"));
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
