/**
 * RechargeCellControlPlanIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.uraservices;

public class RechargeCellControlPlanIn  implements java.io.Serializable {
    private java.lang.String numeroConta;

    private java.lang.String responsavel;

    private java.lang.String sistemaOrigem;

    private java.lang.String idSS;

    public RechargeCellControlPlanIn() {
    }

    public RechargeCellControlPlanIn(
           java.lang.String numeroConta,
           java.lang.String responsavel,
           java.lang.String sistemaOrigem,
           java.lang.String idSS) {
           this.numeroConta = numeroConta;
           this.responsavel = responsavel;
           this.sistemaOrigem = sistemaOrigem;
           this.idSS = idSS;
    }


    /**
     * Gets the numeroConta value for this RechargeCellControlPlanIn.
     * 
     * @return numeroConta
     */
    public java.lang.String getNumeroConta() {
        return numeroConta;
    }


    /**
     * Sets the numeroConta value for this RechargeCellControlPlanIn.
     * 
     * @param numeroConta
     */
    public void setNumeroConta(java.lang.String numeroConta) {
        this.numeroConta = numeroConta;
    }


    /**
     * Gets the responsavel value for this RechargeCellControlPlanIn.
     * 
     * @return responsavel
     */
    public java.lang.String getResponsavel() {
        return responsavel;
    }


    /**
     * Sets the responsavel value for this RechargeCellControlPlanIn.
     * 
     * @param responsavel
     */
    public void setResponsavel(java.lang.String responsavel) {
        this.responsavel = responsavel;
    }


    /**
     * Gets the sistemaOrigem value for this RechargeCellControlPlanIn.
     * 
     * @return sistemaOrigem
     */
    public java.lang.String getSistemaOrigem() {
        return sistemaOrigem;
    }


    /**
     * Sets the sistemaOrigem value for this RechargeCellControlPlanIn.
     * 
     * @param sistemaOrigem
     */
    public void setSistemaOrigem(java.lang.String sistemaOrigem) {
        this.sistemaOrigem = sistemaOrigem;
    }


    /**
     * Gets the idSS value for this RechargeCellControlPlanIn.
     * 
     * @return idSS
     */
    public java.lang.String getIdSS() {
        return idSS;
    }


    /**
     * Sets the idSS value for this RechargeCellControlPlanIn.
     * 
     * @param idSS
     */
    public void setIdSS(java.lang.String idSS) {
        this.idSS = idSS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RechargeCellControlPlanIn)) return false;
        RechargeCellControlPlanIn other = (RechargeCellControlPlanIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numeroConta==null && other.getNumeroConta()==null) || 
             (this.numeroConta!=null &&
              this.numeroConta.equals(other.getNumeroConta()))) &&
            ((this.responsavel==null && other.getResponsavel()==null) || 
             (this.responsavel!=null &&
              this.responsavel.equals(other.getResponsavel()))) &&
            ((this.sistemaOrigem==null && other.getSistemaOrigem()==null) || 
             (this.sistemaOrigem!=null &&
              this.sistemaOrigem.equals(other.getSistemaOrigem()))) &&
            ((this.idSS==null && other.getIdSS()==null) || 
             (this.idSS!=null &&
              this.idSS.equals(other.getIdSS())));
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
        if (getNumeroConta() != null) {
            _hashCode += getNumeroConta().hashCode();
        }
        if (getResponsavel() != null) {
            _hashCode += getResponsavel().hashCode();
        }
        if (getSistemaOrigem() != null) {
            _hashCode += getSistemaOrigem().hashCode();
        }
        if (getIdSS() != null) {
            _hashCode += getIdSS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RechargeCellControlPlanIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "rechargeCellControlPlanIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroConta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroConta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsavel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responsavel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sistemaOrigem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sistemaOrigem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idSS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idSS"));
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
