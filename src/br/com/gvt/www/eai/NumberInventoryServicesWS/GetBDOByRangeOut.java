/**
 * GetBDOByRangeOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.eai.NumberInventoryServicesWS;

public class GetBDOByRangeOut  implements java.io.Serializable {
    private java.lang.Integer errorCode;

    private java.lang.String message;

    private br.com.gvt.www.eai.NumberInventoryServicesWS.Portados[] numerosPortados;

    public GetBDOByRangeOut() {
    }

    public GetBDOByRangeOut(
           java.lang.Integer errorCode,
           java.lang.String message,
           br.com.gvt.www.eai.NumberInventoryServicesWS.Portados[] numerosPortados) {
           this.errorCode = errorCode;
           this.message = message;
           this.numerosPortados = numerosPortados;
    }


    /**
     * Gets the errorCode value for this GetBDOByRangeOut.
     * 
     * @return errorCode
     */
    public java.lang.Integer getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this GetBDOByRangeOut.
     * 
     * @param errorCode
     */
    public void setErrorCode(java.lang.Integer errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the message value for this GetBDOByRangeOut.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this GetBDOByRangeOut.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the numerosPortados value for this GetBDOByRangeOut.
     * 
     * @return numerosPortados
     */
    public br.com.gvt.www.eai.NumberInventoryServicesWS.Portados[] getNumerosPortados() {
        return numerosPortados;
    }


    /**
     * Sets the numerosPortados value for this GetBDOByRangeOut.
     * 
     * @param numerosPortados
     */
    public void setNumerosPortados(br.com.gvt.www.eai.NumberInventoryServicesWS.Portados[] numerosPortados) {
        this.numerosPortados = numerosPortados;
    }

    public br.com.gvt.www.eai.NumberInventoryServicesWS.Portados getNumerosPortados(int i) {
        return this.numerosPortados[i];
    }

    public void setNumerosPortados(int i, br.com.gvt.www.eai.NumberInventoryServicesWS.Portados _value) {
        this.numerosPortados[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBDOByRangeOut)) return false;
        GetBDOByRangeOut other = (GetBDOByRangeOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.numerosPortados==null && other.getNumerosPortados()==null) || 
             (this.numerosPortados!=null &&
              java.util.Arrays.equals(this.numerosPortados, other.getNumerosPortados())));
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
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getNumerosPortados() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNumerosPortados());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNumerosPortados(), i);
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
        new org.apache.axis.description.TypeDesc(GetBDOByRangeOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "getBDOByRangeOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numerosPortados");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numerosPortados"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "portados"));
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
