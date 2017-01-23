/**
 * ConsultElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.oss.necservice;

public class ConsultElement  implements java.io.Serializable {
    private java.lang.String elementAnswer;

    private br.com.gvt.www.oss.necservice.Service[] services;

    public ConsultElement() {
    }

    public ConsultElement(
           java.lang.String elementAnswer,
           br.com.gvt.www.oss.necservice.Service[] services) {
           this.elementAnswer = elementAnswer;
           this.services = services;
    }


    /**
     * Gets the elementAnswer value for this ConsultElement.
     * 
     * @return elementAnswer
     */
    public java.lang.String getElementAnswer() {
        return elementAnswer;
    }


    /**
     * Sets the elementAnswer value for this ConsultElement.
     * 
     * @param elementAnswer
     */
    public void setElementAnswer(java.lang.String elementAnswer) {
        this.elementAnswer = elementAnswer;
    }


    /**
     * Gets the services value for this ConsultElement.
     * 
     * @return services
     */
    public br.com.gvt.www.oss.necservice.Service[] getServices() {
        return services;
    }


    /**
     * Sets the services value for this ConsultElement.
     * 
     * @param services
     */
    public void setServices(br.com.gvt.www.oss.necservice.Service[] services) {
        this.services = services;
    }

    public br.com.gvt.www.oss.necservice.Service getServices(int i) {
        return this.services[i];
    }

    public void setServices(int i, br.com.gvt.www.oss.necservice.Service _value) {
        this.services[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultElement)) return false;
        ConsultElement other = (ConsultElement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.elementAnswer==null && other.getElementAnswer()==null) || 
             (this.elementAnswer!=null &&
              this.elementAnswer.equals(other.getElementAnswer()))) &&
            ((this.services==null && other.getServices()==null) || 
             (this.services!=null &&
              java.util.Arrays.equals(this.services, other.getServices())));
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
        if (getElementAnswer() != null) {
            _hashCode += getElementAnswer().hashCode();
        }
        if (getServices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServices(), i);
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
        new org.apache.axis.description.TypeDesc(ConsultElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/oss/necservice", "ConsultElement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elementAnswer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/oss/necservice", "ElementAnswer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("services");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/oss/necservice", "Services"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/oss/necservice", "Service"));
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
