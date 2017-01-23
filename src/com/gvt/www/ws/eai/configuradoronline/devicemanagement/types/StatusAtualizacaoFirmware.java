/**
 * StatusAtualizacaoFirmware.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.devicemanagement.types;

public class StatusAtualizacaoFirmware implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected StatusAtualizacaoFirmware(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _EM_ANDAMENTO = "EM_ANDAMENTO";
    public static final java.lang.String _SUCESSO = "SUCESSO";
    public static final java.lang.String _ERRO = "ERRO";
    public static final java.lang.String _INICIADA = "INICIADA";
    public static final java.lang.String _NAO_INICIADA = "NAO_INICIADA";
    public static final java.lang.String _NUNCA_SOLICITADA = "NUNCA_SOLICITADA";
    public static final java.lang.String _FIRMWARE_DESATUALIZADO = "FIRMWARE_DESATUALIZADO";
    public static final java.lang.String _FIRMWARE_JA_ATUALIZADO = "FIRMWARE_JA_ATUALIZADO";
    public static final StatusAtualizacaoFirmware EM_ANDAMENTO = new StatusAtualizacaoFirmware(_EM_ANDAMENTO);
    public static final StatusAtualizacaoFirmware SUCESSO = new StatusAtualizacaoFirmware(_SUCESSO);
    public static final StatusAtualizacaoFirmware ERRO = new StatusAtualizacaoFirmware(_ERRO);
    public static final StatusAtualizacaoFirmware INICIADA = new StatusAtualizacaoFirmware(_INICIADA);
    public static final StatusAtualizacaoFirmware NAO_INICIADA = new StatusAtualizacaoFirmware(_NAO_INICIADA);
    public static final StatusAtualizacaoFirmware NUNCA_SOLICITADA = new StatusAtualizacaoFirmware(_NUNCA_SOLICITADA);
    public static final StatusAtualizacaoFirmware FIRMWARE_DESATUALIZADO = new StatusAtualizacaoFirmware(_FIRMWARE_DESATUALIZADO);
    public static final StatusAtualizacaoFirmware FIRMWARE_JA_ATUALIZADO = new StatusAtualizacaoFirmware(_FIRMWARE_JA_ATUALIZADO);
    public java.lang.String getValue() { return _value_;}
    public static StatusAtualizacaoFirmware fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        StatusAtualizacaoFirmware enumeration = (StatusAtualizacaoFirmware)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static StatusAtualizacaoFirmware fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StatusAtualizacaoFirmware.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/types", "StatusAtualizacaoFirmware"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
