/**
 * CertifyIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.uraservices;

public class CertifyIn  implements java.io.Serializable {
    private java.lang.String idTT;

    private java.lang.String numeroBA;

    private boolean corrigir;

    private java.lang.String sistemaOrigem;

    private java.lang.String login;

    private java.lang.String designadorTurbonet;

    private java.lang.String instancia;

    private java.lang.String idOS;

    private java.lang.String contextoCertificacao;

    public CertifyIn() {
    }

    public CertifyIn(
           java.lang.String idTT,
           java.lang.String numeroBA,
           boolean corrigir,
           java.lang.String sistemaOrigem,
           java.lang.String login,
           java.lang.String designadorTurbonet,
           java.lang.String instancia,
           java.lang.String idOS,
           java.lang.String contextoCertificacao) {
           this.idTT = idTT;
           this.numeroBA = numeroBA;
           this.corrigir = corrigir;
           this.sistemaOrigem = sistemaOrigem;
           this.login = login;
           this.designadorTurbonet = designadorTurbonet;
           this.instancia = instancia;
           this.idOS = idOS;
           this.contextoCertificacao = contextoCertificacao;
    }


    /**
     * Gets the idTT value for this CertifyIn.
     * 
     * @return idTT
     */
    public java.lang.String getIdTT() {
        return idTT;
    }


    /**
     * Sets the idTT value for this CertifyIn.
     * 
     * @param idTT
     */
    public void setIdTT(java.lang.String idTT) {
        this.idTT = idTT;
    }


    /**
     * Gets the numeroBA value for this CertifyIn.
     * 
     * @return numeroBA
     */
    public java.lang.String getNumeroBA() {
        return numeroBA;
    }


    /**
     * Sets the numeroBA value for this CertifyIn.
     * 
     * @param numeroBA
     */
    public void setNumeroBA(java.lang.String numeroBA) {
        this.numeroBA = numeroBA;
    }


    /**
     * Gets the corrigir value for this CertifyIn.
     * 
     * @return corrigir
     */
    public boolean isCorrigir() {
        return corrigir;
    }


    /**
     * Sets the corrigir value for this CertifyIn.
     * 
     * @param corrigir
     */
    public void setCorrigir(boolean corrigir) {
        this.corrigir = corrigir;
    }


    /**
     * Gets the sistemaOrigem value for this CertifyIn.
     * 
     * @return sistemaOrigem
     */
    public java.lang.String getSistemaOrigem() {
        return sistemaOrigem;
    }


    /**
     * Sets the sistemaOrigem value for this CertifyIn.
     * 
     * @param sistemaOrigem
     */
    public void setSistemaOrigem(java.lang.String sistemaOrigem) {
        this.sistemaOrigem = sistemaOrigem;
    }


    /**
     * Gets the login value for this CertifyIn.
     * 
     * @return login
     */
    public java.lang.String getLogin() {
        return login;
    }


    /**
     * Sets the login value for this CertifyIn.
     * 
     * @param login
     */
    public void setLogin(java.lang.String login) {
        this.login = login;
    }


    /**
     * Gets the designadorTurbonet value for this CertifyIn.
     * 
     * @return designadorTurbonet
     */
    public java.lang.String getDesignadorTurbonet() {
        return designadorTurbonet;
    }


    /**
     * Sets the designadorTurbonet value for this CertifyIn.
     * 
     * @param designadorTurbonet
     */
    public void setDesignadorTurbonet(java.lang.String designadorTurbonet) {
        this.designadorTurbonet = designadorTurbonet;
    }


    /**
     * Gets the instancia value for this CertifyIn.
     * 
     * @return instancia
     */
    public java.lang.String getInstancia() {
        return instancia;
    }


    /**
     * Sets the instancia value for this CertifyIn.
     * 
     * @param instancia
     */
    public void setInstancia(java.lang.String instancia) {
        this.instancia = instancia;
    }


    /**
     * Gets the idOS value for this CertifyIn.
     * 
     * @return idOS
     */
    public java.lang.String getIdOS() {
        return idOS;
    }


    /**
     * Sets the idOS value for this CertifyIn.
     * 
     * @param idOS
     */
    public void setIdOS(java.lang.String idOS) {
        this.idOS = idOS;
    }


    /**
     * Gets the contextoCertificacao value for this CertifyIn.
     * 
     * @return contextoCertificacao
     */
    public java.lang.String getContextoCertificacao() {
        return contextoCertificacao;
    }


    /**
     * Sets the contextoCertificacao value for this CertifyIn.
     * 
     * @param contextoCertificacao
     */
    public void setContextoCertificacao(java.lang.String contextoCertificacao) {
        this.contextoCertificacao = contextoCertificacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CertifyIn)) return false;
        CertifyIn other = (CertifyIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idTT==null && other.getIdTT()==null) || 
             (this.idTT!=null &&
              this.idTT.equals(other.getIdTT()))) &&
            ((this.numeroBA==null && other.getNumeroBA()==null) || 
             (this.numeroBA!=null &&
              this.numeroBA.equals(other.getNumeroBA()))) &&
            this.corrigir == other.isCorrigir() &&
            ((this.sistemaOrigem==null && other.getSistemaOrigem()==null) || 
             (this.sistemaOrigem!=null &&
              this.sistemaOrigem.equals(other.getSistemaOrigem()))) &&
            ((this.login==null && other.getLogin()==null) || 
             (this.login!=null &&
              this.login.equals(other.getLogin()))) &&
            ((this.designadorTurbonet==null && other.getDesignadorTurbonet()==null) || 
             (this.designadorTurbonet!=null &&
              this.designadorTurbonet.equals(other.getDesignadorTurbonet()))) &&
            ((this.instancia==null && other.getInstancia()==null) || 
             (this.instancia!=null &&
              this.instancia.equals(other.getInstancia()))) &&
            ((this.idOS==null && other.getIdOS()==null) || 
             (this.idOS!=null &&
              this.idOS.equals(other.getIdOS()))) &&
            ((this.contextoCertificacao==null && other.getContextoCertificacao()==null) || 
             (this.contextoCertificacao!=null &&
              this.contextoCertificacao.equals(other.getContextoCertificacao())));
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
        if (getIdTT() != null) {
            _hashCode += getIdTT().hashCode();
        }
        if (getNumeroBA() != null) {
            _hashCode += getNumeroBA().hashCode();
        }
        _hashCode += (isCorrigir() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSistemaOrigem() != null) {
            _hashCode += getSistemaOrigem().hashCode();
        }
        if (getLogin() != null) {
            _hashCode += getLogin().hashCode();
        }
        if (getDesignadorTurbonet() != null) {
            _hashCode += getDesignadorTurbonet().hashCode();
        }
        if (getInstancia() != null) {
            _hashCode += getInstancia().hashCode();
        }
        if (getIdOS() != null) {
            _hashCode += getIdOS().hashCode();
        }
        if (getContextoCertificacao() != null) {
            _hashCode += getContextoCertificacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CertifyIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "certifyIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idTT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idTT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroBA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroBA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corrigir");
        elemField.setXmlName(new javax.xml.namespace.QName("", "corrigir"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sistemaOrigem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sistemaOrigem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("login");
        elemField.setXmlName(new javax.xml.namespace.QName("", "login"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designadorTurbonet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "designadorTurbonet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instancia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instancia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idOS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idOS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contextoCertificacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contextoCertificacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
