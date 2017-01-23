/**
 * AlterarServicoPFCIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.alterarServicoPFC;

public class AlterarServicoPFCIn  implements java.io.Serializable {
    private java.lang.String designadorTv;

    private br.com.gvt.www.tv.alterarServicoPFC.ParametroPFC[] parametros;

    public AlterarServicoPFCIn() {
    }

    public AlterarServicoPFCIn(
           java.lang.String designadorTv,
           br.com.gvt.www.tv.alterarServicoPFC.ParametroPFC[] parametros) {
           this.designadorTv = designadorTv;
           this.parametros = parametros;
    }


    /**
     * Gets the designadorTv value for this AlterarServicoPFCIn.
     * 
     * @return designadorTv
     */
    public java.lang.String getDesignadorTv() {
        return designadorTv;
    }


    /**
     * Sets the designadorTv value for this AlterarServicoPFCIn.
     * 
     * @param designadorTv
     */
    public void setDesignadorTv(java.lang.String designadorTv) {
        this.designadorTv = designadorTv;
    }


    /**
     * Gets the parametros value for this AlterarServicoPFCIn.
     * 
     * @return parametros
     */
    public br.com.gvt.www.tv.alterarServicoPFC.ParametroPFC[] getParametros() {
        return parametros;
    }


    /**
     * Sets the parametros value for this AlterarServicoPFCIn.
     * 
     * @param parametros
     */
    public void setParametros(br.com.gvt.www.tv.alterarServicoPFC.ParametroPFC[] parametros) {
        this.parametros = parametros;
    }

    public br.com.gvt.www.tv.alterarServicoPFC.ParametroPFC getParametros(int i) {
        return this.parametros[i];
    }

    public void setParametros(int i, br.com.gvt.www.tv.alterarServicoPFC.ParametroPFC _value) {
        this.parametros[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlterarServicoPFCIn)) return false;
        AlterarServicoPFCIn other = (AlterarServicoPFCIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.designadorTv==null && other.getDesignadorTv()==null) || 
             (this.designadorTv!=null &&
              this.designadorTv.equals(other.getDesignadorTv()))) &&
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
        if (getDesignadorTv() != null) {
            _hashCode += getDesignadorTv().hashCode();
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
        new org.apache.axis.description.TypeDesc(AlterarServicoPFCIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/alterarServicoPFC", "AlterarServicoPFCIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designadorTv");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/alterarServicoPFC", "designadorTv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parametros");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/alterarServicoPFC", "parametros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/alterarServicoPFC", "ParametroPFC"));
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
