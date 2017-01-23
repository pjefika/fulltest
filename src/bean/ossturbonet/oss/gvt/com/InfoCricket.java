/**
 * InfoCricket.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bean.ossturbonet.oss.gvt.com;

public class InfoCricket  implements java.io.Serializable {
    private java.lang.String ipGerenciaBRAS;

    public InfoCricket() {
    }

    public InfoCricket(
           java.lang.String ipGerenciaBRAS) {
           this.ipGerenciaBRAS = ipGerenciaBRAS;
    }


    /**
     * Gets the ipGerenciaBRAS value for this InfoCricket.
     * 
     * @return ipGerenciaBRAS
     */
    public java.lang.String getIpGerenciaBRAS() {
        return ipGerenciaBRAS;
    }


    /**
     * Sets the ipGerenciaBRAS value for this InfoCricket.
     * 
     * @param ipGerenciaBRAS
     */
    public void setIpGerenciaBRAS(java.lang.String ipGerenciaBRAS) {
        this.ipGerenciaBRAS = ipGerenciaBRAS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InfoCricket)) return false;
        InfoCricket other = (InfoCricket) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ipGerenciaBRAS==null && other.getIpGerenciaBRAS()==null) || 
             (this.ipGerenciaBRAS!=null &&
              this.ipGerenciaBRAS.equals(other.getIpGerenciaBRAS())));
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
        if (getIpGerenciaBRAS() != null) {
            _hashCode += getIpGerenciaBRAS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InfoCricket.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "InfoCricket"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipGerenciaBRAS");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "IpGerenciaBRAS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
