/**
 * OperarCGNATOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.OSSTurbonetOperarCGNAT;

public class OperarCGNATOut  implements java.io.Serializable {
    private com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem;

    private com.gvt.www.ws.eai.oss.CGNAT.StatusCGNAT statusCGNAT;

    private com.gvt.www.ws.eai.oss.CGNAT.DadosCGNAT dadosCGNAT;

    public OperarCGNATOut() {
    }

    public OperarCGNATOut(
           com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem,
           com.gvt.www.ws.eai.oss.CGNAT.StatusCGNAT statusCGNAT,
           com.gvt.www.ws.eai.oss.CGNAT.DadosCGNAT dadosCGNAT) {
           this.mensagem = mensagem;
           this.statusCGNAT = statusCGNAT;
           this.dadosCGNAT = dadosCGNAT;
    }


    /**
     * Gets the mensagem value for this OperarCGNATOut.
     * 
     * @return mensagem
     */
    public com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut getMensagem() {
        return mensagem;
    }


    /**
     * Sets the mensagem value for this OperarCGNATOut.
     * 
     * @param mensagem
     */
    public void setMensagem(com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem) {
        this.mensagem = mensagem;
    }


    /**
     * Gets the statusCGNAT value for this OperarCGNATOut.
     * 
     * @return statusCGNAT
     */
    public com.gvt.www.ws.eai.oss.CGNAT.StatusCGNAT getStatusCGNAT() {
        return statusCGNAT;
    }


    /**
     * Sets the statusCGNAT value for this OperarCGNATOut.
     * 
     * @param statusCGNAT
     */
    public void setStatusCGNAT(com.gvt.www.ws.eai.oss.CGNAT.StatusCGNAT statusCGNAT) {
        this.statusCGNAT = statusCGNAT;
    }


    /**
     * Gets the dadosCGNAT value for this OperarCGNATOut.
     * 
     * @return dadosCGNAT
     */
    public com.gvt.www.ws.eai.oss.CGNAT.DadosCGNAT getDadosCGNAT() {
        return dadosCGNAT;
    }


    /**
     * Sets the dadosCGNAT value for this OperarCGNATOut.
     * 
     * @param dadosCGNAT
     */
    public void setDadosCGNAT(com.gvt.www.ws.eai.oss.CGNAT.DadosCGNAT dadosCGNAT) {
        this.dadosCGNAT = dadosCGNAT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OperarCGNATOut)) return false;
        OperarCGNATOut other = (OperarCGNATOut) obj;
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
            ((this.statusCGNAT==null && other.getStatusCGNAT()==null) || 
             (this.statusCGNAT!=null &&
              this.statusCGNAT.equals(other.getStatusCGNAT()))) &&
            ((this.dadosCGNAT==null && other.getDadosCGNAT()==null) || 
             (this.dadosCGNAT!=null &&
              this.dadosCGNAT.equals(other.getDadosCGNAT())));
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
        if (getStatusCGNAT() != null) {
            _hashCode += getStatusCGNAT().hashCode();
        }
        if (getDadosCGNAT() != null) {
            _hashCode += getDadosCGNAT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OperarCGNATOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetOperarCGNAT", "OperarCGNATOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensagem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetOperarCGNAT", "mensagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "OSSTurbonetOut"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCGNAT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetOperarCGNAT", "statusCGNAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/CGNAT", "StatusCGNAT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dadosCGNAT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetOperarCGNAT", "dadosCGNAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/CGNAT", "DadosCGNAT"));
        elemField.setMinOccurs(0);
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
