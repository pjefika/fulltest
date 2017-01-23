/**
 * OSSTurbonetAdslUseReportOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.OSSTurbonetAdslUseReport;

public class OSSTurbonetAdslUseReportOut  implements java.io.Serializable {
    private com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem;

    private com.gvt.www.ws.eai.oss.OSSTurbonetAdslUseReport.OSSTurbonetAdslUseReportOutEvento[] evento;

    public OSSTurbonetAdslUseReportOut() {
    }

    public OSSTurbonetAdslUseReportOut(
           com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem,
           com.gvt.www.ws.eai.oss.OSSTurbonetAdslUseReport.OSSTurbonetAdslUseReportOutEvento[] evento) {
           this.mensagem = mensagem;
           this.evento = evento;
    }


    /**
     * Gets the mensagem value for this OSSTurbonetAdslUseReportOut.
     * 
     * @return mensagem
     */
    public com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut getMensagem() {
        return mensagem;
    }


    /**
     * Sets the mensagem value for this OSSTurbonetAdslUseReportOut.
     * 
     * @param mensagem
     */
    public void setMensagem(com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem) {
        this.mensagem = mensagem;
    }


    /**
     * Gets the evento value for this OSSTurbonetAdslUseReportOut.
     * 
     * @return evento
     */
    public com.gvt.www.ws.eai.oss.OSSTurbonetAdslUseReport.OSSTurbonetAdslUseReportOutEvento[] getEvento() {
        return evento;
    }


    /**
     * Sets the evento value for this OSSTurbonetAdslUseReportOut.
     * 
     * @param evento
     */
    public void setEvento(com.gvt.www.ws.eai.oss.OSSTurbonetAdslUseReport.OSSTurbonetAdslUseReportOutEvento[] evento) {
        this.evento = evento;
    }

    public com.gvt.www.ws.eai.oss.OSSTurbonetAdslUseReport.OSSTurbonetAdslUseReportOutEvento getEvento(int i) {
        return this.evento[i];
    }

    public void setEvento(int i, com.gvt.www.ws.eai.oss.OSSTurbonetAdslUseReport.OSSTurbonetAdslUseReportOutEvento _value) {
        this.evento[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OSSTurbonetAdslUseReportOut)) return false;
        OSSTurbonetAdslUseReportOut other = (OSSTurbonetAdslUseReportOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mensagem==null && other.getMensagem()==null) || 
             (this.mensagem!=null &&
              this.mensagem.equals(other.getMensagem()))) &&
            ((this.evento==null && other.getEvento()==null) || 
             (this.evento!=null &&
              java.util.Arrays.equals(this.evento, other.getEvento())));
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
        if (getMensagem() != null) {
            _hashCode += getMensagem().hashCode();
        }
        if (getEvento() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEvento());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEvento(), i);
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
        new org.apache.axis.description.TypeDesc(OSSTurbonetAdslUseReportOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetAdslUseReport", "OSSTurbonetAdslUseReportOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensagem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetAdslUseReport", "mensagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "OSSTurbonetOut"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetAdslUseReport", "evento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetAdslUseReport", ">OSSTurbonetAdslUseReportOut>evento"));
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
