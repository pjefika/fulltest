/**
 * OSSTurbonetMotivosDesconexaoOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.OSSTurbonetMotivosDesconexao;

public class OSSTurbonetMotivosDesconexaoOut  implements java.io.Serializable {
    private com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem;

    private com.gvt.www.ws.eai.oss.OSSTurbonetMotivosDesconexao.OSSTurbonetMotivosDesconexaoOutMotivosDesconexao[] motivosDesconexao;

    public OSSTurbonetMotivosDesconexaoOut() {
    }

    public OSSTurbonetMotivosDesconexaoOut(
           com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem,
           com.gvt.www.ws.eai.oss.OSSTurbonetMotivosDesconexao.OSSTurbonetMotivosDesconexaoOutMotivosDesconexao[] motivosDesconexao) {
           this.mensagem = mensagem;
           this.motivosDesconexao = motivosDesconexao;
    }


    /**
     * Gets the mensagem value for this OSSTurbonetMotivosDesconexaoOut.
     * 
     * @return mensagem
     */
    public com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut getMensagem() {
        return mensagem;
    }


    /**
     * Sets the mensagem value for this OSSTurbonetMotivosDesconexaoOut.
     * 
     * @param mensagem
     */
    public void setMensagem(com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem) {
        this.mensagem = mensagem;
    }


    /**
     * Gets the motivosDesconexao value for this OSSTurbonetMotivosDesconexaoOut.
     * 
     * @return motivosDesconexao
     */
    public com.gvt.www.ws.eai.oss.OSSTurbonetMotivosDesconexao.OSSTurbonetMotivosDesconexaoOutMotivosDesconexao[] getMotivosDesconexao() {
        return motivosDesconexao;
    }


    /**
     * Sets the motivosDesconexao value for this OSSTurbonetMotivosDesconexaoOut.
     * 
     * @param motivosDesconexao
     */
    public void setMotivosDesconexao(com.gvt.www.ws.eai.oss.OSSTurbonetMotivosDesconexao.OSSTurbonetMotivosDesconexaoOutMotivosDesconexao[] motivosDesconexao) {
        this.motivosDesconexao = motivosDesconexao;
    }

    public com.gvt.www.ws.eai.oss.OSSTurbonetMotivosDesconexao.OSSTurbonetMotivosDesconexaoOutMotivosDesconexao getMotivosDesconexao(int i) {
        return this.motivosDesconexao[i];
    }

    public void setMotivosDesconexao(int i, com.gvt.www.ws.eai.oss.OSSTurbonetMotivosDesconexao.OSSTurbonetMotivosDesconexaoOutMotivosDesconexao _value) {
        this.motivosDesconexao[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OSSTurbonetMotivosDesconexaoOut)) return false;
        OSSTurbonetMotivosDesconexaoOut other = (OSSTurbonetMotivosDesconexaoOut) obj;
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
            ((this.motivosDesconexao==null && other.getMotivosDesconexao()==null) || 
             (this.motivosDesconexao!=null &&
              java.util.Arrays.equals(this.motivosDesconexao, other.getMotivosDesconexao())));
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
        if (getMotivosDesconexao() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMotivosDesconexao());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMotivosDesconexao(), i);
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
        new org.apache.axis.description.TypeDesc(OSSTurbonetMotivosDesconexaoOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetMotivosDesconexao", "OSSTurbonetMotivosDesconexaoOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensagem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetMotivosDesconexao", "mensagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "OSSTurbonetOut"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motivosDesconexao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetMotivosDesconexao", "motivosDesconexao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetMotivosDesconexao", ">OSSTurbonetMotivosDesconexaoOut>motivosDesconexao"));
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
