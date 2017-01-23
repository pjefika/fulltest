/**
 * AtualizaInventarioServicoIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico;

public class AtualizaInventarioServicoIn  implements java.io.Serializable {
    private com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico.IdentificadorServico identificadorServico;

    private com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico.Status status;

    private com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico.Parametro[] parametros;

    private com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico.Resource[] resources;

    public AtualizaInventarioServicoIn() {
    }

    public AtualizaInventarioServicoIn(
           com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico.IdentificadorServico identificadorServico,
           com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico.Status status,
           com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico.Parametro[] parametros,
           com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico.Resource[] resources) {
           this.identificadorServico = identificadorServico;
           this.status = status;
           this.parametros = parametros;
           this.resources = resources;
    }


    /**
     * Gets the identificadorServico value for this AtualizaInventarioServicoIn.
     * 
     * @return identificadorServico
     */
    public com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico.IdentificadorServico getIdentificadorServico() {
        return identificadorServico;
    }


    /**
     * Sets the identificadorServico value for this AtualizaInventarioServicoIn.
     * 
     * @param identificadorServico
     */
    public void setIdentificadorServico(com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico.IdentificadorServico identificadorServico) {
        this.identificadorServico = identificadorServico;
    }


    /**
     * Gets the status value for this AtualizaInventarioServicoIn.
     * 
     * @return status
     */
    public com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico.Status getStatus() {
        return status;
    }


    /**
     * Sets the status value for this AtualizaInventarioServicoIn.
     * 
     * @param status
     */
    public void setStatus(com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico.Status status) {
        this.status = status;
    }


    /**
     * Gets the parametros value for this AtualizaInventarioServicoIn.
     * 
     * @return parametros
     */
    public com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico.Parametro[] getParametros() {
        return parametros;
    }


    /**
     * Sets the parametros value for this AtualizaInventarioServicoIn.
     * 
     * @param parametros
     */
    public void setParametros(com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico.Parametro[] parametros) {
        this.parametros = parametros;
    }

    public com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico.Parametro getParametros(int i) {
        return this.parametros[i];
    }

    public void setParametros(int i, com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico.Parametro _value) {
        this.parametros[i] = _value;
    }


    /**
     * Gets the resources value for this AtualizaInventarioServicoIn.
     * 
     * @return resources
     */
    public com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico.Resource[] getResources() {
        return resources;
    }


    /**
     * Sets the resources value for this AtualizaInventarioServicoIn.
     * 
     * @param resources
     */
    public void setResources(com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico.Resource[] resources) {
        this.resources = resources;
    }

    public com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico.Resource getResources(int i) {
        return this.resources[i];
    }

    public void setResources(int i, com.gvt.www.ws.eai.configuradoronline.AtualizaInventarioServico.Resource _value) {
        this.resources[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AtualizaInventarioServicoIn)) return false;
        AtualizaInventarioServicoIn other = (AtualizaInventarioServicoIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identificadorServico==null && other.getIdentificadorServico()==null) || 
             (this.identificadorServico!=null &&
              this.identificadorServico.equals(other.getIdentificadorServico()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.parametros==null && other.getParametros()==null) || 
             (this.parametros!=null &&
              java.util.Arrays.equals(this.parametros, other.getParametros()))) &&
            ((this.resources==null && other.getResources()==null) || 
             (this.resources!=null &&
              java.util.Arrays.equals(this.resources, other.getResources())));
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
        if (getIdentificadorServico() != null) {
            _hashCode += getIdentificadorServico().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getParametros() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParametros());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParametros(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResources() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResources());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResources(), i);
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
        new org.apache.axis.description.TypeDesc(AtualizaInventarioServicoIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/AtualizaInventarioServico", "AtualizaInventarioServicoIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificadorServico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/AtualizaInventarioServico", "identificadorServico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/AtualizaInventarioServico", "IdentificadorServico"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/AtualizaInventarioServico", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/AtualizaInventarioServico", "Status"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parametros");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/AtualizaInventarioServico", "parametros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/AtualizaInventarioServico", "Parametro"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resources");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/AtualizaInventarioServico", "resources"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/AtualizaInventarioServico", "Resource"));
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
