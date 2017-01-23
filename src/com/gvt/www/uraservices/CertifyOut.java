/**
 * CertifyOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.uraservices;

public class CertifyOut  implements java.io.Serializable {
    private int certificacaoOK;

    private java.lang.String pLogMsg;

    private boolean possuiEquipamentosFaltantes;

    private com.gvt.www.uraservices.GpsAction[] listAcoes;

    private com.gvt.www.uraservices.Equipament[] equipamentosInstalados;

    private com.gvt.www.uraservices.Equipament[] equipamentosFaltantes;

    public CertifyOut() {
    }

    public CertifyOut(
           int certificacaoOK,
           java.lang.String pLogMsg,
           boolean possuiEquipamentosFaltantes,
           com.gvt.www.uraservices.GpsAction[] listAcoes,
           com.gvt.www.uraservices.Equipament[] equipamentosInstalados,
           com.gvt.www.uraservices.Equipament[] equipamentosFaltantes) {
           this.certificacaoOK = certificacaoOK;
           this.pLogMsg = pLogMsg;
           this.possuiEquipamentosFaltantes = possuiEquipamentosFaltantes;
           this.listAcoes = listAcoes;
           this.equipamentosInstalados = equipamentosInstalados;
           this.equipamentosFaltantes = equipamentosFaltantes;
    }


    /**
     * Gets the certificacaoOK value for this CertifyOut.
     * 
     * @return certificacaoOK
     */
    public int getCertificacaoOK() {
        return certificacaoOK;
    }


    /**
     * Sets the certificacaoOK value for this CertifyOut.
     * 
     * @param certificacaoOK
     */
    public void setCertificacaoOK(int certificacaoOK) {
        this.certificacaoOK = certificacaoOK;
    }


    /**
     * Gets the pLogMsg value for this CertifyOut.
     * 
     * @return pLogMsg
     */
    public java.lang.String getPLogMsg() {
        return pLogMsg;
    }


    /**
     * Sets the pLogMsg value for this CertifyOut.
     * 
     * @param pLogMsg
     */
    public void setPLogMsg(java.lang.String pLogMsg) {
        this.pLogMsg = pLogMsg;
    }


    /**
     * Gets the possuiEquipamentosFaltantes value for this CertifyOut.
     * 
     * @return possuiEquipamentosFaltantes
     */
    public boolean isPossuiEquipamentosFaltantes() {
        return possuiEquipamentosFaltantes;
    }


    /**
     * Sets the possuiEquipamentosFaltantes value for this CertifyOut.
     * 
     * @param possuiEquipamentosFaltantes
     */
    public void setPossuiEquipamentosFaltantes(boolean possuiEquipamentosFaltantes) {
        this.possuiEquipamentosFaltantes = possuiEquipamentosFaltantes;
    }


    /**
     * Gets the listAcoes value for this CertifyOut.
     * 
     * @return listAcoes
     */
    public com.gvt.www.uraservices.GpsAction[] getListAcoes() {
        return listAcoes;
    }


    /**
     * Sets the listAcoes value for this CertifyOut.
     * 
     * @param listAcoes
     */
    public void setListAcoes(com.gvt.www.uraservices.GpsAction[] listAcoes) {
        this.listAcoes = listAcoes;
    }

    public com.gvt.www.uraservices.GpsAction getListAcoes(int i) {
        return this.listAcoes[i];
    }

    public void setListAcoes(int i, com.gvt.www.uraservices.GpsAction _value) {
        this.listAcoes[i] = _value;
    }


    /**
     * Gets the equipamentosInstalados value for this CertifyOut.
     * 
     * @return equipamentosInstalados
     */
    public com.gvt.www.uraservices.Equipament[] getEquipamentosInstalados() {
        return equipamentosInstalados;
    }


    /**
     * Sets the equipamentosInstalados value for this CertifyOut.
     * 
     * @param equipamentosInstalados
     */
    public void setEquipamentosInstalados(com.gvt.www.uraservices.Equipament[] equipamentosInstalados) {
        this.equipamentosInstalados = equipamentosInstalados;
    }

    public com.gvt.www.uraservices.Equipament getEquipamentosInstalados(int i) {
        return this.equipamentosInstalados[i];
    }

    public void setEquipamentosInstalados(int i, com.gvt.www.uraservices.Equipament _value) {
        this.equipamentosInstalados[i] = _value;
    }


    /**
     * Gets the equipamentosFaltantes value for this CertifyOut.
     * 
     * @return equipamentosFaltantes
     */
    public com.gvt.www.uraservices.Equipament[] getEquipamentosFaltantes() {
        return equipamentosFaltantes;
    }


    /**
     * Sets the equipamentosFaltantes value for this CertifyOut.
     * 
     * @param equipamentosFaltantes
     */
    public void setEquipamentosFaltantes(com.gvt.www.uraservices.Equipament[] equipamentosFaltantes) {
        this.equipamentosFaltantes = equipamentosFaltantes;
    }

    public com.gvt.www.uraservices.Equipament getEquipamentosFaltantes(int i) {
        return this.equipamentosFaltantes[i];
    }

    public void setEquipamentosFaltantes(int i, com.gvt.www.uraservices.Equipament _value) {
        this.equipamentosFaltantes[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CertifyOut)) return false;
        CertifyOut other = (CertifyOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.certificacaoOK == other.getCertificacaoOK() &&
            ((this.pLogMsg==null && other.getPLogMsg()==null) || 
             (this.pLogMsg!=null &&
              this.pLogMsg.equals(other.getPLogMsg()))) &&
            this.possuiEquipamentosFaltantes == other.isPossuiEquipamentosFaltantes() &&
            ((this.listAcoes==null && other.getListAcoes()==null) || 
             (this.listAcoes!=null &&
              java.util.Arrays.equals(this.listAcoes, other.getListAcoes()))) &&
            ((this.equipamentosInstalados==null && other.getEquipamentosInstalados()==null) || 
             (this.equipamentosInstalados!=null &&
              java.util.Arrays.equals(this.equipamentosInstalados, other.getEquipamentosInstalados()))) &&
            ((this.equipamentosFaltantes==null && other.getEquipamentosFaltantes()==null) || 
             (this.equipamentosFaltantes!=null &&
              java.util.Arrays.equals(this.equipamentosFaltantes, other.getEquipamentosFaltantes())));
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
        _hashCode += getCertificacaoOK();
        if (getPLogMsg() != null) {
            _hashCode += getPLogMsg().hashCode();
        }
        _hashCode += (isPossuiEquipamentosFaltantes() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getListAcoes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListAcoes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListAcoes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEquipamentosInstalados() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEquipamentosInstalados());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEquipamentosInstalados(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEquipamentosFaltantes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEquipamentosFaltantes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEquipamentosFaltantes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CertifyOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "certifyOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificacaoOK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certificacaoOK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PLogMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pLogMsg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("possuiEquipamentosFaltantes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "possuiEquipamentosFaltantes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listAcoes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listAcoes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "gpsAction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("equipamentosInstalados");
        elemField.setXmlName(new javax.xml.namespace.QName("", "equipamentosInstalados"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "equipament"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("equipamentosFaltantes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "equipamentosFaltantes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "equipament"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
