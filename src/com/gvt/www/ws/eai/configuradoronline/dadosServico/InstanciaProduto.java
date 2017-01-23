/**
 * InstanciaProduto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.dadosServico;

public class InstanciaProduto  implements java.io.Serializable {
    private java.lang.String rpon;

    private java.lang.String designador;

    private java.lang.String instancia;

    private java.lang.String tipoInstancia;

    private java.lang.String crmOrigem;

    private java.lang.String docContaInicial;

    private java.lang.String codContaInicial;

    private java.lang.String cep;

    private com.gvt.www.ws.eai.configuradoronline.dadosServico.InfoServicoSiebel infoSiebel;

    private com.gvt.www.ws.eai.configuradoronline.acesso.Acesso acesso;

    public InstanciaProduto() {
    }

    public InstanciaProduto(
           java.lang.String rpon,
           java.lang.String designador,
           java.lang.String instancia,
           java.lang.String tipoInstancia,
           java.lang.String crmOrigem,
           java.lang.String docContaInicial,
           java.lang.String codContaInicial,
           java.lang.String cep,
           com.gvt.www.ws.eai.configuradoronline.dadosServico.InfoServicoSiebel infoSiebel,
           com.gvt.www.ws.eai.configuradoronline.acesso.Acesso acesso) {
           this.rpon = rpon;
           this.designador = designador;
           this.instancia = instancia;
           this.tipoInstancia = tipoInstancia;
           this.crmOrigem = crmOrigem;
           this.docContaInicial = docContaInicial;
           this.codContaInicial = codContaInicial;
           this.cep = cep;
           this.infoSiebel = infoSiebel;
           this.acesso = acesso;
    }


    /**
     * Gets the rpon value for this InstanciaProduto.
     * 
     * @return rpon
     */
    public java.lang.String getRpon() {
        return rpon;
    }


    /**
     * Sets the rpon value for this InstanciaProduto.
     * 
     * @param rpon
     */
    public void setRpon(java.lang.String rpon) {
        this.rpon = rpon;
    }


    /**
     * Gets the designador value for this InstanciaProduto.
     * 
     * @return designador
     */
    public java.lang.String getDesignador() {
        return designador;
    }


    /**
     * Sets the designador value for this InstanciaProduto.
     * 
     * @param designador
     */
    public void setDesignador(java.lang.String designador) {
        this.designador = designador;
    }


    /**
     * Gets the instancia value for this InstanciaProduto.
     * 
     * @return instancia
     */
    public java.lang.String getInstancia() {
        return instancia;
    }


    /**
     * Sets the instancia value for this InstanciaProduto.
     * 
     * @param instancia
     */
    public void setInstancia(java.lang.String instancia) {
        this.instancia = instancia;
    }


    /**
     * Gets the tipoInstancia value for this InstanciaProduto.
     * 
     * @return tipoInstancia
     */
    public java.lang.String getTipoInstancia() {
        return tipoInstancia;
    }


    /**
     * Sets the tipoInstancia value for this InstanciaProduto.
     * 
     * @param tipoInstancia
     */
    public void setTipoInstancia(java.lang.String tipoInstancia) {
        this.tipoInstancia = tipoInstancia;
    }


    /**
     * Gets the crmOrigem value for this InstanciaProduto.
     * 
     * @return crmOrigem
     */
    public java.lang.String getCrmOrigem() {
        return crmOrigem;
    }


    /**
     * Sets the crmOrigem value for this InstanciaProduto.
     * 
     * @param crmOrigem
     */
    public void setCrmOrigem(java.lang.String crmOrigem) {
        this.crmOrigem = crmOrigem;
    }


    /**
     * Gets the docContaInicial value for this InstanciaProduto.
     * 
     * @return docContaInicial
     */
    public java.lang.String getDocContaInicial() {
        return docContaInicial;
    }


    /**
     * Sets the docContaInicial value for this InstanciaProduto.
     * 
     * @param docContaInicial
     */
    public void setDocContaInicial(java.lang.String docContaInicial) {
        this.docContaInicial = docContaInicial;
    }


    /**
     * Gets the codContaInicial value for this InstanciaProduto.
     * 
     * @return codContaInicial
     */
    public java.lang.String getCodContaInicial() {
        return codContaInicial;
    }


    /**
     * Sets the codContaInicial value for this InstanciaProduto.
     * 
     * @param codContaInicial
     */
    public void setCodContaInicial(java.lang.String codContaInicial) {
        this.codContaInicial = codContaInicial;
    }


    /**
     * Gets the cep value for this InstanciaProduto.
     * 
     * @return cep
     */
    public java.lang.String getCep() {
        return cep;
    }


    /**
     * Sets the cep value for this InstanciaProduto.
     * 
     * @param cep
     */
    public void setCep(java.lang.String cep) {
        this.cep = cep;
    }


    /**
     * Gets the infoSiebel value for this InstanciaProduto.
     * 
     * @return infoSiebel
     */
    public com.gvt.www.ws.eai.configuradoronline.dadosServico.InfoServicoSiebel getInfoSiebel() {
        return infoSiebel;
    }


    /**
     * Sets the infoSiebel value for this InstanciaProduto.
     * 
     * @param infoSiebel
     */
    public void setInfoSiebel(com.gvt.www.ws.eai.configuradoronline.dadosServico.InfoServicoSiebel infoSiebel) {
        this.infoSiebel = infoSiebel;
    }


    /**
     * Gets the acesso value for this InstanciaProduto.
     * 
     * @return acesso
     */
    public com.gvt.www.ws.eai.configuradoronline.acesso.Acesso getAcesso() {
        return acesso;
    }


    /**
     * Sets the acesso value for this InstanciaProduto.
     * 
     * @param acesso
     */
    public void setAcesso(com.gvt.www.ws.eai.configuradoronline.acesso.Acesso acesso) {
        this.acesso = acesso;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InstanciaProduto)) return false;
        InstanciaProduto other = (InstanciaProduto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rpon==null && other.getRpon()==null) || 
             (this.rpon!=null &&
              this.rpon.equals(other.getRpon()))) &&
            ((this.designador==null && other.getDesignador()==null) || 
             (this.designador!=null &&
              this.designador.equals(other.getDesignador()))) &&
            ((this.instancia==null && other.getInstancia()==null) || 
             (this.instancia!=null &&
              this.instancia.equals(other.getInstancia()))) &&
            ((this.tipoInstancia==null && other.getTipoInstancia()==null) || 
             (this.tipoInstancia!=null &&
              this.tipoInstancia.equals(other.getTipoInstancia()))) &&
            ((this.crmOrigem==null && other.getCrmOrigem()==null) || 
             (this.crmOrigem!=null &&
              this.crmOrigem.equals(other.getCrmOrigem()))) &&
            ((this.docContaInicial==null && other.getDocContaInicial()==null) || 
             (this.docContaInicial!=null &&
              this.docContaInicial.equals(other.getDocContaInicial()))) &&
            ((this.codContaInicial==null && other.getCodContaInicial()==null) || 
             (this.codContaInicial!=null &&
              this.codContaInicial.equals(other.getCodContaInicial()))) &&
            ((this.cep==null && other.getCep()==null) || 
             (this.cep!=null &&
              this.cep.equals(other.getCep()))) &&
            ((this.infoSiebel==null && other.getInfoSiebel()==null) || 
             (this.infoSiebel!=null &&
              this.infoSiebel.equals(other.getInfoSiebel()))) &&
            ((this.acesso==null && other.getAcesso()==null) || 
             (this.acesso!=null &&
              this.acesso.equals(other.getAcesso())));
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
        if (getRpon() != null) {
            _hashCode += getRpon().hashCode();
        }
        if (getDesignador() != null) {
            _hashCode += getDesignador().hashCode();
        }
        if (getInstancia() != null) {
            _hashCode += getInstancia().hashCode();
        }
        if (getTipoInstancia() != null) {
            _hashCode += getTipoInstancia().hashCode();
        }
        if (getCrmOrigem() != null) {
            _hashCode += getCrmOrigem().hashCode();
        }
        if (getDocContaInicial() != null) {
            _hashCode += getDocContaInicial().hashCode();
        }
        if (getCodContaInicial() != null) {
            _hashCode += getCodContaInicial().hashCode();
        }
        if (getCep() != null) {
            _hashCode += getCep().hashCode();
        }
        if (getInfoSiebel() != null) {
            _hashCode += getInfoSiebel().hashCode();
        }
        if (getAcesso() != null) {
            _hashCode += getAcesso().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InstanciaProduto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "InstanciaProduto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rpon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "rpon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "designador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instancia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "instancia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoInstancia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "tipoInstancia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crmOrigem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "crmOrigem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docContaInicial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "docContaInicial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codContaInicial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "codContaInicial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cep");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "cep"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infoSiebel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "infoSiebel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "InfoServicoSiebel"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acesso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "Acesso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/acesso", "Acesso"));
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
