/**
 * DiagnosticoDVBTHist.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.devicemanagement.types;

public class DiagnosticoDVBTHist  implements java.io.Serializable {
    private java.lang.String macAddress;

    private java.lang.String dataDiagnostico;

    private java.math.BigDecimal numeroCanalSintonizado;

    private java.lang.String descricaoCanalSintonizado;

    private int qualidadeSinal;

    private int frequencia;

    private java.lang.String referenciaQualidade;

    private java.lang.String statusQualidadeSinal;

    private java.lang.String sistemaOrigem;

    public DiagnosticoDVBTHist() {
    }

    public DiagnosticoDVBTHist(
           java.lang.String macAddress,
           java.lang.String dataDiagnostico,
           java.math.BigDecimal numeroCanalSintonizado,
           java.lang.String descricaoCanalSintonizado,
           int qualidadeSinal,
           int frequencia,
           java.lang.String referenciaQualidade,
           java.lang.String statusQualidadeSinal,
           java.lang.String sistemaOrigem) {
           this.macAddress = macAddress;
           this.dataDiagnostico = dataDiagnostico;
           this.numeroCanalSintonizado = numeroCanalSintonizado;
           this.descricaoCanalSintonizado = descricaoCanalSintonizado;
           this.qualidadeSinal = qualidadeSinal;
           this.frequencia = frequencia;
           this.referenciaQualidade = referenciaQualidade;
           this.statusQualidadeSinal = statusQualidadeSinal;
           this.sistemaOrigem = sistemaOrigem;
    }


    /**
     * Gets the macAddress value for this DiagnosticoDVBTHist.
     * 
     * @return macAddress
     */
    public java.lang.String getMacAddress() {
        return macAddress;
    }


    /**
     * Sets the macAddress value for this DiagnosticoDVBTHist.
     * 
     * @param macAddress
     */
    public void setMacAddress(java.lang.String macAddress) {
        this.macAddress = macAddress;
    }


    /**
     * Gets the dataDiagnostico value for this DiagnosticoDVBTHist.
     * 
     * @return dataDiagnostico
     */
    public java.lang.String getDataDiagnostico() {
        return dataDiagnostico;
    }


    /**
     * Sets the dataDiagnostico value for this DiagnosticoDVBTHist.
     * 
     * @param dataDiagnostico
     */
    public void setDataDiagnostico(java.lang.String dataDiagnostico) {
        this.dataDiagnostico = dataDiagnostico;
    }


    /**
     * Gets the numeroCanalSintonizado value for this DiagnosticoDVBTHist.
     * 
     * @return numeroCanalSintonizado
     */
    public java.math.BigDecimal getNumeroCanalSintonizado() {
        return numeroCanalSintonizado;
    }


    /**
     * Sets the numeroCanalSintonizado value for this DiagnosticoDVBTHist.
     * 
     * @param numeroCanalSintonizado
     */
    public void setNumeroCanalSintonizado(java.math.BigDecimal numeroCanalSintonizado) {
        this.numeroCanalSintonizado = numeroCanalSintonizado;
    }


    /**
     * Gets the descricaoCanalSintonizado value for this DiagnosticoDVBTHist.
     * 
     * @return descricaoCanalSintonizado
     */
    public java.lang.String getDescricaoCanalSintonizado() {
        return descricaoCanalSintonizado;
    }


    /**
     * Sets the descricaoCanalSintonizado value for this DiagnosticoDVBTHist.
     * 
     * @param descricaoCanalSintonizado
     */
    public void setDescricaoCanalSintonizado(java.lang.String descricaoCanalSintonizado) {
        this.descricaoCanalSintonizado = descricaoCanalSintonizado;
    }


    /**
     * Gets the qualidadeSinal value for this DiagnosticoDVBTHist.
     * 
     * @return qualidadeSinal
     */
    public int getQualidadeSinal() {
        return qualidadeSinal;
    }


    /**
     * Sets the qualidadeSinal value for this DiagnosticoDVBTHist.
     * 
     * @param qualidadeSinal
     */
    public void setQualidadeSinal(int qualidadeSinal) {
        this.qualidadeSinal = qualidadeSinal;
    }


    /**
     * Gets the frequencia value for this DiagnosticoDVBTHist.
     * 
     * @return frequencia
     */
    public int getFrequencia() {
        return frequencia;
    }


    /**
     * Sets the frequencia value for this DiagnosticoDVBTHist.
     * 
     * @param frequencia
     */
    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }


    /**
     * Gets the referenciaQualidade value for this DiagnosticoDVBTHist.
     * 
     * @return referenciaQualidade
     */
    public java.lang.String getReferenciaQualidade() {
        return referenciaQualidade;
    }


    /**
     * Sets the referenciaQualidade value for this DiagnosticoDVBTHist.
     * 
     * @param referenciaQualidade
     */
    public void setReferenciaQualidade(java.lang.String referenciaQualidade) {
        this.referenciaQualidade = referenciaQualidade;
    }


    /**
     * Gets the statusQualidadeSinal value for this DiagnosticoDVBTHist.
     * 
     * @return statusQualidadeSinal
     */
    public java.lang.String getStatusQualidadeSinal() {
        return statusQualidadeSinal;
    }


    /**
     * Sets the statusQualidadeSinal value for this DiagnosticoDVBTHist.
     * 
     * @param statusQualidadeSinal
     */
    public void setStatusQualidadeSinal(java.lang.String statusQualidadeSinal) {
        this.statusQualidadeSinal = statusQualidadeSinal;
    }


    /**
     * Gets the sistemaOrigem value for this DiagnosticoDVBTHist.
     * 
     * @return sistemaOrigem
     */
    public java.lang.String getSistemaOrigem() {
        return sistemaOrigem;
    }


    /**
     * Sets the sistemaOrigem value for this DiagnosticoDVBTHist.
     * 
     * @param sistemaOrigem
     */
    public void setSistemaOrigem(java.lang.String sistemaOrigem) {
        this.sistemaOrigem = sistemaOrigem;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DiagnosticoDVBTHist)) return false;
        DiagnosticoDVBTHist other = (DiagnosticoDVBTHist) obj;
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
            ((this.numeroCanalSintonizado==null && other.getNumeroCanalSintonizado()==null) || 
             (this.numeroCanalSintonizado!=null &&
              this.numeroCanalSintonizado.equals(other.getNumeroCanalSintonizado()))) &&
            ((this.descricaoCanalSintonizado==null && other.getDescricaoCanalSintonizado()==null) || 
             (this.descricaoCanalSintonizado!=null &&
              this.descricaoCanalSintonizado.equals(other.getDescricaoCanalSintonizado()))) &&
            this.qualidadeSinal == other.getQualidadeSinal() &&
            this.frequencia == other.getFrequencia() &&
            ((this.referenciaQualidade==null && other.getReferenciaQualidade()==null) || 
             (this.referenciaQualidade!=null &&
              this.referenciaQualidade.equals(other.getReferenciaQualidade()))) &&
            ((this.statusQualidadeSinal==null && other.getStatusQualidadeSinal()==null) || 
             (this.statusQualidadeSinal!=null &&
              this.statusQualidadeSinal.equals(other.getStatusQualidadeSinal()))) &&
            ((this.sistemaOrigem==null && other.getSistemaOrigem()==null) || 
             (this.sistemaOrigem!=null &&
              this.sistemaOrigem.equals(other.getSistemaOrigem())));
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
        if (getNumeroCanalSintonizado() != null) {
            _hashCode += getNumeroCanalSintonizado().hashCode();
        }
        if (getDescricaoCanalSintonizado() != null) {
            _hashCode += getDescricaoCanalSintonizado().hashCode();
        }
        _hashCode += getQualidadeSinal();
        _hashCode += getFrequencia();
        if (getReferenciaQualidade() != null) {
            _hashCode += getReferenciaQualidade().hashCode();
        }
        if (getStatusQualidadeSinal() != null) {
            _hashCode += getStatusQualidadeSinal().hashCode();
        }
        if (getSistemaOrigem() != null) {
            _hashCode += getSistemaOrigem().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DiagnosticoDVBTHist.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "DiagnosticoDVBTHist"));
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
        elemField.setFieldName("numeroCanalSintonizado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "numeroCanalSintonizado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricaoCanalSintonizado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "descricaoCanalSintonizado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("referenciaQualidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "referenciaQualidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusQualidadeSinal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "statusQualidadeSinal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sistemaOrigem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "sistemaOrigem"));
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
