/**
 * DiagnosticoDVBSHist.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.devicemanagement.types;

public class DiagnosticoDVBSHist  implements java.io.Serializable {
    private java.lang.String macAddress;

    private java.lang.String dataDiagnostico;

    private int forcaSinal;

    private int qualidadeSinal;

    private int frequencia;

    private java.lang.String statusQualidadeSinal;

    private java.lang.String statusForcaSinal;

    private java.lang.String sistemaOrigem;

    private java.lang.String serialNumber;

    public DiagnosticoDVBSHist() {
    }

    public DiagnosticoDVBSHist(
           java.lang.String macAddress,
           java.lang.String dataDiagnostico,
           int forcaSinal,
           int qualidadeSinal,
           int frequencia,
           java.lang.String statusQualidadeSinal,
           java.lang.String statusForcaSinal,
           java.lang.String sistemaOrigem,
           java.lang.String serialNumber) {
           this.macAddress = macAddress;
           this.dataDiagnostico = dataDiagnostico;
           this.forcaSinal = forcaSinal;
           this.qualidadeSinal = qualidadeSinal;
           this.frequencia = frequencia;
           this.statusQualidadeSinal = statusQualidadeSinal;
           this.statusForcaSinal = statusForcaSinal;
           this.sistemaOrigem = sistemaOrigem;
           this.serialNumber = serialNumber;
    }


    /**
     * Gets the macAddress value for this DiagnosticoDVBSHist.
     * 
     * @return macAddress
     */
    public java.lang.String getMacAddress() {
        return macAddress;
    }


    /**
     * Sets the macAddress value for this DiagnosticoDVBSHist.
     * 
     * @param macAddress
     */
    public void setMacAddress(java.lang.String macAddress) {
        this.macAddress = macAddress;
    }


    /**
     * Gets the dataDiagnostico value for this DiagnosticoDVBSHist.
     * 
     * @return dataDiagnostico
     */
    public java.lang.String getDataDiagnostico() {
        return dataDiagnostico;
    }


    /**
     * Sets the dataDiagnostico value for this DiagnosticoDVBSHist.
     * 
     * @param dataDiagnostico
     */
    public void setDataDiagnostico(java.lang.String dataDiagnostico) {
        this.dataDiagnostico = dataDiagnostico;
    }


    /**
     * Gets the forcaSinal value for this DiagnosticoDVBSHist.
     * 
     * @return forcaSinal
     */
    public int getForcaSinal() {
        return forcaSinal;
    }


    /**
     * Sets the forcaSinal value for this DiagnosticoDVBSHist.
     * 
     * @param forcaSinal
     */
    public void setForcaSinal(int forcaSinal) {
        this.forcaSinal = forcaSinal;
    }


    /**
     * Gets the qualidadeSinal value for this DiagnosticoDVBSHist.
     * 
     * @return qualidadeSinal
     */
    public int getQualidadeSinal() {
        return qualidadeSinal;
    }


    /**
     * Sets the qualidadeSinal value for this DiagnosticoDVBSHist.
     * 
     * @param qualidadeSinal
     */
    public void setQualidadeSinal(int qualidadeSinal) {
        this.qualidadeSinal = qualidadeSinal;
    }


    /**
     * Gets the frequencia value for this DiagnosticoDVBSHist.
     * 
     * @return frequencia
     */
    public int getFrequencia() {
        return frequencia;
    }


    /**
     * Sets the frequencia value for this DiagnosticoDVBSHist.
     * 
     * @param frequencia
     */
    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }


    /**
     * Gets the statusQualidadeSinal value for this DiagnosticoDVBSHist.
     * 
     * @return statusQualidadeSinal
     */
    public java.lang.String getStatusQualidadeSinal() {
        return statusQualidadeSinal;
    }


    /**
     * Sets the statusQualidadeSinal value for this DiagnosticoDVBSHist.
     * 
     * @param statusQualidadeSinal
     */
    public void setStatusQualidadeSinal(java.lang.String statusQualidadeSinal) {
        this.statusQualidadeSinal = statusQualidadeSinal;
    }


    /**
     * Gets the statusForcaSinal value for this DiagnosticoDVBSHist.
     * 
     * @return statusForcaSinal
     */
    public java.lang.String getStatusForcaSinal() {
        return statusForcaSinal;
    }


    /**
     * Sets the statusForcaSinal value for this DiagnosticoDVBSHist.
     * 
     * @param statusForcaSinal
     */
    public void setStatusForcaSinal(java.lang.String statusForcaSinal) {
        this.statusForcaSinal = statusForcaSinal;
    }


    /**
     * Gets the sistemaOrigem value for this DiagnosticoDVBSHist.
     * 
     * @return sistemaOrigem
     */
    public java.lang.String getSistemaOrigem() {
        return sistemaOrigem;
    }


    /**
     * Sets the sistemaOrigem value for this DiagnosticoDVBSHist.
     * 
     * @param sistemaOrigem
     */
    public void setSistemaOrigem(java.lang.String sistemaOrigem) {
        this.sistemaOrigem = sistemaOrigem;
    }


    /**
     * Gets the serialNumber value for this DiagnosticoDVBSHist.
     * 
     * @return serialNumber
     */
    public java.lang.String getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this DiagnosticoDVBSHist.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(java.lang.String serialNumber) {
        this.serialNumber = serialNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DiagnosticoDVBSHist)) return false;
        DiagnosticoDVBSHist other = (DiagnosticoDVBSHist) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.macAddress==null && other.getMacAddress()==null) || 
             (this.macAddress!=null &&
              this.macAddress.equals(other.getMacAddress()))) &&
            ((this.dataDiagnostico==null && other.getDataDiagnostico()==null) || 
             (this.dataDiagnostico!=null &&
              this.dataDiagnostico.equals(other.getDataDiagnostico()))) &&
            this.forcaSinal == other.getForcaSinal() &&
            this.qualidadeSinal == other.getQualidadeSinal() &&
            this.frequencia == other.getFrequencia() &&
            ((this.statusQualidadeSinal==null && other.getStatusQualidadeSinal()==null) || 
             (this.statusQualidadeSinal!=null &&
              this.statusQualidadeSinal.equals(other.getStatusQualidadeSinal()))) &&
            ((this.statusForcaSinal==null && other.getStatusForcaSinal()==null) || 
             (this.statusForcaSinal!=null &&
              this.statusForcaSinal.equals(other.getStatusForcaSinal()))) &&
            ((this.sistemaOrigem==null && other.getSistemaOrigem()==null) || 
             (this.sistemaOrigem!=null &&
              this.sistemaOrigem.equals(other.getSistemaOrigem()))) &&
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              this.serialNumber.equals(other.getSerialNumber())));
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
        if (getMacAddress() != null) {
            _hashCode += getMacAddress().hashCode();
        }
        if (getDataDiagnostico() != null) {
            _hashCode += getDataDiagnostico().hashCode();
        }
        _hashCode += getForcaSinal();
        _hashCode += getQualidadeSinal();
        _hashCode += getFrequencia();
        if (getStatusQualidadeSinal() != null) {
            _hashCode += getStatusQualidadeSinal().hashCode();
        }
        if (getStatusForcaSinal() != null) {
            _hashCode += getStatusForcaSinal().hashCode();
        }
        if (getSistemaOrigem() != null) {
            _hashCode += getSistemaOrigem().hashCode();
        }
        if (getSerialNumber() != null) {
            _hashCode += getSerialNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DiagnosticoDVBSHist.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "DiagnosticoDVBSHist"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("macAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "macAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataDiagnostico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "dataDiagnostico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forcaSinal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "forcaSinal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qualidadeSinal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "qualidadeSinal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequencia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "frequencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusQualidadeSinal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "statusQualidadeSinal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusForcaSinal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "statusForcaSinal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sistemaOrigem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "sistemaOrigem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "serialNumber"));
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
