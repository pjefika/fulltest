/**
 * OSSTurbonetSNRAtenuacaoOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.OSSTurbonetSNRAtenuacao;

public class OSSTurbonetSNRAtenuacaoOut  implements java.io.Serializable {
    private com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem;

    private java.lang.String snrMedido;

    private java.lang.String atenuacaoMedido;

    private java.lang.String snrReferencia;

    private java.lang.String atenuacaoReferencia;

    private java.lang.Boolean ehInconsistente;

    public OSSTurbonetSNRAtenuacaoOut() {
    }

    public OSSTurbonetSNRAtenuacaoOut(
           com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem,
           java.lang.String snrMedido,
           java.lang.String atenuacaoMedido,
           java.lang.String snrReferencia,
           java.lang.String atenuacaoReferencia,
           java.lang.Boolean ehInconsistente) {
           this.mensagem = mensagem;
           this.snrMedido = snrMedido;
           this.atenuacaoMedido = atenuacaoMedido;
           this.snrReferencia = snrReferencia;
           this.atenuacaoReferencia = atenuacaoReferencia;
           this.ehInconsistente = ehInconsistente;
    }


    /**
     * Gets the mensagem value for this OSSTurbonetSNRAtenuacaoOut.
     * 
     * @return mensagem
     */
    public com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut getMensagem() {
        return mensagem;
    }


    /**
     * Sets the mensagem value for this OSSTurbonetSNRAtenuacaoOut.
     * 
     * @param mensagem
     */
    public void setMensagem(com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem) {
        this.mensagem = mensagem;
    }


    /**
     * Gets the snrMedido value for this OSSTurbonetSNRAtenuacaoOut.
     * 
     * @return snrMedido
     */
    public java.lang.String getSnrMedido() {
        return snrMedido;
    }


    /**
     * Sets the snrMedido value for this OSSTurbonetSNRAtenuacaoOut.
     * 
     * @param snrMedido
     */
    public void setSnrMedido(java.lang.String snrMedido) {
        this.snrMedido = snrMedido;
    }


    /**
     * Gets the atenuacaoMedido value for this OSSTurbonetSNRAtenuacaoOut.
     * 
     * @return atenuacaoMedido
     */
    public java.lang.String getAtenuacaoMedido() {
        return atenuacaoMedido;
    }


    /**
     * Sets the atenuacaoMedido value for this OSSTurbonetSNRAtenuacaoOut.
     * 
     * @param atenuacaoMedido
     */
    public void setAtenuacaoMedido(java.lang.String atenuacaoMedido) {
        this.atenuacaoMedido = atenuacaoMedido;
    }


    /**
     * Gets the snrReferencia value for this OSSTurbonetSNRAtenuacaoOut.
     * 
     * @return snrReferencia
     */
    public java.lang.String getSnrReferencia() {
        return snrReferencia;
    }


    /**
     * Sets the snrReferencia value for this OSSTurbonetSNRAtenuacaoOut.
     * 
     * @param snrReferencia
     */
    public void setSnrReferencia(java.lang.String snrReferencia) {
        this.snrReferencia = snrReferencia;
    }


    /**
     * Gets the atenuacaoReferencia value for this OSSTurbonetSNRAtenuacaoOut.
     * 
     * @return atenuacaoReferencia
     */
    public java.lang.String getAtenuacaoReferencia() {
        return atenuacaoReferencia;
    }


    /**
     * Sets the atenuacaoReferencia value for this OSSTurbonetSNRAtenuacaoOut.
     * 
     * @param atenuacaoReferencia
     */
    public void setAtenuacaoReferencia(java.lang.String atenuacaoReferencia) {
        this.atenuacaoReferencia = atenuacaoReferencia;
    }


    /**
     * Gets the ehInconsistente value for this OSSTurbonetSNRAtenuacaoOut.
     * 
     * @return ehInconsistente
     */
    public java.lang.Boolean getEhInconsistente() {
        return ehInconsistente;
    }


    /**
     * Sets the ehInconsistente value for this OSSTurbonetSNRAtenuacaoOut.
     * 
     * @param ehInconsistente
     */
    public void setEhInconsistente(java.lang.Boolean ehInconsistente) {
        this.ehInconsistente = ehInconsistente;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OSSTurbonetSNRAtenuacaoOut)) return false;
        OSSTurbonetSNRAtenuacaoOut other = (OSSTurbonetSNRAtenuacaoOut) obj;
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
            ((this.snrMedido==null && other.getSnrMedido()==null) || 
             (this.snrMedido!=null &&
              this.snrMedido.equals(other.getSnrMedido()))) &&
            ((this.atenuacaoMedido==null && other.getAtenuacaoMedido()==null) || 
             (this.atenuacaoMedido!=null &&
              this.atenuacaoMedido.equals(other.getAtenuacaoMedido()))) &&
            ((this.snrReferencia==null && other.getSnrReferencia()==null) || 
             (this.snrReferencia!=null &&
              this.snrReferencia.equals(other.getSnrReferencia()))) &&
            ((this.atenuacaoReferencia==null && other.getAtenuacaoReferencia()==null) || 
             (this.atenuacaoReferencia!=null &&
              this.atenuacaoReferencia.equals(other.getAtenuacaoReferencia()))) &&
            ((this.ehInconsistente==null && other.getEhInconsistente()==null) || 
             (this.ehInconsistente!=null &&
              this.ehInconsistente.equals(other.getEhInconsistente())));
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
        if (getSnrMedido() != null) {
            _hashCode += getSnrMedido().hashCode();
        }
        if (getAtenuacaoMedido() != null) {
            _hashCode += getAtenuacaoMedido().hashCode();
        }
        if (getSnrReferencia() != null) {
            _hashCode += getSnrReferencia().hashCode();
        }
        if (getAtenuacaoReferencia() != null) {
            _hashCode += getAtenuacaoReferencia().hashCode();
        }
        if (getEhInconsistente() != null) {
            _hashCode += getEhInconsistente().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OSSTurbonetSNRAtenuacaoOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetSNRAtenuacao", "OSSTurbonetSNRAtenuacaoOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensagem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetSNRAtenuacao", "mensagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "OSSTurbonetOut"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snrMedido");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetSNRAtenuacao", "snrMedido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atenuacaoMedido");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetSNRAtenuacao", "atenuacaoMedido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snrReferencia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetSNRAtenuacao", "snrReferencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atenuacaoReferencia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetSNRAtenuacao", "atenuacaoReferencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ehInconsistente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetSNRAtenuacao", "ehInconsistente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
