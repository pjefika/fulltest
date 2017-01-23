/**
 * OperarCGNATIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.OSSTurbonetOperarCGNAT;

public class OperarCGNATIn  implements java.io.Serializable {
    private com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetIn ossTurbonetIn;

    private com.gvt.www.ws.eai.oss.OSSTurbonetOperarCGNAT.OperacaoCGNAT operacao;

    private java.lang.String designador;

    public OperarCGNATIn() {
    }

    public OperarCGNATIn(
           com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetIn ossTurbonetIn,
           com.gvt.www.ws.eai.oss.OSSTurbonetOperarCGNAT.OperacaoCGNAT operacao,
           java.lang.String designador) {
           this.ossTurbonetIn = ossTurbonetIn;
           this.operacao = operacao;
           this.designador = designador;
    }


    /**
     * Gets the ossTurbonetIn value for this OperarCGNATIn.
     * 
     * @return ossTurbonetIn
     */
    public com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetIn getOssTurbonetIn() {
        return ossTurbonetIn;
    }


    /**
     * Sets the ossTurbonetIn value for this OperarCGNATIn.
     * 
     * @param ossTurbonetIn
     */
    public void setOssTurbonetIn(com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetIn ossTurbonetIn) {
        this.ossTurbonetIn = ossTurbonetIn;
    }


    /**
     * Gets the operacao value for this OperarCGNATIn.
     * 
     * @return operacao
     */
    public com.gvt.www.ws.eai.oss.OSSTurbonetOperarCGNAT.OperacaoCGNAT getOperacao() {
        return operacao;
    }


    /**
     * Sets the operacao value for this OperarCGNATIn.
     * 
     * @param operacao
     */
    public void setOperacao(com.gvt.www.ws.eai.oss.OSSTurbonetOperarCGNAT.OperacaoCGNAT operacao) {
        this.operacao = operacao;
    }


    /**
     * Gets the designador value for this OperarCGNATIn.
     * 
     * @return designador
     */
    public java.lang.String getDesignador() {
        return designador;
    }


    /**
     * Sets the designador value for this OperarCGNATIn.
     * 
     * @param designador
     */
    public void setDesignador(java.lang.String designador) {
        this.designador = designador;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OperarCGNATIn)) return false;
        OperarCGNATIn other = (OperarCGNATIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ossTurbonetIn==null && other.getOssTurbonetIn()==null) || 
             (this.ossTurbonetIn!=null &&
              this.ossTurbonetIn.equals(other.getOssTurbonetIn()))) &&
            ((this.operacao==null && other.getOperacao()==null) || 
             (this.operacao!=null &&
              this.operacao.equals(other.getOperacao()))) &&
            ((this.designador==null && other.getDesignador()==null) || 
             (this.designador!=null &&
              this.designador.equals(other.getDesignador())));
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
        if (getOssTurbonetIn() != null) {
            _hashCode += getOssTurbonetIn().hashCode();
        }
        if (getOperacao() != null) {
            _hashCode += getOperacao().hashCode();
        }
        if (getDesignador() != null) {
            _hashCode += getDesignador().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OperarCGNATIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetOperarCGNAT", "OperarCGNATIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ossTurbonetIn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "ossTurbonetIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "OSSTurbonetIn"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetOperarCGNAT", "operacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetOperarCGNAT", "OperacaoCGNAT"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetOperarCGNAT", "designador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
