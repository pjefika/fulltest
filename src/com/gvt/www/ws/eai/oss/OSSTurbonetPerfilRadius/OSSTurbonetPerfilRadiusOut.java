/**
 * OSSTurbonetPerfilRadiusOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.OSSTurbonetPerfilRadius;

public class OSSTurbonetPerfilRadiusOut  implements java.io.Serializable {
    private com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem;

    private java.lang.String perfilRadius;

    private boolean ehRastreador;

    public OSSTurbonetPerfilRadiusOut() {
    }

    public OSSTurbonetPerfilRadiusOut(
           com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem,
           java.lang.String perfilRadius,
           boolean ehRastreador) {
           this.mensagem = mensagem;
           this.perfilRadius = perfilRadius;
           this.ehRastreador = ehRastreador;
    }


    /**
     * Gets the mensagem value for this OSSTurbonetPerfilRadiusOut.
     * 
     * @return mensagem
     */
    public com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut getMensagem() {
        return mensagem;
    }


    /**
     * Sets the mensagem value for this OSSTurbonetPerfilRadiusOut.
     * 
     * @param mensagem
     */
    public void setMensagem(com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem) {
        this.mensagem = mensagem;
    }


    /**
     * Gets the perfilRadius value for this OSSTurbonetPerfilRadiusOut.
     * 
     * @return perfilRadius
     */
    public java.lang.String getPerfilRadius() {
        return perfilRadius;
    }


    /**
     * Sets the perfilRadius value for this OSSTurbonetPerfilRadiusOut.
     * 
     * @param perfilRadius
     */
    public void setPerfilRadius(java.lang.String perfilRadius) {
        this.perfilRadius = perfilRadius;
    }


    /**
     * Gets the ehRastreador value for this OSSTurbonetPerfilRadiusOut.
     * 
     * @return ehRastreador
     */
    public boolean isEhRastreador() {
        return ehRastreador;
    }


    /**
     * Sets the ehRastreador value for this OSSTurbonetPerfilRadiusOut.
     * 
     * @param ehRastreador
     */
    public void setEhRastreador(boolean ehRastreador) {
        this.ehRastreador = ehRastreador;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OSSTurbonetPerfilRadiusOut)) return false;
        OSSTurbonetPerfilRadiusOut other = (OSSTurbonetPerfilRadiusOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mensagem==null && other.getMensagem()==null) || 
             (this.mensagem!=null &&
              this.mensagem.equals(other.getMensagem()))) &&
            ((this.perfilRadius==null && other.getPerfilRadius()==null) || 
             (this.perfilRadius!=null &&
              this.perfilRadius.equals(other.getPerfilRadius()))) &&
            this.ehRastreador == other.isEhRastreador();
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
        if (getMensagem() != null) {
            _hashCode += getMensagem().hashCode();
        }
        if (getPerfilRadius() != null) {
            _hashCode += getPerfilRadius().hashCode();
        }
        _hashCode += (isEhRastreador() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OSSTurbonetPerfilRadiusOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetPerfilRadius", "OSSTurbonetPerfilRadiusOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensagem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetPerfilRadius", "mensagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "OSSTurbonetOut"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("perfilRadius");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetPerfilRadius", "perfilRadius"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ehRastreador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetPerfilRadius", "ehRastreador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
