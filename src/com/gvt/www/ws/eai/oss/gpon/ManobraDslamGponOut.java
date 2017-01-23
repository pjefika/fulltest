/**
 * ManobraDslamGponOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.gpon;

public class ManobraDslamGponOut  implements java.io.Serializable {
    private com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem;

    private com.gvt.www.ws.eai.oss.gpon.RetornoDesassociarSerial retornoDesassociarSerial;

    private com.gvt.www.ws.eai.oss.gpon.RetornoAssociarSerial retornoAssociarSerial;

    private com.gvt.www.ws.eai.oss.gpon.RetornoCriarBridge retornoCriarBridge;

    private com.gvt.www.ws.eai.oss.gpon.RetornoAlterarVelocidade retornoAlterarVelocidade;

    public ManobraDslamGponOut() {
    }

    public ManobraDslamGponOut(
           com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem,
           com.gvt.www.ws.eai.oss.gpon.RetornoDesassociarSerial retornoDesassociarSerial,
           com.gvt.www.ws.eai.oss.gpon.RetornoAssociarSerial retornoAssociarSerial,
           com.gvt.www.ws.eai.oss.gpon.RetornoCriarBridge retornoCriarBridge,
           com.gvt.www.ws.eai.oss.gpon.RetornoAlterarVelocidade retornoAlterarVelocidade) {
           this.mensagem = mensagem;
           this.retornoDesassociarSerial = retornoDesassociarSerial;
           this.retornoAssociarSerial = retornoAssociarSerial;
           this.retornoCriarBridge = retornoCriarBridge;
           this.retornoAlterarVelocidade = retornoAlterarVelocidade;
    }


    /**
     * Gets the mensagem value for this ManobraDslamGponOut.
     * 
     * @return mensagem
     */
    public com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut getMensagem() {
        return mensagem;
    }


    /**
     * Sets the mensagem value for this ManobraDslamGponOut.
     * 
     * @param mensagem
     */
    public void setMensagem(com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem) {
        this.mensagem = mensagem;
    }


    /**
     * Gets the retornoDesassociarSerial value for this ManobraDslamGponOut.
     * 
     * @return retornoDesassociarSerial
     */
    public com.gvt.www.ws.eai.oss.gpon.RetornoDesassociarSerial getRetornoDesassociarSerial() {
        return retornoDesassociarSerial;
    }


    /**
     * Sets the retornoDesassociarSerial value for this ManobraDslamGponOut.
     * 
     * @param retornoDesassociarSerial
     */
    public void setRetornoDesassociarSerial(com.gvt.www.ws.eai.oss.gpon.RetornoDesassociarSerial retornoDesassociarSerial) {
        this.retornoDesassociarSerial = retornoDesassociarSerial;
    }


    /**
     * Gets the retornoAssociarSerial value for this ManobraDslamGponOut.
     * 
     * @return retornoAssociarSerial
     */
    public com.gvt.www.ws.eai.oss.gpon.RetornoAssociarSerial getRetornoAssociarSerial() {
        return retornoAssociarSerial;
    }


    /**
     * Sets the retornoAssociarSerial value for this ManobraDslamGponOut.
     * 
     * @param retornoAssociarSerial
     */
    public void setRetornoAssociarSerial(com.gvt.www.ws.eai.oss.gpon.RetornoAssociarSerial retornoAssociarSerial) {
        this.retornoAssociarSerial = retornoAssociarSerial;
    }


    /**
     * Gets the retornoCriarBridge value for this ManobraDslamGponOut.
     * 
     * @return retornoCriarBridge
     */
    public com.gvt.www.ws.eai.oss.gpon.RetornoCriarBridge getRetornoCriarBridge() {
        return retornoCriarBridge;
    }


    /**
     * Sets the retornoCriarBridge value for this ManobraDslamGponOut.
     * 
     * @param retornoCriarBridge
     */
    public void setRetornoCriarBridge(com.gvt.www.ws.eai.oss.gpon.RetornoCriarBridge retornoCriarBridge) {
        this.retornoCriarBridge = retornoCriarBridge;
    }


    /**
     * Gets the retornoAlterarVelocidade value for this ManobraDslamGponOut.
     * 
     * @return retornoAlterarVelocidade
     */
    public com.gvt.www.ws.eai.oss.gpon.RetornoAlterarVelocidade getRetornoAlterarVelocidade() {
        return retornoAlterarVelocidade;
    }


    /**
     * Sets the retornoAlterarVelocidade value for this ManobraDslamGponOut.
     * 
     * @param retornoAlterarVelocidade
     */
    public void setRetornoAlterarVelocidade(com.gvt.www.ws.eai.oss.gpon.RetornoAlterarVelocidade retornoAlterarVelocidade) {
        this.retornoAlterarVelocidade = retornoAlterarVelocidade;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManobraDslamGponOut)) return false;
        ManobraDslamGponOut other = (ManobraDslamGponOut) obj;
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
            ((this.retornoDesassociarSerial==null && other.getRetornoDesassociarSerial()==null) || 
             (this.retornoDesassociarSerial!=null &&
              this.retornoDesassociarSerial.equals(other.getRetornoDesassociarSerial()))) &&
            ((this.retornoAssociarSerial==null && other.getRetornoAssociarSerial()==null) || 
             (this.retornoAssociarSerial!=null &&
              this.retornoAssociarSerial.equals(other.getRetornoAssociarSerial()))) &&
            ((this.retornoCriarBridge==null && other.getRetornoCriarBridge()==null) || 
             (this.retornoCriarBridge!=null &&
              this.retornoCriarBridge.equals(other.getRetornoCriarBridge()))) &&
            ((this.retornoAlterarVelocidade==null && other.getRetornoAlterarVelocidade()==null) || 
             (this.retornoAlterarVelocidade!=null &&
              this.retornoAlterarVelocidade.equals(other.getRetornoAlterarVelocidade())));
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
        if (getRetornoDesassociarSerial() != null) {
            _hashCode += getRetornoDesassociarSerial().hashCode();
        }
        if (getRetornoAssociarSerial() != null) {
            _hashCode += getRetornoAssociarSerial().hashCode();
        }
        if (getRetornoCriarBridge() != null) {
            _hashCode += getRetornoCriarBridge().hashCode();
        }
        if (getRetornoAlterarVelocidade() != null) {
            _hashCode += getRetornoAlterarVelocidade().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManobraDslamGponOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "ManobraDslamGponOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensagem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "mensagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "OSSTurbonetOut"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retornoDesassociarSerial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "retornoDesassociarSerial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "RetornoDesassociarSerial"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retornoAssociarSerial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "retornoAssociarSerial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "RetornoAssociarSerial"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retornoCriarBridge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "retornoCriarBridge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "RetornoCriarBridge"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retornoAlterarVelocidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "retornoAlterarVelocidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "RetornoAlterarVelocidade"));
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
