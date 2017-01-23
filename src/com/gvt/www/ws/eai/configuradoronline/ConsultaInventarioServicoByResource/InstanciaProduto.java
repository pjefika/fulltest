/**
 * InstanciaProduto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServicoByResource;

public class InstanciaProduto  implements java.io.Serializable {
    private long id;

    private java.lang.String tipoInstancia;

    private java.lang.String crmOrigem;

    private java.lang.String rpon;

    private java.lang.String docContaInicial;

    private java.lang.String codContaInicial;

    public InstanciaProduto() {
    }

    public InstanciaProduto(
           long id,
           java.lang.String tipoInstancia,
           java.lang.String crmOrigem,
           java.lang.String rpon,
           java.lang.String docContaInicial,
           java.lang.String codContaInicial) {
           this.id = id;
           this.tipoInstancia = tipoInstancia;
           this.crmOrigem = crmOrigem;
           this.rpon = rpon;
           this.docContaInicial = docContaInicial;
           this.codContaInicial = codContaInicial;
    }


    /**
     * Gets the id value for this InstanciaProduto.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this InstanciaProduto.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
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
            this.id == other.getId() &&
            ((this.tipoInstancia==null && other.getTipoInstancia()==null) || 
             (this.tipoInstancia!=null &&
              this.tipoInstancia.equals(other.getTipoInstancia()))) &&
            ((this.crmOrigem==null && other.getCrmOrigem()==null) || 
             (this.crmOrigem!=null &&
              this.crmOrigem.equals(other.getCrmOrigem()))) &&
            ((this.rpon==null && other.getRpon()==null) || 
             (this.rpon!=null &&
              this.rpon.equals(other.getRpon()))) &&
            ((this.docContaInicial==null && other.getDocContaInicial()==null) || 
             (this.docContaInicial!=null &&
              this.docContaInicial.equals(other.getDocContaInicial()))) &&
            ((this.codContaInicial==null && other.getCodContaInicial()==null) || 
             (this.codContaInicial!=null &&
              this.codContaInicial.equals(other.getCodContaInicial())));
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
        _hashCode += new Long(getId()).hashCode();
        if (getTipoInstancia() != null) {
            _hashCode += getTipoInstancia().hashCode();
        }
        if (getCrmOrigem() != null) {
            _hashCode += getCrmOrigem().hashCode();
        }
        if (getRpon() != null) {
            _hashCode += getRpon().hashCode();
        }
        if (getDocContaInicial() != null) {
            _hashCode += getDocContaInicial().hashCode();
        }
        if (getCodContaInicial() != null) {
            _hashCode += getCodContaInicial().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InstanciaProduto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServicoByResource", "InstanciaProduto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServicoByResource", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoInstancia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServicoByResource", "tipoInstancia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crmOrigem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServicoByResource", "crmOrigem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rpon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServicoByResource", "rpon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docContaInicial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServicoByResource", "docContaInicial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codContaInicial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServicoByResource", "codContaInicial"));
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
