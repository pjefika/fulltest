/**
 * ConfigurarBridgeInTipoBridge.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.setpvc;

public class ConfigurarBridgeInTipoBridge implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ConfigurarBridgeInTipoBridge(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _TV = "TV";
    public static final java.lang.String _VOIP = "VOIP";
    public static final java.lang.String _INTERNET = "INTERNET";
    public static final java.lang.String _MULTICAST = "MULTICAST";
    public static final ConfigurarBridgeInTipoBridge TV = new ConfigurarBridgeInTipoBridge(_TV);
    public static final ConfigurarBridgeInTipoBridge VOIP = new ConfigurarBridgeInTipoBridge(_VOIP);
    public static final ConfigurarBridgeInTipoBridge INTERNET = new ConfigurarBridgeInTipoBridge(_INTERNET);
    public static final ConfigurarBridgeInTipoBridge MULTICAST = new ConfigurarBridgeInTipoBridge(_MULTICAST);
    public java.lang.String getValue() { return _value_;}
    public static ConfigurarBridgeInTipoBridge fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ConfigurarBridgeInTipoBridge enumeration = (ConfigurarBridgeInTipoBridge)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ConfigurarBridgeInTipoBridge fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ConfigurarBridgeInTipoBridge.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/setpvc", ">ConfigurarBridgeIn>tipoBridge"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
