/**
 * PercentagemBloqueio.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.configurarBloqueio;

public class PercentagemBloqueio implements java.io.Serializable {
    private java.math.BigInteger _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PercentagemBloqueio(java.math.BigInteger value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.math.BigInteger _value1 = new java.math.BigInteger("0");
    public static final java.math.BigInteger _value2 = new java.math.BigInteger("5");
    public static final java.math.BigInteger _value3 = new java.math.BigInteger("10");
    public static final java.math.BigInteger _value4 = new java.math.BigInteger("15");
    public static final java.math.BigInteger _value5 = new java.math.BigInteger("20");
    public static final java.math.BigInteger _value6 = new java.math.BigInteger("25");
    public static final java.math.BigInteger _value7 = new java.math.BigInteger("30");
    public static final java.math.BigInteger _value8 = new java.math.BigInteger("35");
    public static final java.math.BigInteger _value9 = new java.math.BigInteger("40");
    public static final java.math.BigInteger _value10 = new java.math.BigInteger("45");
    public static final java.math.BigInteger _value11 = new java.math.BigInteger("50");
    public static final java.math.BigInteger _value12 = new java.math.BigInteger("55");
    public static final java.math.BigInteger _value13 = new java.math.BigInteger("60");
    public static final java.math.BigInteger _value14 = new java.math.BigInteger("65");
    public static final java.math.BigInteger _value15 = new java.math.BigInteger("70");
    public static final java.math.BigInteger _value16 = new java.math.BigInteger("75");
    public static final java.math.BigInteger _value17 = new java.math.BigInteger("80");
    public static final java.math.BigInteger _value18 = new java.math.BigInteger("85");
    public static final java.math.BigInteger _value19 = new java.math.BigInteger("90");
    public static final java.math.BigInteger _value20 = new java.math.BigInteger("95");
    public static final java.math.BigInteger _value21 = new java.math.BigInteger("100");
    public static final PercentagemBloqueio value1 = new PercentagemBloqueio(_value1);
    public static final PercentagemBloqueio value2 = new PercentagemBloqueio(_value2);
    public static final PercentagemBloqueio value3 = new PercentagemBloqueio(_value3);
    public static final PercentagemBloqueio value4 = new PercentagemBloqueio(_value4);
    public static final PercentagemBloqueio value5 = new PercentagemBloqueio(_value5);
    public static final PercentagemBloqueio value6 = new PercentagemBloqueio(_value6);
    public static final PercentagemBloqueio value7 = new PercentagemBloqueio(_value7);
    public static final PercentagemBloqueio value8 = new PercentagemBloqueio(_value8);
    public static final PercentagemBloqueio value9 = new PercentagemBloqueio(_value9);
    public static final PercentagemBloqueio value10 = new PercentagemBloqueio(_value10);
    public static final PercentagemBloqueio value11 = new PercentagemBloqueio(_value11);
    public static final PercentagemBloqueio value12 = new PercentagemBloqueio(_value12);
    public static final PercentagemBloqueio value13 = new PercentagemBloqueio(_value13);
    public static final PercentagemBloqueio value14 = new PercentagemBloqueio(_value14);
    public static final PercentagemBloqueio value15 = new PercentagemBloqueio(_value15);
    public static final PercentagemBloqueio value16 = new PercentagemBloqueio(_value16);
    public static final PercentagemBloqueio value17 = new PercentagemBloqueio(_value17);
    public static final PercentagemBloqueio value18 = new PercentagemBloqueio(_value18);
    public static final PercentagemBloqueio value19 = new PercentagemBloqueio(_value19);
    public static final PercentagemBloqueio value20 = new PercentagemBloqueio(_value20);
    public static final PercentagemBloqueio value21 = new PercentagemBloqueio(_value21);
    public java.math.BigInteger getValue() { return _value_;}
    public static PercentagemBloqueio fromValue(java.math.BigInteger value)
          throws java.lang.IllegalArgumentException {
        PercentagemBloqueio enumeration = (PercentagemBloqueio)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PercentagemBloqueio fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        try {
            return fromValue(new java.math.BigInteger(value));
        } catch (Exception e) {
            throw new java.lang.IllegalArgumentException();
        }
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_.toString();}
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
        new org.apache.axis.description.TypeDesc(PercentagemBloqueio.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/configurarBloqueio", "PercentagemBloqueio"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
