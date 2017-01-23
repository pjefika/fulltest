/**
 * ConsultaInventarioServicoByResourceOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServicoByResource;

public class ConsultaInventarioServicoByResourceOut  implements java.io.Serializable {
    private com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServicoByResource.InstanciaProduto instanciaProduto;

    private com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServicoByResource.InstanciaServico[] instanciaServico;

    public ConsultaInventarioServicoByResourceOut() {
    }

    public ConsultaInventarioServicoByResourceOut(
           com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServicoByResource.InstanciaProduto instanciaProduto,
           com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServicoByResource.InstanciaServico[] instanciaServico) {
           this.instanciaProduto = instanciaProduto;
           this.instanciaServico = instanciaServico;
    }


    /**
     * Gets the instanciaProduto value for this ConsultaInventarioServicoByResourceOut.
     * 
     * @return instanciaProduto
     */
    public com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServicoByResource.InstanciaProduto getInstanciaProduto() {
        return instanciaProduto;
    }


    /**
     * Sets the instanciaProduto value for this ConsultaInventarioServicoByResourceOut.
     * 
     * @param instanciaProduto
     */
    public void setInstanciaProduto(com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServicoByResource.InstanciaProduto instanciaProduto) {
        this.instanciaProduto = instanciaProduto;
    }


    /**
     * Gets the instanciaServico value for this ConsultaInventarioServicoByResourceOut.
     * 
     * @return instanciaServico
     */
    public com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServicoByResource.InstanciaServico[] getInstanciaServico() {
        return instanciaServico;
    }


    /**
     * Sets the instanciaServico value for this ConsultaInventarioServicoByResourceOut.
     * 
     * @param instanciaServico
     */
    public void setInstanciaServico(com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServicoByResource.InstanciaServico[] instanciaServico) {
        this.instanciaServico = instanciaServico;
    }

    public com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServicoByResource.InstanciaServico getInstanciaServico(int i) {
        return this.instanciaServico[i];
    }

    public void setInstanciaServico(int i, com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServicoByResource.InstanciaServico _value) {
        this.instanciaServico[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultaInventarioServicoByResourceOut)) return false;
        ConsultaInventarioServicoByResourceOut other = (ConsultaInventarioServicoByResourceOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.instanciaProduto==null && other.getInstanciaProduto()==null) || 
             (this.instanciaProduto!=null &&
              this.instanciaProduto.equals(other.getInstanciaProduto()))) &&
            ((this.instanciaServico==null && other.getInstanciaServico()==null) || 
             (this.instanciaServico!=null &&
              java.util.Arrays.equals(this.instanciaServico, other.getInstanciaServico())));
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
        if (getInstanciaProduto() != null) {
            _hashCode += getInstanciaProduto().hashCode();
        }
        if (getInstanciaServico() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInstanciaServico());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInstanciaServico(), i);
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
        new org.apache.axis.description.TypeDesc(ConsultaInventarioServicoByResourceOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServicoByResource", "ConsultaInventarioServicoByResourceOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instanciaProduto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServicoByResource", "instanciaProduto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServicoByResource", "InstanciaProduto"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instanciaServico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServicoByResource", "instanciaServico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServicoByResource", "InstanciaServico"));
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
