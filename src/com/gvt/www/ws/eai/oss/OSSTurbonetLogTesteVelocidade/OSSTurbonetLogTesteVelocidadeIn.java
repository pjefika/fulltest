/**
 * OSSTurbonetLogTesteVelocidadeIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.OSSTurbonetLogTesteVelocidade;

public class OSSTurbonetLogTesteVelocidadeIn  implements java.io.Serializable {
    private java.lang.String designador;

    private java.lang.String numeroProtocolo;

    private java.lang.String login;

    private java.lang.String nomeUsuario;

    private java.lang.String sistema;

    private java.util.Calendar testeData;

    private java.lang.String testeIp;

    private int testeDownload;

    private int testeUpload;

    private long testeLatencia;

    public OSSTurbonetLogTesteVelocidadeIn() {
    }

    public OSSTurbonetLogTesteVelocidadeIn(
           java.lang.String designador,
           java.lang.String numeroProtocolo,
           java.lang.String login,
           java.lang.String nomeUsuario,
           java.lang.String sistema,
           java.util.Calendar testeData,
           java.lang.String testeIp,
           int testeDownload,
           int testeUpload,
           long testeLatencia) {
           this.designador = designador;
           this.numeroProtocolo = numeroProtocolo;
           this.login = login;
           this.nomeUsuario = nomeUsuario;
           this.sistema = sistema;
           this.testeData = testeData;
           this.testeIp = testeIp;
           this.testeDownload = testeDownload;
           this.testeUpload = testeUpload;
           this.testeLatencia = testeLatencia;
    }


    /**
     * Gets the designador value for this OSSTurbonetLogTesteVelocidadeIn.
     * 
     * @return designador
     */
    public java.lang.String getDesignador() {
        return designador;
    }


    /**
     * Sets the designador value for this OSSTurbonetLogTesteVelocidadeIn.
     * 
     * @param designador
     */
    public void setDesignador(java.lang.String designador) {
        this.designador = designador;
    }


    /**
     * Gets the numeroProtocolo value for this OSSTurbonetLogTesteVelocidadeIn.
     * 
     * @return numeroProtocolo
     */
    public java.lang.String getNumeroProtocolo() {
        return numeroProtocolo;
    }


    /**
     * Sets the numeroProtocolo value for this OSSTurbonetLogTesteVelocidadeIn.
     * 
     * @param numeroProtocolo
     */
    public void setNumeroProtocolo(java.lang.String numeroProtocolo) {
        this.numeroProtocolo = numeroProtocolo;
    }


    /**
     * Gets the login value for this OSSTurbonetLogTesteVelocidadeIn.
     * 
     * @return login
     */
    public java.lang.String getLogin() {
        return login;
    }


    /**
     * Sets the login value for this OSSTurbonetLogTesteVelocidadeIn.
     * 
     * @param login
     */
    public void setLogin(java.lang.String login) {
        this.login = login;
    }


    /**
     * Gets the nomeUsuario value for this OSSTurbonetLogTesteVelocidadeIn.
     * 
     * @return nomeUsuario
     */
    public java.lang.String getNomeUsuario() {
        return nomeUsuario;
    }


    /**
     * Sets the nomeUsuario value for this OSSTurbonetLogTesteVelocidadeIn.
     * 
     * @param nomeUsuario
     */
    public void setNomeUsuario(java.lang.String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }


    /**
     * Gets the sistema value for this OSSTurbonetLogTesteVelocidadeIn.
     * 
     * @return sistema
     */
    public java.lang.String getSistema() {
        return sistema;
    }


    /**
     * Sets the sistema value for this OSSTurbonetLogTesteVelocidadeIn.
     * 
     * @param sistema
     */
    public void setSistema(java.lang.String sistema) {
        this.sistema = sistema;
    }


    /**
     * Gets the testeData value for this OSSTurbonetLogTesteVelocidadeIn.
     * 
     * @return testeData
     */
    public java.util.Calendar getTesteData() {
        return testeData;
    }


    /**
     * Sets the testeData value for this OSSTurbonetLogTesteVelocidadeIn.
     * 
     * @param testeData
     */
    public void setTesteData(java.util.Calendar testeData) {
        this.testeData = testeData;
    }


    /**
     * Gets the testeIp value for this OSSTurbonetLogTesteVelocidadeIn.
     * 
     * @return testeIp
     */
    public java.lang.String getTesteIp() {
        return testeIp;
    }


    /**
     * Sets the testeIp value for this OSSTurbonetLogTesteVelocidadeIn.
     * 
     * @param testeIp
     */
    public void setTesteIp(java.lang.String testeIp) {
        this.testeIp = testeIp;
    }


    /**
     * Gets the testeDownload value for this OSSTurbonetLogTesteVelocidadeIn.
     * 
     * @return testeDownload
     */
    public int getTesteDownload() {
        return testeDownload;
    }


    /**
     * Sets the testeDownload value for this OSSTurbonetLogTesteVelocidadeIn.
     * 
     * @param testeDownload
     */
    public void setTesteDownload(int testeDownload) {
        this.testeDownload = testeDownload;
    }


    /**
     * Gets the testeUpload value for this OSSTurbonetLogTesteVelocidadeIn.
     * 
     * @return testeUpload
     */
    public int getTesteUpload() {
        return testeUpload;
    }


    /**
     * Sets the testeUpload value for this OSSTurbonetLogTesteVelocidadeIn.
     * 
     * @param testeUpload
     */
    public void setTesteUpload(int testeUpload) {
        this.testeUpload = testeUpload;
    }


    /**
     * Gets the testeLatencia value for this OSSTurbonetLogTesteVelocidadeIn.
     * 
     * @return testeLatencia
     */
    public long getTesteLatencia() {
        return testeLatencia;
    }


    /**
     * Sets the testeLatencia value for this OSSTurbonetLogTesteVelocidadeIn.
     * 
     * @param testeLatencia
     */
    public void setTesteLatencia(long testeLatencia) {
        this.testeLatencia = testeLatencia;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OSSTurbonetLogTesteVelocidadeIn)) return false;
        OSSTurbonetLogTesteVelocidadeIn other = (OSSTurbonetLogTesteVelocidadeIn) obj;
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
            ((this.numeroProtocolo==null && other.getNumeroProtocolo()==null) || 
             (this.numeroProtocolo!=null &&
              this.numeroProtocolo.equals(other.getNumeroProtocolo()))) &&
            ((this.login==null && other.getLogin()==null) || 
             (this.login!=null &&
              this.login.equals(other.getLogin()))) &&
            ((this.nomeUsuario==null && other.getNomeUsuario()==null) || 
             (this.nomeUsuario!=null &&
              this.nomeUsuario.equals(other.getNomeUsuario()))) &&
            ((this.sistema==null && other.getSistema()==null) || 
             (this.sistema!=null &&
              this.sistema.equals(other.getSistema()))) &&
            ((this.testeData==null && other.getTesteData()==null) || 
             (this.testeData!=null &&
              this.testeData.equals(other.getTesteData()))) &&
            ((this.testeIp==null && other.getTesteIp()==null) || 
             (this.testeIp!=null &&
              this.testeIp.equals(other.getTesteIp()))) &&
            this.testeDownload == other.getTesteDownload() &&
            this.testeUpload == other.getTesteUpload() &&
            this.testeLatencia == other.getTesteLatencia();
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
        if (getNumeroProtocolo() != null) {
            _hashCode += getNumeroProtocolo().hashCode();
        }
        if (getLogin() != null) {
            _hashCode += getLogin().hashCode();
        }
        if (getNomeUsuario() != null) {
            _hashCode += getNomeUsuario().hashCode();
        }
        if (getSistema() != null) {
            _hashCode += getSistema().hashCode();
        }
        if (getTesteData() != null) {
            _hashCode += getTesteData().hashCode();
        }
        if (getTesteIp() != null) {
            _hashCode += getTesteIp().hashCode();
        }
        _hashCode += getTesteDownload();
        _hashCode += getTesteUpload();
        _hashCode += new Long(getTesteLatencia()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OSSTurbonetLogTesteVelocidadeIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetLogTesteVelocidade", "OSSTurbonetLogTesteVelocidadeIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetLogTesteVelocidade", "designador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroProtocolo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetLogTesteVelocidade", "numeroProtocolo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("login");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetLogTesteVelocidade", "login"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeUsuario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetLogTesteVelocidade", "nomeUsuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sistema");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetLogTesteVelocidade", "sistema"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testeData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetLogTesteVelocidade", "testeData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testeIp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetLogTesteVelocidade", "testeIp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testeDownload");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetLogTesteVelocidade", "testeDownload"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testeUpload");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetLogTesteVelocidade", "testeUpload"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testeLatencia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetLogTesteVelocidade", "testeLatencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
