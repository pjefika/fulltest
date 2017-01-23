/**
 * InstanciaServico.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico;

public class InstanciaServico  implements java.io.Serializable {
    private java.math.BigInteger idInstanciaServico;

    private com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.CatalogoServico catalogoServico;

    private java.lang.String idElementoCrm;

    private com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.Status status;

    private com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.Parametro[] parametros;

    private com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.Resource[] resources;

    private com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.InstanciaServico[] servicosAssociados;

    public InstanciaServico() {
    }

    public InstanciaServico(
           java.math.BigInteger idInstanciaServico,
           com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.CatalogoServico catalogoServico,
           java.lang.String idElementoCrm,
           com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.Status status,
           com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.Parametro[] parametros,
           com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.Resource[] resources,
           com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.InstanciaServico[] servicosAssociados) {
           this.idInstanciaServico = idInstanciaServico;
           this.catalogoServico = catalogoServico;
           this.idElementoCrm = idElementoCrm;
           this.status = status;
           this.parametros = parametros;
           this.resources = resources;
           this.servicosAssociados = servicosAssociados;
    }


    /**
     * Gets the idInstanciaServico value for this InstanciaServico.
     * 
     * @return idInstanciaServico
     */
    public java.math.BigInteger getIdInstanciaServico() {
        return idInstanciaServico;
    }


    /**
     * Sets the idInstanciaServico value for this InstanciaServico.
     * 
     * @param idInstanciaServico
     */
    public void setIdInstanciaServico(java.math.BigInteger idInstanciaServico) {
        this.idInstanciaServico = idInstanciaServico;
    }


    /**
     * Gets the catalogoServico value for this InstanciaServico.
     * 
     * @return catalogoServico
     */
    public com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.CatalogoServico getCatalogoServico() {
        return catalogoServico;
    }


    /**
     * Sets the catalogoServico value for this InstanciaServico.
     * 
     * @param catalogoServico
     */
    public void setCatalogoServico(com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.CatalogoServico catalogoServico) {
        this.catalogoServico = catalogoServico;
    }


    /**
     * Gets the idElementoCrm value for this InstanciaServico.
     * 
     * @return idElementoCrm
     */
    public java.lang.String getIdElementoCrm() {
        return idElementoCrm;
    }


    /**
     * Sets the idElementoCrm value for this InstanciaServico.
     * 
     * @param idElementoCrm
     */
    public void setIdElementoCrm(java.lang.String idElementoCrm) {
        this.idElementoCrm = idElementoCrm;
    }


    /**
     * Gets the status value for this InstanciaServico.
     * 
     * @return status
     */
    public com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.Status getStatus() {
        return status;
    }


    /**
     * Sets the status value for this InstanciaServico.
     * 
     * @param status
     */
    public void setStatus(com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.Status status) {
        this.status = status;
    }


    /**
     * Gets the parametros value for this InstanciaServico.
     * 
     * @return parametros
     */
    public com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.Parametro[] getParametros() {
        return parametros;
    }


    /**
     * Sets the parametros value for this InstanciaServico.
     * 
     * @param parametros
     */
    public void setParametros(com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.Parametro[] parametros) {
        this.parametros = parametros;
    }

    public com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.Parametro getParametros(int i) {
        return this.parametros[i];
    }

    public void setParametros(int i, com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.Parametro _value) {
        this.parametros[i] = _value;
    }


    /**
     * Gets the resources value for this InstanciaServico.
     * 
     * @return resources
     */
    public com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.Resource[] getResources() {
        return resources;
    }


    /**
     * Sets the resources value for this InstanciaServico.
     * 
     * @param resources
     */
    public void setResources(com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.Resource[] resources) {
        this.resources = resources;
    }

    public com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.Resource getResources(int i) {
        return this.resources[i];
    }

    public void setResources(int i, com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.Resource _value) {
        this.resources[i] = _value;
    }


    /**
     * Gets the servicosAssociados value for this InstanciaServico.
     * 
     * @return servicosAssociados
     */
    public com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.InstanciaServico[] getServicosAssociados() {
        return servicosAssociados;
    }


    /**
     * Sets the servicosAssociados value for this InstanciaServico.
     * 
     * @param servicosAssociados
     */
    public void setServicosAssociados(com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.InstanciaServico[] servicosAssociados) {
        this.servicosAssociados = servicosAssociados;
    }

    public com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.InstanciaServico getServicosAssociados(int i) {
        return this.servicosAssociados[i];
    }

    public void setServicosAssociados(int i, com.gvt.www.ws.eai.configuradoronline.ConsultaInventarioServico.InstanciaServico _value) {
        this.servicosAssociados[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InstanciaServico)) return false;
        InstanciaServico other = (InstanciaServico) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idInstanciaServico==null && other.getIdInstanciaServico()==null) || 
             (this.idInstanciaServico!=null &&
              this.idInstanciaServico.equals(other.getIdInstanciaServico()))) &&
            ((this.catalogoServico==null && other.getCatalogoServico()==null) || 
             (this.catalogoServico!=null &&
              this.catalogoServico.equals(other.getCatalogoServico()))) &&
            ((this.idElementoCrm==null && other.getIdElementoCrm()==null) || 
             (this.idElementoCrm!=null &&
              this.idElementoCrm.equals(other.getIdElementoCrm()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.parametros==null && other.getParametros()==null) || 
             (this.parametros!=null &&
              java.util.Arrays.equals(this.parametros, other.getParametros()))) &&
            ((this.resources==null && other.getResources()==null) || 
             (this.resources!=null &&
              java.util.Arrays.equals(this.resources, other.getResources()))) &&
            ((this.servicosAssociados==null && other.getServicosAssociados()==null) || 
             (this.servicosAssociados!=null &&
              java.util.Arrays.equals(this.servicosAssociados, other.getServicosAssociados())));
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
        if (getIdInstanciaServico() != null) {
            _hashCode += getIdInstanciaServico().hashCode();
        }
        if (getCatalogoServico() != null) {
            _hashCode += getCatalogoServico().hashCode();
        }
        if (getIdElementoCrm() != null) {
            _hashCode += getIdElementoCrm().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getParametros() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParametros());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParametros(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResources() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResources());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResources(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServicosAssociados() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServicosAssociados());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServicosAssociados(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InstanciaServico.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "InstanciaServico"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idInstanciaServico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "idInstanciaServico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catalogoServico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "catalogoServico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "CatalogoServico"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idElementoCrm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "idElementoCrm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "Status"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parametros");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "parametros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "Parametro"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resources");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "resources"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "Resource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicosAssociados");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "servicosAssociados"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/ConsultaInventarioServico", "InstanciaServico"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
