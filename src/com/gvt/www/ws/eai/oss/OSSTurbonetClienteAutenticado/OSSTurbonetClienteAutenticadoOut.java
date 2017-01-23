/**
 * OSSTurbonetClienteAutenticadoOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.OSSTurbonetClienteAutenticado;

public class OSSTurbonetClienteAutenticadoOut  implements java.io.Serializable {
    private com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem;

    private java.lang.String designador;

    private java.lang.String login;

    private java.util.Calendar dataHoraAutenticacao;

    private boolean clienteAutenticado;

    public OSSTurbonetClienteAutenticadoOut() {
    }

    public OSSTurbonetClienteAutenticadoOut(
           com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem,
           java.lang.String designador,
           java.lang.String login,
           java.util.Calendar dataHoraAutenticacao,
           boolean clienteAutenticado) {
           this.mensagem = mensagem;
           this.designador = designador;
           this.login = login;
           this.dataHoraAutenticacao = dataHoraAutenticacao;
           this.clienteAutenticado = clienteAutenticado;
    }


    /**
     * Gets the mensagem value for this OSSTurbonetClienteAutenticadoOut.
     * 
     * @return mensagem
     */
    public com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut getMensagem() {
        return mensagem;
    }


    /**
     * Sets the mensagem value for this OSSTurbonetClienteAutenticadoOut.
     * 
     * @param mensagem
     */
    public void setMensagem(com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem) {
        this.mensagem = mensagem;
    }


    /**
     * Gets the designador value for this OSSTurbonetClienteAutenticadoOut.
     * 
     * @return designador
     */
    public java.lang.String getDesignador() {
        return designador;
    }


    /**
     * Sets the designador value for this OSSTurbonetClienteAutenticadoOut.
     * 
     * @param designador
     */
    public void setDesignador(java.lang.String designador) {
        this.designador = designador;
    }


    /**
     * Gets the login value for this OSSTurbonetClienteAutenticadoOut.
     * 
     * @return login
     */
    public java.lang.String getLogin() {
        return login;
    }


    /**
     * Sets the login value for this OSSTurbonetClienteAutenticadoOut.
     * 
     * @param login
     */
    public void setLogin(java.lang.String login) {
        this.login = login;
    }


    /**
     * Gets the dataHoraAutenticacao value for this OSSTurbonetClienteAutenticadoOut.
     * 
     * @return dataHoraAutenticacao
     */
    public java.util.Calendar getDataHoraAutenticacao() {
        return dataHoraAutenticacao;
    }


    /**
     * Sets the dataHoraAutenticacao value for this OSSTurbonetClienteAutenticadoOut.
     * 
     * @param dataHoraAutenticacao
     */
    public void setDataHoraAutenticacao(java.util.Calendar dataHoraAutenticacao) {
        this.dataHoraAutenticacao = dataHoraAutenticacao;
    }


    /**
     * Gets the clienteAutenticado value for this OSSTurbonetClienteAutenticadoOut.
     * 
     * @return clienteAutenticado
     */
    public boolean isClienteAutenticado() {
        return clienteAutenticado;
    }


    /**
     * Sets the clienteAutenticado value for this OSSTurbonetClienteAutenticadoOut.
     * 
     * @param clienteAutenticado
     */
    public void setClienteAutenticado(boolean clienteAutenticado) {
        this.clienteAutenticado = clienteAutenticado;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OSSTurbonetClienteAutenticadoOut)) return false;
        OSSTurbonetClienteAutenticadoOut other = (OSSTurbonetClienteAutenticadoOut) obj;
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
            ((this.designador==null && other.getDesignador()==null) || 
             (this.designador!=null &&
              this.designador.equals(other.getDesignador()))) &&
            ((this.login==null && other.getLogin()==null) || 
             (this.login!=null &&
              this.login.equals(other.getLogin()))) &&
            ((this.dataHoraAutenticacao==null && other.getDataHoraAutenticacao()==null) || 
             (this.dataHoraAutenticacao!=null &&
              this.dataHoraAutenticacao.equals(other.getDataHoraAutenticacao()))) &&
            this.clienteAutenticado == other.isClienteAutenticado();
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
        if (getDesignador() != null) {
            _hashCode += getDesignador().hashCode();
        }
        if (getLogin() != null) {
            _hashCode += getLogin().hashCode();
        }
        if (getDataHoraAutenticacao() != null) {
            _hashCode += getDataHoraAutenticacao().hashCode();
        }
        _hashCode += (isClienteAutenticado() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OSSTurbonetClienteAutenticadoOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetClienteAutenticado", "OSSTurbonetClienteAutenticadoOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensagem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetClienteAutenticado", "mensagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "OSSTurbonetOut"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetClienteAutenticado", "designador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("login");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetClienteAutenticado", "login"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataHoraAutenticacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetClienteAutenticado", "dataHoraAutenticacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clienteAutenticado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetClienteAutenticado", "clienteAutenticado"));
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
