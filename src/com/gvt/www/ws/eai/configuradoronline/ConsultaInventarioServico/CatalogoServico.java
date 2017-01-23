/**
 * CatalogoServico.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico;

public class CatalogoServico  implements java.io.Serializable {
    private java.math.BigInteger idServico;

    private java.lang.String nomeServico;

    private java.lang.String tipo;

    private java.lang.String provisioningType;

    private com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.CatalogoServicoParam[] parametrosServico;

    public CatalogoServico() {
    }

    public CatalogoServico(
           java.math.BigInteger idServico,
           java.lang.String nomeServico,
           java.lang.String tipo,
           java.lang.String provisioningType,
           com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.CatalogoServicoParam[] parametrosServico) {
           this.idServico = idServico;
           this.nomeServico = nomeServico;
           this.tipo = tipo;
           this.provisioningType = provisioningType;
           this.parametrosServico = parametrosServico;
    }


    /**
     * Gets the idServico value for this CatalogoServico.
     * 
     * @return idServico
     */
    public java.math.BigInteger getIdServico() {
        return idServico;
    }


    /**
     * Sets the idServico value for this CatalogoServico.
     * 
     * @param idServico
     */
    public void setIdServico(java.math.BigInteger idServico) {
        this.idServico = idServico;
    }


    /**
     * Gets the nomeServico value for this CatalogoServico.
     * 
     * @return nomeServico
     */
    public java.lang.String getNomeServico() {
        return nomeServico;
    }


    /**
     * Sets the nomeServico value for this CatalogoServico.
     * 
     * @param nomeServico
     */
    public void setNomeServico(java.lang.String nomeServico) {
        this.nomeServico = nomeServico;
    }


    /**
     * Gets the tipo value for this CatalogoServico.
     * 
     * @return tipo
     */
    public java.lang.String getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this CatalogoServico.
     * 
     * @param tipo
     */
    public void setTipo(java.lang.String tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the provisioningType value for this CatalogoServico.
     * 
     * @return provisioningType
     */
    public java.lang.String getProvisioningType() {
        return provisioningType;
    }


    /**
     * Sets the provisioningType value for this CatalogoServico.
     * 
     * @param provisioningType
     */
    public void setProvisioningType(java.lang.String provisioningType) {
        this.provisioningType = provisioningType;
    }


    /**
     * Gets the parametrosServico value for this CatalogoServico.
     * 
     * @return parametrosServico
     */
    public com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.CatalogoServicoParam[] getParametrosServico() {
        return parametrosServico;
    }


    /**
     * Sets the parametrosServico value for this CatalogoServico.
     * 
     * @param parametrosServico
     */
    public void setParametrosServico(com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.CatalogoServicoParam[] parametrosServico) {
        this.parametrosServico = parametrosServico;
    }

    public com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.CatalogoServicoParam getParametrosServico(int i) {
        return this.parametrosServico[i];
    }

    public void setParametrosServico(int i, com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.CatalogoServicoParam _value) {
        this.parametrosServico[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CatalogoServico)) return false;
        CatalogoServico other = (CatalogoServico) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idServico==null && other.getIdServico()==null) || 
             (this.idServico!=null &&
              this.idServico.equals(other.getIdServico()))) &&
            ((this.nomeServico==null && other.getNomeServico()==null) || 
             (this.nomeServico!=null &&
              this.nomeServico.equals(other.getNomeServico()))) &&
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo()))) &&
            ((this.provisioningType==null && other.getProvisioningType()==null) || 
             (this.provisioningType!=null &&
              this.provisioningType.equals(other.getProvisioningType()))) &&
            ((this.parametrosServico==null && other.getParametrosServico()==null) || 
             (this.parametrosServico!=null &&
              java.util.Arrays.equals(this.parametrosServico, other.getParametrosServico())));
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
        if (getIdServico() != null) {
            _hashCode += getIdServico().hashCode();
        }
        if (getNomeServico() != null) {
            _hashCode += getNomeServico().hashCode();
        }
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        if (getProvisioningType() != null) {
            _hashCode += getProvisioningType().hashCode();
        }
        if (getParametrosServico() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParametrosServico());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParametrosServico(), i);
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
        new org.apache.axis.description.TypeDesc(CatalogoServico.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "CatalogoServico"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idServico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "idServico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeServico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "nomeServico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provisioningType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "provisioningType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parametrosServico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "parametrosServico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "CatalogoServicoParam"));
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
