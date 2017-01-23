/**
 * DiagnosticoHPNA.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.diagnosticoHPNA;

public class DiagnosticoHPNA  implements java.io.Serializable {
    private java.lang.String macAddressOrigem;

    private java.lang.String macAddressDestino;

    private br.com.gvt.www.tv.diagnosticoCPE.DiagnosticoParam[] parametros;

    public DiagnosticoHPNA() {
    }

    public DiagnosticoHPNA(
           java.lang.String macAddressOrigem,
           java.lang.String macAddressDestino,
           br.com.gvt.www.tv.diagnosticoCPE.DiagnosticoParam[] parametros) {
           this.macAddressOrigem = macAddressOrigem;
           this.macAddressDestino = macAddressDestino;
           this.parametros = parametros;
    }


    /**
     * Gets the macAddressOrigem value for this DiagnosticoHPNA.
     * 
     * @return macAddressOrigem
     */
    public java.lang.String getMacAddressOrigem() {
        return macAddressOrigem;
    }


    /**
     * Sets the macAddressOrigem value for this DiagnosticoHPNA.
     * 
     * @param macAddressOrigem
     */
    public void setMacAddressOrigem(java.lang.String macAddressOrigem) {
        this.macAddressOrigem = macAddressOrigem;
    }


    /**
     * Gets the macAddressDestino value for this DiagnosticoHPNA.
     * 
     * @return macAddressDestino
     */
    public java.lang.String getMacAddressDestino() {
        return macAddressDestino;
    }


    /**
     * Sets the macAddressDestino value for this DiagnosticoHPNA.
     * 
     * @param macAddressDestino
     */
    public void setMacAddressDestino(java.lang.String macAddressDestino) {
        this.macAddressDestino = macAddressDestino;
    }


    /**
     * Gets the parametros value for this DiagnosticoHPNA.
     * 
     * @return parametros
     */
    public br.com.gvt.www.tv.diagnosticoCPE.DiagnosticoParam[] getParametros() {
        return parametros;
    }


    /**
     * Sets the parametros value for this DiagnosticoHPNA.
     * 
     * @param parametros
     */
    public void setParametros(br.com.gvt.www.tv.diagnosticoCPE.DiagnosticoParam[] parametros) {
        this.parametros = parametros;
    }

    public br.com.gvt.www.tv.diagnosticoCPE.DiagnosticoParam getParametros(int i) {
        return this.parametros[i];
    }

    public void setParametros(int i, br.com.gvt.www.tv.diagnosticoCPE.DiagnosticoParam _value) {
        this.parametros[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DiagnosticoHPNA)) return false;
        DiagnosticoHPNA other = (DiagnosticoHPNA) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.macAddressOrigem==null && other.getMacAddressOrigem()==null) || 
             (this.macAddressOrigem!=null &&
              this.macAddressOrigem.equals(other.getMacAddressOrigem()))) &&
            ((this.macAddressDestino==null && other.getMacAddressDestino()==null) || 
             (this.macAddressDestino!=null &&
              this.macAddressDestino.equals(other.getMacAddressDestino()))) &&
            ((this.parametros==null && other.getParametros()==null) || 
             (this.parametros!=null &&
              java.util.Arrays.equals(this.parametros, other.getParametros())));
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
        if (getMacAddressOrigem() != null) {
            _hashCode += getMacAddressOrigem().hashCode();
        }
        if (getMacAddressDestino() != null) {
            _hashCode += getMacAddressDestino().hashCode();
        }
        if (getParametros() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParametros());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParametros(), i);
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
        new org.apache.axis.description.TypeDesc(DiagnosticoHPNA.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoHPNA", "DiagnosticoHPNA"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("macAddressOrigem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoHPNA", "macAddressOrigem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("macAddressDestino");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoHPNA", "macAddressDestino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parametros");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoHPNA", "parametros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoCPE", "DiagnosticoParam"));
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
