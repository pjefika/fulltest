/**
 * GetSwitchInfoByFilterOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.eai.NumberInventoryServicesWS;

public class GetSwitchInfoByFilterOut  implements java.io.Serializable {
    private br.com.gvt.www.eai.NumberInventoryServicesWS.SwitchInfo[] switches;

    private java.lang.String message;

    private java.lang.Integer errorCode;

    public GetSwitchInfoByFilterOut() {
    }

    public GetSwitchInfoByFilterOut(
           br.com.gvt.www.eai.NumberInventoryServicesWS.SwitchInfo[] switches,
           java.lang.String message,
           java.lang.Integer errorCode) {
           this.switches = switches;
           this.message = message;
           this.errorCode = errorCode;
    }


    /**
     * Gets the switches value for this GetSwitchInfoByFilterOut.
     * 
     * @return switches
     */
    public br.com.gvt.www.eai.NumberInventoryServicesWS.SwitchInfo[] getSwitches() {
        return switches;
    }


    /**
     * Sets the switches value for this GetSwitchInfoByFilterOut.
     * 
     * @param switches
     */
    public void setSwitches(br.com.gvt.www.eai.NumberInventoryServicesWS.SwitchInfo[] switches) {
        this.switches = switches;
    }

    public br.com.gvt.www.eai.NumberInventoryServicesWS.SwitchInfo getSwitches(int i) {
        return this.switches[i];
    }

    public void setSwitches(int i, br.com.gvt.www.eai.NumberInventoryServicesWS.SwitchInfo _value) {
        this.switches[i] = _value;
    }


    /**
     * Gets the message value for this GetSwitchInfoByFilterOut.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this GetSwitchInfoByFilterOut.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the errorCode value for this GetSwitchInfoByFilterOut.
     * 
     * @return errorCode
     */
    public java.lang.Integer getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this GetSwitchInfoByFilterOut.
     * 
     * @param errorCode
     */
    public void setErrorCode(java.lang.Integer errorCode) {
        this.errorCode = errorCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSwitchInfoByFilterOut)) return false;
        GetSwitchInfoByFilterOut other = (GetSwitchInfoByFilterOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.switches==null && other.getSwitches()==null) || 
             (this.switches!=null &&
              java.util.Arrays.equals(this.switches, other.getSwitches()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode())));
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
        if (getSwitches() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSwitches());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSwitches(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSwitchInfoByFilterOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "getSwitchInfoByFilterOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switches");
        elemField.setXmlName(new javax.xml.namespace.QName("", "switches"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "switchInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
