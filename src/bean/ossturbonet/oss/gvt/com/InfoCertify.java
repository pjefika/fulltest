/**
 * InfoCertify.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bean.ossturbonet.oss.gvt.com;


/**
 * Informações sobre a certificação Turbonet.
 */
public class InfoCertify  implements java.io.Serializable {
    private int retCode;

    private java.lang.String message;

    private bean.ossturbonet.oss.gvt.com.GetInfoOut infoOut;

    private int fixType;

    public InfoCertify() {
    }

    public InfoCertify(
           int retCode,
           java.lang.String message,
           bean.ossturbonet.oss.gvt.com.GetInfoOut infoOut,
           int fixType) {
           this.retCode = retCode;
           this.message = message;
           this.infoOut = infoOut;
           this.fixType = fixType;
    }


    /**
     * Gets the retCode value for this InfoCertify.
     * 
     * @return retCode
     */
    public int getRetCode() {
        return retCode;
    }


    /**
     * Sets the retCode value for this InfoCertify.
     * 
     * @param retCode
     */
    public void setRetCode(int retCode) {
        this.retCode = retCode;
    }


    /**
     * Gets the message value for this InfoCertify.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this InfoCertify.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the infoOut value for this InfoCertify.
     * 
     * @return infoOut
     */
    public bean.ossturbonet.oss.gvt.com.GetInfoOut getInfoOut() {
        return infoOut;
    }


    /**
     * Sets the infoOut value for this InfoCertify.
     * 
     * @param infoOut
     */
    public void setInfoOut(bean.ossturbonet.oss.gvt.com.GetInfoOut infoOut) {
        this.infoOut = infoOut;
    }


    /**
     * Gets the fixType value for this InfoCertify.
     * 
     * @return fixType
     */
    public int getFixType() {
        return fixType;
    }


    /**
     * Sets the fixType value for this InfoCertify.
     * 
     * @param fixType
     */
    public void setFixType(int fixType) {
        this.fixType = fixType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InfoCertify)) return false;
        InfoCertify other = (InfoCertify) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.retCode == other.getRetCode() &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.infoOut==null && other.getInfoOut()==null) || 
             (this.infoOut!=null &&
              this.infoOut.equals(other.getInfoOut()))) &&
            this.fixType == other.getFixType();
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
        _hashCode += getRetCode();
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getInfoOut() != null) {
            _hashCode += getInfoOut().hashCode();
        }
        _hashCode += getFixType();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InfoCertify.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "InfoCertify"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retCode");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "RetCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "Message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infoOut");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "InfoOut"));
        elemField.setXmlType(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "GetInfoOut"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fixType");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "FixType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
