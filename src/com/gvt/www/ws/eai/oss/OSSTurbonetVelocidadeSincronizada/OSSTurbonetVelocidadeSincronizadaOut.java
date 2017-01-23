/**
 * OSSTurbonetVelocidadeSincronizadaOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.OSSTurbonetVelocidadeSincronizada;

public class OSSTurbonetVelocidadeSincronizadaOut  implements java.io.Serializable {
    private com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem;

    private java.lang.Integer velocidadeSincronizadaDownload;

    private java.lang.Integer velocidadeSincronizadaUpload;

    private java.lang.Integer velocidadeDownloadReferencia;

    private java.lang.Integer velocidadeUploadReferencia;

    private java.lang.Boolean ehVelocidadeCorreta;

    public OSSTurbonetVelocidadeSincronizadaOut() {
    }

    public OSSTurbonetVelocidadeSincronizadaOut(
           com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem,
           java.lang.Integer velocidadeSincronizadaDownload,
           java.lang.Integer velocidadeSincronizadaUpload,
           java.lang.Integer velocidadeDownloadReferencia,
           java.lang.Integer velocidadeUploadReferencia,
           java.lang.Boolean ehVelocidadeCorreta) {
           this.mensagem = mensagem;
           this.velocidadeSincronizadaDownload = velocidadeSincronizadaDownload;
           this.velocidadeSincronizadaUpload = velocidadeSincronizadaUpload;
           this.velocidadeDownloadReferencia = velocidadeDownloadReferencia;
           this.velocidadeUploadReferencia = velocidadeUploadReferencia;
           this.ehVelocidadeCorreta = ehVelocidadeCorreta;
    }


    /**
     * Gets the mensagem value for this OSSTurbonetVelocidadeSincronizadaOut.
     * 
     * @return mensagem
     */
    public com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut getMensagem() {
        return mensagem;
    }


    /**
     * Sets the mensagem value for this OSSTurbonetVelocidadeSincronizadaOut.
     * 
     * @param mensagem
     */
    public void setMensagem(com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem) {
        this.mensagem = mensagem;
    }


    /**
     * Gets the velocidadeSincronizadaDownload value for this OSSTurbonetVelocidadeSincronizadaOut.
     * 
     * @return velocidadeSincronizadaDownload
     */
    public java.lang.Integer getVelocidadeSincronizadaDownload() {
        return velocidadeSincronizadaDownload;
    }


    /**
     * Sets the velocidadeSincronizadaDownload value for this OSSTurbonetVelocidadeSincronizadaOut.
     * 
     * @param velocidadeSincronizadaDownload
     */
    public void setVelocidadeSincronizadaDownload(java.lang.Integer velocidadeSincronizadaDownload) {
        this.velocidadeSincronizadaDownload = velocidadeSincronizadaDownload;
    }


    /**
     * Gets the velocidadeSincronizadaUpload value for this OSSTurbonetVelocidadeSincronizadaOut.
     * 
     * @return velocidadeSincronizadaUpload
     */
    public java.lang.Integer getVelocidadeSincronizadaUpload() {
        return velocidadeSincronizadaUpload;
    }


    /**
     * Sets the velocidadeSincronizadaUpload value for this OSSTurbonetVelocidadeSincronizadaOut.
     * 
     * @param velocidadeSincronizadaUpload
     */
    public void setVelocidadeSincronizadaUpload(java.lang.Integer velocidadeSincronizadaUpload) {
        this.velocidadeSincronizadaUpload = velocidadeSincronizadaUpload;
    }


    /**
     * Gets the velocidadeDownloadReferencia value for this OSSTurbonetVelocidadeSincronizadaOut.
     * 
     * @return velocidadeDownloadReferencia
     */
    public java.lang.Integer getVelocidadeDownloadReferencia() {
        return velocidadeDownloadReferencia;
    }


    /**
     * Sets the velocidadeDownloadReferencia value for this OSSTurbonetVelocidadeSincronizadaOut.
     * 
     * @param velocidadeDownloadReferencia
     */
    public void setVelocidadeDownloadReferencia(java.lang.Integer velocidadeDownloadReferencia) {
        this.velocidadeDownloadReferencia = velocidadeDownloadReferencia;
    }


    /**
     * Gets the velocidadeUploadReferencia value for this OSSTurbonetVelocidadeSincronizadaOut.
     * 
     * @return velocidadeUploadReferencia
     */
    public java.lang.Integer getVelocidadeUploadReferencia() {
        return velocidadeUploadReferencia;
    }


    /**
     * Sets the velocidadeUploadReferencia value for this OSSTurbonetVelocidadeSincronizadaOut.
     * 
     * @param velocidadeUploadReferencia
     */
    public void setVelocidadeUploadReferencia(java.lang.Integer velocidadeUploadReferencia) {
        this.velocidadeUploadReferencia = velocidadeUploadReferencia;
    }


    /**
     * Gets the ehVelocidadeCorreta value for this OSSTurbonetVelocidadeSincronizadaOut.
     * 
     * @return ehVelocidadeCorreta
     */
    public java.lang.Boolean getEhVelocidadeCorreta() {
        return ehVelocidadeCorreta;
    }


    /**
     * Sets the ehVelocidadeCorreta value for this OSSTurbonetVelocidadeSincronizadaOut.
     * 
     * @param ehVelocidadeCorreta
     */
    public void setEhVelocidadeCorreta(java.lang.Boolean ehVelocidadeCorreta) {
        this.ehVelocidadeCorreta = ehVelocidadeCorreta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OSSTurbonetVelocidadeSincronizadaOut)) return false;
        OSSTurbonetVelocidadeSincronizadaOut other = (OSSTurbonetVelocidadeSincronizadaOut) obj;
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
            ((this.velocidadeSincronizadaDownload==null && other.getVelocidadeSincronizadaDownload()==null) || 
             (this.velocidadeSincronizadaDownload!=null &&
              this.velocidadeSincronizadaDownload.equals(other.getVelocidadeSincronizadaDownload()))) &&
            ((this.velocidadeSincronizadaUpload==null && other.getVelocidadeSincronizadaUpload()==null) || 
             (this.velocidadeSincronizadaUpload!=null &&
              this.velocidadeSincronizadaUpload.equals(other.getVelocidadeSincronizadaUpload()))) &&
            ((this.velocidadeDownloadReferencia==null && other.getVelocidadeDownloadReferencia()==null) || 
             (this.velocidadeDownloadReferencia!=null &&
              this.velocidadeDownloadReferencia.equals(other.getVelocidadeDownloadReferencia()))) &&
            ((this.velocidadeUploadReferencia==null && other.getVelocidadeUploadReferencia()==null) || 
             (this.velocidadeUploadReferencia!=null &&
              this.velocidadeUploadReferencia.equals(other.getVelocidadeUploadReferencia()))) &&
            ((this.ehVelocidadeCorreta==null && other.getEhVelocidadeCorreta()==null) || 
             (this.ehVelocidadeCorreta!=null &&
              this.ehVelocidadeCorreta.equals(other.getEhVelocidadeCorreta())));
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
        if (getVelocidadeSincronizadaDownload() != null) {
            _hashCode += getVelocidadeSincronizadaDownload().hashCode();
        }
        if (getVelocidadeSincronizadaUpload() != null) {
            _hashCode += getVelocidadeSincronizadaUpload().hashCode();
        }
        if (getVelocidadeDownloadReferencia() != null) {
            _hashCode += getVelocidadeDownloadReferencia().hashCode();
        }
        if (getVelocidadeUploadReferencia() != null) {
            _hashCode += getVelocidadeUploadReferencia().hashCode();
        }
        if (getEhVelocidadeCorreta() != null) {
            _hashCode += getEhVelocidadeCorreta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OSSTurbonetVelocidadeSincronizadaOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetVelocidadeSincronizada", "OSSTurbonetVelocidadeSincronizadaOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensagem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetVelocidadeSincronizada", "mensagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "OSSTurbonetOut"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("velocidadeSincronizadaDownload");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetVelocidadeSincronizada", "velocidadeSincronizadaDownload"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("velocidadeSincronizadaUpload");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetVelocidadeSincronizada", "velocidadeSincronizadaUpload"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("velocidadeDownloadReferencia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetVelocidadeSincronizada", "velocidadeDownloadReferencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("velocidadeUploadReferencia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetVelocidadeSincronizada", "velocidadeUploadReferencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ehVelocidadeCorreta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetVelocidadeSincronizada", "ehVelocidadeCorreta"));
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
