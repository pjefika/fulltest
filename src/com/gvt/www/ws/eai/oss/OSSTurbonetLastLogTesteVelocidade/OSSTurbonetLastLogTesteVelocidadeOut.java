/**
 * OSSTurbonetLastLogTesteVelocidadeOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.OSSTurbonetLastLogTesteVelocidade;

public class OSSTurbonetLastLogTesteVelocidadeOut  implements java.io.Serializable {
    private com.gvt.www.ws.eai.oss.ossturbonet.testevelocidade.OSSTurbonetLogTesteVelocidadeItemOut itens;

    private com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem;

    public OSSTurbonetLastLogTesteVelocidadeOut() {
    }

    public OSSTurbonetLastLogTesteVelocidadeOut(
           com.gvt.www.ws.eai.oss.ossturbonet.testevelocidade.OSSTurbonetLogTesteVelocidadeItemOut itens,
           com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem) {
           this.itens = itens;
           this.mensagem = mensagem;
    }


    /**
     * Gets the itens value for this OSSTurbonetLastLogTesteVelocidadeOut.
     * 
     * @return itens
     */
    public com.gvt.www.ws.eai.oss.ossturbonet.testevelocidade.OSSTurbonetLogTesteVelocidadeItemOut getItens() {
        return itens;
    }


    /**
     * Sets the itens value for this OSSTurbonetLastLogTesteVelocidadeOut.
     * 
     * @param itens
     */
    public void setItens(com.gvt.www.ws.eai.oss.ossturbonet.testevelocidade.OSSTurbonetLogTesteVelocidadeItemOut itens) {
        this.itens = itens;
    }


    /**
     * Gets the mensagem value for this OSSTurbonetLastLogTesteVelocidadeOut.
     * 
     * @return mensagem
     */
    public com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut getMensagem() {
        return mensagem;
    }


    /**
     * Sets the mensagem value for this OSSTurbonetLastLogTesteVelocidadeOut.
     * 
     * @param mensagem
     */
    public void setMensagem(com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem) {
        this.mensagem = mensagem;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OSSTurbonetLastLogTesteVelocidadeOut)) return false;
        OSSTurbonetLastLogTesteVelocidadeOut other = (OSSTurbonetLastLogTesteVelocidadeOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itens==null && other.getItens()==null) || 
             (this.itens!=null &&
              this.itens.equals(other.getItens()))) &&
            ((this.mensagem==null && other.getMensagem()==null) || 
             (this.mensagem!=null &&
              this.mensagem.equals(other.getMensagem())));
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
        if (getItens() != null) {
            _hashCode += getItens().hashCode();
        }
        if (getMensagem() != null) {
            _hashCode += getMensagem().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OSSTurbonetLastLogTesteVelocidadeOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetLastLogTesteVelocidade", "OSSTurbonetLastLogTesteVelocidadeOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itens");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetLastLogTesteVelocidade", "itens"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet/testevelocidade", "OSSTurbonetLogTesteVelocidadeItemOut"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensagem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetLastLogTesteVelocidade", "mensagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "OSSTurbonetOut"));
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
