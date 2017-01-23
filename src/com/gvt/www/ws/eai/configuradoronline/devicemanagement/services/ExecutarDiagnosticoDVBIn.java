/**
 * ExecutarDiagnosticoDVBIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.devicemanagement.services;

public class ExecutarDiagnosticoDVBIn  implements java.io.Serializable {
    private java.lang.String designadorTurbonet;

    private int idSetTopBox;

    private com.gvt.www.metaData.smarttool.Credenciais credencial;

    private boolean compararComParametrosDevice;

    public ExecutarDiagnosticoDVBIn() {
    }

    public ExecutarDiagnosticoDVBIn(
           java.lang.String designadorTurbonet,
           int idSetTopBox,
           com.gvt.www.metaData.smarttool.Credenciais credencial,
           boolean compararComParametrosDevice) {
           this.designadorTurbonet = designadorTurbonet;
           this.idSetTopBox = idSetTopBox;
           this.credencial = credencial;
           this.compararComParametrosDevice = compararComParametrosDevice;
    }


    /**
     * Gets the designadorTurbonet value for this ExecutarDiagnosticoDVBIn.
     * 
     * @return designadorTurbonet
     */
    public java.lang.String getDesignadorTurbonet() {
        return designadorTurbonet;
    }


    /**
     * Sets the designadorTurbonet value for this ExecutarDiagnosticoDVBIn.
     * 
     * @param designadorTurbonet
     */
    public void setDesignadorTurbonet(java.lang.String designadorTurbonet) {
        this.designadorTurbonet = designadorTurbonet;
    }


    /**
     * Gets the idSetTopBox value for this ExecutarDiagnosticoDVBIn.
     * 
     * @return idSetTopBox
     */
    public int getIdSetTopBox() {
        return idSetTopBox;
    }


    /**
     * Sets the idSetTopBox value for this ExecutarDiagnosticoDVBIn.
     * 
     * @param idSetTopBox
     */
    public void setIdSetTopBox(int idSetTopBox) {
        this.idSetTopBox = idSetTopBox;
    }


    /**
     * Gets the credencial value for this ExecutarDiagnosticoDVBIn.
     * 
     * @return credencial
     */
    public com.gvt.www.metaData.smarttool.Credenciais getCredencial() {
        return credencial;
    }


    /**
     * Sets the credencial value for this ExecutarDiagnosticoDVBIn.
     * 
     * @param credencial
     */
    public void setCredencial(com.gvt.www.metaData.smarttool.Credenciais credencial) {
        this.credencial = credencial;
    }


    /**
     * Gets the compararComParametrosDevice value for this ExecutarDiagnosticoDVBIn.
     * 
     * @return compararComParametrosDevice
     */
    public boolean isCompararComParametrosDevice() {
        return compararComParametrosDevice;
    }


    /**
     * Sets the compararComParametrosDevice value for this ExecutarDiagnosticoDVBIn.
     * 
     * @param compararComParametrosDevice
     */
    public void setCompararComParametrosDevice(boolean compararComParametrosDevice) {
        this.compararComParametrosDevice = compararComParametrosDevice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExecutarDiagnosticoDVBIn)) return false;
        ExecutarDiagnosticoDVBIn other = (ExecutarDiagnosticoDVBIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.designadorTurbonet==null && other.getDesignadorTurbonet()==null) || 
             (this.designadorTurbonet!=null &&
              this.designadorTurbonet.equals(other.getDesignadorTurbonet()))) &&
            this.idSetTopBox == other.getIdSetTopBox() &&
            ((this.credencial==null && other.getCredencial()==null) || 
             (this.credencial!=null &&
              this.credencial.equals(other.getCredencial()))) &&
            this.compararComParametrosDevice == other.isCompararComParametrosDevice();
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
        if (getDesignadorTurbonet() != null) {
            _hashCode += getDesignadorTurbonet().hashCode();
        }
        _hashCode += getIdSetTopBox();
        if (getCredencial() != null) {
            _hashCode += getCredencial().hashCode();
        }
        _hashCode += (isCompararComParametrosDevice() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExecutarDiagnosticoDVBIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "ExecutarDiagnosticoDVBIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designadorTurbonet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "designadorTurbonet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idSetTopBox");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "idSetTopBox"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credencial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "credencial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/smarttool", "Credenciais"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compararComParametrosDevice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/services", "compararComParametrosDevice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
