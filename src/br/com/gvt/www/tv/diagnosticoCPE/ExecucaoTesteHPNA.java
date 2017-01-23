/**
 * ExecucaoTesteHPNA.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.diagnosticoCPE;

public class ExecucaoTesteHPNA  implements java.io.Serializable {
    private java.lang.Long idExecucao;

    private java.util.Calendar dataExecucao;

    private java.lang.String status;

    private java.lang.String sistema;

    public ExecucaoTesteHPNA() {
    }

    public ExecucaoTesteHPNA(
           java.lang.Long idExecucao,
           java.util.Calendar dataExecucao,
           java.lang.String status,
           java.lang.String sistema) {
           this.idExecucao = idExecucao;
           this.dataExecucao = dataExecucao;
           this.status = status;
           this.sistema = sistema;
    }


    /**
     * Gets the idExecucao value for this ExecucaoTesteHPNA.
     * 
     * @return idExecucao
     */
    public java.lang.Long getIdExecucao() {
        return idExecucao;
    }


    /**
     * Sets the idExecucao value for this ExecucaoTesteHPNA.
     * 
     * @param idExecucao
     */
    public void setIdExecucao(java.lang.Long idExecucao) {
        this.idExecucao = idExecucao;
    }


    /**
     * Gets the dataExecucao value for this ExecucaoTesteHPNA.
     * 
     * @return dataExecucao
     */
    public java.util.Calendar getDataExecucao() {
        return dataExecucao;
    }


    /**
     * Sets the dataExecucao value for this ExecucaoTesteHPNA.
     * 
     * @param dataExecucao
     */
    public void setDataExecucao(java.util.Calendar dataExecucao) {
        this.dataExecucao = dataExecucao;
    }


    /**
     * Gets the status value for this ExecucaoTesteHPNA.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ExecucaoTesteHPNA.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the sistema value for this ExecucaoTesteHPNA.
     * 
     * @return sistema
     */
    public java.lang.String getSistema() {
        return sistema;
    }


    /**
     * Sets the sistema value for this ExecucaoTesteHPNA.
     * 
     * @param sistema
     */
    public void setSistema(java.lang.String sistema) {
        this.sistema = sistema;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExecucaoTesteHPNA)) return false;
        ExecucaoTesteHPNA other = (ExecucaoTesteHPNA) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idExecucao==null && other.getIdExecucao()==null) || 
             (this.idExecucao!=null &&
              this.idExecucao.equals(other.getIdExecucao()))) &&
            ((this.dataExecucao==null && other.getDataExecucao()==null) || 
             (this.dataExecucao!=null &&
              this.dataExecucao.equals(other.getDataExecucao()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.sistema==null && other.getSistema()==null) || 
             (this.sistema!=null &&
              this.sistema.equals(other.getSistema())));
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
        if (getIdExecucao() != null) {
            _hashCode += getIdExecucao().hashCode();
        }
        if (getDataExecucao() != null) {
            _hashCode += getDataExecucao().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSistema() != null) {
            _hashCode += getSistema().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExecucaoTesteHPNA.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoCPE", "ExecucaoTesteHPNA"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idExecucao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoCPE", "idExecucao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataExecucao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoCPE", "dataExecucao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoCPE", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sistema");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoCPE", "sistema"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
