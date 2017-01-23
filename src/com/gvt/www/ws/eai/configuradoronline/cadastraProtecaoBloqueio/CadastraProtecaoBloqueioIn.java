/**
 * CadastraProtecaoBloqueioIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.cadastraProtecaoBloqueio;

public class CadastraProtecaoBloqueioIn  implements java.io.Serializable {
    private java.lang.String instancia;

    private java.lang.String designador;

    private java.lang.String designadorTV;

    private java.lang.String codigoArea;

    private boolean abrangeTodasAreas;

    private java.lang.String motivo;

    private java.lang.String login;

    public CadastraProtecaoBloqueioIn() {
    }

    public CadastraProtecaoBloqueioIn(
           java.lang.String instancia,
           java.lang.String designador,
           java.lang.String designadorTV,
           java.lang.String codigoArea,
           boolean abrangeTodasAreas,
           java.lang.String motivo,
           java.lang.String login) {
           this.instancia = instancia;
           this.designador = designador;
           this.designadorTV = designadorTV;
           this.codigoArea = codigoArea;
           this.abrangeTodasAreas = abrangeTodasAreas;
           this.motivo = motivo;
           this.login = login;
    }


    /**
     * Gets the instancia value for this CadastraProtecaoBloqueioIn.
     * 
     * @return instancia
     */
    public java.lang.String getInstancia() {
        return instancia;
    }


    /**
     * Sets the instancia value for this CadastraProtecaoBloqueioIn.
     * 
     * @param instancia
     */
    public void setInstancia(java.lang.String instancia) {
        this.instancia = instancia;
    }


    /**
     * Gets the designador value for this CadastraProtecaoBloqueioIn.
     * 
     * @return designador
     */
    public java.lang.String getDesignador() {
        return designador;
    }


    /**
     * Sets the designador value for this CadastraProtecaoBloqueioIn.
     * 
     * @param designador
     */
    public void setDesignador(java.lang.String designador) {
        this.designador = designador;
    }


    /**
     * Gets the designadorTV value for this CadastraProtecaoBloqueioIn.
     * 
     * @return designadorTV
     */
    public java.lang.String getDesignadorTV() {
        return designadorTV;
    }


    /**
     * Sets the designadorTV value for this CadastraProtecaoBloqueioIn.
     * 
     * @param designadorTV
     */
    public void setDesignadorTV(java.lang.String designadorTV) {
        this.designadorTV = designadorTV;
    }


    /**
     * Gets the codigoArea value for this CadastraProtecaoBloqueioIn.
     * 
     * @return codigoArea
     */
    public java.lang.String getCodigoArea() {
        return codigoArea;
    }


    /**
     * Sets the codigoArea value for this CadastraProtecaoBloqueioIn.
     * 
     * @param codigoArea
     */
    public void setCodigoArea(java.lang.String codigoArea) {
        this.codigoArea = codigoArea;
    }


    /**
     * Gets the abrangeTodasAreas value for this CadastraProtecaoBloqueioIn.
     * 
     * @return abrangeTodasAreas
     */
    public boolean isAbrangeTodasAreas() {
        return abrangeTodasAreas;
    }


    /**
     * Sets the abrangeTodasAreas value for this CadastraProtecaoBloqueioIn.
     * 
     * @param abrangeTodasAreas
     */
    public void setAbrangeTodasAreas(boolean abrangeTodasAreas) {
        this.abrangeTodasAreas = abrangeTodasAreas;
    }


    /**
     * Gets the motivo value for this CadastraProtecaoBloqueioIn.
     * 
     * @return motivo
     */
    public java.lang.String getMotivo() {
        return motivo;
    }


    /**
     * Sets the motivo value for this CadastraProtecaoBloqueioIn.
     * 
     * @param motivo
     */
    public void setMotivo(java.lang.String motivo) {
        this.motivo = motivo;
    }


    /**
     * Gets the login value for this CadastraProtecaoBloqueioIn.
     * 
     * @return login
     */
    public java.lang.String getLogin() {
        return login;
    }


    /**
     * Sets the login value for this CadastraProtecaoBloqueioIn.
     * 
     * @param login
     */
    public void setLogin(java.lang.String login) {
        this.login = login;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CadastraProtecaoBloqueioIn)) return false;
        CadastraProtecaoBloqueioIn other = (CadastraProtecaoBloqueioIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.instancia==null && other.getInstancia()==null) || 
             (this.instancia!=null &&
              this.instancia.equals(other.getInstancia()))) &&
            ((this.designador==null && other.getDesignador()==null) || 
             (this.designador!=null &&
              this.designador.equals(other.getDesignador()))) &&
            ((this.designadorTV==null && other.getDesignadorTV()==null) || 
             (this.designadorTV!=null &&
              this.designadorTV.equals(other.getDesignadorTV()))) &&
            ((this.codigoArea==null && other.getCodigoArea()==null) || 
             (this.codigoArea!=null &&
              this.codigoArea.equals(other.getCodigoArea()))) &&
            this.abrangeTodasAreas == other.isAbrangeTodasAreas() &&
            ((this.motivo==null && other.getMotivo()==null) || 
             (this.motivo!=null &&
              this.motivo.equals(other.getMotivo()))) &&
            ((this.login==null && other.getLogin()==null) || 
             (this.login!=null &&
              this.login.equals(other.getLogin())));
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
        if (getInstancia() != null) {
            _hashCode += getInstancia().hashCode();
        }
        if (getDesignador() != null) {
            _hashCode += getDesignador().hashCode();
        }
        if (getDesignadorTV() != null) {
            _hashCode += getDesignadorTV().hashCode();
        }
        if (getCodigoArea() != null) {
            _hashCode += getCodigoArea().hashCode();
        }
        _hashCode += (isAbrangeTodasAreas() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMotivo() != null) {
            _hashCode += getMotivo().hashCode();
        }
        if (getLogin() != null) {
            _hashCode += getLogin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CadastraProtecaoBloqueioIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/cadastraProtecaoBloqueio", "CadastraProtecaoBloqueioIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instancia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/cadastraProtecaoBloqueio", "instancia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/cadastraProtecaoBloqueio", "designador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designadorTV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/cadastraProtecaoBloqueio", "designadorTV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoArea");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/cadastraProtecaoBloqueio", "codigoArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("abrangeTodasAreas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/cadastraProtecaoBloqueio", "abrangeTodasAreas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motivo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/cadastraProtecaoBloqueio", "motivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("login");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/cadastraProtecaoBloqueio", "login"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
