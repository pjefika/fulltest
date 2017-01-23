/**
 * ConfigurarElementoBandaLargaIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.configuracaoTV;

public class ConfigurarElementoBandaLargaIn  implements java.io.Serializable {
    private com.gvt.www.ws.eai.configuradoronline.enviacomandoativacao.enviaComandoLegado.EnviaComandoLegadoIn enviaComandoLegado;

    private java.lang.String designadorTV;

    private java.lang.String designadorTurbonet;

    private java.lang.String documento;

    private java.lang.String identificadorUsuario;

    private boolean processarElementosInventario;

    private boolean configurarRadiusChangeVelocity;

    public ConfigurarElementoBandaLargaIn() {
    }

    public ConfigurarElementoBandaLargaIn(
           com.gvt.www.ws.eai.configuradoronline.enviacomandoativacao.enviaComandoLegado.EnviaComandoLegadoIn enviaComandoLegado,
           java.lang.String designadorTV,
           java.lang.String designadorTurbonet,
           java.lang.String documento,
           java.lang.String identificadorUsuario,
           boolean processarElementosInventario,
           boolean configurarRadiusChangeVelocity) {
           this.enviaComandoLegado = enviaComandoLegado;
           this.designadorTV = designadorTV;
           this.designadorTurbonet = designadorTurbonet;
           this.documento = documento;
           this.identificadorUsuario = identificadorUsuario;
           this.processarElementosInventario = processarElementosInventario;
           this.configurarRadiusChangeVelocity = configurarRadiusChangeVelocity;
    }


    /**
     * Gets the enviaComandoLegado value for this ConfigurarElementoBandaLargaIn.
     * 
     * @return enviaComandoLegado
     */
    public com.gvt.www.ws.eai.configuradoronline.enviacomandoativacao.enviaComandoLegado.EnviaComandoLegadoIn getEnviaComandoLegado() {
        return enviaComandoLegado;
    }


    /**
     * Sets the enviaComandoLegado value for this ConfigurarElementoBandaLargaIn.
     * 
     * @param enviaComandoLegado
     */
    public void setEnviaComandoLegado(com.gvt.www.ws.eai.configuradoronline.enviacomandoativacao.enviaComandoLegado.EnviaComandoLegadoIn enviaComandoLegado) {
        this.enviaComandoLegado = enviaComandoLegado;
    }


    /**
     * Gets the designadorTV value for this ConfigurarElementoBandaLargaIn.
     * 
     * @return designadorTV
     */
    public java.lang.String getDesignadorTV() {
        return designadorTV;
    }


    /**
     * Sets the designadorTV value for this ConfigurarElementoBandaLargaIn.
     * 
     * @param designadorTV
     */
    public void setDesignadorTV(java.lang.String designadorTV) {
        this.designadorTV = designadorTV;
    }


    /**
     * Gets the designadorTurbonet value for this ConfigurarElementoBandaLargaIn.
     * 
     * @return designadorTurbonet
     */
    public java.lang.String getDesignadorTurbonet() {
        return designadorTurbonet;
    }


    /**
     * Sets the designadorTurbonet value for this ConfigurarElementoBandaLargaIn.
     * 
     * @param designadorTurbonet
     */
    public void setDesignadorTurbonet(java.lang.String designadorTurbonet) {
        this.designadorTurbonet = designadorTurbonet;
    }


    /**
     * Gets the documento value for this ConfigurarElementoBandaLargaIn.
     * 
     * @return documento
     */
    public java.lang.String getDocumento() {
        return documento;
    }


    /**
     * Sets the documento value for this ConfigurarElementoBandaLargaIn.
     * 
     * @param documento
     */
    public void setDocumento(java.lang.String documento) {
        this.documento = documento;
    }


    /**
     * Gets the identificadorUsuario value for this ConfigurarElementoBandaLargaIn.
     * 
     * @return identificadorUsuario
     */
    public java.lang.String getIdentificadorUsuario() {
        return identificadorUsuario;
    }


    /**
     * Sets the identificadorUsuario value for this ConfigurarElementoBandaLargaIn.
     * 
     * @param identificadorUsuario
     */
    public void setIdentificadorUsuario(java.lang.String identificadorUsuario) {
        this.identificadorUsuario = identificadorUsuario;
    }


    /**
     * Gets the processarElementosInventario value for this ConfigurarElementoBandaLargaIn.
     * 
     * @return processarElementosInventario
     */
    public boolean isProcessarElementosInventario() {
        return processarElementosInventario;
    }


    /**
     * Sets the processarElementosInventario value for this ConfigurarElementoBandaLargaIn.
     * 
     * @param processarElementosInventario
     */
    public void setProcessarElementosInventario(boolean processarElementosInventario) {
        this.processarElementosInventario = processarElementosInventario;
    }


    /**
     * Gets the configurarRadiusChangeVelocity value for this ConfigurarElementoBandaLargaIn.
     * 
     * @return configurarRadiusChangeVelocity
     */
    public boolean isConfigurarRadiusChangeVelocity() {
        return configurarRadiusChangeVelocity;
    }


    /**
     * Sets the configurarRadiusChangeVelocity value for this ConfigurarElementoBandaLargaIn.
     * 
     * @param configurarRadiusChangeVelocity
     */
    public void setConfigurarRadiusChangeVelocity(boolean configurarRadiusChangeVelocity) {
        this.configurarRadiusChangeVelocity = configurarRadiusChangeVelocity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfigurarElementoBandaLargaIn)) return false;
        ConfigurarElementoBandaLargaIn other = (ConfigurarElementoBandaLargaIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.enviaComandoLegado==null && other.getEnviaComandoLegado()==null) || 
             (this.enviaComandoLegado!=null &&
              this.enviaComandoLegado.equals(other.getEnviaComandoLegado()))) &&
            ((this.designadorTV==null && other.getDesignadorTV()==null) || 
             (this.designadorTV!=null &&
              this.designadorTV.equals(other.getDesignadorTV()))) &&
            ((this.designadorTurbonet==null && other.getDesignadorTurbonet()==null) || 
             (this.designadorTurbonet!=null &&
              this.designadorTurbonet.equals(other.getDesignadorTurbonet()))) &&
            ((this.documento==null && other.getDocumento()==null) || 
             (this.documento!=null &&
              this.documento.equals(other.getDocumento()))) &&
            ((this.identificadorUsuario==null && other.getIdentificadorUsuario()==null) || 
             (this.identificadorUsuario!=null &&
              this.identificadorUsuario.equals(other.getIdentificadorUsuario()))) &&
            this.processarElementosInventario == other.isProcessarElementosInventario() &&
            this.configurarRadiusChangeVelocity == other.isConfigurarRadiusChangeVelocity();
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
        if (getEnviaComandoLegado() != null) {
            _hashCode += getEnviaComandoLegado().hashCode();
        }
        if (getDesignadorTV() != null) {
            _hashCode += getDesignadorTV().hashCode();
        }
        if (getDesignadorTurbonet() != null) {
            _hashCode += getDesignadorTurbonet().hashCode();
        }
        if (getDocumento() != null) {
            _hashCode += getDocumento().hashCode();
        }
        if (getIdentificadorUsuario() != null) {
            _hashCode += getIdentificadorUsuario().hashCode();
        }
        _hashCode += (isProcessarElementosInventario() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isConfigurarRadiusChangeVelocity() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfigurarElementoBandaLargaIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConfigurarElementoBandaLargaIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enviaComandoLegado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "enviaComandoLegado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/enviacomandoativacao/enviaComandoLegado", "EnviaComandoLegadoIn"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designadorTV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "designadorTV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designadorTurbonet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "designadorTurbonet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "documento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificadorUsuario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "identificadorUsuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processarElementosInventario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "processarElementosInventario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configurarRadiusChangeVelocity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "configurarRadiusChangeVelocity"));
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
