/**
 * OSSTurbonetModulacaoPlanoOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.OSSTurbonetModulacaoPlano;

public class OSSTurbonetModulacaoPlanoOut  implements java.io.Serializable {
    private com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem;

    private java.lang.String modulacaoAtualDSLAM;

    private boolean isModulacaoCorretaPlano;

    public OSSTurbonetModulacaoPlanoOut() {
    }

    public OSSTurbonetModulacaoPlanoOut(
           com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem,
           java.lang.String modulacaoAtualDSLAM,
           boolean isModulacaoCorretaPlano) {
           this.mensagem = mensagem;
           this.modulacaoAtualDSLAM = modulacaoAtualDSLAM;
           this.isModulacaoCorretaPlano = isModulacaoCorretaPlano;
    }


    /**
     * Gets the mensagem value for this OSSTurbonetModulacaoPlanoOut.
     * 
     * @return mensagem
     */
    public com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut getMensagem() {
        return mensagem;
    }


    /**
     * Sets the mensagem value for this OSSTurbonetModulacaoPlanoOut.
     * 
     * @param mensagem
     */
    public void setMensagem(com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem) {
        this.mensagem = mensagem;
    }


    /**
     * Gets the modulacaoAtualDSLAM value for this OSSTurbonetModulacaoPlanoOut.
     * 
     * @return modulacaoAtualDSLAM
     */
    public java.lang.String getModulacaoAtualDSLAM() {
        return modulacaoAtualDSLAM;
    }


    /**
     * Sets the modulacaoAtualDSLAM value for this OSSTurbonetModulacaoPlanoOut.
     * 
     * @param modulacaoAtualDSLAM
     */
    public void setModulacaoAtualDSLAM(java.lang.String modulacaoAtualDSLAM) {
        this.modulacaoAtualDSLAM = modulacaoAtualDSLAM;
    }


    /**
     * Gets the isModulacaoCorretaPlano value for this OSSTurbonetModulacaoPlanoOut.
     * 
     * @return isModulacaoCorretaPlano
     */
    public boolean isIsModulacaoCorretaPlano() {
        return isModulacaoCorretaPlano;
    }


    /**
     * Sets the isModulacaoCorretaPlano value for this OSSTurbonetModulacaoPlanoOut.
     * 
     * @param isModulacaoCorretaPlano
     */
    public void setIsModulacaoCorretaPlano(boolean isModulacaoCorretaPlano) {
        this.isModulacaoCorretaPlano = isModulacaoCorretaPlano;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OSSTurbonetModulacaoPlanoOut)) return false;
        OSSTurbonetModulacaoPlanoOut other = (OSSTurbonetModulacaoPlanoOut) obj;
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
            ((this.modulacaoAtualDSLAM==null && other.getModulacaoAtualDSLAM()==null) || 
             (this.modulacaoAtualDSLAM!=null &&
              this.modulacaoAtualDSLAM.equals(other.getModulacaoAtualDSLAM()))) &&
            this.isModulacaoCorretaPlano == other.isIsModulacaoCorretaPlano();
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
        if (getModulacaoAtualDSLAM() != null) {
            _hashCode += getModulacaoAtualDSLAM().hashCode();
        }
        _hashCode += (isIsModulacaoCorretaPlano() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OSSTurbonetModulacaoPlanoOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetModulacaoPlano", "OSSTurbonetModulacaoPlanoOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensagem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetModulacaoPlano", "mensagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "OSSTurbonetOut"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulacaoAtualDSLAM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetModulacaoPlano", "modulacaoAtualDSLAM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isModulacaoCorretaPlano");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetModulacaoPlano", "isModulacaoCorretaPlano"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
