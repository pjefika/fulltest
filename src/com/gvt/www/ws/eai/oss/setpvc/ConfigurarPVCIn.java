/**
 * ConfigurarPVCIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.setpvc;

public class ConfigurarPVCIn  implements java.io.Serializable {
    private com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetIn ossTurbonetIn;

    private boolean ativarPVC;

    private java.lang.String tipoPVC;

    public ConfigurarPVCIn() {
    }

    public ConfigurarPVCIn(
           com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetIn ossTurbonetIn,
           boolean ativarPVC,
           java.lang.String tipoPVC) {
           this.ossTurbonetIn = ossTurbonetIn;
           this.ativarPVC = ativarPVC;
           this.tipoPVC = tipoPVC;
    }


    /**
     * Gets the ossTurbonetIn value for this ConfigurarPVCIn.
     * 
     * @return ossTurbonetIn
     */
    public com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetIn getOssTurbonetIn() {
        return ossTurbonetIn;
    }


    /**
     * Sets the ossTurbonetIn value for this ConfigurarPVCIn.
     * 
     * @param ossTurbonetIn
     */
    public void setOssTurbonetIn(com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetIn ossTurbonetIn) {
        this.ossTurbonetIn = ossTurbonetIn;
    }


    /**
     * Gets the ativarPVC value for this ConfigurarPVCIn.
     * 
     * @return ativarPVC
     */
    public boolean isAtivarPVC() {
        return ativarPVC;
    }


    /**
     * Sets the ativarPVC value for this ConfigurarPVCIn.
     * 
     * @param ativarPVC
     */
    public void setAtivarPVC(boolean ativarPVC) {
        this.ativarPVC = ativarPVC;
    }


    /**
     * Gets the tipoPVC value for this ConfigurarPVCIn.
     * 
     * @return tipoPVC
     */
    public java.lang.String getTipoPVC() {
        return tipoPVC;
    }


    /**
     * Sets the tipoPVC value for this ConfigurarPVCIn.
     * 
     * @param tipoPVC
     */
    public void setTipoPVC(java.lang.String tipoPVC) {
        this.tipoPVC = tipoPVC;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfigurarPVCIn)) return false;
        ConfigurarPVCIn other = (ConfigurarPVCIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ossTurbonetIn==null && other.getOssTurbonetIn()==null) || 
             (this.ossTurbonetIn!=null &&
              this.ossTurbonetIn.equals(other.getOssTurbonetIn()))) &&
            this.ativarPVC == other.isAtivarPVC() &&
            ((this.tipoPVC==null && other.getTipoPVC()==null) || 
             (this.tipoPVC!=null &&
              this.tipoPVC.equals(other.getTipoPVC())));
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
        if (getOssTurbonetIn() != null) {
            _hashCode += getOssTurbonetIn().hashCode();
        }
        _hashCode += (isAtivarPVC() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTipoPVC() != null) {
            _hashCode += getTipoPVC().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfigurarPVCIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/setpvc", "ConfigurarPVCIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ossTurbonetIn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/setpvc", "ossTurbonetIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "OSSTurbonetIn"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ativarPVC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/setpvc", "ativarPVC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoPVC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/setpvc", "tipoPVC"));
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
