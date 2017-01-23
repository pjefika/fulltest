/**
 * DiagnosticoSIP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain;

public class DiagnosticoSIP  implements java.io.Serializable {
    private java.lang.String instancia;

    private java.lang.String numeroPorta;

    private br.com.gvt.www.tv.diagnosticoCPE.DiagnosticoParam[] params;

    public DiagnosticoSIP() {
    }

    public DiagnosticoSIP(
           java.lang.String instancia,
           java.lang.String numeroPorta,
           br.com.gvt.www.tv.diagnosticoCPE.DiagnosticoParam[] params) {
           this.instancia = instancia;
           this.numeroPorta = numeroPorta;
           this.params = params;
    }


    /**
     * Gets the instancia value for this DiagnosticoSIP.
     * 
     * @return instancia
     */
    public java.lang.String getInstancia() {
        return instancia;
    }


    /**
     * Sets the instancia value for this DiagnosticoSIP.
     * 
     * @param instancia
     */
    public void setInstancia(java.lang.String instancia) {
        this.instancia = instancia;
    }


    /**
     * Gets the numeroPorta value for this DiagnosticoSIP.
     * 
     * @return numeroPorta
     */
    public java.lang.String getNumeroPorta() {
        return numeroPorta;
    }


    /**
     * Sets the numeroPorta value for this DiagnosticoSIP.
     * 
     * @param numeroPorta
     */
    public void setNumeroPorta(java.lang.String numeroPorta) {
        this.numeroPorta = numeroPorta;
    }


    /**
     * Gets the params value for this DiagnosticoSIP.
     * 
     * @return params
     */
    public br.com.gvt.www.tv.diagnosticoCPE.DiagnosticoParam[] getParams() {
        return params;
    }


    /**
     * Sets the params value for this DiagnosticoSIP.
     * 
     * @param params
     */
    public void setParams(br.com.gvt.www.tv.diagnosticoCPE.DiagnosticoParam[] params) {
        this.params = params;
    }

    public br.com.gvt.www.tv.diagnosticoCPE.DiagnosticoParam getParams(int i) {
        return this.params[i];
    }

    public void setParams(int i, br.com.gvt.www.tv.diagnosticoCPE.DiagnosticoParam _value) {
        this.params[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DiagnosticoSIP)) return false;
        DiagnosticoSIP other = (DiagnosticoSIP) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.instancia==null && other.getInstancia()==null) || 
             (this.instancia!=null &&
              this.instancia.equals(other.getInstancia()))) &&
            ((this.numeroPorta==null && other.getNumeroPorta()==null) || 
             (this.numeroPorta!=null &&
              this.numeroPorta.equals(other.getNumeroPorta()))) &&
            ((this.params==null && other.getParams()==null) || 
             (this.params!=null &&
              java.util.Arrays.equals(this.params, other.getParams())));
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
        if (getInstancia() != null) {
            _hashCode += getInstancia().hashCode();
        }
        if (getNumeroPorta() != null) {
            _hashCode += getNumeroPorta().hashCode();
        }
        if (getParams() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParams());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParams(), i);
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
        new org.apache.axis.description.TypeDesc(DiagnosticoSIP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/sipdomain", "DiagnosticoSIP"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instancia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/sipdomain", "instancia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroPorta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/sipdomain", "numeroPorta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("params");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/devicemanagement/sipdomain", "params"));
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
