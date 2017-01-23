/**
 * OSSTurbonetIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.ossturbonet;

public class OSSTurbonetIn  implements java.io.Serializable {
    private java.lang.String designador;

    private java.lang.String designadorAcesso;

    private java.lang.String usuario;

    private java.lang.String login;

    private java.lang.String sistemaOriginario;

    private java.lang.String instancia;

    private java.lang.String ordem;

    public OSSTurbonetIn() {
    }

    public OSSTurbonetIn(
           java.lang.String designador,
           java.lang.String designadorAcesso,
           java.lang.String usuario,
           java.lang.String login,
           java.lang.String sistemaOriginario,
           java.lang.String instancia,
           java.lang.String ordem) {
           this.designador = designador;
           this.designadorAcesso = designadorAcesso;
           this.usuario = usuario;
           this.login = login;
           this.sistemaOriginario = sistemaOriginario;
           this.instancia = instancia;
           this.ordem = ordem;
    }


    /**
     * Gets the designador value for this OSSTurbonetIn.
     * 
     * @return designador
     */
    public java.lang.String getDesignador() {
        return designador;
    }


    /**
     * Sets the designador value for this OSSTurbonetIn.
     * 
     * @param designador
     */
    public void setDesignador(java.lang.String designador) {
        this.designador = designador;
    }


    /**
     * Gets the designadorAcesso value for this OSSTurbonetIn.
     * 
     * @return designadorAcesso
     */
    public java.lang.String getDesignadorAcesso() {
        return designadorAcesso;
    }


    /**
     * Sets the designadorAcesso value for this OSSTurbonetIn.
     * 
     * @param designadorAcesso
     */
    public void setDesignadorAcesso(java.lang.String designadorAcesso) {
        this.designadorAcesso = designadorAcesso;
    }


    /**
     * Gets the usuario value for this OSSTurbonetIn.
     * 
     * @return usuario
     */
    public java.lang.String getUsuario() {
        return usuario;
    }


    /**
     * Sets the usuario value for this OSSTurbonetIn.
     * 
     * @param usuario
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }


    /**
     * Gets the login value for this OSSTurbonetIn.
     * 
     * @return login
     */
    public java.lang.String getLogin() {
        return login;
    }


    /**
     * Sets the login value for this OSSTurbonetIn.
     * 
     * @param login
     */
    public void setLogin(java.lang.String login) {
        this.login = login;
    }


    /**
     * Gets the sistemaOriginario value for this OSSTurbonetIn.
     * 
     * @return sistemaOriginario
     */
    public java.lang.String getSistemaOriginario() {
        return sistemaOriginario;
    }


    /**
     * Sets the sistemaOriginario value for this OSSTurbonetIn.
     * 
     * @param sistemaOriginario
     */
    public void setSistemaOriginario(java.lang.String sistemaOriginario) {
        this.sistemaOriginario = sistemaOriginario;
    }


    /**
     * Gets the instancia value for this OSSTurbonetIn.
     * 
     * @return instancia
     */
    public java.lang.String getInstancia() {
        return instancia;
    }


    /**
     * Sets the instancia value for this OSSTurbonetIn.
     * 
     * @param instancia
     */
    public void setInstancia(java.lang.String instancia) {
        this.instancia = instancia;
    }


    /**
     * Gets the ordem value for this OSSTurbonetIn.
     * 
     * @return ordem
     */
    public java.lang.String getOrdem() {
        return ordem;
    }


    /**
     * Sets the ordem value for this OSSTurbonetIn.
     * 
     * @param ordem
     */
    public void setOrdem(java.lang.String ordem) {
        this.ordem = ordem;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OSSTurbonetIn)) return false;
        OSSTurbonetIn other = (OSSTurbonetIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.designador==null && other.getDesignador()==null) || 
             (this.designador!=null &&
              this.designador.equals(other.getDesignador()))) &&
            ((this.designadorAcesso==null && other.getDesignadorAcesso()==null) || 
             (this.designadorAcesso!=null &&
              this.designadorAcesso.equals(other.getDesignadorAcesso()))) &&
            ((this.usuario==null && other.getUsuario()==null) || 
             (this.usuario!=null &&
              this.usuario.equals(other.getUsuario()))) &&
            ((this.login==null && other.getLogin()==null) || 
             (this.login!=null &&
              this.login.equals(other.getLogin()))) &&
            ((this.sistemaOriginario==null && other.getSistemaOriginario()==null) || 
             (this.sistemaOriginario!=null &&
              this.sistemaOriginario.equals(other.getSistemaOriginario()))) &&
            ((this.instancia==null && other.getInstancia()==null) || 
             (this.instancia!=null &&
              this.instancia.equals(other.getInstancia()))) &&
            ((this.ordem==null && other.getOrdem()==null) || 
             (this.ordem!=null &&
              this.ordem.equals(other.getOrdem())));
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
        if (getDesignador() != null) {
            _hashCode += getDesignador().hashCode();
        }
        if (getDesignadorAcesso() != null) {
            _hashCode += getDesignadorAcesso().hashCode();
        }
        if (getUsuario() != null) {
            _hashCode += getUsuario().hashCode();
        }
        if (getLogin() != null) {
            _hashCode += getLogin().hashCode();
        }
        if (getSistemaOriginario() != null) {
            _hashCode += getSistemaOriginario().hashCode();
        }
        if (getInstancia() != null) {
            _hashCode += getInstancia().hashCode();
        }
        if (getOrdem() != null) {
            _hashCode += getOrdem().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OSSTurbonetIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "OSSTurbonetIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "designador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designadorAcesso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "designadorAcesso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "usuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("login");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "login"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sistemaOriginario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "sistemaOriginario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instancia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "instancia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ordem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "ordem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
