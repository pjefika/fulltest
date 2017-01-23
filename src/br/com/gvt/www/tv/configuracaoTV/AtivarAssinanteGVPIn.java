/**
 * AtivarAssinanteGVPIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.configuracaoTV;

public class AtivarAssinanteGVPIn  implements java.io.Serializable {
    private java.lang.String ipHomeGateway;

    private java.lang.String macSetTopBox;

    private java.lang.String GUID;

    public AtivarAssinanteGVPIn() {
    }

    public AtivarAssinanteGVPIn(
           java.lang.String ipHomeGateway,
           java.lang.String macSetTopBox,
           java.lang.String GUID) {
           this.ipHomeGateway = ipHomeGateway;
           this.macSetTopBox = macSetTopBox;
           this.GUID = GUID;
    }


    /**
     * Gets the ipHomeGateway value for this AtivarAssinanteGVPIn.
     * 
     * @return ipHomeGateway
     */
    public java.lang.String getIpHomeGateway() {
        return ipHomeGateway;
    }


    /**
     * Sets the ipHomeGateway value for this AtivarAssinanteGVPIn.
     * 
     * @param ipHomeGateway
     */
    public void setIpHomeGateway(java.lang.String ipHomeGateway) {
        this.ipHomeGateway = ipHomeGateway;
    }


    /**
     * Gets the macSetTopBox value for this AtivarAssinanteGVPIn.
     * 
     * @return macSetTopBox
     */
    public java.lang.String getMacSetTopBox() {
        return macSetTopBox;
    }


    /**
     * Sets the macSetTopBox value for this AtivarAssinanteGVPIn.
     * 
     * @param macSetTopBox
     */
    public void setMacSetTopBox(java.lang.String macSetTopBox) {
        this.macSetTopBox = macSetTopBox;
    }


    /**
     * Gets the GUID value for this AtivarAssinanteGVPIn.
     * 
     * @return GUID
     */
    public java.lang.String getGUID() {
        return GUID;
    }


    /**
     * Sets the GUID value for this AtivarAssinanteGVPIn.
     * 
     * @param GUID
     */
    public void setGUID(java.lang.String GUID) {
        this.GUID = GUID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AtivarAssinanteGVPIn)) return false;
        AtivarAssinanteGVPIn other = (AtivarAssinanteGVPIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ipHomeGateway==null && other.getIpHomeGateway()==null) || 
             (this.ipHomeGateway!=null &&
              this.ipHomeGateway.equals(other.getIpHomeGateway()))) &&
            ((this.macSetTopBox==null && other.getMacSetTopBox()==null) || 
             (this.macSetTopBox!=null &&
              this.macSetTopBox.equals(other.getMacSetTopBox()))) &&
            ((this.GUID==null && other.getGUID()==null) || 
             (this.GUID!=null &&
              this.GUID.equals(other.getGUID())));
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
        if (getIpHomeGateway() != null) {
            _hashCode += getIpHomeGateway().hashCode();
        }
        if (getMacSetTopBox() != null) {
            _hashCode += getMacSetTopBox().hashCode();
        }
        if (getGUID() != null) {
            _hashCode += getGUID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AtivarAssinanteGVPIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "AtivarAssinanteGVPIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipHomeGateway");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "IpHomeGateway"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("macSetTopBox");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "MacSetTopBox"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GUID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "GUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
