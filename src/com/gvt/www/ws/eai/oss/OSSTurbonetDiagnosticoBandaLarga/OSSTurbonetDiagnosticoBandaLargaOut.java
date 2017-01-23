/**
 * OSSTurbonetDiagnosticoBandaLargaOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga;

public class OSSTurbonetDiagnosticoBandaLargaOut  implements java.io.Serializable {
    private com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem;

    private com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.ValorDeDiagnostico atenuacao;

    private com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.ValorDeDiagnostico snr;

    private com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.ValorDeDiagnostico modulacao;

    private com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.ValorDeDiagnosticoDeVelocidade velocidadeSincronizada;

    private com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.ValorDeDiagnosticoDeVelocidade velocidadeContratada;

    /* O valor TRUE indica que o modem está UP. O valor
     * 						FALSE indica que o modem está DOWN. */
    private boolean modemSincronizado;

    private java.lang.String statusPorta;

    private com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.ValorDeDiagnosticoRadius radius;

    public OSSTurbonetDiagnosticoBandaLargaOut() {
    }

    public OSSTurbonetDiagnosticoBandaLargaOut(
           com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem,
           com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.ValorDeDiagnostico atenuacao,
           com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.ValorDeDiagnostico snr,
           com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.ValorDeDiagnostico modulacao,
           com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.ValorDeDiagnosticoDeVelocidade velocidadeSincronizada,
           com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.ValorDeDiagnosticoDeVelocidade velocidadeContratada,
           boolean modemSincronizado,
           java.lang.String statusPorta,
           com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.ValorDeDiagnosticoRadius radius) {
           this.mensagem = mensagem;
           this.atenuacao = atenuacao;
           this.snr = snr;
           this.modulacao = modulacao;
           this.velocidadeSincronizada = velocidadeSincronizada;
           this.velocidadeContratada = velocidadeContratada;
           this.modemSincronizado = modemSincronizado;
           this.statusPorta = statusPorta;
           this.radius = radius;
    }


    /**
     * Gets the mensagem value for this OSSTurbonetDiagnosticoBandaLargaOut.
     * 
     * @return mensagem
     */
    public com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut getMensagem() {
        return mensagem;
    }


    /**
     * Sets the mensagem value for this OSSTurbonetDiagnosticoBandaLargaOut.
     * 
     * @param mensagem
     */
    public void setMensagem(com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem) {
        this.mensagem = mensagem;
    }


    /**
     * Gets the atenuacao value for this OSSTurbonetDiagnosticoBandaLargaOut.
     * 
     * @return atenuacao
     */
    public com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.ValorDeDiagnostico getAtenuacao() {
        return atenuacao;
    }


    /**
     * Sets the atenuacao value for this OSSTurbonetDiagnosticoBandaLargaOut.
     * 
     * @param atenuacao
     */
    public void setAtenuacao(com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.ValorDeDiagnostico atenuacao) {
        this.atenuacao = atenuacao;
    }


    /**
     * Gets the snr value for this OSSTurbonetDiagnosticoBandaLargaOut.
     * 
     * @return snr
     */
    public com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.ValorDeDiagnostico getSnr() {
        return snr;
    }


    /**
     * Sets the snr value for this OSSTurbonetDiagnosticoBandaLargaOut.
     * 
     * @param snr
     */
    public void setSnr(com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.ValorDeDiagnostico snr) {
        this.snr = snr;
    }


    /**
     * Gets the modulacao value for this OSSTurbonetDiagnosticoBandaLargaOut.
     * 
     * @return modulacao
     */
    public com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.ValorDeDiagnostico getModulacao() {
        return modulacao;
    }


    /**
     * Sets the modulacao value for this OSSTurbonetDiagnosticoBandaLargaOut.
     * 
     * @param modulacao
     */
    public void setModulacao(com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.ValorDeDiagnostico modulacao) {
        this.modulacao = modulacao;
    }


    /**
     * Gets the velocidadeSincronizada value for this OSSTurbonetDiagnosticoBandaLargaOut.
     * 
     * @return velocidadeSincronizada
     */
    public com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.ValorDeDiagnosticoDeVelocidade getVelocidadeSincronizada() {
        return velocidadeSincronizada;
    }


    /**
     * Sets the velocidadeSincronizada value for this OSSTurbonetDiagnosticoBandaLargaOut.
     * 
     * @param velocidadeSincronizada
     */
    public void setVelocidadeSincronizada(com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.ValorDeDiagnosticoDeVelocidade velocidadeSincronizada) {
        this.velocidadeSincronizada = velocidadeSincronizada;
    }


    /**
     * Gets the velocidadeContratada value for this OSSTurbonetDiagnosticoBandaLargaOut.
     * 
     * @return velocidadeContratada
     */
    public com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.ValorDeDiagnosticoDeVelocidade getVelocidadeContratada() {
        return velocidadeContratada;
    }


    /**
     * Sets the velocidadeContratada value for this OSSTurbonetDiagnosticoBandaLargaOut.
     * 
     * @param velocidadeContratada
     */
    public void setVelocidadeContratada(com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.ValorDeDiagnosticoDeVelocidade velocidadeContratada) {
        this.velocidadeContratada = velocidadeContratada;
    }


    /**
     * Gets the modemSincronizado value for this OSSTurbonetDiagnosticoBandaLargaOut.
     * 
     * @return modemSincronizado   * O valor TRUE indica que o modem está UP. O valor
     * 						FALSE indica que o modem está DOWN.
     */
    public boolean isModemSincronizado() {
        return modemSincronizado;
    }


    /**
     * Sets the modemSincronizado value for this OSSTurbonetDiagnosticoBandaLargaOut.
     * 
     * @param modemSincronizado   * O valor TRUE indica que o modem está UP. O valor
     * 						FALSE indica que o modem está DOWN.
     */
    public void setModemSincronizado(boolean modemSincronizado) {
        this.modemSincronizado = modemSincronizado;
    }


    /**
     * Gets the statusPorta value for this OSSTurbonetDiagnosticoBandaLargaOut.
     * 
     * @return statusPorta
     */
    public java.lang.String getStatusPorta() {
        return statusPorta;
    }


    /**
     * Sets the statusPorta value for this OSSTurbonetDiagnosticoBandaLargaOut.
     * 
     * @param statusPorta
     */
    public void setStatusPorta(java.lang.String statusPorta) {
        this.statusPorta = statusPorta;
    }


    /**
     * Gets the radius value for this OSSTurbonetDiagnosticoBandaLargaOut.
     * 
     * @return radius
     */
    public com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.ValorDeDiagnosticoRadius getRadius() {
        return radius;
    }


    /**
     * Sets the radius value for this OSSTurbonetDiagnosticoBandaLargaOut.
     * 
     * @param radius
     */
    public void setRadius(com.gvt.www.ws.eai.oss.OSSTurbonetDiagnosticoBandaLarga.ValorDeDiagnosticoRadius radius) {
        this.radius = radius;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OSSTurbonetDiagnosticoBandaLargaOut)) return false;
        OSSTurbonetDiagnosticoBandaLargaOut other = (OSSTurbonetDiagnosticoBandaLargaOut) obj;
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
            ((this.atenuacao==null && other.getAtenuacao()==null) || 
             (this.atenuacao!=null &&
              this.atenuacao.equals(other.getAtenuacao()))) &&
            ((this.snr==null && other.getSnr()==null) || 
             (this.snr!=null &&
              this.snr.equals(other.getSnr()))) &&
            ((this.modulacao==null && other.getModulacao()==null) || 
             (this.modulacao!=null &&
              this.modulacao.equals(other.getModulacao()))) &&
            ((this.velocidadeSincronizada==null && other.getVelocidadeSincronizada()==null) || 
             (this.velocidadeSincronizada!=null &&
              this.velocidadeSincronizada.equals(other.getVelocidadeSincronizada()))) &&
            ((this.velocidadeContratada==null && other.getVelocidadeContratada()==null) || 
             (this.velocidadeContratada!=null &&
              this.velocidadeContratada.equals(other.getVelocidadeContratada()))) &&
            this.modemSincronizado == other.isModemSincronizado() &&
            ((this.statusPorta==null && other.getStatusPorta()==null) || 
             (this.statusPorta!=null &&
              this.statusPorta.equals(other.getStatusPorta()))) &&
            ((this.radius==null && other.getRadius()==null) || 
             (this.radius!=null &&
              this.radius.equals(other.getRadius())));
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
        if (getAtenuacao() != null) {
            _hashCode += getAtenuacao().hashCode();
        }
        if (getSnr() != null) {
            _hashCode += getSnr().hashCode();
        }
        if (getModulacao() != null) {
            _hashCode += getModulacao().hashCode();
        }
        if (getVelocidadeSincronizada() != null) {
            _hashCode += getVelocidadeSincronizada().hashCode();
        }
        if (getVelocidadeContratada() != null) {
            _hashCode += getVelocidadeContratada().hashCode();
        }
        _hashCode += (isModemSincronizado() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getStatusPorta() != null) {
            _hashCode += getStatusPorta().hashCode();
        }
        if (getRadius() != null) {
            _hashCode += getRadius().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OSSTurbonetDiagnosticoBandaLargaOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetDiagnosticoBandaLarga", "OSSTurbonetDiagnosticoBandaLargaOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensagem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetDiagnosticoBandaLarga", "mensagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "OSSTurbonetOut"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atenuacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetDiagnosticoBandaLarga", "atenuacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetDiagnosticoBandaLarga", "ValorDeDiagnostico"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetDiagnosticoBandaLarga", "snr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetDiagnosticoBandaLarga", "ValorDeDiagnostico"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetDiagnosticoBandaLarga", "modulacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetDiagnosticoBandaLarga", "ValorDeDiagnostico"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("velocidadeSincronizada");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetDiagnosticoBandaLarga", "velocidadeSincronizada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetDiagnosticoBandaLarga", "ValorDeDiagnosticoDeVelocidade"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("velocidadeContratada");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetDiagnosticoBandaLarga", "velocidadeContratada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetDiagnosticoBandaLarga", "ValorDeDiagnosticoDeVelocidade"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modemSincronizado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetDiagnosticoBandaLarga", "modemSincronizado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusPorta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetDiagnosticoBandaLarga", "statusPorta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radius");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetDiagnosticoBandaLarga", "radius"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetDiagnosticoBandaLarga", "ValorDeDiagnosticoRadius"));
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
