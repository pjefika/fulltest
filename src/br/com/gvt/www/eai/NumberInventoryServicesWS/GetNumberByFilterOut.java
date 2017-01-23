/**
 * GetNumberByFilterOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.eai.NumberInventoryServicesWS;

public class GetNumberByFilterOut  implements java.io.Serializable {
    private java.lang.String phoneNumber;

    private java.lang.String switchName;

    private java.lang.String switchType;

    private java.lang.String switchIMS;

    private java.lang.String switchOriginal;

    private java.lang.String city;

    private java.lang.String state;

    private java.lang.String message;

    private java.lang.Integer errorCode;

    public GetNumberByFilterOut() {
    }

    public GetNumberByFilterOut(
           java.lang.String phoneNumber,
           java.lang.String switchName,
           java.lang.String switchType,
           java.lang.String switchIMS,
           java.lang.String switchOriginal,
           java.lang.String city,
           java.lang.String state,
           java.lang.String message,
           java.lang.Integer errorCode) {
           this.phoneNumber = phoneNumber;
           this.switchName = switchName;
           this.switchType = switchType;
           this.switchIMS = switchIMS;
           this.switchOriginal = switchOriginal;
           this.city = city;
           this.state = state;
           this.message = message;
           this.errorCode = errorCode;
    }


    /**
     * Gets the phoneNumber value for this GetNumberByFilterOut.
     * 
     * @return phoneNumber
     */
    public java.lang.String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this GetNumberByFilterOut.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the switchName value for this GetNumberByFilterOut.
     * 
     * @return switchName
     */
    public java.lang.String getSwitchName() {
        return switchName;
    }


    /**
     * Sets the switchName value for this GetNumberByFilterOut.
     * 
     * @param switchName
     */
    public void setSwitchName(java.lang.String switchName) {
        this.switchName = switchName;
    }


    /**
     * Gets the switchType value for this GetNumberByFilterOut.
     * 
     * @return switchType
     */
    public java.lang.String getSwitchType() {
        return switchType;
    }


    /**
     * Sets the switchType value for this GetNumberByFilterOut.
     * 
     * @param switchType
     */
    public void setSwitchType(java.lang.String switchType) {
        this.switchType = switchType;
    }


    /**
     * Gets the switchIMS value for this GetNumberByFilterOut.
     * 
     * @return switchIMS
     */
    public java.lang.String getSwitchIMS() {
        return switchIMS;
    }


    /**
     * Sets the switchIMS value for this GetNumberByFilterOut.
     * 
     * @param switchIMS
     */
    public void setSwitchIMS(java.lang.String switchIMS) {
        this.switchIMS = switchIMS;
    }


    /**
     * Gets the switchOriginal value for this GetNumberByFilterOut.
     * 
     * @return switchOriginal
     */
    public java.lang.String getSwitchOriginal() {
        return switchOriginal;
    }


    /**
     * Sets the switchOriginal value for this GetNumberByFilterOut.
     * 
     * @param switchOriginal
     */
    public void setSwitchOriginal(java.lang.String switchOriginal) {
        this.switchOriginal = switchOriginal;
    }


    /**
     * Gets the city value for this GetNumberByFilterOut.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this GetNumberByFilterOut.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the state value for this GetNumberByFilterOut.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this GetNumberByFilterOut.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the message value for this GetNumberByFilterOut.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this GetNumberByFilterOut.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the errorCode value for this GetNumberByFilterOut.
     * 
     * @return errorCode
     */
    public java.lang.Integer getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this GetNumberByFilterOut.
     * 
     * @param errorCode
     */
    public void setErrorCode(java.lang.Integer errorCode) {
        this.errorCode = errorCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetNumberByFilterOut)) return false;
        GetNumberByFilterOut other = (GetNumberByFilterOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            ((this.switchName==null && other.getSwitchName()==null) || 
             (this.switchName!=null &&
              this.switchName.equals(other.getSwitchName()))) &&
            ((this.switchType==null && other.getSwitchType()==null) || 
             (this.switchType!=null &&
              this.switchType.equals(other.getSwitchType()))) &&
            ((this.switchIMS==null && other.getSwitchIMS()==null) || 
             (this.switchIMS!=null &&
              this.switchIMS.equals(other.getSwitchIMS()))) &&
            ((this.switchOriginal==null && other.getSwitchOriginal()==null) || 
             (this.switchOriginal!=null &&
              this.switchOriginal.equals(other.getSwitchOriginal()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
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
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        if (getSwitchName() != null) {
            _hashCode += getSwitchName().hashCode();
        }
        if (getSwitchType() != null) {
            _hashCode += getSwitchType().hashCode();
        }
        if (getSwitchIMS() != null) {
            _hashCode += getSwitchIMS().hashCode();
        }
        if (getSwitchOriginal() != null) {
            _hashCode += getSwitchOriginal().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
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
        new org.apache.axis.description.TypeDesc(GetNumberByFilterOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "getNumberByFilterOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "switchName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "switchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchIMS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "switchIMS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchOriginal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "switchOriginal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
