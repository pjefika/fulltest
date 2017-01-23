/**
 * OperacaoCGNAT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.OSSTurbonetOperarCGNAT;

public class OperacaoCGNAT implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected OperacaoCGNAT(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CONSULTAR = "CONSULTAR";
    public static final java.lang.String _HABILITAR = "HABILITAR";
    public static final java.lang.String _DESABILITAR = "DESABILITAR";
    public static final java.lang.String _EXPURGAR = "EXPURGAR";
    public static final OperacaoCGNAT CONSULTAR = new OperacaoCGNAT(_CONSULTAR);
    public static final OperacaoCGNAT HABILITAR = new OperacaoCGNAT(_HABILITAR);
    public static final OperacaoCGNAT DESABILITAR = new OperacaoCGNAT(_DESABILITAR);
    public static final OperacaoCGNAT EXPURGAR = new OperacaoCGNAT(_EXPURGAR);
    public java.lang.String getValue() { return _value_;}
    public static OperacaoCGNAT fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        OperacaoCGNAT enumeration = (OperacaoCGNAT)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static OperacaoCGNAT fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(OperacaoCGNAT.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetOperarCGNAT", "OperacaoCGNAT"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
